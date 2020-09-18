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
    private String village;

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

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_1_NUMBER_VISITS)
    private String answerQuestion2_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_2_DEMONSTRATION)
    private String answerQuestion2_2;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_3_NUMBER)
    private String answerQuestion2_3;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_4_MENTION)
    private String answerQuestion2_4;

    @ColumnInfo(name = AgricultureConstants.QUESTION_2_5_REASON)
    private String answerQuestion2_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_3_1_ADVISORY)
    private String answerQuestion3_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_3_2_NUMBER)
    private String answerQuestion3_2;

    @ColumnInfo(name = AgricultureConstants.QUESTION_3_3_MENTION)
    private String answerQuestion3_3;

    @ColumnInfo(name = AgricultureConstants.QUESTION_3_4_MALE)
    private String answerQuestion3_4_Male;

    @ColumnInfo(name = AgricultureConstants.QUESTION_3_4_FEMALE)
    private String answerQuestion3_4_Female;

    @ColumnInfo(name = AgricultureConstants.QUESTION_3_5_REASON)
    private String answerQuestion3_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_1_INPUTS)
    private String answerQuestion4_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_INPUT_1)
    private String answerQuestion4_2_Input_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_DATE_1)
    private String answerQuestion4_2_Date_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_MALE_NUMBER_1)
    private String answerQuestion4_2_Male_Number_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_FEMALE_NUMBER_1)
    private String answerQuestion4_2_Female_Number_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_VILLAGE_1)
    private String answerQuestion4_2_village_1;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_INPUT_2)
    private String answerQuestion4_2_Input_2;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_DATE_2)
    private String answerQuestion4_2_Date_2;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_MALE_NUMBER_2)
    private String answerQuestion4_2_Male_Number_2;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_FEMALE_NUMBER_2)
    private String answerQuestion4_2_Female_Number_2;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_VILLAGE_2)
    private String answerQuestion4_2_village_2;

    // row 3
    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_INPUT_3)
    private String answerQuestion4_2_Input_3;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_DATE_3)
    private String answerQuestion4_2_Date_3;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_MALE_NUMBER_3)
    private String answerQuestion4_2_Male_Number_3;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_FEMALE_NUMBER_3)
    private String answerQuestion4_2_Female_Number_3;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_VILLAGE_3)
    private String answerQuestion4_2_village_3;


    // row 3
    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_INPUT_4)
    private String answerQuestion4_2_Input_4;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_DATE_4)
    private String answerQuestion4_2_Date_4;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_MALE_NUMBER_4)
    private String answerQuestion4_2_Male_Number_4;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_FEMALE_NUMBER_4)
    private String answerQuestion4_2_Female_Number_4;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_VILLAGE_4)
    private String answerQuestion4_2_village_4;

    // row 3
    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_INPUT_5)
    private String answerQuestion4_2_Input_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_DATE_5)
    private String answerQuestion4_2_Date_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_MALE_NUMBER_5)
    private String answerQuestion4_2_Male_Number_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_FEMALE_NUMBER_5)
    private String answerQuestion4_2_Female_Number_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_2_VILLAGE_5)
    private String answerQuestion4_2_village_5;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_3_REASON)
    private String answerQuestion4_3_reason;

    @ColumnInfo(name = AgricultureConstants.QUESTION_4_3_ANY_REASON)
    private String answerQuestion4_3_otherReason;

    @ColumnInfo(name = AgricultureConstants.IS_STORED_LOCALLY)
    private boolean storedLocally;

    @ColumnInfo(name = AgricultureConstants.QUARTER_COLUMN_NAME)
    private String quarter;

    public AgricultureQuestion(String financialYear, String quarter, String date, String village, String parish, String subCounty, String agentName, String tel, String agentNumber, String question1Objective, String question1Reason, String question2ExtensionExpectedAmount, String question2ExtensionAmountReceived, String question2ExtensionDateReceived, String question2ExtensionDateWithdram, String question2DevelopmentAmountExpected, String question2DevelopmentAmountReceived, String question2DevelopmentDateReceived, String question2DevelopmentDateWithdrawn, String answerQuestion2_1, String answerQuestion2_2, String answerQuestion2_3, String answerQuestion2_4, String answerQuestion2_5, String answerQuestion3_1, String answerQuestion3_2, String answerQuestion3_3, String answerQuestion3_4_Male, String answerQuestion3_4_Female, String answerQuestion3_5, String answerQuestion4_1, String answerQuestion4_2_Input_1, String answerQuestion4_2_Date_1, String answerQuestion4_2_Male_Number_1, String answerQuestion4_2_Female_Number_1, String answerQuestion4_2_village_1, String answerQuestion4_2_Input_2, String answerQuestion4_2_Date_2, String answerQuestion4_2_Male_Number_2, String answerQuestion4_2_Female_Number_2, String answerQuestion4_2_village_2, String answerQuestion4_2_Input_3, String answerQuestion4_2_Date_3, String answerQuestion4_2_Male_Number_3, String answerQuestion4_2_Female_Number_3, String answerQuestion4_2_village_3, String answerQuestion4_2_Input_4, String answerQuestion4_2_Date_4, String answerQuestion4_2_Male_Number_4, String answerQuestion4_2_Female_Number_4, String answerQuestion4_2_village_4, String answerQuestion4_2_Input_5, String answerQuestion4_2_Date_5, String answerQuestion4_2_Male_Number_5, String answerQuestion4_2_Female_Number_5, String answerQuestion4_2_village_5, String answerQuestion4_3_reason, String answerQuestion4_3_otherReason) {
        this.financialYear = financialYear;
        this.quarter = quarter;
        this.date = date;
        this.village = village;
        this.parish = parish;
        this.subCounty = subCounty;
        this.agentName = agentName;
        this.tel = tel;
        this.agentNumber = agentNumber;
        this.question1Objective = question1Objective;
        this.question1Reason = question1Reason;
        this.question2ExtensionExpectedAmount = question2ExtensionExpectedAmount;
        this.question2ExtensionAmountReceived = question2ExtensionAmountReceived;
        this.question2ExtensionDateReceived = question2ExtensionDateReceived;
        this.question2ExtensionDateWithdram = question2ExtensionDateWithdram;
        this.question2DevelopmentAmountExpected = question2DevelopmentAmountExpected;
        this.question2DevelopmentAmountReceived = question2DevelopmentAmountReceived;
        this.question2DevelopmentDateReceived = question2DevelopmentDateReceived;
        this.question2DevelopmentDateWithdrawn = question2DevelopmentDateWithdrawn;
        this.answerQuestion2_1 = answerQuestion2_1;
        this.answerQuestion2_2 = answerQuestion2_2;
        this.answerQuestion2_3 = answerQuestion2_3;
        this.answerQuestion2_4 = answerQuestion2_4;
        this.answerQuestion2_5 = answerQuestion2_5;
        this.answerQuestion3_1 = answerQuestion3_1;
        this.answerQuestion3_2 = answerQuestion3_2;
        this.answerQuestion3_3 = answerQuestion3_3;
        this.answerQuestion3_4_Male = answerQuestion3_4_Male;
        this.answerQuestion3_4_Female = answerQuestion3_4_Female;
        this.answerQuestion3_5 = answerQuestion3_5;
        this.answerQuestion4_1 = answerQuestion4_1;
        this.answerQuestion4_2_Input_1 = answerQuestion4_2_Input_1;
        this.answerQuestion4_2_Date_1 = answerQuestion4_2_Date_1;
        this.answerQuestion4_2_Male_Number_1 = answerQuestion4_2_Male_Number_1;
        this.answerQuestion4_2_Female_Number_1 = answerQuestion4_2_Female_Number_1;
        this.answerQuestion4_2_village_1 = answerQuestion4_2_village_1;
        this.answerQuestion4_2_Input_2 = answerQuestion4_2_Input_2;
        this.answerQuestion4_2_Date_2 = answerQuestion4_2_Date_2;
        this.answerQuestion4_2_Male_Number_2 = answerQuestion4_2_Male_Number_2;
        this.answerQuestion4_2_Female_Number_2 = answerQuestion4_2_Female_Number_2;
        this.answerQuestion4_2_village_2 = answerQuestion4_2_village_2;
        this.answerQuestion4_2_Input_3 = answerQuestion4_2_Input_3;
        this.answerQuestion4_2_Date_3 = answerQuestion4_2_Date_3;
        this.answerQuestion4_2_Male_Number_3 = answerQuestion4_2_Male_Number_3;
        this.answerQuestion4_2_Female_Number_3 = answerQuestion4_2_Female_Number_3;
        this.answerQuestion4_2_village_3 = answerQuestion4_2_village_3;
        this.answerQuestion4_2_Input_4 = answerQuestion4_2_Input_4;
        this.answerQuestion4_2_Date_4 = answerQuestion4_2_Date_4;
        this.answerQuestion4_2_Male_Number_4 = answerQuestion4_2_Male_Number_4;
        this.answerQuestion4_2_Female_Number_4 = answerQuestion4_2_Female_Number_4;
        this.answerQuestion4_2_village_4 = answerQuestion4_2_village_4;
        this.answerQuestion4_2_Input_5 = answerQuestion4_2_Input_5;
        this.answerQuestion4_2_Date_5 = answerQuestion4_2_Date_5;
        this.answerQuestion4_2_Male_Number_5 = answerQuestion4_2_Male_Number_5;
        this.answerQuestion4_2_Female_Number_5 = answerQuestion4_2_Female_Number_5;
        this.answerQuestion4_2_village_5 = answerQuestion4_2_village_5;
        this.answerQuestion4_3_reason = answerQuestion4_3_reason;
        this.answerQuestion4_3_otherReason = answerQuestion4_3_otherReason;
        this.storedLocally = true;
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

    public String getSubCounty() {
        return subCounty;
    }

    public void setSubCounty(String subCounty) {
        this.subCounty = subCounty;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    public String getQuestion1Objective() {
        return question1Objective;
    }

    public void setQuestion1Objective(String question1Objective) {
        this.question1Objective = question1Objective;
    }

    public String getQuestion1Reason() {
        return question1Reason;
    }

    public void setQuestion1Reason(String question1Reason) {
        this.question1Reason = question1Reason;
    }

    public String getQuestion2ExtensionExpectedAmount() {
        return question2ExtensionExpectedAmount;
    }

    public void setQuestion2ExtensionExpectedAmount(String question2ExtensionExpectedAmount) {
        this.question2ExtensionExpectedAmount = question2ExtensionExpectedAmount;
    }

    public String getQuestion2ExtensionAmountReceived() {
        return question2ExtensionAmountReceived;
    }

    public void setQuestion2ExtensionAmountReceived(String question2ExtensionAmountReceived) {
        this.question2ExtensionAmountReceived = question2ExtensionAmountReceived;
    }

    public String getQuestion2ExtensionDateReceived() {
        return question2ExtensionDateReceived;
    }

    public void setQuestion2ExtensionDateReceived(String question2ExtensionDateReceived) {
        this.question2ExtensionDateReceived = question2ExtensionDateReceived;
    }

    public String getQuestion2ExtensionDateWithdram() {
        return question2ExtensionDateWithdram;
    }

    public void setQuestion2ExtensionDateWithdram(String question2ExtensionDateWithdram) {
        this.question2ExtensionDateWithdram = question2ExtensionDateWithdram;
    }

    public String getQuestion2DevelopmentAmountExpected() {
        return question2DevelopmentAmountExpected;
    }

    public void setQuestion2DevelopmentAmountExpected(String question2DevelopmentAmountExpected) {
        this.question2DevelopmentAmountExpected = question2DevelopmentAmountExpected;
    }

    public String getQuestion2DevelopmentAmountReceived() {
        return question2DevelopmentAmountReceived;
    }

    public void setQuestion2DevelopmentAmountReceived(String question2DevelopmentAmountReceived) {
        this.question2DevelopmentAmountReceived = question2DevelopmentAmountReceived;
    }

    public String getQuestion2DevelopmentDateReceived() {
        return question2DevelopmentDateReceived;
    }

    public void setQuestion2DevelopmentDateReceived(String question2DevelopmentDateReceived) {
        this.question2DevelopmentDateReceived = question2DevelopmentDateReceived;
    }

    public String getQuestion2DevelopmentDateWithdrawn() {
        return question2DevelopmentDateWithdrawn;
    }

    public void setQuestion2DevelopmentDateWithdrawn(String question2DevelopmentDateWithdrawn) {
        this.question2DevelopmentDateWithdrawn = question2DevelopmentDateWithdrawn;
    }

    public String getAnswerQuestion2_1() {
        return answerQuestion2_1;
    }

    public void setAnswerQuestion2_1(String answerQuestion2_1) {
        this.answerQuestion2_1 = answerQuestion2_1;
    }

    public String getAnswerQuestion2_2() {
        return answerQuestion2_2;
    }

    public void setAnswerQuestion2_2(String answerQuestion2_2) {
        this.answerQuestion2_2 = answerQuestion2_2;
    }

    public String getAnswerQuestion2_3() {
        return answerQuestion2_3;
    }

    public void setAnswerQuestion2_3(String answerQuestion2_3) {
        this.answerQuestion2_3 = answerQuestion2_3;
    }

    public String getAnswerQuestion2_4() {
        return answerQuestion2_4;
    }

    public void setAnswerQuestion2_4(String answerQuestion2_4) {
        this.answerQuestion2_4 = answerQuestion2_4;
    }

    public String getAnswerQuestion2_5() {
        return answerQuestion2_5;
    }

    public void setAnswerQuestion2_5(String answerQuestion2_5) {
        this.answerQuestion2_5 = answerQuestion2_5;
    }

    public String getAnswerQuestion3_1() {
        return answerQuestion3_1;
    }

    public void setAnswerQuestion3_1(String answerQuestion3_1) {
        this.answerQuestion3_1 = answerQuestion3_1;
    }

    public String getAnswerQuestion3_2() {
        return answerQuestion3_2;
    }

    public void setAnswerQuestion3_2(String answerQuestion3_2) {
        this.answerQuestion3_2 = answerQuestion3_2;
    }

    public String getAnswerQuestion3_3() {
        return answerQuestion3_3;
    }

    public void setAnswerQuestion3_3(String answerQuestion3_3) {
        this.answerQuestion3_3 = answerQuestion3_3;
    }

    public String getAnswerQuestion3_4_Male() {
        return answerQuestion3_4_Male;
    }

    public void setAnswerQuestion3_4_Male(String answerQuestion3_4_Male) {
        this.answerQuestion3_4_Male = answerQuestion3_4_Male;
    }

    public String getAnswerQuestion3_4_Female() {
        return answerQuestion3_4_Female;
    }

    public void setAnswerQuestion3_4_Female(String answerQuestion3_4_Female) {
        this.answerQuestion3_4_Female = answerQuestion3_4_Female;
    }

    public String getAnswerQuestion3_5() {
        return answerQuestion3_5;
    }

    public void setAnswerQuestion3_5(String answerQuestion3_5) {
        this.answerQuestion3_5 = answerQuestion3_5;
    }

    public String getAnswerQuestion4_1() {
        return answerQuestion4_1;
    }

    public void setAnswerQuestion4_1(String answerQuestion4_1) {
        this.answerQuestion4_1 = answerQuestion4_1;
    }

    public String getAnswerQuestion4_2_Input_1() {
        return answerQuestion4_2_Input_1;
    }

    public void setAnswerQuestion4_2_Input_1(String answerQuestion4_2_Input_1) {
        this.answerQuestion4_2_Input_1 = answerQuestion4_2_Input_1;
    }

    public String getAnswerQuestion4_2_Date_1() {
        return answerQuestion4_2_Date_1;
    }

    public void setAnswerQuestion4_2_Date_1(String answerQuestion4_2_Date_1) {
        this.answerQuestion4_2_Date_1 = answerQuestion4_2_Date_1;
    }

    public String getAnswerQuestion4_2_Male_Number_1() {
        return answerQuestion4_2_Male_Number_1;
    }

    public void setAnswerQuestion4_2_Male_Number_1(String answerQuestion4_2_Male_Number_1) {
        this.answerQuestion4_2_Male_Number_1 = answerQuestion4_2_Male_Number_1;
    }

    public String getAnswerQuestion4_2_Female_Number_1() {
        return answerQuestion4_2_Female_Number_1;
    }

    public void setAnswerQuestion4_2_Female_Number_1(String answerQuestion4_2_Female_Number_1) {
        this.answerQuestion4_2_Female_Number_1 = answerQuestion4_2_Female_Number_1;
    }

    public String getAnswerQuestion4_2_village_1() {
        return answerQuestion4_2_village_1;
    }

    public void setAnswerQuestion4_2_village_1(String answerQuestion4_2_village_1) {
        this.answerQuestion4_2_village_1 = answerQuestion4_2_village_1;
    }

    public String getAnswerQuestion4_2_Input_2() {
        return answerQuestion4_2_Input_2;
    }

    public void setAnswerQuestion4_2_Input_2(String answerQuestion4_2_Input_2) {
        this.answerQuestion4_2_Input_2 = answerQuestion4_2_Input_2;
    }

    public String getAnswerQuestion4_2_Date_2() {
        return answerQuestion4_2_Date_2;
    }

    public void setAnswerQuestion4_2_Date_2(String answerQuestion4_2_Date_2) {
        this.answerQuestion4_2_Date_2 = answerQuestion4_2_Date_2;
    }

    public String getAnswerQuestion4_2_Male_Number_2() {
        return answerQuestion4_2_Male_Number_2;
    }

    public void setAnswerQuestion4_2_Male_Number_2(String answerQuestion4_2_Male_Number_2) {
        this.answerQuestion4_2_Male_Number_2 = answerQuestion4_2_Male_Number_2;
    }

    public String getAnswerQuestion4_2_Female_Number_2() {
        return answerQuestion4_2_Female_Number_2;
    }

    public void setAnswerQuestion4_2_Female_Number_2(String answerQuestion4_2_Female_Number_2) {
        this.answerQuestion4_2_Female_Number_2 = answerQuestion4_2_Female_Number_2;
    }

    public String getAnswerQuestion4_2_village_2() {
        return answerQuestion4_2_village_2;
    }

    public void setAnswerQuestion4_2_village_2(String answerQuestion4_2_village_2) {
        this.answerQuestion4_2_village_2 = answerQuestion4_2_village_2;
    }

    public String getAnswerQuestion4_2_Input_3() {
        return answerQuestion4_2_Input_3;
    }

    public void setAnswerQuestion4_2_Input_3(String answerQuestion4_2_Input_3) {
        this.answerQuestion4_2_Input_3 = answerQuestion4_2_Input_3;
    }

    public String getAnswerQuestion4_2_Date_3() {
        return answerQuestion4_2_Date_3;
    }

    public void setAnswerQuestion4_2_Date_3(String answerQuestion4_2_Date_3) {
        this.answerQuestion4_2_Date_3 = answerQuestion4_2_Date_3;
    }

    public String getAnswerQuestion4_2_Male_Number_3() {
        return answerQuestion4_2_Male_Number_3;
    }

    public void setAnswerQuestion4_2_Male_Number_3(String answerQuestion4_2_Male_Number_3) {
        this.answerQuestion4_2_Male_Number_3 = answerQuestion4_2_Male_Number_3;
    }

    public String getAnswerQuestion4_2_Female_Number_3() {
        return answerQuestion4_2_Female_Number_3;
    }

    public void setAnswerQuestion4_2_Female_Number_3(String answerQuestion4_2_Female_Number_3) {
        this.answerQuestion4_2_Female_Number_3 = answerQuestion4_2_Female_Number_3;
    }

    public String getAnswerQuestion4_2_village_3() {
        return answerQuestion4_2_village_3;
    }

    public void setAnswerQuestion4_2_village_3(String answerQuestion4_2_village_3) {
        this.answerQuestion4_2_village_3 = answerQuestion4_2_village_3;
    }

    public String getAnswerQuestion4_2_Input_4() {
        return answerQuestion4_2_Input_4;
    }

    public void setAnswerQuestion4_2_Input_4(String answerQuestion4_2_Input_4) {
        this.answerQuestion4_2_Input_4 = answerQuestion4_2_Input_4;
    }

    public String getAnswerQuestion4_2_Date_4() {
        return answerQuestion4_2_Date_4;
    }

    public void setAnswerQuestion4_2_Date_4(String answerQuestion4_2_Date_4) {
        this.answerQuestion4_2_Date_4 = answerQuestion4_2_Date_4;
    }

    public String getAnswerQuestion4_2_Male_Number_4() {
        return answerQuestion4_2_Male_Number_4;
    }

    public void setAnswerQuestion4_2_Male_Number_4(String answerQuestion4_2_Male_Number_4) {
        this.answerQuestion4_2_Male_Number_4 = answerQuestion4_2_Male_Number_4;
    }

    public String getAnswerQuestion4_2_Female_Number_4() {
        return answerQuestion4_2_Female_Number_4;
    }

    public void setAnswerQuestion4_2_Female_Number_4(String answerQuestion4_2_Female_Number_4) {
        this.answerQuestion4_2_Female_Number_4 = answerQuestion4_2_Female_Number_4;
    }

    public String getAnswerQuestion4_2_village_4() {
        return answerQuestion4_2_village_4;
    }

    public void setAnswerQuestion4_2_village_4(String answerQuestion4_2_village_4) {
        this.answerQuestion4_2_village_4 = answerQuestion4_2_village_4;
    }

    public String getAnswerQuestion4_2_Input_5() {
        return answerQuestion4_2_Input_5;
    }

    public void setAnswerQuestion4_2_Input_5(String answerQuestion4_2_Input_5) {
        this.answerQuestion4_2_Input_5 = answerQuestion4_2_Input_5;
    }

    public String getAnswerQuestion4_2_Date_5() {
        return answerQuestion4_2_Date_5;
    }

    public void setAnswerQuestion4_2_Date_5(String answerQuestion4_2_Date_5) {
        this.answerQuestion4_2_Date_5 = answerQuestion4_2_Date_5;
    }

    public String getAnswerQuestion4_2_Male_Number_5() {
        return answerQuestion4_2_Male_Number_5;
    }

    public void setAnswerQuestion4_2_Male_Number_5(String answerQuestion4_2_Male_Number_5) {
        this.answerQuestion4_2_Male_Number_5 = answerQuestion4_2_Male_Number_5;
    }

    public String getAnswerQuestion4_2_Female_Number_5() {
        return answerQuestion4_2_Female_Number_5;
    }

    public void setAnswerQuestion4_2_Female_Number_5(String answerQuestion4_2_Female_Number_5) {
        this.answerQuestion4_2_Female_Number_5 = answerQuestion4_2_Female_Number_5;
    }

    public String getAnswerQuestion4_2_village_5() {
        return answerQuestion4_2_village_5;
    }

    public void setAnswerQuestion4_2_village_5(String answerQuestion4_2_village_5) {
        this.answerQuestion4_2_village_5 = answerQuestion4_2_village_5;
    }

    public String getAnswerQuestion4_3_reason() {
        return answerQuestion4_3_reason;
    }

    public void setAnswerQuestion4_3_reason(String answerQuestion4_3_reason) {
        this.answerQuestion4_3_reason = answerQuestion4_3_reason;
    }

    public String getAnswerQuestion4_3_otherReason() {
        return answerQuestion4_3_otherReason;
    }

    public void setAnswerQuestion4_3_otherReason(String answerQuestion4_3_otherReason) {
        this.answerQuestion4_3_otherReason = answerQuestion4_3_otherReason;
    }

    public boolean isStoredLocally() {
        return storedLocally;
    }

    public void setStoredLocally(boolean storedLocally) {
        this.storedLocally = storedLocally;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }
}
