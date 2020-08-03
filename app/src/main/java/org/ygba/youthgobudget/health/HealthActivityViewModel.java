package org.ygba.youthgobudget.health;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.health.HealthQuestion;

public class HealthActivityViewModel extends AndroidViewModel {
    private YGBARepository ygbaRepository;
    public HealthActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void insertHealthQuestion(HealthQuestion healthQuestion) {
        ygbaRepository.insertHealthQuestion(healthQuestion);
    }
}
