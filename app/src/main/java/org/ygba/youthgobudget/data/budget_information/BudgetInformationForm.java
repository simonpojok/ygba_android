package org.ygba.youthgobudget.data.budget_information;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = BudgetInformationFormConstants.TABLE_NAME)
public class BudgetInformationForm {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = BudgetInformationFormConstants.PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = BudgetInformationFormConstants.ADMINISTRATION_APPROVED_BUDGET)
    private int adminApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.ADMINISTRATION_PERCENTAGE)
    private int adminPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCE_APPROVED_BUDGET)
    private int financeApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCE_PERCENTAGE)
    private int financePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.STATUTORY_BODIES_APPROVED_BUDGET)
    private int statutoryBodiesApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.STATUTORY_BODIES_PERCENTAGE)
    private int statutoryBodiesPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.PRODUCTION_APPROVED_BUDGET)
    private int productionApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.PRODUCTION_PERCENTAGE)
    private int productionPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.HEALTH_APPROVED_BUDGET)
    private int healthApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.HEALTH_PERCENTAGE)
    private int healthPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.EDUCATION_APPROVED_BUDGET)
    private int educationApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.EDUCATION_PERCENTAGE)
    private int educationPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.ROADS_ENGINEERING_APPROVED_BUDGET)
    private int roadEngineeringApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.ROADS_ENGINEERING_PERCENTAGE)
    private int roadEngineeringPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.WATER_APPROVED_BUDGET)
    private int waterApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.WATER_PERCENTAGE)
    private int waterPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.NATUREAL_RESOURCES_APPROVED_BUDGET)
    private int naturalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.NATUREAL_RESOURCES_PERCENTAGE)
    private int naturalPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_APPROVED_BUDGET)
    private int communityApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_PERCENTAGE)
    private int communityPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.PLANNING_APPROVED_BUDGET)
    private int planningApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.PLANNING_PERCENTAGE)
    private int planningPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.INTERNAL_AUDIT_APPROVED_BUDGET)
    private int internalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.INTERNAL_AUDIT_PERCENTAGE)
    private int internalPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.TRADE_APPROVED_BUDGET)
    private int tradeApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.TRADE_AUDIT_PERCENTAGE)
    private int tradePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.TOTAL_APPROVED_BUDGET)
    private int totalApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.TOTAL_AUDIT_PERCENTAGE)
    private int totalPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.WAGE_APPROVED_BUDGET)
    private int wageApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.WAGE_AUDIT_PERCENTAGE)
    private int wagePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.NONE_WAGE_APPROVED_BUDGET)
    private int noneWageApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.NONE_WAGE_AUDIT_PERCENTAGE)
    private int noneWagePercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.DOMESTIC_APPROVED_BUDGET)
    private int domesticApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.DOMESTIC_PERCENTAGE)
    private int domesticPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.EXT_APPROVED_BUDGET)
    private int extApprovedBudget;

    @ColumnInfo(name = BudgetInformationFormConstants.EXT_PERCENTAGE)
    private int extPercentage;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_NAME)
    private String districtName;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_NAME)
    private String serviceName;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISH_NAME)
    private String communityWishName;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_1_SECTOR)
    private int district1Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_1_SECTOR)
    private int subCounty1Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_1_SECTOR)
    private String financialYear1Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_1_SECTOR)
    private String service1Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_1_SECTOR)
    private String communityWishes1Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_2_SECTOR)
    private int district2Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_2_SECTOR)
    private int subCounty2Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_2_SECTOR)
    private String financialYear2Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_2_SECTOR)
    private String service2Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_2_SECTOR)
    private String communityWishes2Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_3_SECTOR)
    private int district3Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_3_SECTOR)
    private int subCounty3Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_3_SECTOR)
    private String financialYear3Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_3_SECTOR)
    private String service3Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_3_SECTOR)
    private String communityWishes3Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_4_SECTOR)
    private int district4Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_4_SECTOR)
    private int subCounty4Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_4_SECTOR)
    private String financialYear4Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_4_SECTOR)
    private String service4Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_4_SECTOR)
    private String communityWishes4Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_5_SECTOR)
    private int district5Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_5_SECTOR)
    private int subCounty5Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_5_SECTOR)
    private String financialYear5Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_5_SECTOR)
    private String service5Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_5_SECTOR)
    private String communityWishes5Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_6_SECTOR)
    private int district6Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_6_SECTOR)
    private int subCounty6Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_6_SECTOR)
    private String financialYear6Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_6_SECTOR)
    private String service6Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_6_SECTOR)
    private String communityWishes6Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.DISTRICT_7_SECTOR)
    private int district7Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SUB_COUNTY_7_SECTOR)
    private int subCounty7Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.FINANCIAL_YEAR_7_SECTOR)
    private String financialYear7Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.SERVICE_7_SECTOR)
    private String service7Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.COMMUNITY_WISHES_7_SECTOR)
    private String communityWishes7Sector;

    @ColumnInfo(name = BudgetInformationFormConstants.STORED_LOCALLY)
    private boolean storedLocally;

    public BudgetInformationForm(String financialYear, int adminApprovedBudget, int adminPercentage, int financeApprovedBudget, int financePercentage, int statutoryBodiesApprovedBudget, int statutoryBodiesPercentage, int productionApprovedBudget, int productionPercentage, int healthApprovedBudget, int healthPercentage, int educationApprovedBudget, int educationPercentage, int roadEngineeringApprovedBudget, int roadEngineeringPercentage, int waterApprovedBudget, int waterPercentage, int naturalApprovedBudget, int naturalPercentage, int communityApprovedBudget, int communityPercentage, int planningApprovedBudget, int planningPercentage, int internalApprovedBudget, int internalPercentage, int tradeApprovedBudget, int tradePercentage, int totalApprovedBudget, int totalPercentage, int wageApprovedBudget, int wagePercentage, int noneWageApprovedBudget, int noneWagePercentage, int domesticApprovedBudget, int domesticPercentage, int extApprovedBudget, int extPercentage, String districtName, String serviceName, String communityWishName, int district1Sector, int subCounty1Sector, String financialYear1Sector, String service1Sector, String communityWishes1Sector, int district2Sector, int subCounty2Sector, String financialYear2Sector, String service2Sector, String communityWishes2Sector, int district3Sector, int subCounty3Sector, String financialYear3Sector, String service3Sector, String communityWishes3Sector, int district4Sector, int subCounty4Sector, String financialYear4Sector, String service4Sector, String communityWishes4Sector, int district5Sector, int subCounty5Sector, String financialYear5Sector, String service5Sector, String communityWishes5Sector, int district6Sector, int subCounty6Sector, String financialYear6Sector, String service6Sector, String communityWishes6Sector, int district7Sector, int subCounty7Sector, String financialYear7Sector, String service7Sector, String communityWishes7Sector) {
        this.financialYear = financialYear;
        this.adminApprovedBudget = adminApprovedBudget;
        this.adminPercentage = adminPercentage;
        this.financeApprovedBudget = financeApprovedBudget;
        this.financePercentage = financePercentage;
        this.statutoryBodiesApprovedBudget = statutoryBodiesApprovedBudget;
        this.statutoryBodiesPercentage = statutoryBodiesPercentage;
        this.productionApprovedBudget = productionApprovedBudget;
        this.productionPercentage = productionPercentage;
        this.healthApprovedBudget = healthApprovedBudget;
        this.healthPercentage = healthPercentage;
        this.educationApprovedBudget = educationApprovedBudget;
        this.educationPercentage = educationPercentage;
        this.roadEngineeringApprovedBudget = roadEngineeringApprovedBudget;
        this.roadEngineeringPercentage = roadEngineeringPercentage;
        this.waterApprovedBudget = waterApprovedBudget;
        this.waterPercentage = waterPercentage;
        this.naturalApprovedBudget = naturalApprovedBudget;
        this.naturalPercentage = naturalPercentage;
        this.communityApprovedBudget = communityApprovedBudget;
        this.communityPercentage = communityPercentage;
        this.planningApprovedBudget = planningApprovedBudget;
        this.planningPercentage = planningPercentage;
        this.internalApprovedBudget = internalApprovedBudget;
        this.internalPercentage = internalPercentage;
        this.tradeApprovedBudget = tradeApprovedBudget;
        this.tradePercentage = tradePercentage;
        this.totalApprovedBudget = totalApprovedBudget;
        this.totalPercentage = totalPercentage;
        this.wageApprovedBudget = wageApprovedBudget;
        this.wagePercentage = wagePercentage;
        this.noneWageApprovedBudget = noneWageApprovedBudget;
        this.noneWagePercentage = noneWagePercentage;
        this.domesticApprovedBudget = domesticApprovedBudget;
        this.domesticPercentage = domesticPercentage;
        this.extApprovedBudget = extApprovedBudget;
        this.extPercentage = extPercentage;
        this.districtName = districtName;
        this.serviceName = serviceName;
        this.communityWishName = communityWishName;
        this.district1Sector = district1Sector;
        this.subCounty1Sector = subCounty1Sector;
        this.financialYear1Sector = financialYear1Sector;
        this.service1Sector = service1Sector;
        this.communityWishes1Sector = communityWishes1Sector;
        this.district2Sector = district2Sector;
        this.subCounty2Sector = subCounty2Sector;
        this.financialYear2Sector = financialYear2Sector;
        this.service2Sector = service2Sector;
        this.communityWishes2Sector = communityWishes2Sector;
        this.district3Sector = district3Sector;
        this.subCounty3Sector = subCounty3Sector;
        this.financialYear3Sector = financialYear3Sector;
        this.service3Sector = service3Sector;
        this.communityWishes3Sector = communityWishes3Sector;
        this.district4Sector = district4Sector;
        this.subCounty4Sector = subCounty4Sector;
        this.financialYear4Sector = financialYear4Sector;
        this.service4Sector = service4Sector;
        this.communityWishes4Sector = communityWishes4Sector;
        this.district5Sector = district5Sector;
        this.subCounty5Sector = subCounty5Sector;
        this.financialYear5Sector = financialYear5Sector;
        this.service5Sector = service5Sector;
        this.communityWishes5Sector = communityWishes5Sector;
        this.district6Sector = district6Sector;
        this.subCounty6Sector = subCounty6Sector;
        this.financialYear6Sector = financialYear6Sector;
        this.service6Sector = service6Sector;
        this.communityWishes6Sector = communityWishes6Sector;
        this.district7Sector = district7Sector;
        this.subCounty7Sector = subCounty7Sector;
        this.financialYear7Sector = financialYear7Sector;
        this.service7Sector = service7Sector;
        this.communityWishes7Sector = communityWishes7Sector;
        this.storedLocally = true;
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

    public int getAdminApprovedBudget() {
        return adminApprovedBudget;
    }

    public void setAdminApprovedBudget(int adminApprovedBudget) {
        this.adminApprovedBudget = adminApprovedBudget;
    }

    public int getAdminPercentage() {
        return adminPercentage;
    }

    public void setAdminPercentage(int adminPercentage) {
        this.adminPercentage = adminPercentage;
    }

    public int getFinanceApprovedBudget() {
        return financeApprovedBudget;
    }

    public void setFinanceApprovedBudget(int financeApprovedBudget) {
        this.financeApprovedBudget = financeApprovedBudget;
    }

    public int getFinancePercentage() {
        return financePercentage;
    }

    public void setFinancePercentage(int financePercentage) {
        this.financePercentage = financePercentage;
    }

    public int getStatutoryBodiesApprovedBudget() {
        return statutoryBodiesApprovedBudget;
    }

    public void setStatutoryBodiesApprovedBudget(int statutoryBodiesApprovedBudget) {
        this.statutoryBodiesApprovedBudget = statutoryBodiesApprovedBudget;
    }

    public int getStatutoryBodiesPercentage() {
        return statutoryBodiesPercentage;
    }

    public void setStatutoryBodiesPercentage(int statutoryBodiesPercentage) {
        this.statutoryBodiesPercentage = statutoryBodiesPercentage;
    }

    public int getProductionApprovedBudget() {
        return productionApprovedBudget;
    }

    public void setProductionApprovedBudget(int productionApprovedBudget) {
        this.productionApprovedBudget = productionApprovedBudget;
    }

    public int getProductionPercentage() {
        return productionPercentage;
    }

    public void setProductionPercentage(int productionPercentage) {
        this.productionPercentage = productionPercentage;
    }

    public int getHealthApprovedBudget() {
        return healthApprovedBudget;
    }

    public void setHealthApprovedBudget(int healthApprovedBudget) {
        this.healthApprovedBudget = healthApprovedBudget;
    }

    public int getHealthPercentage() {
        return healthPercentage;
    }

    public void setHealthPercentage(int healthPercentage) {
        this.healthPercentage = healthPercentage;
    }

    public int getEducationApprovedBudget() {
        return educationApprovedBudget;
    }

    public void setEducationApprovedBudget(int educationApprovedBudget) {
        this.educationApprovedBudget = educationApprovedBudget;
    }

    public int getEducationPercentage() {
        return educationPercentage;
    }

    public void setEducationPercentage(int educationPercentage) {
        this.educationPercentage = educationPercentage;
    }

    public int getRoadEngineeringApprovedBudget() {
        return roadEngineeringApprovedBudget;
    }

    public void setRoadEngineeringApprovedBudget(int roadEngineeringApprovedBudget) {
        this.roadEngineeringApprovedBudget = roadEngineeringApprovedBudget;
    }

    public int getRoadEngineeringPercentage() {
        return roadEngineeringPercentage;
    }

    public void setRoadEngineeringPercentage(int roadEngineeringPercentage) {
        this.roadEngineeringPercentage = roadEngineeringPercentage;
    }

    public int getWaterApprovedBudget() {
        return waterApprovedBudget;
    }

    public void setWaterApprovedBudget(int waterApprovedBudget) {
        this.waterApprovedBudget = waterApprovedBudget;
    }

    public int getWaterPercentage() {
        return waterPercentage;
    }

    public void setWaterPercentage(int waterPercentage) {
        this.waterPercentage = waterPercentage;
    }

    public int getNaturalApprovedBudget() {
        return naturalApprovedBudget;
    }

    public void setNaturalApprovedBudget(int naturalApprovedBudget) {
        this.naturalApprovedBudget = naturalApprovedBudget;
    }

    public int getNaturalPercentage() {
        return naturalPercentage;
    }

    public void setNaturalPercentage(int naturalPercentage) {
        this.naturalPercentage = naturalPercentage;
    }

    public int getCommunityApprovedBudget() {
        return communityApprovedBudget;
    }

    public void setCommunityApprovedBudget(int communityApprovedBudget) {
        this.communityApprovedBudget = communityApprovedBudget;
    }

    public int getCommunityPercentage() {
        return communityPercentage;
    }

    public void setCommunityPercentage(int communityPercentage) {
        this.communityPercentage = communityPercentage;
    }

    public int getPlanningApprovedBudget() {
        return planningApprovedBudget;
    }

    public void setPlanningApprovedBudget(int planningApprovedBudget) {
        this.planningApprovedBudget = planningApprovedBudget;
    }

    public int getPlanningPercentage() {
        return planningPercentage;
    }

    public void setPlanningPercentage(int planningPercentage) {
        this.planningPercentage = planningPercentage;
    }

    public int getInternalApprovedBudget() {
        return internalApprovedBudget;
    }

    public void setInternalApprovedBudget(int internalApprovedBudget) {
        this.internalApprovedBudget = internalApprovedBudget;
    }

    public int getInternalPercentage() {
        return internalPercentage;
    }

    public void setInternalPercentage(int internalPercentage) {
        this.internalPercentage = internalPercentage;
    }

    public int getTradeApprovedBudget() {
        return tradeApprovedBudget;
    }

    public void setTradeApprovedBudget(int tradeApprovedBudget) {
        this.tradeApprovedBudget = tradeApprovedBudget;
    }

    public int getTradePercentage() {
        return tradePercentage;
    }

    public void setTradePercentage(int tradePercentage) {
        this.tradePercentage = tradePercentage;
    }

    public int getTotalApprovedBudget() {
        return totalApprovedBudget;
    }

    public void setTotalApprovedBudget(int totalApprovedBudget) {
        this.totalApprovedBudget = totalApprovedBudget;
    }

    public int getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(int totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public int getWageApprovedBudget() {
        return wageApprovedBudget;
    }

    public void setWageApprovedBudget(int wageApprovedBudget) {
        this.wageApprovedBudget = wageApprovedBudget;
    }

    public int getWagePercentage() {
        return wagePercentage;
    }

    public void setWagePercentage(int wagePercentage) {
        this.wagePercentage = wagePercentage;
    }

    public int getNoneWageApprovedBudget() {
        return noneWageApprovedBudget;
    }

    public void setNoneWageApprovedBudget(int noneWageApprovedBudget) {
        this.noneWageApprovedBudget = noneWageApprovedBudget;
    }

    public int getNoneWagePercentage() {
        return noneWagePercentage;
    }

    public void setNoneWagePercentage(int noneWagePercentage) {
        this.noneWagePercentage = noneWagePercentage;
    }

    public int getDomesticApprovedBudget() {
        return domesticApprovedBudget;
    }

    public void setDomesticApprovedBudget(int domesticApprovedBudget) {
        this.domesticApprovedBudget = domesticApprovedBudget;
    }

    public int getDomesticPercentage() {
        return domesticPercentage;
    }

    public void setDomesticPercentage(int domesticPercentage) {
        this.domesticPercentage = domesticPercentage;
    }

    public int getExtApprovedBudget() {
        return extApprovedBudget;
    }

    public void setExtApprovedBudget(int extApprovedBudget) {
        this.extApprovedBudget = extApprovedBudget;
    }

    public int getExtPercentage() {
        return extPercentage;
    }

    public void setExtPercentage(int extPercentage) {
        this.extPercentage = extPercentage;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCommunityWishName() {
        return communityWishName;
    }

    public void setCommunityWishName(String communityWishName) {
        this.communityWishName = communityWishName;
    }

    public int getDistrict1Sector() {
        return district1Sector;
    }

    public void setDistrict1Sector(int district1Sector) {
        this.district1Sector = district1Sector;
    }

    public int getSubCounty1Sector() {
        return subCounty1Sector;
    }

    public void setSubCounty1Sector(int subCounty1Sector) {
        this.subCounty1Sector = subCounty1Sector;
    }

    public String getFinancialYear1Sector() {
        return financialYear1Sector;
    }

    public void setFinancialYear1Sector(String financialYear1Sector) {
        this.financialYear1Sector = financialYear1Sector;
    }

    public String getService1Sector() {
        return service1Sector;
    }

    public void setService1Sector(String service1Sector) {
        this.service1Sector = service1Sector;
    }

    public String getCommunityWishes1Sector() {
        return communityWishes1Sector;
    }

    public void setCommunityWishes1Sector(String communityWishes1Sector) {
        this.communityWishes1Sector = communityWishes1Sector;
    }

    public int getDistrict2Sector() {
        return district2Sector;
    }

    public void setDistrict2Sector(int district2Sector) {
        this.district2Sector = district2Sector;
    }

    public int getSubCounty2Sector() {
        return subCounty2Sector;
    }

    public void setSubCounty2Sector(int subCounty2Sector) {
        this.subCounty2Sector = subCounty2Sector;
    }

    public String getFinancialYear2Sector() {
        return financialYear2Sector;
    }

    public void setFinancialYear2Sector(String financialYear2Sector) {
        this.financialYear2Sector = financialYear2Sector;
    }

    public String getService2Sector() {
        return service2Sector;
    }

    public void setService2Sector(String service2Sector) {
        this.service2Sector = service2Sector;
    }

    public String getCommunityWishes2Sector() {
        return communityWishes2Sector;
    }

    public void setCommunityWishes2Sector(String communityWishes2Sector) {
        this.communityWishes2Sector = communityWishes2Sector;
    }

    public int getDistrict3Sector() {
        return district3Sector;
    }

    public void setDistrict3Sector(int district3Sector) {
        this.district3Sector = district3Sector;
    }

    public int getSubCounty3Sector() {
        return subCounty3Sector;
    }

    public void setSubCounty3Sector(int subCounty3Sector) {
        this.subCounty3Sector = subCounty3Sector;
    }

    public String getFinancialYear3Sector() {
        return financialYear3Sector;
    }

    public void setFinancialYear3Sector(String financialYear3Sector) {
        this.financialYear3Sector = financialYear3Sector;
    }

    public String getService3Sector() {
        return service3Sector;
    }

    public void setService3Sector(String service3Sector) {
        this.service3Sector = service3Sector;
    }

    public String getCommunityWishes3Sector() {
        return communityWishes3Sector;
    }

    public void setCommunityWishes3Sector(String communityWishes3Sector) {
        this.communityWishes3Sector = communityWishes3Sector;
    }

    public int getDistrict4Sector() {
        return district4Sector;
    }

    public void setDistrict4Sector(int district4Sector) {
        this.district4Sector = district4Sector;
    }

    public int getSubCounty4Sector() {
        return subCounty4Sector;
    }

    public void setSubCounty4Sector(int subCounty4Sector) {
        this.subCounty4Sector = subCounty4Sector;
    }

    public String getFinancialYear4Sector() {
        return financialYear4Sector;
    }

    public void setFinancialYear4Sector(String financialYear4Sector) {
        this.financialYear4Sector = financialYear4Sector;
    }

    public String getService4Sector() {
        return service4Sector;
    }

    public void setService4Sector(String service4Sector) {
        this.service4Sector = service4Sector;
    }

    public String getCommunityWishes4Sector() {
        return communityWishes4Sector;
    }

    public void setCommunityWishes4Sector(String communityWishes4Sector) {
        this.communityWishes4Sector = communityWishes4Sector;
    }

    public int getDistrict5Sector() {
        return district5Sector;
    }

    public void setDistrict5Sector(int district5Sector) {
        this.district5Sector = district5Sector;
    }

    public int getSubCounty5Sector() {
        return subCounty5Sector;
    }

    public void setSubCounty5Sector(int subCounty5Sector) {
        this.subCounty5Sector = subCounty5Sector;
    }

    public String getFinancialYear5Sector() {
        return financialYear5Sector;
    }

    public void setFinancialYear5Sector(String financialYear5Sector) {
        this.financialYear5Sector = financialYear5Sector;
    }

    public String getService5Sector() {
        return service5Sector;
    }

    public void setService5Sector(String service5Sector) {
        this.service5Sector = service5Sector;
    }

    public String getCommunityWishes5Sector() {
        return communityWishes5Sector;
    }

    public void setCommunityWishes5Sector(String communityWishes5Sector) {
        this.communityWishes5Sector = communityWishes5Sector;
    }

    public int getDistrict6Sector() {
        return district6Sector;
    }

    public void setDistrict6Sector(int district6Sector) {
        this.district6Sector = district6Sector;
    }

    public int getSubCounty6Sector() {
        return subCounty6Sector;
    }

    public void setSubCounty6Sector(int subCounty6Sector) {
        this.subCounty6Sector = subCounty6Sector;
    }

    public String getFinancialYear6Sector() {
        return financialYear6Sector;
    }

    public void setFinancialYear6Sector(String financialYear6Sector) {
        this.financialYear6Sector = financialYear6Sector;
    }

    public String getService6Sector() {
        return service6Sector;
    }

    public void setService6Sector(String service6Sector) {
        this.service6Sector = service6Sector;
    }

    public String getCommunityWishes6Sector() {
        return communityWishes6Sector;
    }

    public void setCommunityWishes6Sector(String communityWishes6Sector) {
        this.communityWishes6Sector = communityWishes6Sector;
    }

    public int getDistrict7Sector() {
        return district7Sector;
    }

    public void setDistrict7Sector(int district7Sector) {
        this.district7Sector = district7Sector;
    }

    public int getSubCounty7Sector() {
        return subCounty7Sector;
    }

    public void setSubCounty7Sector(int subCounty7Sector) {
        this.subCounty7Sector = subCounty7Sector;
    }

    public String getFinancialYear7Sector() {
        return financialYear7Sector;
    }

    public void setFinancialYear7Sector(String financialYear7Sector) {
        this.financialYear7Sector = financialYear7Sector;
    }

    public String getService7Sector() {
        return service7Sector;
    }

    public void setService7Sector(String service7Sector) {
        this.service7Sector = service7Sector;
    }

    public String getCommunityWishes7Sector() {
        return communityWishes7Sector;
    }

    public void setCommunityWishes7Sector(String communityWishes7Sector) {
        this.communityWishes7Sector = communityWishes7Sector;
    }

    public boolean isStoredLocally() {
        return storedLocally;
    }

    public void setStoredLocally(boolean storedLocally) {
        this.storedLocally = storedLocally;
    }

    @Override
    public String toString() {
        return "BudgetInformationForm{" +
                "primaryKey=" + primaryKey +
                ", financialYear='" + financialYear + '\'' +
                ", adminApprovedBudget=" + adminApprovedBudget +
                ", adminPercentage=" + adminPercentage +
                ", financeApprovedBudget=" + financeApprovedBudget +
                ", financePercentage=" + financePercentage +
                ", statutoryBodiesApprovedBudget=" + statutoryBodiesApprovedBudget +
                ", statutoryBodiesPercentage=" + statutoryBodiesPercentage +
                ", productionApprovedBudget=" + productionApprovedBudget +
                ", productionPercentage=" + productionPercentage +
                ", healthApprovedBudget=" + healthApprovedBudget +
                ", healthPercentage=" + healthPercentage +
                ", educationApprovedBudget=" + educationApprovedBudget +
                ", educationPercentage=" + educationPercentage +
                ", roadEngineeringApprovedBudget=" + roadEngineeringApprovedBudget +
                ", roadEngineeringPercentage=" + roadEngineeringPercentage +
                ", waterApprovedBudget=" + waterApprovedBudget +
                ", waterPercentage=" + waterPercentage +
                ", naturalApprovedBudget=" + naturalApprovedBudget +
                ", naturalPercentage=" + naturalPercentage +
                ", communityApprovedBudget=" + communityApprovedBudget +
                ", communityPercentage=" + communityPercentage +
                ", planningApprovedBudget=" + planningApprovedBudget +
                ", planningPercentage=" + planningPercentage +
                ", internalApprovedBudget=" + internalApprovedBudget +
                ", internalPercentage=" + internalPercentage +
                ", tradeApprovedBudget=" + tradeApprovedBudget +
                ", tradePercentage=" + tradePercentage +
                ", totalApprovedBudget=" + totalApprovedBudget +
                ", totalPercentage=" + totalPercentage +
                ", wageApprovedBudget=" + wageApprovedBudget +
                ", wagePercentage=" + wagePercentage +
                ", noneWageApprovedBudget=" + noneWageApprovedBudget +
                ", noneWagePercentage=" + noneWagePercentage +
                ", domesticApprovedBudget=" + domesticApprovedBudget +
                ", domesticPercentage=" + domesticPercentage +
                ", extApprovedBudget=" + extApprovedBudget +
                ", extPercentage=" + extPercentage +
                ", districtName='" + districtName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", communityWishName='" + communityWishName + '\'' +
                ", district1Sector=" + district1Sector +
                ", subCounty1Sector=" + subCounty1Sector +
                ", financialYear1Sector='" + financialYear1Sector + '\'' +
                ", service1Sector='" + service1Sector + '\'' +
                ", communityWishes1Sector='" + communityWishes1Sector + '\'' +
                ", district2Sector=" + district2Sector +
                ", subCounty2Sector=" + subCounty2Sector +
                ", financialYear2Sector='" + financialYear2Sector + '\'' +
                ", service2Sector='" + service2Sector + '\'' +
                ", communityWishes2Sector='" + communityWishes2Sector + '\'' +
                ", district3Sector=" + district3Sector +
                ", subCounty3Sector=" + subCounty3Sector +
                ", financialYear3Sector='" + financialYear3Sector + '\'' +
                ", service3Sector='" + service3Sector + '\'' +
                ", communityWishes3Sector='" + communityWishes3Sector + '\'' +
                ", district4Sector=" + district4Sector +
                ", subCounty4Sector=" + subCounty4Sector +
                ", financialYear4Sector='" + financialYear4Sector + '\'' +
                ", service4Sector='" + service4Sector + '\'' +
                ", communityWishes4Sector='" + communityWishes4Sector + '\'' +
                ", district5Sector=" + district5Sector +
                ", subCounty5Sector=" + subCounty5Sector +
                ", financialYear5Sector='" + financialYear5Sector + '\'' +
                ", service5Sector='" + service5Sector + '\'' +
                ", communityWishes5Sector='" + communityWishes5Sector + '\'' +
                ", district6Sector=" + district6Sector +
                ", subCounty6Sector=" + subCounty6Sector +
                ", financialYear6Sector='" + financialYear6Sector + '\'' +
                ", service6Sector='" + service6Sector + '\'' +
                ", communityWishes6Sector='" + communityWishes6Sector + '\'' +
                ", district7Sector=" + district7Sector +
                ", subCounty7Sector=" + subCounty7Sector +
                ", financialYear7Sector='" + financialYear7Sector + '\'' +
                ", service7Sector='" + service7Sector + '\'' +
                ", communityWishes7Sector='" + communityWishes7Sector + '\'' +
                ", storedLocally=" + storedLocally +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BudgetInformationForm)) return false;
        BudgetInformationForm that = (BudgetInformationForm) o;
        return getPrimaryKey() == that.getPrimaryKey() &&
                getAdminApprovedBudget() == that.getAdminApprovedBudget() &&
                getAdminPercentage() == that.getAdminPercentage() &&
                getFinanceApprovedBudget() == that.getFinanceApprovedBudget() &&
                getFinancePercentage() == that.getFinancePercentage() &&
                getStatutoryBodiesApprovedBudget() == that.getStatutoryBodiesApprovedBudget() &&
                getStatutoryBodiesPercentage() == that.getStatutoryBodiesPercentage() &&
                getProductionApprovedBudget() == that.getProductionApprovedBudget() &&
                getProductionPercentage() == that.getProductionPercentage() &&
                getHealthApprovedBudget() == that.getHealthApprovedBudget() &&
                getHealthPercentage() == that.getHealthPercentage() &&
                getEducationApprovedBudget() == that.getEducationApprovedBudget() &&
                getEducationPercentage() == that.getEducationPercentage() &&
                getRoadEngineeringApprovedBudget() == that.getRoadEngineeringApprovedBudget() &&
                getRoadEngineeringPercentage() == that.getRoadEngineeringPercentage() &&
                getWaterApprovedBudget() == that.getWaterApprovedBudget() &&
                getWaterPercentage() == that.getWaterPercentage() &&
                getNaturalApprovedBudget() == that.getNaturalApprovedBudget() &&
                getNaturalPercentage() == that.getNaturalPercentage() &&
                getCommunityApprovedBudget() == that.getCommunityApprovedBudget() &&
                getCommunityPercentage() == that.getCommunityPercentage() &&
                getPlanningApprovedBudget() == that.getPlanningApprovedBudget() &&
                getPlanningPercentage() == that.getPlanningPercentage() &&
                getInternalApprovedBudget() == that.getInternalApprovedBudget() &&
                getInternalPercentage() == that.getInternalPercentage() &&
                getTradeApprovedBudget() == that.getTradeApprovedBudget() &&
                getTradePercentage() == that.getTradePercentage() &&
                getTotalApprovedBudget() == that.getTotalApprovedBudget() &&
                getTotalPercentage() == that.getTotalPercentage() &&
                getWageApprovedBudget() == that.getWageApprovedBudget() &&
                getWagePercentage() == that.getWagePercentage() &&
                getNoneWageApprovedBudget() == that.getNoneWageApprovedBudget() &&
                getNoneWagePercentage() == that.getNoneWagePercentage() &&
                getDomesticApprovedBudget() == that.getDomesticApprovedBudget() &&
                getDomesticPercentage() == that.getDomesticPercentage() &&
                getExtApprovedBudget() == that.getExtApprovedBudget() &&
                getExtPercentage() == that.getExtPercentage() &&
                getDistrict1Sector() == that.getDistrict1Sector() &&
                getSubCounty1Sector() == that.getSubCounty1Sector() &&
                getDistrict2Sector() == that.getDistrict2Sector() &&
                getSubCounty2Sector() == that.getSubCounty2Sector() &&
                getDistrict3Sector() == that.getDistrict3Sector() &&
                getSubCounty3Sector() == that.getSubCounty3Sector() &&
                getDistrict4Sector() == that.getDistrict4Sector() &&
                getSubCounty4Sector() == that.getSubCounty4Sector() &&
                getDistrict5Sector() == that.getDistrict5Sector() &&
                getSubCounty5Sector() == that.getSubCounty5Sector() &&
                getDistrict6Sector() == that.getDistrict6Sector() &&
                getSubCounty6Sector() == that.getSubCounty6Sector() &&
                getDistrict7Sector() == that.getDistrict7Sector() &&
                getSubCounty7Sector() == that.getSubCounty7Sector() &&
                isStoredLocally() == that.isStoredLocally() &&
                Objects.equals(getFinancialYear(), that.getFinancialYear()) &&
                Objects.equals(getDistrictName(), that.getDistrictName()) &&
                Objects.equals(getServiceName(), that.getServiceName()) &&
                Objects.equals(getCommunityWishName(), that.getCommunityWishName()) &&
                Objects.equals(getFinancialYear1Sector(), that.getFinancialYear1Sector()) &&
                Objects.equals(getService1Sector(), that.getService1Sector()) &&
                Objects.equals(getCommunityWishes1Sector(), that.getCommunityWishes1Sector()) &&
                Objects.equals(getFinancialYear2Sector(), that.getFinancialYear2Sector()) &&
                Objects.equals(getService2Sector(), that.getService2Sector()) &&
                Objects.equals(getCommunityWishes2Sector(), that.getCommunityWishes2Sector()) &&
                Objects.equals(getFinancialYear3Sector(), that.getFinancialYear3Sector()) &&
                Objects.equals(getService3Sector(), that.getService3Sector()) &&
                Objects.equals(getCommunityWishes3Sector(), that.getCommunityWishes3Sector()) &&
                Objects.equals(getFinancialYear4Sector(), that.getFinancialYear4Sector()) &&
                Objects.equals(getService4Sector(), that.getService4Sector()) &&
                Objects.equals(getCommunityWishes4Sector(), that.getCommunityWishes4Sector()) &&
                Objects.equals(getFinancialYear5Sector(), that.getFinancialYear5Sector()) &&
                Objects.equals(getService5Sector(), that.getService5Sector()) &&
                Objects.equals(getCommunityWishes5Sector(), that.getCommunityWishes5Sector()) &&
                Objects.equals(getFinancialYear6Sector(), that.getFinancialYear6Sector()) &&
                Objects.equals(getService6Sector(), that.getService6Sector()) &&
                Objects.equals(getCommunityWishes6Sector(), that.getCommunityWishes6Sector()) &&
                Objects.equals(getFinancialYear7Sector(), that.getFinancialYear7Sector()) &&
                Objects.equals(getService7Sector(), that.getService7Sector()) &&
                Objects.equals(getCommunityWishes7Sector(), that.getCommunityWishes7Sector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrimaryKey(), getFinancialYear(), getAdminApprovedBudget(), getAdminPercentage(), getFinanceApprovedBudget(), getFinancePercentage(), getStatutoryBodiesApprovedBudget(), getStatutoryBodiesPercentage(), getProductionApprovedBudget(), getProductionPercentage(), getHealthApprovedBudget(), getHealthPercentage(), getEducationApprovedBudget(), getEducationPercentage(), getRoadEngineeringApprovedBudget(), getRoadEngineeringPercentage(), getWaterApprovedBudget(), getWaterPercentage(), getNaturalApprovedBudget(), getNaturalPercentage(), getCommunityApprovedBudget(), getCommunityPercentage(), getPlanningApprovedBudget(), getPlanningPercentage(), getInternalApprovedBudget(), getInternalPercentage(), getTradeApprovedBudget(), getTradePercentage(), getTotalApprovedBudget(), getTotalPercentage(), getWageApprovedBudget(), getWagePercentage(), getNoneWageApprovedBudget(), getNoneWagePercentage(), getDomesticApprovedBudget(), getDomesticPercentage(), getExtApprovedBudget(), getExtPercentage(), getDistrictName(), getServiceName(), getCommunityWishName(), getDistrict1Sector(), getSubCounty1Sector(), getFinancialYear1Sector(), getService1Sector(), getCommunityWishes1Sector(), getDistrict2Sector(), getSubCounty2Sector(), getFinancialYear2Sector(), getService2Sector(), getCommunityWishes2Sector(), getDistrict3Sector(), getSubCounty3Sector(), getFinancialYear3Sector(), getService3Sector(), getCommunityWishes3Sector(), getDistrict4Sector(), getSubCounty4Sector(), getFinancialYear4Sector(), getService4Sector(), getCommunityWishes4Sector(), getDistrict5Sector(), getSubCounty5Sector(), getFinancialYear5Sector(), getService5Sector(), getCommunityWishes5Sector(), getDistrict6Sector(), getSubCounty6Sector(), getFinancialYear6Sector(), getService6Sector(), getCommunityWishes6Sector(), getDistrict7Sector(), getSubCounty7Sector(), getFinancialYear7Sector(), getService7Sector(), getCommunityWishes7Sector(), isStoredLocally());
    }

    @Ignore
    public BudgetInformationForm(){}
}
