package org.ygba.youthgobudget.data.health;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
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
    final String _sql = "SELECT * FROM health_table WHERE IS_LOCALLY_STORED :=is_stored_locally";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    int _argIndex = 1;
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
