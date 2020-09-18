package org.ygba.youthgobudget.education;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.education.EducationQuestion;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;
import org.ygba.youthgobudget.dialogs.DistrictPickerActivity;
import org.ygba.youthgobudget.dialogs.SubCountyPickerActivity;
import org.ygba.youthgobudget.utils.DynamicData;

import java.util.List;

public class EducationActivity extends AppCompatActivity implements Validator.ValidationListener{
    private   final int DISTRICT_NAME_REQUESTER_CODE = 10;
    private   final int SUB_COUNTY_NAME_REQUEST_CODE = 25;
    private int districtId = 0;
    private final int CAPITAL_RECEIVED_DATE_REQUEST_CODE = 1;
    private final int CAPITAL_DATE_WITHDRAWN_REQUEST_CODE = 2;
    private final int SFG_DATE_RECEIVED_REQUEST_CODE = 3;
    private final int SFG_DATE_WITHDRAWN_REQUEST_CODE = 4;
    private final int LAST_TIME_INSPECTOR_VISIT_REQUEST_CODE = 6;
    private TextView eDateTextView;
    private Spinner eFinancialYearSpinner;
    private EditText eVillageEditText;
    private TextView  districtText;
    @NotEmpty
    private EditText eParishEditText;
    private TextView eDivisionEditText;
    private TextView eDistrictEditText;
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
    private EditText eQ4Grade4MaleEditText;

    private EditText eQ4Grade1GirlEditText;
    private EditText eQ4Grade2GirlEditText;
    private EditText eQ4Grade3GirlEditText;
    private EditText eQ4Grade4GirlEditText;

    private EditText eQ42Reason4AttributeAnswerEditText;

    private EditText eQ5NumberOfBlocksToiletEditText;
    private EditText eQ5NumberOfBlocksStancesEditText;

    private EditText eQ5NumberOfBlocksMaleStances;
    private EditText eQ5NumberOfToiletFemaleStancesPupil;
    private EditText eQ5NumberOfToiletMaleStancesTeacher;
    private EditText eQ5NumberOfToiletFemaleStancesTeacher;
    private EditText eQ5NumberOfToiletMixed;
    private EditText eQ5NumberOfToiletFunctional;
    private EditText eQ5NumberOfToiletNonFunctional;

    private EditText eQ5numberOfLatrineBlocks;
    private EditText eQ5NumberOfLatrineStances;
    private EditText eQ5NumberOfLatrineMaleStancesPupil;
    private EditText eQ5NumberOfLatrineFemaleStancesPupil;
    private EditText eQ5NumberOfLatrineMaleStancesTeacher;
    private EditText eQ5NumberOfLatrineFemaleStancesTeacher;
    private EditText eQ5NumberStancesMixedTeachers;
    private EditText eQ5NumberLatrineFunctional;
    private EditText eQ5NumberLatrineNonFunctional;

    private EditText eQ5NumberVIPLatrineNumberBlocks;
    private EditText eQ5NumberVIPLatrineNumberStances;
    private EditText eQ5NumberVIPLatrineNumberStancesMalePupil;
    private EditText eQ5NumberVIPLatrineNumberStancesFemalePupil;
    private EditText eQ5NumberVIPLatrineNumberStancesMaleTeacher;
    private EditText eQ5NumberVIPLatrineNumberStancesFemaleTeacher;
    private EditText eQ5NumberVIPLatrineStancesMixed;
    private EditText eQ5NumberVIPLatrineStancesFunctional;
    private EditText eQ5NumberVIPLatrineStancesNoneFunctional;
    private EditText eQFemaleChangingRoomBlockNumber;
    private EditText eQ5FemaleChangingRoomStanceNumber;
    private EditText eQ5FemaleChangingRoomFemaleStances;
    private EditText eQ5FemaleChangingRoomFemaleStancesTeacher;
    private EditText eQ5FemaleChangingRoomMixedTeacher;
    private EditText eQ5FemaleChangingRoomFunction;
    private EditText eQ5FemaleChangingRoomNoneFunction;
    private EditText eQ5UrinalsForBoysNumberBlocks;
    private EditText eQ5UrinalsForBoysNumberOfStances;
    private EditText eQ5UrinalsForBoysNumberStancesTeachers;
    private EditText eQ5UrinalsForBoysNumberStancesMixedTeacher;
    private EditText eQ5UrinalsForBoysNumberStancesFunctional;
    private EditText eQ5UrinalsForBoysNNumberNoneFunctional;
    private EditText eQ5UrinalsForBoysNumberMalePupil;
    private EditText question53FunctionWaterPointReason;
    private EditText question61NumberPermanentClassRoomEditText;
    private EditText question62NumberOfDeskInSchool;
    private EditText question63PupilDeskRatioEditText;
    private EditText question70NumberOfTeacherMaleEnrolled;
    private EditText question70NumberOfTeacherFemaleEnrolled;
    private EditText question70NumberOfTeacherMalePresent;
    private EditText question70NumberOfTeacherFemalePresent;
    private EditText question70NumberOfTeacherInPayroll;
    private EditText question71TeacherPupilRatio;
    private EditText question73SWTOfferSupportEditText;
    private EditText question81SchoolInspector;
    private TextView question82LastTimeSchoolInspectorVisit;
    private EditText question84HowOftenSMCMeet;
    private EditText question8ObservationsChallenges;

