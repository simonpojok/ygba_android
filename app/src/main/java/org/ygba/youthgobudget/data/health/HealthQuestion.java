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
}
