package org.ygba.youthgobudget.social_development;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class SocialDevelopmentActivityViewModel extends AndroidViewModel {
    private YGBARepository ygbaRepository;

    public SocialDevelopmentActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void saveSocialDevelopmentQuestion(SocialDevelopmentQuestion socialDevelopmentQuestion) {
        ygbaRepository.saveSocialDevelopmentQuestion(socialDevelopmentQuestion);
    }

    public LiveData<List<SocialDevelopmentQuestion>> getAllSocialDevelopmentQuestions() {
        try {
            return ygbaRepository.getAllSocialDevelopmentQuestions();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
