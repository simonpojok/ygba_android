package org.ygba.youthgobudget.data.budget_information;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = BudgetInformationFormConstants.TABLE_NAME)
public class BudgetInformationForm {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BudgetInformationFormConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = BudgetInformationFormConstants.ADMINISTRATION_APPROVED_BUDGET)
    private int adminApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.ADMINISTRATION_PERCENTAGE)
    private int adminPercentage;
}
