package org.ygba.youthgobudget.health;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.health.HealthQuestion;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;

import java.util.List;

public class HealthActivity extends AppCompatActivity implements Validator.ValidationListener {
    private final int Q_5_LAST_DAY_VISIT_REQUEST_CODE = 5;
    private final int Q_1_RECURRENT_DATE_RECEIVED_REQUEST_CODE = 1;
    private final int Q_1_RECURRENT_DATE_WITHDRAWN_REQUEST_CODE = 2;
    private final int Q_1_RECURRENT_DATE_DEVELOPMENT_RECEIVED_REQUEST_CODE = 3;
    private final int Q_1_RECURRENT_DATE_DEVELOPMENT_WITHDRAWN_REQUEST_CODE = 4;
    private final int Q_6_3_LAST_DATE_MEDICAL_STAFF_APPRAISAL = 6;
    private final int Q_7_1_DELIVERY_DATE_REQUEST_CODE = 7;
    private final int Q_7_3_LAST_DRUG_CONSIGNMENT_REQUEST_CODE = 8;
    TextView hDateTextView;
    Spinner hFinancialSpinner;
    EditText villageEditText;
    EditText parishEditText;
    EditText divisionEditText;
    EditText agentFulNameEditText;
    EditText agentTelEditText;
    EditText qQANameAndGradeHealthCenterEditText;
    EditText hQBAttendanceEditText;
    EditText hQCInpatientNumberEditText;
    EditText hQ1RecurrentApprovedEditText;
    EditText hQ1RecurrentBudgetReleaseTextEdit;
    EditText hQ1RecurrentDateReceivedEditText;
    EditText hQ1RecurrentDateWithdrawnEditText;
    EditText hQ1DevelopmentApprovedEditText;
    EditText hQ1DevelopmentBudgetReleaseTextEdit;
    EditText hQ1DevelopmentDateReceivedEditText;
    EditText hQ1DevelopmentDateWithdrawnEditText;
    EditText h53LastVisitDate;
    EditText hQ1_2BudgetInformationEditText;
    EditText hQ2_1_LiveNumberDeliveriesTextEdit;
    EditText hQ2_1_StillNumberDeliveriesTextEdit;
    EditText hQ2_2_VaccineEditText;
    EditText hQ3ToiletNumberBlocks;
    EditText hQ3ToiletNumberStances;
    EditText hQ3PatientToiletMaleStances;
    EditText hQ3PatientToiletFemaleStances;
    EditText hQ3StaffToiletMaleStances;
    EditText hQ3StaffToiletFemaleStances;
    EditText hQ3StaffToiletMixedStances;
    EditText hQ3StaffToiletFunctional;
    EditText hQ3StaffToiletNone;
    EditText hQ3LatrineNumberBlocks;
    EditText hQ3LatrineNumberStances;
    EditText hQ3PatientLatrineMaleStances;
    EditText hQ3PatientLatrineFemaleStances;
    EditText hQ3StaffLatrineMaleStances;
    EditText hQ3StaffLatrineFemaleStances;
    EditText hQ3StaffLatrineMixedStances;
    EditText hQ3StaffLatrineFunctional;
    EditText hQ3StaffLatrineNone;
    EditText hQ3FFCNumberBlocks;
    EditText hQ3FFCNumberStances;
    EditText hQ3PatientFFCFemaleStances;
    EditText hQ3StaffFFCFemaleStances;
    EditText hQ3StaffFFCMixedStances;
    EditText hQ3StaffFFCFunctional;
    EditText hQ3StaffFFCNone;
    EditText hQ32OtherSpecifyTextEdit;
    EditText hQ4BoreholeNumberEditText;
    EditText hQ4BoreholeNumberFunctionalEditText;
    EditText hQ4BoreholeNumberNoneFunctional;
    EditText hQ4TapNumberEditText;
    EditText hQ4TapNumberFunctionalEditText;
    EditText hQ4TapNumberNoneFunctional;
    EditText hQ4WaterTankNumberEditText;
    EditText hQ4WaterTankNumberFunctionalEditText;
    EditText hQ4WaterTankNumberNoneFunctional;
    EditText hQ4NoneTankNumberEditText;
    EditText hQ4NoneTankNumberFunctionalEditText;
    EditText hQ4NoneTankNumberNoneFunctional;