    private Validator validator;
    private EducationActivityViewModel educationActivityViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        initViews();
        validator = new Validator(this);
        validator.setValidationListener(this);
        educationActivityViewModel = new ViewModelProvider(this).get(EducationActivityViewModel.class);

    }

    private void initViews() {
        eDateTextView = findViewById(R.id.date);
        eDateTextView.setText(DynamicData.getDate());
        eFinancialYearSpinner = findViewById(R.id.quarter_spinner);
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
        eQ4Grade4MaleEditText = findViewById(R.id.question_4_grade_others_male_edit_text);

        eQ4Grade1GirlEditText = findViewById(R.id.question_4_grade_1_female_edit_text);
        eQ4Grade2GirlEditText = findViewById(R.id.question_4_grade_2_female_edit_text);
        eQ4Grade3GirlEditText = findViewById(R.id.question_4_grade_3_female_edit_text);
        eQ4Grade4GirlEditText = findViewById(R.id.question_4_grade_others_female_edit_text);

        eQ42Reason4AttributeAnswerEditText = findViewById(R.id.question_4_2_edit_text);

        eQ5NumberOfBlocksToiletEditText = findViewById(R.id.question_4_toilet_blocks_edit_text);
        eQ5NumberOfBlocksStancesEditText = findViewById(R.id.question_4_toilet_stances_edit_text);
        eQ5NumberOfBlocksMaleStances = findViewById(R.id.question_4_toilet_male_stances_edit_text);
        eQ5NumberOfToiletFemaleStancesPupil = findViewById(R.id.question_4_toilet_female_stances_edit_text);
        eQ5NumberOfToiletMaleStancesTeacher = findViewById(R.id.question_4_toilet_teacher_male_stances_edit_text);
        eQ5NumberOfToiletFemaleStancesTeacher = findViewById(R.id.question_4_toilet_teacher_female_stances_edit_text);
        eQ5NumberOfToiletMixed = findViewById(R.id.question_4_toilet_teacher_mixed_stances_edit_text);
        eQ5NumberOfToiletFunctional = findViewById(R.id.question_4_toilet_functional_edit_text);
        eQ5NumberOfToiletNonFunctional = findViewById(R.id.question_4_toilet_none_edit_text);

        eQ5numberOfLatrineBlocks = findViewById(R.id.eduction_question_5_latrine_blocks);
        eQ5NumberOfLatrineStances = findViewById(R.id.eduction_question_5_latrine_stances);
        eQ5NumberOfLatrineMaleStancesPupil = findViewById(R.id.eduction_question_5_latrine_pupil_male_stances);
        eQ5NumberOfLatrineFemaleStancesPupil = findViewById(R.id.eduction_question_5_latrine_pupil_female_stances);
        eQ5NumberOfLatrineMaleStancesTeacher = findViewById(R.id.eduction_question_5_latrine_teacher_male_stances);
        eQ5NumberOfLatrineFemaleStancesTeacher = findViewById(R.id.eduction_question_5_latrine_teacher_female_stances);
        eQ5NumberStancesMixedTeachers = findViewById(R.id.eduction_question_5_latrine_teacher_mixed_stances);
        eQ5NumberLatrineFunctional = findViewById(R.id.eduction_question_5_latrine_functional_stances);
        eQ5NumberLatrineNonFunctional = findViewById(R.id.eduction_question_5_latrine_none_stances);

        eQ5NumberVIPLatrineNumberBlocks = findViewById(R.id.eduction_question_5_VIP_latrine_blocks);
        eQ5NumberVIPLatrineNumberStances = findViewById(R.id.eduction_question_5_VIP_latrine_stances);
        eQ5NumberVIPLatrineNumberStancesMalePupil = findViewById(R.id.eduction_question_5_VIP_latrine_pupil_male_stances);
        eQ5NumberVIPLatrineNumberStancesFemalePupil = findViewById(R.id.eduction_question_5_VIP_latrine_pupil_female_stances);
        eQ5NumberVIPLatrineNumberStancesMaleTeacher = findViewById(R.id.eduction_question_5_VIP_latrine_teacher_male_stances);
        eQ5NumberVIPLatrineNumberStancesFemaleTeacher = findViewById(R.id.eduction_question_5_latrine_VIP_teacher_female_stances);
        eQ5NumberVIPLatrineStancesMixed = findViewById(R.id.eduction_question_5_VIP_latrine_teacher_mixed_stances);
        eQ5NumberVIPLatrineStancesFunctional = findViewById(R.id.eduction_question_5_VIP_latrine_functional_stances);
        eQ5NumberVIPLatrineStancesNoneFunctional = findViewById(R.id.eduction_question_5_VIP_latrine_none_stances);

        eQFemaleChangingRoomBlockNumber = findViewById(R.id.eduction_question_5_FCR_latrine_blocks);
        eQ5FemaleChangingRoomStanceNumber =  findViewById(R.id.eduction_question_5_FCR_latrine_stances);
        eQ5FemaleChangingRoomFemaleStances = findViewById(R.id.eduction_question_5_FCR_latrine_pupil_female_stances);
        eQ5FemaleChangingRoomFemaleStancesTeacher = findViewById(R.id.eduction_question_5_latrine_FCR_teacher_female_stances);
        eQ5FemaleChangingRoomMixedTeacher = findViewById(R.id.eduction_question_5_FCR_latrine_teacher_mixed_stances);
        eQ5FemaleChangingRoomFunction = findViewById(R.id.eduction_question_5_FCR_latrine_functional_stances);
        eQ5FemaleChangingRoomNoneFunction = findViewById(R.id.eduction_question_5_FCR_latrine_none_stances);

        eQ5UrinalsForBoysNumberBlocks = findViewById(R.id.eduction_question_5_UFB_latrine_blocks);
        eQ5UrinalsForBoysNumberOfStances = findViewById(R.id.eduction_question_5_UFB_latrine_stances);
        eQ5UrinalsForBoysNumberStancesTeachers = findViewById(R.id.eduction_question_5_UFB_latrine_teacher_male_stances);
        eQ5UrinalsForBoysNumberStancesMixedTeacher = findViewById(R.id.eduction_question_5_UFB_latrine_teacher_mixed_stances);
        eQ5UrinalsForBoysNumberStancesFunctional = findViewById(R.id.eduction_question_5_UFB_latrine_functional_stances);
        eQ5UrinalsForBoysNNumberNoneFunctional = findViewById(R.id.eduction_question_5_UFB_latrine_none_stances);
        eQ5UrinalsForBoysNumberMalePupil = findViewById(R.id.eduction_question_5_UFB_latrine_pupil_male_stances);

        question53FunctionWaterPointReason = findViewById(R.id.eduction_question_5_3_estimate_distance_text_view);

        question61NumberPermanentClassRoomEditText = findViewById(R.id.eduction_question_6_1_edit_text);
        question62NumberOfDeskInSchool = findViewById(R.id.eduction_question_6_2_edit_text);
        question63PupilDeskRatioEditText = findViewById(R.id.eduction_question_6_3_edit_text);


        question70NumberOfTeacherMaleEnrolled = findViewById(R.id.eduction_question_7_0_enrolled_male_teachers_text_view);
        question70NumberOfTeacherFemaleEnrolled = findViewById(R.id.eduction_question_7_0_enrolled_female_teachers_text_view);
        question70NumberOfTeacherMalePresent = findViewById(R.id.eduction_question_7_0_enrolled_male_teachers_present_text_view);
        question70NumberOfTeacherFemalePresent = findViewById(R.id.eduction_question_7_0_enrolled_female_teachers_present_text_view);
        question70NumberOfTeacherInPayroll = findViewById(R.id.eduction_question_7_0_teachers_on_payroll_text_view);

        question71TeacherPupilRatio = findViewById(R.id.eduction_question_7_1_edit_text);
        question73SWTOfferSupportEditText = findViewById(R.id.eduction_question_7_3_edit_text);
        question81SchoolInspector = findViewById(R.id.eduction_question_8_1_edit_text);

        question82LastTimeSchoolInspectorVisit = findViewById(R.id.eduction_question_8_2_edit_text);
        question82LastTimeSchoolInspectorVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, DatePickerActivity.class);
                startActivityForResult(intent, LAST_TIME_INSPECTOR_VISIT_REQUEST_CODE);
            }
        });
