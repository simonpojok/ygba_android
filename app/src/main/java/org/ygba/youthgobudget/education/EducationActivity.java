package org.ygba.youthgobudget.education;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.education.EducationQuestion;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;
import org.ygba.youthgobudget.utils.DynamicData;

public class EducationActivity extends AppCompatActivity {
    private final int CAPITAL_RECEIVED_DATE_REQUEST_CODE = 1;
    private final int CAPITAL_DATE_WITHDRAWN_REQUEST_CODE = 2;
    private final int SFG_DATE_RECEIVED_REQUEST_CODE = 3;
    private final int SFG_DATE_WITHDRAWN_REQUEST_CODE = 4;
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
    private EditText eQ2MalePupilEnrollmentEditText;
    private EditText eQ2FeMalePupilEnrollmentEditText;
    private EditText eQ2MalePWDSPupilEnrollmentEditText;
    private EditText eQ2FemalePWDSPupilEnrollmentEditText;
    private EditText eQ2PupilEnrollmentTotal;

    private EditText eQ2NumberP7Male;
    private EditText eQ2NumberP7FeMale;
    private EditText eQ2NumberP7MalePWD;
    private EditText eQ2NumberP7FeMalePWD;
    private EditText eQ2NumberP7Total;

    private EditText eQ2NumberDropOutMale;
    private EditText eQ2NumberDropOutFemale;
    private EditText eQ2NumberDropOutMalePWD;
    private EditText eQ2NumberDropOutFemalePWD;
    private EditText eQ2NumberDropOutTotal;

    private EditText eQ3CapitalGrantApprovedBudgetExitText;

    private EditText eQ2DropOutReasonIfDropOut;
    private EditText eQ3CapitalGrantReleasedBudgetExitText;
    private TextView eQ3CapitalBudgetReceivedDateEditText;
    private TextView eQ3CapitalBudgetDateWithdrawnEditText;

    private EditText eQ3SFGApprovedBudgetEditText;
    private EditText eQ3SFGBudgetReleasedEditText;
    private TextView eQ3SFGDateReceivedEditText;
    private TextView eQ3SFGDateWithdrawnEditText;
    private EditText eQ3StateReasonEditText;

    private EditText eQ4Grade1MaleEditText;
    private EditText eQ4Grade2MaleEditText;
    private EditText eQ4Grade3MaleEditText;

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

        eQ2MalePupilEnrollmentEditText = findViewById(R.id.question_2_pupil_enrollment_male);
        eQ2FeMalePupilEnrollmentEditText = findViewById(R.id.question_2_pupil_enrollment_female);
        eQ2MalePWDSPupilEnrollmentEditText = findViewById(R.id.question_2_pupil_enrollment_male_pwd);
        eQ2FemalePWDSPupilEnrollmentEditText = findViewById(R.id.question_2_pupil_enrollment_female_pwd);
        eQ2PupilEnrollmentTotal = findViewById(R.id.question_2_pupil_enrollment_total);

        eQ2NumberP7Male = findViewById(R.id.question_2_number_p_7_pupils_male);
        eQ2NumberP7FeMale = findViewById(R.id.question_2_number_p_7_pupils_female);
        eQ2NumberP7MalePWD = findViewById(R.id.question_2_number_p_7_pupils_male_pwd);
        eQ2NumberP7FeMalePWD = findViewById(R.id.question_2_number_p_7_pupils_female_pwd);
        eQ2NumberP7Total = findViewById(R.id.question_2_number_p_7_pupils_total);

        eQ2NumberDropOutMale = findViewById(R.id.question_2_number_of_dropout_male);
        eQ2NumberDropOutFemale = findViewById(R.id.question_2_number_of_dropout_female);
        eQ2NumberDropOutMalePWD = findViewById(R.id.question_2_number_of_dropout_male_pwd);
        eQ2NumberDropOutFemalePWD = findViewById(R.id.question_2_number_of_dropout_female_pwd);
        eQ2NumberDropOutTotal = findViewById(R.id.question_2_number_of_dropout_total);

        eQ2DropOutReasonIfDropOut = findViewById(R.id.question_2_dropout_reason);

