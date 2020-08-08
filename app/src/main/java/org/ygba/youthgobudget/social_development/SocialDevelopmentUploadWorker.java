package org.ygba.youthgobudget.social_development;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;

import java.util.List;

public class SocialDevelopmentUploadWorker extends Worker {
    public SocialDevelopmentUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        List<SocialDevelopmentQuestion> questionList = null;
        if (questionList != null) {
            for (SocialDevelopmentQuestion question: questionList) {
                try {
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("record_id", question.getFinancialYear());
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

                    jsonObject.put("are_there_women_empowerment_program", question.getQ3WomenEmpowermentObjective());
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

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }
        return null;
    }
}
