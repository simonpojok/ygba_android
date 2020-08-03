package org.ygba.youthgobudget.education;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.education.EducationQuestion;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class EducationUploadWorker extends Worker {
    YGBARepository ygbaRepository;
    public EducationUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(context.getApplicationContext()));
    }

    @NonNull
    @Override
    public Result doWork() {
        // some work
        List<EducationQuestion> educationQuestions = getList();
        if (educationQuestions != null ) {
            for (EducationQuestion educationQuestion: educationQuestions) {
                // json
            }
        } else {
            return Result.success();
        }
        return Result.success();
    }

    private List<EducationQuestion> getList() {
        try {
            return ygbaRepository.getEducationQuestion4BackUp();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
