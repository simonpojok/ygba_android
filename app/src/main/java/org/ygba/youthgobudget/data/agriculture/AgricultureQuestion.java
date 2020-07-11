package org.ygba.youthgobudget.data.agriculture;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = AgricultureConstants.TABLE_NAME)
public class AgricultureQuestion {
    @ColumnInfo(name = AgricultureConstants.PRIMARY_KEY)
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = AgricultureConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = AgricultureConstants.DATE)
    private String date;

    @ColumnInfo(name = AgricultureConstants.VILLAGE)
    private String village;4

    @ColumnInfo(name = AgricultureConstants.PARISH)
    private String parish;

    @ColumnInfo(name = AgricultureConstants.SUB_COUNTY)
    private String subCounty;

    @ColumnInfo(name = AgricultureConstants.AGENT_NAME)
    private String agentName;

    @ColumnInfo(name = AgricultureConstants.TELEPHONE)
    private String tel;

    @ColumnInfo(name = AgricultureConstants.NUMBER)
    private String agentNumber;

    @ColumnInfo(name = AgricultureConstants.QUESTION_1_OBJECTIVE)
    private String question1Objective;

    @ColumnInfo(name = AgricultureConstants.QUESTION_1_REASON)
    private String question1Reason;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_EXT_EXPECTED)
    private String question2ExtensionExpectedAmount;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_EXT_RECEIVED)
    private String question2ExtensionAmountReceived;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_EXT_DATE_RECEIVED)
    private String question2ExtensionDateReceived;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_EXT_DATE_WITHDRAWN)
    private String question2ExtensionDateWithdram;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_DEV_EXPECTED_AMOUNT)
    private String question2DevelopmentAmountExpected;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_DEV_AMOUNT_RECEIVED)
    private String question2DevelopmentAmountReceived;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_DEV_DATE_RECEIVED)
    private String question2DevelopmentDateReceived;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_DEV_DATE_WITHDRAWN)
    private String question2DevelopmentDateWithdrawn;
}
