package org.ygba.youthgobudget.data.socialdevelopment;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = SocialDevelopmentConstants.TABLE_NAME)
public class SocialDevelopmentQuestion {

    @ColumnInfo(name = SocialDevelopmentConstants.PRIMARY_KEY)
    @PrimaryKey(autoGenerate = true)
    private int primaryKey;

    @ColumnInfo(name = SocialDevelopmentConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = SocialDevelopmentConstants.DATE)
    private String date;

    @ColumnInfo(name = SocialDevelopmentConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = SocialDevelopmentConstants.VILLAGE)
    private String village;

    @ColumnInfo(name = SocialDevelopmentConstants.PARISH)
    private String parish;

    @ColumnInfo(name = SocialDevelopmentConstants.DIVISION)
    private String division;

    @ColumnInfo(name = SocialDevelopmentConstants.AGENT_NAME)
    private String ygbaAgentFullName;

    @ColumnInfo(name = SocialDevelopmentConstants.YGBA_TEL)
    private String ygbaTel;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_EXPECTED_APPROVED)
    private double q2CommunityExpected;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_AMOUNT_RECEIVED)
    private double q2CommunityAmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_DATE_RECEIVED)
    private String q2CommunityDateReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_DATE_WITHDRAWN)
    private String q2CommunityDateWithdrawn;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHER_AMOUNT_EXPECTED)
    private double q2OtherExpectedAmount;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHER_AMOUNT_RECEIVED)
    private double q2OtherAmountedReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHERS_DATE_RECEIVED)
    private String q2OthersDateReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHERS_DAE_WITHDRAWN)
    private String q2OthersDateWithdrawn;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_EMPOWERMENT_OBJECTIVE)
    private boolean q3WomenEmpowermentObjective;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_EMPOWERMENT_OBJECTIVE_REASON)
    private String q3WomenEmpowermentObjectiveReason;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_NAME)
    private String q3WomanGroup1Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_VILLAGE)
    private String q3WomenGroup1Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_MALE_NUMBER)
    private int q3WomenGroup1MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_FEMALE_NUMBER)
    private int q3WomenGroup1FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_AMOUNT_RECEIVED)
    private double q3WomenGroup1AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_NAME)
    private String q3WomanGroup2Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_VILLAGE)
    private String q3WomenGroup2Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_MALE_NUMBER)
    private int q3WomenGroup2MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_FEMALE_NUMBER)
    private int q3WomenGroup2FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_AMOUNT_RECEIVED)
    private double q3WomenGroup2AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_NAME)
    private String q3WomanGroup3Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_VILLAGE)
    private String q3WomenGroup3Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_MALE_NUMBER)
    private int q3WomenGroup3MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_FEMALE_NUMBER)
    private int q3WomenGroup3FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_AMOUNT_RECEIVED)
    private double q3WomenGroup3AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_NAME)
    private String q3WomanGroup4Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_VILLAGE)
    private String q3WomenGroup4Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_MALE_NUMBER)
    private int q3WomenGroup4MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_FEMALE_NUMBER)
    private int q3WomenGroup4FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_AMOUNT_RECEIVED)
    private double q3WomenGroup4AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_NAME)
    private String q3WomanGroup5Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_VILLAGE)
    private String q3WomenGroup5Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_MALE_NUMBER)
    private int q3WomenGroup5MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_FEMALE_NUMBER)
    private int q3WomenGroup5FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_AMOUNT_RECEIVED)
    private double q3WomenGroup5AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_NAME)
    private String q3WomanGroup6Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_VILLAGE)
    private String q3WomenGroup6Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_MALE_NUMBER)
    private int q3WomenGroup6MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_FEMALE_NUMBER)
    private int q3WomenGroup6FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_AMOUNT_RECEIVED)
    private double q3WomenGroup6AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_NAME)
    private String q3WomanGroup7Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_VILLAGE)
    private String q3WomenGroup7Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_MALE_NUMBER)
    private int q3WomenGroup7MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_FEMALE_NUMBER)
    private int q3WomenGroup7FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_AMOUNT_RECEIVED)
    private double q3WomenGroup7AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_LIVELIHOOD_OBJECTIVE)
    private boolean q4LivelihoodObjective;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_LIVELIHOOD_OBJECTIVE_REASON)
    private String q4LivelihoodObjectiveReason;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_NAME)
    private String q4YouthGroup1Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_VILLAGE)
    private String q4YouthGroup1Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_MALE_NUMBER)
    private int q4YouthGroup1MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_FEMALE_NUMBER)
    private int q4YouthGroup1FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_AMOUNT_RECEIVED)
    private double q4YouthGroup1AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_NAME)
    private String q4YouthGroup2Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_VILLAGE)
    private String q4YouthGroup2Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_MALE_NUMBER)
    private int q4YouthGroup2MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_FEMALE_NUMBER)
    private int q4YouthGroup2FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_AMOUNT_RECEIVED)
    private double q4YouthGroup2AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_NAME)
    private String q4YouthGroup3Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_VILLAGE)
    private String q4YouthGroup3Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_MALE_NUMBER)
    private int q4YouthGroup3MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_FEMALE_NUMBER)
    private int q4YouthGroup3FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_AMOUNT_RECEIVED)
    private double q4YouthGroup3AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_NAME)
    private String q4YouthGroup4Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_VILLAGE)
    private String q4YouthGroup4Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_MALE_NUMBER)
    private int q4YouthGroup4MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_FEMALE_NUMBER)
    private int q4YouthGroup4FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_AMOUNT_RECEIVED)
    private double q4YouthGroup4AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_NAME)
    private String q4YouthGroup5Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_VILLAGE)
    private String q4YouthGroup5Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_MALE_NUMBER)
    private int q4YouthGroup5MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_FEMALE_NUMBER)
    private int q4YouthGroup5FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_AMOUNT_RECEIVED)
    private double q4YouthGroup5AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_NAME)
    private String q4YouthGroup6Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_VILLAGE)
    private String q4YouthGroup6Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_MALE_NUMBER)
    private int q4YouthGroup6MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_FEMALE_NUMBER)
    private int q4YouthGroup6FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_AMOUNT_RECEIVED)
    private double q4YouthGroup6AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_NAME)
    private String q4YouthGroup7Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_VILLAGE)
    private String q4YouthGroup7Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_MALE_NUMBER)
    private int q4YouthGroup7MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_FEMALE_NUMBER)
    private int q4YouthGroup7FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_AMOUNT_RECEIVED)
    private double q4YouthGroup7AmountReceived;


    @ColumnInfo(name = SocialDevelopmentConstants.Q5_NUMBER_MALE_TRAINED)
    private int q5NumberMaleTrained;

    @ColumnInfo(name = SocialDevelopmentConstants.Q5_NUMBER_FEMALE_TRAINED)
    private int q5NumberFemaleTrained;

    @ColumnInfo(name = SocialDevelopmentConstants.Q6_COMMUNITY_GROUP_FORMED)
    private String q6CommunityGroupFormed;

    @ColumnInfo(name = SocialDevelopmentConstants.Q7_OTHER_OBSERVATION_AND_CHALLENGES)
    private String q7OtherChallengesObservations;

    @ColumnInfo(name = SocialDevelopmentConstants.LOCALLY_STORED)
    private boolean locallyStored;

    public SocialDevelopmentQuestion(String financialYear, String date, String district, String village, String parish, String division, String ygbaAgentFullName, String ygbaTel, double q2CommunityExpected, double q2CommunityAmountReceived, String q2CommunityDateReceived, String q2CommunityDateWithdrawn, double q2OtherExpectedAmount, double q2OtherAmountedReceived, String q2OthersDateReceived, String q2OthersDateWithdrawn, boolean q3WomenEmpowermentObjective, String q3WomenEmpowermentObjectiveReason, String q3WomanGroup1Name, String q3WomenGroup1Village, int q3WomenGroup1MaleNumber, int q3WomenGroup1FemaleNumber, double q3WomenGroup1AmountReceived, String q3WomanGroup2Name, String q3WomenGroup2Village, int q3WomenGroup2MaleNumber, int q3WomenGroup2FemaleNumber, double q3WomenGroup2AmountReceived, String q3WomanGroup3Name, String q3WomenGroup3Village, int q3WomenGroup3MaleNumber, int q3WomenGroup3FemaleNumber, double q3WomenGroup3AmountReceived, String q3WomanGroup4Name, String q3WomenGroup4Village, int q3WomenGroup4MaleNumber, int q3WomenGroup4FemaleNumber, double q3WomenGroup4AmountReceived, String q3WomanGroup5Name, String q3WomenGroup5Village, int q3WomenGroup5MaleNumber, int q3WomenGroup5FemaleNumber, double q3WomenGroup5AmountReceived, String q3WomanGroup6Name, String q3WomenGroup6Village, int q3WomenGroup6MaleNumber, int q3WomenGroup6FemaleNumber, double q3WomenGroup6AmountReceived, String q3WomanGroup7Name, String q3WomenGroup7Village, int q3WomenGroup7MaleNumber, int q3WomenGroup7FemaleNumber, double q3WomenGroup7AmountReceived, boolean q4LivelihoodObjective, String q4LivelihoodObjectiveReason, String q4YouthGroup1Name, String q4YouthGroup1Village, int q4YouthGroup1MaleNumber, int q4YouthGroup1FemaleNumber, double q4YouthGroup1AmountReceived, String q4YouthGroup2Name, String q4YouthGroup2Village, int q4YouthGroup2MaleNumber, int q4YouthGroup2FemaleNumber, double q4YouthGroup2AmountReceived, String q4YouthGroup3Name, String q4YouthGroup3Village, int q4YouthGroup3MaleNumber, int q4YouthGroup3FemaleNumber, double q4YouthGroup3AmountReceived, String q4YouthGroup4Name, String q4YouthGroup4Village, int q4YouthGroup4MaleNumber, int q4YouthGroup4FemaleNumber, double q4YouthGroup4AmountReceived, String q4YouthGroup5Name, String q4YouthGroup5Village, int q4YouthGroup5MaleNumber, int q4YouthGroup5FemaleNumber, double q4YouthGroup5AmountReceived, String q4YouthGroup6Name, String q4YouthGroup6Village, int q4YouthGroup6MaleNumber, int q4YouthGroup6FemaleNumber, double q4YouthGroup6AmountReceived, String q4YouthGroup7Name, String q4YouthGroup7Village, int q4YouthGroup7MaleNumber, int q4YouthGroup7FemaleNumber, double q4YouthGroup7AmountReceived, int q5NumberMaleTrained, int q5NumberFemaleTrained, String q6CommunityGroupFormed, String q7OtherChallengesObservations) {
        this.financialYear = financialYear;
        this.date = date;
        this.district = district;
        this.village = village;
        this.parish = parish;
        this.division = division;
        this.ygbaAgentFullName = ygbaAgentFullName;
        this.ygbaTel = ygbaTel;
        this.q2CommunityExpected = q2CommunityExpected;
        this.q2CommunityAmountReceived = q2CommunityAmountReceived;
        this.q2CommunityDateReceived = q2CommunityDateReceived;
        this.q2CommunityDateWithdrawn = q2CommunityDateWithdrawn;
        this.q2OtherExpectedAmount = q2OtherExpectedAmount;
        this.q2OtherAmountedReceived = q2OtherAmountedReceived;
        this.q2OthersDateReceived = q2OthersDateReceived;
        this.q2OthersDateWithdrawn = q2OthersDateWithdrawn;
        this.q3WomenEmpowermentObjective = q3WomenEmpowermentObjective;
        this.q3WomenEmpowermentObjectiveReason = q3WomenEmpowermentObjectiveReason;
        this.q3WomanGroup1Name = q3WomanGroup1Name;
        this.q3WomenGroup1Village = q3WomenGroup1Village;
        this.q3WomenGroup1MaleNumber = q3WomenGroup1MaleNumber;
        this.q3WomenGroup1FemaleNumber = q3WomenGroup1FemaleNumber;
        this.q3WomenGroup1AmountReceived = q3WomenGroup1AmountReceived;
        this.q3WomanGroup2Name = q3WomanGroup2Name;
        this.q3WomenGroup2Village = q3WomenGroup2Village;
        this.q3WomenGroup2MaleNumber = q3WomenGroup2MaleNumber;
        this.q3WomenGroup2FemaleNumber = q3WomenGroup2FemaleNumber;
        this.q3WomenGroup2AmountReceived = q3WomenGroup2AmountReceived;
        this.q3WomanGroup3Name = q3WomanGroup3Name;
        this.q3WomenGroup3Village = q3WomenGroup3Village;
        this.q3WomenGroup3MaleNumber = q3WomenGroup3MaleNumber;
        this.q3WomenGroup3FemaleNumber = q3WomenGroup3FemaleNumber;
        this.q3WomenGroup3AmountReceived = q3WomenGroup3AmountReceived;
        this.q3WomanGroup4Name = q3WomanGroup4Name;
        this.q3WomenGroup4Village = q3WomenGroup4Village;
        this.q3WomenGroup4MaleNumber = q3WomenGroup4MaleNumber;
        this.q3WomenGroup4FemaleNumber = q3WomenGroup4FemaleNumber;
        this.q3WomenGroup4AmountReceived = q3WomenGroup4AmountReceived;
        this.q3WomanGroup5Name = q3WomanGroup5Name;
        this.q3WomenGroup5Village = q3WomenGroup5Village;
        this.q3WomenGroup5MaleNumber = q3WomenGroup5MaleNumber;
        this.q3WomenGroup5FemaleNumber = q3WomenGroup5FemaleNumber;
        this.q3WomenGroup5AmountReceived = q3WomenGroup5AmountReceived;
        this.q3WomanGroup6Name = q3WomanGroup6Name;
        this.q3WomenGroup6Village = q3WomenGroup6Village;
        this.q3WomenGroup6MaleNumber = q3WomenGroup6MaleNumber;
        this.q3WomenGroup6FemaleNumber = q3WomenGroup6FemaleNumber;
        this.q3WomenGroup6AmountReceived = q3WomenGroup6AmountReceived;
        this.q3WomanGroup7Name = q3WomanGroup7Name;
        this.q3WomenGroup7Village = q3WomenGroup7Village;
        this.q3WomenGroup7MaleNumber = q3WomenGroup7MaleNumber;
        this.q3WomenGroup7FemaleNumber = q3WomenGroup7FemaleNumber;
        this.q3WomenGroup7AmountReceived = q3WomenGroup7AmountReceived;
        this.q4LivelihoodObjective = q4LivelihoodObjective;
        this.q4LivelihoodObjectiveReason = q4LivelihoodObjectiveReason;
        this.q4YouthGroup1Name = q4YouthGroup1Name;
        this.q4YouthGroup1Village = q4YouthGroup1Village;
        this.q4YouthGroup1MaleNumber = q4YouthGroup1MaleNumber;
        this.q4YouthGroup1FemaleNumber = q4YouthGroup1FemaleNumber;
        this.q4YouthGroup1AmountReceived = q4YouthGroup1AmountReceived;
        this.q4YouthGroup2Name = q4YouthGroup2Name;
        this.q4YouthGroup2Village = q4YouthGroup2Village;
        this.q4YouthGroup2MaleNumber = q4YouthGroup2MaleNumber;
        this.q4YouthGroup2FemaleNumber = q4YouthGroup2FemaleNumber;
        this.q4YouthGroup2AmountReceived = q4YouthGroup2AmountReceived;
        this.q4YouthGroup3Name = q4YouthGroup3Name;
        this.q4YouthGroup3Village = q4YouthGroup3Village;
        this.q4YouthGroup3MaleNumber = q4YouthGroup3MaleNumber;
        this.q4YouthGroup3FemaleNumber = q4YouthGroup3FemaleNumber;
        this.q4YouthGroup3AmountReceived = q4YouthGroup3AmountReceived;
        this.q4YouthGroup4Name = q4YouthGroup4Name;
        this.q4YouthGroup4Village = q4YouthGroup4Village;
        this.q4YouthGroup4MaleNumber = q4YouthGroup4MaleNumber;
        this.q4YouthGroup4FemaleNumber = q4YouthGroup4FemaleNumber;
        this.q4YouthGroup4AmountReceived = q4YouthGroup4AmountReceived;
        this.q4YouthGroup5Name = q4YouthGroup5Name;
        this.q4YouthGroup5Village = q4YouthGroup5Village;
        this.q4YouthGroup5MaleNumber = q4YouthGroup5MaleNumber;
        this.q4YouthGroup5FemaleNumber = q4YouthGroup5FemaleNumber;
        this.q4YouthGroup5AmountReceived = q4YouthGroup5AmountReceived;
        this.q4YouthGroup6Name = q4YouthGroup6Name;
        this.q4YouthGroup6Village = q4YouthGroup6Village;
        this.q4YouthGroup6MaleNumber = q4YouthGroup6MaleNumber;
        this.q4YouthGroup6FemaleNumber = q4YouthGroup6FemaleNumber;
        this.q4YouthGroup6AmountReceived = q4YouthGroup6AmountReceived;
        this.q4YouthGroup7Name = q4YouthGroup7Name;
        this.q4YouthGroup7Village = q4YouthGroup7Village;
        this.q4YouthGroup7MaleNumber = q4YouthGroup7MaleNumber;
        this.q4YouthGroup7FemaleNumber = q4YouthGroup7FemaleNumber;
        this.q4YouthGroup7AmountReceived = q4YouthGroup7AmountReceived;
        this.q5NumberMaleTrained = q5NumberMaleTrained;
        this.q5NumberFemaleTrained = q5NumberFemaleTrained;
        this.q6CommunityGroupFormed = q6CommunityGroupFormed;
        this.q7OtherChallengesObservations = q7OtherChallengesObservations;
        this.locallyStored = true;
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

    public String getYgbaAgentFullName() {
        return ygbaAgentFullName;
    }

    public void setYgbaAgentFullName(String ygbaAgentFullName) {
        this.ygbaAgentFullName = ygbaAgentFullName;
    }

    public String getYgbaTel() {
        return ygbaTel;
    }

    public void setYgbaTel(String ygbaTel) {
        this.ygbaTel = ygbaTel;
    }

    public double getQ2CommunityExpected() {
        return q2CommunityExpected;
    }

    public void setQ2CommunityExpected(double q2CommunityExpected) {
        this.q2CommunityExpected = q2CommunityExpected;
    }

    public double getQ2CommunityAmountReceived() {
        return q2CommunityAmountReceived;
    }

    public void setQ2CommunityAmountReceived(double q2CommunityAmountReceived) {
        this.q2CommunityAmountReceived = q2CommunityAmountReceived;
    }

    public String getQ2CommunityDateReceived() {
        return q2CommunityDateReceived;
    }

    public void setQ2CommunityDateReceived(String q2CommunityDateReceived) {
        this.q2CommunityDateReceived = q2CommunityDateReceived;
    }

    public String getQ2CommunityDateWithdrawn() {
        return q2CommunityDateWithdrawn;
    }

    public void setQ2CommunityDateWithdrawn(String q2CommunityDateWithdrawn) {
        this.q2CommunityDateWithdrawn = q2CommunityDateWithdrawn;
    }

    public double getQ2OtherExpectedAmount() {
        return q2OtherExpectedAmount;
    }

    public void setQ2OtherExpectedAmount(double q2OtherExpectedAmount) {
        this.q2OtherExpectedAmount = q2OtherExpectedAmount;
    }

    public double getQ2OtherAmountedReceived() {
        return q2OtherAmountedReceived;
    }

    public void setQ2OtherAmountedReceived(double q2OtherAmountedReceived) {
        this.q2OtherAmountedReceived = q2OtherAmountedReceived;
    }

    public String getQ2OthersDateReceived() {
        return q2OthersDateReceived;
    }

    public void setQ2OthersDateReceived(String q2OthersDateReceived) {
        this.q2OthersDateReceived = q2OthersDateReceived;
    }

    public String getQ2OthersDateWithdrawn() {
        return q2OthersDateWithdrawn;
    }

    public void setQ2OthersDateWithdrawn(String q2OthersDateWithdrawn) {
        this.q2OthersDateWithdrawn = q2OthersDateWithdrawn;
    }

    public boolean isQ3WomenEmpowermentObjective() {
        return q3WomenEmpowermentObjective;
    }

    public void setQ3WomenEmpowermentObjective(boolean q3WomenEmpowermentObjective) {
        this.q3WomenEmpowermentObjective = q3WomenEmpowermentObjective;
    }

    public String getQ3WomenEmpowermentObjectiveReason() {
        return q3WomenEmpowermentObjectiveReason;
    }

    public void setQ3WomenEmpowermentObjectiveReason(String q3WomenEmpowermentObjectiveReason) {
        this.q3WomenEmpowermentObjectiveReason = q3WomenEmpowermentObjectiveReason;
    }

    public String getQ3WomanGroup1Name() {
        return q3WomanGroup1Name;
    }

    public void setQ3WomanGroup1Name(String q3WomanGroup1Name) {
        this.q3WomanGroup1Name = q3WomanGroup1Name;
    }

    public String getQ3WomenGroup1Village() {
        return q3WomenGroup1Village;
    }

    public void setQ3WomenGroup1Village(String q3WomenGroup1Village) {
        this.q3WomenGroup1Village = q3WomenGroup1Village;
    }

    public int getQ3WomenGroup1MaleNumber() {
        return q3WomenGroup1MaleNumber;
    }

    public void setQ3WomenGroup1MaleNumber(int q3WomenGroup1MaleNumber) {
        this.q3WomenGroup1MaleNumber = q3WomenGroup1MaleNumber;
    }

    public int getQ3WomenGroup1FemaleNumber() {
        return q3WomenGroup1FemaleNumber;
    }

    public void setQ3WomenGroup1FemaleNumber(int q3WomenGroup1FemaleNumber) {
        this.q3WomenGroup1FemaleNumber = q3WomenGroup1FemaleNumber;
    }

    public double getQ3WomenGroup1AmountReceived() {
        return q3WomenGroup1AmountReceived;
    }

    public void setQ3WomenGroup1AmountReceived(double q3WomenGroup1AmountReceived) {
        this.q3WomenGroup1AmountReceived = q3WomenGroup1AmountReceived;
    }

    public String getQ3WomanGroup2Name() {
        return q3WomanGroup2Name;
    }

    public void setQ3WomanGroup2Name(String q3WomanGroup2Name) {
        this.q3WomanGroup2Name = q3WomanGroup2Name;
    }

    public String getQ3WomenGroup2Village() {
        return q3WomenGroup2Village;
    }

    public void setQ3WomenGroup2Village(String q3WomenGroup2Village) {
        this.q3WomenGroup2Village = q3WomenGroup2Village;
    }

    public int getQ3WomenGroup2MaleNumber() {
        return q3WomenGroup2MaleNumber;
    }

    public void setQ3WomenGroup2MaleNumber(int q3WomenGroup2MaleNumber) {
        this.q3WomenGroup2MaleNumber = q3WomenGroup2MaleNumber;
    }

    public int getQ3WomenGroup2FemaleNumber() {
        return q3WomenGroup2FemaleNumber;
    }

    public void setQ3WomenGroup2FemaleNumber(int q3WomenGroup2FemaleNumber) {
        this.q3WomenGroup2FemaleNumber = q3WomenGroup2FemaleNumber;
    }

    public double getQ3WomenGroup2AmountReceived() {
        return q3WomenGroup2AmountReceived;
    }

    public void setQ3WomenGroup2AmountReceived(double q3WomenGroup2AmountReceived) {
        this.q3WomenGroup2AmountReceived = q3WomenGroup2AmountReceived;
    }

    public String getQ3WomanGroup3Name() {
        return q3WomanGroup3Name;
    }

    public void setQ3WomanGroup3Name(String q3WomanGroup3Name) {
        this.q3WomanGroup3Name = q3WomanGroup3Name;
    }

    public String getQ3WomenGroup3Village() {
        return q3WomenGroup3Village;
    }

    public void setQ3WomenGroup3Village(String q3WomenGroup3Village) {
        this.q3WomenGroup3Village = q3WomenGroup3Village;
    }

    public int getQ3WomenGroup3MaleNumber() {
        return q3WomenGroup3MaleNumber;
    }

    public void setQ3WomenGroup3MaleNumber(int q3WomenGroup3MaleNumber) {
        this.q3WomenGroup3MaleNumber = q3WomenGroup3MaleNumber;
    }

    public int getQ3WomenGroup3FemaleNumber() {
        return q3WomenGroup3FemaleNumber;
    }

    public void setQ3WomenGroup3FemaleNumber(int q3WomenGroup3FemaleNumber) {
        this.q3WomenGroup3FemaleNumber = q3WomenGroup3FemaleNumber;
    }

    public double getQ3WomenGroup3AmountReceived() {
        return q3WomenGroup3AmountReceived;
    }

    public void setQ3WomenGroup3AmountReceived(double q3WomenGroup3AmountReceived) {
        this.q3WomenGroup3AmountReceived = q3WomenGroup3AmountReceived;
    }

    public String getQ3WomanGroup4Name() {
        return q3WomanGroup4Name;
    }

    public void setQ3WomanGroup4Name(String q3WomanGroup4Name) {
        this.q3WomanGroup4Name = q3WomanGroup4Name;
    }

    public String getQ3WomenGroup4Village() {
        return q3WomenGroup4Village;
    }

    public void setQ3WomenGroup4Village(String q3WomenGroup4Village) {
        this.q3WomenGroup4Village = q3WomenGroup4Village;
    }

    public int getQ3WomenGroup4MaleNumber() {
        return q3WomenGroup4MaleNumber;
    }

    public void setQ3WomenGroup4MaleNumber(int q3WomenGroup4MaleNumber) {
        this.q3WomenGroup4MaleNumber = q3WomenGroup4MaleNumber;
    }

    public int getQ3WomenGroup4FemaleNumber() {
        return q3WomenGroup4FemaleNumber;
    }

    public void setQ3WomenGroup4FemaleNumber(int q3WomenGroup4FemaleNumber) {
        this.q3WomenGroup4FemaleNumber = q3WomenGroup4FemaleNumber;
    }

    public double getQ3WomenGroup4AmountReceived() {
        return q3WomenGroup4AmountReceived;
    }

    public void setQ3WomenGroup4AmountReceived(double q3WomenGroup4AmountReceived) {
        this.q3WomenGroup4AmountReceived = q3WomenGroup4AmountReceived;
    }

    public String getQ3WomanGroup5Name() {
        return q3WomanGroup5Name;
    }

    public void setQ3WomanGroup5Name(String q3WomanGroup5Name) {
        this.q3WomanGroup5Name = q3WomanGroup5Name;
    }

    public String getQ3WomenGroup5Village() {
        return q3WomenGroup5Village;
    }

    public void setQ3WomenGroup5Village(String q3WomenGroup5Village) {
        this.q3WomenGroup5Village = q3WomenGroup5Village;
    }

    public int getQ3WomenGroup5MaleNumber() {
        return q3WomenGroup5MaleNumber;
    }

    public void setQ3WomenGroup5MaleNumber(int q3WomenGroup5MaleNumber) {
        this.q3WomenGroup5MaleNumber = q3WomenGroup5MaleNumber;
    }

    public int getQ3WomenGroup5FemaleNumber() {
        return q3WomenGroup5FemaleNumber;
    }

    public void setQ3WomenGroup5FemaleNumber(int q3WomenGroup5FemaleNumber) {
        this.q3WomenGroup5FemaleNumber = q3WomenGroup5FemaleNumber;
    }

    public double getQ3WomenGroup5AmountReceived() {
        return q3WomenGroup5AmountReceived;
    }

    public void setQ3WomenGroup5AmountReceived(double q3WomenGroup5AmountReceived) {
        this.q3WomenGroup5AmountReceived = q3WomenGroup5AmountReceived;
    }

    public String getQ3WomanGroup6Name() {
        return q3WomanGroup6Name;
    }

    public void setQ3WomanGroup6Name(String q3WomanGroup6Name) {
        this.q3WomanGroup6Name = q3WomanGroup6Name;
    }

    public String getQ3WomenGroup6Village() {
        return q3WomenGroup6Village;
    }

    public void setQ3WomenGroup6Village(String q3WomenGroup6Village) {
        this.q3WomenGroup6Village = q3WomenGroup6Village;
    }

    public int getQ3WomenGroup6MaleNumber() {
        return q3WomenGroup6MaleNumber;
    }

    public void setQ3WomenGroup6MaleNumber(int q3WomenGroup6MaleNumber) {
        this.q3WomenGroup6MaleNumber = q3WomenGroup6MaleNumber;
    }

    public int getQ3WomenGroup6FemaleNumber() {
        return q3WomenGroup6FemaleNumber;
    }

    public void setQ3WomenGroup6FemaleNumber(int q3WomenGroup6FemaleNumber) {
        this.q3WomenGroup6FemaleNumber = q3WomenGroup6FemaleNumber;
    }

    public double getQ3WomenGroup6AmountReceived() {
        return q3WomenGroup6AmountReceived;
    }

    public void setQ3WomenGroup6AmountReceived(double q3WomenGroup6AmountReceived) {
        this.q3WomenGroup6AmountReceived = q3WomenGroup6AmountReceived;
    }

    public String getQ3WomanGroup7Name() {
        return q3WomanGroup7Name;
    }

    public void setQ3WomanGroup7Name(String q3WomanGroup7Name) {
        this.q3WomanGroup7Name = q3WomanGroup7Name;
    }

    public String getQ3WomenGroup7Village() {
        return q3WomenGroup7Village;
    }

    public void setQ3WomenGroup7Village(String q3WomenGroup7Village) {
        this.q3WomenGroup7Village = q3WomenGroup7Village;
    }

    public int getQ3WomenGroup7MaleNumber() {
        return q3WomenGroup7MaleNumber;
    }

    public void setQ3WomenGroup7MaleNumber(int q3WomenGroup7MaleNumber) {
        this.q3WomenGroup7MaleNumber = q3WomenGroup7MaleNumber;
    }

    public int getQ3WomenGroup7FemaleNumber() {
        return q3WomenGroup7FemaleNumber;
    }

    public void setQ3WomenGroup7FemaleNumber(int q3WomenGroup7FemaleNumber) {
        this.q3WomenGroup7FemaleNumber = q3WomenGroup7FemaleNumber;
    }

    public double getQ3WomenGroup7AmountReceived() {
        return q3WomenGroup7AmountReceived;
    }

    public void setQ3WomenGroup7AmountReceived(double q3WomenGroup7AmountReceived) {
        this.q3WomenGroup7AmountReceived = q3WomenGroup7AmountReceived;
    }

    public boolean isQ4LivelihoodObjective() {
        return q4LivelihoodObjective;
    }

    public void setQ4LivelihoodObjective(boolean q4LivelihoodObjective) {
        this.q4LivelihoodObjective = q4LivelihoodObjective;
    }

    public String getQ4LivelihoodObjectiveReason() {
        return q4LivelihoodObjectiveReason;
    }

    public void setQ4LivelihoodObjectiveReason(String q4LivelihoodObjectiveReason) {
        this.q4LivelihoodObjectiveReason = q4LivelihoodObjectiveReason;
    }

    public String getQ4YouthGroup1Name() {
        return q4YouthGroup1Name;
    }

    public void setQ4YouthGroup1Name(String q4YouthGroup1Name) {
        this.q4YouthGroup1Name = q4YouthGroup1Name;
    }

    public String getQ4YouthGroup1Village() {
        return q4YouthGroup1Village;
    }

    public void setQ4YouthGroup1Village(String q4YouthGroup1Village) {
        this.q4YouthGroup1Village = q4YouthGroup1Village;
    }

    public int getQ4YouthGroup1MaleNumber() {
        return q4YouthGroup1MaleNumber;
    }

    public void setQ4YouthGroup1MaleNumber(int q4YouthGroup1MaleNumber) {
        this.q4YouthGroup1MaleNumber = q4YouthGroup1MaleNumber;
    }

    public int getQ4YouthGroup1FemaleNumber() {
        return q4YouthGroup1FemaleNumber;
    }

    public void setQ4YouthGroup1FemaleNumber(int q4YouthGroup1FemaleNumber) {
        this.q4YouthGroup1FemaleNumber = q4YouthGroup1FemaleNumber;
    }

    public double getQ4YouthGroup1AmountReceived() {
        return q4YouthGroup1AmountReceived;
    }

    public void setQ4YouthGroup1AmountReceived(double q4YouthGroup1AmountReceived) {
        this.q4YouthGroup1AmountReceived = q4YouthGroup1AmountReceived;
    }

    public String getQ4YouthGroup2Name() {
        return q4YouthGroup2Name;
    }

    public void setQ4YouthGroup2Name(String q4YouthGroup2Name) {
        this.q4YouthGroup2Name = q4YouthGroup2Name;
    }

    public String getQ4YouthGroup2Village() {
        return q4YouthGroup2Village;
    }

    public void setQ4YouthGroup2Village(String q4YouthGroup2Village) {
        this.q4YouthGroup2Village = q4YouthGroup2Village;
    }

    public int getQ4YouthGroup2MaleNumber() {
        return q4YouthGroup2MaleNumber;
    }

    public void setQ4YouthGroup2MaleNumber(int q4YouthGroup2MaleNumber) {
        this.q4YouthGroup2MaleNumber = q4YouthGroup2MaleNumber;
    }

    public int getQ4YouthGroup2FemaleNumber() {
        return q4YouthGroup2FemaleNumber;
    }

    public void setQ4YouthGroup2FemaleNumber(int q4YouthGroup2FemaleNumber) {
        this.q4YouthGroup2FemaleNumber = q4YouthGroup2FemaleNumber;
    }

    public double getQ4YouthGroup2AmountReceived() {
        return q4YouthGroup2AmountReceived;
    }

    public void setQ4YouthGroup2AmountReceived(double q4YouthGroup2AmountReceived) {
        this.q4YouthGroup2AmountReceived = q4YouthGroup2AmountReceived;
    }

    public String getQ4YouthGroup3Name() {
        return q4YouthGroup3Name;
    }

    public void setQ4YouthGroup3Name(String q4YouthGroup3Name) {
        this.q4YouthGroup3Name = q4YouthGroup3Name;
    }

    public String getQ4YouthGroup3Village() {
        return q4YouthGroup3Village;
    }

    public void setQ4YouthGroup3Village(String q4YouthGroup3Village) {
        this.q4YouthGroup3Village = q4YouthGroup3Village;
    }

    public int getQ4YouthGroup3MaleNumber() {
        return q4YouthGroup3MaleNumber;
    }

    public void setQ4YouthGroup3MaleNumber(int q4YouthGroup3MaleNumber) {
        this.q4YouthGroup3MaleNumber = q4YouthGroup3MaleNumber;
    }

    public int getQ4YouthGroup3FemaleNumber() {
        return q4YouthGroup3FemaleNumber;
    }

    public void setQ4YouthGroup3FemaleNumber(int q4YouthGroup3FemaleNumber) {
        this.q4YouthGroup3FemaleNumber = q4YouthGroup3FemaleNumber;
    }

    public double getQ4YouthGroup3AmountReceived() {
        return q4YouthGroup3AmountReceived;
    }

    public void setQ4YouthGroup3AmountReceived(double q4YouthGroup3AmountReceived) {
        this.q4YouthGroup3AmountReceived = q4YouthGroup3AmountReceived;
    }

    public String getQ4YouthGroup4Name() {
        return q4YouthGroup4Name;
    }

    public void setQ4YouthGroup4Name(String q4YouthGroup4Name) {
        this.q4YouthGroup4Name = q4YouthGroup4Name;
    }

    public String getQ4YouthGroup4Village() {
        return q4YouthGroup4Village;
    }

    public void setQ4YouthGroup4Village(String q4YouthGroup4Village) {
        this.q4YouthGroup4Village = q4YouthGroup4Village;
    }

    public int getQ4YouthGroup4MaleNumber() {
        return q4YouthGroup4MaleNumber;
    }

    public void setQ4YouthGroup4MaleNumber(int q4YouthGroup4MaleNumber) {
        this.q4YouthGroup4MaleNumber = q4YouthGroup4MaleNumber;
    }

    public int getQ4YouthGroup4FemaleNumber() {
        return q4YouthGroup4FemaleNumber;
    }

    public void setQ4YouthGroup4FemaleNumber(int q4YouthGroup4FemaleNumber) {
        this.q4YouthGroup4FemaleNumber = q4YouthGroup4FemaleNumber;
    }

    public double getQ4YouthGroup4AmountReceived() {
        return q4YouthGroup4AmountReceived;
    }

    public void setQ4YouthGroup4AmountReceived(double q4YouthGroup4AmountReceived) {
        this.q4YouthGroup4AmountReceived = q4YouthGroup4AmountReceived;
    }

    public String getQ4YouthGroup5Name() {
        return q4YouthGroup5Name;
    }

    public void setQ4YouthGroup5Name(String q4YouthGroup5Name) {
        this.q4YouthGroup5Name = q4YouthGroup5Name;
    }

    public String getQ4YouthGroup5Village() {
        return q4YouthGroup5Village;
    }

    public void setQ4YouthGroup5Village(String q4YouthGroup5Village) {
        this.q4YouthGroup5Village = q4YouthGroup5Village;
    }

    public int getQ4YouthGroup5MaleNumber() {
        return q4YouthGroup5MaleNumber;
    }

    public void setQ4YouthGroup5MaleNumber(int q4YouthGroup5MaleNumber) {
        this.q4YouthGroup5MaleNumber = q4YouthGroup5MaleNumber;
    }

    public int getQ4YouthGroup5FemaleNumber() {
        return q4YouthGroup5FemaleNumber;
    }

    public void setQ4YouthGroup5FemaleNumber(int q4YouthGroup5FemaleNumber) {
        this.q4YouthGroup5FemaleNumber = q4YouthGroup5FemaleNumber;
    }

    public double getQ4YouthGroup5AmountReceived() {
        return q4YouthGroup5AmountReceived;
    }

    public void setQ4YouthGroup5AmountReceived(double q4YouthGroup5AmountReceived) {
        this.q4YouthGroup5AmountReceived = q4YouthGroup5AmountReceived;
    }

    public String getQ4YouthGroup6Name() {
        return q4YouthGroup6Name;
    }

    public void setQ4YouthGroup6Name(String q4YouthGroup6Name) {
        this.q4YouthGroup6Name = q4YouthGroup6Name;
    }

    public String getQ4YouthGroup6Village() {
        return q4YouthGroup6Village;
    }

    public void setQ4YouthGroup6Village(String q4YouthGroup6Village) {
        this.q4YouthGroup6Village = q4YouthGroup6Village;
    }

    public int getQ4YouthGroup6MaleNumber() {
        return q4YouthGroup6MaleNumber;
    }

    public void setQ4YouthGroup6MaleNumber(int q4YouthGroup6MaleNumber) {
        this.q4YouthGroup6MaleNumber = q4YouthGroup6MaleNumber;
    }

    public int getQ4YouthGroup6FemaleNumber() {
        return q4YouthGroup6FemaleNumber;
    }

    public void setQ4YouthGroup6FemaleNumber(int q4YouthGroup6FemaleNumber) {
        this.q4YouthGroup6FemaleNumber = q4YouthGroup6FemaleNumber;
    }

    public double getQ4YouthGroup6AmountReceived() {
        return q4YouthGroup6AmountReceived;
    }

    public void setQ4YouthGroup6AmountReceived(double q4YouthGroup6AmountReceived) {
        this.q4YouthGroup6AmountReceived = q4YouthGroup6AmountReceived;
    }

    public String getQ4YouthGroup7Name() {
        return q4YouthGroup7Name;
    }

    public void setQ4YouthGroup7Name(String q4YouthGroup7Name) {
        this.q4YouthGroup7Name = q4YouthGroup7Name;
    }

    public String getQ4YouthGroup7Village() {
        return q4YouthGroup7Village;
    }

    public void setQ4YouthGroup7Village(String q4YouthGroup7Village) {
        this.q4YouthGroup7Village = q4YouthGroup7Village;
    }

    public int getQ4YouthGroup7MaleNumber() {
        return q4YouthGroup7MaleNumber;
    }

    public void setQ4YouthGroup7MaleNumber(int q4YouthGroup7MaleNumber) {
        this.q4YouthGroup7MaleNumber = q4YouthGroup7MaleNumber;
    }

    public int getQ4YouthGroup7FemaleNumber() {
        return q4YouthGroup7FemaleNumber;
    }

    public void setQ4YouthGroup7FemaleNumber(int q4YouthGroup7FemaleNumber) {
        this.q4YouthGroup7FemaleNumber = q4YouthGroup7FemaleNumber;
    }

    public double getQ4YouthGroup7AmountReceived() {
        return q4YouthGroup7AmountReceived;
    }

    public void setQ4YouthGroup7AmountReceived(double q4YouthGroup7AmountReceived) {
        this.q4YouthGroup7AmountReceived = q4YouthGroup7AmountReceived;
    }

    public int getQ5NumberMaleTrained() {
        return q5NumberMaleTrained;
    }

    public void setQ5NumberMaleTrained(int q5NumberMaleTrained) {
        this.q5NumberMaleTrained = q5NumberMaleTrained;
    }

    public int getQ5NumberFemaleTrained() {
        return q5NumberFemaleTrained;
    }

    public void setQ5NumberFemaleTrained(int q5NumberFemaleTrained) {
        this.q5NumberFemaleTrained = q5NumberFemaleTrained;
    }

    public String getQ6CommunityGroupFormed() {
        return q6CommunityGroupFormed;
    }

    public void setQ6CommunityGroupFormed(String q6CommunityGroupFormed) {
        this.q6CommunityGroupFormed = q6CommunityGroupFormed;
    }

    public String getQ7OtherChallengesObservations() {
        return q7OtherChallengesObservations;
    }

    public void setQ7OtherChallengesObservations(String q7OtherChallengesObservations) {
        this.q7OtherChallengesObservations = q7OtherChallengesObservations;
    }

    public boolean isLocallyStored() {
        return locallyStored;
    }

    public void setLocallyStored(boolean locallyStored) {
        this.locallyStored = locallyStored;
    }

    @Ignore
    public SocialDevelopmentQuestion() {

    }
}
