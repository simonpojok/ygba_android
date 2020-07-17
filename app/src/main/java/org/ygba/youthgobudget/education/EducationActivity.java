package org.ygba.youthgobudget.education;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
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
    private EditText eAgentEditText;
    private EditText eAgentTellEditText;
    private EditText eQuestion1EditText;
    private EditText eQuestionSchoolNameEditText;

    private EditText eQuestionMaleTeachersEditText;
    private EditText eQuestion2MaleEnrolledPupilsEditText;
    private EditText eQuestion2NumberP7PupilEditText;
    private EditText eQuestion2MaleDropoutPupilEditText;





    private EditText eQuestion8OtherObservationsEditText;

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
//        eQuestionSchoolNameEditText = findViewById(R.id.question_2_school_name_edit_text);
//        eQuestionMaleTeachersEditText = findViewById(R.id.question_2_teacher_male_edit_text);
//        eQuestion2MaleEnrolledPupilsEditText = findViewById(R.id.question_2_pupil_enrollment_male_edit_text);
//        eQuestion2NumberP7PupilEditText = findViewById(R.id.question_2_number_p7_male_edit_text);
//        eQuestion2MaleDropoutPupilEditText = findViewById(R.id.question_2_number_of_p7_male_edit_text);


        eQuestion8OtherObservationsEditText = findViewById(R.id.eduction_question_8_5_others_edit_text);
        findViewById(R.id.saved_form_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // save data
            }
        });
    }

    private boolean getQuestion85ObjectiveAnswer() {
        return ((RadioGroup) findViewById(R.id.question85RadioGroup)).getCheckedRadioButtonId() == R.id.education_question_8_5_yes;
    }
}