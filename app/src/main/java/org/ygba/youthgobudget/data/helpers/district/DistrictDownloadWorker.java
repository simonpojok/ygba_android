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
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCountyDownloadWorker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION_URL;
import static org.ygba.youthgobudget.utils.Constants.DISTRICT_COLLECTION_URL;
import static org.ygba.youthgobudget.utils.Constants.SUB_COUNTY_COLLECTION_URL;

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
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://ygba.org/api/areas/districts").openConnection();

            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                DistrictList districtList = new Gson().fromJson(reader, DistrictList.class);
                reader.close();

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
                return Result.success();

            } catch (IOException e) {
                Log.e("Error", "There was errors");
            } finally {
                httpURLConnection.disconnect();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.retry();
    }

    private static class DistrictList {
        List<District> data;
    }
}
