package org.ygba.youthgobudget.health;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.health.HealthQuestion;
import org.ygba.youthgobudget.data.health.HealthQuestionDao;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class HealthQuestionUploadWorker extends Worker {
    YGBARepository ygbaRepository;
    public HealthQuestionUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(context.getApplicationContext()));
    }

    @NonNull
    @Override
    public Result doWork() {
        List<HealthQuestion> healthQuestions = getList();
        if (healthQuestions != null ) {
            for (HealthQuestion healthQuestion: healthQuestions ) {
                try {
                    JSONObject body = new JSONObject();
                    body.put("record_id", healthQuestion.getPrimaryKey());
                    body.put("financial_yr", healthQuestion.getFinancialYear());
                    body.put("quarter", healthQuestion.getFinancialYearQuarter());
                    body.put("date", healthQuestion.getData());
                    body.put("district", healthQuestion.getDistrict());
                    body.put("region", "Some Region");
                    body.put("village", healthQuestion.getVillage());
                    // TODO: Parish array
                    body.put("parish", healthQuestion.getParish());
                    body.put("subcounty", healthQuestion.getTownCouncil());
                    body.put("staffName", healthQuestion.getNameMonitorAgent());
                    body.put("staff_phone", healthQuestion.getTelNumber());
                    body.put("health_center_name", healthQuestion.getQuestionANameHealthCenter());
                    body.put("health_center_grade", "Name Not Provided Yet");
                    body.put("no_of_outpatients", healthQuestion.getQuestionBOutPatientOPDAttendance());
                    body.put("no_of_inpatients", healthQuestion.getQuestionCInPatientAttendance());

                    // first table
                    body.put("grant_recurrent_approved", healthQuestion.getQuestion1RecurrentApprovedBudget());
                    body.put("grant_recurrent_released", healthQuestion.getQuestion1RecurrentBudgetReleased());
                    body.put("grant_recurrent_date_received", healthQuestion.getQuestion1RecurrentDateReceived());
                    body.put("grant_recurrent_date_withdrawn", healthQuestion.getQuestion1RecurrentDateWithdrawn());

                    body.put("grant_devt_approved", healthQuestion.getQuestion1DevelopmentApprovedBudget());
                    body.put("grant_devt_released", healthQuestion.getQuestion1DevelopmentReleasedBudget());
                    body.put("grant_devt_date_received", healthQuestion.getQuestion1DevelopmentReleasedBudget());
                    body.put("grant_devt_date_withdrawn", healthQuestion.getQuestion1DevelopmentDateWithdrawn());
                    body.put("where_public_display_of_budget_info", healthQuestion.getQuestion11DisplayBudgetInformation());
                    body.put("period_to_which_budget_info_relates", healthQuestion.getQuestion12BudgetInformationRelates());

                    // 2
                    body.put("is_maternity_ward", healthQuestion.isQuestion2MaternityYesNo());
                    body.put("is_general_ward", healthQuestion.isQuestion2GeneralWardYesNo());
                    body.put("are_there_delivery_beds", healthQuestion.isQuestion2DeliveryBedsYesNo());
                    body.put("are_there_family_planing_services", healthQuestion.isQuestion2FamilyPlanningServicesYesNo());
                    body.put("are_there_hiv_services", healthQuestion.isQuestion2HIVCounsellingTestingAndTreatmentYesNo());
                    body.put("is_pmtct", healthQuestion.isQuestion2PMTCTYesNo());
                    body.put("is_immunization", healthQuestion.isQuestion2ImmunizationYesNo());
                    body.put("is_youth_friendly_corners", healthQuestion.isQuestion2YouthFriendlyCornersYesNo());
                    body.put("is_vaccination_for_hep_b", healthQuestion.isQuestion2Vaccination4HEPBYesNo());

                    // 2 1
                    body.put("no_live_deliveries", healthQuestion.getQuestion21CategoryLiveNumberDeliveries());
                    body.put("no_still_deliveries", healthQuestion.getQuestion21CategoryStillNumberDeliveries());

                    body.put("no_immunized_pentavalent_vaccine", healthQuestion.getQuestion22ChildrenImmunized());

                    // 3.0
                    body.put("no_santn_toilet_blocks", healthQuestion.getQuestion3ToiletNumberBlocks());
                    body.put("no_santn_toilet_stances", healthQuestion.getQuestion3ToiletNumberInstances());
                    body.put("no_santn_toilet_patient_male_stances", healthQuestion.getQuestion3PatientToiletNumberMaleStances());
                    body.put("no_santn_toilet_patient_female_stances", healthQuestion.getQuestion3PatientToiletNumberFemaleStances());
                    body.put("no_santn_toilet_male_staff", healthQuestion.getQuestion3HealthStaffNumberToiletMaleStance());
                    body.put("no_santn_toilet_female_staff", healthQuestion.getQuestion3HealthStaffNumberToiletFemaleStances());
                    body.put("no_santn_toilet_mixed_staff", healthQuestion.getQuestion3HealthStaffNumberToiletMixedStances());
                    body.put("no_santn_toilet_functional", healthQuestion.getQuestion3ToiletFunctionalNumber());
                    body.put("no_santn_toilet_non_functional", healthQuestion.getQuestion3ToiletNonFunctionNumber());

                    // row 2
                    body.put("no_santn_latrine_blocks", healthQuestion.getQuestion3LatrineNumberBlocks());
                    body.put("no_santn_latrine_stances", healthQuestion.getQuestion3LatrineNumberStances());
                    body.put("no_santn_latrine_patient_male_stances", healthQuestion.getQuestion3LatrineNumberMaleStances());
                    body.put("no_santn_latrine_patient_female_stances", healthQuestion.getQuestion3LatrineNumberFemaleStances());
                    body.put("no_santn_latrine_male_staff", healthQuestion.getQuestion3LatrineNumberStaffMaleStances());
                    body.put("no_santn_latrine_female_staff", healthQuestion.getQuestion3LatrineNumberStaffFemaleStance());
                    body.put("no_santn_latrine_mixed_staff", healthQuestion.getQuestion3LatrineNumberStaffMixedStances());
                    //TODO: field missing
                    body.put("no_santn_latrine_functional", healthQuestion.getQuestion3LatrineNumberFunctional());
                    body.put("no_santn_latrine_non_functional", healthQuestion.getQuestion3LatrineNoneFunctional());

                    // fcr
                    body.put("no_santn_female_change_rm_blocks", healthQuestion.getQuestion3FCRNumberBlock()); // buzuuko - road block buloba - ivory school oposite restaurent
                    body.put("no_santn_female_change_rm_stances", healthQuestion.getQuestion3FCRNumberStances());
                    body.put("no_santn_female_change_rm_patient_female_stances", healthQuestion.getQuestion3FCRNumberFemaleStances());
                    body.put("no_santn_female_change_rm_female_staff", healthQuestion.getQuestion3FCRNumberStaffFemaleStances());
                    body.put("no_santn_female_change_rm_mixed_staff", healthQuestion.getQuestion3FCRNumberStaffMixedStances());
                    body.put("no_santn_female_change_rm_functional", healthQuestion.getQuestion3FCRNumberFunctionalStances());
                    body.put("no_santn_female_change_rm_non_functional", healthQuestion.getQuestion3FCRNumberNoneFunction());

                    body.put("are_health_disabled_toilets", healthQuestion.isQuestion31HealthFacilityToiletFacilities());
                    body.put("if_yes_method_of_access", healthQuestion.getQuestion32HealthFacilityToiletReasonFacilities());

                    // question 4
                    body.put("no_borehole", healthQuestion.getQuestion4NumberOfBoreHole());
                    body.put("no_borehole_functional", healthQuestion.getQuestion4NumberOfBoreHoleFunctional());
                    body.put("no_borehole_none_functional", healthQuestion.getQuestion4NumberOfBoreHoleNoneFunctional());

                    body.put("no_tap", healthQuestion.getQuestion4NumberOfTap());
                    body.put("no_tap_functional", healthQuestion.getQuestion4NumberOfTapFunctional());
                    body.put("no_tap_none_functional", healthQuestion.getQuestion4NumberOfTapNoneFunctional());

                    body.put("no_water_tank", healthQuestion.getQuestion4NumberOfWaterTank());
                    body.put("no_water_tank_functional", healthQuestion.getQuestion4NumberOfWaterTankFunctional());
                    body.put("no_water_tank_none_functional", healthQuestion.getQuestion4NumberOfWaterTankNoneFunctional());

                    body.put("no_others_name", healthQuestion.getQuestion4OtherName());
                    body.put("no_others", healthQuestion.getQuestion4OtherNumber());
                    body.put("no_others_functional", healthQuestion.getQuestion4OtherNumberFunctional());
                    body.put("no_others_none_functional", healthQuestion.getQuestion4OtherNumberNoneFunctional());

                    body.put("is_water_accessible_to_pwds", healthQuestion.isQuestion41WaterPointAccessible());
                    body.put("is_water_point_within", healthQuestion.isQuestion43FunctionalWaterPoint());
                    body.put("if_not_within_how_far", healthQuestion.getQuestion43IfNoneReason());

                    body.put("is_handwashing_facility", healthQuestion.isQuestion44HandWashingInstalled());

                    // question 5
                    body.put("is_health_unit_mgt_commit", healthQuestion.isQuestion51HealthUnitManagementCommittee());
                    // frequency TODO: need to be changed
                    body.put("if_yes_meeting_frequency", healthQuestion.getQuestion52HowOftenTheyMeet());
                    body.put("last_visit_by_health_inspector", healthQuestion.getQuestion53LastVisitSupportSupervisor()); // Y-m-d

                    // question 6
                    body.put("medical_staff_ceiling", healthQuestion.getQuestion6MedicalStaffCeilingNumber());
                    body.put("medical_staff_total", healthQuestion.getQuestion6MedicalTotalNumberStaff());
                    body.put("medical_staff_present", healthQuestion.getQuestion6MedicalNumberStuffPresent());

                    body.put("non_medical_staff_ceiling", healthQuestion.getQuestion6NoneMedicalStaffCeilingNumber());
                    body.put("non_medical_staff_total", healthQuestion.getQuestion6NoneMedicalStaffTotalNumberStaff());
                    body.put("non_medical_staff_present", healthQuestion.getQuestion6NoneMedicalNumberStaffPresent());
                    body.put("reason_for_absent_staff", healthQuestion.getQuestion6ReasonsForStaffAbsence());
                    body.put("last_date_staff_perfomance_appraisal", healthQuestion.getQuestion6LastDatePerformanceAppraisal());
                    body.put("no_of_staff_appraised", healthQuestion.getQuestion6NumberOfStaffAppraised());
                    body.put("received_medical_supplies_from_nms", healthQuestion.isQuestion7HCReceiveMedicalSupplies());
                    body.put("if_yes_date", healthQuestion.getQuestion7HCReceiveMedicalSuppliesIfNo());

                    JSONArray essentialDrugs = new JSONArray();

                    JSONObject essentialDrug1 = new JSONObject();
                    essentialDrug1.put("name", healthQuestion.getQuestion72EssentialDrug1Name());
                    essentialDrug1.put("stock_required", healthQuestion.getQuestion72EssentialDrug1RequiredStock());
                    essentialDrugs.put(essentialDrug1);

                    JSONObject essentialDrug2 = new JSONObject();
                    essentialDrug2.put("name", healthQuestion.getQuestion72EssentialDrug2Name());
                    essentialDrug2.put("stock_required", healthQuestion.getQuestion72EssentialDrug2RequiredStock());
                    essentialDrugs.put(essentialDrug2);

                    JSONObject essentialDrug3 = new JSONObject();
                    essentialDrug3.put("name", healthQuestion.getQuestion72EssentialDrug3Name());
                    essentialDrug3.put("stock_required", healthQuestion.getQuestion72EssentialDrug3RequiredStock());
                    essentialDrugs.put(essentialDrug3);

                    JSONObject essentialDrug4 = new JSONObject();
                    essentialDrug4.put("name", healthQuestion.getQuestion72EssentialDrug4Name());
                    essentialDrug4.put("stock_required", healthQuestion.getQuestion72EssentialDrug4RequiredStock());
                    essentialDrugs.put(essentialDrug4);

                    JSONObject essentialDrug5 = new JSONObject();
                    essentialDrug5.put("stock_required", healthQuestion.getQuestion72EssentialDrug5RequiredStock());
                    essentialDrug5.put("name", healthQuestion.getQuestion72EssentialDrug5Name());
                    essentialDrugs.put(essentialDrug5);
                    body.put("essential_drugs", essentialDrugs);

                    body.put("when_last_drugs_consgmt_finished", healthQuestion.getQuestion73HCLastDrugsConsignment());
                    body.put("no_medical_equip_bought", healthQuestion.getQuestion74NumberMedicalEquipmentBrought());
                    body.put("is_ambulance", healthQuestion.isQuestion75HaveAmbulance());
                    body.put("if_no_how_referrals_handled", healthQuestion.getQuestion76Referrals());
                    body.put("other_observations", healthQuestion.getQuestion80ChallengesAndObservation());


                    // TODO some data

                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                            Request.Method.POST,
                            "",
                            body,
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {

                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {

                                }
                            }
                    );

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return Result.success();
    }

    private List<HealthQuestion> getList() {
        try {
            return ygbaRepository.getHealthQuestion4BackUp();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}