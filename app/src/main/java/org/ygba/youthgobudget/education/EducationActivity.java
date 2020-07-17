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
    private EditText eQuestionSchoolNameEditText;
    private EditText eQ2MaleTeachersEditText;
    private EditText eQ2FeMaleTeachersEditText;
    private EditText eQ2MalePWDSTeachersEditText;
    private EditText eQ2FemalePWDSTeachersEditText;
    private EditText eQ2TeachersTotal;

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
        eQuestionSchoolNameEditText = findViewById(R.id.question_2_school_name);
        eQ2MaleTeachersEditText = findViewById(R.id.question_2_teachers_male);
        eQ2FeMaleTeachersEditText = findViewById(R.id.question_2_teachers_female);
        eQ2MalePWDSTeachersEditText = findViewById(R.id.question_2_teachers_male_pwd);
        eQ2FemalePWDSTeachersEditText = findViewById(R.id.question_2_teachers_female_pwd);
        eQ2TeachersTotal = findViewById(R.id.question_2_teachers_total);


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
                .setQuestion2SchoolName(getTextValue(eQuestionSchoolNameEditText))
                .setQ2MaleTeachers(getIntegerValue(eQ2MaleTeachersEditText))
                .setQ2FeMaleTeachers(getIntegerValue(eQ2FeMaleTeachersEditText))
                .setQ2MalePWDTeachers(getIntegerValue(eQ2MalePWDSTeachersEditText))
                .setQ2FemalePWDSTeachers(getIntegerValue(eQ2FemalePWDSTeachersEditText))
                .setQ2TeachersTotal(getIntegerValue(eQ2TeachersTotal))
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