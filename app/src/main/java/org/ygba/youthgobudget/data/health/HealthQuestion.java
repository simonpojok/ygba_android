package org.ygba.youthgobudget.data.health;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = HealthQuestionConstants.TABLE_NAME)
public class HealthQuestion {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = HealthQuestionConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = HealthQuestionConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = HealthQuestionConstants.FINANCIAL_QUARTER)
    private String financialYearQuarter;

    @ColumnInfo(name = HealthQuestionConstants.DATE)
    private String data;

    @ColumnInfo(name = HealthQuestionConstants.DISTRICT_NAME)
    private String district;

    @ColumnInfo(name = HealthQuestionConstants.VILLAGE_NAME)
    private String village;

    @ColumnInfo(name = HealthQuestionConstants.PARISH_NAME)
    private String parish;

    @ColumnInfo(name = HealthQuestionConstants.TOWN_COUNCIL)
    private String townCouncil;

    @ColumnInfo(name = HealthQuestionConstants.NAME_MONITOR_AGENT)
    private String nameMonitorAgent;

    @ColumnInfo(name = HealthQuestionConstants.TEL_NUMBER)
    private String telNumber;

    @ColumnInfo(name = HealthQuestionConstants.NAME_AND_GRADE_HEALTH_CENTER)
    private String questionANameAndGradeHealthCenter;

    @ColumnInfo(name = HealthQuestionConstants.NUMBER_OUT_PATIENTS_QUESTION_B)
    private int questionBOutPatientOPDAttendance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_C_IN_PATIENT)
    private int questionCInPatientAttendance;

    @ColumnInfo(name = HealthQuestionConstants.QUESYION_1_RECURRENT_APPROVED_BUDGET)
    private int question1RecurrentApprovedBudget;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_RECURRENT_BUDGET_RECIEVED)
    private int question1RecurrentBudgetReleased;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_RECURRENT_DATE_RECIEVED)
    private String question1RecurrentDateReceived;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_RECURRENT_DATE_WITHDRAWN)
    private String question1RecurrentDateWithdrawn;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOPMENT_APPROVED_BUDGET)
    private int question1DevelopmentApprovedBudget;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOPMENT_RELEASED_BUDGET)
    private int question1DevelopmentReleasedBudget;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOMENT_DATE_RECIEVED)
    private String question1DevelopmentDateReceived;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_DEVELOPMENT_DATE_WITHDRAWN)
    private String question1DevelopmentDateWithdrawn;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_1_DISPLAY_AREA)
    private String question11DisplayBudgetInformation;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_1_2_DISPLAY_INFORMATION_RELATES)
    private String question12BudgetInformationRelates;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_MATERNITY_YES_NO)
    private boolean question2MaternityYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_GENERAL_WARD_YES_NO)
    private boolean question2GeneralWardYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_DELIVERY_YES_NO)
    private boolean question2DeliveryBedsYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_FAMILY_PLANNING_YES_NO)
    private boolean question2FamilyPlanningServicesYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_HIV_TESTING_AND_TREACTMENT)
    private boolean question2HIVCounsellingTestingAndTreatmentYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_PMTCT)
    private boolean question2PMTCTYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_IMMUNIZATION_YES_NO)
    private boolean question2ImmunizationYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_YOUTH_FRIENDLY_CORNERS_YES_NO)
    private boolean question2YouthFriendlyCornersYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_HEP_B_YES_NO)
    private boolean question2Vaccination4HEPBYesNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_1_CATEGORY_LIVE_NUMBER)
    private int question21CategoryLiveNumberDeliveries;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_1_CATEGORY_STILL_NUMBER)
    private int question21CategoryStillNumberDeliveries;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_2_2_NUMBER_CHILDREN_IMMUNIZED)
    private int question22ChildrenImmunized;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_TOILET_NUMBER_BLOCKS)
    private int question3ToiletNumberBlocks;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_TOILET_NUMBER_INSTANCES)
    private int question3ToiletNumberInstances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_PATIENT_NUMBER_MALE_STANCES)
    private int question3PatientToiletNumberMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_PATIENT_NUMBER_STANCES)
    private int question3PatientToiletNumberFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_HEALTH_STAFF_NUMBER_MALE_STANCES)
    private int question3HealthStaffNumberToiletMaleStance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_HEALTH_STAFF_NUMBER_FEMALE_STANCES)
    private int question3HealthStaffNumberToiletFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_HEALTH_MIXED_NUMBER_STANCES)
    private int question3HealthStaffNumberToiletMixedStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_4_TOILET_NUMBER_FUNCTIONAL)
    private int question3ToiletFunctionalNumber;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_TOILET_NONE_FUNCTION_NUMBER)
    private int question3ToiletNonFunctionNumber;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_BLOCKS)
    private int question3LatrineNumberBlocks;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_STANCES)
    private int question3LatrineNumberStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_MALE_STANCES)
    private int question3LatrineNumberMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_FEMALE_STANCES)
    private int question3LatrineNumberFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_PATIENTS_NUMBER_MALE_STANCES)
    private int question3LatrineNumberPatientMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_STAFF_NUMBER_MALE_STANCES)
    private int question3LatrineNumberStaffMaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_STAFF_NUMBER_FEMALE_STANCES)
    private int question3LatrineNumberStaffFemaleStance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_STAFF_MIXED_STANCES)
    private int question3LatrineNumberStaffMixedStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_NON_FUNCTIONAL)
    private int question3LatrineNumberFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_LATRINE_NUMBER_NONE_FUNCTIONAL)
    private int question3LatrineNoneFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCM_NUMBER_BLOCKS)
    private int question3FCRNumberBlock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCM_NUMBER_STANCES)
    private int question3FCRNumberStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FEM_NUMBER_FEMALE_STANCES)
    private int question3FCRNumberFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCM_STAFF_NUMBER_STANCES)
    private int question3FCRNumberStaffFemaleStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_STAFF_MIXED_STANCES)
    private int question3FCRNumberStaffMixedStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_FUNCTION)
    private int question3FCRNumberFunctionalStances;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_NONE_FUNCTION)
    private int question3FCRNumberNoneFunction;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_0_FCR_REASON_PWD_FRIENDLY)
    private String question32HealthFacilityToiletReasonFacilities;


    @ColumnInfo(name = HealthQuestionConstants.QUESTION_3_1_HEALTH_FACILITY_FACILITIES)
    private boolean question31HealthFacilityToiletFacilities;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_BORE_HOLE)
    private int question4NumberOfBoreHole;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_BORE_HOLE_FUNCTIONAL)
    private int question4NumberOfBoreHoleFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_BORE_HOLE_NONE_FUNCTIONAL)
    private int question4NumberOfBoreHoleNoneFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_TOP)
    private int question4NumberOfTap;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_TOP_FUNCTIONAL)
    private int question4NumberOfTapFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_TOP_NONE_FUNCTIONAL)
    private int question4NumberOfTapNoneFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_WATER_TANK)
    private int question4NumberOfWaterTank;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_WATER_TANK_FUNCTIONAL)
    private int question4NumberOfWaterTankFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_WATER_TANK_NONE_FUNCTIONAL)
    private int question4NumberOfWaterTankNoneFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NAME_OF_OTHERS)
    private String question4OtherName;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_OTHERS)
    private int question4OtherNumber;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_OTHERS_FUNCTIONAL)
    private int question4OtherNumberFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_NUMBER_OF_OTHERS_NONE_FUNCTIONAL)
    private int question4OtherNumberNoneFunctional;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_1_POIN_ACCESSIBLE_PWD)
    private boolean question41WaterPointAccessible;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_3_FUNCTIONAL_WATER_POINT)
    private boolean question43FunctionalWaterPoint;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_3_OBJECTIVE_REASON)
    private String question43IfNoneReason;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_4_4_HAND_WASHING_INSTALLED)
    private boolean question44HandWashingInstalled;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_5_1_HEALTH_UNIT_MANAGEMENT_COMMITTE)
    private boolean question51HealthUnitManagementCommittee;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_5_2_HOW_OFTEN_THEY_MEET)
    private String question52HowOftenTheyMeet;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_5_3_LAST_SUPPORT_SUPERVISOR_VISIT)
    private String question53LastVisitSupportSupervisor;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_MEDICAL_STAFF_CEILING_NUMBER)
    private int question6MedicalStaffCeilingNumber;


    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_MEDICAL_TOTAL_NUMBER_STAFF)
    private int question6MedicalTotalNumberStaff;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_MEDICAL_NUMBER_STAFF_PRESENT)
    private int question6MedicalNumberStuffPresent;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_NONE_MEDICAL_STAFF_CEILING_NUMBER)
    private int question6NoneMedicalStaffCeilingNumber;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_NONE_MEDICAL_TOTAL_NUMBER_STAFF)
    private int question6NoneMedicalStaffTotalNumberStaff;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_NONE_MEDICAL_STAFF_PRESENT)
    private int question6NoneMedicalNumberStaffPresent;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_REASON_FOR_ABSENCE)
    private String question6ReasonsForStaffAbsence;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_LAST_DATE_OF_APPRAISAL)
    private String question6LastDatePerformanceAppraisal;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_6_NUMBER_OFF_STAFF_APPRAISED)
    private int question6NumberOfStaffAppraised;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY)
    private boolean question7HCReceiveMedicalSupplies;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_1_HC_RECIEVE_MEDICAL_SUPPLY_IF_NO)
    private String question7HCReceiveMedicalSuppliesIfNo;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_1_NAME)
    private String question72EssentialDrug1Name;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_1_REQUIRED_STOCK)
    private int question72EssentialDrug1RequiredStock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_2_NAME)
    private String question72EssentialDrug2Name;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_2_REQUIRED_STOCK)
    private int question72EssentialDrug2RequiredStock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_3_NAME)
    private String question72EssentialDrug3Name;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_3_REQUIRED_STOCK)
    private int question72EssentialDrug3RequiredStock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_4_NAME)
    private String question72EssentialDrug4Name;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_4_REQUIRED_STOCK)
    private int question72EssentialDrug4RequiredStock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_5_NAME)
    private String question72EssentialDrug5Name;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_2_ESSENTIAL_DRUG_5_REQUIRED_STOCK)
    private int question72EssentialDrug5RequiredStock;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_3_HC_LAST_DRUGS_CONSIGNMENT)
    private String question73HCLastDrugsConsignment;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_4_NUMBER_MEDICAL_EQUIPMENT_BOUGHT)
    private int question74NumberMedicalEquipmentBrought;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_5_AMBULANCE)
    private boolean question75HaveAmbulance;

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_7_6_REFERRALS_HANDLED)
    private String question76Referrals; // professional my first project, personnal learn and master react native and wordpress as i work on those projects

    @ColumnInfo(name = HealthQuestionConstants.QUESTION_8_0_OBSERVATIONS_AND_CHALLENGES)
    private String question80ChallengesAndObservation;

    @ColumnInfo(name = HealthQuestionConstants.IS_LOCALLY_STORED)
    private boolean isLocallyStored;

    @Ignore
    private HealthQuestion() {}

    public static class Builder {
        private final HealthQuestion INSTANCE;

        public Builder() {
            INSTANCE = new HealthQuestion();
        }

        public HealthQuestion build() {
            return INSTANCE;
        }

        public Builder setFinancialYear(String financialYear) {
            INSTANCE.setFinancialYear(financialYear);
            return this;
        }

        public Builder setFinancialYearQuarter(String quarter) {
            INSTANCE.setFinancialYearQuarter(quarter);
            return this;
        }

        public Builder setDate(String textValue) {
            INSTANCE.setData(textValue);
            return this;
        }

        public Builder setDistrict(String district_name) {
            INSTANCE.setDistrict(district_name);
            return this;
        }

        public Builder setVillage(String textValue) {
            INSTANCE.setVillage(textValue);
            return this;
        }

        public Builder setParish(String textValue) {
            INSTANCE.setParish(textValue);
            return this;
        }

        public Builder setSubCountyDivision(String textValue) {
            INSTANCE.setTownCouncil(textValue);
            return this;
        }

        public Builder setNameMonitorAgent(String textValue) {
            INSTANCE.setNameMonitorAgent(textValue);
            return this;
        }

        public Builder setTelNumber(String textValue) {
            INSTANCE.setTelNumber(textValue);
            return this;
        }

        public Builder setNameAndGradeHealthCenter(String textValue) {
            INSTANCE.setQuestionANameAndGradeHealthCenter(textValue);
            return this;
        }

        public Builder setQuestionBOutPatientOPD(int integerValue) {
            INSTANCE.setQuestionBOutPatientOPDAttendance(integerValue);
            return this;
        }

        public Builder setQuestionCInPatientAttendance(int integerValue) {
            INSTANCE.setQuestionCInPatientAttendance(integerValue);
            return this;
        }

        public Builder setQuestion1RecurrentApprovedBudget(int integerValue) {
            INSTANCE.setQuestion1RecurrentApprovedBudget(integerValue);
            return this;
        }

        public Builder setQuestion1RecurrentBudgetReleased(int integerValue) {
            INSTANCE.setQuestion1RecurrentBudgetReleased(integerValue);
            return this;
        }

        public Builder setQuestion1RecurrentDateReceived(String textValue) {
            INSTANCE.setQuestion1RecurrentDateReceived(textValue);
            return this;
        }

        public Builder setQuestion1RecurrentDateWithdrawn(String textValue) {
            INSTANCE.setQuestion1RecurrentDateWithdrawn(textValue);
            return this;
        }

        public Builder setQuestion1DevelopmentApprovedBudget(int integerValue) {
            INSTANCE.setQuestion1DevelopmentApprovedBudget(integerValue);
            return this;
        }

        public Builder setQuestion1DevelopmentReleasedBudget(int integerValue) {
            INSTANCE.setQuestion1DevelopmentReleasedBudget(integerValue);
            return this;
        }

        public Builder setQuestion1DevelopmentDateReceived(String textValue) {
            INSTANCE.setQuestion1DevelopmentDateReceived(textValue);
            return this;
        }

        public Builder setQuestion1DevelopmentDateWithdrawn(String textValue) {
            INSTANCE.setQuestion1DevelopmentDateWithdrawn(textValue);
            return this;
        }

        public Builder setQuestion11DisplayBudgetInformation(String display_area) {
            INSTANCE.setQuestion11DisplayBudgetInformation(display_area);
            return this;
        }

        public Builder setQuestion12BudgetInformationRelates(String textValue) {
            INSTANCE.setQuestion12BudgetInformationRelates(textValue);
            return this;
        }

        public Builder setQuestion2MaternityYesNo(boolean question2MaternityWardObjective) {
            INSTANCE.setQuestion2MaternityYesNo(question2MaternityWardObjective);
            return this;
        }

        public Builder setQuestion2GeneralWardYesNo(boolean question2GeneralWardObjective) {
            INSTANCE.setQuestion2GeneralWardYesNo(question2GeneralWardObjective);
            return this;
        }

        public Builder setQuestion2DeliveryBedsYesNo(boolean question2DeliveryBedsObjective) {
            INSTANCE.setQuestion2DeliveryBedsYesNo(question2DeliveryBedsObjective);
            return this;
        }

        public Builder setQuestion2FamilyPlanningServicesYesNo(boolean question2FamilyPlanningServicesObjective) {
            INSTANCE.setQuestion2FamilyPlanningServicesYesNo(question2FamilyPlanningServicesObjective);
            return this;
        }

        public Builder setQuestion2HIVCounsellingTestingAndTreatmentYesNo(boolean question2HIVCounsellingTestingObjective) {
            INSTANCE.setQuestion2HIVCounsellingTestingAndTreatmentYesNo(question2HIVCounsellingTestingObjective);
            return this;
        }

        public Builder setQuestion2PMTCTYesNo(boolean question2PMTCTObjective) {
            INSTANCE.setQuestion2PMTCTYesNo(question2PMTCTObjective);
            return this;
        }

        public Builder setQuestion2ImmunizationYesNo(boolean question2ImmunizationObjective) {
            INSTANCE.setQuestion2ImmunizationYesNo(question2ImmunizationObjective);
            return this;
        }

        public Builder setQuestion2YouthFriendlyCornersYesNo(boolean question2YouthFriendlyCornersObjective) {
            INSTANCE.setQuestion2YouthFriendlyCornersYesNo(question2YouthFriendlyCornersObjective);
            return this;
        }

        public Builder setQuestion2Vaccination4HEPBYesNo(boolean question2VaccinationHEPBObjective) {
            INSTANCE.setQuestion2Vaccination4HEPBYesNo(question2VaccinationHEPBObjective);
            return this;
        }

        public Builder setQuestion21CategoryLiveNumberDeliveries(int integerValue) {
            INSTANCE.setQuestion21CategoryLiveNumberDeliveries(integerValue);
            return this;
        }

        public Builder setQuestion21CategoryStillNumberDeliveries(int integerValue) {
            INSTANCE.setQuestion21CategoryStillNumberDeliveries(integerValue);
            return this;
        }

        public Builder setQuestion22ChildrenImmunized(int integerValue) {
            INSTANCE.setQuestion22ChildrenImmunized(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletNumberBlocks(int integerValue) {
            INSTANCE.setQuestion3ToiletNumberBlocks(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletNumberInstances(int integerValue) {
            INSTANCE.setQuestion3ToiletNumberInstances(integerValue);
            return this;
        }

        public Builder setQuestion3PatientToiletNumberMaleStances(int integerValue) {
            INSTANCE.setQuestion3PatientToiletNumberMaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3PatientToiletNumberFemaleStances(int integerValue) {
            INSTANCE.setQuestion3PatientToiletNumberFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3HealthStaffNumberToiletMaleStance(int integerValue) {
            INSTANCE.setQuestion3HealthStaffNumberToiletMaleStance(integerValue);
            return this;
        }

        public Builder setQuestion3HealthStaffNumberToiletFemaleStances(int integerValue) {
            INSTANCE.setQuestion3HealthStaffNumberToiletFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3HealthStaffNumberToiletMixedStances(int integerValue) {
            INSTANCE.setQuestion3HealthStaffNumberToiletMixedStances(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletFunctionalNumber(int integerValue) {
            INSTANCE.setQuestion3ToiletFunctionalNumber(integerValue);
            return this;
        }

        public Builder setQuestion3ToiletNonFunctionNumber(int integerValue) {
            INSTANCE.setQuestion3ToiletNonFunctionNumber(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberBlocks(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberBlocks(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberMaleStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberMaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberFemaleStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStaffMaleStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStaffMaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStaffFemaleStance(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStaffFemaleStance(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberStaffMixedStances(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberStaffMixedStances(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNumberNumberFunctional(int integerValue) {
            INSTANCE.setQuestion3LatrineNumberFunctional(integerValue);
            return this;
        }

        public Builder setQuestion3LatrineNoneFunctional(int integerValue) {
            INSTANCE.setQuestion3LatrineNoneFunctional(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberBlock(int integerValue) {
            INSTANCE.setQuestion3FCRNumberBlock(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberFemaleStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberStaffFemaleStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberStaffFemaleStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberStaffMixedStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberStaffMixedStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberFunctionalStances(int integerValue) {
            INSTANCE.setQuestion3FCRNumberFunctionalStances(integerValue);
            return this;
        }

        public Builder setQuestion3FCRNumberNoneFunction(int integerValue) {
            INSTANCE.setQuestion3FCRNumberNoneFunction(integerValue);
            return this;
        }

        public Builder setQuestion31HealthFacilityToiletFacilities(boolean question31ToiletObjective) {
            INSTANCE.setQuestion31HealthFacilityToiletFacilities(question31ToiletObjective);
            return this;
        }

        public Builder setQuestion32HealthFacilityToiletReasonFacilities(String reasons) {
            INSTANCE.setQuestion32HealthFacilityToiletReasonFacilities(reasons);
            return this;
        }

        public Builder setQuestion4NumberOfBoreHole(int integerValue) {
            INSTANCE.setQuestion4NumberOfBoreHole(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfBoreHoleFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfBoreHoleFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfBoreHoleNoneFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfBoreHoleNoneFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfTap(int integerValue) {
            INSTANCE.setQuestion4NumberOfTap(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfTapFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfTapFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfTapNoneFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfTapNoneFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfWaterTank(int integerValue) {
            INSTANCE.setQuestion4NumberOfWaterTank(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfWaterTankFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfWaterTankFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4NumberOfWaterTankNoneFunctional(int integerValue) {
            INSTANCE.setQuestion4NumberOfWaterTankNoneFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4OtherName(String textValue) {
            INSTANCE.setQuestion4OtherName(textValue);
            return this;
        }

        public Builder setQuestion4OtherNumber(int integerValue) {
            INSTANCE.setQuestion4OtherNumber(integerValue);
            return this;
        }

        public Builder setQuestion4OtherNumberFunctional(int integerValue) {
            INSTANCE.setQuestion4OtherNumberFunctional(integerValue);
            return this;
        }

        public Builder setQuestion4OtherNumberNoneFunctional(int integerValue) {
            INSTANCE.setQuestion4OtherNumberNoneFunctional(integerValue);
            return this;
        }

        public Builder setQuestion41WaterPointAccessible(boolean question41WaterPointObjective) {
            INSTANCE.setQuestion41WaterPointAccessible(question41WaterPointObjective);
            return this;
        }

        public Builder setQuestion43FunctionalWaterPoint(boolean question43WaterPointObjective) {
            INSTANCE.setQuestion43FunctionalWaterPoint(question43WaterPointObjective);
            return this;
        }

        public Builder setQuestion43IfNoneReason(String textValue) {
            INSTANCE.setQuestion43IfNoneReason(textValue);
            return this;
        }

        public Builder setQuestion44HandWashingInstalled(boolean question44HandWashingObjective) {
            INSTANCE.setQuestion44HandWashingInstalled(question44HandWashingObjective);
            return this;
        }

        public Builder setQuestion51HealthUnitManagementCommittee(boolean question51HUMCObjective) {
            INSTANCE.setQuestion51HealthUnitManagementCommittee(question51HUMCObjective);
            return this;
        }

        public Builder setQuestion52HowOftenTheyMeet(String question52MeetingObjective) {
            INSTANCE.setQuestion52HowOftenTheyMeet(question52MeetingObjective);
            return this;
        }

        public Builder setQuestion53LastVisitSupportSupervisor(String textValue) {
            INSTANCE.setQuestion53LastVisitSupportSupervisor(textValue);
            return this;
        }

        public Builder setQuestion6MedicalStaffCeilingNumber(int integerValue) {
            INSTANCE.setQuestion6MedicalStaffCeilingNumber(integerValue);
            return this;
        }

        public Builder setQuestion6MedicalTotalNumberStaff(int integerValue) {
            INSTANCE.setQuestion6MedicalTotalNumberStaff(integerValue);
            return this;
        }

        public Builder setQuestion6MedicalNumberStuffPresent(int integerValue) {
            INSTANCE.setQuestion6MedicalNumberStuffPresent(integerValue);
            return this;
        }

        public Builder setQuestion6NoneMedicalStaffCeilingNumber(int integerValue) {
            INSTANCE.setQuestion6NoneMedicalStaffCeilingNumber(integerValue);
            return this;
        }

        public Builder setQuestion6NoneMedicalStaffTotalNumberStaff(int integerValue) {
            INSTANCE.setQuestion6NoneMedicalStaffTotalNumberStaff(integerValue);
            return this;
        }

        public Builder setQuestion6NoneMedicalNumberStaffPresent(int integerValue) {
            INSTANCE.setQuestion6NoneMedicalNumberStaffPresent(integerValue);
            return this;
        }

        public Builder setQuestion6ReasonsForStaffAbsence(String textValue) {
            INSTANCE.setQuestion6ReasonsForStaffAbsence(textValue);
            return this;
        }

        public Builder setQuestion6LastDatePerformanceAppraisal(String textValue) {
            INSTANCE.setQuestion6LastDatePerformanceAppraisal(textValue);
            return this;
        }

        public Builder setQuestion6NumberOfStaffAppraised(int integerValue) {
            INSTANCE.setQuestion6NumberOfStaffAppraised(integerValue);
            return this;
        }

        public Builder setQuestion7HCReceiveMedicalSupplies(boolean question71Objective) {
            INSTANCE.setQuestion7HCReceiveMedicalSupplies(question71Objective);
            return this;
        }

        public Builder setQuestion7HCReceiveMedicalSuppliesIfNo(String reason) {
            INSTANCE.setQuestion7HCReceiveMedicalSuppliesIfNo(reason);
            return this;
        }

        public Builder setQuestion72EssentialDrug1Name(String textValue) {
            INSTANCE.setQuestion72EssentialDrug1Name(textValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug1RequiredStock(int integerValue) {
            INSTANCE.setQuestion72EssentialDrug1RequiredStock(integerValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug2Name(String textValue) {
            INSTANCE.setQuestion72EssentialDrug2Name(textValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug2RequiredStock(int integerValue) {
            INSTANCE.setQuestion72EssentialDrug2RequiredStock(integerValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug3Name(String textValue) {
            INSTANCE.setQuestion72EssentialDrug3Name(textValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug3RequiredStock(int integerValue) {
            INSTANCE.setQuestion72EssentialDrug3RequiredStock(integerValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug4Name(String textValue) {
            INSTANCE.setQuestion72EssentialDrug4Name(textValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug4RequiredStock(int integerValue) {
            INSTANCE.setQuestion72EssentialDrug4RequiredStock(integerValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug5Name(String textValue) {
            INSTANCE.setQuestion72EssentialDrug5Name(textValue);
            return this;
        }

        public Builder setQuestion72EssentialDrug5RequiredStock(int integerValue) {
            INSTANCE.setQuestion72EssentialDrug5RequiredStock(integerValue);
            return this;
        }

        public Builder setQuestion73HCLastDrugsConsignment(String textValue) {
            INSTANCE.setQuestion73HCLastDrugsConsignment(textValue);
            return this;
        }

        public Builder setQuestion74NumberMedicalEquipmentBrought(int integerValue) {
            INSTANCE.setQuestion74NumberMedicalEquipmentBrought(integerValue);
            return this;
        }

        public Builder setQuestion75HaveAmbulance(boolean question75Objective) {
            INSTANCE.setQuestion75HaveAmbulance(question75Objective);
            return this;
        }

        public Builder setQuestion76Referrals(String textValue) {
            INSTANCE.setQuestion76Referrals(textValue);
            return this;
        }

        public Builder setQuestion80ChallengesAndObservation(String textValue) {
            INSTANCE.setQuestion80ChallengesAndObservation(textValue);
            return this;
        }
    }

    public HealthQuestion(String financialYear, String financialYearQuarter, String data, String district, String village, String parish, String townCouncil, String nameMonitorAgent, String telNumber, String questionANameAndGradeHealthCenter, int questionBOutPatientOPDAttendance, int questionCInPatientAttendance, int question1RecurrentApprovedBudget, int question1RecurrentBudgetReleased, String question1RecurrentDateReceived, String question1RecurrentDateWithdrawn, int question1DevelopmentApprovedBudget, int question1DevelopmentReleasedBudget, String question1DevelopmentDateReceived, String question1DevelopmentDateWithdrawn, String question11DisplayBudgetInformation, String question12BudgetInformationRelates, boolean question2MaternityYesNo, boolean question2GeneralWardYesNo, boolean question2DeliveryBedsYesNo, boolean question2FamilyPlanningServicesYesNo, boolean question2HIVCounsellingTestingAndTreatmentYesNo, boolean question2PMTCTYesNo, boolean question2ImmunizationYesNo, boolean question2YouthFriendlyCornersYesNo, boolean question2Vaccination4HEPBYesNo, int question21CategoryLiveNumberDeliveries, int question21CategoryStillNumberDeliveries, int question22ChildrenImmunized, int question3ToiletNumberBlocks, int question3ToiletNumberInstances, int question3PatientToiletNumberMaleStances, int question3PatientToiletNumberFemaleStances, int question3HealthStaffNumberToiletMaleStance, int question3HealthStaffNumberToiletFemaleStances, int question3HealthStaffNumberToiletMixedStances, int question3ToiletFunctionalNumber, int question3ToiletNonFunctionNumber, int question3LatrineNumberBlocks, int question3LatrineNumberStances, int question3LatrineNumberMaleStances, int question3LatrineNumberFemaleStances, int question3LatrineNumberPatientMaleStances, int question3LatrineNumberStaffMaleStances, int question3LatrineNumberStaffFemaleStance, int question3LatrineNumberStaffMixedStances, int question3LatrineNumberFunctional, int question3LatrineNoneFunctional, int question3FCRNumberBlock, int question3FCRNumberStances, int question3FCRNumberFemaleStances, int question3FCRNumberStaffFemaleStances, int question3FCRNumberStaffMixedStances, int question3FCRNumberFunctionalStances, int question3FCRNumberNoneFunction, String question32HealthFacilityToiletReasonFacilities, boolean question31HealthFacilityToiletFacilities, int question4NumberOfBoreHole, int question4NumberOfBoreHoleFunctional, int question4NumberOfBoreHoleNoneFunctional, int question4NumberOfTap, int question4NumberOfTapFunctional, int question4NumberOfTapNoneFunctional, int question4NumberOfWaterTank, int question4NumberOfWaterTankFunctional, int question4NumberOfWaterTankNoneFunctional, String question4OtherName, int question4OtherNumber, int question4OtherNumberFunctional, int question4OtherNumberNoneFunctional, boolean question41WaterPointAccessible, boolean question43FunctionalWaterPoint, String question43IfNoneReason, boolean question44HandWashingInstalled, boolean question51HealthUnitManagementCommittee, String question52HowOftenTheyMeet, String question53LastVisitSupportSupervisor, int question6MedicalStaffCeilingNumber, int question6MedicalTotalNumberStaff, int question6MedicalNumberStuffPresent, int question6NoneMedicalStaffCeilingNumber, int question6NoneMedicalStaffTotalNumberStaff, int question6NoneMedicalNumberStaffPresent, String question6ReasonsForStaffAbsence, String question6LastDatePerformanceAppraisal, int question6NumberOfStaffAppraised, boolean question7HCReceiveMedicalSupplies, String question7HCReceiveMedicalSuppliesIfNo, String question72EssentialDrug1Name, int question72EssentialDrug1RequiredStock, String question72EssentialDrug2Name, int question72EssentialDrug2RequiredStock, String question72EssentialDrug3Name, int question72EssentialDrug3RequiredStock, String question72EssentialDrug4Name, int question72EssentialDrug4RequiredStock, String question72EssentialDrug5Name, int question72EssentialDrug5RequiredStock, String question73HCLastDrugsConsignment, int question74NumberMedicalEquipmentBrought, boolean question75HaveAmbulance, String question76Referrals, String question80ChallengesAndObservation) {
        this.financialYear = financialYear;
        this.financialYearQuarter = financialYearQuarter;
        this.data = data;
        this.district = district;
        this.village = village;
        this.parish = parish;
        this.townCouncil = townCouncil;
        this.nameMonitorAgent = nameMonitorAgent;
        this.telNumber = telNumber;
        this.questionANameAndGradeHealthCenter = questionANameAndGradeHealthCenter;
        this.questionBOutPatientOPDAttendance = questionBOutPatientOPDAttendance;
        this.questionCInPatientAttendance = questionCInPatientAttendance;
        this.question1RecurrentApprovedBudget = question1RecurrentApprovedBudget;
        this.question1RecurrentBudgetReleased = question1RecurrentBudgetReleased;
        this.question1RecurrentDateReceived = question1RecurrentDateReceived;
        this.question1RecurrentDateWithdrawn = question1RecurrentDateWithdrawn;
        this.question1DevelopmentApprovedBudget = question1DevelopmentApprovedBudget;
        this.question1DevelopmentReleasedBudget = question1DevelopmentReleasedBudget;
        this.question1DevelopmentDateReceived = question1DevelopmentDateReceived;
        this.question1DevelopmentDateWithdrawn = question1DevelopmentDateWithdrawn;
        this.question11DisplayBudgetInformation = question11DisplayBudgetInformation;
        this.question12BudgetInformationRelates = question12BudgetInformationRelates;
        this.question2MaternityYesNo = question2MaternityYesNo;
        this.question2GeneralWardYesNo = question2GeneralWardYesNo;
        this.question2DeliveryBedsYesNo = question2DeliveryBedsYesNo;
        this.question2FamilyPlanningServicesYesNo = question2FamilyPlanningServicesYesNo;
        this.question2HIVCounsellingTestingAndTreatmentYesNo = question2HIVCounsellingTestingAndTreatmentYesNo;
        this.question2PMTCTYesNo = question2PMTCTYesNo;
        this.question2ImmunizationYesNo = question2ImmunizationYesNo;
        this.question2YouthFriendlyCornersYesNo = question2YouthFriendlyCornersYesNo;
        this.question2Vaccination4HEPBYesNo = question2Vaccination4HEPBYesNo;
        this.question21CategoryLiveNumberDeliveries = question21CategoryLiveNumberDeliveries;
        this.question21CategoryStillNumberDeliveries = question21CategoryStillNumberDeliveries;
        this.question22ChildrenImmunized = question22ChildrenImmunized;
        this.question3ToiletNumberBlocks = question3ToiletNumberBlocks;
        this.question3ToiletNumberInstances = question3ToiletNumberInstances;
        this.question3PatientToiletNumberMaleStances = question3PatientToiletNumberMaleStances;
        this.question3PatientToiletNumberFemaleStances = question3PatientToiletNumberFemaleStances;
        this.question3HealthStaffNumberToiletMaleStance = question3HealthStaffNumberToiletMaleStance;
        this.question3HealthStaffNumberToiletFemaleStances = question3HealthStaffNumberToiletFemaleStances;
        this.question3HealthStaffNumberToiletMixedStances = question3HealthStaffNumberToiletMixedStances;
        this.question3ToiletFunctionalNumber = question3ToiletFunctionalNumber;
        this.question3ToiletNonFunctionNumber = question3ToiletNonFunctionNumber;
        this.question3LatrineNumberBlocks = question3LatrineNumberBlocks;
        this.question3LatrineNumberStances = question3LatrineNumberStances;
        this.question3LatrineNumberMaleStances = question3LatrineNumberMaleStances;
        this.question3LatrineNumberFemaleStances = question3LatrineNumberFemaleStances;
        this.question3LatrineNumberPatientMaleStances = question3LatrineNumberPatientMaleStances;
        this.question3LatrineNumberStaffMaleStances = question3LatrineNumberStaffMaleStances;
        this.question3LatrineNumberStaffFemaleStance = question3LatrineNumberStaffFemaleStance;
        this.question3LatrineNumberStaffMixedStances = question3LatrineNumberStaffMixedStances;
        this.question3LatrineNumberFunctional = question3LatrineNumberFunctional;
        this.question3LatrineNoneFunctional = question3LatrineNoneFunctional;
        this.question3FCRNumberBlock = question3FCRNumberBlock;
        this.question3FCRNumberStances = question3FCRNumberStances;
        this.question3FCRNumberFemaleStances = question3FCRNumberFemaleStances;
        this.question3FCRNumberStaffFemaleStances = question3FCRNumberStaffFemaleStances;
        this.question3FCRNumberStaffMixedStances = question3FCRNumberStaffMixedStances;
        this.question3FCRNumberFunctionalStances = question3FCRNumberFunctionalStances;
        this.question3FCRNumberNoneFunction = question3FCRNumberNoneFunction;
        this.question32HealthFacilityToiletReasonFacilities = question32HealthFacilityToiletReasonFacilities;
        this.question31HealthFacilityToiletFacilities = question31HealthFacilityToiletFacilities;
        this.question4NumberOfBoreHole = question4NumberOfBoreHole;
        this.question4NumberOfBoreHoleFunctional = question4NumberOfBoreHoleFunctional;
        this.question4NumberOfBoreHoleNoneFunctional = question4NumberOfBoreHoleNoneFunctional;
        this.question4NumberOfTap = question4NumberOfTap;
        this.question4NumberOfTapFunctional = question4NumberOfTapFunctional;
        this.question4NumberOfTapNoneFunctional = question4NumberOfTapNoneFunctional;
        this.question4NumberOfWaterTank = question4NumberOfWaterTank;
        this.question4NumberOfWaterTankFunctional = question4NumberOfWaterTankFunctional;
        this.question4NumberOfWaterTankNoneFunctional = question4NumberOfWaterTankNoneFunctional;
        this.question4OtherName = question4OtherName;
        this.question4OtherNumber = question4OtherNumber;
        this.question4OtherNumberFunctional = question4OtherNumberFunctional;
        this.question4OtherNumberNoneFunctional = question4OtherNumberNoneFunctional;
        this.question41WaterPointAccessible = question41WaterPointAccessible;
        this.question43FunctionalWaterPoint = question43FunctionalWaterPoint;
        this.question43IfNoneReason = question43IfNoneReason;
        this.question44HandWashingInstalled = question44HandWashingInstalled;
        this.question51HealthUnitManagementCommittee = question51HealthUnitManagementCommittee;
        this.question52HowOftenTheyMeet = question52HowOftenTheyMeet;
        this.question53LastVisitSupportSupervisor = question53LastVisitSupportSupervisor;
        this.question6MedicalStaffCeilingNumber = question6MedicalStaffCeilingNumber;
        this.question6MedicalTotalNumberStaff = question6MedicalTotalNumberStaff;
        this.question6MedicalNumberStuffPresent = question6MedicalNumberStuffPresent;
        this.question6NoneMedicalStaffCeilingNumber = question6NoneMedicalStaffCeilingNumber;
        this.question6NoneMedicalStaffTotalNumberStaff = question6NoneMedicalStaffTotalNumberStaff;
        this.question6NoneMedicalNumberStaffPresent = question6NoneMedicalNumberStaffPresent;
        this.question6ReasonsForStaffAbsence = question6ReasonsForStaffAbsence;
        this.question6LastDatePerformanceAppraisal = question6LastDatePerformanceAppraisal;
        this.question6NumberOfStaffAppraised = question6NumberOfStaffAppraised;
        this.question7HCReceiveMedicalSupplies = question7HCReceiveMedicalSupplies;
        this.question7HCReceiveMedicalSuppliesIfNo = question7HCReceiveMedicalSuppliesIfNo;
        this.question72EssentialDrug1Name = question72EssentialDrug1Name;
        this.question72EssentialDrug1RequiredStock = question72EssentialDrug1RequiredStock;
        this.question72EssentialDrug2Name = question72EssentialDrug2Name;
        this.question72EssentialDrug2RequiredStock = question72EssentialDrug2RequiredStock;
        this.question72EssentialDrug3Name = question72EssentialDrug3Name;
        this.question72EssentialDrug3RequiredStock = question72EssentialDrug3RequiredStock;
        this.question72EssentialDrug4Name = question72EssentialDrug4Name;
        this.question72EssentialDrug4RequiredStock = question72EssentialDrug4RequiredStock;
        this.question72EssentialDrug5Name = question72EssentialDrug5Name;
        this.question72EssentialDrug5RequiredStock = question72EssentialDrug5RequiredStock;
        this.question73HCLastDrugsConsignment = question73HCLastDrugsConsignment;
        this.question74NumberMedicalEquipmentBrought = question74NumberMedicalEquipmentBrought;
        this.question75HaveAmbulance = question75HaveAmbulance;
        this.question76Referrals = question76Referrals;
        this.question80ChallengesAndObservation = question80ChallengesAndObservation;
        this.isLocallyStored = true;
    }

    public boolean isLocallyStored() {
        return isLocallyStored;
    }

    public void setLocallyStored(boolean locallyStored) {
        isLocallyStored = locallyStored;
    }

    public String getQuestion80ChallengesAndObservation() {
        return question80ChallengesAndObservation;
    }

    public void setQuestion80ChallengesAndObservation(String question80ChallengesAndObservation) {
        this.question80ChallengesAndObservation = question80ChallengesAndObservation;
    }

    public String getQuestion76Referrals() {
        return question76Referrals;
    }

    public void setQuestion76Referrals(String question76Referrals) {
        this.question76Referrals = question76Referrals;
    }

    public boolean isQuestion75HaveAmbulance() {
        return question75HaveAmbulance;
    }

    public void setQuestion75HaveAmbulance(boolean question75HaveAmbulance) {
        this.question75HaveAmbulance = question75HaveAmbulance;
    }

    public int getQuestion74NumberMedicalEquipmentBrought() {
        return question74NumberMedicalEquipmentBrought;
    }

    public void setQuestion74NumberMedicalEquipmentBrought(int question74NumberMedicalEquipmentBrought) {
        this.question74NumberMedicalEquipmentBrought = question74NumberMedicalEquipmentBrought;
    }

    public String getQuestion73HCLastDrugsConsignment() {
        return question73HCLastDrugsConsignment;
    }

    public void setQuestion73HCLastDrugsConsignment(String question73HCLastDrugsConsignment) {
        this.question73HCLastDrugsConsignment = question73HCLastDrugsConsignment;
    }

    public String getQuestion72EssentialDrug2Name() {
        return question72EssentialDrug2Name;
    }

    public void setQuestion72EssentialDrug2Name(String question72EssentialDrug2Name) {
        this.question72EssentialDrug2Name = question72EssentialDrug2Name;
    }

    public int getQuestion72EssentialDrug2RequiredStock() {
        return question72EssentialDrug2RequiredStock;
    }

    public void setQuestion72EssentialDrug2RequiredStock(int question72EssentialDrug2RequiredStock) {
        this.question72EssentialDrug2RequiredStock = question72EssentialDrug2RequiredStock;
    }

    public String getQuestion72EssentialDrug3Name() {
        return question72EssentialDrug3Name;
    }

    public void setQuestion72EssentialDrug3Name(String question72EssentialDrug3Name) {
        this.question72EssentialDrug3Name = question72EssentialDrug3Name;
    }

    public int getQuestion72EssentialDrug3RequiredStock() {
        return question72EssentialDrug3RequiredStock;
    }

    public void setQuestion72EssentialDrug3RequiredStock(int question72EssentialDrug3RequiredStock) {
        this.question72EssentialDrug3RequiredStock = question72EssentialDrug3RequiredStock;
    }

    public String getQuestion72EssentialDrug4Name() {
        return question72EssentialDrug4Name;
    }

    public void setQuestion72EssentialDrug4Name(String question72EssentialDrug4Name) {
        this.question72EssentialDrug4Name = question72EssentialDrug4Name;
    }

    public int getQuestion72EssentialDrug4RequiredStock() {
        return question72EssentialDrug4RequiredStock;
    }

    public void setQuestion72EssentialDrug4RequiredStock(int question72EssentialDrug4RequiredStock) {
        this.question72EssentialDrug4RequiredStock = question72EssentialDrug4RequiredStock;
    }

    public String getQuestion72EssentialDrug5Name() {
        return question72EssentialDrug5Name;
    }

    public void setQuestion72EssentialDrug5Name(String question72EssentialDrug5Name) {
        this.question72EssentialDrug5Name = question72EssentialDrug5Name;
    }

    public int getQuestion72EssentialDrug5RequiredStock() {
        return question72EssentialDrug5RequiredStock;
    }

    public void setQuestion72EssentialDrug5RequiredStock(int question72EssentialDrug5RequiredStock) {
        this.question72EssentialDrug5RequiredStock = question72EssentialDrug5RequiredStock;
    }

    public int getQuestion72EssentialDrug1RequiredStock() {
        return question72EssentialDrug1RequiredStock;
    }

    public void setQuestion72EssentialDrug1RequiredStock(int question72EssentialDrug1RequiredStock) {
        this.question72EssentialDrug1RequiredStock = question72EssentialDrug1RequiredStock;
    }

    public String getQuestion72EssentialDrug1Name() {
        return question72EssentialDrug1Name;
    }

    public void setQuestion72EssentialDrug1Name(String question72EssentialDrug1Name) {
        this.question72EssentialDrug1Name = question72EssentialDrug1Name;
    }

    public String getQuestion7HCReceiveMedicalSuppliesIfNo() {
        return question7HCReceiveMedicalSuppliesIfNo;
    }

    public void setQuestion7HCReceiveMedicalSuppliesIfNo(String question7HCReceiveMedicalSuppliesIfNo) {
        this.question7HCReceiveMedicalSuppliesIfNo = question7HCReceiveMedicalSuppliesIfNo;
    }

    public boolean isQuestion7HCReceiveMedicalSupplies() {
        return question7HCReceiveMedicalSupplies;
    }

    public void setQuestion7HCReceiveMedicalSupplies(boolean question7HCReceiveMedicalSupplies) {
        this.question7HCReceiveMedicalSupplies = question7HCReceiveMedicalSupplies;
    }

    public int getQuestion6NumberOfStaffAppraised() {
        return question6NumberOfStaffAppraised;
    }

    public void setQuestion6NumberOfStaffAppraised(int question6NumberOfStaffAppraised) {
        this.question6NumberOfStaffAppraised = question6NumberOfStaffAppraised;
    }

    public String getQuestion6LastDatePerformanceAppraisal() {
        return question6LastDatePerformanceAppraisal;
    }

    public void setQuestion6LastDatePerformanceAppraisal(String question6LastDatePerformanceAppraisal) {
        this.question6LastDatePerformanceAppraisal = question6LastDatePerformanceAppraisal;
    }

    public String getQuestion6ReasonsForStaffAbsence() {
        return question6ReasonsForStaffAbsence;
    }

    public void setQuestion6ReasonsForStaffAbsence(String question6ReasonsForStaffAbsence) {
        this.question6ReasonsForStaffAbsence = question6ReasonsForStaffAbsence;
    }

    public int getQuestion6NoneMedicalNumberStaffPresent() {
        return question6NoneMedicalNumberStaffPresent;
    }

    public void setQuestion6NoneMedicalNumberStaffPresent(int question6NoneMedicalNumberStaffPresent) {
        this.question6NoneMedicalNumberStaffPresent = question6NoneMedicalNumberStaffPresent;
    }

    public int getQuestion6NoneMedicalStaffTotalNumberStaff() {
        return question6NoneMedicalStaffTotalNumberStaff;
    }

    public void setQuestion6NoneMedicalStaffTotalNumberStaff(int question6NoneMedicalStaffTotalNumberStaff) {
        this.question6NoneMedicalStaffTotalNumberStaff = question6NoneMedicalStaffTotalNumberStaff;
    }

    public int getQuestion6NoneMedicalStaffCeilingNumber() {
        return question6NoneMedicalStaffCeilingNumber;
    }

    public void setQuestion6NoneMedicalStaffCeilingNumber(int question6NoneMedicalStaffCeilingNumber) {
        this.question6NoneMedicalStaffCeilingNumber = question6NoneMedicalStaffCeilingNumber;
    }

    public int getQuestion6MedicalNumberStuffPresent() {
        return question6MedicalNumberStuffPresent;
    }

    public void setQuestion6MedicalNumberStuffPresent(int question6MedicalNumberStuffPresent) {
        this.question6MedicalNumberStuffPresent = question6MedicalNumberStuffPresent;
    }

    public int getQuestion6MedicalTotalNumberStaff() {
        return question6MedicalTotalNumberStaff;
    }

    public void setQuestion6MedicalTotalNumberStaff(int question6MedicalTotalNumberStaff) {
        this.question6MedicalTotalNumberStaff = question6MedicalTotalNumberStaff;
    }

    public int getQuestion6MedicalStaffCeilingNumber() {
        return question6MedicalStaffCeilingNumber;
    }

    public void setQuestion6MedicalStaffCeilingNumber(int question6MedicalStaffCeilingNumber) {
        this.question6MedicalStaffCeilingNumber = question6MedicalStaffCeilingNumber;
    }

    public String getQuestion53LastVisitSupportSupervisor() {
        return question53LastVisitSupportSupervisor;
    }

    public void setQuestion53LastVisitSupportSupervisor(String question53LastVisitSupportSupervisor) {
        this.question53LastVisitSupportSupervisor = question53LastVisitSupportSupervisor;
    }

    public String getQuestion52HowOftenTheyMeet() {
        return question52HowOftenTheyMeet;
    }

    public void setQuestion52HowOftenTheyMeet(String question52HowOftenTheyMeet) {
        this.question52HowOftenTheyMeet = question52HowOftenTheyMeet;
    }

    public boolean isQuestion51HealthUnitManagementCommittee() {
        return question51HealthUnitManagementCommittee;
    }

    public void setQuestion51HealthUnitManagementCommittee(boolean question51HealthUnitManagementCommittee) {
        this.question51HealthUnitManagementCommittee = question51HealthUnitManagementCommittee;
    }

    public boolean isQuestion44HandWashingInstalled() {
        return question44HandWashingInstalled;
    }

    public void setQuestion44HandWashingInstalled(boolean question44HandWashingInstalled) {
        this.question44HandWashingInstalled = question44HandWashingInstalled;
    }

    public String getQuestion43IfNoneReason() {
        return question43IfNoneReason;
    }

    public void setQuestion43IfNoneReason(String question43IfNoneReason) {
        this.question43IfNoneReason = question43IfNoneReason;
    }

    public boolean isQuestion43FunctionalWaterPoint() {
        return question43FunctionalWaterPoint;
    }

    public void setQuestion43FunctionalWaterPoint(boolean question43FunctionalWaterPoint) {
        this.question43FunctionalWaterPoint = question43FunctionalWaterPoint;
    }

    public boolean isQuestion41WaterPointAccessible() {
        return question41WaterPointAccessible;
    }

    public void setQuestion41WaterPointAccessible(boolean question41WaterPointAccessible) {
        this.question41WaterPointAccessible = question41WaterPointAccessible;
    }

    public int getQuestion4OtherNumberNoneFunctional() {
        return question4OtherNumberNoneFunctional;
    }

    public void setQuestion4OtherNumberNoneFunctional(int question4OtherNumberNoneFunctional) {
        this.question4OtherNumberNoneFunctional = question4OtherNumberNoneFunctional;
    }

    public int getQuestion4OtherNumberFunctional() {
        return question4OtherNumberFunctional;
    }

    public void setQuestion4OtherNumberFunctional(int question4OtherNumberFunctional) {
        this.question4OtherNumberFunctional = question4OtherNumberFunctional;
    }

    public int getQuestion4OtherNumber() {
        return question4OtherNumber;
    }

    public void setQuestion4OtherNumber(int question4OtherNumber) {
        this.question4OtherNumber = question4OtherNumber;
    }

    public String getQuestion4OtherName() {
        return question4OtherName;
    }

    public void setQuestion4OtherName(String question4OtherName) {
        this.question4OtherName = question4OtherName;
    }

    public int getQuestion4NumberOfWaterTankNoneFunctional() {
        return question4NumberOfWaterTankNoneFunctional;
    }

    public void setQuestion4NumberOfWaterTankNoneFunctional(int question4NumberOfWaterTankNoneFunctional) {
        this.question4NumberOfWaterTankNoneFunctional = question4NumberOfWaterTankNoneFunctional;
    }

    public int getQuestion4NumberOfWaterTankFunctional() {
        return question4NumberOfWaterTankFunctional;
    }

    public void setQuestion4NumberOfWaterTankFunctional(int question4NumberOfWaterTankFunctional) {
        this.question4NumberOfWaterTankFunctional = question4NumberOfWaterTankFunctional;
    }

    public int getQuestion4NumberOfWaterTank() {
        return question4NumberOfWaterTank;
    }

    public void setQuestion4NumberOfWaterTank(int question4NumberOfWaterTank) {
        this.question4NumberOfWaterTank = question4NumberOfWaterTank;
    }

    public int getQuestion4NumberOfTapNoneFunctional() {
        return question4NumberOfTapNoneFunctional;
    }

    public void setQuestion4NumberOfTapNoneFunctional(int question4NumberOfTapNoneFunctional) {
        this.question4NumberOfTapNoneFunctional = question4NumberOfTapNoneFunctional;
    }

    public int getQuestion4NumberOfTapFunctional() {
        return question4NumberOfTapFunctional;
    }

    public void setQuestion4NumberOfTapFunctional(int question4NumberOfTapFunctional) {
        this.question4NumberOfTapFunctional = question4NumberOfTapFunctional;
    }

    public int getQuestion4NumberOfTap() {
        return question4NumberOfTap;
    }

    public void setQuestion4NumberOfTap(int question4NumberOfTap) {
        this.question4NumberOfTap = question4NumberOfTap;
    }

    public int getQuestion4NumberOfBoreHoleNoneFunctional() {
        return question4NumberOfBoreHoleNoneFunctional;
    }

    public void setQuestion4NumberOfBoreHoleNoneFunctional(int question4NumberOfBoreHoleNoneFunctional) {
        this.question4NumberOfBoreHoleNoneFunctional = question4NumberOfBoreHoleNoneFunctional;
    }

    public int getQuestion4NumberOfBoreHoleFunctional() {
        return question4NumberOfBoreHoleFunctional;
    }

    public void setQuestion4NumberOfBoreHoleFunctional(int question4NumberOfBoreHoleFunctional) {
        this.question4NumberOfBoreHoleFunctional = question4NumberOfBoreHoleFunctional;
    }

    public int getQuestion4NumberOfBoreHole() {
        return question4NumberOfBoreHole;
    }

    public void setQuestion4NumberOfBoreHole(int question4NumberOfBoreHole) {
        this.question4NumberOfBoreHole = question4NumberOfBoreHole;
    }

    public String getQuestion32HealthFacilityToiletReasonFacilities() {
        return question32HealthFacilityToiletReasonFacilities;
    }

    public void setQuestion32HealthFacilityToiletReasonFacilities(String question32HealthFacilityToiletReasonFacilities) {
        this.question32HealthFacilityToiletReasonFacilities = question32HealthFacilityToiletReasonFacilities;
    }

    public boolean isQuestion31HealthFacilityToiletFacilities() {
        return question31HealthFacilityToiletFacilities;
    }

    public void setQuestion31HealthFacilityToiletFacilities(boolean question31HealthFacilityToiletFacilities) {
        this.question31HealthFacilityToiletFacilities = question31HealthFacilityToiletFacilities;
    }

    public int getQuestion3FCRNumberNoneFunction() {
        return question3FCRNumberNoneFunction;
    }

    public void setQuestion3FCRNumberNoneFunction(int question3FCRNumberNoneFunction) {
        this.question3FCRNumberNoneFunction = question3FCRNumberNoneFunction;
    }

    public int getQuestion3FCRNumberFunctionalStances() {
        return question3FCRNumberFunctionalStances;
    }

    public void setQuestion3FCRNumberFunctionalStances(int question3FCRNumberFunctionalStances) {
        this.question3FCRNumberFunctionalStances = question3FCRNumberFunctionalStances;
    }

    public int getQuestion3FCRNumberStaffMixedStances() {
        return question3FCRNumberStaffMixedStances;
    }

    public void setQuestion3FCRNumberStaffMixedStances(int question3FCRNumberStaffMixedStances) {
        this.question3FCRNumberStaffMixedStances = question3FCRNumberStaffMixedStances;
    }

    public int getQuestion3FCRNumberStaffFemaleStances() {
        return question3FCRNumberStaffFemaleStances;
    }

    public void setQuestion3FCRNumberStaffFemaleStances(int question3FCRNumberStaffFemaleStances) {
        this.question3FCRNumberStaffFemaleStances = question3FCRNumberStaffFemaleStances;
    }

    public int getQuestion3FCRNumberFemaleStances() {
        return question3FCRNumberFemaleStances;
    }

    public void setQuestion3FCRNumberFemaleStances(int question3FCRNumberFemaleStances) {
        this.question3FCRNumberFemaleStances = question3FCRNumberFemaleStances;
    }

    public int getQuestion3FCRNumberStances() {
        return question3FCRNumberStances;
    }

    public void setQuestion3FCRNumberStances(int question3FCRNumberStances) {
        this.question3FCRNumberStances = question3FCRNumberStances;
    }

    public int getQuestion3FCRNumberBlock() {
        return question3FCRNumberBlock;
    }

    public void setQuestion3FCRNumberBlock(int question3FCRNumberBlock) {
        this.question3FCRNumberBlock = question3FCRNumberBlock;
    }

    public int getQuestion3LatrineNoneFunctional() {
        return question3LatrineNoneFunctional;
    }

    public void setQuestion3LatrineNoneFunctional(int question3LatrineNoneFunctional) {
        this.question3LatrineNoneFunctional = question3LatrineNoneFunctional;
    }

    public int getQuestion3LatrineNumberFunctional() {
        return question3LatrineNumberFunctional;
    }

    public void setQuestion3LatrineNumberFunctional(int question3LatrineNumberFunctional) {
        this.question3LatrineNumberFunctional = question3LatrineNumberFunctional;
    }

    public int getQuestion3LatrineNumberStaffMixedStances() {
        return question3LatrineNumberStaffMixedStances;
    }

    public void setQuestion3LatrineNumberStaffMixedStances(int question3LatrineNumberStaffMixedStances) {
        this.question3LatrineNumberStaffMixedStances = question3LatrineNumberStaffMixedStances;
    }

    public int getQuestion3LatrineNumberStaffFemaleStance() {
        return question3LatrineNumberStaffFemaleStance;
    }

    public void setQuestion3LatrineNumberStaffFemaleStance(int question3LatrineNumberStaffFemaleStance) {
        this.question3LatrineNumberStaffFemaleStance = question3LatrineNumberStaffFemaleStance;
    }

    public int getQuestion3LatrineNumberStaffMaleStances() {
        return question3LatrineNumberStaffMaleStances;
    }

    public void setQuestion3LatrineNumberStaffMaleStances(int question3LatrineNumberStaffMaleStances) {
        this.question3LatrineNumberStaffMaleStances = question3LatrineNumberStaffMaleStances;
    }

    public int getQuestion3LatrineNumberPatientMaleStances() {
        return question3LatrineNumberPatientMaleStances;
    }

    public void setQuestion3LatrineNumberPatientMaleStances(int question3LatrineNumberPatientMaleStances) {
        this.question3LatrineNumberPatientMaleStances = question3LatrineNumberPatientMaleStances;
    }

    public int getQuestion3LatrineNumberFemaleStances() {
        return question3LatrineNumberFemaleStances;
    }

    public void setQuestion3LatrineNumberFemaleStances(int question3LatrineNumberFemaleStances) {
        this.question3LatrineNumberFemaleStances = question3LatrineNumberFemaleStances;
    }

    public int getQuestion3LatrineNumberMaleStances() {
        return question3LatrineNumberMaleStances;
    }

    public void setQuestion3LatrineNumberMaleStances(int question3LatrineNumberMaleStances) {
        this.question3LatrineNumberMaleStances = question3LatrineNumberMaleStances;
    }

    public int getQuestion3LatrineNumberStances() {
        return question3LatrineNumberStances;
    }

    public void setQuestion3LatrineNumberStances(int question3LatrineNumberStances) {
        this.question3LatrineNumberStances = question3LatrineNumberStances;
    }

    public int getQuestion3LatrineNumberBlocks() {
        return question3LatrineNumberBlocks;
    }

    public void setQuestion3LatrineNumberBlocks(int question3LatrineNumberBlocks) {
        this.question3LatrineNumberBlocks = question3LatrineNumberBlocks;
    }

    public int getQuestion3ToiletNonFunctionNumber() {
        return question3ToiletNonFunctionNumber;
    }

    public void setQuestion3ToiletNonFunctionNumber(int question3ToiletNonFunctionNumber) {
        this.question3ToiletNonFunctionNumber = question3ToiletNonFunctionNumber;
    }

    public int getQuestion3ToiletFunctionalNumber() {
        return question3ToiletFunctionalNumber;
    }

    public void setQuestion3ToiletFunctionalNumber(int question3ToiletFunctionalNumber) {
        this.question3ToiletFunctionalNumber = question3ToiletFunctionalNumber;
    }

    public int getQuestion3HealthStaffNumberToiletMixedStances() {
        return question3HealthStaffNumberToiletMixedStances;
    }

    public void setQuestion3HealthStaffNumberToiletMixedStances(int question3HealthStaffNumberToiletMixedStances) {
        this.question3HealthStaffNumberToiletMixedStances = question3HealthStaffNumberToiletMixedStances;
    }

    public int getQuestion3HealthStaffNumberToiletFemaleStances() {
        return question3HealthStaffNumberToiletFemaleStances;
    }

    public void setQuestion3HealthStaffNumberToiletFemaleStances(int question3HealthStaffNumberToiletFemaleStances) {
        this.question3HealthStaffNumberToiletFemaleStances = question3HealthStaffNumberToiletFemaleStances;
    }

    public int getQuestion3HealthStaffNumberToiletMaleStance() {
        return question3HealthStaffNumberToiletMaleStance;
    }

    public void setQuestion3HealthStaffNumberToiletMaleStance(int qestion3HealthStaffNumberToiletMaleStance) {
        this.question3HealthStaffNumberToiletMaleStance = qestion3HealthStaffNumberToiletMaleStance;
    }

    public int getQuestion3PatientToiletNumberFemaleStances() {
        return question3PatientToiletNumberFemaleStances;
    }

    public void setQuestion3PatientToiletNumberFemaleStances(int question3PatientToiletNumberFemaleStances) {
        this.question3PatientToiletNumberFemaleStances = question3PatientToiletNumberFemaleStances;
    }

    public int getQuestion3PatientToiletNumberMaleStances() {
        return question3PatientToiletNumberMaleStances;
    }

    public void setQuestion3PatientToiletNumberMaleStances(int question3PatientToiletNumberMaleStances) {
        this.question3PatientToiletNumberMaleStances = question3PatientToiletNumberMaleStances;
    }

    public int getQuestion3ToiletNumberInstances() {
        return question3ToiletNumberInstances;
    }

    public void setQuestion3ToiletNumberInstances(int question3ToiletNumberInstances) {
        this.question3ToiletNumberInstances = question3ToiletNumberInstances;
    }

    public int getQuestion3ToiletNumberBlocks() {
        return question3ToiletNumberBlocks;
    }

    public void setQuestion3ToiletNumberBlocks(int question3ToiletNumberBlocks) {
        this.question3ToiletNumberBlocks = question3ToiletNumberBlocks;
    }

    public int getQuestion22ChildrenImmunized() {
        return question22ChildrenImmunized;
    }

    public void setQuestion22ChildrenImmunized(int question22ChildrenImmunized) {
        this.question22ChildrenImmunized = question22ChildrenImmunized;
    }

    public int getQuestion21CategoryStillNumberDeliveries() {
        return question21CategoryStillNumberDeliveries;
    }

    public void setQuestion21CategoryStillNumberDeliveries(int question21CategoryStillNumberDeliveries) {
        this.question21CategoryStillNumberDeliveries = question21CategoryStillNumberDeliveries;
    }

    public int getQuestion21CategoryLiveNumberDeliveries() {
        return question21CategoryLiveNumberDeliveries;
    }

    public void setQuestion21CategoryLiveNumberDeliveries(int question21CategoryLiveNumberDeliveries) {
        this.question21CategoryLiveNumberDeliveries = question21CategoryLiveNumberDeliveries;
    }

    public boolean isQuestion2Vaccination4HEPBYesNo() {
        return question2Vaccination4HEPBYesNo;
    }

    public void setQuestion2Vaccination4HEPBYesNo(boolean question2Vaccination4HEPBYesNo) {
        this.question2Vaccination4HEPBYesNo = question2Vaccination4HEPBYesNo;
    }

    public boolean isQuestion2YouthFriendlyCornersYesNo() {
        return question2YouthFriendlyCornersYesNo;
    }

    public void setQuestion2YouthFriendlyCornersYesNo(boolean question2YouthFriendlyCornersYesNo) {
        this.question2YouthFriendlyCornersYesNo = question2YouthFriendlyCornersYesNo;
    }

    public boolean isQuestion2ImmunizationYesNo() {
        return question2ImmunizationYesNo;
    }

    public void setQuestion2ImmunizationYesNo(boolean question2ImmunizationYesNo) {
        this.question2ImmunizationYesNo = question2ImmunizationYesNo;
    }

    public boolean isQuestion2PMTCTYesNo() {
        return question2PMTCTYesNo;
    }

    public void setQuestion2PMTCTYesNo(boolean question2PMTCTYesNo) {
        this.question2PMTCTYesNo = question2PMTCTYesNo;
    }

    public boolean isQuestion2HIVCounsellingTestingAndTreatmentYesNo() {
        return question2HIVCounsellingTestingAndTreatmentYesNo;
    }

    public void setQuestion2HIVCounsellingTestingAndTreatmentYesNo(boolean question2HIVCounsellingTestingAndTreatmentYesNo) {
        this.question2HIVCounsellingTestingAndTreatmentYesNo = question2HIVCounsellingTestingAndTreatmentYesNo;
    }

    public boolean isQuestion2FamilyPlanningServicesYesNo() {
        return question2FamilyPlanningServicesYesNo;
    }

    public void setQuestion2FamilyPlanningServicesYesNo(boolean question2FamilyPlanningServicesYesNo) {
        this.question2FamilyPlanningServicesYesNo = question2FamilyPlanningServicesYesNo;
    }

    public boolean isQuestion2DeliveryBedsYesNo() {
        return question2DeliveryBedsYesNo;
    }

    public void setQuestion2DeliveryBedsYesNo(boolean question2DeliveryBedsYesNo) {
        this.question2DeliveryBedsYesNo = question2DeliveryBedsYesNo;
    }

    public boolean isQuestion2GeneralWardYesNo() {
        return question2GeneralWardYesNo;
    }

    public void setQuestion2GeneralWardYesNo(boolean question2GeneralWardYesNo) {
        this.question2GeneralWardYesNo = question2GeneralWardYesNo;
    }

    public String getQuestionANameAndGradeHealthCenter() {
        return questionANameAndGradeHealthCenter;
    }

    public boolean isQuestion2MaternityYesNo() {
        return question2MaternityYesNo;
    }

    public void setQuestion2MaternityYesNo(boolean question2MaternityYesNo) {
        this.question2MaternityYesNo = question2MaternityYesNo;
    }

    public String getQuestion12BudgetInformationRelates() {
        return question12BudgetInformationRelates;
    }

    public void setQuestion12BudgetInformationRelates(String question12BudgetInformationRelates) {
        this.question12BudgetInformationRelates = question12BudgetInformationRelates;
    }

    public String getQuestion11DisplayBudgetInformation() {
        return question11DisplayBudgetInformation;
    }

    public void setQuestion11DisplayBudgetInformation(String question11DisplayBudgetInformation) {
        this.question11DisplayBudgetInformation = question11DisplayBudgetInformation;
    }

    public String getQuestion1DevelopmentDateWithdrawn() {
        return question1DevelopmentDateWithdrawn;
    }

    public void setQuestion1DevelopmentDateWithdrawn(String question1DevelopmentDateWithdrawn) {
        this.question1DevelopmentDateWithdrawn = question1DevelopmentDateWithdrawn;
    }

    public String getQuestion1DevelopmentDateReceived() {
        return question1DevelopmentDateReceived;
    }

    public void setQuestion1DevelopmentDateReceived(String question1DevelopmentDateReceived) {
        this.question1DevelopmentDateReceived = question1DevelopmentDateReceived;
    }

    public int getQuestion1DevelopmentReleasedBudget() {
        return question1DevelopmentReleasedBudget;
    }

    public void setQuestion1DevelopmentReleasedBudget(int question1DevelopmentReleasedBudget) {
        this.question1DevelopmentReleasedBudget = question1DevelopmentReleasedBudget;
    }

    public int getQuestion1DevelopmentApprovedBudget() {
        return question1DevelopmentApprovedBudget;
    }

    public void setQuestion1DevelopmentApprovedBudget(int question1DevelopmentApprovedBudget) {
        this.question1DevelopmentApprovedBudget = question1DevelopmentApprovedBudget;
    }

    public String getQuestion1RecurrentDateWithdrawn() {
        return question1RecurrentDateWithdrawn;
    }

    public void setQuestion1RecurrentDateWithdrawn(String question1RecurrentDateWithdrawn) {
        this.question1RecurrentDateWithdrawn = question1RecurrentDateWithdrawn;
    }

    public String getQuestion1RecurrentDateReceived() {
        return question1RecurrentDateReceived;
    }

    public void setQuestion1RecurrentDateReceived(String question1RecurrentDateReceived) {
        this.question1RecurrentDateReceived = question1RecurrentDateReceived;
    }

    public int getQuestion1RecurrentBudgetReleased() {
        return question1RecurrentBudgetReleased;
    }

    public void setQuestion1RecurrentBudgetReleased(int question1RecurrentBudgetReleased) {
        this.question1RecurrentBudgetReleased = question1RecurrentBudgetReleased;
    }

    public int getQuestion1RecurrentApprovedBudget() {
        return question1RecurrentApprovedBudget;
    }

    public void setQuestion1RecurrentApprovedBudget(int question1RecurrentApprovedBudget) {
        this.question1RecurrentApprovedBudget = question1RecurrentApprovedBudget;
    }

    public int getQuestionCInPatientAttendance() {
        return questionCInPatientAttendance;
    }

    public void setQuestionCInPatientAttendance(int questionCInPatientAttendance) {
        this.questionCInPatientAttendance = questionCInPatientAttendance;
    }

    public int getQuestionBOutPatientOPDAttendance() {
        return questionBOutPatientOPDAttendance;
    }

    public void setQuestionBOutPatientOPDAttendance(int questionBOutPatientOPDAttendance) {
        this.questionBOutPatientOPDAttendance = questionBOutPatientOPDAttendance;
    }

    public String getQuestionANameHealthCenter() {
        return questionANameAndGradeHealthCenter;
    }

    public void setQuestionANameAndGradeHealthCenter(String questionANameAndGradeHealthCenter) {
        this.questionANameAndGradeHealthCenter = questionANameAndGradeHealthCenter;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String getNameMonitorAgent() {
        return nameMonitorAgent;
    }

    public void setNameMonitorAgent(String nameMonitorAgent) {
        this.nameMonitorAgent = nameMonitorAgent;
    }

    public String getTownCouncil() {
        return townCouncil;
    }

    public void setTownCouncil(String townCouncil) {
        this.townCouncil = townCouncil;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getFinancialYearQuarter() {
        return financialYearQuarter;
    }

    public void setFinancialYearQuarter(String financialYearQuarter) {
        this.financialYearQuarter = financialYearQuarter;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }
}
