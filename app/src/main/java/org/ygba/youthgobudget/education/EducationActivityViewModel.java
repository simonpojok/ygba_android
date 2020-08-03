package org.ygba.youthgobudget.education;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.education.EducationQuestion;

public class EducationActivityViewModel extends AndroidViewModel {
    YGBARepository ygbaRepository;
    public EducationActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    void saveEducationQuestion(EducationQuestion educationQuestion) {
        ygbaRepository.saveEducationQuestion(educationQuestion);
    }
}
