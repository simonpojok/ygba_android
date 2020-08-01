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
