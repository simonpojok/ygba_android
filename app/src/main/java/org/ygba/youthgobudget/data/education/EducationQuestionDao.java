package org.ygba.youthgobudget.data.education;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface EducationQuestionDao {
    @Insert
    void saveEducationQuestion(EducationQuestion educationQuestion);

    @Query("SELECT * FROM " + EducationQuestionConstants.TABLE_NAME)
    LiveData<List<EducationQuestion>> getAllEducationQuestions();
}