    EditText hQ4OtherNameEditText;
    EditText hQ4OtherNameNumberEditText;
    EditText hQ4OtherNameNumberFunctionalEditText;
    EditText hQ4OtherNameNumberNoneFunctional;
    EditText h43NoEstimateEditText;
    EditText hQ5OthersSpecify;
    EditText hQ6MedicalStaffCeilingEditText;
    EditText hQ6MedicalTotalNumberStaffEditText;
    EditText hQ6MedicalTotalNumberStaffPresentEditText;

    EditText hQ6NoneMedicalStaffCeilingEditText;
    EditText hQ6NoneMedicalTotalNumberStaffEditText;
    EditText hQ6NoneMedicalTotalNumberStaffPresentEditText;
    EditText hQ6ReasonsEditText;
    EditText hQ63LastDateAppraisalEditText;
    EditText h64NumberOfStaffAppraisedEditText;
    EditText h71DeliveryDateEditText;
    EditText h73DrugLastDateEditText;
    EditText hQ72Drug1NameEditText;
    EditText hQ72Drug1RequiredStockEditText;
    EditText hQ72Drug2NameEditText;
    EditText hQ72Drug2RequiredStockEditText;
    EditText hQ72Drug3NameEditText;
    EditText hQ72Drug3RequiredStockEditText;
    EditText hQ72Drug4NameEditText;
    EditText hQ72Drug4RequiredStockEditText;
    EditText hQ72Drug5NameEditText;
    EditText hQ72Drug5RequiredStockEditText;
    EditText hQ72Drug6NameEditText;
    EditText hQ72Drug6RequiredStockEditText;
    EditText h74NumberOfMedicalEquipmentBought;
    EditText h76ReferralHandling;
    EditText h8OtherObservationEditText;

    private HealthActivityViewModel healthActivityViewModel;
    private Validator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        healthActivityViewModel = new ViewModelProvider(this).get(HealthActivityViewModel.class);
        initViews();
        initEventHandlers();

