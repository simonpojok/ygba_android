package org.ygba.youthgobudget.water_and_environment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class WaterEnvironmentViewModel extends AndroidViewModel {
    private YGBARepository ygbaRepository;

    public WaterEnvironmentViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void saveWaterEnvironmentQuestion(WaterEnvironmentQuestion question) {
        ygbaRepository.saveWaterEnvironmentQuestion(question);
    }

    public LiveData<List<WaterEnvironmentQuestion>> getAllWaterEnvironmentQuestions() {
        try {
            return ygbaRepository.getAllWaterEnvironmentQuestions();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
