package org.ygba.youthgobudget.health;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class HealthQuestionUploadWorker extends Worker {
    public HealthQuestionUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        try {

        } catch (Exception e) {

        }
        return null;
    }
}

//return [
//        'record_id'         => Str::random(10),
//        'financial_yr'      => '2020/21',
//        'quarter'           => $faker->randomElement($quarter),
//        'date'              => $faker->date('Y-m-d'),
//        'district'          => $district->name,
//        'region'            => $region->name,
//        'village'           => $faker->randomElement($village),
//        'parish'            => Parish::updateOrCreate([
//        'name' => $faker->randomElement($array = $parish),
//        'sub_county_id' => $subCountyId
//        ])->name,
//        'subcounty'         => $subCounty->name,
//        'staff_phone'       => '0758281012',
//        'staffName'         => $faker->randomElement($staff),
//        'health_center_name' => $faker->randomElement($centers),
//        'health_center_grade' => $faker->randomElement($grades),
//        'no_of_outpatients' => $faker->randomNumber(3),
//        'no_of_inpatients' => $faker->randomNumber(3),
//        'grant_recurrent_approved' => $faker->randomNumber(7),
//        'grant_recurrent_released' => $faker->randomNumber(7),
//        'grant_recurrent_date_received' => $faker->date('Y-m-d'),
//        'grant_recurrent_date_withdrawn' => $faker->date('Y-m-d'),
//        'grant_devt_approved' => $faker->randomNumber(7),
//        'grant_devt_released' => $faker->randomNumber(7),
//        'grant_devt_date_received' => $faker->date('Y-m-d'),
//        'grant_devt_date_withdrawn' => $faker->date('Y-m-d'),
//        'where_public_display_of_budget_info'   => $faker->randomElement($display),
//        'period_to_which_budget_info_relates'   => $faker->randomElement($quarter),
//        'is_maternity_ward' => $faker->randomElement($bolean),
//        'is_general_ward' => $faker->randomElement($bolean),
//        'are_there_delivery_beds' => $faker->randomElement($bolean),
//        'are_there_family_planing_services' => $faker->randomElement($bolean),
//        'are_there_hiv_services' => $faker->randomElement($bolean),
//        'is_pmtct' => $faker->randomElement($bolean),
//        'is_immunization' => $faker->randomElement($bolean),
//        'is_youth_friendly_corners' => $faker->randomElement($bolean),
//        'is_vaccination_for_hep_b' => $faker->randomElement($bolean),
//        'no_live_deliveries'    => $faker->randomNumber(4),
//        'no_still_deliveries'    => $faker->randomNumber(4),
//        'no_immunized_pentavalent_vaccine'    => $faker->randomNumber(4),
//        'no_santn_toilet_blocks'    => $faker->randomNumber(4),
//        'no_santn_toilet_stances'    => $faker->randomNumber(4),
//        'no_santn_toilet_patient_male_stances'    => $faker->randomNumber(4),
//        'no_santn_toilet_patient_female_stances'    => $faker->randomNumber(4),
//        'no_santn_toilet_male_staff'    => $faker->randomNumber(4),
//        'no_santn_toilet_female_staff'    => $faker->randomNumber(4),
//        'no_santn_toilet_mixed_staff'    => $faker->randomNumber(4),
//        'no_santn_toilet_functional'    => $faker->randomNumber(4),
//        'no_santn_toilet_non_functional'    => $faker->randomNumber(4),
//        'no_santn_latrine_blocks'    => $faker->randomNumber(4),
//        'no_santn_latrine_stances'    => $faker->randomNumber(4),
//        'no_santn_latrine_patient_male_stances'    => $faker->randomNumber(4),
//        'no_santn_latrine_patient_female_stances'    => $faker->randomNumber(4),
//        'no_santn_latrine_male_staff'    => $faker->randomNumber(4),
//        'no_santn_latrine_female_staff'    => $faker->randomNumber(4),
//        'no_santn_latrine_mixed_staff'    => $faker->randomNumber(4),
//        'no_santn_latrine_non_functional'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_blocks'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_stances'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_patient_female_stances'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_female_staff'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_mixed_staff'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_functional'    => $faker->randomNumber(4),
//        'no_santn_female_change_rm_non_functional'    => $faker->randomNumber(4),
//        'are_health_disabled_toilets'   => $faker->randomElement($bolean),
//        'if_yes_method_of_access'   => $faker->randomElement($accessMethods),
//        'no_borehole'   => $faker->randomNumber(1),
//        'no_borehole_functional'   => $faker->randomNumber(1),
//        'no_borehole_none_functional'   => $faker->randomNumber(1),
//        'no_tap'   => $faker->randomNumber(1),
//        'no_tap_functional'   => $faker->randomNumber(1),
//        'no_tap_none_functional'   => $faker->randomNumber(1),
//        'no_water_tank'   => $faker->randomNumber(1),
//        'no_water_tank_functional'   => $faker->randomNumber(1),
//        'no_water_tank_none_functional'   => $faker->randomNumber(1),
//        'no_others'   => $faker->randomNumber(1),
//        'no_others_functional'   => $faker->randomNumber(1),
//        'no_others_none_functional'   => $faker->randomNumber(1),
//        'is_water_accessible_to_pwds'   => $faker->randomElement($bolean),
//        'is_water_point_within'   => $faker->randomElement($bolean),
//        'if_not_within_how_far' => $faker->sentence(2),
//        'is_handwashing_facility'   => $faker->randomElement($bolean),
//        'is_health_unit_mgt_commit' => $faker->randomElement($bolean),
//        'if_yes_meeting_frequency'  => $faker->sentence(2),
//        'last_visit_by_health_inspector' => $faker->date('Y-m-d'),
//        'medical_staff_ceiling' => $faker->randomNumber(2),
//        'medical_staff_total' => $faker->randomNumber(2),
//        'medical_staff_present' => $faker->randomNumber(2),
//        'non_medical_staff_ceiling' => $faker->randomNumber(2),
//        'non_medical_staff_total' => $faker->randomNumber(2),
//        'non_medical_staff_present' => $faker->randomNumber(2),
//        'reason_for_absent_staff'   => $faker->sentence(4),
//        'last_date_staff_perfomance_appraisal' => $faker->date('Y-m-d'),
//        'no_of_staff_appraised' => $faker->randomNumber(3),
//        'received_medical_supplies_from_nms' => $faker->randomElement($bolean),
//        'if_yes_date'   => $faker->randomNumber(4),
//        'essential_drugs'   => [
//        [
//        'name' => $faker->sentence(2),
//        'stock_required' => $faker->randomNumber(4)
//        ],
//        [
//        'name' => $faker->sentence(2),
//        'stock_required' => $faker->randomNumber(4)
//        ],
//        [
//        'name' => $faker->sentence(2),
//        'stock_required' => $faker->randomNumber(4)
//        ],
//        [
//        'name' => $faker->sentence(2),
//        'stock_required' => $faker->randomNumber(4)
//        ],
//        [
//        'name' => $faker->sentence(2),
//        'stock_required' => $faker->randomNumber(4)
//        ],
//        ],
//        'when_last_drugs_consgmt_finished' => $faker->date('Y-m-d'),
//        'no_medical_equip_bought' => $faker->randomNumber(4),
//        'is_ambulance'  => $faker->randomElement($bolean),
//        'if_no_how_referrals_handled' => $faker->randomNumber(3),
//        'other_observations' => $faker->sentence(2)
//        ];