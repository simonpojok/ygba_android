package org.ygba.youthgobudget.data.water_and_environment;

import android.widget.EditText;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = WaterEnvironmentConstants.TABLE_NAME)
public class WaterEnvironmentQuestion {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = WaterEnvironmentConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = WaterEnvironmentConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = WaterEnvironmentConstants.DATE)
    private String date;

    @ColumnInfo(name = WaterEnvironmentConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = WaterEnvironmentConstants.VILLAGE)
    private String village;

    @ColumnInfo(name = WaterEnvironmentConstants.PARISH)
    private String parish;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY)
    private String sub_county;

    @ColumnInfo(name = WaterEnvironmentConstants.YGB_AGENT)
    private String agentName;

    @ColumnInfo(name = WaterEnvironmentConstants.AGENT_TEL)
    private String agentTel;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_1_OBJECTIVE_ANSWER)
    private boolean question1Objective;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_1_OBJECTIVE_REASON)
    private String question1ObjectiveReason;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_2_SANITATION)
    private String question2Water;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_4)
    private String question4Answer;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_3_OBJECTIVE)
    private boolean question3Objective;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_LONG_TEXT)
    private String question5Text;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_1)
    private String subCounty1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_1)
    private String waterSource1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_1)
    private int question5Functional1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_1)
    private int question5NoneFunctional1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_1)
    private int question5WaterSourceAvailable1;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_2)
    private String subCounty2;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_2)
    private String waterSource2;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_2)
    private int question5Functional2;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_2)
    private int question5NoneFunctional2;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_2)
    private int question5WaterSourceAvailable2;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_3)
    private String subCounty3;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_3)
    private String waterSource3;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_3)
    private int question5Functional3;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_3)
    private int question5NoneFunctional3;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_3)
    private int question5WaterSourceAvailable3;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_4)
    private String subCounty4;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_4)
    private String waterSource4;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_4)
    private int question5Functional4;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_4)
    private int question5NoneFunctional4;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_4)
    private int question5WaterSourceAvailable4;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_5)
    private String subCounty5;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_5)
    private String waterSource5;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_5)
    private int question5Functional5;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_5)
    private int question5NoneFunctional5;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_5)
    private int question5WaterSourceAvailable5;

    @ColumnInfo(name = WaterEnvironmentConstants.SUB_COUNTY_6)
    private String subCounty6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_WATER_SOURCE_6)
    private String waterSource6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_FUNCTIONAL_6)
    private int question5Functional6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NONE_FUNCTIONAL_6)
    private int question5NoneFunctional6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_NO_WATER_SOURCE_AVAILABLE_6)
    private int question5WaterSourceAvailable6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_5_OBJECTIVE)
    private boolean question5Objective;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_OBJECTIVE_REASON)
    private String question5ObjectiveReason;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_WETLAND_DEMARCATED)
    private String question6WetLandDemarcated;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_VILLAGE_1)
    private String question6VillageName1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_1_WETLAND_UNDER_DESTRUCTION_1)
    private int question61WetlandUnderDestruction1;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_VILLAGE_2)
    private String question6VillageName2;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_1_WETLAND_UNDER_DESTRUCTION_2)
    private int question61WetlandUnderDestruction2;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_VILLAGE_3)
    private String question6VillageName3;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_1_WETLAND_UNDER_DESTRUCTION_3)
    private int question61WetlandUnderDestruction3;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_VILLAGE_4)
    private String question6VillageName4;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_1_WETLAND_UNDER_DESTRUCTION_4)
    private int question61WetlandUnderDestruction4;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_VILLAGE_5)
    private String question6VillageName5;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_1_WETLAND_UNDER_DESTRUCTION_5)
    private int question61WetlandUnderDestruction5;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_VILLAGE_6)
    private String question6VillageName6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_1_WETLAND_UNDER_DESTRUCTION_6)
    private int question61WetlandUnderDestruction6;

    @ColumnInfo(name = WaterEnvironmentConstants.QUESTION_6_2_TREE_PLANTING_PROJECT)
    private String question62TreePlanting;

    @ColumnInfo(name = WaterEnvironmentConstants.LOCALLY_STORED)
    private boolean locallyStored;

    public String getQuestion6WetLandDemarcated() {
        return question6WetLandDemarcated;
    }

    public void setQuestion6WetLandDemarcated(String question6WetLandDemarcated) {
        this.question6WetLandDemarcated = question6WetLandDemarcated;
    }

    public WaterEnvironmentQuestion(String financialYear, String date, String district, String village, String parish, String sub_county, String agentName, String agentTel, boolean question1Objective, String question1ObjectiveReason, String question2Water, String question4Answer, boolean question3Objective, String question5Text, String subCounty1, String waterSource1, int question5Functional1, int question5NoneFunctional1, int question5WaterSourceAvailable1, String subCounty2, String waterSource2, int question5Functional2, int question5NoneFunctional2, int question5WaterSourceAvailable2, String subCounty3, String waterSource3, int question5Functional3, int question5NoneFunctional3, int question5WaterSourceAvailable3, String subCounty4, String waterSource4, int question5Functional4, int question5NoneFunctional4, int question5WaterSourceAvailable4, String subCounty5, String waterSource5, int question5Functional5, int question5NoneFunctional5, int question5WaterSourceAvailable5, String subCounty6, String waterSource6, int question5Functional6, int question5NoneFunctional6, int question5WaterSourceAvailable6, boolean question5Objective, String question5ObjectiveReason, String question6WetLandDemarcated, String question6VillageName1, int question61WetlandUnderDestruction1, String question6VillageName2, int question61WetlandUnderDestruction2, String question6VillageName3, int question61WetlandUnderDestruction3, String question6VillageName4, int question61WetlandUnderDestruction4, String question6VillageName5, int question61WetlandUnderDestruction5, String question6VillageName6, int question61WetlandUnderDestruction6, String question62TreePlanting) {
        this.financialYear = financialYear;
        this.date = date;
        this.district = district;
        this.village = village;
        this.parish = parish;
        this.sub_county = sub_county;
        this.agentName = agentName;
        this.agentTel = agentTel;
        this.question1Objective = question1Objective;
        this.question1ObjectiveReason = question1ObjectiveReason;
        this.question2Water = question2Water;
        this.question4Answer = question4Answer;
        this.question3Objective = question3Objective;
        this.question5Text = question5Text;
        this.subCounty1 = subCounty1;
        this.waterSource1 = waterSource1;
        this.question5Functional1 = question5Functional1;
        this.question5NoneFunctional1 = question5NoneFunctional1;
        this.question5WaterSourceAvailable1 = question5WaterSourceAvailable1;
        this.subCounty2 = subCounty2;
        this.waterSource2 = waterSource2;
        this.question5Functional2 = question5Functional2;
        this.question5NoneFunctional2 = question5NoneFunctional2;
        this.question5WaterSourceAvailable2 = question5WaterSourceAvailable2;
        this.subCounty3 = subCounty3;
        this.waterSource3 = waterSource3;
        this.question5Functional3 = question5Functional3;
        this.question5NoneFunctional3 = question5NoneFunctional3;
        this.question5WaterSourceAvailable3 = question5WaterSourceAvailable3;
        this.subCounty4 = subCounty4;
        this.waterSource4 = waterSource4;
        this.question5Functional4 = question5Functional4;
        this.question5NoneFunctional4 = question5NoneFunctional4;
        this.question5WaterSourceAvailable4 = question5WaterSourceAvailable4;
        this.subCounty5 = subCounty5;
        this.waterSource5 = waterSource5;
        this.question5Functional5 = question5Functional5;
        this.question5NoneFunctional5 = question5NoneFunctional5;
        this.question5WaterSourceAvailable5 = question5WaterSourceAvailable5;
        this.subCounty6 = subCounty6;
        this.waterSource6 = waterSource6;
        this.question5Functional6 = question5Functional6;
        this.question5NoneFunctional6 = question5NoneFunctional6;
        this.question5WaterSourceAvailable6 = question5WaterSourceAvailable6;
        this.question5Objective = question5Objective;
        this.question5ObjectiveReason = question5ObjectiveReason;
        this.question6WetLandDemarcated = question6WetLandDemarcated;
        this.question6VillageName1 = question6VillageName1;
        this.question61WetlandUnderDestruction1 = question61WetlandUnderDestruction1;
        this.question6VillageName2 = question6VillageName2;
        this.question61WetlandUnderDestruction2 = question61WetlandUnderDestruction2;
        this.question6VillageName3 = question6VillageName3;
        this.question61WetlandUnderDestruction3 = question61WetlandUnderDestruction3;
        this.question6VillageName4 = question6VillageName4;
        this.question61WetlandUnderDestruction4 = question61WetlandUnderDestruction4;
        this.question6VillageName5 = question6VillageName5;
        this.question61WetlandUnderDestruction5 = question61WetlandUnderDestruction5;
        this.question6VillageName6 = question6VillageName6;
        this.question61WetlandUnderDestruction6 = question61WetlandUnderDestruction6;
        this.question62TreePlanting = question62TreePlanting;
        this.locallyStored = true;
    }

    public static class  Builder  {
        private final WaterEnvironmentQuestion INSTANCE;
        public Builder() {
            INSTANCE = new WaterEnvironmentQuestion();
        }

        public WaterEnvironmentQuestion.Builder setFinancialYear(String financialYear) {
            INSTANCE.financialYear = financialYear;
            return this;
        }

        public WaterEnvironmentQuestion build() {
            return INSTANCE;
        }

        public Builder setDate(String date) {
            INSTANCE.setDate(date);
            return this;
        }

        public Builder setDistrict(String stringValue) {
            INSTANCE.setDistrict(stringValue);
            return this;
        }

        public Builder setVillage(String stringValue) {
            INSTANCE.setVillage(stringValue);
            return this;
        }

        public Builder setParish(String stringValue) {
            INSTANCE.setParish(stringValue);
            return this;
        }

        public Builder setDivision(String stringValue) {
            INSTANCE.setSub_county(stringValue);
            return this;
        }

        public Builder setAgentFullName(String wAgentFullName) {
            INSTANCE.setAgentName(wAgentFullName);
            return this;
        }

        public Builder setAgentTel(String stringValue) {
            INSTANCE.setAgentTel(stringValue);
            return this;
        }

        public Builder setQuestion1Objective(boolean questionQ1ObjectiveAnswer) {
            INSTANCE.setQuestion1Objective(questionQ1ObjectiveAnswer);
            return this;
        }

        public Builder setQuestion1Reason(String stringValue) {
            INSTANCE.setQuestion1ObjectiveReason(stringValue);
            return this;
        }

        public Builder setQuestion2LongAnswer(String stringValue) {
            INSTANCE.setQuestion2Water(stringValue);
            return this;
        }

        public Builder setQuestion3ObjectiveAnswer(boolean questionQ3ObjectiveAnswer) {
            INSTANCE.setQuestion3Objective(questionQ3ObjectiveAnswer);
            return this;
        }

        public Builder setQuestion4LongAnswer(String question4answer) {
            INSTANCE.setQuestion4Answer(question4answer);
            return this;
        }

        public Builder setQuestion5LongText(String some_text) {
            return this;
        }

        public Builder setQuestion5Area1(String stringValue) {
            INSTANCE.setSubCounty1(stringValue);
            return this;
        }

        public Builder setQuestion5WaterSource1(String stringValue) {
            INSTANCE.setWaterSource1(stringValue);
            return this;
        }

        public Builder setQuestion5Functional1(int integerValue) {
            INSTANCE.setQuestion5Functional1(integerValue);
            return this;
        }

        public Builder setNonFunctional1(int integerValue) {
            INSTANCE.setQuestion5NoneFunctional1(integerValue);
            return this;
        }

        public Builder setQuestion5Area2(String stringValue) {
            INSTANCE.setSubCounty2(stringValue);
            return this;
        }

        public Builder setQuestion5WaterSource2(String stringValue) {
            INSTANCE.setWaterSource2(stringValue);
            return this;
        }

        public Builder setQuestion5Functional2(int integerValue) {
            INSTANCE.setQuestion5Functional2(integerValue);
            return this;
        }

        public Builder setNonFunctional2(int integerValue) {
            INSTANCE.setQuestion5NoneFunctional2(integerValue);
            return this;
        }

        public Builder setQuestion5Area3(String stringValue) {
            INSTANCE.setSubCounty3(stringValue);
            return this;
        }

        public Builder setQuestion5WaterSource3(String stringValue) {
            INSTANCE.setWaterSource3(stringValue);
            return this;
        }

        public Builder setQuestion5Functional3(int integerValue) {
            INSTANCE.setQuestion5Functional3(integerValue);
            return this;
        }

        public Builder setNonFunctional3(int integerValue) {
            INSTANCE.setQuestion5NoneFunctional3(integerValue);
            return this;
        }

        public Builder setQuestion5Area4(String stringValue) {
            INSTANCE.setSubCounty4(stringValue);
            return this;
        }

        public Builder setQuestion5WaterSource4(String stringValue) {
            INSTANCE.setWaterSource4(stringValue);
            return this;
        }

        public Builder setQuestion5Functional4(int integerValue) {
            INSTANCE.setQuestion5Functional4(integerValue);
            return this;
        }

        public Builder setNonFunctional4(int integerValue) {
            INSTANCE.setQuestion5NoneFunctional4(integerValue);
            return this;
        }

        public Builder setQuestion5Area5(String stringValue) {
            INSTANCE.setSubCounty5(stringValue);
            return this;
        }

        public Builder setQuestion5WaterSource5(String stringValue) {
            INSTANCE.setWaterSource5(stringValue);
            return this;
        }

        public Builder setQuestion5Functional5(int integerValue) {
            INSTANCE.setQuestion5Functional5(integerValue);
            return this;
        }

        public Builder setNonFunctional5(int integerValue) {
            INSTANCE.setQuestion5NoneFunctional5(integerValue);
            return this;
        }

        public Builder setQuestion5Area6(String stringValue) {
            INSTANCE.setSubCounty6(stringValue);
            return this;
        }

        public Builder setQuestion5WaterSource6(String stringValue) {
            INSTANCE.setWaterSource6(stringValue);
            return this;
        }

        public Builder setQuestion5Functional6(int integerValue) {
            INSTANCE.setQuestion5Functional6(integerValue);
            return this;
        }

        public Builder setNonFunctional6(int integerValue) {
            INSTANCE.setQuestion5NoneFunctional6(integerValue);
            return this;
        }

        public Builder setQuestion5Objective(boolean questionQ5ObjectiveAnswer) {
            INSTANCE.setQuestion5Objective(questionQ5ObjectiveAnswer);
            return this;
        }

        public Builder setQuestion5ObjectiveReason(String stringValue) {
            INSTANCE.setQuestion5ObjectiveReason(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandDemarcated(String stringValue) {
            INSTANCE.setQuestion6WetLandDemarcated(stringValue);
            return this;
        }

        public Builder setQuestion5NoWaterSourceAvailable(int integerValue) {
            INSTANCE.setQuestion5WaterSourceAvailable1(integerValue);
            return this;
        }

        public Builder setQuestion5NoWaterSourceAvailable2(int integerValue) {
            INSTANCE.setQuestion5WaterSourceAvailable2(integerValue);
            return this;
        }

        public Builder setQuestion5NoWaterSourceAvailable3(int integerValue) {
            INSTANCE.setQuestion5WaterSourceAvailable3(integerValue);
            return this;
        }

        public Builder setQuestion5NoWaterSourceAvailable4(int integerValue) {
            INSTANCE.setQuestion5WaterSourceAvailable4(integerValue);
            return this;
        }

        public Builder setQuestion5NoWaterSourceAvailable5(int integerValue) {
            INSTANCE.setQuestion5WaterSourceAvailable5(integerValue);
            return this;
        }

        public Builder setQuestion5NoWaterSourceAvailable6(int integerValue) {
            INSTANCE.setQuestion5WaterSourceAvailable6(integerValue);
            return this;
        }

        public Builder setQuestion6SubCounty1(String stringValue) {
            INSTANCE.setQuestion6VillageName1(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandUnderDestruction1(int intValue) {
            INSTANCE.setQuestion61WetlandUnderDestruction1(intValue);
            return this;
        }

        public Builder setQuestion6SubCounty2(String stringValue) {
            INSTANCE.setQuestion6VillageName2(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandUnderDestruction2(int intValue) {
            INSTANCE.setQuestion61WetlandUnderDestruction2(intValue);
            return this;
        }

        public Builder setQuestion6SubCounty3(String stringValue) {
            INSTANCE.setQuestion6VillageName3(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandUnderDestruction3(int intValue) {
            INSTANCE.setQuestion61WetlandUnderDestruction3(intValue);
            return this;
        }

        public Builder setQuestion6SubCounty4(String stringValue) {
            INSTANCE.setQuestion6VillageName4(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandUnderDestruction4(int intValue) {
            INSTANCE.setQuestion61WetlandUnderDestruction4(intValue);
            return this;
        }


        public Builder setQuestion6SubCounty5(String stringValue) {
            INSTANCE.setQuestion6VillageName5(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandUnderDestruction5(int intValue) {
            INSTANCE.setQuestion61WetlandUnderDestruction5(intValue);
            return this;
        }

        public Builder setQuestion6SubCounty6(String stringValue) {
            INSTANCE.setQuestion6VillageName6(stringValue);
            return this;
        }

        public Builder setQuestion6WetlandUnderDestruction6(int intValue) {
            INSTANCE.setQuestion61WetlandUnderDestruction6(intValue);
            return this;
        }


        public Builder setQuestion62TreePlanting(String stringValue) {
            INSTANCE.setQuestion62TreePlanting(stringValue);
            return this;
        }

        public Builder setQuarter(String iv) {
            return this;
        }

        public Builder setQuestion5NoneFunctional1(int i) {
            return this;
        }
    }

    @Ignore
    private WaterEnvironmentQuestion() {}

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

    public String getSub_county() {
        return sub_county;
    }

    public void setSub_county(String sub_county) {
        this.sub_county = sub_county;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentTel() {
        return agentTel;
    }

    public void setAgentTel(String agentTel) {
        this.agentTel = agentTel;
    }

    public boolean isQuestion1Objective() {
        return question1Objective;
    }

    public void setQuestion1Objective(boolean question1Objective) {
        this.question1Objective = question1Objective;
    }

    public String getQuestion1ObjectiveReason() {
        return question1ObjectiveReason;
    }

    public void setQuestion1ObjectiveReason(String question1ObjectiveReason) {
        this.question1ObjectiveReason = question1ObjectiveReason;
    }

    public String getQuestion2Water() {
        return question2Water;
    }

    public void setQuestion2Water(String question2Water) {
        this.question2Water = question2Water;
    }

    public boolean getQuestion3Objective() {
        return question3Objective;
    }

    public void setQuestion3Objective(boolean question3Objective) {
        this.question3Objective = question3Objective;
    }

    public String getQuestion5Text() {
        return question5Text;
    }

    public void setQuestion5Text(String question5Text) {
        this.question5Text = question5Text;
    }

    public String getSubCounty1() {
        return subCounty1;
    }

    public void setSubCounty1(String subCounty1) {
        this.subCounty1 = subCounty1;
    }

    public String getWaterSource1() {
        return waterSource1;
    }

    public void setWaterSource1(String waterSource1) {
        this.waterSource1 = waterSource1;
    }

    public int getQuestion5Functional1() {
        return question5Functional1;
    }

    public void setQuestion5Functional1(int question5Functional1) {
        this.question5Functional1 = question5Functional1;
    }

    public int getQuestion5NoneFunctional1() {
        return question5NoneFunctional1;
    }

    public void setQuestion5NoneFunctional1(int question5NoneFunctional1) {
        this.question5NoneFunctional1 = question5NoneFunctional1;
    }

    public int getQuestion5WaterSourceAvailable1() {
        return question5WaterSourceAvailable1;
    }

    public void setQuestion5WaterSourceAvailable1(int question5WaterSourceAvailable1) {
        this.question5WaterSourceAvailable1 = question5WaterSourceAvailable1;
    }

    public String getSubCounty2() {
        return subCounty2;
    }

    public void setSubCounty2(String subCounty2) {
        this.subCounty2 = subCounty2;
    }

    public String getWaterSource2() {
        return waterSource2;
    }

    public void setWaterSource2(String waterSource2) {
        this.waterSource2 = waterSource2;
    }

    public int getQuestion5Functional2() {
        return question5Functional2;
    }

    public void setQuestion5Functional2(int question5Functional2) {
        this.question5Functional2 = question5Functional2;
    }

    public int getQuestion5NoneFunctional2() {
        return question5NoneFunctional2;
    }

    public void setQuestion5NoneFunctional2(int question5NoneFunctional2) {
        this.question5NoneFunctional2 = question5NoneFunctional2;
    }

    public int getQuestion5WaterSourceAvailable2() {
        return question5WaterSourceAvailable2;
    }

    public void setQuestion5WaterSourceAvailable2(int question5WaterSourceAvailable2) {
        this.question5WaterSourceAvailable2 = question5WaterSourceAvailable2;
    }

    public String getSubCounty3() {
        return subCounty3;
    }

    public void setSubCounty3(String subCounty3) {
        this.subCounty3 = subCounty3;
    }

    public String getWaterSource3() {
        return waterSource3;
    }

    public void setWaterSource3(String waterSource3) {
        this.waterSource3 = waterSource3;
    }

    public int getQuestion5Functional3() {
        return question5Functional3;
    }

    public void setQuestion5Functional3(int question5Functional3) {
        this.question5Functional3 = question5Functional3;
    }

    public int getQuestion5NoneFunctional3() {
        return question5NoneFunctional3;
    }

    public void setQuestion5NoneFunctional3(int question5NoneFunctional3) {
        this.question5NoneFunctional3 = question5NoneFunctional3;
    }

    public int getQuestion5WaterSourceAvailable3() {
        return question5WaterSourceAvailable3;
    }

    public void setQuestion5WaterSourceAvailable3(int question5WaterSourceAvailable3) {
        this.question5WaterSourceAvailable3 = question5WaterSourceAvailable3;
    }

    public String getSubCounty4() {
        return subCounty4;
    }

    public void setSubCounty4(String subCounty4) {
        this.subCounty4 = subCounty4;
    }

    public String getWaterSource4() {
        return waterSource4;
    }

    public void setWaterSource4(String waterSource4) {
        this.waterSource4 = waterSource4;
    }

    public int getQuestion5Functional4() {
        return question5Functional4;
    }

    public void setQuestion5Functional4(int question5Functional4) {
        this.question5Functional4 = question5Functional4;
    }

    public int getQuestion5NoneFunctional4() {
        return question5NoneFunctional4;
    }

    public void setQuestion5NoneFunctional4(int question5NoneFunctional4) {
        this.question5NoneFunctional4 = question5NoneFunctional4;
    }

    public int getQuestion5WaterSourceAvailable4() {
        return question5WaterSourceAvailable4;
    }

    public void setQuestion5WaterSourceAvailable4(int question5WaterSourceAvailable4) {
        this.question5WaterSourceAvailable4 = question5WaterSourceAvailable4;
    }

    public String getSubCounty5() {
        return subCounty5;
    }

    public void setSubCounty5(String subCounty5) {
        this.subCounty5 = subCounty5;
    }

    public String getWaterSource5() {
        return waterSource5;
    }

    public void setWaterSource5(String waterSource5) {
        this.waterSource5 = waterSource5;
    }

    public int getQuestion5Functional5() {
        return question5Functional5;
    }

    public void setQuestion5Functional5(int question5Functional5) {
        this.question5Functional5 = question5Functional5;
    }

    public int getQuestion5NoneFunctional5() {
        return question5NoneFunctional5;
    }

    public void setQuestion5NoneFunctional5(int question5NoneFunctional5) {
        this.question5NoneFunctional5 = question5NoneFunctional5;
    }

    public int getQuestion5WaterSourceAvailable5() {
        return question5WaterSourceAvailable5;
    }

    public void setQuestion5WaterSourceAvailable5(int question5WaterSourceAvailable5) {
        this.question5WaterSourceAvailable5 = question5WaterSourceAvailable5;
    }

    public String getSubCounty6() {
        return subCounty6;
    }

    public void setSubCounty6(String subCounty6) {
        this.subCounty6 = subCounty6;
    }

    public String getWaterSource6() {
        return waterSource6;
    }

    public void setWaterSource6(String waterSource6) {
        this.waterSource6 = waterSource6;
    }

    public int getQuestion5Functional6() {
        return question5Functional6;
    }

    public void setQuestion5Functional6(int question5Functional6) {
        this.question5Functional6 = question5Functional6;
    }

    public int getQuestion5NoneFunctional6() {
        return question5NoneFunctional6;
    }

    public void setQuestion5NoneFunctional6(int question5NoneFunctional6) {
        this.question5NoneFunctional6 = question5NoneFunctional6;
    }

    public int getQuestion5WaterSourceAvailable6() {
        return question5WaterSourceAvailable6;
    }

    public void setQuestion5WaterSourceAvailable6(int question5WaterSourceAvailable6) {
        this.question5WaterSourceAvailable6 = question5WaterSourceAvailable6;
    }

    public boolean isQuestion5Objective() {
        return question5Objective;
    }

    public void setQuestion5Objective(boolean question5Objective) {
        this.question5Objective = question5Objective;
    }

    public String getQuestion5ObjectiveReason() {
        return question5ObjectiveReason;
    }

    public void setQuestion5ObjectiveReason(String question5ObjectiveReason) {
        this.question5ObjectiveReason = question5ObjectiveReason;
    }

    public String getQuestion6VillageName1() {
        return question6VillageName1;
    }

    public void setQuestion6VillageName1(String question6VillageName1) {
        this.question6VillageName1 = question6VillageName1;
    }

    public int getQuestion61WetlandUnderDestruction1() {
        return question61WetlandUnderDestruction1;
    }

    public void setQuestion61WetlandUnderDestruction1(int question61WetlandUnderDestruction1) {
        this.question61WetlandUnderDestruction1 = question61WetlandUnderDestruction1;
    }

    public String getQuestion6VillageName2() {
        return question6VillageName2;
    }

    public void setQuestion6VillageName2(String question6VillageName2) {
        this.question6VillageName2 = question6VillageName2;
    }

    public int getQuestion61WetlandUnderDestruction2() {
        return question61WetlandUnderDestruction2;
    }

    public void setQuestion61WetlandUnderDestruction2(int question61WetlandUnderDestruction2) {
        this.question61WetlandUnderDestruction2 = question61WetlandUnderDestruction2;
    }

    public String getQuestion6VillageName3() {
        return question6VillageName3;
    }

    public void setQuestion6VillageName3(String question6VillageName3) {
        this.question6VillageName3 = question6VillageName3;
    }

    public int getQuestion61WetlandUnderDestruction3() {
        return question61WetlandUnderDestruction3;
    }

    public void setQuestion61WetlandUnderDestruction3(int question61WetlandUnderDestruction3) {
        this.question61WetlandUnderDestruction3 = question61WetlandUnderDestruction3;
    }

    public String getQuestion6VillageName4() {
        return question6VillageName4;
    }

    public void setQuestion6VillageName4(String question6VillageName4) {
        this.question6VillageName4 = question6VillageName4;
    }

    public int getQuestion61WetlandUnderDestruction4() {
        return question61WetlandUnderDestruction4;
    }

    public void setQuestion61WetlandUnderDestruction4(int question61WetlandUnderDestruction4) {
        this.question61WetlandUnderDestruction4 = question61WetlandUnderDestruction4;
    }

    public String getQuestion6VillageName5() {
        return question6VillageName5;
    }

    public void setQuestion6VillageName5(String question6VillageName5) {
        this.question6VillageName5 = question6VillageName5;
    }

    public int getQuestion61WetlandUnderDestruction5() {
        return question61WetlandUnderDestruction5;
    }

    public void setQuestion61WetlandUnderDestruction5(int question61WetlandUnderDestruction5) {
        this.question61WetlandUnderDestruction5 = question61WetlandUnderDestruction5;
    }

    public String getQuestion6VillageName6() {
        return question6VillageName6;
    }

    public void setQuestion6VillageName6(String question6VillageName6) {
        this.question6VillageName6 = question6VillageName6;
    }

    public int getQuestion61WetlandUnderDestruction6() {
        return question61WetlandUnderDestruction6;
    }

    public void setQuestion61WetlandUnderDestruction6(int question61WetlandUnderDestruction6) {
        this.question61WetlandUnderDestruction6 = question61WetlandUnderDestruction6;
    }

    public String getQuestion62TreePlanting() {
        return question62TreePlanting;
    }

    public void setQuestion62TreePlanting(String question62TreePlanting) {
        this.question62TreePlanting = question62TreePlanting;
    }

    public boolean isLocallyStored() {
        return locallyStored;
    }

    public void setLocallyStored(boolean locallyStored) {
        this.locallyStored = locallyStored;
    }

    public String getQuestion4Answer() {
        return question4Answer;
    }

    public void setQuestion4Answer(String question4Answer) {
        this.question4Answer = question4Answer;
    }

    @Ignore
    public boolean isQuestion3Objective() {
        return question3Objective;
    }

    @Override
    public String toString() {
        return "WaterEnvironmentQuestion{" +
                "primaryKey=" + primaryKey +
                ", financialYear='" + financialYear + '\'' +
                ", date='" + date + '\'' +
                ", district='" + district + '\'' +
                ", village='" + village + '\'' +
                ", parish='" + parish + '\'' +
                ", sub_county='" + sub_county + '\'' +
                ", agentName='" + agentName + '\'' +
                ", agentTel='" + agentTel + '\'' +
                ", question1Objective=" + question1Objective +
                ", question1ObjectiveReason='" + question1ObjectiveReason + '\'' +
                ", question2Water='" + question2Water + '\'' +
                ", question3Objective='" + question3Objective + '\'' +
                ", question5Text='" + question5Text + '\'' +
                ", subCounty1='" + subCounty1 + '\'' +
                ", waterSource1='" + waterSource1 + '\'' +
                ", question5Functional1=" + question5Functional1 +
                ", question5NoneFunctional1=" + question5NoneFunctional1 +
                ", question5WaterSourceAvailable1=" + question5WaterSourceAvailable1 +
                ", subCounty2='" + subCounty2 + '\'' +
                ", waterSource2='" + waterSource2 + '\'' +
                ", question5Functional2=" + question5Functional2 +
                ", question5NoneFunctional2=" + question5NoneFunctional2 +
                ", question5WaterSourceAvailable2=" + question5WaterSourceAvailable2 +
                ", subCounty3='" + subCounty3 + '\'' +
                ", waterSource3='" + waterSource3 + '\'' +
                ", question5Functional3=" + question5Functional3 +
                ", question5NoneFunctional3=" + question5NoneFunctional3 +
                ", question5WaterSourceAvailable3=" + question5WaterSourceAvailable3 +
                ", subCounty4='" + subCounty4 + '\'' +
                ", waterSource4='" + waterSource4 + '\'' +
                ", question5Functional4=" + question5Functional4 +
                ", question5NoneFunctional4=" + question5NoneFunctional4 +
                ", question5WaterSourceAvailable4=" + question5WaterSourceAvailable4 +
                ", subCounty5='" + subCounty5 + '\'' +
                ", waterSource5='" + waterSource5 + '\'' +
                ", question5Functional5=" + question5Functional5 +
                ", question5NoneFunctional5=" + question5NoneFunctional5 +
                ", question5WaterSourceAvailable5=" + question5WaterSourceAvailable5 +
                ", subCounty6='" + subCounty6 + '\'' +
                ", waterSource6='" + waterSource6 + '\'' +
                ", question5Functional6=" + question5Functional6 +
                ", question5NoneFunctional6=" + question5NoneFunctional6 +
                ", question5WaterSourceAvailable6=" + question5WaterSourceAvailable6 +
                ", question5Objective=" + question5Objective +
                ", question5ObjectiveReason='" + question5ObjectiveReason + '\'' +
                ", question6VillageName1='" + question6VillageName1 + '\'' +
                ", question61WetlandUnderDestruction1=" + question61WetlandUnderDestruction1 +
                ", question6VillageName2='" + question6VillageName2 + '\'' +
                ", question61WetlandUnderDestruction2=" + question61WetlandUnderDestruction2 +
                ", question6VillageName3='" + question6VillageName3 + '\'' +
                ", question61WetlandUnderDestruction3=" + question61WetlandUnderDestruction3 +
                ", question6VillageName4='" + question6VillageName4 + '\'' +
                ", question61WetlandUnderDestruction4=" + question61WetlandUnderDestruction4 +
                ", question6VillageName5='" + question6VillageName5 + '\'' +
                ", question61WetlandUnderDestruction5=" + question61WetlandUnderDestruction5 +
                ", question6VillageName6='" + question6VillageName6 + '\'' +
                ", question61WetlandUnderDestruction6=" + question61WetlandUnderDestruction6 +
                ", question62TreePlanting='" + question62TreePlanting + '\'' +
                ", locallyStored=" + locallyStored +
                '}';
    }
}
