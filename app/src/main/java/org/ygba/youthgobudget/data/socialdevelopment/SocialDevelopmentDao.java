package org.ygba.youthgobudget.data.socialdevelopment;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SocialDevelopmentDao {
    @Insert
    void saveSocialDevelopmentQuestion(SocialDevelopmentQuestion socialDevelopmentQuestion);

    @Query("SELECT * FROM " + SocialDevelopmentConstants.TABLE_NAME)
    LiveData<List<SocialDevelopmentQuestion>> getAllSocialDevelopmentQuestions();

    @Query("SELECT * FROM " + SocialDevelopmentConstants.TABLE_NAME)
    List<SocialDevelopmentQuestion> getSocialDevelopmentQuestionsForBackUp();

    @Query("SELECT * FROM " + SocialDevelopmentConstants.TABLE_NAME + " WHERE " + SocialDevelopmentConstants.PRIMARY_KEY + " =:id")
    SocialDevelopmentQuestion getSocialDevelopmentQuestionById(int id);
}
