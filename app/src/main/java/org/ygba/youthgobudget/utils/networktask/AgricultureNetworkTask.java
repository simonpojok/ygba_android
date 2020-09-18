package org.ygba.youthgobudget.utils.networktask;

import android.content.Context;
import android.util.Log;

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
import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION_URL;

public class AgricultureNetworkTask {
    private Context context;
    private AgricultureDao agricultureDao;
    private YGBARepository ygbaRepository;

    public AgricultureNetworkTask(Context context, AgricultureDao agricultureDao, YGBARepository ygbaRepository) {
        this.context = context;
        this.agricultureDao = agricultureDao;
        this.ygbaRepository = ygbaRepository;
    }

    public void doAgricultureNetworkTask() {
        try {
            List<AgricultureQuestion> agricultureQuestions = getAgricultureQuestion();

            for (AgricultureQuestion agricultureQuestion: agricultureQuestions) {

                JSONObject body = new JSONObject();
                body.put("record_id", agricultureQuestion.getId());
                body.put("financial_year", agricultureQuestion.getFinancialYear());
                body.put("date_recorded", agricultureQuestion.getDate());
                body.put("village", agricultureQuestion.getVillage());
                body.put("parish", agricultureQuestion.getParish());
                body.put("subcounty", agricultureQuestion.getSubCounty());
                body.put("staff_name", agricultureQuestion.getAgentName());
                body.put("phone_id", agricultureQuestion.getAgentNumber());
                body.put("staff_number", agricultureQuestion.getAgentNumber());
                body.put("quarter", agricultureQuestion.getQuarter());
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
//https://ygba.org/api/collect/agric

                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                        Request.Method.POST,
                        AGRICULTURE_COLLECTION_URL,
                        body,
                        new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("Agr", response.toString());
                                try {
                                    int recordId = response.getInt("record_id");
                                    deleteAgricultureQuestion(recordId);
                                } catch (JSONException e) {
                                    e.printStackTrace();
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
            }


        } catch (JSONException | ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void deleteAgricultureQuestion(int record_id) {
        ygbaRepository.getAgricultureQuestionByIdAndDelete(record_id);
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