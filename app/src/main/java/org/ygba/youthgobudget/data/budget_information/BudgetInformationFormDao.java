package org.ygba.youthgobudget.data.budget_information;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BudgetInformationFormDao {
    @Insert
    void saveBudgetInformationForm(BudgetInformationForm informationForm);

    @Query("SELECT * FROM " + BudgetInformationFormConstants.TABLE_NAME)
    LiveData<List<BudgetInformationForm>> getAllBudgetInformation();
}
