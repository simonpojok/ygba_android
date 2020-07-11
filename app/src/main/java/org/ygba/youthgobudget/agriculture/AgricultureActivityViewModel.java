package org.ygba.youthgobudget.agriculture;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class AgricultureActivityViewModel extends AndroidViewModel {
    YGBARepository ygbaRepository;

    public AgricultureActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void saveAgricultureQuestion(AgricultureQuestion agricultureQuestion) {
        ygbaRepository.saveAgricultureQuestion(agricultureQuestion);
    }

    public LiveData<List<AgricultureQuestion>> getAllAgricultureQuestions() {
        try {
            return ygbaRepository.getAllAgricultureQuestions();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
