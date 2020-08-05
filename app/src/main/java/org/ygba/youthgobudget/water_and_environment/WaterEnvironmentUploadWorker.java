package org.ygba.youthgobudget.water_and_environment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

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
        for (WaterEnvironmentQuestion waterEnvironmentQuestion: waterEnvironmentQuestions) {

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
