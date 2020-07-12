package org.ygba.youthgobudget.socialdevelopment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;

public class SocialDevelopmentActivityViewModel extends AndroidViewModel {
    private YGBARepository ygbaRepository;

    public SocialDevelopmentActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void saveSocialDevelopmentQuestion(SocialDevelopmentQuestion socialDevelopmentQuestion) {
        ygbaRepository.saveSocialDevelopmentQuestion(socialDevelopmentQuestion);
    }
}
