package org.ygba.youthgobudget.data.health;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HealthQuestionDao_Impl implements HealthQuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HealthQuestion> __insertionAdapterOfHealthQuestion;

  public HealthQuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHealthQuestion = new EntityInsertionAdapter<HealthQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `health_table` (`primary_key`,`financial_year`,`quarter`,`date`,`district_name`,`village`,`parish`,`town_council`,`name_monitor_agent`,`tell_number`,`question_a_health`,`question_b`,`question_c_in_patients`,`question_1_re_approved_budget`,`question_1_budget_received`,`question_1_re_date_received`,`question_1_rec_date_withdrawn`,`dev_1_approved_budget`,`question_1_deve_1_bud_re`,`question_1_development_1_date_recieved`,`question_1_development_date_withdrawn`,`question_1_1_display_area`,`question_1_2_display_reason`,`maternity_yes_no`,`general_ward_yes_no`,`delivery_beds_yes_no`,`family_planning_yes_no`,`hiv_yes_no`,`question_pmtctc_yes_no`,`immunization_yes_no`,`youth_corners_yes_no`,`hep_2_b`,`live_number_deliveries`,`number_still_number`,`question_2_2_children_number`,`question_3_0_number_blocks_toilet`,`question_3_0_number_stances_toilet`,`question_male_number_patient_stances`,`Q3_0_F_stancies`,`QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES`,`QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES`,`wwrbbjnjiouydyhddvsvhsfdfgsdfgsddff`,`QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL`,`QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER`,`QUESTION_3_0_LATRINE_NUMBER_BLOCKS`,`QUESTION_3_0_LATRINE_NUMBER_STANCES`,`QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES`,`QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES`,`QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES`,`QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES`,`QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES`,`QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES`,`QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL`,`QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL`,`QUESTION_3_0_FCM_NUMBER_BLOCKS`,`QUESTION_3_0_FCM_NUMBER_STANCES`,`QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES`,`QUESTION_3_0_FCM_STAFF_NUMBER_STANCES`,`QUESTION_3_0_FCR_STAFF_MIXED_STANCES`,`QUESTION_3_0_FCR_FUNCTION`,`QUESTION_3_0_FCR_NONE_FUNCTION`,`QUESTION_3_0_FCR_REASON_PWD_FRIENDLY`,`QUESTION_3_1_HEALTH_FACILITY_FACILITIES`,`QUESTION_4_NUMBER_OF_BORE_HOLE`,`QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL`,`QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL`,`QUESTION_4_NUMBER_OF_TOP`,`QUESTION_4_NUMBER_OF_TOP_FUNCTIONAL`,`QUESTION_4_NUMBER_OF_TOP_NONE_FUNCTIONAL`,`QUESTION_4_NUMBER_OF_WATER_TANK`,`QUESTION_4_NUMBER_OF_WATER_TANK_FUNCTIONAL`,`QUESTION_4_NUMBER_OF_WATER_TANK_NONE_FUNCTIONAL`,`QUESTION_4_NAME_OF_OTHERS`,`QUESTION_4_NUMBER_OF_OTHERS`,`QUESTION_4_NUMBER_OF_OTHERS_FUNCTIONAL`,`QUESTION_4_NUMBER_OF_OTHERS_NONE_FUNCTIONAL`,`QUESTION_4_1_POIN_ACCESSIBLE_PWD`,`QUESTION_4_3_FUNCTIONAL_WATER_POINT`,`QUESTION_4_3_OBJECTIVE_REASON`,`QUESTION_4_4_HAND_WASHING_INSTALLED`,`QUESTION_5_1_HEALTH_UNIT_MANAGEMENT_COMMITTE`,`QUESTION_5_2_HOW_OFTEN_THEY_MEET`,`QUESTION_5_3_LAST_SUPPORT_SUPERVISOR_VISIT`,`QUESTION_6_MEDICAL_STAFF_CEILING_NUMBER`,`QUESTION_6_MEDICAL_TOTAL_NUMBER_STAFF`,`QUESTION_6_MEDICAL_NUMBER_STAFF_PRESENT`,`QUESTION_6_NONE_MEDICAL_STAFF_CEILING_NUMBER`,`QUESTION_6_NONE_MEDICAL_TOTAL_NUMBER_STAFF`,`QUESTION_6_NONE_MEDICAL_STAFF_PRESENT`,`QUESTION_6_REASON_FOR_ABSENCE`,`QUESTION_6_LAST_DATE_OF_APPRAISAL`,`QUESTION_6_NUMBER_OFF_STAFF_APPRAISED`,`QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY`,`QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY_IF_NO`,`QUESTION_7_2_ESSENTIAL_DRUG_1_NAME`,`QUESTION_7_2_ESSENTIAL_DRUG_1_REQUIRED_STOCK`,`QUESTION_7_2_ESSENTIAL_DRUG_2_NAME`,`QUESTION_7_2_ESSENTIAL_DRUG_2_REQUIRED_STOCK`,`QUESTION_7_2_ESSENTIAL_DRUG_3_NAME`,`QUESTION_7_2_ESSENTIAL_DRUG_3_REQUIRED_STOCK`,`QUESTION_7_2_ESSENTIAL_DRUG_4_NAME`,`QUESTION_7_2_ESSENTIAL_DRUG_4_REQUIRED_STOCK`,`QUESTION_7_2_ESSENTIAL_DRUG_5_NAME`,`QUESTION_7_2_ESSENTIAL_DRUG_5_REQUIRED_STOCK`,`QUESTION_7_3_HC_LAST_DRUGS_CONSIGNMENT`,`QUESTION_7_4_NUMBER_MEDICAL_EQUIPMENT_BOUGHT`,`QUESTION_7_5_AMBULANCE`,`QUESTION_7_6_REFERRALS_HANDLED`,`QUESTION_8_0_OBSERVATIONS_AND_CHALLENGES`,`IS_LOCALLY_STORED`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HealthQuestion value) {
        stmt.bindLong(1, value.getPrimaryKey());
        if (value.getFinancialYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFinancialYear());
        }
        if (value.getFinancialYearQuarter() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFinancialYearQuarter());
        }
        if (value.getData() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getData());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDistrict());
        }
        if (value.getVillage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getVillage());
        }
        if (value.getParish() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getParish());
        }
        if (value.getTownCouncil() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTownCouncil());
        }
        if (value.getNameMonitorAgent() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getNameMonitorAgent());
        }
        if (value.getTelNumber() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getTelNumber());
        }
        if (value.getQuestionANameAndGradeHealthCenter() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getQuestionANameAndGradeHealthCenter());
        }
        stmt.bindLong(12, value.getQuestionBOutPatientOPDAttendance());
        stmt.bindLong(13, value.getQuestionCInPatientAttendance());
        stmt.bindLong(14, value.getQuestion1RecurrentApprovedBudget());
        stmt.bindLong(15, value.getQuestion1RecurrentBudgetReleased());
        if (value.getQuestion1RecurrentDateReceived() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getQuestion1RecurrentDateReceived());
        }
        if (value.getQuestion1RecurrentDateWithdrawn() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getQuestion1RecurrentDateWithdrawn());
        }
        stmt.bindLong(18, value.getQuestion1DevelopmentApprovedBudget());
        stmt.bindLong(19, value.getQuestion1DevelopmentReleasedBudget());
        if (value.getQuestion1DevelopmentDateReceived() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getQuestion1DevelopmentDateReceived());
        }
        if (value.getQuestion1DevelopmentDateWithdrawn() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getQuestion1DevelopmentDateWithdrawn());
        }
        if (value.getQuestion11DisplayBudgetInformation() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getQuestion11DisplayBudgetInformation());
        }
        if (value.getQuestion12BudgetInformationRelates() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getQuestion12BudgetInformationRelates());
        }
        final int _tmp;
        _tmp = value.isQuestion2MaternityYesNo() ? 1 : 0;
        stmt.bindLong(24, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isQuestion2GeneralWardYesNo() ? 1 : 0;
        stmt.bindLong(25, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isQuestion2DeliveryBedsYesNo() ? 1 : 0;
        stmt.bindLong(26, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.isQuestion2FamilyPlanningServicesYesNo() ? 1 : 0;
        stmt.bindLong(27, _tmp_3);
        final int _tmp_4;
        _tmp_4 = value.isQuestion2HIVCounsellingTestingAndTreatmentYesNo() ? 1 : 0;
        stmt.bindLong(28, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.isQuestion2PMTCTYesNo() ? 1 : 0;
        stmt.bindLong(29, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.isQuestion2ImmunizationYesNo() ? 1 : 0;
        stmt.bindLong(30, _tmp_6);
        final int _tmp_7;
        _tmp_7 = value.isQuestion2YouthFriendlyCornersYesNo() ? 1 : 0;
        stmt.bindLong(31, _tmp_7);
        final int _tmp_8;
        _tmp_8 = value.isQuestion2Vaccination4HEPBYesNo() ? 1 : 0;
        stmt.bindLong(32, _tmp_8);
        stmt.bindLong(33, value.getQuestion21CategoryLiveNumberDeliveries());
        stmt.bindLong(34, value.getQuestion21CategoryStillNumberDeliveries());
        stmt.bindLong(35, value.getQuestion22ChildrenImmunized());
        stmt.bindLong(36, value.getQuestion3ToiletNumberBlocks());
        stmt.bindLong(37, value.getQuestion3ToiletNumberInstances());
        stmt.bindLong(38, value.getQuestion3PatientToiletNumberMaleStances());
        stmt.bindLong(39, value.getQuestion3PatientToiletNumberFemaleStances());
        stmt.bindLong(40, value.getQuestion3HealthStaffNumberToiletMaleStance());
        stmt.bindLong(41, value.getQuestion3HealthStaffNumberToiletFemaleStances());
        stmt.bindLong(42, value.getQuestion3HealthStaffNumberToiletMixedStances());
        stmt.bindLong(43, value.getQuestion3ToiletFunctionalNumber());
        stmt.bindLong(44, value.getQuestion3ToiletNonFunctionNumber());
        stmt.bindLong(45, value.getQuestion3LatrineNumberBlocks());
        stmt.bindLong(46, value.getQuestion3LatrineNumberStances());
        stmt.bindLong(47, value.getQuestion3LatrineNumberMaleStances());
        stmt.bindLong(48, value.getQuestion3LatrineNumberFemaleStances());
        stmt.bindLong(49, value.getQuestion3LatrineNumberPatientMaleStances());
        stmt.bindLong(50, value.getQuestion3LatrineNumberStaffMaleStances());
        stmt.bindLong(51, value.getQuestion3LatrineNumberStaffFemaleStance());
        stmt.bindLong(52, value.getQuestion3LatrineNumberStaffMixedStances());
        stmt.bindLong(53, value.getQuestion3LatrineNumberFunctional());
        stmt.bindLong(54, value.getQuestion3LatrineNoneFunctional());
        stmt.bindLong(55, value.getQuestion3FCRNumberBlock());
        stmt.bindLong(56, value.getQuestion3FCRNumberStances());
        stmt.bindLong(57, value.getQuestion3FCRNumberFemaleStances());
        stmt.bindLong(58, value.getQuestion3FCRNumberStaffFemaleStances());
        stmt.bindLong(59, value.getQuestion3FCRNumberStaffMixedStances());
        stmt.bindLong(60, value.getQuestion3FCRNumberFunctionalStances());
        stmt.bindLong(61, value.getQuestion3FCRNumberNoneFunction());
        if (value.getQuestion32HealthFacilityToiletReasonFacilities() == null) {
          stmt.bindNull(62);
        } else {
          stmt.bindString(62, value.getQuestion32HealthFacilityToiletReasonFacilities());
        }
        final int _tmp_9;
        _tmp_9 = value.isQuestion31HealthFacilityToiletFacilities() ? 1 : 0;
        stmt.bindLong(63, _tmp_9);
        stmt.bindLong(64, value.getQuestion4NumberOfBoreHole());
        stmt.bindLong(65, value.getQuestion4NumberOfBoreHoleFunctional());
        stmt.bindLong(66, value.getQuestion4NumberOfBoreHoleNoneFunctional());
        stmt.bindLong(67, value.getQuestion4NumberOfTap());
        stmt.bindLong(68, value.getQuestion4NumberOfTapFunctional());
        stmt.bindLong(69, value.getQuestion4NumberOfTapNoneFunctional());
        stmt.bindLong(70, value.getQuestion4NumberOfWaterTank());
        stmt.bindLong(71, value.getQuestion4NumberOfWaterTankFunctional());
        stmt.bindLong(72, value.getQuestion4NumberOfWaterTankNoneFunctional());
        if (value.getQuestion4OtherName() == null) {
          stmt.bindNull(73);
        } else {
          stmt.bindString(73, value.getQuestion4OtherName());
        }
        stmt.bindLong(74, value.getQuestion4OtherNumber());
        stmt.bindLong(75, value.getQuestion4OtherNumberFunctional());
        stmt.bindLong(76, value.getQuestion4OtherNumberNoneFunctional());
        final int _tmp_10;
        _tmp_10 = value.isQuestion41WaterPointAccessible() ? 1 : 0;
        stmt.bindLong(77, _tmp_10);
        final int _tmp_11;
        _tmp_11 = value.isQuestion43FunctionalWaterPoint() ? 1 : 0;
        stmt.bindLong(78, _tmp_11);
        if (value.getQuestion43IfNoneReason() == null) {
          stmt.bindNull(79);
        } else {
          stmt.bindString(79, value.getQuestion43IfNoneReason());
        }
        final int _tmp_12;
        _tmp_12 = value.isQuestion44HandWashingInstalled() ? 1 : 0;
        stmt.bindLong(80, _tmp_12);
        final int _tmp_13;
        _tmp_13 = value.isQuestion51HealthUnitManagementCommittee() ? 1 : 0;
        stmt.bindLong(81, _tmp_13);
        if (value.getQuestion52HowOftenTheyMeet() == null) {
          stmt.bindNull(82);
        } else {
          stmt.bindString(82, value.getQuestion52HowOftenTheyMeet());
        }
        if (value.getQuestion53LastVisitSupportSupervisor() == null) {
          stmt.bindNull(83);
        } else {
          stmt.bindString(83, value.getQuestion53LastVisitSupportSupervisor());
        }
        stmt.bindLong(84, value.getQuestion6MedicalStaffCeilingNumber());
        stmt.bindLong(85, value.getQuestion6MedicalTotalNumberStaff());
        stmt.bindLong(86, value.getQuestion6MedicalNumberStuffPresent());
        stmt.bindLong(87, value.getQuestion6NoneMedicalStaffCeilingNumber());
        stmt.bindLong(88, value.getQuestion6NoneMedicalStaffTotalNumberStaff());
        stmt.bindLong(89, value.getQuestion6NoneMedicalNumberStaffPresent());
        if (value.getQuestion6ReasonsForStaffAbsence() == null) {
          stmt.bindNull(90);
        } else {
          stmt.bindString(90, value.getQuestion6ReasonsForStaffAbsence());
        }
        if (value.getQuestion6LastDatePerformanceAppraisal() == null) {
          stmt.bindNull(91);
        } else {
          stmt.bindString(91, value.getQuestion6LastDatePerformanceAppraisal());
        }
        stmt.bindLong(92, value.getQuestion6NumberOfStaffAppraised());
        final int _tmp_14;
        _tmp_14 = value.isQuestion7HCReceiveMedicalSupplies() ? 1 : 0;
        stmt.bindLong(93, _tmp_14);
        if (value.getQuestion7HCReceiveMedicalSuppliesIfNo() == null) {
          stmt.bindNull(94);
        } else {
          stmt.bindString(94, value.getQuestion7HCReceiveMedicalSuppliesIfNo());
        }
        if (value.getQuestion72EssentialDrug1Name() == null) {
          stmt.bindNull(95);
        } else {
          stmt.bindString(95, value.getQuestion72EssentialDrug1Name());
        }
        stmt.bindLong(96, value.getQuestion72EssentialDrug1RequiredStock());
        if (value.getQuestion72EssentialDrug2Name() == null) {
          stmt.bindNull(97);
        } else {
          stmt.bindString(97, value.getQuestion72EssentialDrug2Name());
        }
        stmt.bindLong(98, value.getQuestion72EssentialDrug2RequiredStock());
        if (value.getQuestion72EssentialDrug3Name() == null) {
          stmt.bindNull(99);
        } else {
          stmt.bindString(99, value.getQuestion72EssentialDrug3Name());
        }
        stmt.bindLong(100, value.getQuestion72EssentialDrug3RequiredStock());
        if (value.getQuestion72EssentialDrug4Name() == null) {
          stmt.bindNull(101);
        } else {
          stmt.bindString(101, value.getQuestion72EssentialDrug4Name());
        }
        stmt.bindLong(102, value.getQuestion72EssentialDrug4RequiredStock());
        if (value.getQuestion72EssentialDrug5Name() == null) {
          stmt.bindNull(103);
        } else {
          stmt.bindString(103, value.getQuestion72EssentialDrug5Name());
        }
        stmt.bindLong(104, value.getQuestion72EssentialDrug5RequiredStock());
        if (value.getQuestion73HCLastDrugsConsignment() == null) {
          stmt.bindNull(105);
        } else {
          stmt.bindString(105, value.getQuestion73HCLastDrugsConsignment());
        }
        stmt.bindLong(106, value.getQuestion74NumberMedicalEquipmentBrought());
        final int _tmp_15;
        _tmp_15 = value.isQuestion75HaveAmbulance() ? 1 : 0;
        stmt.bindLong(107, _tmp_15);
        if (value.getQuestion76Referrals() == null) {
          stmt.bindNull(108);
        } else {
          stmt.bindString(108, value.getQuestion76Referrals());
        }
        if (value.getQuestion80ChallengesAndObservation() == null) {
          stmt.bindNull(109);
        } else {
          stmt.bindString(109, value.getQuestion80ChallengesAndObservation());
        }
        final int _tmp_16;
        _tmp_16 = value.isLocallyStored() ? 1 : 0;
        stmt.bindLong(110, _tmp_16);
      }
    };
  }

  @Override
  public void insertHealthQuestion(final HealthQuestion healthQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHealthQuestion.insert(healthQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<HealthQuestion> getHealthQuestion(final boolean is_stored_locally) {
    final String _sql = "SELECT * FROM health_table WHERE IS_LOCALLY_STORED =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = is_stored_locally ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
      final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "financial_year");
      final int _cursorIndexOfFinancialYearQuarter = CursorUtil.getColumnIndexOrThrow(_cursor, "quarter");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name");
      final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
      final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
      final int _cursorIndexOfTownCouncil = CursorUtil.getColumnIndexOrThrow(_cursor, "town_council");
      final int _cursorIndexOfNameMonitorAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "name_monitor_agent");
      final int _cursorIndexOfTelNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "tell_number");
      final int _cursorIndexOfQuestionANameAndGradeHealthCenter = CursorUtil.getColumnIndexOrThrow(_cursor, "question_a_health");
      final int _cursorIndexOfQuestionBOutPatientOPDAttendance = CursorUtil.getColumnIndexOrThrow(_cursor, "question_b");
      final int _cursorIndexOfQuestionCInPatientAttendance = CursorUtil.getColumnIndexOrThrow(_cursor, "question_c_in_patients");
      final int _cursorIndexOfQuestion1RecurrentApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_re_approved_budget");
      final int _cursorIndexOfQuestion1RecurrentBudgetReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_budget_received");
      final int _cursorIndexOfQuestion1RecurrentDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_re_date_received");
      final int _cursorIndexOfQuestion1RecurrentDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_rec_date_withdrawn");
      final int _cursorIndexOfQuestion1DevelopmentApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "dev_1_approved_budget");
      final int _cursorIndexOfQuestion1DevelopmentReleasedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_deve_1_bud_re");
      final int _cursorIndexOfQuestion1DevelopmentDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_development_1_date_recieved");
      final int _cursorIndexOfQuestion1DevelopmentDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_development_date_withdrawn");
      final int _cursorIndexOfQuestion11DisplayBudgetInformation = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_1_display_area");
      final int _cursorIndexOfQuestion12BudgetInformationRelates = CursorUtil.getColumnIndexOrThrow(_cursor, "question_1_2_display_reason");
      final int _cursorIndexOfQuestion2MaternityYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "maternity_yes_no");
      final int _cursorIndexOfQuestion2GeneralWardYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "general_ward_yes_no");
      final int _cursorIndexOfQuestion2DeliveryBedsYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_beds_yes_no");
      final int _cursorIndexOfQuestion2FamilyPlanningServicesYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "family_planning_yes_no");
      final int _cursorIndexOfQuestion2HIVCounsellingTestingAndTreatmentYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "hiv_yes_no");
      final int _cursorIndexOfQuestion2PMTCTYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "question_pmtctc_yes_no");
      final int _cursorIndexOfQuestion2ImmunizationYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "immunization_yes_no");
      final int _cursorIndexOfQuestion2YouthFriendlyCornersYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "youth_corners_yes_no");
      final int _cursorIndexOfQuestion2Vaccination4HEPBYesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "hep_2_b");
      final int _cursorIndexOfQuestion21CategoryLiveNumberDeliveries = CursorUtil.getColumnIndexOrThrow(_cursor, "live_number_deliveries");
      final int _cursorIndexOfQuestion21CategoryStillNumberDeliveries = CursorUtil.getColumnIndexOrThrow(_cursor, "number_still_number");
      final int _cursorIndexOfQuestion22ChildrenImmunized = CursorUtil.getColumnIndexOrThrow(_cursor, "question_2_2_children_number");
      final int _cursorIndexOfQuestion3ToiletNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_0_number_blocks_toilet");
      final int _cursorIndexOfQuestion3ToiletNumberInstances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_3_0_number_stances_toilet");
      final int _cursorIndexOfQuestion3PatientToiletNumberMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "question_male_number_patient_stances");
      final int _cursorIndexOfQuestion3PatientToiletNumberFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "Q3_0_F_stancies");
      final int _cursorIndexOfQuestion3HealthStaffNumberToiletMaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES");
      final int _cursorIndexOfQuestion3HealthStaffNumberToiletFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES");
      final int _cursorIndexOfQuestion3HealthStaffNumberToiletMixedStances = CursorUtil.getColumnIndexOrThrow(_cursor, "wwrbbjnjiouydyhddvsvhsfdfgsdfgsddff");
      final int _cursorIndexOfQuestion3ToiletFunctionalNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL");
      final int _cursorIndexOfQuestion3ToiletNonFunctionNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER");
      final int _cursorIndexOfQuestion3LatrineNumberBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_BLOCKS");
      final int _cursorIndexOfQuestion3LatrineNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberPatientMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberStaffMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberStaffFemaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberStaffMixedStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES");
      final int _cursorIndexOfQuestion3LatrineNumberFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL");
      final int _cursorIndexOfQuestion3LatrineNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL");
      final int _cursorIndexOfQuestion3FCRNumberBlock = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCM_NUMBER_BLOCKS");
      final int _cursorIndexOfQuestion3FCRNumberStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCM_NUMBER_STANCES");
      final int _cursorIndexOfQuestion3FCRNumberFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES");
      final int _cursorIndexOfQuestion3FCRNumberStaffFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCM_STAFF_NUMBER_STANCES");
      final int _cursorIndexOfQuestion3FCRNumberStaffMixedStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCR_STAFF_MIXED_STANCES");
      final int _cursorIndexOfQuestion3FCRNumberFunctionalStances = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCR_FUNCTION");
      final int _cursorIndexOfQuestion3FCRNumberNoneFunction = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCR_NONE_FUNCTION");
      final int _cursorIndexOfQuestion32HealthFacilityToiletReasonFacilities = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_0_FCR_REASON_PWD_FRIENDLY");
      final int _cursorIndexOfQuestion31HealthFacilityToiletFacilities = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_3_1_HEALTH_FACILITY_FACILITIES");
      final int _cursorIndexOfQuestion4NumberOfBoreHole = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_BORE_HOLE");
      final int _cursorIndexOfQuestion4NumberOfBoreHoleFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL");
      final int _cursorIndexOfQuestion4NumberOfBoreHoleNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL");
      final int _cursorIndexOfQuestion4NumberOfTap = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_TOP");
      final int _cursorIndexOfQuestion4NumberOfTapFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_TOP_FUNCTIONAL");
      final int _cursorIndexOfQuestion4NumberOfTapNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_TOP_NONE_FUNCTIONAL");
      final int _cursorIndexOfQuestion4NumberOfWaterTank = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_WATER_TANK");
      final int _cursorIndexOfQuestion4NumberOfWaterTankFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_WATER_TANK_FUNCTIONAL");
      final int _cursorIndexOfQuestion4NumberOfWaterTankNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_WATER_TANK_NONE_FUNCTIONAL");
      final int _cursorIndexOfQuestion4OtherName = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NAME_OF_OTHERS");
      final int _cursorIndexOfQuestion4OtherNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_OTHERS");
      final int _cursorIndexOfQuestion4OtherNumberFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_OTHERS_FUNCTIONAL");
      final int _cursorIndexOfQuestion4OtherNumberNoneFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_NUMBER_OF_OTHERS_NONE_FUNCTIONAL");
      final int _cursorIndexOfQuestion41WaterPointAccessible = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_1_POIN_ACCESSIBLE_PWD");
      final int _cursorIndexOfQuestion43FunctionalWaterPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_3_FUNCTIONAL_WATER_POINT");
      final int _cursorIndexOfQuestion43IfNoneReason = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_3_OBJECTIVE_REASON");
      final int _cursorIndexOfQuestion44HandWashingInstalled = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_4_4_HAND_WASHING_INSTALLED");
      final int _cursorIndexOfQuestion51HealthUnitManagementCommittee = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_1_HEALTH_UNIT_MANAGEMENT_COMMITTE");
      final int _cursorIndexOfQuestion52HowOftenTheyMeet = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_2_HOW_OFTEN_THEY_MEET");
      final int _cursorIndexOfQuestion53LastVisitSupportSupervisor = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_5_3_LAST_SUPPORT_SUPERVISOR_VISIT");
      final int _cursorIndexOfQuestion6MedicalStaffCeilingNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_MEDICAL_STAFF_CEILING_NUMBER");
      final int _cursorIndexOfQuestion6MedicalTotalNumberStaff = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_MEDICAL_TOTAL_NUMBER_STAFF");
      final int _cursorIndexOfQuestion6MedicalNumberStuffPresent = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_MEDICAL_NUMBER_STAFF_PRESENT");
      final int _cursorIndexOfQuestion6NoneMedicalStaffCeilingNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_NONE_MEDICAL_STAFF_CEILING_NUMBER");
      final int _cursorIndexOfQuestion6NoneMedicalStaffTotalNumberStaff = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_NONE_MEDICAL_TOTAL_NUMBER_STAFF");
      final int _cursorIndexOfQuestion6NoneMedicalNumberStaffPresent = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_NONE_MEDICAL_STAFF_PRESENT");
      final int _cursorIndexOfQuestion6ReasonsForStaffAbsence = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_REASON_FOR_ABSENCE");
      final int _cursorIndexOfQuestion6LastDatePerformanceAppraisal = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_LAST_DATE_OF_APPRAISAL");
      final int _cursorIndexOfQuestion6NumberOfStaffAppraised = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_6_NUMBER_OFF_STAFF_APPRAISED");
      final int _cursorIndexOfQuestion7HCReceiveMedicalSupplies = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY");
      final int _cursorIndexOfQuestion7HCReceiveMedicalSuppliesIfNo = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY_IF_NO");
      final int _cursorIndexOfQuestion72EssentialDrug1Name = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_1_NAME");
      final int _cursorIndexOfQuestion72EssentialDrug1RequiredStock = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_1_REQUIRED_STOCK");
      final int _cursorIndexOfQuestion72EssentialDrug2Name = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_2_NAME");
      final int _cursorIndexOfQuestion72EssentialDrug2RequiredStock = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_2_REQUIRED_STOCK");
      final int _cursorIndexOfQuestion72EssentialDrug3Name = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_3_NAME");
      final int _cursorIndexOfQuestion72EssentialDrug3RequiredStock = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_3_REQUIRED_STOCK");
      final int _cursorIndexOfQuestion72EssentialDrug4Name = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_4_NAME");
      final int _cursorIndexOfQuestion72EssentialDrug4RequiredStock = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_4_REQUIRED_STOCK");
      final int _cursorIndexOfQuestion72EssentialDrug5Name = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_5_NAME");
      final int _cursorIndexOfQuestion72EssentialDrug5RequiredStock = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_2_ESSENTIAL_DRUG_5_REQUIRED_STOCK");
      final int _cursorIndexOfQuestion73HCLastDrugsConsignment = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_3_HC_LAST_DRUGS_CONSIGNMENT");
      final int _cursorIndexOfQuestion74NumberMedicalEquipmentBrought = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_4_NUMBER_MEDICAL_EQUIPMENT_BOUGHT");
      final int _cursorIndexOfQuestion75HaveAmbulance = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_5_AMBULANCE");
      final int _cursorIndexOfQuestion76Referrals = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_7_6_REFERRALS_HANDLED");
      final int _cursorIndexOfQuestion80ChallengesAndObservation = CursorUtil.getColumnIndexOrThrow(_cursor, "QUESTION_8_0_OBSERVATIONS_AND_CHALLENGES");
      final int _cursorIndexOfIsLocallyStored = CursorUtil.getColumnIndexOrThrow(_cursor, "IS_LOCALLY_STORED");
      final List<HealthQuestion> _result = new ArrayList<HealthQuestion>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HealthQuestion _item;
        final String _tmpFinancialYear;
        _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
        final String _tmpFinancialYearQuarter;
        _tmpFinancialYearQuarter = _cursor.getString(_cursorIndexOfFinancialYearQuarter);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        final String _tmpVillage;
        _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
        final String _tmpParish;
        _tmpParish = _cursor.getString(_cursorIndexOfParish);
        final String _tmpTownCouncil;
        _tmpTownCouncil = _cursor.getString(_cursorIndexOfTownCouncil);
        final String _tmpNameMonitorAgent;
        _tmpNameMonitorAgent = _cursor.getString(_cursorIndexOfNameMonitorAgent);
        final String _tmpTelNumber;
        _tmpTelNumber = _cursor.getString(_cursorIndexOfTelNumber);
        final String _tmpQuestionANameAndGradeHealthCenter;
        _tmpQuestionANameAndGradeHealthCenter = _cursor.getString(_cursorIndexOfQuestionANameAndGradeHealthCenter);
        final int _tmpQuestionBOutPatientOPDAttendance;
        _tmpQuestionBOutPatientOPDAttendance = _cursor.getInt(_cursorIndexOfQuestionBOutPatientOPDAttendance);
        final int _tmpQuestionCInPatientAttendance;
        _tmpQuestionCInPatientAttendance = _cursor.getInt(_cursorIndexOfQuestionCInPatientAttendance);
        final int _tmpQuestion1RecurrentApprovedBudget;
        _tmpQuestion1RecurrentApprovedBudget = _cursor.getInt(_cursorIndexOfQuestion1RecurrentApprovedBudget);
        final int _tmpQuestion1RecurrentBudgetReleased;
        _tmpQuestion1RecurrentBudgetReleased = _cursor.getInt(_cursorIndexOfQuestion1RecurrentBudgetReleased);
        final String _tmpQuestion1RecurrentDateReceived;
        _tmpQuestion1RecurrentDateReceived = _cursor.getString(_cursorIndexOfQuestion1RecurrentDateReceived);
        final String _tmpQuestion1RecurrentDateWithdrawn;
        _tmpQuestion1RecurrentDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion1RecurrentDateWithdrawn);
        final int _tmpQuestion1DevelopmentApprovedBudget;
        _tmpQuestion1DevelopmentApprovedBudget = _cursor.getInt(_cursorIndexOfQuestion1DevelopmentApprovedBudget);
        final int _tmpQuestion1DevelopmentReleasedBudget;
        _tmpQuestion1DevelopmentReleasedBudget = _cursor.getInt(_cursorIndexOfQuestion1DevelopmentReleasedBudget);
        final String _tmpQuestion1DevelopmentDateReceived;
        _tmpQuestion1DevelopmentDateReceived = _cursor.getString(_cursorIndexOfQuestion1DevelopmentDateReceived);
        final String _tmpQuestion1DevelopmentDateWithdrawn;
        _tmpQuestion1DevelopmentDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion1DevelopmentDateWithdrawn);
        final String _tmpQuestion11DisplayBudgetInformation;
        _tmpQuestion11DisplayBudgetInformation = _cursor.getString(_cursorIndexOfQuestion11DisplayBudgetInformation);
        final String _tmpQuestion12BudgetInformationRelates;
        _tmpQuestion12BudgetInformationRelates = _cursor.getString(_cursorIndexOfQuestion12BudgetInformationRelates);
        final boolean _tmpQuestion2MaternityYesNo;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfQuestion2MaternityYesNo);
        _tmpQuestion2MaternityYesNo = _tmp_1 != 0;
        final boolean _tmpQuestion2GeneralWardYesNo;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfQuestion2GeneralWardYesNo);
        _tmpQuestion2GeneralWardYesNo = _tmp_2 != 0;
        final boolean _tmpQuestion2DeliveryBedsYesNo;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfQuestion2DeliveryBedsYesNo);
        _tmpQuestion2DeliveryBedsYesNo = _tmp_3 != 0;
        final boolean _tmpQuestion2FamilyPlanningServicesYesNo;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfQuestion2FamilyPlanningServicesYesNo);
        _tmpQuestion2FamilyPlanningServicesYesNo = _tmp_4 != 0;
        final boolean _tmpQuestion2HIVCounsellingTestingAndTreatmentYesNo;
        final int _tmp_5;
        _tmp_5 = _cursor.getInt(_cursorIndexOfQuestion2HIVCounsellingTestingAndTreatmentYesNo);
        _tmpQuestion2HIVCounsellingTestingAndTreatmentYesNo = _tmp_5 != 0;
        final boolean _tmpQuestion2PMTCTYesNo;
        final int _tmp_6;
        _tmp_6 = _cursor.getInt(_cursorIndexOfQuestion2PMTCTYesNo);
        _tmpQuestion2PMTCTYesNo = _tmp_6 != 0;
        final boolean _tmpQuestion2ImmunizationYesNo;
        final int _tmp_7;
        _tmp_7 = _cursor.getInt(_cursorIndexOfQuestion2ImmunizationYesNo);
        _tmpQuestion2ImmunizationYesNo = _tmp_7 != 0;
        final boolean _tmpQuestion2YouthFriendlyCornersYesNo;
        final int _tmp_8;
        _tmp_8 = _cursor.getInt(_cursorIndexOfQuestion2YouthFriendlyCornersYesNo);
        _tmpQuestion2YouthFriendlyCornersYesNo = _tmp_8 != 0;
        final boolean _tmpQuestion2Vaccination4HEPBYesNo;
        final int _tmp_9;
        _tmp_9 = _cursor.getInt(_cursorIndexOfQuestion2Vaccination4HEPBYesNo);
        _tmpQuestion2Vaccination4HEPBYesNo = _tmp_9 != 0;
        final int _tmpQuestion21CategoryLiveNumberDeliveries;
        _tmpQuestion21CategoryLiveNumberDeliveries = _cursor.getInt(_cursorIndexOfQuestion21CategoryLiveNumberDeliveries);
        final int _tmpQuestion21CategoryStillNumberDeliveries;
        _tmpQuestion21CategoryStillNumberDeliveries = _cursor.getInt(_cursorIndexOfQuestion21CategoryStillNumberDeliveries);
        final int _tmpQuestion22ChildrenImmunized;
        _tmpQuestion22ChildrenImmunized = _cursor.getInt(_cursorIndexOfQuestion22ChildrenImmunized);
        final int _tmpQuestion3ToiletNumberBlocks;
        _tmpQuestion3ToiletNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion3ToiletNumberBlocks);
        final int _tmpQuestion3ToiletNumberInstances;
        _tmpQuestion3ToiletNumberInstances = _cursor.getInt(_cursorIndexOfQuestion3ToiletNumberInstances);
        final int _tmpQuestion3PatientToiletNumberMaleStances;
        _tmpQuestion3PatientToiletNumberMaleStances = _cursor.getInt(_cursorIndexOfQuestion3PatientToiletNumberMaleStances);
        final int _tmpQuestion3PatientToiletNumberFemaleStances;
        _tmpQuestion3PatientToiletNumberFemaleStances = _cursor.getInt(_cursorIndexOfQuestion3PatientToiletNumberFemaleStances);
        final int _tmpQuestion3HealthStaffNumberToiletMaleStance;
        _tmpQuestion3HealthStaffNumberToiletMaleStance = _cursor.getInt(_cursorIndexOfQuestion3HealthStaffNumberToiletMaleStance);
        final int _tmpQuestion3HealthStaffNumberToiletFemaleStances;
        _tmpQuestion3HealthStaffNumberToiletFemaleStances = _cursor.getInt(_cursorIndexOfQuestion3HealthStaffNumberToiletFemaleStances);
        final int _tmpQuestion3HealthStaffNumberToiletMixedStances;
        _tmpQuestion3HealthStaffNumberToiletMixedStances = _cursor.getInt(_cursorIndexOfQuestion3HealthStaffNumberToiletMixedStances);
        final int _tmpQuestion3ToiletFunctionalNumber;
        _tmpQuestion3ToiletFunctionalNumber = _cursor.getInt(_cursorIndexOfQuestion3ToiletFunctionalNumber);
        final int _tmpQuestion3ToiletNonFunctionNumber;
        _tmpQuestion3ToiletNonFunctionNumber = _cursor.getInt(_cursorIndexOfQuestion3ToiletNonFunctionNumber);
        final int _tmpQuestion3LatrineNumberBlocks;
        _tmpQuestion3LatrineNumberBlocks = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberBlocks);
        final int _tmpQuestion3LatrineNumberStances;
        _tmpQuestion3LatrineNumberStances = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberStances);
        final int _tmpQuestion3LatrineNumberMaleStances;
        _tmpQuestion3LatrineNumberMaleStances = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberMaleStances);
        final int _tmpQuestion3LatrineNumberFemaleStances;
        _tmpQuestion3LatrineNumberFemaleStances = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberFemaleStances);
        final int _tmpQuestion3LatrineNumberPatientMaleStances;
        _tmpQuestion3LatrineNumberPatientMaleStances = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberPatientMaleStances);
        final int _tmpQuestion3LatrineNumberStaffMaleStances;
        _tmpQuestion3LatrineNumberStaffMaleStances = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberStaffMaleStances);
        final int _tmpQuestion3LatrineNumberStaffFemaleStance;
        _tmpQuestion3LatrineNumberStaffFemaleStance = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberStaffFemaleStance);
        final int _tmpQuestion3LatrineNumberStaffMixedStances;
        _tmpQuestion3LatrineNumberStaffMixedStances = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberStaffMixedStances);
        final int _tmpQuestion3LatrineNumberFunctional;
        _tmpQuestion3LatrineNumberFunctional = _cursor.getInt(_cursorIndexOfQuestion3LatrineNumberFunctional);
        final int _tmpQuestion3LatrineNoneFunctional;
        _tmpQuestion3LatrineNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion3LatrineNoneFunctional);
        final int _tmpQuestion3FCRNumberBlock;
        _tmpQuestion3FCRNumberBlock = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberBlock);
        final int _tmpQuestion3FCRNumberStances;
        _tmpQuestion3FCRNumberStances = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberStances);
        final int _tmpQuestion3FCRNumberFemaleStances;
        _tmpQuestion3FCRNumberFemaleStances = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberFemaleStances);
        final int _tmpQuestion3FCRNumberStaffFemaleStances;
        _tmpQuestion3FCRNumberStaffFemaleStances = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberStaffFemaleStances);
        final int _tmpQuestion3FCRNumberStaffMixedStances;
        _tmpQuestion3FCRNumberStaffMixedStances = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberStaffMixedStances);
        final int _tmpQuestion3FCRNumberFunctionalStances;
        _tmpQuestion3FCRNumberFunctionalStances = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberFunctionalStances);
        final int _tmpQuestion3FCRNumberNoneFunction;
        _tmpQuestion3FCRNumberNoneFunction = _cursor.getInt(_cursorIndexOfQuestion3FCRNumberNoneFunction);
        final String _tmpQuestion32HealthFacilityToiletReasonFacilities;
        _tmpQuestion32HealthFacilityToiletReasonFacilities = _cursor.getString(_cursorIndexOfQuestion32HealthFacilityToiletReasonFacilities);
        final boolean _tmpQuestion31HealthFacilityToiletFacilities;
        final int _tmp_10;
        _tmp_10 = _cursor.getInt(_cursorIndexOfQuestion31HealthFacilityToiletFacilities);
        _tmpQuestion31HealthFacilityToiletFacilities = _tmp_10 != 0;
        final int _tmpQuestion4NumberOfBoreHole;
        _tmpQuestion4NumberOfBoreHole = _cursor.getInt(_cursorIndexOfQuestion4NumberOfBoreHole);
        final int _tmpQuestion4NumberOfBoreHoleFunctional;
        _tmpQuestion4NumberOfBoreHoleFunctional = _cursor.getInt(_cursorIndexOfQuestion4NumberOfBoreHoleFunctional);
        final int _tmpQuestion4NumberOfBoreHoleNoneFunctional;
        _tmpQuestion4NumberOfBoreHoleNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion4NumberOfBoreHoleNoneFunctional);
        final int _tmpQuestion4NumberOfTap;
        _tmpQuestion4NumberOfTap = _cursor.getInt(_cursorIndexOfQuestion4NumberOfTap);
        final int _tmpQuestion4NumberOfTapFunctional;
        _tmpQuestion4NumberOfTapFunctional = _cursor.getInt(_cursorIndexOfQuestion4NumberOfTapFunctional);
        final int _tmpQuestion4NumberOfTapNoneFunctional;
        _tmpQuestion4NumberOfTapNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion4NumberOfTapNoneFunctional);
        final int _tmpQuestion4NumberOfWaterTank;
        _tmpQuestion4NumberOfWaterTank = _cursor.getInt(_cursorIndexOfQuestion4NumberOfWaterTank);
        final int _tmpQuestion4NumberOfWaterTankFunctional;
        _tmpQuestion4NumberOfWaterTankFunctional = _cursor.getInt(_cursorIndexOfQuestion4NumberOfWaterTankFunctional);
        final int _tmpQuestion4NumberOfWaterTankNoneFunctional;
        _tmpQuestion4NumberOfWaterTankNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion4NumberOfWaterTankNoneFunctional);
        final String _tmpQuestion4OtherName;
        _tmpQuestion4OtherName = _cursor.getString(_cursorIndexOfQuestion4OtherName);
        final int _tmpQuestion4OtherNumber;
        _tmpQuestion4OtherNumber = _cursor.getInt(_cursorIndexOfQuestion4OtherNumber);
        final int _tmpQuestion4OtherNumberFunctional;
        _tmpQuestion4OtherNumberFunctional = _cursor.getInt(_cursorIndexOfQuestion4OtherNumberFunctional);
        final int _tmpQuestion4OtherNumberNoneFunctional;
        _tmpQuestion4OtherNumberNoneFunctional = _cursor.getInt(_cursorIndexOfQuestion4OtherNumberNoneFunctional);
        final boolean _tmpQuestion41WaterPointAccessible;
        final int _tmp_11;
        _tmp_11 = _cursor.getInt(_cursorIndexOfQuestion41WaterPointAccessible);
        _tmpQuestion41WaterPointAccessible = _tmp_11 != 0;
        final boolean _tmpQuestion43FunctionalWaterPoint;
        final int _tmp_12;
        _tmp_12 = _cursor.getInt(_cursorIndexOfQuestion43FunctionalWaterPoint);
        _tmpQuestion43FunctionalWaterPoint = _tmp_12 != 0;
        final String _tmpQuestion43IfNoneReason;
        _tmpQuestion43IfNoneReason = _cursor.getString(_cursorIndexOfQuestion43IfNoneReason);
        final boolean _tmpQuestion44HandWashingInstalled;
        final int _tmp_13;
        _tmp_13 = _cursor.getInt(_cursorIndexOfQuestion44HandWashingInstalled);
        _tmpQuestion44HandWashingInstalled = _tmp_13 != 0;
        final boolean _tmpQuestion51HealthUnitManagementCommittee;
        final int _tmp_14;
        _tmp_14 = _cursor.getInt(_cursorIndexOfQuestion51HealthUnitManagementCommittee);
        _tmpQuestion51HealthUnitManagementCommittee = _tmp_14 != 0;
        final String _tmpQuestion52HowOftenTheyMeet;
        _tmpQuestion52HowOftenTheyMeet = _cursor.getString(_cursorIndexOfQuestion52HowOftenTheyMeet);
        final String _tmpQuestion53LastVisitSupportSupervisor;
        _tmpQuestion53LastVisitSupportSupervisor = _cursor.getString(_cursorIndexOfQuestion53LastVisitSupportSupervisor);
        final int _tmpQuestion6MedicalStaffCeilingNumber;
        _tmpQuestion6MedicalStaffCeilingNumber = _cursor.getInt(_cursorIndexOfQuestion6MedicalStaffCeilingNumber);
        final int _tmpQuestion6MedicalTotalNumberStaff;
        _tmpQuestion6MedicalTotalNumberStaff = _cursor.getInt(_cursorIndexOfQuestion6MedicalTotalNumberStaff);
        final int _tmpQuestion6MedicalNumberStuffPresent;
        _tmpQuestion6MedicalNumberStuffPresent = _cursor.getInt(_cursorIndexOfQuestion6MedicalNumberStuffPresent);
        final int _tmpQuestion6NoneMedicalStaffCeilingNumber;
        _tmpQuestion6NoneMedicalStaffCeilingNumber = _cursor.getInt(_cursorIndexOfQuestion6NoneMedicalStaffCeilingNumber);
        final int _tmpQuestion6NoneMedicalStaffTotalNumberStaff;
        _tmpQuestion6NoneMedicalStaffTotalNumberStaff = _cursor.getInt(_cursorIndexOfQuestion6NoneMedicalStaffTotalNumberStaff);
        final int _tmpQuestion6NoneMedicalNumberStaffPresent;
        _tmpQuestion6NoneMedicalNumberStaffPresent = _cursor.getInt(_cursorIndexOfQuestion6NoneMedicalNumberStaffPresent);
        final String _tmpQuestion6ReasonsForStaffAbsence;
        _tmpQuestion6ReasonsForStaffAbsence = _cursor.getString(_cursorIndexOfQuestion6ReasonsForStaffAbsence);
        final String _tmpQuestion6LastDatePerformanceAppraisal;
        _tmpQuestion6LastDatePerformanceAppraisal = _cursor.getString(_cursorIndexOfQuestion6LastDatePerformanceAppraisal);
        final int _tmpQuestion6NumberOfStaffAppraised;
        _tmpQuestion6NumberOfStaffAppraised = _cursor.getInt(_cursorIndexOfQuestion6NumberOfStaffAppraised);
        final boolean _tmpQuestion7HCReceiveMedicalSupplies;
        final int _tmp_15;
        _tmp_15 = _cursor.getInt(_cursorIndexOfQuestion7HCReceiveMedicalSupplies);
        _tmpQuestion7HCReceiveMedicalSupplies = _tmp_15 != 0;
        final String _tmpQuestion7HCReceiveMedicalSuppliesIfNo;
        _tmpQuestion7HCReceiveMedicalSuppliesIfNo = _cursor.getString(_cursorIndexOfQuestion7HCReceiveMedicalSuppliesIfNo);
        final String _tmpQuestion72EssentialDrug1Name;
        _tmpQuestion72EssentialDrug1Name = _cursor.getString(_cursorIndexOfQuestion72EssentialDrug1Name);
        final int _tmpQuestion72EssentialDrug1RequiredStock;
        _tmpQuestion72EssentialDrug1RequiredStock = _cursor.getInt(_cursorIndexOfQuestion72EssentialDrug1RequiredStock);
        final String _tmpQuestion72EssentialDrug2Name;
        _tmpQuestion72EssentialDrug2Name = _cursor.getString(_cursorIndexOfQuestion72EssentialDrug2Name);
        final int _tmpQuestion72EssentialDrug2RequiredStock;
        _tmpQuestion72EssentialDrug2RequiredStock = _cursor.getInt(_cursorIndexOfQuestion72EssentialDrug2RequiredStock);
        final String _tmpQuestion72EssentialDrug3Name;
        _tmpQuestion72EssentialDrug3Name = _cursor.getString(_cursorIndexOfQuestion72EssentialDrug3Name);
        final int _tmpQuestion72EssentialDrug3RequiredStock;
        _tmpQuestion72EssentialDrug3RequiredStock = _cursor.getInt(_cursorIndexOfQuestion72EssentialDrug3RequiredStock);
        final String _tmpQuestion72EssentialDrug4Name;
        _tmpQuestion72EssentialDrug4Name = _cursor.getString(_cursorIndexOfQuestion72EssentialDrug4Name);
        final int _tmpQuestion72EssentialDrug4RequiredStock;
        _tmpQuestion72EssentialDrug4RequiredStock = _cursor.getInt(_cursorIndexOfQuestion72EssentialDrug4RequiredStock);
        final String _tmpQuestion72EssentialDrug5Name;
        _tmpQuestion72EssentialDrug5Name = _cursor.getString(_cursorIndexOfQuestion72EssentialDrug5Name);
        final int _tmpQuestion72EssentialDrug5RequiredStock;
        _tmpQuestion72EssentialDrug5RequiredStock = _cursor.getInt(_cursorIndexOfQuestion72EssentialDrug5RequiredStock);
        final String _tmpQuestion73HCLastDrugsConsignment;
        _tmpQuestion73HCLastDrugsConsignment = _cursor.getString(_cursorIndexOfQuestion73HCLastDrugsConsignment);
        final int _tmpQuestion74NumberMedicalEquipmentBrought;
        _tmpQuestion74NumberMedicalEquipmentBrought = _cursor.getInt(_cursorIndexOfQuestion74NumberMedicalEquipmentBrought);
        final boolean _tmpQuestion75HaveAmbulance;
        final int _tmp_16;
        _tmp_16 = _cursor.getInt(_cursorIndexOfQuestion75HaveAmbulance);
        _tmpQuestion75HaveAmbulance = _tmp_16 != 0;
        final String _tmpQuestion76Referrals;
        _tmpQuestion76Referrals = _cursor.getString(_cursorIndexOfQuestion76Referrals);
        final String _tmpQuestion80ChallengesAndObservation;
        _tmpQuestion80ChallengesAndObservation = _cursor.getString(_cursorIndexOfQuestion80ChallengesAndObservation);
        _item = new HealthQuestion(_tmpFinancialYear,_tmpFinancialYearQuarter,_tmpData,_tmpDistrict,_tmpVillage,_tmpParish,_tmpTownCouncil,_tmpNameMonitorAgent,_tmpTelNumber,_tmpQuestionANameAndGradeHealthCenter,_tmpQuestionBOutPatientOPDAttendance,_tmpQuestionCInPatientAttendance,_tmpQuestion1RecurrentApprovedBudget,_tmpQuestion1RecurrentBudgetReleased,_tmpQuestion1RecurrentDateReceived,_tmpQuestion1RecurrentDateWithdrawn,_tmpQuestion1DevelopmentApprovedBudget,_tmpQuestion1DevelopmentReleasedBudget,_tmpQuestion1DevelopmentDateReceived,_tmpQuestion1DevelopmentDateWithdrawn,_tmpQuestion11DisplayBudgetInformation,_tmpQuestion12BudgetInformationRelates,_tmpQuestion2MaternityYesNo,_tmpQuestion2GeneralWardYesNo,_tmpQuestion2DeliveryBedsYesNo,_tmpQuestion2FamilyPlanningServicesYesNo,_tmpQuestion2HIVCounsellingTestingAndTreatmentYesNo,_tmpQuestion2PMTCTYesNo,_tmpQuestion2ImmunizationYesNo,_tmpQuestion2YouthFriendlyCornersYesNo,_tmpQuestion2Vaccination4HEPBYesNo,_tmpQuestion21CategoryLiveNumberDeliveries,_tmpQuestion21CategoryStillNumberDeliveries,_tmpQuestion22ChildrenImmunized,_tmpQuestion3ToiletNumberBlocks,_tmpQuestion3ToiletNumberInstances,_tmpQuestion3PatientToiletNumberMaleStances,_tmpQuestion3PatientToiletNumberFemaleStances,_tmpQuestion3HealthStaffNumberToiletMaleStance,_tmpQuestion3HealthStaffNumberToiletFemaleStances,_tmpQuestion3HealthStaffNumberToiletMixedStances,_tmpQuestion3ToiletFunctionalNumber,_tmpQuestion3ToiletNonFunctionNumber,_tmpQuestion3LatrineNumberBlocks,_tmpQuestion3LatrineNumberStances,_tmpQuestion3LatrineNumberMaleStances,_tmpQuestion3LatrineNumberFemaleStances,_tmpQuestion3LatrineNumberPatientMaleStances,_tmpQuestion3LatrineNumberStaffMaleStances,_tmpQuestion3LatrineNumberStaffFemaleStance,_tmpQuestion3LatrineNumberStaffMixedStances,_tmpQuestion3LatrineNumberFunctional,_tmpQuestion3LatrineNoneFunctional,_tmpQuestion3FCRNumberBlock,_tmpQuestion3FCRNumberStances,_tmpQuestion3FCRNumberFemaleStances,_tmpQuestion3FCRNumberStaffFemaleStances,_tmpQuestion3FCRNumberStaffMixedStances,_tmpQuestion3FCRNumberFunctionalStances,_tmpQuestion3FCRNumberNoneFunction,_tmpQuestion32HealthFacilityToiletReasonFacilities,_tmpQuestion31HealthFacilityToiletFacilities,_tmpQuestion4NumberOfBoreHole,_tmpQuestion4NumberOfBoreHoleFunctional,_tmpQuestion4NumberOfBoreHoleNoneFunctional,_tmpQuestion4NumberOfTap,_tmpQuestion4NumberOfTapFunctional,_tmpQuestion4NumberOfTapNoneFunctional,_tmpQuestion4NumberOfWaterTank,_tmpQuestion4NumberOfWaterTankFunctional,_tmpQuestion4NumberOfWaterTankNoneFunctional,_tmpQuestion4OtherName,_tmpQuestion4OtherNumber,_tmpQuestion4OtherNumberFunctional,_tmpQuestion4OtherNumberNoneFunctional,_tmpQuestion41WaterPointAccessible,_tmpQuestion43FunctionalWaterPoint,_tmpQuestion43IfNoneReason,_tmpQuestion44HandWashingInstalled,_tmpQuestion51HealthUnitManagementCommittee,_tmpQuestion52HowOftenTheyMeet,_tmpQuestion53LastVisitSupportSupervisor,_tmpQuestion6MedicalStaffCeilingNumber,_tmpQuestion6MedicalTotalNumberStaff,_tmpQuestion6MedicalNumberStuffPresent,_tmpQuestion6NoneMedicalStaffCeilingNumber,_tmpQuestion6NoneMedicalStaffTotalNumberStaff,_tmpQuestion6NoneMedicalNumberStaffPresent,_tmpQuestion6ReasonsForStaffAbsence,_tmpQuestion6LastDatePerformanceAppraisal,_tmpQuestion6NumberOfStaffAppraised,_tmpQuestion7HCReceiveMedicalSupplies,_tmpQuestion7HCReceiveMedicalSuppliesIfNo,_tmpQuestion72EssentialDrug1Name,_tmpQuestion72EssentialDrug1RequiredStock,_tmpQuestion72EssentialDrug2Name,_tmpQuestion72EssentialDrug2RequiredStock,_tmpQuestion72EssentialDrug3Name,_tmpQuestion72EssentialDrug3RequiredStock,_tmpQuestion72EssentialDrug4Name,_tmpQuestion72EssentialDrug4RequiredStock,_tmpQuestion72EssentialDrug5Name,_tmpQuestion72EssentialDrug5RequiredStock,_tmpQuestion73HCLastDrugsConsignment,_tmpQuestion74NumberMedicalEquipmentBrought,_tmpQuestion75HaveAmbulance,_tmpQuestion76Referrals,_tmpQuestion80ChallengesAndObservation);
        final int _tmpPrimaryKey;
        _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
        _item.setPrimaryKey(_tmpPrimaryKey);
        final boolean _tmpIsLocallyStored;
        final int _tmp_17;
        _tmp_17 = _cursor.getInt(_cursorIndexOfIsLocallyStored);
        _tmpIsLocallyStored = _tmp_17 != 0;
        _item.setLocallyStored(_tmpIsLocallyStored);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
