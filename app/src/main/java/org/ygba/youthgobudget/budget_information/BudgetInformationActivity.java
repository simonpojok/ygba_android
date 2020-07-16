package org.ygba.youthgobudget.budget_information;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import org.ygba.youthgobudget.R;

public class BudgetInformationActivity extends AppCompatActivity {
    private Spinner financialYearSpinner;
    private EditText administrationApprovedBudgetED;
    private EditText administrationPercentageED;
    private EditText financeApprovedBudgetED;
    private EditText financePercentage;
    private EditText statutoryBodiesApprovedBudgetED;
    private EditText statutoryBodiesPercentageET;
    private EditText productionApprovedBudgetET;
    private EditText productionPercentageET;
    private EditText healthApprovedBudget;
    private EditText healthPercentageET;
    private EditText educationApprovedBudget;
    private EditText educationPercentage;
    private EditText roadEngineeringApprovedBudgetET;
    private EditText roadEngineeringPercentageET;
    private EditText waterApprovedBudgetET;
    private EditText percentageWaterET;
    private EditText approvedBudgetNaturalResourcesET;
    private EditText percentageNaturalResourcesET;
    private EditText extFinancingPercentageET;
    private EditText extApprovedBudgetET;
    private EditText domesticApprovedBudgetET;
    private EditText domesticPercentageET;
    private EditText recurrentPercentageET;
    private EditText recurrentApprovedBudgetET;
    private EditText wagesPercentageET;
    private EditText wagesApprovedBudget;
    private EditText totalPercentage;
    private EditText totalApprovedBudget;
    private EditText tradePercentageET;
    private EditText tradeApprovedBudgetET;
    private EditText percentageInternalAuditET;
    private EditText internalAuditApprovedBudgetET;
    private EditText planningPercentageET;
    private EditText planningApprovedBudgetET;
    private EditText communityApprovedBudgetET;
    private EditText communityPercentageET;

    private Spinner districtSectorSpinner;
    private Spinner financialYearSectorSpinner;
    private Spinner serviceSectorSpinner;
    private Spinner communityNeedsSpinner;

    private EditText district1;
    private EditText subcounty1;
    private EditText financialYear1;
    private EditText service1;
    private EditText communityNeed1;

    private EditText district2;
    private EditText subcounty2;
    private EditText financialYear2;
    private EditText service2;
    private EditText communityNeed2;

    private EditText district3;
    private EditText subcounty3;
    private EditText financialYear3;
    private EditText service3;
    private EditText communityNeed3;

    private EditText district4;
    private EditText subcounty4;
    private EditText financialYear4;
    private EditText service4;
    private EditText communityNeed4;

    private EditText district5;
    private EditText subcounty5;
    private EditText financialYear5;
    private EditText service5;
    private EditText communityNeed5;

