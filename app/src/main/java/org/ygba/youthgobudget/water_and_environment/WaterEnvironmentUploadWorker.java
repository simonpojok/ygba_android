package org.ygba.youthgobudget.water_and_environment;

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
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;

import java.io.LineNumberInputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION_URL;
import static org.ygba.youthgobudget.utils.Constants.WATER_COLLECTION_URL;

public class WaterEnvironmentUploadWorker extends Worker {
    Context context;
    YGBARepository ygbaRepository;
    public WaterEnvironmentUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        this.context = context;
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(context.getApplicationContext()));
    }

    @NonNull
    @Override
    public Result doWork() {
        List<WaterEnvironmentQuestion> waterEnvironmentQuestions = getList();

        if (waterEnvironmentQuestions != null ) {
            try {
                for (WaterEnvironmentQuestion waterEnvironmentQuestion: waterEnvironmentQuestions) {
                    JSONObject body = new JSONObject();
                    body.put("record_id", waterEnvironmentQuestion.getPrimaryKey());
                    body.put("financial_year", waterEnvironmentQuestion.getFinancialYear());
                    body.put("Quarter", "missing value");
                    body.put("Date", waterEnvironmentQuestion.getDate());
                    body.put("District", waterEnvironmentQuestion.getDistrict());
                    body.put("subcounty", waterEnvironmentQuestion.getSub_county());
                    body.put("Parish", waterEnvironmentQuestion.getParish());
                    body.put("Village", waterEnvironmentQuestion.getVillage());
                    body.put("Name_of_Monitor_YGB", waterEnvironmentQuestion.getAgentName());
                    body.put("phone_number", waterEnvironmentQuestion.getAgentTel());
                    body.put("is_there_water_at_office", waterEnvironmentQuestion.isQuestion1Objective());
                    body.put("If_no_water_why", waterEnvironmentQuestion.getQuestion1ObjectiveReason());
                    body.put("what_are_the_water_protection_activities_taking", waterEnvironmentQuestion.getQuestion2Water());
                    body.put("Are_there_rural_safe_low_Wells_boreholes", waterEnvironmentQuestion.getQuestion3Objective());
                    body.put("clean_water_accessibility", waterEnvironmentQuestion.getQuestion4Answer());
                    // some table here
                    //TODO: we are to add some tables here
                    body.put("do_the_rural_water_point_sources_have_committees", waterEnvironmentQuestion.getQuestion5Text());
                    body.put("if_they_dont_have_why", waterEnvironmentQuestion.getQuestion5ObjectiveReason());
                    body.put("Are_there_any_wetlands_demarcated_or_protected", waterEnvironmentQuestion.getQuestion6WetLandDemarcated());
                    body.put("'What_are_the_tree_pl_ms_known_in_the_area", waterEnvironmentQuestion.getQuestion62TreePlanting());


                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                            Request.Method.POST,
                            WATER_COLLECTION_URL,
                            body,
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {
                                    Log.d("WaterEnvironmentWorker", response.toString());
                                    try {
                                        deleteWaterAndEnvironmentQuestion(response.getInt("record_id"));
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            },
                            new Response.ErrorListener() {// 
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    Log.d("Error", error.toString());
                                }
                            }
                    );

                    RequestQueue requestQueue = Volley.newRequestQueue(context);
                    requestQueue.add(jsonObjectRequest);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return Result.retry();
    }

    private void deleteWaterAndEnvironmentQuestion(int record_id) {
        ygbaRepository.getWaterAndEnvironmentQuestionAndDelete(record_id);
    }

    private List<WaterEnvironmentQuestion> getList() {
        try {
            return ygbaRepository.getWaterEnvironmentForBackUp();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
