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
    }
}