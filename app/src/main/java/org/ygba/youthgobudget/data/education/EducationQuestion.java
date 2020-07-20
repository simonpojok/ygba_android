package org.ygba.youthgobudget.data.education;

import android.widget.EditText;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = EducationQuestionConstants.TABLE_NAME)
public class EducationQuestion {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EducationQuestionConstants.PRIMARY_KEY)
    private int id;

    @ColumnInfo(name = EducationQuestionConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = EducationQuestionConstants.DATE)
    private String date;

    @ColumnInfo(name = EducationQuestionConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = EducationQuestionConstants.VILLAGE)
    private String village;

    @ColumnInfo(name = EducationQuestionConstants.PARISH)
    private String parish;

    @ColumnInfo(name = EducationQuestionConstants.DIVISION)
    private String division;

    @ColumnInfo(name = EducationQuestionConstants.FULL_NAME)
    private String fullNames;

    @ColumnInfo(name = EducationQuestionConstants.TEL)
    private String tel;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_1_ANSWER)
    private String question1Answer;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_SCHOOL_NAME)
    private String question2SchoolName;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_MALE_TEACHERS)
    private int question2MaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_FEMALE_TEACHERS)
    private int question2FeMaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_MALE_PWDS_TEACHERS)
    private int question2MalePWDTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_FEMALE_PWDS_TEACHERS)
    private int question2FemalePWDTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_TOTAL)
    private int question2TeachersTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PupilEnrollment_MALE)
    private int question2MalePupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_FEMALE_PupilEnrollment)
    private int question2FeMalePupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_MALE_PWDS_TEACHERSTEACHERS)
    private int question2MalePWDPupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_FEMALE_PWDS_PupilEnrollment)
    private int question2FemalePWDPupilEnrollment;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PupilEnrollment_TOTAL)
    private int question2PupilEnrollmentTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_MALE)
    private int question2NumberP7Male;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_FEMALE)
    private int question2NumberP7FeMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_MALE_PWD)
    private int question2NumberP7MalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_P7_FEMALE_PWD)
    private int question2NumberP7FeMalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_TOTAL)
    private int question2NumberP7Total;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_MALE)
    private int question2NumberDropoutMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_FEMALE)
    private int question2NumberDropOutFemale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_MALE_PWD)
    private int question2NumberDropoutMalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_FEMALE_PWD)
    private int question2NumberDropOutFemalePWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_NUMBER_DROPOUT_TOTAL)
    private int question2NumberDropOutTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROPOUT_REASONS_IF_ANY)
    private String question2DropOutReasonIfAny;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_GRANT_APPROVED_BUDGET)
    private int question3capitalGrantApprovedBudget;

    public int getQuestion3CapitalGrantReleaseBudget() {
        return question3CapitalGrantReleaseBudget;
    }

    public void setQuestion3CapitalGrantReleaseBudget(int question3CapitalGrantReleaseBudget) {
        this.question3CapitalGrantReleaseBudget = question3CapitalGrantReleaseBudget;
    }

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_GRANT_RELEASED_BUDGET)
    private int question3CapitalGrantReleaseBudget;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_BUDGET_DATE_RECEIVED)
    private String question3CapitalReceivedDate;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_CAPITAL_GRANT_DATE_WITHDRAWN)
    private String question3CapitalDateWithdrawn;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_APPROVED_BUDGET)
    private int question3SFGApprovedBudgetEditText;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_BUDGET_RECEIVED)
    private int question3SFGBudgetReceived;



    public static class Builder {
        private final EducationQuestion INSTANCE;
        public Builder() {
            INSTANCE = new EducationQuestion();
        }

        public EducationQuestion build() {
            return INSTANCE;
        }

        public Builder setFinancialYear(String financialYear) {
            INSTANCE.setFinancialYear(financialYear);
            return this;
        }

        public Builder setDate(String textValue) {
            INSTANCE.setDate(textValue);
            return this;
        }

        public Builder setDistrict(String textValue) {
            INSTANCE.setDistrict(textValue);
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

        public Builder setDivision(String textValue) {
            INSTANCE.setDivision(textValue);
            return this;
        }

        public Builder setAgentNames(String textValue) {
            INSTANCE.setFullNames(textValue);
            return this;
        }

        public Builder setTelephone(String textValue) {
            INSTANCE.setTel(textValue);
            return this;
        }

        public Builder setQuestion1Answer(String textValue) {
            INSTANCE.setQuestion1Answer(textValue);
            return this;
        }

        public Builder setQuestion2SchoolName(String textValue) {
            INSTANCE.setQuestion2SchoolName(textValue);
            return this;
        }

        public Builder setQ2MaleTeachers(int integerValue) {
            INSTANCE.setQuestion2MaleTeachers(integerValue);
            return this;
        }
        public Builder setQ2FeMaleTeachers(int integerValue) {
            INSTANCE.setQuestion2FeMaleTeachers(integerValue);
            return this;
        }

        public Builder setQ2MalePWDTeachers(int integerValue) {
            INSTANCE.setQuestion2MalePWDTeachers(integerValue);
            return this;
        }

        public Builder setQ2FemalePWDSTeachers(int integerValue) {
            return this;
        }

        public Builder setQ2TeachersTotal(int integerValue) {
            INSTANCE.setQuestion2TeachersTotal(integerValue);
            return this;
        }

        public Builder setQ2PupilEnrollmentTeachers(int integerValue) {
            INSTANCE.setQuestion2MalePupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2FeMalePupilEnrollment(int integerValue) {
            INSTANCE.setQuestion2FeMalePupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2MalePWDPupilEnrollment(int integerValue) {
            INSTANCE.setQuestion2MalePWDPupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2FemalePWDSPupilEnrollment(int integerValue) {
            INSTANCE.setQuestion2FemalePWDPupilEnrollment(integerValue);
            return this;
        }

        public Builder setQ2PupilEnrollmentTotal(int integerValue) {
            INSTANCE.setQuestion2PupilEnrollmentTotal(integerValue);
            return this;
        }

        public Builder setNumberP7Male(int integerValue) {
            INSTANCE.setQuestion2NumberP7Male(integerValue);
            return this;
        }

        public Builder setQuestionNumberP7FeMale(int integerValue) {
            INSTANCE.setQuestion2NumberP7FeMale(integerValue);
            return this;
        }

        public Builder setQuestion2NumberP7MalePWD(int integerValue) {
            INSTANCE.setQuestion2NumberP7MalePWD(integerValue);
            return this;
        }

        public Builder setQuestion2NumberP7FemalePWD(int textValue) {
            INSTANCE.setQuestion2NumberP7FeMalePWD(textValue);
            return this;
        }

        public Builder setQuestion2NumberP7Total(int integerValue) {
            INSTANCE.setQuestion2NumberP7Total(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutMale(int integerValue) {
            INSTANCE.setQuestion2NumberDropoutMale(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutFemale(int integerValue) {
            INSTANCE.setQuestion2NumberDropOutFemale(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutMalePWD(int integerValue) {
            INSTANCE.setQuestion2NumberDropoutMalePWD(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutFemalePWD(int integerValue) {
            INSTANCE.setQuestion2NumberDropOutFemalePWD(integerValue);
            return this;
        }

        public Builder setQuestion2NumberDropOutTotal(int integerValue) {
            INSTANCE.setQuestion2NumberDropOutTotal(integerValue);
            return this;
        }

        public Builder setQuestion2DropOutReasonIfAny(String textValue) {
            INSTANCE.setQuestion2DropOutReasonIfAny(textValue);
            return this;
        }

        public Builder setQ3CapitalGrantApprovedBudget(int integerValue) {
            INSTANCE.setQuestion3capitalGrantApprovedBudget(integerValue);
            return this;
        }

        public Builder setQ3CapitalGrantReleasedBudget(int integerValue) {
            INSTANCE.setQuestion3CapitalGrantReleaseBudget(integerValue);
            return this;
        }

        public Builder setQ3CapitalGrantDateReceived(String textValue) {
            INSTANCE.setQuestion3CapitalReceivedDate(textValue);
            return this;
        }

        public Builder setQ3CapitalGrantDateWithdrawn(String textValue) {
            INSTANCE.setQuestion3CapitalDateWithdrawn(textValue);
            return this;
        }

        public Builder setQ3SFGApprovedBudget(int integerValue) {
            INSTANCE.setQuestion3SFGApprovedBudgetEditText(integerValue);
            return this;
        }

        public Builder setQ3SFGBudgetReleased(int integerValue) {
            INSTANCE.setQuestion3SFGBudgetReceived(integerValue);
            return this;
        }
    }

    @Ignore
    private EducationQuestion() {
    }

    public int getQuestion3SFGBudgetReceived() {
        return question3SFGBudgetReceived;
    }

    public void setQuestion3SFGBudgetReceived(int question3SFGBudgetReceived) {
        this.question3SFGBudgetReceived = question3SFGBudgetReceived;
    }

    public int getQuestion3SFGApprovedBudgetEditText() {
        return question3SFGApprovedBudgetEditText;
    }

    public void setQuestion3SFGApprovedBudgetEditText(int question3SFGApprovedBudgetEditText) {
        this.question3SFGApprovedBudgetEditText = question3SFGApprovedBudgetEditText;
    }

    public String getQuestion3CapitalDateWithdrawn() {
        return question3CapitalDateWithdrawn;
    }

    public void setQuestion3CapitalDateWithdrawn(String question3CapitalDateWithdrawn) {
        this.question3CapitalDateWithdrawn = question3CapitalDateWithdrawn;
    }

    public String getQuestion3CapitalReceivedDate() {
        return question3CapitalReceivedDate;
    }

    public void setQuestion3CapitalReceivedDate(String question3CapitalReceivedDate) {
        this.question3CapitalReceivedDate = question3CapitalReceivedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQuestion1Answer() {
        return question1Answer;
    }

    public void setQuestion1Answer(String question1Answer) {
        this.question1Answer = question1Answer;
    }

    public String getQuestion2SchoolName() {
        return question2SchoolName;
    }

    public void setQuestion2SchoolName(String question2SchoolName) {
        this.question2SchoolName = question2SchoolName;
    }

    public int getQuestion2MaleTeachers() {
        return question2MaleTeachers;
    }

    public void setQuestion2MaleTeachers(int question2MaleTeachers) {
        this.question2MaleTeachers = question2MaleTeachers;
    }

    public int getQuestion2FeMaleTeachers() {
        return question2FeMaleTeachers;
    }

    public void setQuestion2FeMaleTeachers(int question2FeMaleTeachers) {
        this.question2FeMaleTeachers = question2FeMaleTeachers;
    }

    public int getQuestion2MalePWDTeachers() {
        return question2MalePWDTeachers;
    }

    public void setQuestion2MalePWDTeachers(int question2MalePWDTeachers) {
        this.question2MalePWDTeachers = question2MalePWDTeachers;
    }

    public int getQuestion2FemalePWDTeachers() {
        return question2FemalePWDTeachers;
    }

    public void setQuestion2FemalePWDTeachers(int question2FemalePWDTeachers) {
        this.question2FemalePWDTeachers = question2FemalePWDTeachers;
    }

    public int getQuestion2TeachersTotal() {
        return question2TeachersTotal;
    }

    public void setQuestion2TeachersTotal(int question2TeachersTotal) {
        this.question2TeachersTotal = question2TeachersTotal;
    }

    public int getQuestion2MalePupilEnrollment() {
        return question2MalePupilEnrollment;
    }

    public void setQuestion2MalePupilEnrollment(int question2MalePupilEnrollment) {
        this.question2MalePupilEnrollment = question2MalePupilEnrollment;
    }

    public int getQuestion2FeMalePupilEnrollment() {
        return question2FeMalePupilEnrollment;
    }

    public void setQuestion2FeMalePupilEnrollment(int question2FeMalePupilEnrollment) {
        this.question2FeMalePupilEnrollment = question2FeMalePupilEnrollment;
    }

    public int getQuestion2MalePWDPupilEnrollment() {
        return question2MalePWDPupilEnrollment;
    }

    public void setQuestion2MalePWDPupilEnrollment(int question2MalePWDPupilEnrollment) {
        this.question2MalePWDPupilEnrollment = question2MalePWDPupilEnrollment;
    }

    public int getQuestion2FemalePWDPupilEnrollment() {
        return question2FemalePWDPupilEnrollment;
    }

    public void setQuestion2FemalePWDPupilEnrollment(int question2FemalePWDPupilEnrollment) {
        this.question2FemalePWDPupilEnrollment = question2FemalePWDPupilEnrollment;
    }

    public int getQuestion2PupilEnrollmentTotal() {
        return question2PupilEnrollmentTotal;
    }

    public void setQuestion2PupilEnrollmentTotal(int question2PupilEnrollmentTotal) {
        this.question2PupilEnrollmentTotal = question2PupilEnrollmentTotal;
    }

    public int getQuestion2NumberP7Male() {
        return question2NumberP7Male;
    }

    public void setQuestion2NumberP7Male(int question2NumberP7Male) {
        this.question2NumberP7Male = question2NumberP7Male;
    }

    public int getQuestion2NumberP7FeMale() {
        return question2NumberP7FeMale;
    }

    public void setQuestion2NumberP7FeMale(int question2NumberP7FeMale) {
        this.question2NumberP7FeMale = question2NumberP7FeMale;
    }

    public int getQuestion2NumberP7MalePWD() {
        return question2NumberP7MalePWD;
    }

    public void setQuestion2NumberP7MalePWD(int question2NumberP7MalePWD) {
        this.question2NumberP7MalePWD = question2NumberP7MalePWD;
    }

    public int getQuestion2NumberP7FeMalePWD() {
        return question2NumberP7FeMalePWD;
    }

    public void setQuestion2NumberP7FeMalePWD(int question2NumberP7FeMalePWD) {
        this.question2NumberP7FeMalePWD = question2NumberP7FeMalePWD;
    }

    public int getQuestion2NumberP7Total() {
        return question2NumberP7Total;
    }

    public void setQuestion2NumberP7Total(int question2NumberP7Total) {
        this.question2NumberP7Total = question2NumberP7Total;
    }

    public int getQuestion2NumberDropoutMale() {
        return question2NumberDropoutMale;
    }

    public void setQuestion2NumberDropoutMale(int question2NumberDropoutMale) {
        this.question2NumberDropoutMale = question2NumberDropoutMale;
    }

    public int getQuestion2NumberDropOutFemale() {
        return question2NumberDropOutFemale;
    }

    public void setQuestion2NumberDropOutFemale(int question2NumberDropOutFemale) {
        this.question2NumberDropOutFemale = question2NumberDropOutFemale;
    }

    public int getQuestion2NumberDropoutMalePWD() {
        return question2NumberDropoutMalePWD;
    }

    public void setQuestion2NumberDropoutMalePWD(int question2NumberDropoutMalePWD) {
        this.question2NumberDropoutMalePWD = question2NumberDropoutMalePWD;
    }

    public int getQuestion2NumberDropOutFemalePWD() {
        return question2NumberDropOutFemalePWD;
    }

    public void setQuestion2NumberDropOutFemalePWD(int question2NumberDropOutFemalePWD) {
        this.question2NumberDropOutFemalePWD = question2NumberDropOutFemalePWD;
    }

    public int getQuestion2NumberDropOutTotal() {
        return question2NumberDropOutTotal;
    }

    public void setQuestion2NumberDropOutTotal(int question2NumberDropOutTotal) {
        this.question2NumberDropOutTotal = question2NumberDropOutTotal;
    }

    public String getQuestion2DropOutReasonIfAny() {
        return question2DropOutReasonIfAny;
    }

    public void setQuestion2DropOutReasonIfAny(String question2DropOutReasonIfAny) {
        this.question2DropOutReasonIfAny = question2DropOutReasonIfAny;
    }

    public int getQuestion3capitalGrantApprovedBudget() {
        return question3capitalGrantApprovedBudget;
    }

    public void setQuestion3capitalGrantApprovedBudget(int question3capitalGrantApprovedBudget) {
        this.question3capitalGrantApprovedBudget = question3capitalGrantApprovedBudget;
    }
}
