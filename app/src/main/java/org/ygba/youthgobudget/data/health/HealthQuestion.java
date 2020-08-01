package org.ygba.youthgobudget.data.health;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
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
