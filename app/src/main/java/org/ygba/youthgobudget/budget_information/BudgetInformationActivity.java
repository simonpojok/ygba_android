package org.ygba.youthgobudget.budget_information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import org.ygba.youthgobudget.R;

public class BudgetInformationActivity extends AppCompatActivity {
    private Spinner financialYearSpinner;
    private EditText administrationApprovedBudgetED;
    private EditText administrationPercentageED;
    private EditText financeApprovedBudgetED;
    private EditText financePercentage;
    private EditText statutoryBodiesApprovedBudgetED;
    private EditText statutoryBodiesPercentageET;
    private EditText productionApprovedBudgetET;
    private EditText productionPercentageET;
    private EditText healthApprovedBudget;
    private EditText healthPercentageET;
    private EditText educationApprovedBudget;
    private EditText educationPercentage;
    private EditText roadEngineeringApprovedBudgetET;
    private EditText roadEngineeringPercentageET;
    private EditText waterApprovedBudgetET;
    private EditText percentageWaterET;
    private EditText approvedBudgetNaturalResourcesET;
    private EditText percentageNaturalResourcesET;
    private EditText extFinancingPercentageET;
    private EditText extApprovedBudgetET;
    private EditText domesticApprovedBudgetET;
    private EditText domesticPercentageET;
    private EditText recurrentPercentageET;
    private EditText recurrentApprovedBudgetET;
    private EditText wagesPercentageET;
    private EditText wagesApprovedBudget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_information);

        initViews();
    }

    private void initViews() {
        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        administrationApprovedBudgetED = findViewById(R.id.approved_budget_administration);
        administrationPercentageED = findViewById(R.id.percentage_administration);
        financeApprovedBudgetED = findViewById(R.id.approved_budget_finance);
        financePercentage = findViewById(R.id.percentage_finance);
        statutoryBodiesApprovedBudgetED = findViewById(R.id.approved_budget_statutory_bodies);
        statutoryBodiesPercentageET = findViewById(R.id.percentage_statutory_bodies);
        productionApprovedBudgetET = findViewById(R.id.approved_budget_production);
        productionPercentageET = findViewById(R.id.percentage_production);
        healthApprovedBudget = findViewById(R.id.approved_budget_health);
        healthPercentageET = findViewById(R.id.percentage_health);
        educationApprovedBudget = findViewById(R.id.approved_budget_education);
        educationPercentage = findViewById(R.id.percentage_education);
        roadEngineeringApprovedBudgetET = findViewById(R.id.approved_budget_road_engineering);
        roadEngineeringPercentageET = findViewById(R.id.percentage_road_engineering);
        waterApprovedBudgetET = findViewById(R.id.approved_budget_water);
        percentageWaterET = findViewById(R.id.percentage_water);
        approvedBudgetNaturalResourcesET = findViewById(R.id.approved_budget_natural_resources);
        percentageNaturalResourcesET = findViewById(R.id.percentage_natural_resources);
        extFinancingPercentageET = findViewById(R.id.percentage_ext);
        extApprovedBudgetET = findViewById(R.id.approved_budget_ext);
        domesticApprovedBudgetET = findViewById(R.id.approved_budget_domestic);
        domesticPercentageET = findViewById(R.id.percentage_domestic);
        recurrentPercentageET = findViewById(R.id.percentage_recurrent);
        recurrentApprovedBudgetET = findViewById(R.id.approved_budget_recurrent);
        wagesPercentageET = findViewById(R.id.percentage_wage);
        wagesApprovedBudget = findViewById(R.id.approved_budget_wage);
    }
}