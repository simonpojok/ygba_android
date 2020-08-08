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
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;

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
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.POST,
                DISTRICT_COLLECTION_URL,
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        serializeAndSave(response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("Error", error.toString());
                    }
                }
        );

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        requestQueue.add(jsonObjectRequest);
        return Result.retry();
    }

    private void serializeAndSave(JSONObject response) {
        try {
            final District district = new District(
                    response.getString("name"),
                    response.getString("region"),
                    response.getInt("region_id"),
                    response.getInt("id")
            );
            YGBDatabase.db_executor.execute(new Runnable() {
                @Override
                public void run() {
                    District district1 = districtDao.getDistrictByID(district.getId());
                    if ( district1 == null ) {
                        districtDao.saveDistrict(district);
                    }
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static class DistrictList {

    }
}
