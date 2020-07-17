package org.ygba.youthgobudget.education;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.education.EducationQuestion;
import org.ygba.youthgobudget.utils.DynamicData;

public class EducationActivity extends AppCompatActivity {
    private TextView eDateTextView;
    private Spinner eFinancialYearSpinner;
    private EditText eVillageEditText;
    private EditText eParishEditText;
    private EditText eDivisionEditText;
    private EditText eDistrictEditText;
    private EditText eAgentEditText;
    private EditText eAgentTellEditText;
    private EditText eQuestion1EditText;

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
        eAgentEditText = findViewById(R.id.ygb_agent_name_edit_view);
        eAgentTellEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        eQuestion1EditText = findViewById(R.id.question_1_edit_text);
        findViewById(R.id.saved_form_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // save data
            }
        });
    }

    private void saveData() {
        EducationQuestion educationQuestion = new EducationQuestion.Builder()
                .setFinancialYear("Fina")
                .setDate(getTextValue(eDateTextView))
                .setDistrict(getTextValue(eDistrictEditText))
                .setVillage(getTextValue(eVillageEditText))
                .setParish(getTextValue(eParishEditText))
                .setDivision(getTextValue(eDivisionEditText))
                .setAgentNames(getTextValue(eAgentEditText))
                .setTelephone(getTextValue(eAgentTellEditText))
                .setQuestion1Answer(getTextValue(eQuestion1EditText))
                .build();
    }

    private String getTextValue(EditText editText) {
        return  editText.getText().toString();
    }

    private String getTextValue(TextView editText) {
        return  editText.getText().toString();
    }

    private int getIntegerValue(EditText editText) {
        return 0;
    }
}