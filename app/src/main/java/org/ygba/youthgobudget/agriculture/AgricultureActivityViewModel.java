package org.ygba.youthgobudget.agriculture;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

public class AgricultureActivityViewModel extends AndroidViewModel {
    YGBARepository ygbaRepository;

    public AgricultureActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void saveAgricultureQuestion(AgricultureQuestion agricultureQuestion) {
        ygbaRepository.saveAgricultureQuestion(agricultureQuestion);
    }
}
