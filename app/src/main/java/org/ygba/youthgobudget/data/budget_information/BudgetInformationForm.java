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

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCE_APPROVED_BUDGET)
    private int financeApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCE_PERCENTAGE)
    private int financePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.STATUTORY_BODIES_APPROVED_BUDGET)
    private int statutoryBodiesApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.STATUTORY_BODIES_PERCENTAGE)
    private int statutoryBodiesPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.PRODUCTION_APPROVED_BUDGET)
    private int productionApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.PRODUCTION_PERCENTAGE)
    private int productionPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.HEALTH_APPROVED_BUDGET)
    private int healthApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.HEALTH_PERCENTAGE)
    private int healthPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.EDUCATION_APPROVED_BUDGET)
    private int educationApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.EDUCATION_PERCENTAGE)
    private int educationPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.ROADS_ENGINEERING_APPROVED_BUDGET)
    private int roadEngineeringApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.ROADS_ENGINEERING_PERCENTAGE)
    private int roadEngineeringPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.WATER_APPROVED_BUDGET)
    private int waterApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.WATER_PERCENTAGE)
    private int waterPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.NATUREAL_RESOURCES_APPROVED_BUDGET)
    private int naturalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.NATUREAL_RESOURCES_PERCENTAGE)
    private int naturalPercentage;
}
