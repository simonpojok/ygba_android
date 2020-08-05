package org.ygba.youthgobudget.data.health;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface HealthQuestionDao {
    @Insert
    void insertHealthQuestion(HealthQuestion healthQuestion);

    @Query(
            "SELECT * FROM "
            + HealthQuestionConstants.TABLE_NAME
            + " WHERE " + HealthQuestionConstants.IS_LOCALLY_STORED
            + " =:is_stored_locally"
    )
    List<HealthQuestion> getHealthQuestion(boolean is_stored_locally);
}
