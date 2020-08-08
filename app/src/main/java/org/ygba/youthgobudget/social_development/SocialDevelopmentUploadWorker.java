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

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }
        return null;
    }
}
