package org.ygba.youthgobudget.social_development;

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
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentDao;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION_URL;
import static org.ygba.youthgobudget.utils.Constants.SOCIAL_DEVELOPMENT_COLLECTION_URL;

public class SocialDevelopmentUploadWorker extends Worker {
    private SocialDevelopmentDao socialDevelopmentDao;
    private Context context;
    public SocialDevelopmentUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        socialDevelopmentDao = YGBDatabase.getInstance(context.getApplicationContext()).socialDevelopmentDao();
        this.context = context;
    }

    @NonNull
    @Override
    public Result doWork() {
        List<SocialDevelopmentQuestion> questionList = getList();
        if (questionList != null) {
            for (SocialDevelopmentQuestion question: questionList) {
                try {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("record_id", question.getPrimaryKey());
                    jsonObject.put("financial_year", question.getFinancialYear());
                    jsonObject.put("quarter", "IV");
                    jsonObject.put("date", question.getDate());
                    jsonObject.put("district", question.getDistrict());
                    jsonObject.put("village", question.getVillage());
                    jsonObject.put("parish", question.getParish());
                    jsonObject.put("sub_county", question.getDivision());
                    jsonObject.put("staff_name", question.getYgbaAgentFullName());
                    jsonObject.put("staff_tel_number", question.getYgbaTel());

                    JSONArray budgetReceiptArray =  new JSONArray();
                    JSONObject row1 = new JSONObject();
                    row1.put("community_mobilization_expected_or_approved", question.getQ2CommunityExpected());
                    row1.put("community_mobilization_amount_received", question.getQ2CommunityAmountReceived());
                    row1.put("community_mobilization_date_received", question.getQ2CommunityDateReceived());
                    row1.put("community_mobilization_date_withdrawn", question.getQ2CommunityDateWithdrawn());
                    JSONObject row2 = new JSONObject();
                    row2.put("other_expected_or_approved", question.getQ2OtherExpectedAmount());
                    row2.put("other_amount_received", question.getQ2OtherAmountedReceived());
                    row2.put("other_date_received", question.getQ2OthersDateReceived());
                    row2.put("other_date_withdrawn", question.getQ2OthersDateWithdrawn());
                    budgetReceiptArray.put(row1);
                    budgetReceiptArray.put(row2);
                    jsonObject.put("budget_receipt_date", budgetReceiptArray);

                    jsonObject.put("are_there_women_empowerment_program", question.isQ3WomenEmpowermentObjective());
                    jsonObject.put("if_yes_women_empower_how_many_women_supported", question.getQ3WomenEmpowermentObjectiveReason());


                    JSONArray question3Array = new JSONArray();
                    JSONObject tr1 = new JSONObject();
                    tr1.put("name_of_women_group", question.getQ3WomanGroup1Name());
                    tr1.put("village_or_sub_county", question.getQ3WomenGroup1Village());
                    tr1.put("number_of_male_members", question.getQ3WomenGroup1MaleNumber());
                    tr1.put("number_of_female_members", question.getQ3WomenGroup1FemaleNumber());
                    tr1.put("amount_received", question.getQ3WomenGroup1AmountReceived());
                    question3Array.put(tr1);

                    JSONObject tr2 = new JSONObject();
                    tr2.put("name_of_women_group", question.getQ3WomanGroup2Name());
                    tr2.put("village_or_sub_county", question.getQ3WomenGroup2Village());
                    tr2.put("number_of_male_members", question.getQ3WomenGroup2MaleNumber());
                    tr2.put("number_of_female_members", question.getQ3WomenGroup2FemaleNumber());
                    tr2.put("amount_received", question.getQ3WomenGroup2AmountReceived());
                    question3Array.put(tr2);

                    JSONObject tr3 = new JSONObject();
                    tr3.put("name_of_women_group", question.getQ3WomanGroup3Name());
                    tr3.put("village_or_sub_county", question.getQ3WomenGroup3Village());
                    tr3.put("number_of_male_members", question.getQ3WomenGroup3MaleNumber());
                    tr3.put("number_of_female_members", question.getQ3WomenGroup3FemaleNumber());
                    tr3.put("amount_received", question.getQ3WomenGroup3AmountReceived());
                    question3Array.put(tr3);

                    JSONObject tr4 = new JSONObject();
                    tr4.put("name_of_women_group", question.getQ3WomanGroup4Name());
                    tr4.put("village_or_sub_county", question.getQ3WomenGroup4Village());
                    tr4.put("number_of_male_members", question.getQ3WomenGroup4MaleNumber());
                    tr4.put("number_of_female_members", question.getQ3WomenGroup4FemaleNumber());
                    tr4.put("amount_received", question.getQ3WomenGroup4AmountReceived());
                    question3Array.put(tr4);

                    JSONObject tr6 = new JSONObject();
                    tr6.put("name_of_women_group", question.getQ3WomanGroup6Name());
                    tr6.put("village_or_sub_county", question.getQ3WomenGroup6Village());
                    tr6.put("number_of_male_members", question.getQ3WomenGroup6MaleNumber());
                    tr6.put("number_of_female_members", question.getQ3WomenGroup6FemaleNumber());
                    tr6.put("amount_received", question.getQ3WomenGroup6AmountReceived());
                    question3Array.put(tr6);

                    JSONObject tr7 = new JSONObject();
                    tr7.put("name_of_women_group", question.getQ3WomanGroup7Name());
                    tr7.put("village_or_sub_county", question.getQ3WomenGroup7Village());
                    tr7.put("number_of_male_members", question.getQ3WomenGroup7MaleNumber());
                    tr7.put("number_of_female_members", question.getQ3WomenGroup7FemaleNumber());
                    tr7.put("amount_received", question.getQ3WomenGroup7AmountReceived());
                    question3Array.put(tr7);

                    jsonObject.put("women_group", question3Array);
                    jsonObject.put("youth_livelihood_program_running", question.isQ4LivelihoodObjective());
                    jsonObject.put("if_yes_how_many_youths_have_been_supported", question.getQ4LivelihoodObjectiveReason());

                    JSONArray question4Array = new JSONArray();

                    JSONObject object1 = new JSONObject();
                    object1.put("youth_group_name", question.getQ4YouthGroup1Name());
                    object1.put("village_or_sub_county", question.getQ4YouthGroup1Village());
                    object1.put("number_of_group_members_males", question.getQ4YouthGroup1MaleNumber());
                    object1.put("number_of_group_members_females", question.getQ4YouthGroup1FemaleNumber());
                    object1.put("amount_received", question.getQ4YouthGroup1AmountReceived());
                    question4Array.put(object1);

                    JSONObject object2 = new JSONObject();
                    object2.put("youth_group_name", question.getQ4YouthGroup2Name());
                    object2.put("village_or_sub_county", question.getQ4YouthGroup2Village());
                    object2.put("number_of_group_members_males", question.getQ4YouthGroup2MaleNumber());
                    object2.put("number_of_group_members_females", question.getQ4YouthGroup2FemaleNumber());
                    object2.put("amount_received", question.getQ4YouthGroup2AmountReceived());
                    question4Array.put(object2);

                    JSONObject object3 = new JSONObject();
                    object3.put("youth_group_name", question.getQ4YouthGroup3Name());
                    object3.put("village_or_sub_county", question.getQ4YouthGroup3Village());
                    object3.put("number_of_group_members_males", question.getQ4YouthGroup3MaleNumber());
                    object3.put("number_of_group_members_females", question.getQ4YouthGroup3FemaleNumber());
                    object3.put("amount_received", question.getQ4YouthGroup3AmountReceived());
                    question4Array.put(object3);

                    JSONObject object4 = new JSONObject();
                    object4.put("youth_group_name", question.getQ4YouthGroup4Name());
                    object4.put("village_or_sub_county", question.getQ4YouthGroup4Village());
                    object4.put("number_of_group_members_males", question.getQ4YouthGroup4MaleNumber());
                    object4.put("number_of_group_members_females", question.getQ4YouthGroup4FemaleNumber());
                    object4.put("amount_received", question.getQ4YouthGroup4AmountReceived());
                    question4Array.put(object4);

                    JSONObject object5 = new JSONObject();
                    object5.put("youth_group_name", question.getQ4YouthGroup5Name());
                    object5.put("village_or_sub_county", question.getQ4YouthGroup5Village());
                    object5.put("number_of_group_members_males", question.getQ4YouthGroup5MaleNumber());
                    object5.put("number_of_group_members_females", question.getQ4YouthGroup5FemaleNumber());
                    object5.put("amount_received", question.getQ4YouthGroup5AmountReceived());
                    question4Array.put(object5);

                    JSONObject object6 = new JSONObject();
                    object6.put("youth_group_name", question.getQ4YouthGroup6Name());
                    object6.put("village_or_sub_county", question.getQ4YouthGroup6Village());
                    object6.put("number_of_group_members_males", question.getQ4YouthGroup6MaleNumber());
                    object6.put("number_of_group_members_females", question.getQ4YouthGroup6FemaleNumber());
                    object6.put("amount_received", question.getQ4YouthGroup6AmountReceived());
                    question4Array.put(object6);

                    JSONObject object7 = new JSONObject();
                    object7.put("youth_group_name", question.getQ4YouthGroup7Name());
                    object7.put("village_or_sub_county", question.getQ4YouthGroup7Village());
                    object7.put("number_of_group_members_males", question.getQ4YouthGroup7MaleNumber());
                    object7.put("number_of_group_members_females", question.getQ4YouthGroup7FemaleNumber());
                    object7.put("amount_received", question.getQ4YouthGroup7AmountReceived());
                    question4Array.put(object7);

                    jsonObject.put("youth_group", question4Array);

                    jsonObject.put("adult_literacy_number_of_male_trained",question.getQ5NumberMaleTrained());
                    jsonObject.put("adult_literacy_number_of_female_trained", question.getQ5NumberFemaleTrained());
                    jsonObject.put("are_there_any_community_groups", question.getQ6CommunityGroupFormed());
                    jsonObject.put("any_other_challenges_or_observations", question.getQ7OtherChallengesObservations());

                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                            Request.Method.POST,
                            SOCIAL_DEVELOPMENT_COLLECTION_URL,
                            jsonObject,
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {
//                                    try {
//                                        deleteAgricultureQuestion(response.getInt("record_id"));
//                                    } catch (JSONException e) {
//                                        e.printStackTrace();
//                                    }
                                    Log.d("Result Soc", response.toString());
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
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }
        return Result.retry();
    }

    private List<SocialDevelopmentQuestion> getList(){
        try {
            return handleThreading();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<SocialDevelopmentQuestion> handleThreading() throws ExecutionException, InterruptedException {
        Callable<List<SocialDevelopmentQuestion>> listCallable = new Callable<List<SocialDevelopmentQuestion>>() {

            @Override
            public List<SocialDevelopmentQuestion> call() throws Exception {
                return socialDevelopmentDao.getSocialDevelopmentQuestionsForBackUp();
            }
        };

        return YGBDatabase.db_executor.submit(listCallable).get();

    }
}
