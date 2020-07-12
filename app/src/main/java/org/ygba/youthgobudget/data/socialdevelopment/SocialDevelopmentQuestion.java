package org.ygba.youthgobudget.data.socialdevelopment;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
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
    private String q2CommunityExpected;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_AMOUNT_RECEIVED)
    private String q2CommunityAmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_DATE_RECEIVED)
    private String q2CommunityDateReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_COMMUNITY_DATE_WITHDRAWN)
    private String q2CommunityDateWithdrawn;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHER_AMOUNT_EXPECTED)
    private String q2OtherExpectedAmount;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHER_AMOUNT_RECEIVED)
    private String q2OtherAmountedReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHERS_DATE_RECEIVED)
    private String q2OthersDateReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q2_OTHERS_DAE_WITHDRAWN)
    private String q2OthersDateWithdrawn;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_EMPOWERMENT_OBJECTIVE)
    private String q3WomenEmpowermentObjective;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_EMPOWERMENT_OBJECTIVE_REASON)
    private String q3WomenEmpowermentObjectiveReason;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_NAME)
    private String q3WomanGroup1Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_VILLAGE)
    private String q3WomenGroup1Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_MALE_NUMBER)
    private String q3WomenGroup1MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_FEMALE_NUMBER)
    private String q3WomenGroup1FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_1_AMOUNT_RECEIVED)
    private String q3WomenGroup1AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_NAME)
    private String q3WomanGroup2Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_VILLAGE)
    private String q3WomenGroup2Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_MALE_NUMBER)
    private String q3WomenGroup2MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_FEMALE_NUMBER)
    private String q3WomenGroup2FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_2_AMOUNT_RECEIVED)
    private String q3WomenGroup2AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_NAME)
    private String q3WomanGroup3Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_VILLAGE)
    private String q3WomenGroup3Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_MALE_NUMBER)
    private String q3WomenGroup3MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_FEMALE_NUMBER)
    private String q3WomenGroup3FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_3_AMOUNT_RECEIVED)
    private String q3WomenGroup3AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_NAME)
    private String q3WomanGroup4Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_VILLAGE)
    private String q3WomenGroup4Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_MALE_NUMBER)
    private String q3WomenGroup4MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_FEMALE_NUMBER)
    private String q3WomenGroup4FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_4_AMOUNT_RECEIVED)
    private String q3WomenGroup4AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_NAME)
    private String q3WomanGroup5Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_VILLAGE)
    private String q3WomenGroup5Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_MALE_NUMBER)
    private String q3WomenGroup5MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_FEMALE_NUMBER)
    private String q3WomenGroup5FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_5_AMOUNT_RECEIVED)
    private String q3WomenGroup5AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_NAME)
    private String q3WomanGroup6Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_VILLAGE)
    private String q3WomenGroup6Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_MALE_NUMBER)
    private String q3WomenGroup6MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_FEMALE_NUMBER)
    private String q3WomenGroup6FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_6_AMOUNT_RECEIVED)
    private String q3WomenGroup6AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_NAME)
    private String q3WomanGroup7Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_VILLAGE)
    private String q3WomenGroup7Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_MALE_NUMBER)
    private String q3WomenGroup7MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_FEMALE_NUMBER)
    private String q3WomenGroup7FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q3_WOMEN_GROUP_7_AMOUNT_RECEIVED)
    private String q3WomenGroup7AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_LIVELIHOOD_OBJECTIVE)
    private String q4LivelihoodObjective;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_LIVELIHOOD_OBJECTIVE_REASON)
    private String q4LivelihoodObjectiveReason;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_NAME)
    private String q4YouthGroup1Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_VILLAGE)
    private String q4YouthGroup1Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_MALE_NUMBER)
    private String q4YouthGroup1MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_FEMALE_NUMBER)
    private String q4YouthGroup1FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_1_AMOUNT_RECEIVED)
    private String q4YouthGroup1AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_NAME)
    private String q4YouthGroup2Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_VILLAGE)
    private String q4YouthGroup2Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_MALE_NUMBER)
    private String q4YouthGroup2MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_FEMALE_NUMBER)
    private String q4YouthGroup2FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_2_AMOUNT_RECEIVED)
    private String q4YouthGroup2AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_NAME)
    private String q4YouthGroup3Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_VILLAGE)
    private String q4YouthGroup3Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_MALE_NUMBER)
    private String q4YouthGroup3MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_FEMALE_NUMBER)
    private String q4YouthGroup3FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_3_AMOUNT_RECEIVED)
    private String q4YouthGroup3AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_NAME)
    private String q4YouthGroup4Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_VILLAGE)
    private String q4YouthGroup4Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_MALE_NUMBER)
    private String q4YouthGroup4MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_FEMALE_NUMBER)
    private String q4YouthGroup4FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_4_AMOUNT_RECEIVED)
    private String q4YouthGroup4AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_NAME)
    private String q4YouthGroup5Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_VILLAGE)
    private String q4YouthGroup5Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_MALE_NUMBER)
    private String q4YouthGroup5MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_FEMALE_NUMBER)
    private String q4YouthGroup5FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_5_AMOUNT_RECEIVED)
    private String q4YouthGroup5AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_NAME)
    private String q4YouthGroup6Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_VILLAGE)
    private String q4YouthGroup6Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_MALE_NUMBER)
    private String q4YouthGroup6MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_FEMALE_NUMBER)
    private String q4YouthGroup6FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_6_AMOUNT_RECEIVED)
    private String q4YouthGroup6AmountReceived;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_NAME)
    private String q4YouthGroup7Name;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_VILLAGE)
    private String q4YouthGroup7Village;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_MALE_NUMBER)
    private String q4YouthGroup7MaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_FEMALE_NUMBER)
    private String q4YouthGroup7FemaleNumber;

    @ColumnInfo(name = SocialDevelopmentConstants.Q4_YOUTH_GROUP_7_AMOUNT_RECEIVED)
    private String q4YouthGroup7AmountReceived;
}
