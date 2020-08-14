package org.ygba.youthgobudget.data.education;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EducationQuestionDao {
    @Insert
    void saveEducationQuestion(EducationQuestion educationQuestion);

    @Query("SELECT * FROM " + EducationQuestionConstants.TABLE_NAME)
    LiveData<List<EducationQuestion>> getAllEducationQuestions();
    @Query(
            "SELECT * FROM " + EducationQuestionConstants.TABLE_NAME
            + " WHERE " + EducationQuestionConstants.QUESTION_8_IS_STORED_LOCALLY
            + " =:isStoredLocally"
    )
    List<EducationQuestion> getEducationQuestionForBackUp(boolean isStoredLocally);

    @Query(
            "SELECT * FROM " + EducationQuestionConstants.TABLE_NAME + " WHERE " + EducationQuestionConstants.PRIMARY_KEY + " =:record_id"
    )
    EducationQuestion getEducationQuestionByID(int record_id);

    @Delete
    void deleteEducationQuestion(EducationQuestion educationQuestion);
}
