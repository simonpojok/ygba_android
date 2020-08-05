package org.ygba.youthgobudget.agriculture;

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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION;


/*
Schema::create('agriculture', function (Blueprint $table) {
            $table->id();
            $table->text('record_id')->nullable();
            $table->text('region')->nullable();
            $table->text('district')->nullable();
            $table->text('subcounty')->nullable();
            $table->text('parish')->nullable();
            $table->text('village')->nullable();
            $table->text('phone_id')->nullable();
            $table->text('staffName')->nullable();
            $table->text('date_recorded')->nullable();
            $table->text('ageCategory')->nullable();
            $table->string('gender')->nullable();
            $table->text('financial_year')->nullable();
            $table->text('quarter')->nullable();
            $table->text('phone_number')->nullable();
            $table->text('is_there_substantive_agricultural_extension_worker')->nullable();
            $table->text('if_no_why')->nullable();
            $table->text('extension_services_expected_or_approved')->nullable();
            $table->text('extension_services_amount_received')->nullable();
            $table->text('extension_services_date_received')->nullable();
            $table->text('extension_services_date_withdrawn')->nullable();
            $table->text('development_expected_or_approved')->nullable();
            $table->text('development_amount_received')->nullable();
            $table->text('development_date_received')->nullable();
            $table->text('development_date_withdrawn')->nullable();
            $table->text('number_of_field_visits_for_farmer_support')->nullable();
            $table->text('advisory_demonstration_community')->nullable();
            $table->text('if_yes_how_many_during_the_quarter')->nullable();
            $table->text('areas_where_the_meetings_or_workshops_were_held')->nullable();
            $table->text('reasons_for_not_conducting_the_community_meeting')->nullable();
            $table->text('are_there_any_advisory_services')->nullable();
            $table->text('if_yes_how_many_were_done_during_the_quarter')->nullable();
            $table->text('mention_the_areas_where_the_visits_were_made')->nullable();
            $table->text('male_number_of_farmers_visited_for_advisory_services')->nullable();
            $table->text('female_number_of_farmers_visited_for_advisory_services')->nullable();
            $table->text('reasons_for_not_conducting_the_farmer_advisory_services_visits')->nullable();
            $table->text('any_owc_inputs')->nullable();
            $table->text('owc_inputs')->nullable();
            $table->text('reasons_for_no_agriculture_inputs_and_livestock')->nullable();
            $table->timestamps();
            $table->softDeletes();
 */


public class AgricultureUploadWorker extends Worker {
    private AgricultureDao agricultureDao;
    private Context context;
    public AgricultureUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        agricultureDao = YGBDatabase.getInstance(context.getApplicationContext()).agricultureDao();
        this.context = context;
    }

    @NonNull
    @Override
    public Result doWork() {

        try {
            List<AgricultureQuestion> agricultureQuestions = getAgricultureQuestion();

            for (AgricultureQuestion agricultureQuestion: agricultureQuestions) {

                JSONObject body = new JSONObject();
                body.put("financial_year", agricultureQuestion.getFinancialYear());
                body.put("date_recorded", agricultureQuestion.getDate());
                body.put("village", agricultureQuestion.getVillage());
                body.put("parish", agricultureQuestion.getParish());
                body.put("subcounty", agricultureQuestion.getSubCounty());
                body.put("staff_name", agricultureQuestion.getAgentName());
                body.put("phone_id", agricultureQuestion.getAgentNumber());
                body.put("staff_number", agricultureQuestion.getAgentNumber());
                body.put("quarter", "No recorded Yet");
                body.put("gender", "gender");
                body.put("is_there_substantive_agricultural_extension_worker", agricultureQuestion.getQuestion1Objective());
                body.put("if_no_why", agricultureQuestion.getQuestion1Reason());
                body.put("extension_services_expected_or_approved", agricultureQuestion.getQuestion2ExtensionExpectedAmount());
                body.put("extension_services_amount_received", agricultureQuestion.getQuestion2ExtensionAmountReceived());
                body.put("extension_services_date_received", agricultureQuestion.getQuestion2ExtensionDateReceived());
                body.put("extension_services_date_withdrawn", agricultureQuestion.getQuestion2ExtensionDateWithdram());
                body.put("development_expected_or_approved", agricultureQuestion.getQuestion2DevelopmentAmountExpected());
                body.put("development_amount_received", agricultureQuestion.getQuestion2DevelopmentAmountReceived());
                body.put("development_date_received", agricultureQuestion.getQuestion2DevelopmentDateReceived());
                body.put("development_date_withdrawn", agricultureQuestion.getQuestion2DevelopmentDateWithdrawn());
                body.put("number_of_field_visits_for_farmer_support", agricultureQuestion.getAnswerQuestion2_1());
                body.put("advisory_demonstration_community", agricultureQuestion.getAnswerQuestion2_2());
                body.put("if_yes_how_many_during_the_quarter", agricultureQuestion.getAnswerQuestion2_3());
                body.put("areas_where_the_meetings_or_workshops_were_held", agricultureQuestion.getAnswerQuestion2_4());
                body.put("reasons_for_not_conducting_the_community_meeting", agricultureQuestion.getAnswerQuestion2_5());
                body.put("are_there_any_advisory_services", agricultureQuestion.getAnswerQuestion3_1());
                body.put("if_yes_how_many_were_done_during_the_quarter", agricultureQuestion.getAnswerQuestion3_2());
                body.put("mention_the_areas_where_the_visits_were_made", agricultureQuestion.getAnswerQuestion3_3());
                body.put("female_number_of_farmers_visited_for_advisory_services", agricultureQuestion.getAnswerQuestion3_4_Female());
                body.put("male_number_of_farmers_visited_for_advisory_services", agricultureQuestion.getAnswerQuestion3_4_Male());
                body.put("reasons_for_not_conducting_the_farmer_advisory_services_visits", agricultureQuestion.getAnswerQuestion3_5());
                body.put("reasons_for_no_agriculture_inputs_and_livestock", agricultureQuestion.getAnswerQuestion4_3_reason());
                body.put("any_other_observations_or_challenges", agricultureQuestion.getAnswerQuestion4_3_otherReason());

                JSONObject jsonObject = new JSONObject();
                JSONArray jsonArray = new JSONArray();
                jsonArray.put(body);
                jsonObject.put("DATA", jsonArray);


                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                        Request.Method.POST,
                        AGRICULTURE_COLLECTION,
                        jsonObject,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("Response", response.toString());
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
            }


        } catch (JSONException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
            return Result.failure();
        }
        return Result.retry();
    }

    private List<AgricultureQuestion> getAgricultureQuestion() throws ExecutionException, InterruptedException {
        Callable<List<AgricultureQuestion>> listCallable = new Callable<List<AgricultureQuestion>>() {

            @Override
            public List<AgricultureQuestion> call() throws Exception {
                return agricultureDao.getAgricultureQuestionForUpload(true);
            }
        };
        return YGBDatabase.db_executor.submit(listCallable).get();
    }
}
