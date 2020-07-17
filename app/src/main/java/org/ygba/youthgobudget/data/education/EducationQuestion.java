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
}
