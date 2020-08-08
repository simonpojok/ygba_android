package org.ygba.youthgobudget.data.helpers.sub_county;

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
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.data.YGBDatabase;

import java.util.List;

import static org.ygba.youthgobudget.utils.Constants.DISTRICT_COLLECTION_URL;
import static org.ygba.youthgobudget.utils.Constants.SUB_COUNTY_COLLECTION_URL;

public class SubCountyDownloadWorker extends Worker {
    private SubCountyDao subCountyDao;
    private Context context;
    public SubCountyDownloadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        this.context = context;
        subCountyDao = YGBDatabase.getInstance(context.getApplicationContext()).subCountyDao();
    }

    @NonNull
    @Override
    public Result doWork() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.POST,
                SUB_COUNTY_COLLECTION_URL,
                new JSONObject(),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        SubCountyList countyList = new Gson().fromJson(String.valueOf(response), SubCountyList.class);
                        for(final SubCounty subCounty : countyList.data) {
                            YGBDatabase.db_executor.execute(new Runnable() {
                                @Override
                                public void run() {
                                    SubCounty subCounty1 = subCountyDao.getSubCountyById(subCounty.getId());
                                    if (subCounty1 == null) {
                                        subCountyDao.saveSubCounty(subCounty);
                                    }
                                }
                            });
                        }
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

    private static class SubCountyList {
        List<SubCounty> data;
    }
}
