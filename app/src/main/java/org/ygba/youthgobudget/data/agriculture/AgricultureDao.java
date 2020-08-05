package org.ygba.youthgobudget.data.agriculture;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AgricultureDao {
    @Insert
    void saveAgricultureQuestion(AgricultureQuestion agricultureQuestion);

    @Query(
            "SELECT * FROM " + AgricultureConstants.TABLE_NAME
    )
    LiveData<List<AgricultureQuestion>> getAllAgricultureAnswers();

    @Query(
            "SELECT * FROM " + AgricultureConstants.TABLE_NAME
            + " WHERE " + AgricultureConstants.IS_STORED_LOCALLY + " =:isStoredLocally"
    )
    List<AgricultureQuestion> getAgricultureQuestionForUpload(boolean isStoredLocally);

    @Query("SELECT * FROM " + AgricultureConstants.TABLE_NAME + " WHERE " + AgricultureConstants.PRIMARY_KEY + " =:primaryKey")
    AgricultureQuestion getAgricultureQuestionById(int primaryKey);

    @Delete
    void deleteAgricultureQuestion(AgricultureQuestion agricultureQuestion);
}