        eQ3CapitalGrantApprovedBudgetExitText = findViewById(R.id.question_3_capital_grant_edit_text);
        eQ3CapitalGrantReleasedBudgetExitText = findViewById(R.id.question_3_capital_grant_released_budget_edit_text);
        eQ3CapitalBudgetReceivedDateEditText = findViewById(R.id.question_3_capital_grant_date_received_edit_text);
        eQ3CapitalBudgetReceivedDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, DatePickerActivity.class);
                startActivityForResult(intent, CAPITAL_RECEIVED_DATE_REQUEST_CODE);
            }
        });
        eQ3CapitalBudgetDateWithdrawnEditText = findViewById(R.id.question_3_capital_grant_date_withdrawn_edit_text);
        eQ3CapitalBudgetDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(
                        new Intent(EducationActivity.this, DatePickerActivity.class),
                        CAPITAL_DATE_WITHDRAWN_REQUEST_CODE
                );
            }
        });

        eQ3SFGApprovedBudgetEditText = findViewById(R.id.question_3_sfg_approved_budget_edit_text);
        eQ3SFGBudgetReleasedEditText = findViewById(R.id.question_3_sfg_budget_released_edit_text);
        eQ3SFGDateReceivedEditText = findViewById(R.id.question_3_sfg_date_received_edit_text);
        eQ3SFGDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(EducationActivity.this, DatePickerActivity.class), SFG_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        eQ3SFGDateWithdrawnEditText = findViewById(R.id.question_3_sfg_date_withdrawn_edit_text);
        eQ3SFGDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(EducationActivity.this, DatePickerActivity.class), SFG_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });

        eQ3StateReasonEditText = findViewById(R.id.question_3_2_state_reason_edit_text);
        eQ4Grade1MaleEditText = findViewById(R.id.question_4_grade_1_male_edit_text);
        eQ4Grade2MaleEditText = findViewById(R.id.question_4_grade_2_male_edit_text);
        eQ4Grade3MaleEditText = findViewById(R.id.question_4_grade_3_male_edit_text);



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

                .setQ2PupilEnrollmentTeachers(getIntegerValue(eQ2MaleTeachersEditText))
                .setQ2FeMalePupilEnrollment(getIntegerValue(eQ2FeMaleTeachersEditText))
                .setQ2MalePWDPupilEnrollment(getIntegerValue(eQ2MalePWDSTeachersEditText))
                .setQ2FemalePWDSPupilEnrollment(getIntegerValue(eQ2FemalePWDSTeachersEditText))
                .setQ2PupilEnrollmentTotal(getIntegerValue(eQ2TeachersTotal))

                .setNumberP7Male(getIntegerValue(eQ2NumberP7Male))
                .setQuestionNumberP7FeMale(getIntegerValue(eQ2NumberP7FeMale))
                .setQuestion2NumberP7MalePWD(getIntegerValue(eQ2NumberP7MalePWD))
                .setQuestion2NumberP7FemalePWD(getIntegerValue(eQ2NumberP7FeMalePWD))
                .setQuestion2NumberP7Total(getIntegerValue(eQ2NumberP7Total))

                .setQuestion2NumberDropOutMale(getIntegerValue(eQ2NumberDropOutMale))
                .setQuestion2NumberDropOutFemale(getIntegerValue( eQ2NumberDropOutFemale))
                .setQuestion2NumberDropOutMalePWD(getIntegerValue(eQ2NumberDropOutMalePWD ))
                .setQuestion2NumberDropOutFemalePWD(getIntegerValue(eQ2NumberDropOutFemalePWD))
                .setQuestion2NumberDropOutTotal(getIntegerValue(eQ2NumberDropOutTotal))

                .setQuestion2DropOutReasonIfAny(getTextValue(eQ2DropOutReasonIfDropOut))

                .setQ3CapitalGrantApprovedBudget(getIntegerValue(eQ3CapitalGrantApprovedBudgetExitText))
                .setQ3CapitalGrantReleasedBudget(getIntegerValue(eQ3CapitalGrantReleasedBudgetExitText))
                .setQ3CapitalGrantDateReceived(getTextValue(eQ3CapitalBudgetReceivedDateEditText))
                .setQ3CapitalGrantDateWithdrawn(getTextValue(eQ3CapitalBudgetDateWithdrawnEditText))
                .setQ3SFGApprovedBudget(getIntegerValue(eQ3SFGApprovedBudgetEditText))
                .setQ3SFGBudgetReleased(getIntegerValue(eQ3SFGBudgetReleasedEditText))
                .setQ3SFGReceivedDate(getTextValue(eQ3SFGDateReceivedEditText))
                .setQ3SFGDateWithdrawn(getTextValue(eQ3SFGDateWithdrawnEditText))
                .setQ3IsInformationNoticeBoardDisplayed(isBudgetInformationDisplayedInSchoolNoticeBoard())
                .setQ3IsInformationHeaderTeacherOfficeDisplayed(isBudgetInformationHeadTeacherOfficeDisplayed())
                .setQ3IsInformationStaffRoomDisplayed(isBudgetInformationStaffRoomDisplayed())
                .setQ3IsBudgetInformationNotDisplayed(isBudgetInformationNotDisplayed())
                .setQ32PeriodStatement(getTextValue(eQ3StateReasonEditText))

                .setQ4Grade1MaleNumber(getIntegerValue(eQ4Grade1MaleEditText))
                .setQ4Grade2MaleNumber(getIntegerValue(eQ4Grade2MaleEditText))
                .setQ4Grade3MaleNumber(getIntegerValue(eQ4Grade3MaleEditText))
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((data != null) && (resultCode == RESULT_OK)) {
            if (requestCode == CAPITAL_RECEIVED_DATE_REQUEST_CODE ) {
                eQ3CapitalBudgetReceivedDateEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == CAPITAL_DATE_WITHDRAWN_REQUEST_CODE) {
                eQ3CapitalBudgetDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == SFG_DATE_RECEIVED_REQUEST_CODE) {
                eQ3SFGDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            }
        }
    }

    private boolean isBudgetInformationDisplayedInSchoolNoticeBoard() {
        return ((CheckBox) findViewById(R.id.question_3_1_school_notice_board)).isChecked();
    }

    private boolean isBudgetInformationHeadTeacherOfficeDisplayed() {
        return ((CheckBox) findViewById(R.id.question_3_1_head_teacher_office)).isChecked();
    }

    private boolean isBudgetInformationStaffRoomDisplayed() {
        return ((CheckBox) findViewById(R.id.question_3_1_school_staff_room)).isChecked();
    }

    private boolean isBudgetInformationNotDisplayed() {
        return ((CheckBox) findViewById(R.id.question_3_1_not_displayed)).isChecked();
    }
}