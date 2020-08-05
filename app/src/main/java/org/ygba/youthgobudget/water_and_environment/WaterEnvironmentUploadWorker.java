package org.ygba.youthgobudget.water_and_environment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;

import java.io.LineNumberInputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

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
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return Result.success();
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

        $table->string('financial_year')->nullable();
        $table->string('Quarter')->nullable();
        $table->date('Date')->nullable();
        $table->string('District')->nullable();
        $table->string('subcounty')->nullable();
        $table->string('Parish')->nullable();
        $table->string('Village')->nullable();
        $table->string('Name_of_Monitor_YGB')->nullable();
        $table->string('phone_number')->nullable();
        $table->string('is_there_water_at_office')->nullable();
        $table->text('If_no_water_why')->nullable();
        $table->text('what_are_the_water_protection_activities_taking')->nullable();
        $table->string('Are_there_rural_safe_low_Wells_boreholes')->nullable();
        $table->text('clean_water_accessibility')->nullable();
        $table->string('do_the_rural_water_point_sources_have_committees')->nullable();
        $table->text('if_they_dont_have_why')->nullable();
        $table->text('Are_there_any_wetlands_demarcated_or_protected')->nullable();
        $table->text('areas_with_wetland_degradation')->nullable();
        $table->text('What_are_the_tree_pl_ms_known_in_the_area')->nullable();
        $table->timestamps();
        $table->softDeletes();
