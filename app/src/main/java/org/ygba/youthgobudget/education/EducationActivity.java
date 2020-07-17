package org.ygba.youthgobudget.education;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.utils.DynamicData;

public class EducationActivity extends AppCompatActivity {
    private TextView eDateTextView;
    private Spinner eFinancialYearSpinner;
    private EditText eVillageEditText;
    private EditText eParishEditText;
    private EditText eDivisionEditText;
    private EditText eDistrictEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        initViews();
    }

    private void initViews() {
        eDateTextView = findViewById(R.id.education_date_text_view);
        eDateTextView.setText(DynamicData.getDate());
        eFinancialYearSpinner = findViewById(R.id.financial_year_spinner);
        eDistrictEditText = findViewById(R.id.district_text_edit);
        eVillageEditText = findViewById(R.id.village_text_edit);
        eParishEditText = findViewById(R.id.parish_text_edit);
        eDivisionEditText = findViewById(R.id.division_text_edit);
    }
}