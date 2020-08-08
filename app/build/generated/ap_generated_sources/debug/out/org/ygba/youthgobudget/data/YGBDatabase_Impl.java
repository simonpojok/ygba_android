package org.ygba.youthgobudget.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureDao_Impl;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationFormDao;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationFormDao_Impl;
import org.ygba.youthgobudget.data.education.EducationQuestionDao;
import org.ygba.youthgobudget.data.education.EducationQuestionDao_Impl;
import org.ygba.youthgobudget.data.health.HealthQuestionDao;
import org.ygba.youthgobudget.data.health.HealthQuestionDao_Impl;
import org.ygba.youthgobudget.data.helpers.district.DistrictDao;
import org.ygba.youthgobudget.data.helpers.district.DistrictDao_Impl;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCountyDao;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCountyDao_Impl;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentDao;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentDao_Impl;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestionDao;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestionDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class YGBDatabase_Impl extends YGBDatabase {
  private volatile AgricultureDao _agricultureDao;

  private volatile SocialDevelopmentDao _socialDevelopmentDao;

  private volatile EducationQuestionDao _educationQuestionDao;

  private volatile WaterEnvironmentQuestionDao _waterEnvironmentQuestionDao;

  private volatile BudgetInformationFormDao _budgetInformationFormDao;

  private volatile HealthQuestionDao _healthQuestionDao;

  private volatile DistrictDao _districtDao;

  private volatile SubCountyDao _subCountyDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `agric` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fy` TEXT, `date` TEXT, `village` TEXT, `parish` TEXT, `sub_county` TEXT, `name` TEXT, `tel` TEXT, `num` TEXT, `q1o` TEXT, `q1reason` TEXT, `q2ext` TEXT, `q2extreceived` TEXT, `q2dateextReceived` TEXT, `q2extdatewithdrawn` TEXT, `q2devexp` TEXT, `q2devrecieved` TEXT, `q2devdaterecieved` TEXT, `q2devdatewithdrawn` TEXT, `q2_1` TEXT, `q2_2` TEXT, `q2_3` TEXT, `q2_4` TEXT, `q2_5` TEXT, `q3_1` TEXT, `q3_2_num` TEXT, `q3_3_mention` TEXT, `q3_4_male` TEXT, `q3_4_female` TEXT, `q3_5_reason` TEXT, `q4_1_inputs` TEXT, `q4_2_input_1` TEXT, `q4_2_date_1` TEXT, `q4_2_male_number_1` TEXT, `q4_2_female_number_1` TEXT, `q4_2_village_1` TEXT, `q4_2_input_2` TEXT, `q4_2_date_2` TEXT, `q4_2_male_number_2` TEXT, `q4_2_female_number_2` TEXT, `q4_2_village_2` TEXT, `q4_2_input_3` TEXT, `q4_2_date_3` TEXT, `q4_2_male_number_3` TEXT, `q4_2_female_number_3` TEXT, `q4_2_village_3` TEXT, `q4_2_input_4` TEXT, `q4_2_date_4` TEXT, `q4_2_male_number_4` TEXT, `q4_2_female_number_4` TEXT, `q4_2_village_4` TEXT, `q4_2_input_5` TEXT, `q4_2_date_5` TEXT, `q4_2_male_number_5` TEXT, `q4_2_female_number_5` TEXT, `q4_2_village_5` TEXT, `q4_3_reason` TEXT, `q4_3_any_other_reason` TEXT, `locally` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `educ_table` (`primary_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `financial_year` TEXT, `date` TEXT, `district` TEXT, `village` TEXT, `parish` TEXT, `division` TEXT, `full_names` TEXT, `tel` TEXT, `question_1_answer` TEXT, `question_2_school_name` TEXT, `question_2_male_teachers` INTEGER NOT NULL, `question_2_fe_male` INTEGER NOT NULL, `male_pwds_teachers_q2` INTEGER NOT NULL, `female_pwd_teachers_q2` INTEGER NOT NULL, `teachers_total` INTEGER NOT NULL, `question_2_male_PupilEnrollment` INTEGER NOT NULL, `question_2_fe_male_PupilEnrollment` INTEGER NOT NULL, `male_pwds_PupilEnrollment_q2` INTEGER NOT NULL, `female_pwd_PupilEnrollment_q2` INTEGER NOT NULL, `PupilEnrollment_toatl` INTEGER NOT NULL, `num_p7_male_q2` INTEGER NOT NULL, `q2_n_7_female` INTEGER NOT NULL, `q_2_n_m_pwd` INTEGER NOT NULL, `q_2_f_p_7_pwd` INTEGER NOT NULL, `question_2_total_p7` INTEGER NOT NULL, `q2_n_d_o_male` INTEGER NOT NULL, `q_2_n_drop_female` INTEGER NOT NULL, `pwd_2_male_drop_out` INTEGER NOT NULL, `pwd_2_female_dropout_2` INTEGER NOT NULL, `total_dropout_q2` INTEGER NOT NULL, `question_2_drop_out_reasons_if_any` TEXT, `question_3_capital_grants_approved` INTEGER NOT NULL, `question_3_capital_grant_released_budget` INTEGER NOT NULL, `questions_3_date_received_capital` TEXT, `question_3_date_withdrawn_capital` TEXT, `question_3_sfg_approved_budget` INTEGER NOT NULL, `question_3_sfg_budget_received` INTEGER NOT NULL, `question_3_date_received_sfg` TEXT, `question_3_sfg_date_withdrawn` TEXT, `question_3_1_information_notice_board_displayed` INTEGER NOT NULL, `question_3_displayed_head_teacher_office` INTEGER NOT NULL, `question_3_1_information_staff_room` INTEGER NOT NULL, `question_3_2_information_not_displayed` INTEGER NOT NULL, `question_3_2_statement_period` TEXT, `question_grade_1_male_number` INTEGER NOT NULL, `question_grade_2_male_number` INTEGER NOT NULL, `question_grade_3_male_number` INTEGER NOT NULL, `question_grade_4_male_number` INTEGER NOT NULL, `question_grade_1_female_number` INTEGER NOT NULL, `question_grade_2_female_number` INTEGER NOT NULL, `question_grade_3_female_number` INTEGER NOT NULL, `question_grade_4_female_number` INTEGER NOT NULL, `question_4_1_current_performance` TEXT, `question_4_2_attribute_reason` TEXT, `question_5_toilet_blocks` INTEGER NOT NULL, `question_5_toilet_stances` INTEGER NOT NULL, `question_5_male_stances_pupil` INTEGER NOT NULL, `question_5_toilet_female_stances_pupil` INTEGER NOT NULL, `question_5_toilet_male_stances_teacher` INTEGER NOT NULL, `question_5_toilet_female_number_stance_teacher` INTEGER NOT NULL, `question_5_mixed_stances_number_toilet` INTEGER NOT NULL, `question_5_toilet_function` INTEGER NOT NULL, `question_5_toilet_none_functional` INTEGER NOT NULL, `question_5_number_blocks_latrine` INTEGER NOT NULL, `question_5_number_latrine_stances` INTEGER NOT NULL, `question_5_latrine_number_instances_male_pupil` INTEGER NOT NULL, `question_5_number_stances_female_stances_female` INTEGER NOT NULL, `question_5_number_stances_male_teachers` INTEGER NOT NULL, `question_5_number_stances_female_teachers` INTEGER NOT NULL, `question_5_latrine_mixed_teachers` INTEGER NOT NULL, `question_5_latrine_functional` INTEGER NOT NULL, `question_5_latrine_none_functional` INTEGER NOT NULL, `question_5_vip_latrine_num_ber_blocks` INTEGER NOT NULL, `quest_ion_5_vip_latrine_number_stances` INTEGER NOT NULL, `question_5_vip_nu_mber_latrine_male_pupil_stances` INTEGER NOT NULL, `question_5_vip_num_ber_stance_pupil_female` INTEGER NOT NULL, `question_5_vip_number_stances_ma_le_teacher` INTEGER NOT NULL, `question_5_vip_number_stances_female_teacher_p` INTEGER NOT NULL, `question_5_vip_numbe_r_stances_mixed_teachers` INTEGER NOT NULL, `question_5_latr_ine_functional` INTEGER NOT NULL, `question_5_latrine_none_functional_vip` INTEGER NOT NULL, `question_5_female_changing_block_number` INTEGER NOT NULL, `question_5_female_changing_block_stances  ` INTEGER NOT NULL, `question_5_female_changing_female_stances` INTEGER NOT NULL, `question_5_female_changing_room_female_teacher` INTEGER NOT NULL, `question_5_female_changing_mixed_teachers` INTEGER NOT NULL, `question_5_female_changing_room_functioal` INTEGER NOT NULL, `question_question_5_female_changing_none_functional` INTEGER NOT NULL, `question_5_uirinals_for_boys_block_number` INTEGER NOT NULL, `question_urinals_number_stances` INTEGER NOT NULL, `question_5_urinals_for_boys_number_stances_teachers` INTEGER NOT NULL, `question_5_urinals_for_boys_mixed_teachers` INTEGER NOT NULL, `question_5_urinals_for_boys_functional` INTEGER NOT NULL, `question_5_urinals_for_boys_none_functional` INTEGER NOT NULL, `question_5_boys_satnces` INTEGER NOT NULL, `QUESTION_5_1_TOILET_ACCESSIBLE` INTEGER NOT NULL, `QUESTION_5_3_FUNCTIONAL_OBJECTIVE` INTEGER NOT NULL, `QUESTION_5_3_FUNCTIONAL_WATER_POINT_REASON_IF_NO` TEXT, `QUESTION_6_1_PERMANENT_CLASS_ROOM` INTEGER NOT NULL, `QUESTION_6_1_NUMBER_OF_DESK` INTEGER NOT NULL, `QUESTION_6_3_PUPIL_DESK_RATIO` TEXT, `QUESTION_7_0_NUMBER_MALE_TEACHER_ENROLLED` INTEGER NOT NULL, `QUESTION_7_0_NUMBER_OF_FEMALE_TEACHER_ENROLLED` INTEGER NOT NULL, `QUESTION_7_0_NUMBER_OF_TEACHER_PAYROLL` INTEGER NOT NULL, `QUESTION_7_0_NUMBER_OF_TEACHERS_PRESENT` INTEGER NOT NULL, `QUESTION_7_0_NUMBER_TEACHERS_PRESENT_FEMALE` INTEGER NOT NULL, `QUESTION_7_1_TEACHER_PUPIL_RATIO` TEXT, `QUESTION_7_2_SENIOR_WOMAN_TEACHER` INTEGER NOT NULL, `_SWT_OFFER_SUPPORT)\n"
                + "` TEXT, `QUESTION_8_0_HOW_OFTEN_INSPECTOR_VISIT_SCHOOL` TEXT, `QUESTION_8_2_LAST_TIME_INSPECTOR_VISIT` TEXT, `QUESTION_8_3_SCHOOL_HAVE_SCHOOL_MANAGEMENT_COMMITTEE` INTEGER NOT NULL, `QUESTION_8_4_HOW_OFTEN_SMC_MEET` TEXT, `QUESTION_8_5_IS_SMC_TRAINED` TEXT, `QUESTION_8_OBERSAVATIONS_OR_CHALLENGES` TEXT, `QUESTION_8_IS_STORED_LOCALLY` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `social_dev` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `financial_year` TEXT, `date` TEXT, `district` TEXT, `village` TEXT, `parish` TEXT, `division` TEXT, `agent_name` TEXT, `tel` TEXT, `q2_com_expec` REAL NOT NULL, `q2_com_received` REAL NOT NULL, `q2_com_date_received` TEXT, `q2_com_date_withdrawn` TEXT, `q2_others_expected` REAL NOT NULL, `q2_others_amount_received` REAL NOT NULL, `q2_others_date_received` TEXT, `q2_others_date_withdrawn` TEXT, `q3_w_e_objective` INTEGER NOT NULL, `q3_w_e_objective_reason` TEXT, `q3_w_g_1_name` TEXT, `q3_w_g_1_village` TEXT, `q3_w_g_1_m_numbers` INTEGER NOT NULL, `q3_w_g_1_f_numbers` INTEGER NOT NULL, `q3_w_g_1_a_received` REAL NOT NULL, `q3_w_g_2_name` TEXT, `q3_w_g_2_village` TEXT, `q3_w_g_2_m_numbers` INTEGER NOT NULL, `q3_w_g_2_f_numbers` INTEGER NOT NULL, `q3_w_g_2_a_received` REAL NOT NULL, `q3_w_g_3_name` TEXT, `q3_w_g_3_village` TEXT, `q3_w_g_3_m_numbers` INTEGER NOT NULL, `q3_w_g_3_f_numbers` INTEGER NOT NULL, `q3_w_g_3_a_received` REAL NOT NULL, `q3_w_g_4_name` TEXT, `q3_w_g_4_village` TEXT, `q3_w_g_4_m_numbers` INTEGER NOT NULL, `q3_w_g_4_f_numbers` INTEGER NOT NULL, `q3_w_g_4_a_received` REAL NOT NULL, `q3_w_g_5_name` TEXT, `q3_w_g_5_village` TEXT, `q3_w_g_5_m_numbers` INTEGER NOT NULL, `q3_w_g_5_f_numbers` INTEGER NOT NULL, `q3_w_g_5_a_received` REAL NOT NULL, `q3_w_g_6_name` TEXT, `q3_w_g_6_village` TEXT, `q3_w_g_6_m_numbers` INTEGER NOT NULL, `q3_w_g_6_f_numbers` INTEGER NOT NULL, `q3_w_g_6_a_received` REAL NOT NULL, `q3_w_g_7_name` TEXT, `q3_w_g_7_village` TEXT, `q3_w_g_7_m_numbers` INTEGER NOT NULL, `q3_w_g_7_f_numbers` INTEGER NOT NULL, `q3_w_g_7_a_received` REAL NOT NULL, `q5_li_obj` INTEGER NOT NULL, `q5_li_obj_reason` TEXT, `q4_y_g_1_name` TEXT, `q4_Y_g_1_village` TEXT, `q4_Y_g_1_m_numbers` INTEGER NOT NULL, `q4_Y_g_1_f_numbers` INTEGER NOT NULL, `q4_Y_g_1_a_received` REAL NOT NULL, `q4_Y_g_2_name` TEXT, `q4_Y_g_2_village` TEXT, `q4_Y_g_2_m_numbers` INTEGER NOT NULL, `q4_Y_g_2_f_numbers` INTEGER NOT NULL, `q4_Y_g_2_a_received` REAL NOT NULL, `q4_Y_g_3_name` TEXT, `q4_Y_g_3_village` TEXT, `q4_Y_g_3_m_numbers` INTEGER NOT NULL, `q4_4_g_3_f_numbers` INTEGER NOT NULL, `q4_Y_g_3_a_received` REAL NOT NULL, `q4_Y_g_4_name` TEXT, `q4_Y_g_4_village` TEXT, `q4_Y_g_4_m_numbers` INTEGER NOT NULL, `q4_Y_g_4_f_numbers` INTEGER NOT NULL, `q4_Y_g_4_a_received` REAL NOT NULL, `q4_Y_g_5_name` TEXT, `q4_Y_g_5_village` TEXT, `q4_Y_g_5_m_numbers` INTEGER NOT NULL, `q4_Y_g_5_f_numbers` INTEGER NOT NULL, `q4_Y_g_5_a_received` REAL NOT NULL, `q4_6_g_6_name` TEXT, `q5_Y_g_6_village` TEXT, `q4_Y_g_6_m_numbers` INTEGER NOT NULL, `Q4_Y_g_6_f_numbers` INTEGER NOT NULL, `q4_Y_g_6_a_received` REAL NOT NULL, `q4_Y_g_7_name` TEXT, `q4_Y_g_7_village` TEXT, `q4_Y_g_7_m_numbers` INTEGER NOT NULL, `q4_Y_g_7_f_numbers` INTEGER NOT NULL, `q4_Y_g_7_a_received` REAL NOT NULL, `q5_number_m_trained` INTEGER NOT NULL, `q5_number_f_trained` INTEGER NOT NULL, `q6_com_g_formed` TEXT, `q7_others_challenges` TEXT, `locally_stored` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `water_and_env` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `financial_year` TEXT, `date` TEXT, `district` TEXT, `village` TEXT, `parish` TEXT, `sub_county` TEXT, `agent_name` TEXT, `agent_tel` TEXT, `q_1_objective` INTEGER NOT NULL, `q_1_reason` TEXT, `q_2_reason` TEXT, `q_4_answer` TEXT, `q_3_objective` INTEGER NOT NULL, `q_5_text` TEXT, `q_5_sub_1` TEXT, `q_5_ws_1` TEXT, `q_5_functional_1` INTEGER NOT NULL, `q_5_none_functional_1` INTEGER NOT NULL, `q_5_no_ws_available_1` INTEGER NOT NULL, `q_5_sub_2` TEXT, `q_5_ws_2` TEXT, `q_5_functional_2` INTEGER NOT NULL, `q_5_none_functional_2` INTEGER NOT NULL, `q_5_no_ws_available_2` INTEGER NOT NULL, `q_5_sub_3` TEXT, `q_5_ws_3` TEXT, `q_5_functional_3` INTEGER NOT NULL, `q_5_none_functional_3` INTEGER NOT NULL, `q_5_no_ws_available_3` INTEGER NOT NULL, `q_5_sub_4` TEXT, `q_5_ws_4` TEXT, `q_5_functional_4` INTEGER NOT NULL, `q_5_none_functional_4` INTEGER NOT NULL, `q_5_no_ws_available_4` INTEGER NOT NULL, `q_5_sub_5` TEXT, `q_5_ws_5` TEXT, `q_5_functional_5` INTEGER NOT NULL, `q_5_none_functional_5` INTEGER NOT NULL, `q_5_no_ws_available_5` INTEGER NOT NULL, `q_5_sub_6` TEXT, `q_5_ws_6` TEXT, `q_5_functional_6` INTEGER NOT NULL, `q_5_none_functional_6` INTEGER NOT NULL, `q_5_no_ws_available_6` INTEGER NOT NULL, `q_5_objective` INTEGER NOT NULL, `q_5_objective_reason` TEXT, `q_6_wetland_demarcated` TEXT, `q_6_village_name_1` TEXT, `q_6_1_wetland_1` INTEGER NOT NULL, `q_6_village_name_2` TEXT, `q_6_1_wetland_2` INTEGER NOT NULL, `q_6_village_name_3` TEXT, `q_6_1_wetland_3` INTEGER NOT NULL, `q_6_village_name_4` TEXT, `q_6_1_wetland_4` INTEGER NOT NULL, `q_6_village_name_5` TEXT, `q_6_1_wetland_5` INTEGER NOT NULL, `q_6_village_name_6` TEXT, `q_6_1_wetland_6` INTEGER NOT NULL, `q_6_2_tree_planting` TEXT, `locally_stored` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `budget_information` (`primary_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fin_year` TEXT, `admin_approved` INTEGER NOT NULL, `admin_percentage` INTEGER NOT NULL, `fin_approved` INTEGER NOT NULL, `fin_percentage` INTEGER NOT NULL, `statu_approved` INTEGER NOT NULL, `statu_per` INTEGER NOT NULL, `pro_approved` INTEGER NOT NULL, `pro_perc` INTEGER NOT NULL, `health_approved` INTEGER NOT NULL, `health_percentage` INTEGER NOT NULL, `education_approved` INTEGER NOT NULL, `education_percentage` INTEGER NOT NULL, `road_approved` INTEGER NOT NULL, `road_percentagae` INTEGER NOT NULL, `water_approved` INTEGER NOT NULL, `water_percentage` INTEGER NOT NULL, `natural_approved` INTEGER NOT NULL, `natural_percentage` INTEGER NOT NULL, `com_approved` INTEGER NOT NULL, `com_percentage` INTEGER NOT NULL, `planning_approved` INTEGER NOT NULL, `planning_percentage` INTEGER NOT NULL, `internal_audit` INTEGER NOT NULL, `internal_percentage` INTEGER NOT NULL, `trade_approved` INTEGER NOT NULL, `trade_percentage` INTEGER NOT NULL, `total_approved` INTEGER NOT NULL, `total_percentage` INTEGER NOT NULL, `wage_approved_b` INTEGER NOT NULL, `wage_approved_a` INTEGER NOT NULL, `none_wage_approved_d` INTEGER NOT NULL, `none_wage_perce` INTEGER NOT NULL, `domestic_approved` INTEGER NOT NULL, `domestic_percentage` INTEGER NOT NULL, `ext_approved` INTEGER NOT NULL, `ext_percentage` INTEGER NOT NULL, `dis_name` TEXT, `service_name` TEXT, `com_wish_name` TEXT, `dis_1_sector` INTEGER NOT NULL, `sub_1_sect` INTEGER NOT NULL, `fin_1_sec` TEXT, `service_1_sector` TEXT, `community_wishes_1` TEXT, `dis_2_sector` INTEGER NOT NULL, `sub_2_sect` INTEGER NOT NULL, `fin_2_sec` TEXT, `service_2_sector` TEXT, `community_wishes_2` TEXT, `dis_3_sector` INTEGER NOT NULL, `sub_3_sect` INTEGER NOT NULL, `fin_3_sec` TEXT, `service_3_sector` TEXT, `community_wishes_3` TEXT, `dis_4_sector` INTEGER NOT NULL, `sub_4_sect` INTEGER NOT NULL, `fin_4_sec` TEXT, `service_4_sector` TEXT, `community_wishes_4` TEXT, `dis_5_sector` INTEGER NOT NULL, `sub_5_sect` INTEGER NOT NULL, `fin_5_sec` TEXT, `service_5_sector` TEXT, `community_wishes_5` TEXT, `dis_6_sector` INTEGER NOT NULL, `sub_6_sect` INTEGER NOT NULL, `fin_6_sec` TEXT, `service_6_sector` TEXT, `community_wishes_6` TEXT, `dis_7_sector` INTEGER NOT NULL, `sub_7_sect` INTEGER NOT NULL, `fin_7_sec` TEXT, `service_7_sector` TEXT, `community_wishes_7` TEXT, `stored_locally` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `health_table` (`primary_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `financial_year` TEXT, `quarter` TEXT, `date` TEXT, `district_name` TEXT, `village` TEXT, `parish` TEXT, `town_council` TEXT, `name_monitor_agent` TEXT, `tell_number` TEXT, `question_a_health` TEXT, `question_b` INTEGER NOT NULL, `question_c_in_patients` INTEGER NOT NULL, `question_1_re_approved_budget` INTEGER NOT NULL, `question_1_budget_received` INTEGER NOT NULL, `question_1_re_date_received` TEXT, `question_1_rec_date_withdrawn` TEXT, `dev_1_approved_budget` INTEGER NOT NULL, `question_1_deve_1_bud_re` INTEGER NOT NULL, `question_1_development_1_date_recieved` TEXT, `question_1_development_date_withdrawn` TEXT, `question_1_1_display_area` TEXT, `question_1_2_display_reason` TEXT, `maternity_yes_no` INTEGER NOT NULL, `general_ward_yes_no` INTEGER NOT NULL, `delivery_beds_yes_no` INTEGER NOT NULL, `family_planning_yes_no` INTEGER NOT NULL, `hiv_yes_no` INTEGER NOT NULL, `question_pmtctc_yes_no` INTEGER NOT NULL, `immunization_yes_no` INTEGER NOT NULL, `youth_corners_yes_no` INTEGER NOT NULL, `hep_2_b` INTEGER NOT NULL, `live_number_deliveries` INTEGER NOT NULL, `number_still_number` INTEGER NOT NULL, `question_2_2_children_number` INTEGER NOT NULL, `question_3_0_number_blocks_toilet` INTEGER NOT NULL, `question_3_0_number_stances_toilet` INTEGER NOT NULL, `question_male_number_patient_stances` INTEGER NOT NULL, `Q3_0_F_stancies` INTEGER NOT NULL, `QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES` INTEGER NOT NULL, `QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES` INTEGER NOT NULL, `wwrbbjnjiouydyhddvsvhsfdfgsdfgsddff` INTEGER NOT NULL, `QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_BLOCKS` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_3_0_FCM_NUMBER_BLOCKS` INTEGER NOT NULL, `QUESTION_3_0_FCM_NUMBER_STANCES` INTEGER NOT NULL, `QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES` INTEGER NOT NULL, `QUESTION_3_0_FCM_STAFF_NUMBER_STANCES` INTEGER NOT NULL, `QUESTION_3_0_FCR_STAFF_MIXED_STANCES` INTEGER NOT NULL, `QUESTION_3_0_FCR_FUNCTION` INTEGER NOT NULL, `QUESTION_3_0_FCR_NONE_FUNCTION` INTEGER NOT NULL, `QUESTION_3_0_FCR_REASON_PWD_FRIENDLY` TEXT, `QUESTION_3_1_HEALTH_FACILITY_FACILITIES` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_BORE_HOLE` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_TOP` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_TOP_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_TOP_NONE_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_WATER_TANK` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_WATER_TANK_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_WATER_TANK_NONE_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NAME_OF_OTHERS` TEXT, `QUESTION_4_NUMBER_OF_OTHERS` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_OTHERS_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_NUMBER_OF_OTHERS_NONE_FUNCTIONAL` INTEGER NOT NULL, `QUESTION_4_1_POIN_ACCESSIBLE_PWD` INTEGER NOT NULL, `QUESTION_4_3_FUNCTIONAL_WATER_POINT` INTEGER NOT NULL, `QUESTION_4_3_OBJECTIVE_REASON` TEXT, `QUESTION_4_4_HAND_WASHING_INSTALLED` INTEGER NOT NULL, `QUESTION_5_1_HEALTH_UNIT_MANAGEMENT_COMMITTE` INTEGER NOT NULL, `QUESTION_5_2_HOW_OFTEN_THEY_MEET` TEXT, `QUESTION_5_3_LAST_SUPPORT_SUPERVISOR_VISIT` TEXT, `QUESTION_6_MEDICAL_STAFF_CEILING_NUMBER` INTEGER NOT NULL, `QUESTION_6_MEDICAL_TOTAL_NUMBER_STAFF` INTEGER NOT NULL, `QUESTION_6_MEDICAL_NUMBER_STAFF_PRESENT` INTEGER NOT NULL, `QUESTION_6_NONE_MEDICAL_STAFF_CEILING_NUMBER` INTEGER NOT NULL, `QUESTION_6_NONE_MEDICAL_TOTAL_NUMBER_STAFF` INTEGER NOT NULL, `QUESTION_6_NONE_MEDICAL_STAFF_PRESENT` INTEGER NOT NULL, `QUESTION_6_REASON_FOR_ABSENCE` TEXT, `QUESTION_6_LAST_DATE_OF_APPRAISAL` TEXT, `QUESTION_6_NUMBER_OFF_STAFF_APPRAISED` INTEGER NOT NULL, `QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY` INTEGER NOT NULL, `QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY_IF_NO` TEXT, `QUESTION_7_2_ESSENTIAL_DRUG_1_NAME` TEXT, `QUESTION_7_2_ESSENTIAL_DRUG_1_REQUIRED_STOCK` INTEGER NOT NULL, `QUESTION_7_2_ESSENTIAL_DRUG_2_NAME` TEXT, `QUESTION_7_2_ESSENTIAL_DRUG_2_REQUIRED_STOCK` INTEGER NOT NULL, `QUESTION_7_2_ESSENTIAL_DRUG_3_NAME` TEXT, `QUESTION_7_2_ESSENTIAL_DRUG_3_REQUIRED_STOCK` INTEGER NOT NULL, `QUESTION_7_2_ESSENTIAL_DRUG_4_NAME` TEXT, `QUESTION_7_2_ESSENTIAL_DRUG_4_REQUIRED_STOCK` INTEGER NOT NULL, `QUESTION_7_2_ESSENTIAL_DRUG_5_NAME` TEXT, `QUESTION_7_2_ESSENTIAL_DRUG_5_REQUIRED_STOCK` INTEGER NOT NULL, `QUESTION_7_3_HC_LAST_DRUGS_CONSIGNMENT` TEXT, `QUESTION_7_4_NUMBER_MEDICAL_EQUIPMENT_BOUGHT` INTEGER NOT NULL, `QUESTION_7_5_AMBULANCE` INTEGER NOT NULL, `QUESTION_7_6_REFERRALS_HANDLED` TEXT, `QUESTION_8_0_OBSERVATIONS_AND_CHALLENGES` TEXT, `IS_LOCALLY_STORED` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `district_table` (`primary_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `district` TEXT, `region` TEXT, `region_id` INTEGER NOT NULL, `id` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `sub_county` (`primary_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `district_name` TEXT, `district` INTEGER NOT NULL, `sub_county` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '458e996b72b4f579bb95ffef17d707ff')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `agric`");
        _db.execSQL("DROP TABLE IF EXISTS `educ_table`");
        _db.execSQL("DROP TABLE IF EXISTS `social_dev`");
        _db.execSQL("DROP TABLE IF EXISTS `water_and_env`");
        _db.execSQL("DROP TABLE IF EXISTS `budget_information`");
        _db.execSQL("DROP TABLE IF EXISTS `health_table`");
        _db.execSQL("DROP TABLE IF EXISTS `district_table`");
        _db.execSQL("DROP TABLE IF EXISTS `sub_county`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAgric = new HashMap<String, TableInfo.Column>(59);
        _columnsAgric.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("fy", new TableInfo.Column("fy", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("sub_county", new TableInfo.Column("sub_county", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("tel", new TableInfo.Column("tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("num", new TableInfo.Column("num", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q1o", new TableInfo.Column("q1o", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q1reason", new TableInfo.Column("q1reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2ext", new TableInfo.Column("q2ext", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2extreceived", new TableInfo.Column("q2extreceived", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2dateextReceived", new TableInfo.Column("q2dateextReceived", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2extdatewithdrawn", new TableInfo.Column("q2extdatewithdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devexp", new TableInfo.Column("q2devexp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devrecieved", new TableInfo.Column("q2devrecieved", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devdaterecieved", new TableInfo.Column("q2devdaterecieved", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devdatewithdrawn", new TableInfo.Column("q2devdatewithdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_1", new TableInfo.Column("q2_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_2", new TableInfo.Column("q2_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_3", new TableInfo.Column("q2_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_4", new TableInfo.Column("q2_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_5", new TableInfo.Column("q2_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_1", new TableInfo.Column("q3_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_2_num", new TableInfo.Column("q3_2_num", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_3_mention", new TableInfo.Column("q3_3_mention", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_4_male", new TableInfo.Column("q3_4_male", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_4_female", new TableInfo.Column("q3_4_female", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_5_reason", new TableInfo.Column("q3_5_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_1_inputs", new TableInfo.Column("q4_1_inputs", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_1", new TableInfo.Column("q4_2_input_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_1", new TableInfo.Column("q4_2_date_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_1", new TableInfo.Column("q4_2_male_number_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_1", new TableInfo.Column("q4_2_female_number_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_1", new TableInfo.Column("q4_2_village_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_2", new TableInfo.Column("q4_2_input_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_2", new TableInfo.Column("q4_2_date_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_2", new TableInfo.Column("q4_2_male_number_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_2", new TableInfo.Column("q4_2_female_number_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_2", new TableInfo.Column("q4_2_village_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_3", new TableInfo.Column("q4_2_input_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_3", new TableInfo.Column("q4_2_date_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_3", new TableInfo.Column("q4_2_male_number_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_3", new TableInfo.Column("q4_2_female_number_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_3", new TableInfo.Column("q4_2_village_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_4", new TableInfo.Column("q4_2_input_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_4", new TableInfo.Column("q4_2_date_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_4", new TableInfo.Column("q4_2_male_number_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_4", new TableInfo.Column("q4_2_female_number_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_4", new TableInfo.Column("q4_2_village_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_5", new TableInfo.Column("q4_2_input_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_5", new TableInfo.Column("q4_2_date_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_5", new TableInfo.Column("q4_2_male_number_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_5", new TableInfo.Column("q4_2_female_number_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_5", new TableInfo.Column("q4_2_village_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_3_reason", new TableInfo.Column("q4_3_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_3_any_other_reason", new TableInfo.Column("q4_3_any_other_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("locally", new TableInfo.Column("locally", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAgric = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAgric = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAgric = new TableInfo("agric", _columnsAgric, _foreignKeysAgric, _indicesAgric);
        final TableInfo _existingAgric = TableInfo.read(_db, "agric");
        if (! _infoAgric.equals(_existingAgric)) {
          return new RoomOpenHelper.ValidationResult(false, "agric(org.ygba.youthgobudget.data.agriculture.AgricultureQuestion).\n"
                  + " Expected:\n" + _infoAgric + "\n"
                  + " Found:\n" + _existingAgric);
        }
        final HashMap<String, TableInfo.Column> _columnsEducTable = new HashMap<String, TableInfo.Column>(117);
        _columnsEducTable.put("primary_key", new TableInfo.Column("primary_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("financial_year", new TableInfo.Column("financial_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("division", new TableInfo.Column("division", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("full_names", new TableInfo.Column("full_names", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("tel", new TableInfo.Column("tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_1_answer", new TableInfo.Column("question_1_answer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_school_name", new TableInfo.Column("question_2_school_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_male_teachers", new TableInfo.Column("question_2_male_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_fe_male", new TableInfo.Column("question_2_fe_male", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("male_pwds_teachers_q2", new TableInfo.Column("male_pwds_teachers_q2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("female_pwd_teachers_q2", new TableInfo.Column("female_pwd_teachers_q2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("teachers_total", new TableInfo.Column("teachers_total", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_male_PupilEnrollment", new TableInfo.Column("question_2_male_PupilEnrollment", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_fe_male_PupilEnrollment", new TableInfo.Column("question_2_fe_male_PupilEnrollment", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("male_pwds_PupilEnrollment_q2", new TableInfo.Column("male_pwds_PupilEnrollment_q2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("female_pwd_PupilEnrollment_q2", new TableInfo.Column("female_pwd_PupilEnrollment_q2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("PupilEnrollment_toatl", new TableInfo.Column("PupilEnrollment_toatl", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("num_p7_male_q2", new TableInfo.Column("num_p7_male_q2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("q2_n_7_female", new TableInfo.Column("q2_n_7_female", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("q_2_n_m_pwd", new TableInfo.Column("q_2_n_m_pwd", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("q_2_f_p_7_pwd", new TableInfo.Column("q_2_f_p_7_pwd", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_total_p7", new TableInfo.Column("question_2_total_p7", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("q2_n_d_o_male", new TableInfo.Column("q2_n_d_o_male", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("q_2_n_drop_female", new TableInfo.Column("q_2_n_drop_female", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("pwd_2_male_drop_out", new TableInfo.Column("pwd_2_male_drop_out", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("pwd_2_female_dropout_2", new TableInfo.Column("pwd_2_female_dropout_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("total_dropout_q2", new TableInfo.Column("total_dropout_q2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_2_drop_out_reasons_if_any", new TableInfo.Column("question_2_drop_out_reasons_if_any", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_capital_grants_approved", new TableInfo.Column("question_3_capital_grants_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_capital_grant_released_budget", new TableInfo.Column("question_3_capital_grant_released_budget", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("questions_3_date_received_capital", new TableInfo.Column("questions_3_date_received_capital", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_date_withdrawn_capital", new TableInfo.Column("question_3_date_withdrawn_capital", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_sfg_approved_budget", new TableInfo.Column("question_3_sfg_approved_budget", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_sfg_budget_received", new TableInfo.Column("question_3_sfg_budget_received", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_date_received_sfg", new TableInfo.Column("question_3_date_received_sfg", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_sfg_date_withdrawn", new TableInfo.Column("question_3_sfg_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_1_information_notice_board_displayed", new TableInfo.Column("question_3_1_information_notice_board_displayed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_displayed_head_teacher_office", new TableInfo.Column("question_3_displayed_head_teacher_office", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_1_information_staff_room", new TableInfo.Column("question_3_1_information_staff_room", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_2_information_not_displayed", new TableInfo.Column("question_3_2_information_not_displayed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_3_2_statement_period", new TableInfo.Column("question_3_2_statement_period", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_1_male_number", new TableInfo.Column("question_grade_1_male_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_2_male_number", new TableInfo.Column("question_grade_2_male_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_3_male_number", new TableInfo.Column("question_grade_3_male_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_4_male_number", new TableInfo.Column("question_grade_4_male_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_1_female_number", new TableInfo.Column("question_grade_1_female_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_2_female_number", new TableInfo.Column("question_grade_2_female_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_3_female_number", new TableInfo.Column("question_grade_3_female_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_grade_4_female_number", new TableInfo.Column("question_grade_4_female_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_4_1_current_performance", new TableInfo.Column("question_4_1_current_performance", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_4_2_attribute_reason", new TableInfo.Column("question_4_2_attribute_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_blocks", new TableInfo.Column("question_5_toilet_blocks", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_stances", new TableInfo.Column("question_5_toilet_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_male_stances_pupil", new TableInfo.Column("question_5_male_stances_pupil", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_female_stances_pupil", new TableInfo.Column("question_5_toilet_female_stances_pupil", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_male_stances_teacher", new TableInfo.Column("question_5_toilet_male_stances_teacher", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_female_number_stance_teacher", new TableInfo.Column("question_5_toilet_female_number_stance_teacher", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_mixed_stances_number_toilet", new TableInfo.Column("question_5_mixed_stances_number_toilet", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_function", new TableInfo.Column("question_5_toilet_function", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_toilet_none_functional", new TableInfo.Column("question_5_toilet_none_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_number_blocks_latrine", new TableInfo.Column("question_5_number_blocks_latrine", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_number_latrine_stances", new TableInfo.Column("question_5_number_latrine_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_latrine_number_instances_male_pupil", new TableInfo.Column("question_5_latrine_number_instances_male_pupil", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_number_stances_female_stances_female", new TableInfo.Column("question_5_number_stances_female_stances_female", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_number_stances_male_teachers", new TableInfo.Column("question_5_number_stances_male_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_number_stances_female_teachers", new TableInfo.Column("question_5_number_stances_female_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_latrine_mixed_teachers", new TableInfo.Column("question_5_latrine_mixed_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_latrine_functional", new TableInfo.Column("question_5_latrine_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_latrine_none_functional", new TableInfo.Column("question_5_latrine_none_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_vip_latrine_num_ber_blocks", new TableInfo.Column("question_5_vip_latrine_num_ber_blocks", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("quest_ion_5_vip_latrine_number_stances", new TableInfo.Column("quest_ion_5_vip_latrine_number_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_vip_nu_mber_latrine_male_pupil_stances", new TableInfo.Column("question_5_vip_nu_mber_latrine_male_pupil_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_vip_num_ber_stance_pupil_female", new TableInfo.Column("question_5_vip_num_ber_stance_pupil_female", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_vip_number_stances_ma_le_teacher", new TableInfo.Column("question_5_vip_number_stances_ma_le_teacher", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_vip_number_stances_female_teacher_p", new TableInfo.Column("question_5_vip_number_stances_female_teacher_p", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_vip_numbe_r_stances_mixed_teachers", new TableInfo.Column("question_5_vip_numbe_r_stances_mixed_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_latr_ine_functional", new TableInfo.Column("question_5_latr_ine_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_latrine_none_functional_vip", new TableInfo.Column("question_5_latrine_none_functional_vip", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_female_changing_block_number", new TableInfo.Column("question_5_female_changing_block_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_female_changing_block_stances  ", new TableInfo.Column("question_5_female_changing_block_stances  ", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_female_changing_female_stances", new TableInfo.Column("question_5_female_changing_female_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_female_changing_room_female_teacher", new TableInfo.Column("question_5_female_changing_room_female_teacher", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_female_changing_mixed_teachers", new TableInfo.Column("question_5_female_changing_mixed_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_female_changing_room_functioal", new TableInfo.Column("question_5_female_changing_room_functioal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_question_5_female_changing_none_functional", new TableInfo.Column("question_question_5_female_changing_none_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_uirinals_for_boys_block_number", new TableInfo.Column("question_5_uirinals_for_boys_block_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_urinals_number_stances", new TableInfo.Column("question_urinals_number_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_urinals_for_boys_number_stances_teachers", new TableInfo.Column("question_5_urinals_for_boys_number_stances_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_urinals_for_boys_mixed_teachers", new TableInfo.Column("question_5_urinals_for_boys_mixed_teachers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_urinals_for_boys_functional", new TableInfo.Column("question_5_urinals_for_boys_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_urinals_for_boys_none_functional", new TableInfo.Column("question_5_urinals_for_boys_none_functional", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("question_5_boys_satnces", new TableInfo.Column("question_5_boys_satnces", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_5_1_TOILET_ACCESSIBLE", new TableInfo.Column("QUESTION_5_1_TOILET_ACCESSIBLE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_5_3_FUNCTIONAL_OBJECTIVE", new TableInfo.Column("QUESTION_5_3_FUNCTIONAL_OBJECTIVE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_5_3_FUNCTIONAL_WATER_POINT_REASON_IF_NO", new TableInfo.Column("QUESTION_5_3_FUNCTIONAL_WATER_POINT_REASON_IF_NO", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_6_1_PERMANENT_CLASS_ROOM", new TableInfo.Column("QUESTION_6_1_PERMANENT_CLASS_ROOM", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_6_1_NUMBER_OF_DESK", new TableInfo.Column("QUESTION_6_1_NUMBER_OF_DESK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_6_3_PUPIL_DESK_RATIO", new TableInfo.Column("QUESTION_6_3_PUPIL_DESK_RATIO", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_0_NUMBER_MALE_TEACHER_ENROLLED", new TableInfo.Column("QUESTION_7_0_NUMBER_MALE_TEACHER_ENROLLED", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_0_NUMBER_OF_FEMALE_TEACHER_ENROLLED", new TableInfo.Column("QUESTION_7_0_NUMBER_OF_FEMALE_TEACHER_ENROLLED", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_0_NUMBER_OF_TEACHER_PAYROLL", new TableInfo.Column("QUESTION_7_0_NUMBER_OF_TEACHER_PAYROLL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_0_NUMBER_OF_TEACHERS_PRESENT", new TableInfo.Column("QUESTION_7_0_NUMBER_OF_TEACHERS_PRESENT", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_0_NUMBER_TEACHERS_PRESENT_FEMALE", new TableInfo.Column("QUESTION_7_0_NUMBER_TEACHERS_PRESENT_FEMALE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_1_TEACHER_PUPIL_RATIO", new TableInfo.Column("QUESTION_7_1_TEACHER_PUPIL_RATIO", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_7_2_SENIOR_WOMAN_TEACHER", new TableInfo.Column("QUESTION_7_2_SENIOR_WOMAN_TEACHER", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("_SWT_OFFER_SUPPORT)\n", new TableInfo.Column("_SWT_OFFER_SUPPORT)\n", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_0_HOW_OFTEN_INSPECTOR_VISIT_SCHOOL", new TableInfo.Column("QUESTION_8_0_HOW_OFTEN_INSPECTOR_VISIT_SCHOOL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_2_LAST_TIME_INSPECTOR_VISIT", new TableInfo.Column("QUESTION_8_2_LAST_TIME_INSPECTOR_VISIT", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_3_SCHOOL_HAVE_SCHOOL_MANAGEMENT_COMMITTEE", new TableInfo.Column("QUESTION_8_3_SCHOOL_HAVE_SCHOOL_MANAGEMENT_COMMITTEE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_4_HOW_OFTEN_SMC_MEET", new TableInfo.Column("QUESTION_8_4_HOW_OFTEN_SMC_MEET", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_5_IS_SMC_TRAINED", new TableInfo.Column("QUESTION_8_5_IS_SMC_TRAINED", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_OBERSAVATIONS_OR_CHALLENGES", new TableInfo.Column("QUESTION_8_OBERSAVATIONS_OR_CHALLENGES", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducTable.put("QUESTION_8_IS_STORED_LOCALLY", new TableInfo.Column("QUESTION_8_IS_STORED_LOCALLY", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEducTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEducTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEducTable = new TableInfo("educ_table", _columnsEducTable, _foreignKeysEducTable, _indicesEducTable);
        final TableInfo _existingEducTable = TableInfo.read(_db, "educ_table");
        if (! _infoEducTable.equals(_existingEducTable)) {
          return new RoomOpenHelper.ValidationResult(false, "educ_table(org.ygba.youthgobudget.data.education.EducationQuestion).\n"
                  + " Expected:\n" + _infoEducTable + "\n"
                  + " Found:\n" + _existingEducTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSocialDev = new HashMap<String, TableInfo.Column>(96);
        _columnsSocialDev.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("financial_year", new TableInfo.Column("financial_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("division", new TableInfo.Column("division", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("agent_name", new TableInfo.Column("agent_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("tel", new TableInfo.Column("tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_expec", new TableInfo.Column("q2_com_expec", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_received", new TableInfo.Column("q2_com_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_date_received", new TableInfo.Column("q2_com_date_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_date_withdrawn", new TableInfo.Column("q2_com_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_expected", new TableInfo.Column("q2_others_expected", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_amount_received", new TableInfo.Column("q2_others_amount_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_date_received", new TableInfo.Column("q2_others_date_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_date_withdrawn", new TableInfo.Column("q2_others_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_e_objective", new TableInfo.Column("q3_w_e_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_e_objective_reason", new TableInfo.Column("q3_w_e_objective_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_name", new TableInfo.Column("q3_w_g_1_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_village", new TableInfo.Column("q3_w_g_1_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_m_numbers", new TableInfo.Column("q3_w_g_1_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_f_numbers", new TableInfo.Column("q3_w_g_1_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_a_received", new TableInfo.Column("q3_w_g_1_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_name", new TableInfo.Column("q3_w_g_2_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_village", new TableInfo.Column("q3_w_g_2_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_m_numbers", new TableInfo.Column("q3_w_g_2_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_f_numbers", new TableInfo.Column("q3_w_g_2_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_a_received", new TableInfo.Column("q3_w_g_2_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_name", new TableInfo.Column("q3_w_g_3_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_village", new TableInfo.Column("q3_w_g_3_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_m_numbers", new TableInfo.Column("q3_w_g_3_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_f_numbers", new TableInfo.Column("q3_w_g_3_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_a_received", new TableInfo.Column("q3_w_g_3_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_name", new TableInfo.Column("q3_w_g_4_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_village", new TableInfo.Column("q3_w_g_4_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_m_numbers", new TableInfo.Column("q3_w_g_4_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_f_numbers", new TableInfo.Column("q3_w_g_4_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_a_received", new TableInfo.Column("q3_w_g_4_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_name", new TableInfo.Column("q3_w_g_5_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_village", new TableInfo.Column("q3_w_g_5_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_m_numbers", new TableInfo.Column("q3_w_g_5_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_f_numbers", new TableInfo.Column("q3_w_g_5_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_a_received", new TableInfo.Column("q3_w_g_5_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_name", new TableInfo.Column("q3_w_g_6_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_village", new TableInfo.Column("q3_w_g_6_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_m_numbers", new TableInfo.Column("q3_w_g_6_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_f_numbers", new TableInfo.Column("q3_w_g_6_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_a_received", new TableInfo.Column("q3_w_g_6_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_name", new TableInfo.Column("q3_w_g_7_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_village", new TableInfo.Column("q3_w_g_7_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_m_numbers", new TableInfo.Column("q3_w_g_7_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_f_numbers", new TableInfo.Column("q3_w_g_7_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_a_received", new TableInfo.Column("q3_w_g_7_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_li_obj", new TableInfo.Column("q5_li_obj", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_li_obj_reason", new TableInfo.Column("q5_li_obj_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_y_g_1_name", new TableInfo.Column("q4_y_g_1_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_village", new TableInfo.Column("q4_Y_g_1_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_m_numbers", new TableInfo.Column("q4_Y_g_1_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_f_numbers", new TableInfo.Column("q4_Y_g_1_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_a_received", new TableInfo.Column("q4_Y_g_1_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_name", new TableInfo.Column("q4_Y_g_2_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_village", new TableInfo.Column("q4_Y_g_2_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_m_numbers", new TableInfo.Column("q4_Y_g_2_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_f_numbers", new TableInfo.Column("q4_Y_g_2_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_a_received", new TableInfo.Column("q4_Y_g_2_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_name", new TableInfo.Column("q4_Y_g_3_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_village", new TableInfo.Column("q4_Y_g_3_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_m_numbers", new TableInfo.Column("q4_Y_g_3_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_4_g_3_f_numbers", new TableInfo.Column("q4_4_g_3_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_a_received", new TableInfo.Column("q4_Y_g_3_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_name", new TableInfo.Column("q4_Y_g_4_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_village", new TableInfo.Column("q4_Y_g_4_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_m_numbers", new TableInfo.Column("q4_Y_g_4_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_f_numbers", new TableInfo.Column("q4_Y_g_4_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_a_received", new TableInfo.Column("q4_Y_g_4_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_name", new TableInfo.Column("q4_Y_g_5_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_village", new TableInfo.Column("q4_Y_g_5_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_m_numbers", new TableInfo.Column("q4_Y_g_5_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_f_numbers", new TableInfo.Column("q4_Y_g_5_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_a_received", new TableInfo.Column("q4_Y_g_5_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_6_g_6_name", new TableInfo.Column("q4_6_g_6_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_Y_g_6_village", new TableInfo.Column("q5_Y_g_6_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_6_m_numbers", new TableInfo.Column("q4_Y_g_6_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("Q4_Y_g_6_f_numbers", new TableInfo.Column("Q4_Y_g_6_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_6_a_received", new TableInfo.Column("q4_Y_g_6_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_name", new TableInfo.Column("q4_Y_g_7_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_village", new TableInfo.Column("q4_Y_g_7_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_m_numbers", new TableInfo.Column("q4_Y_g_7_m_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_f_numbers", new TableInfo.Column("q4_Y_g_7_f_numbers", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_a_received", new TableInfo.Column("q4_Y_g_7_a_received", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_number_m_trained", new TableInfo.Column("q5_number_m_trained", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_number_f_trained", new TableInfo.Column("q5_number_f_trained", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q6_com_g_formed", new TableInfo.Column("q6_com_g_formed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q7_others_challenges", new TableInfo.Column("q7_others_challenges", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("locally_stored", new TableInfo.Column("locally_stored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSocialDev = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSocialDev = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSocialDev = new TableInfo("social_dev", _columnsSocialDev, _foreignKeysSocialDev, _indicesSocialDev);
        final TableInfo _existingSocialDev = TableInfo.read(_db, "social_dev");
        if (! _infoSocialDev.equals(_existingSocialDev)) {
          return new RoomOpenHelper.ValidationResult(false, "social_dev(org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion).\n"
                  + " Expected:\n" + _infoSocialDev + "\n"
                  + " Found:\n" + _existingSocialDev);
        }
        final HashMap<String, TableInfo.Column> _columnsWaterAndEnv = new HashMap<String, TableInfo.Column>(62);
        _columnsWaterAndEnv.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("financial_year", new TableInfo.Column("financial_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("sub_county", new TableInfo.Column("sub_county", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("agent_name", new TableInfo.Column("agent_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("agent_tel", new TableInfo.Column("agent_tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_1_objective", new TableInfo.Column("q_1_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_1_reason", new TableInfo.Column("q_1_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_2_reason", new TableInfo.Column("q_2_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_4_answer", new TableInfo.Column("q_4_answer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_3_objective", new TableInfo.Column("q_3_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_text", new TableInfo.Column("q_5_text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_1", new TableInfo.Column("q_5_sub_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_1", new TableInfo.Column("q_5_ws_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_1", new TableInfo.Column("q_5_functional_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_1", new TableInfo.Column("q_5_none_functional_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_1", new TableInfo.Column("q_5_no_ws_available_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_2", new TableInfo.Column("q_5_sub_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_2", new TableInfo.Column("q_5_ws_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_2", new TableInfo.Column("q_5_functional_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_2", new TableInfo.Column("q_5_none_functional_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_2", new TableInfo.Column("q_5_no_ws_available_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_3", new TableInfo.Column("q_5_sub_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_3", new TableInfo.Column("q_5_ws_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_3", new TableInfo.Column("q_5_functional_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_3", new TableInfo.Column("q_5_none_functional_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_3", new TableInfo.Column("q_5_no_ws_available_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_4", new TableInfo.Column("q_5_sub_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_4", new TableInfo.Column("q_5_ws_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_4", new TableInfo.Column("q_5_functional_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_4", new TableInfo.Column("q_5_none_functional_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_4", new TableInfo.Column("q_5_no_ws_available_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_5", new TableInfo.Column("q_5_sub_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_5", new TableInfo.Column("q_5_ws_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_5", new TableInfo.Column("q_5_functional_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_5", new TableInfo.Column("q_5_none_functional_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_5", new TableInfo.Column("q_5_no_ws_available_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_6", new TableInfo.Column("q_5_sub_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_6", new TableInfo.Column("q_5_ws_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_6", new TableInfo.Column("q_5_functional_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_6", new TableInfo.Column("q_5_none_functional_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_6", new TableInfo.Column("q_5_no_ws_available_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_objective", new TableInfo.Column("q_5_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_objective_reason", new TableInfo.Column("q_5_objective_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_wetland_demarcated", new TableInfo.Column("q_6_wetland_demarcated", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_1", new TableInfo.Column("q_6_village_name_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_1", new TableInfo.Column("q_6_1_wetland_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_2", new TableInfo.Column("q_6_village_name_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_2", new TableInfo.Column("q_6_1_wetland_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_3", new TableInfo.Column("q_6_village_name_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_3", new TableInfo.Column("q_6_1_wetland_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_4", new TableInfo.Column("q_6_village_name_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_4", new TableInfo.Column("q_6_1_wetland_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_5", new TableInfo.Column("q_6_village_name_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_5", new TableInfo.Column("q_6_1_wetland_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_6", new TableInfo.Column("q_6_village_name_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_6", new TableInfo.Column("q_6_1_wetland_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_2_tree_planting", new TableInfo.Column("q_6_2_tree_planting", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("locally_stored", new TableInfo.Column("locally_stored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWaterAndEnv = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWaterAndEnv = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWaterAndEnv = new TableInfo("water_and_env", _columnsWaterAndEnv, _foreignKeysWaterAndEnv, _indicesWaterAndEnv);
        final TableInfo _existingWaterAndEnv = TableInfo.read(_db, "water_and_env");
        if (! _infoWaterAndEnv.equals(_existingWaterAndEnv)) {
          return new RoomOpenHelper.ValidationResult(false, "water_and_env(org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion).\n"
                  + " Expected:\n" + _infoWaterAndEnv + "\n"
                  + " Found:\n" + _existingWaterAndEnv);
        }
        final HashMap<String, TableInfo.Column> _columnsBudgetInformation = new HashMap<String, TableInfo.Column>(77);
        _columnsBudgetInformation.put("primary_key", new TableInfo.Column("primary_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_year", new TableInfo.Column("fin_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("admin_approved", new TableInfo.Column("admin_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("admin_percentage", new TableInfo.Column("admin_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_approved", new TableInfo.Column("fin_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_percentage", new TableInfo.Column("fin_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("statu_approved", new TableInfo.Column("statu_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("statu_per", new TableInfo.Column("statu_per", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("pro_approved", new TableInfo.Column("pro_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("pro_perc", new TableInfo.Column("pro_perc", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("health_approved", new TableInfo.Column("health_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("health_percentage", new TableInfo.Column("health_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("education_approved", new TableInfo.Column("education_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("education_percentage", new TableInfo.Column("education_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("road_approved", new TableInfo.Column("road_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("road_percentagae", new TableInfo.Column("road_percentagae", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("water_approved", new TableInfo.Column("water_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("water_percentage", new TableInfo.Column("water_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("natural_approved", new TableInfo.Column("natural_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("natural_percentage", new TableInfo.Column("natural_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("com_approved", new TableInfo.Column("com_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("com_percentage", new TableInfo.Column("com_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("planning_approved", new TableInfo.Column("planning_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("planning_percentage", new TableInfo.Column("planning_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("internal_audit", new TableInfo.Column("internal_audit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("internal_percentage", new TableInfo.Column("internal_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("trade_approved", new TableInfo.Column("trade_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("trade_percentage", new TableInfo.Column("trade_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("total_approved", new TableInfo.Column("total_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("total_percentage", new TableInfo.Column("total_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("wage_approved_b", new TableInfo.Column("wage_approved_b", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("wage_approved_a", new TableInfo.Column("wage_approved_a", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("none_wage_approved_d", new TableInfo.Column("none_wage_approved_d", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("none_wage_perce", new TableInfo.Column("none_wage_perce", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("domestic_approved", new TableInfo.Column("domestic_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("domestic_percentage", new TableInfo.Column("domestic_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("ext_approved", new TableInfo.Column("ext_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("ext_percentage", new TableInfo.Column("ext_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_name", new TableInfo.Column("dis_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_name", new TableInfo.Column("service_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("com_wish_name", new TableInfo.Column("com_wish_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_1_sector", new TableInfo.Column("dis_1_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_1_sect", new TableInfo.Column("sub_1_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_1_sec", new TableInfo.Column("fin_1_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_1_sector", new TableInfo.Column("service_1_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_1", new TableInfo.Column("community_wishes_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_2_sector", new TableInfo.Column("dis_2_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_2_sect", new TableInfo.Column("sub_2_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_2_sec", new TableInfo.Column("fin_2_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_2_sector", new TableInfo.Column("service_2_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_2", new TableInfo.Column("community_wishes_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_3_sector", new TableInfo.Column("dis_3_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_3_sect", new TableInfo.Column("sub_3_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_3_sec", new TableInfo.Column("fin_3_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_3_sector", new TableInfo.Column("service_3_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_3", new TableInfo.Column("community_wishes_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_4_sector", new TableInfo.Column("dis_4_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_4_sect", new TableInfo.Column("sub_4_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_4_sec", new TableInfo.Column("fin_4_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_4_sector", new TableInfo.Column("service_4_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_4", new TableInfo.Column("community_wishes_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_5_sector", new TableInfo.Column("dis_5_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_5_sect", new TableInfo.Column("sub_5_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_5_sec", new TableInfo.Column("fin_5_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_5_sector", new TableInfo.Column("service_5_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_5", new TableInfo.Column("community_wishes_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_6_sector", new TableInfo.Column("dis_6_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_6_sect", new TableInfo.Column("sub_6_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_6_sec", new TableInfo.Column("fin_6_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_6_sector", new TableInfo.Column("service_6_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_6", new TableInfo.Column("community_wishes_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_7_sector", new TableInfo.Column("dis_7_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_7_sect", new TableInfo.Column("sub_7_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_7_sec", new TableInfo.Column("fin_7_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_7_sector", new TableInfo.Column("service_7_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_7", new TableInfo.Column("community_wishes_7", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("stored_locally", new TableInfo.Column("stored_locally", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBudgetInformation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBudgetInformation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBudgetInformation = new TableInfo("budget_information", _columnsBudgetInformation, _foreignKeysBudgetInformation, _indicesBudgetInformation);
        final TableInfo _existingBudgetInformation = TableInfo.read(_db, "budget_information");
        if (! _infoBudgetInformation.equals(_existingBudgetInformation)) {
          return new RoomOpenHelper.ValidationResult(false, "budget_information(org.ygba.youthgobudget.data.budget_information.BudgetInformationForm).\n"
                  + " Expected:\n" + _infoBudgetInformation + "\n"
                  + " Found:\n" + _existingBudgetInformation);
        }
        final HashMap<String, TableInfo.Column> _columnsHealthTable = new HashMap<String, TableInfo.Column>(110);
        _columnsHealthTable.put("primary_key", new TableInfo.Column("primary_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("financial_year", new TableInfo.Column("financial_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("quarter", new TableInfo.Column("quarter", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("district_name", new TableInfo.Column("district_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("town_council", new TableInfo.Column("town_council", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("name_monitor_agent", new TableInfo.Column("name_monitor_agent", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("tell_number", new TableInfo.Column("tell_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_a_health", new TableInfo.Column("question_a_health", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_b", new TableInfo.Column("question_b", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_c_in_patients", new TableInfo.Column("question_c_in_patients", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_re_approved_budget", new TableInfo.Column("question_1_re_approved_budget", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_budget_received", new TableInfo.Column("question_1_budget_received", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_re_date_received", new TableInfo.Column("question_1_re_date_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_rec_date_withdrawn", new TableInfo.Column("question_1_rec_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("dev_1_approved_budget", new TableInfo.Column("dev_1_approved_budget", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_deve_1_bud_re", new TableInfo.Column("question_1_deve_1_bud_re", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_development_1_date_recieved", new TableInfo.Column("question_1_development_1_date_recieved", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_development_date_withdrawn", new TableInfo.Column("question_1_development_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_1_display_area", new TableInfo.Column("question_1_1_display_area", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_1_2_display_reason", new TableInfo.Column("question_1_2_display_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("maternity_yes_no", new TableInfo.Column("maternity_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("general_ward_yes_no", new TableInfo.Column("general_ward_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("delivery_beds_yes_no", new TableInfo.Column("delivery_beds_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("family_planning_yes_no", new TableInfo.Column("family_planning_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("hiv_yes_no", new TableInfo.Column("hiv_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_pmtctc_yes_no", new TableInfo.Column("question_pmtctc_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("immunization_yes_no", new TableInfo.Column("immunization_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("youth_corners_yes_no", new TableInfo.Column("youth_corners_yes_no", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("hep_2_b", new TableInfo.Column("hep_2_b", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("live_number_deliveries", new TableInfo.Column("live_number_deliveries", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("number_still_number", new TableInfo.Column("number_still_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_2_2_children_number", new TableInfo.Column("question_2_2_children_number", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_3_0_number_blocks_toilet", new TableInfo.Column("question_3_0_number_blocks_toilet", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_3_0_number_stances_toilet", new TableInfo.Column("question_3_0_number_stances_toilet", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("question_male_number_patient_stances", new TableInfo.Column("question_male_number_patient_stances", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("Q3_0_F_stancies", new TableInfo.Column("Q3_0_F_stancies", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES", new TableInfo.Column("QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES", new TableInfo.Column("QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("wwrbbjnjiouydyhddvsvhsfdfgsdfgsddff", new TableInfo.Column("wwrbbjnjiouydyhddvsvhsfdfgsdfgsddff", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL", new TableInfo.Column("QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER", new TableInfo.Column("QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_BLOCKS", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_BLOCKS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL", new TableInfo.Column("QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCM_NUMBER_BLOCKS", new TableInfo.Column("QUESTION_3_0_FCM_NUMBER_BLOCKS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCM_NUMBER_STANCES", new TableInfo.Column("QUESTION_3_0_FCM_NUMBER_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES", new TableInfo.Column("QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCM_STAFF_NUMBER_STANCES", new TableInfo.Column("QUESTION_3_0_FCM_STAFF_NUMBER_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCR_STAFF_MIXED_STANCES", new TableInfo.Column("QUESTION_3_0_FCR_STAFF_MIXED_STANCES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCR_FUNCTION", new TableInfo.Column("QUESTION_3_0_FCR_FUNCTION", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCR_NONE_FUNCTION", new TableInfo.Column("QUESTION_3_0_FCR_NONE_FUNCTION", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_0_FCR_REASON_PWD_FRIENDLY", new TableInfo.Column("QUESTION_3_0_FCR_REASON_PWD_FRIENDLY", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_3_1_HEALTH_FACILITY_FACILITIES", new TableInfo.Column("QUESTION_3_1_HEALTH_FACILITY_FACILITIES", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_BORE_HOLE", new TableInfo.Column("QUESTION_4_NUMBER_OF_BORE_HOLE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_TOP", new TableInfo.Column("QUESTION_4_NUMBER_OF_TOP", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_TOP_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_TOP_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_TOP_NONE_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_TOP_NONE_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_WATER_TANK", new TableInfo.Column("QUESTION_4_NUMBER_OF_WATER_TANK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_WATER_TANK_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_WATER_TANK_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_WATER_TANK_NONE_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_WATER_TANK_NONE_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NAME_OF_OTHERS", new TableInfo.Column("QUESTION_4_NAME_OF_OTHERS", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_OTHERS", new TableInfo.Column("QUESTION_4_NUMBER_OF_OTHERS", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_OTHERS_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_OTHERS_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_NUMBER_OF_OTHERS_NONE_FUNCTIONAL", new TableInfo.Column("QUESTION_4_NUMBER_OF_OTHERS_NONE_FUNCTIONAL", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_1_POIN_ACCESSIBLE_PWD", new TableInfo.Column("QUESTION_4_1_POIN_ACCESSIBLE_PWD", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_3_FUNCTIONAL_WATER_POINT", new TableInfo.Column("QUESTION_4_3_FUNCTIONAL_WATER_POINT", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_3_OBJECTIVE_REASON", new TableInfo.Column("QUESTION_4_3_OBJECTIVE_REASON", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_4_4_HAND_WASHING_INSTALLED", new TableInfo.Column("QUESTION_4_4_HAND_WASHING_INSTALLED", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_5_1_HEALTH_UNIT_MANAGEMENT_COMMITTE", new TableInfo.Column("QUESTION_5_1_HEALTH_UNIT_MANAGEMENT_COMMITTE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_5_2_HOW_OFTEN_THEY_MEET", new TableInfo.Column("QUESTION_5_2_HOW_OFTEN_THEY_MEET", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_5_3_LAST_SUPPORT_SUPERVISOR_VISIT", new TableInfo.Column("QUESTION_5_3_LAST_SUPPORT_SUPERVISOR_VISIT", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_MEDICAL_STAFF_CEILING_NUMBER", new TableInfo.Column("QUESTION_6_MEDICAL_STAFF_CEILING_NUMBER", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_MEDICAL_TOTAL_NUMBER_STAFF", new TableInfo.Column("QUESTION_6_MEDICAL_TOTAL_NUMBER_STAFF", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_MEDICAL_NUMBER_STAFF_PRESENT", new TableInfo.Column("QUESTION_6_MEDICAL_NUMBER_STAFF_PRESENT", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_NONE_MEDICAL_STAFF_CEILING_NUMBER", new TableInfo.Column("QUESTION_6_NONE_MEDICAL_STAFF_CEILING_NUMBER", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_NONE_MEDICAL_TOTAL_NUMBER_STAFF", new TableInfo.Column("QUESTION_6_NONE_MEDICAL_TOTAL_NUMBER_STAFF", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_NONE_MEDICAL_STAFF_PRESENT", new TableInfo.Column("QUESTION_6_NONE_MEDICAL_STAFF_PRESENT", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_REASON_FOR_ABSENCE", new TableInfo.Column("QUESTION_6_REASON_FOR_ABSENCE", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_LAST_DATE_OF_APPRAISAL", new TableInfo.Column("QUESTION_6_LAST_DATE_OF_APPRAISAL", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_6_NUMBER_OFF_STAFF_APPRAISED", new TableInfo.Column("QUESTION_6_NUMBER_OFF_STAFF_APPRAISED", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY", new TableInfo.Column("QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY_IF_NO", new TableInfo.Column("QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY_IF_NO", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_1_NAME", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_1_NAME", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_1_REQUIRED_STOCK", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_1_REQUIRED_STOCK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_2_NAME", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_2_NAME", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_2_REQUIRED_STOCK", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_2_REQUIRED_STOCK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_3_NAME", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_3_NAME", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_3_REQUIRED_STOCK", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_3_REQUIRED_STOCK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_4_NAME", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_4_NAME", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_4_REQUIRED_STOCK", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_4_REQUIRED_STOCK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_5_NAME", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_5_NAME", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_2_ESSENTIAL_DRUG_5_REQUIRED_STOCK", new TableInfo.Column("QUESTION_7_2_ESSENTIAL_DRUG_5_REQUIRED_STOCK", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_3_HC_LAST_DRUGS_CONSIGNMENT", new TableInfo.Column("QUESTION_7_3_HC_LAST_DRUGS_CONSIGNMENT", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_4_NUMBER_MEDICAL_EQUIPMENT_BOUGHT", new TableInfo.Column("QUESTION_7_4_NUMBER_MEDICAL_EQUIPMENT_BOUGHT", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_5_AMBULANCE", new TableInfo.Column("QUESTION_7_5_AMBULANCE", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_7_6_REFERRALS_HANDLED", new TableInfo.Column("QUESTION_7_6_REFERRALS_HANDLED", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("QUESTION_8_0_OBSERVATIONS_AND_CHALLENGES", new TableInfo.Column("QUESTION_8_0_OBSERVATIONS_AND_CHALLENGES", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHealthTable.put("IS_LOCALLY_STORED", new TableInfo.Column("IS_LOCALLY_STORED", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHealthTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHealthTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHealthTable = new TableInfo("health_table", _columnsHealthTable, _foreignKeysHealthTable, _indicesHealthTable);
        final TableInfo _existingHealthTable = TableInfo.read(_db, "health_table");
        if (! _infoHealthTable.equals(_existingHealthTable)) {
          return new RoomOpenHelper.ValidationResult(false, "health_table(org.ygba.youthgobudget.data.health.HealthQuestion).\n"
                  + " Expected:\n" + _infoHealthTable + "\n"
                  + " Found:\n" + _existingHealthTable);
        }
        final HashMap<String, TableInfo.Column> _columnsDistrictTable = new HashMap<String, TableInfo.Column>(5);
        _columnsDistrictTable.put("primary_key", new TableInfo.Column("primary_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictTable.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictTable.put("region", new TableInfo.Column("region", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictTable.put("region_id", new TableInfo.Column("region_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictTable.put("id", new TableInfo.Column("id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDistrictTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDistrictTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDistrictTable = new TableInfo("district_table", _columnsDistrictTable, _foreignKeysDistrictTable, _indicesDistrictTable);
        final TableInfo _existingDistrictTable = TableInfo.read(_db, "district_table");
        if (! _infoDistrictTable.equals(_existingDistrictTable)) {
          return new RoomOpenHelper.ValidationResult(false, "district_table(org.ygba.youthgobudget.data.helpers.district.District).\n"
                  + " Expected:\n" + _infoDistrictTable + "\n"
                  + " Found:\n" + _existingDistrictTable);
        }
        final HashMap<String, TableInfo.Column> _columnsSubCounty = new HashMap<String, TableInfo.Column>(5);
        _columnsSubCounty.put("primary_key", new TableInfo.Column("primary_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubCounty.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubCounty.put("district_name", new TableInfo.Column("district_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubCounty.put("district", new TableInfo.Column("district", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubCounty.put("sub_county", new TableInfo.Column("sub_county", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubCounty = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubCounty = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSubCounty = new TableInfo("sub_county", _columnsSubCounty, _foreignKeysSubCounty, _indicesSubCounty);
        final TableInfo _existingSubCounty = TableInfo.read(_db, "sub_county");
        if (! _infoSubCounty.equals(_existingSubCounty)) {
          return new RoomOpenHelper.ValidationResult(false, "sub_county(org.ygba.youthgobudget.data.helpers.sub_county.SubCounty).\n"
                  + " Expected:\n" + _infoSubCounty + "\n"
                  + " Found:\n" + _existingSubCounty);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "458e996b72b4f579bb95ffef17d707ff", "871380c373f179e6c58f56a9be555ac0");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "agric","educ_table","social_dev","water_and_env","budget_information","health_table","district_table","sub_county");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `agric`");
      _db.execSQL("DELETE FROM `educ_table`");
      _db.execSQL("DELETE FROM `social_dev`");
      _db.execSQL("DELETE FROM `water_and_env`");
      _db.execSQL("DELETE FROM `budget_information`");
      _db.execSQL("DELETE FROM `health_table`");
      _db.execSQL("DELETE FROM `district_table`");
      _db.execSQL("DELETE FROM `sub_county`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AgricultureDao agricultureDao() {
    if (_agricultureDao != null) {
      return _agricultureDao;
    } else {
      synchronized(this) {
        if(_agricultureDao == null) {
          _agricultureDao = new AgricultureDao_Impl(this);
        }
        return _agricultureDao;
      }
    }
  }

  @Override
  public SocialDevelopmentDao socialDevelopmentDao() {
    if (_socialDevelopmentDao != null) {
      return _socialDevelopmentDao;
    } else {
      synchronized(this) {
        if(_socialDevelopmentDao == null) {
          _socialDevelopmentDao = new SocialDevelopmentDao_Impl(this);
        }
        return _socialDevelopmentDao;
      }
    }
  }

  @Override
  public EducationQuestionDao educationQuestionDao() {
    if (_educationQuestionDao != null) {
      return _educationQuestionDao;
    } else {
      synchronized(this) {
        if(_educationQuestionDao == null) {
          _educationQuestionDao = new EducationQuestionDao_Impl(this);
        }
        return _educationQuestionDao;
      }
    }
  }

  @Override
  public WaterEnvironmentQuestionDao waterEnvironmentQuestionDao() {
    if (_waterEnvironmentQuestionDao != null) {
      return _waterEnvironmentQuestionDao;
    } else {
      synchronized(this) {
        if(_waterEnvironmentQuestionDao == null) {
          _waterEnvironmentQuestionDao = new WaterEnvironmentQuestionDao_Impl(this);
        }
        return _waterEnvironmentQuestionDao;
      }
    }
  }

  @Override
  public BudgetInformationFormDao budgetInformationFormDao() {
    if (_budgetInformationFormDao != null) {
      return _budgetInformationFormDao;
    } else {
      synchronized(this) {
        if(_budgetInformationFormDao == null) {
          _budgetInformationFormDao = new BudgetInformationFormDao_Impl(this);
        }
        return _budgetInformationFormDao;
      }
    }
  }

  @Override
  public HealthQuestionDao healthQuestionDao() {
    if (_healthQuestionDao != null) {
      return _healthQuestionDao;
    } else {
      synchronized(this) {
        if(_healthQuestionDao == null) {
          _healthQuestionDao = new HealthQuestionDao_Impl(this);
        }
        return _healthQuestionDao;
      }
    }
  }

  @Override
  public DistrictDao districtDao() {
    if (_districtDao != null) {
      return _districtDao;
    } else {
      synchronized(this) {
        if(_districtDao == null) {
          _districtDao = new DistrictDao_Impl(this);
        }
        return _districtDao;
      }
    }
  }

  @Override
  public SubCountyDao subCountyDao() {
    if (_subCountyDao != null) {
      return _subCountyDao;
    } else {
      synchronized(this) {
        if(_subCountyDao == null) {
          _subCountyDao = new SubCountyDao_Impl(this);
        }
        return _subCountyDao;
      }
    }
  }
}
