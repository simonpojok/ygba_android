package org.ygba.youthgobudget.data.helpers.district;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;

import java.util.List;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION_URL;
import static org.ygba.youthgobudget.utils.Constants.DISTRICT_COLLECTION_URL;

public class DistrictDownloadWorker extends Worker {
    private DistrictDao districtDao;
    private Context context;
    public DistrictDownloadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        districtDao = YGBDatabase.getInstance(context.getApplicationContext()).districtDao();
        this.context = context;
    }

    @NonNull
    @Override
    public Result doWork() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, DISTRICT_COLLECTION_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        DistrictList districtList = new Gson().fromJson(response, DistrictList.class);
                        for(final District district: districtList.data) {
                            YGBDatabase.db_executor.execute(new Runnable() {
                                @Override
                                public void run() {
                                    District district1 = districtDao.getDistrictByID(district.getId());
                                    if ( district1 == null ) {
                                        districtDao.saveDistrict(district);
                                    }
                                }
                            });
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Error", error.toString());
            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(stringRequest);
        return Result.retry();
    }

    private static class DistrictList {
        List<District> data;
    }
}
