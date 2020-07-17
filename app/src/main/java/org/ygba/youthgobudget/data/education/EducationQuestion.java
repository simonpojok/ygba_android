package org.ygba.youthgobudget.data.education;

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
    }

    @Ignore
    private EducationQuestion() {
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
}