    private EditText district6;
    private EditText subcounty6;
    private EditText financialYear6;
    private EditText service6;
    private EditText communityNeed6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_information);

        initViews();
    }

    private void initViews() {
        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        administrationApprovedBudgetED = findViewById(R.id.approved_budget_administration);
        administrationPercentageED = findViewById(R.id.percentage_administration);
        financeApprovedBudgetED = findViewById(R.id.approved_budget_finance);
        financePercentage = findViewById(R.id.percentage_finance);
        statutoryBodiesApprovedBudgetED = findViewById(R.id.approved_budget_statutory_bodies);
        statutoryBodiesPercentageET = findViewById(R.id.percentage_statutory_bodies);
        productionApprovedBudgetET = findViewById(R.id.approved_budget_production);
        productionPercentageET = findViewById(R.id.percentage_production);
        healthApprovedBudget = findViewById(R.id.approved_budget_health);
        healthPercentageET = findViewById(R.id.percentage_health);
        educationApprovedBudget = findViewById(R.id.approved_budget_education);
        educationPercentage = findViewById(R.id.percentage_education);
        roadEngineeringApprovedBudgetET = findViewById(R.id.approved_budget_road_engineering);
        roadEngineeringPercentageET = findViewById(R.id.percentage_road_engineering);
        waterApprovedBudgetET = findViewById(R.id.approved_budget_water);
        percentageWaterET = findViewById(R.id.percentage_water);
        approvedBudgetNaturalResourcesET = findViewById(R.id.approved_budget_natural_resources);
        percentageNaturalResourcesET = findViewById(R.id.percentage_natural_resources);
        extFinancingPercentageET = findViewById(R.id.percentage_ext);
        extApprovedBudgetET = findViewById(R.id.approved_budget_ext);
        domesticApprovedBudgetET = findViewById(R.id.approved_budget_domestic);
        domesticPercentageET = findViewById(R.id.percentage_domestic);
        recurrentPercentageET = findViewById(R.id.percentage_recurrent);
        recurrentApprovedBudgetET = findViewById(R.id.approved_budget_recurrent);
        wagesPercentageET = findViewById(R.id.percentage_wage);
        wagesApprovedBudget = findViewById(R.id.approved_budget_wage);
        totalPercentage = findViewById(R.id.percentage_total);
        totalApprovedBudget = findViewById(R.id.approved_budget_total);
        tradePercentageET = findViewById(R.id.percentage_trade);
        tradeApprovedBudgetET = findViewById(R.id.approved_budget_trade);
        percentageInternalAuditET = findViewById(R.id.percentage_internal_audit);
        internalAuditApprovedBudgetET = findViewById(R.id.approved_budget_internal_audit);
        planningPercentageET = findViewById(R.id.percentage_planning);
        planningApprovedBudgetET = findViewById(R.id.approved_budget_planning);
        communityApprovedBudgetET = findViewById(R.id.approved_budget_community_based);
        communityPercentageET = findViewById(R.id.percentage_community_based);
        districtSectorSpinner = findViewById(R.id.district_sector_spinner);
        financialYearSectorSpinner = findViewById(R.id.financial_sector_spinner);
        serviceSectorSpinner = findViewById(R.id.sector_sector_spinner);
        communityNeedsSpinner = findViewById(R.id.community_needs_sector_spinner);

        district1 = findViewById(R.id.district_1);
        subcounty1 = findViewById(R.id.subcounty_1);
        financialYear1 = findViewById(R.id.financial_year_1);
        service1 = findViewById(R.id.service_1);
        communityNeed1 = findViewById(R.id.community_need_1);

        district2 = findViewById(R.id.district_2);
        subcounty2 = findViewById(R.id.subcounty_2);
        financialYear2 = findViewById(R.id.financial_year_2);
        service2 = findViewById(R.id.service_2);
        communityNeed2 = findViewById(R.id.community_need_2);

        district3 = findViewById(R.id.district_3);
        subcounty3 = findViewById(R.id.subcounty_3);
        financialYear3 = findViewById(R.id.financial_year_3);
        service3 = findViewById(R.id.service_3);
        communityNeed3 = findViewById(R.id.community_need_3);

        district4 = findViewById(R.id.district_4);
        subcounty4 = findViewById(R.id.subcounty_4);
        financialYear4 = findViewById(R.id.financial_year_4);
        service4 = findViewById(R.id.service_4);
        communityNeed4 = findViewById(R.id.community_need_4);

        district5 = findViewById(R.id.district_5);
        subcounty5 = findViewById(R.id.subcounty_5);
        financialYear5 = findViewById(R.id.financial_year_5);
        service5 = findViewById(R.id.service_5);
        communityNeed5 = findViewById(R.id.community_need_5);

        district6 = findViewById(R.id.district_6);
        subcounty6 = findViewById(R.id.subcounty_6);
        financialYear6 = findViewById(R.id.financial_year_6);
        service6 = findViewById(R.id.service_6);
        communityNeed6 = findViewById(R.id.community_need_6);
    }
}