        validator = new Validator(this);
        validator.setValidationListener(this);
    }

    private void initEventHandlers() {
        hQ1RecurrentDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        hQ1RecurrentDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });

        hQ1DevelopmentDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_DEVELOPMENT_WITHDRAWN_REQUEST_CODE);
            }
        });

        h53LastVisitDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_5_LAST_DAY_VISIT_REQUEST_CODE);
            }
        });

        hQ1DevelopmentDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_DEVELOPMENT_RECEIVED_REQUEST_CODE);
            }
        });

        hQ63LastDateAppraisalEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_6_3_LAST_DATE_MEDICAL_STAFF_APPRAISAL);
            }
        });
        h71DeliveryDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_7_1_DELIVERY_DATE_REQUEST_CODE);
            }
        });

        h73DrugLastDateEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_7_3_LAST_DRUG_CONSIGNMENT_REQUEST_CODE);
            }
        });

    }


    private void initViews() {
        hDateTextView = findViewById(R.id.date_text_view);
        hFinancialSpinner = findViewById(R.id.quarter_spinner);
        villageEditText = findViewById(R.id.village_text_edit);
        parishEditText = findViewById(R.id.parish_text_edit);
        divisionEditText = findViewById(R.id.division_text_edit);
        agentFulNameEditText = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        qQANameAndGradeHealthCenterEditText = findViewById(R.id.h_name_and_grade_health_center);
        hQBAttendanceEditText = findViewById(R.id.h_question_d_attendance_edit_text);
        hQCInpatientNumberEditText = findViewById(R.id.h_question_c_inpatient_number);


        hQ1RecurrentApprovedEditText = findViewById(R.id.h_question_1_recurrent_approved);
        hQ1RecurrentBudgetReleaseTextEdit = findViewById(R.id.h_question_1_recurrent_budget_released_edit_text);
        hQ1RecurrentDateReceivedEditText = findViewById(R.id.h_question_1_recurrent_date_received_edit_text);
        hQ1RecurrentDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ1RecurrentDateWithdrawnEditText = findViewById(R.id.h_question_1_recurrent_date_withdrawn_edit_text);
        hQ1RecurrentDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);


        hQ1DevelopmentApprovedEditText = findViewById(R.id.h_question_1_development_approved);
        hQ1DevelopmentBudgetReleaseTextEdit = findViewById(R.id.h_question_1_development_budget_released_edit_text);
        hQ1DevelopmentDateReceivedEditText = findViewById(R.id.h_question_1_development_date_received_edit_text);
        hQ1DevelopmentDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ1DevelopmentDateWithdrawnEditText = findViewById(R.id.h_question_1_development_date_withdrawn_edit_text);
        hQ1DevelopmentDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);


        h53LastVisitDate = findViewById(R.id.health_5_3_date_last);
        h53LastVisitDate.setInputType(View.AUTOFILL_TYPE_NONE);
        h71DeliveryDateEditText = findViewById(R.id.health_7_1_delivery_date);
        h71DeliveryDateEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        h73DrugLastDateEditText = findViewById(R.id.health_7_3_last_date_drug_Edit_text);
        h73DrugLastDateEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ63LastDateAppraisalEditText = findViewById(R.id.health_6_3_date_last);
        hQ63LastDateAppraisalEditText.setInputType(View.AUTOFILL_TYPE_NONE);

        hQ1_2BudgetInformationEditText = findViewById(R.id.h_question_1_2_budget_information);
        hQ2_1_LiveNumberDeliveriesTextEdit = findViewById(R.id.health_live_number_deliveries);
        hQ2_1_StillNumberDeliveriesTextEdit = findViewById(R.id.health_still_number_deliveries);
        hQ2_2_VaccineEditText = findViewById(R.id.health_2_2_vaccine);


        hQ3ToiletNumberBlocks = findViewById(R.id.health_3_toilet_blocks);
        hQ3ToiletNumberStances = findViewById(R.id.health_3_toilet_stances);
        hQ3PatientToiletMaleStances = findViewById(R.id.health_3_toilet_patients_male_stances);
        hQ3PatientToiletFemaleStances = findViewById(R.id.health_3_toilet_patients_female_stances);
        hQ3StaffToiletMaleStances = findViewById(R.id.health_3_toilet_staff_male_stances);
        hQ3StaffToiletFemaleStances = findViewById(R.id.health_3_toilet_staff_female_stances);
        hQ3StaffToiletMixedStances = findViewById(R.id.health_3_toilet_staff_mixed_stances);
        hQ3StaffToiletFunctional =  findViewById(R.id.health_3_toilet_functional);
        hQ3StaffToiletNone = findViewById(R.id.health_3_toilet_none);



        hQ3LatrineNumberBlocks = findViewById(R.id.health_3_latrine_blocks);
        hQ3LatrineNumberStances = findViewById(R.id.health_3_latrine_stances);
        hQ3PatientLatrineMaleStances = findViewById(R.id.health_3_latrine_patients_male_stances);
        hQ3PatientLatrineFemaleStances = findViewById(R.id.health_3_latrine_patients_female_stances);
        hQ3StaffLatrineMaleStances = findViewById(R.id.health_3_latrine_staff_male_stances);
        hQ3StaffLatrineFemaleStances = findViewById(R.id.health_3_latrine_staff_female_stances);
        hQ3StaffLatrineMixedStances = findViewById(R.id.health_3_latrine_staff_mixed_stances);
        hQ3StaffLatrineFunctional =  findViewById(R.id.health_3_latrine_functional);
        hQ3StaffLatrineNone = findViewById(R.id.health_3_latrine_none);

        hQ3FFCNumberBlocks = findViewById(R.id.health_3_ffc_blocks);
        hQ3FFCNumberStances = findViewById(R.id.health_3_ffc_stances);
        hQ3PatientFFCFemaleStances = findViewById(R.id.health_3_ffc_patients_female_stances);
        hQ3StaffFFCFemaleStances = findViewById(R.id.health_3_ffc_female_stances);
        hQ3StaffFFCMixedStances = findViewById(R.id.health_3_ffc_staff_mixed_stances);
        hQ3StaffFFCFunctional =  findViewById(R.id.health_3_ffc_functional);
        hQ3StaffFFCNone = findViewById(R.id.health_3_ffc_none);
        hQ32OtherSpecifyTextEdit = findViewById(R.id.health_3_2_other_specify);

        hQ4BoreholeNumberEditText = findViewById(R.id.health_4_borehole_number);
        hQ4BoreholeNumberFunctionalEditText = findViewById(R.id.health_4_borehole_number_functional);
        hQ4BoreholeNumberNoneFunctional = findViewById(R.id.health_4_borehole_number_none);


        hQ4TapNumberEditText = findViewById(R.id.health_4_tap_number);
        hQ4TapNumberFunctionalEditText = findViewById(R.id.health_4_tap_number_functional);
        hQ4TapNumberNoneFunctional = findViewById(R.id.health_4_tap_number_none);


        hQ4WaterTankNumberEditText = findViewById(R.id.health_4_water_tank_number);
        hQ4WaterTankNumberFunctionalEditText = findViewById(R.id.health_4_water_tank_number_functional);
        hQ4WaterTankNumberNoneFunctional = findViewById(R.id.health_4_water_tank_number_none);


        hQ4NoneTankNumberEditText = findViewById(R.id.health_4_none_number);
        hQ4NoneTankNumberFunctionalEditText = findViewById(R.id.health_4_water_none_functional);
        hQ4NoneTankNumberNoneFunctional = findViewById(R.id.health_4_none_number_none);

        hQ4OtherNameEditText = findViewById(R.id.health_4_others_name);
        hQ4OtherNameNumberEditText = findViewById(R.id.health_4_others_number);
        hQ4OtherNameNumberFunctionalEditText = findViewById(R.id.health_4_water_others_functional);
        hQ4OtherNameNumberNoneFunctional = findViewById(R.id.health_4_others_number_none);
        h43NoEstimateEditText = findViewById(R.id.health_4_2_other_specify);
        hQ5OthersSpecify = findViewById(R.id.health_5_2_other_specify);


        hQ6MedicalStaffCeilingEditText = findViewById(R.id.health_6_medical_staff_ceiling);
        hQ6MedicalTotalNumberStaffEditText = findViewById(R.id.health_6_medical_total_number_staff_ceiling);
        hQ6MedicalTotalNumberStaffPresentEditText = findViewById(R.id.health_6_medical_total_number_staff_present);

        hQ6NoneMedicalStaffCeilingEditText = findViewById(R.id.health_6_none_medical_staff_ceiling);
        hQ6NoneMedicalTotalNumberStaffEditText = findViewById(R.id.health_6_none_medical_total_number_staff_ceiling);
        hQ6NoneMedicalTotalNumberStaffPresentEditText = findViewById(R.id.health_6_none_medical_total_number_staff_present);


        hQ6ReasonsEditText = findViewById(R.id.health_6_2_absence_reason_edit_Text);
        h64NumberOfStaffAppraisedEditText = findViewById(R.id.health_6_4_number_of_staff_appraised);
        hQ72Drug1NameEditText = findViewById(R.id.health_7_2_drug_name_1);
        hQ72Drug1RequiredStockEditText = findViewById(R.id.health_7_2_drug_name_1_required_stock);
        hQ72Drug2NameEditText = findViewById(R.id.health_7_2_drug_name_2);
        hQ72Drug2RequiredStockEditText = findViewById(R.id.health_7_2_drug_name_2_required_stock);
        hQ72Drug3NameEditText = findViewById(R.id.health_7_2_drug_name_3);
        hQ72Drug3RequiredStockEditText = findViewById(R.id.health_7_2_drug_name_3_required_stock);
        hQ72Drug4NameEditText = findViewById(R.id.health_7_2_drug_name_4);
        hQ72Drug4RequiredStockEditText = findViewById(R.id.health_7_2_drug_name_4_required_stock);
        hQ72Drug5NameEditText = findViewById(R.id.health_7_2_drug_name_5);
        hQ72Drug5RequiredStockEditText = findViewById(R.id.health_7_2_drug_name_5_required_stock);
        hQ72Drug6NameEditText = findViewById(R.id.health_7_2_drug_name_6);
        hQ72Drug6RequiredStockEditText = findViewById(R.id.health_7_2_drug_name_6_required_stock);
        h74NumberOfMedicalEquipmentBought = findViewById(R.id.health_7_4_number_of_medical_equipments);
        h76ReferralHandling = findViewById(R.id.health_7_6_referral_handle);
        h8OtherObservationEditText = findViewById(R.id.health_8_other_Challenges);

        ((CardView) findViewById(R.id.saved_form_data)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });
    }

    private void saveHealthQuestion() {
        HealthQuestion healthQuestion = new HealthQuestion.Builder()
                .setFinancialYear("2020")
                .setFinancialYearQuarter("IV")
                .setDate(getTextValue(hDateTextView))
                .setDistrict("District Name")
                .setVillage(getTextValue(villageEditText))
                .setParish(getTextValue(parishEditText))
                .setSubCountyDivision(getTextValue(divisionEditText))
                .setNameMonitorAgent(getTextValue(agentFulNameEditText))
                .setTelNumber(getTextValue(agentTelEditText))
                .setNameAndGradeHealthCenter(getTextValue(qQANameAndGradeHealthCenterEditText))
                .setQuestionBOutPatientOPD(getIntegerValue(hQBAttendanceEditText))
                .setQuestionCInPatientAttendance(getIntegerValue(hQCInpatientNumberEditText))
                .setQuestion1RecurrentApprovedBudget(getIntegerValue(hQ1RecurrentApprovedEditText))
                .setQuestion1RecurrentBudgetReleased(getIntegerValue(hQ1RecurrentBudgetReleaseTextEdit))
                .setQuestion1RecurrentDateReceived(getTextValue(hQ1RecurrentDateReceivedEditText))
                .setQuestion1RecurrentDateWithdrawn(getTextValue(hQ1RecurrentDateWithdrawnEditText))
                .setQuestion1DevelopmentApprovedBudget(getIntegerValue(hQ1DevelopmentApprovedEditText))
                .setQuestion1DevelopmentReleasedBudget(getIntegerValue(hQ1DevelopmentBudgetReleaseTextEdit))
                .setQuestion1DevelopmentDateReceived(getTextValue(hQ1DevelopmentDateReceivedEditText))
                .setQuestion1DevelopmentDateWithdrawn(getTextValue(hQ1DevelopmentDateWithdrawnEditText))
                .setQuestion11DisplayBudgetInformation("Display Area")
                .setQuestion12BudgetInformationRelates(getTextValue(hQ1_2BudgetInformationEditText))
                .setQuestion2MaternityYesNo(getQuestion2MaternityWardObjective())
                .setQuestion2GeneralWardYesNo(getQuestion2GeneralWardObjective())
                .setQuestion2DeliveryBedsYesNo(getQuestion2DeliveryBedsObjective())
                .setQuestion2FamilyPlanningServicesYesNo(getQuestion2FamilyPlanningServicesObjective())
                .setQuestion2HIVCounsellingTestingAndTreatmentYesNo(getQuestion2HIVCounsellingTestingObjective())
                .setQuestion2PMTCTYesNo(getQuestion2PMTCTObjective())
                .setQuestion2ImmunizationYesNo(getQuestion2ImmunizationObjective())
                .setQuestion2YouthFriendlyCornersYesNo(getQuestion2YouthFriendlyCornersObjective())
                .setQuestion2Vaccination4HEPBYesNo(getQuestion2VaccinationHEPBObjective())
                // 2.1
                .setQuestion21CategoryLiveNumberDeliveries(getIntegerValue(hQ2_1_LiveNumberDeliveriesTextEdit))
                .setQuestion21CategoryStillNumberDeliveries(getIntegerValue(hQ2_1_StillNumberDeliveriesTextEdit))
                .setQuestion22ChildrenImmunized(getIntegerValue(hQ2_2_VaccineEditText))
                .setQuestion3ToiletNumberBlocks(getIntegerValue( hQ3ToiletNumberBlocks))
                .setQuestion3ToiletNumberInstances(getIntegerValue(hQ3ToiletNumberStances))
                .setQuestion3PatientToiletNumberMaleStances(getIntegerValue(hQ3PatientToiletMaleStances))
                .setQuestion3PatientToiletNumberFemaleStances(getIntegerValue(hQ3PatientToiletFemaleStances))
                .setQuestion3HealthStaffNumberToiletMaleStance(getIntegerValue(hQ3StaffToiletMaleStances))
                .setQuestion3HealthStaffNumberToiletFemaleStances(getIntegerValue(hQ3StaffToiletFemaleStances))
                .setQuestion3HealthStaffNumberToiletMixedStances(getIntegerValue(hQ3StaffToiletMixedStances))
                .setQuestion3ToiletFunctionalNumber(getIntegerValue(hQ3StaffToiletFunctional))
                .setQuestion3ToiletNonFunctionNumber(getIntegerValue( hQ3StaffToiletNone))
                // latrine
                .setQuestion3LatrineNumberBlocks(getIntegerValue(hQ3LatrineNumberBlocks))
                .setQuestion3LatrineNumberStances(getIntegerValue(hQ3LatrineNumberStances))
                .setQuestion3LatrineNumberMaleStances(getIntegerValue(hQ3PatientLatrineMaleStances))
                .setQuestion3LatrineNumberFemaleStances(getIntegerValue(hQ3PatientLatrineFemaleStances))
                .setQuestion3LatrineNumberStaffMaleStances(getIntegerValue(hQ3StaffLatrineMaleStances))
                .setQuestion3LatrineNumberStaffFemaleStance(getIntegerValue(hQ3StaffLatrineFemaleStances))
                .setQuestion3LatrineNumberStaffMixedStances(getIntegerValue( hQ3StaffLatrineMixedStances))
                .setQuestion3LatrineNumberNumberFunctional(getIntegerValue(hQ3StaffLatrineFunctional))
                .setQuestion3LatrineNoneFunctional(getIntegerValue(hQ3StaffLatrineNone))
                // fcrs
                .setQuestion3FCRNumberBlock(getIntegerValue(hQ3FFCNumberBlocks))
                .setQuestion3FCRNumberStances(getIntegerValue(hQ3FFCNumberStances))
                .setQuestion3FCRNumberFemaleStances(getIntegerValue(hQ3PatientFFCFemaleStances))
                .setQuestion3FCRNumberStaffFemaleStances(getIntegerValue(hQ3StaffFFCFemaleStances))
                .setQuestion3FCRNumberStaffMixedStances(getIntegerValue(hQ3StaffFFCMixedStances))
                .setQuestion3FCRNumberFunctionalStances(getIntegerValue(hQ3StaffFFCFunctional))
                .setQuestion3FCRNumberNoneFunction(getIntegerValue(hQ3StaffFFCNone))
                // 31
                .setQuestion31HealthFacilityToiletFacilities(getQuestion31ToiletObjective())
                .setQuestion32HealthFacilityToiletReasonFacilities("reasons")
                .setQuestion4NumberOfBoreHole(getIntegerValue(hQ4BoreholeNumberEditText))
                .setQuestion4NumberOfBoreHoleFunctional(getIntegerValue(hQ4BoreholeNumberFunctionalEditText))
                .setQuestion4NumberOfBoreHoleNoneFunctional(getIntegerValue( hQ4BoreholeNumberNoneFunctional))
                .setQuestion4NumberOfTap(getIntegerValue(hQ4TapNumberEditText))
                .setQuestion4NumberOfTapFunctional(getIntegerValue(hQ4TapNumberFunctionalEditText))
                .setQuestion4NumberOfTapNoneFunctional(getIntegerValue(hQ4TapNumberNoneFunctional))
                .setQuestion4NumberOfWaterTank(getIntegerValue(hQ4WaterTankNumberEditText))
                .setQuestion4NumberOfWaterTankFunctional(getIntegerValue(hQ4NoneTankNumberFunctionalEditText))
                .setQuestion4NumberOfWaterTankNoneFunctional(getIntegerValue(hQ4NoneTankNumberNoneFunctional))
                .setQuestion4OtherName(getTextValue(hQ4OtherNameEditText))
                .setQuestion4OtherNumber(getIntegerValue(hQ4OtherNameNumberEditText))
                .setQuestion4OtherNumberFunctional(getIntegerValue( hQ4OtherNameNumberFunctionalEditText))
                .setQuestion4OtherNumberNoneFunctional(getIntegerValue( hQ4OtherNameNumberNoneFunctional))
                .setQuestion41WaterPointAccessible(getQuestion41WaterPointObjective())
                .setQuestion43FunctionalWaterPoint(getQuestion43WaterPointObjective())
                .setQuestion43IfNoneReason(getTextValue(h43NoEstimateEditText))
                .setQuestion44HandWashingInstalled(getQuestion44HandWashingObjective())
                .setQuestion51HealthUnitManagementCommittee(getQuestion51HUMCObjective())
                .setQuestion52HowOftenTheyMeet(getQuestion52MeetingObjective())
                .setQuestion53LastVisitSupportSupervisor(getTextValue(h53LastVisitDate))
                .setQuestion6MedicalStaffCeilingNumber(getIntegerValue(hQ6MedicalStaffCeilingEditText))
                .setQuestion6MedicalTotalNumberStaff(getIntegerValue( hQ6MedicalTotalNumberStaffEditText))
                .setQuestion6MedicalNumberStuffPresent(getIntegerValue(hQ6MedicalTotalNumberStaffPresentEditText))
                .setQuestion6NoneMedicalStaffCeilingNumber(getIntegerValue(hQ6NoneMedicalStaffCeilingEditText))
                .setQuestion6NoneMedicalStaffTotalNumberStaff(getIntegerValue(hQ6NoneMedicalTotalNumberStaffEditText))
                .setQuestion6NoneMedicalNumberStaffPresent(getIntegerValue(hQ6NoneMedicalTotalNumberStaffPresentEditText))
                .setQuestion6ReasonsForStaffAbsence(getTextValue(hQ6ReasonsEditText))
                .setQuestion6LastDatePerformanceAppraisal(getTextValue(hQ63LastDateAppraisalEditText))
                .setQuestion6NumberOfStaffAppraised(getIntegerValue(hQ63LastDateAppraisalEditText))
                // question 7
                .setQuestion7HCReceiveMedicalSupplies(getQuestion71Objective())
                .setQuestion7HCReceiveMedicalSuppliesIfNo(getTextValue(h71DeliveryDateEditText))
                .setQuestion72EssentialDrug1Name(getTextValue(hQ72Drug1NameEditText))
                .setQuestion72EssentialDrug1RequiredStock(getIntegerValue(hQ72Drug1RequiredStockEditText))
                .setQuestion72EssentialDrug2Name(getTextValue(hQ72Drug2NameEditText))
                .setQuestion72EssentialDrug2RequiredStock(getIntegerValue(hQ72Drug2RequiredStockEditText))
                .setQuestion72EssentialDrug3Name(getTextValue(hQ72Drug3NameEditText))
                .setQuestion72EssentialDrug3RequiredStock(getIntegerValue(hQ72Drug3RequiredStockEditText))
                .setQuestion72EssentialDrug4Name(getTextValue(hQ72Drug4NameEditText))
                .setQuestion72EssentialDrug4RequiredStock(getIntegerValue(hQ72Drug4RequiredStockEditText))
                .setQuestion72EssentialDrug5Name(getTextValue(hQ72Drug5NameEditText))
                .setQuestion72EssentialDrug5RequiredStock(getIntegerValue(hQ72Drug5RequiredStockEditText))
                .setQuestion73HCLastDrugsConsignment(getTextValue(h73DrugLastDateEditText))
                .setQuestion74NumberMedicalEquipmentBrought(getIntegerValue(h74NumberOfMedicalEquipmentBought))
                .setQuestion75HaveAmbulance(getQuestion75Objective())
                .setQuestion76Referrals(getTextValue(h76ReferralHandling))
                .setQuestion80ChallengesAndObservation(getTextValue(h8OtherObservationEditText))
                .build();

        healthActivityViewModel.insertHealthQuestion(healthQuestion);

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((resultCode == RESULT_OK) && (data != null) ) {
            if (requestCode == Q_1_RECURRENT_DATE_RECEIVED_REQUEST_CODE) {
                hQ1RecurrentDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_1_RECURRENT_DATE_DEVELOPMENT_WITHDRAWN_REQUEST_CODE) {
                hQ1DevelopmentDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_1_RECURRENT_DATE_DEVELOPMENT_RECEIVED_REQUEST_CODE) {
                hQ1DevelopmentDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_1_RECURRENT_DATE_WITHDRAWN_REQUEST_CODE ) {
                hQ1RecurrentDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_5_LAST_DAY_VISIT_REQUEST_CODE ) {
                h53LastVisitDate.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_6_3_LAST_DATE_MEDICAL_STAFF_APPRAISAL ) {
                hQ63LastDateAppraisalEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_7_1_DELIVERY_DATE_REQUEST_CODE) {
                h71DeliveryDateEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_7_3_LAST_DRUG_CONSIGNMENT_REQUEST_CODE ) {
                h73DrugLastDateEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            }
        }
    }

    private boolean getQuestion2MaternityWardObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_maternity_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_maternity_yes;
    }

    private boolean getQuestion2GeneralWardObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_general_ward_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_general_ward_yes;
    }

    private boolean getQuestion2DeliveryBedsObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_delivery_beds_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_delivery_beds_yes;
    }
    private boolean getQuestion2FamilyPlanningServicesObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_family_planning_Services_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_family_planning_Services_yes;
    }
    private boolean getQuestion2HIVCounsellingTestingObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_hiv_counselling_testing_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_hiv_counselling_testing_yes;
    }
    private boolean getQuestion2PMTCTObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_pmtct_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_pmtct_yes;
    }
    private boolean getQuestion2ImmunizationObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_immunization_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_immunization_yes;
    }
    private boolean getQuestion2YouthFriendlyCornersObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_youth_friendly_corners_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_youth_friendly_corners_yes;
    }
    private boolean getQuestion2VaccinationHEPBObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_vaccination_for_hep_b_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_2_vaccination_for_hep_b_yes;
    }
    private boolean getQuestion31ToiletObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_3_1_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_3_1_yes;
    }

    private boolean getQuestion41WaterPointObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_4_1_water_point_accessible_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_4_1_yes;
    }

    private boolean getQuestion43WaterPointObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_4_3_water_point_nearby_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_4_3_yes;
    }
    private boolean getQuestion44HandWashingObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_4_4_handwashing_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_4_4_yes;
    }
    private boolean getQuestion51HUMCObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_5_1_HUMC_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_5_1_HUMC_yes;
    }

    private String getQuestion52MeetingObjective() {
        if (((RadioGroup)findViewById(R.id.question_5_2_meet_radio_group)).getCheckedRadioButtonId() == R.id.question_5_2_monthly) {
            return "Monthly";
        } else if (((RadioGroup)findViewById(R.id.question_5_2_meet_radio_group)).getCheckedRadioButtonId() == R.id.question_5_2_quartly) {
            return "Quarterly";
        }
        return "Others";
    }
    private boolean getQuestion71Objective() {
        RadioGroup radioGroup = findViewById(R.id.question_7_1_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_7_1_yes;
    }
    private boolean getQuestion75Objective() {
        RadioGroup radioGroup = findViewById(R.id.question_7_5_amubance_radio_group);
        return radioGroup.getCheckedRadioButtonId() == R.id.question_7_5_ambulance_yes;
    }

    private String getTextValue(EditText editText) {
        return editText.getText().toString();
    }

    private String getTextValue(TextView textView) {
        return textView.getText().toString();
    }

    private int getIntegerValue(EditText editText) {
        return Integer.parseInt(editText.getText().toString());
    }

    private int getIntegerValue(TextView textView) {
        return 56;
    }

    @Override
    public void onValidationSucceeded() {
        saveHealthQuestion();
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error: errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);
            if (view instanceof EditText) {
                ( (EditText) view).setError(message);
            }
        }
    }
}