//        question84HowOftenSMCMeet = findViewById(R.id.)
        question8ObservationsChallenges = findViewById(R.id.eduction_question_8_5_others_edit_text);
        findViewById(R.id.saved_form_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });


        // listeners
        eDistrictEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EducationActivity.this, DistrictPickerActivity.class);
                startActivityForResult(intent, DISTRICT_NAME_REQUESTER_CODE);
            }
        });

        eDivisionEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (districtId == 0) {
                    eDivisionEditText.setError("Please Set District Continue");
                } else {
                    Intent intent = new Intent(EducationActivity.this, SubCountyPickerActivity.class);
                    startActivityForResult(intent, SUB_COUNTY_NAME_REQUEST_CODE);
                }
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

                .setQ2PupilEnrollmentTeachers(getIntegerValue(eQ2MalePupilEnrollmentEditText))
                .setQ2FeMalePupilEnrollment(getIntegerValue(eQ2FeMalePupilEnrollmentEditText))
                .setQ2MalePWDPupilEnrollment(getIntegerValue(eQ2MalePWDSPupilEnrollmentEditText))
                .setQ2FemalePWDSPupilEnrollment(getIntegerValue(eQ2FemalePWDSPupilEnrollmentEditText))
                .setQ2PupilEnrollmentTotal(getIntegerValue(eQ2PupilEnrollmentTotal))

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
                .setQ4Grade4MaleNumber(getIntegerValue(eQ4Grade4MaleEditText))

                .setQ4Grade1FemaleNumber(getIntegerValue(eQ4Grade1GirlEditText))
                .setQ4Grade2FemaleNumber(getIntegerValue(eQ4Grade2GirlEditText))
                .setQ4Grade3FemaleNumber(getIntegerValue(eQ4Grade3GirlEditText))
                .setQ4Grade4FemaleNumber(getIntegerValue(eQ4Grade4GirlEditText))

                .setQ41ObjectiveCurrentTermPerformance(getQuestion41ObjectiveAnswer())
                .setQ42AttributeReasonAnswer(getTextValue(eQ42Reason4AttributeAnswerEditText))

                .setQ5BlocksToiletNumber(getIntegerValue(eQ5NumberOfBlocksToiletEditText))
                .setQ5ToiletNumberOfStances(getIntegerValue(eQ5NumberOfBlocksStancesEditText))
                .setQ5ToiletNumberOfMaleStancesPupil(getIntegerValue(eQ5NumberOfBlocksMaleStances))
                .setQ55ToiletNumberOfFemaleStancesPupil(getIntegerValue(eQ5NumberOfToiletFemaleStancesPupil))
                .setQ5ToiletNumberOfMaleStancesTeacher(getIntegerValue(eQ5NumberOfToiletMaleStancesTeacher))
                .setQ5ToiletNumberOfFemaleStancesTeacher(getIntegerValue(eQ5NumberOfToiletFemaleStancesTeacher))
                .setQ5ToiletNumberOfMixedStances(getIntegerValue(eQ5NumberOfToiletMixed))
                .setQ5ToiletFunctional(getIntegerValue(eQ5NumberOfToiletFunctional))
                .setQ5ToiletNonFuctional(getIntegerValue(eQ5NumberOfToiletNonFunctional))

                .setQ5LatrineNumberOfBlocks(getIntegerValue(eQ5numberOfLatrineBlocks))
                .setQ5LatrineNumberOfStances(getIntegerValue(eQ5NumberOfLatrineStances))
                .setQ5LatrineNumberOfMaleStancesPupil(getIntegerValue(eQ5NumberOfLatrineMaleStancesPupil))
                .setQ5LatrineNumberOfFemaleStancesPupil(getIntegerValue(eQ5NumberOfLatrineFemaleStancesPupil))
                .setQ5LatrineNumberOfMaleStancesTeacher(getIntegerValue(eQ5NumberOfLatrineMaleStancesTeacher))
                .setQ5LatrineNumberOfFemaleStancesTeachers(getIntegerValue(eQ5NumberOfLatrineFemaleStancesTeacher))
                .setQ5LatrineNumberMixedTeachers(getIntegerValue(eQ5NumberStancesMixedTeachers))
                .setQ5LatrineNumberFunctional(getIntegerValue(eQ5NumberLatrineFunctional))
                .setQ5LatrineNumberNoneFunctional(getIntegerValue(eQ5NumberLatrineNonFunctional))

                .setQ5VIPLatrineNumberOfBlocks(getIntegerValue(eQ5NumberVIPLatrineNumberBlocks))
                .setQ5VIPLatrineNumberOfStances(getIntegerValue(eQ5NumberVIPLatrineNumberStances))
                .setQ5VIPLatrineNumberOfStancesMalePupil(getIntegerValue(eQ5NumberVIPLatrineNumberStancesMalePupil))
                .setQ5VIPLatrineNumberOfStancesFemalePupil(getIntegerValue(eQ5NumberVIPLatrineNumberStancesFemalePupil))
                .setQ5VIPLatrineNumberOfStancesMaleTeacher(getIntegerValue(eQ5NumberVIPLatrineNumberStancesMaleTeacher))
                .setQ5VIPLatrineNumberOfStancesFemaleTeacher(getIntegerValue(eQ5NumberVIPLatrineNumberStancesFemaleTeacher))
                .setQ5VIPLatrineNumberOfStancesMixedTeacher(getIntegerValue(eQ5NumberVIPLatrineStancesMixed))
                .setQ5VIPLatrineFunctional(getIntegerValue(eQ5NumberVIPLatrineStancesFunctional))
                .setQ5VIPLatrineNoneFunctional(getIntegerValue(eQ5NumberVIPLatrineStancesNoneFunctional))

                .setQFemaleChangingRoomNumberBlocks(getIntegerValue(eQFemaleChangingRoomBlockNumber))
                .setQ5FemaleChangingRoomNumberStances(getIntegerValue(eQ5FemaleChangingRoomStanceNumber))
                .setQ5FemaleChangingRoomNumberFemaleStance(getIntegerValue(eQ5FemaleChangingRoomFemaleStances))
                .setQ5FemaleChangingRoomNumberFemaleTeacher(getIntegerValue(eQ5FemaleChangingRoomFemaleStancesTeacher))
                .setQ5FemaleChangingRoomNumberMixedTeachers(getIntegerValue(eQ5FemaleChangingRoomMixedTeacher))
                .setQ5FemaleChangingRoomNumberFunctional(getIntegerValue(eQ5FemaleChangingRoomFunction))
                .setQ5FemaleChangingRoomNumberNoneFunctional(getIntegerValue(eQ5FemaleChangingRoomNoneFunction))


                .setQ5UrinalsForBoysBlockNumber(getIntegerValue(eQ5UrinalsForBoysNumberBlocks))
                .setQ5UrinalsForBoysStancesNumber(getIntegerValue(eQ5UrinalsForBoysNumberOfStances))
                .setQ5UrinalsForBoysStancesNumberMalePupil(getIntegerValue(eQ5UrinalsForBoysNumberMalePupil))
                .setQ5UrinalsForBoysStancesNumberTeachers(getIntegerValue(eQ5UrinalsForBoysNumberStancesTeachers))
                .setQ5UrinalsForBoysStancesNumberMixedTeachers(getIntegerValue(eQ5UrinalsForBoysNumberStancesMixedTeacher))
                .setQ5UrinalsForBoysStancesFunctional(getIntegerValue(eQ5UrinalsForBoysNumberStancesFunctional))
                .setQ5UrinalsForBoysStancesNoneFunctional(getIntegerValue(eQ5UrinalsForBoysNNumberNoneFunctional))

                .setQ5SchoolToiletAccessible(getQuestion51SchoolToiletFacilitiesAccessible())
                // TODO: question 5.2 missing information
                .setQ5FunctionalWaterPoint(getQuestion53ObjectiveAnswer())
                .setQ5FunctionalWaterPointReasonIfNo(getTextValue(question53FunctionWaterPointReason))

                // question 6
                .setQuestion61NumberPermanentClassRooms(getIntegerValue(question61NumberPermanentClassRoomEditText))
                .setQuestion62NumberOfDeskInSchool(getIntegerValue(question62NumberOfDeskInSchool))
                .setQuestion63PupilDeskRatio(getTextValue(question63PupilDeskRatioEditText))

                // question 7
                .setQuestion70NumberOfMaleTeacherEnrolled(getIntegerValue(question70NumberOfTeacherMaleEnrolled))
                .setQuestion70NumberOfFemaleTeacherEnrolled(getIntegerValue(question70NumberOfTeacherFemaleEnrolled))
                .setQuestion70NumberOfFemaleTeacherPresent(getIntegerValue(question70NumberOfTeacherFemalePresent))
                .setQuestion70NumberOfTeachersOnPayroll(getIntegerValue(question70NumberOfTeacherInPayroll))
                .setQuestion70NumberOfTeachersPresentMale(getIntegerValue(question70NumberOfTeacherMalePresent))

                .setQuestion71TeacherPupilRatio(getTextValue(question71TeacherPupilRatio))
                .setQuestion72SeniorWomanTeacherYesNo(getQuestion72SeniorWomanTeacherObjectiveAnswer())
                .setQuestion73SWFOfferSupportHow(getTextValue(question73SWTOfferSupportEditText))
                .setQuestion8HowOftenSchoolInspectorVisit(getTextValue(question81SchoolInspector))
                .setQuestion82LastTimeInspectorVisit(getTextValue(question82LastTimeSchoolInspectorVisit))
                .setQuestion83SchoolHaveSchoolManagementCommittee(getQuestion83SchoolManagementCommittee())
                .setQuestion84HowOftenSMCMeet("meet_text")
                .setQuestion85IsSMCTrained(getQuestion85IsSMCTrained())
                .setQuestion8ObservationsOrChallenges(getTextValue(question8ObservationsChallenges))
                .build();

        educationActivityViewModel.saveEducationQuestion(educationQuestion);
    }

    private String getQuestion85IsSMCTrained() {
        RadioGroup radioGroup = findViewById(R.id.question85RadioGroup);
        return "Others";
    }

    private boolean getQuestion83SchoolManagementCommittee() {
        RadioGroup radioGroup = findViewById(R.id.question82RadioGroup);
        return radioGroup.getCheckedRadioButtonId() == R.id.education_question_8_3_yes;
    }

    private boolean getQuestion72SeniorWomanTeacherObjectiveAnswer() {
        RadioGroup radioGroup = findViewById(R.id.question72RadioGroup);
        return radioGroup.getCheckedRadioButtonId() == R.id.education_question_7_2_yes;
    }

    private String getTextValue(EditText editText) {
        return  editText.getText().toString();
    }

    private String getTextValue(TextView editText) {
        return  editText.getText().toString();
    }

    private int getIntegerValue(EditText editText) {
        return Integer.parseInt(editText.getText().toString());
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
            } else if (requestCode == LAST_TIME_INSPECTOR_VISIT_REQUEST_CODE) {
                question82LastTimeSchoolInspectorVisit.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == DISTRICT_NAME_REQUESTER_CODE) {
                eDistrictEditText.setText(data.getStringExtra(DistrictPickerActivity.DISTRICT_NAME));
                districtId = data.getIntExtra(DistrictPickerActivity.DISTRICT_ID, 0);
            } else if (requestCode == SUB_COUNTY_NAME_REQUEST_CODE) {
                eDivisionEditText.setText(data.getStringExtra(SubCountyPickerActivity.SUB_COUNTY_NAME));
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

    private String getQuestion41ObjectiveAnswer() {
        if (((RadioGroup) findViewById(R.id.question41RadioGroup)).getCheckedRadioButtonId() == R.id.education_question_4_1_Good) {
            return "Good";
        } else  if (((RadioGroup) findViewById(R.id.question41RadioGroup)).getCheckedRadioButtonId() == R.id.education_question_4_1_bad) {
            return "Bad";
        } else if (((RadioGroup) findViewById(R.id.question41RadioGroup)).getCheckedRadioButtonId() == R.id.education_question_4_1_same) {
            return "Same";
        }
        return "Same";
    }

    private boolean getQuestion51SchoolToiletFacilitiesAccessible() {
        RadioGroup radioGroup = findViewById(R.id.question51RadioGroup);
        return radioGroup.getCheckedRadioButtonId() == R.id.education_question_5_1_yes;
    }

    private boolean getQuestion53ObjectiveAnswer() {
        RadioGroup radioGroup = findViewById(R.id.question53RadioGroup);
        return radioGroup.getCheckedRadioButtonId() == R.id.education_question_5_3_yes;
    }

    @Override
    public void onValidationSucceeded() {
        saveData();
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {

    }
}