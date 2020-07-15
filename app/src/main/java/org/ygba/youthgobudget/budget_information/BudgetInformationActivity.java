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
    }
}