package org.ygba.youthgobudget.water_and_environment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.utils.DynamicData;

public class WaterEnvironmentActivity extends AppCompatActivity {
    private TextView waterDateTextView;
    private Spinner waterFinancialYearSpinner;
    private EditText waterDistrictEditText;
    private EditText waterVillageEditText;
    private EditText wParishEditText;
    private EditText wDivisionET;
    private EditText wAgentFullName;
    private EditText wAgentTelNumber;
    private EditText wAgentNumberET;
    private EditText wQ1ObjectiveReasonET;
    private EditText wQ2EditText;
    private EditText wQ4EditText;
    private EditText wQ5Area1EditText;
    private EditText wQ5WaterSource1EditText;
    private EditText wQ5Functional1EditText;
    private EditText wQ5NoneFunctional1EditText;
    private EditText wQ5NoWaterSource1EditText;
    private EditText wQ5Area2EditText;
    private EditText wQ5WaterSource2EditText;
    private EditText wQ5Functional2EditText;
    private EditText wQ5NoneFunctional2EditText;
    private EditText wQ5NoWaterSource2EditText;

    private EditText wQ5Area3EditText;
    private EditText wQ5WaterSource3EditText;
    private EditText wQ5Functional3EditText;
    private EditText wQ5NoneFunctional3EditText;
    private EditText wQ5NoWaterSource3EditText;

    private EditText wQ5Area4EditText;
    private EditText wQ5WaterSource4EditText;
    private EditText wQ5Functional4EditText;
    private EditText wQ5NoneFunctional4EditText;
    private EditText wQ5NoWaterSource4EditText;

    private EditText wQ5Area5EditText;
    private EditText wQ5WaterSource5EditText;
    private EditText wQ5Functional5EditText;
    private EditText wQ5NoneFunctional5EditText;
    private EditText wQ5NoWaterSource5EditText;

    private EditText wQ5Area6EditText;
    private EditText wQ5WaterSource6EditText;
    private EditText wQ5Functional6EditText;
    private EditText wQ5NoneFunctional6EditText;
    private EditText wQ5NoWaterSource6EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_environment);
        initViews();
        populateViews();
    }

    private void initViews() {
        waterDateTextView = findViewById(R.id.water_date_text_view);
        waterFinancialYearSpinner = findViewById(R.id.water_financial_year_spinner);
        waterVillageEditText = findViewById(R.id.water_village_text_edit);
        waterDistrictEditText = findViewById(R.id.water_district_text_edit);
        wParishEditText = findViewById(R.id.water_parish_text_edit);
        wDivisionET = findViewById(R.id.water_division_text_edit);
        wAgentFullName = findViewById(R.id.ygb_agent_name_edit_view);
        wAgentTelNumber = findViewById(R.id.ygb_agent_tel_edit_view);
        wAgentNumberET = findViewById(R.id.ygb_agent_no_edit_view);
        wQ1ObjectiveReasonET = findViewById(R.id.water_question_1_if_no);
        wQ2EditText = findViewById(R.id.water_question_2_edit_text);
        wQ4EditText = findViewById(R.id.water_question_4_edit_text);
        wQ5Area1EditText = findViewById(R.id.water_question_5_1_area_edit_text);
        wQ5WaterSource1EditText = findViewById(R.id.water_question_5_1_water_source_edit_text);
        wQ5Functional1EditText = findViewById(R.id.water_question_5_1_functional_edit_text);
        wQ5NoneFunctional1EditText = findViewById(R.id.water_question_5_1_none_functional_edit_text);
        wQ5NoWaterSource1EditText = findViewById(R.id.water_question_5_1_no_water_source_edit_text);

        wQ5Area2EditText = findViewById(R.id.water_question_5_1_area_2_edit_text);
        wQ5WaterSource2EditText = findViewById(R.id.water_question_5_1_water_source_2_edit_text);
        wQ5Functional2EditText = findViewById(R.id.water_question_5_1_functional_2_edit_text);
        wQ5NoneFunctional2EditText = findViewById(R.id.water_question_5_1_none_functional_2_edit_text);
        wQ5NoWaterSource2EditText = findViewById(R.id.water_question_5_1_no_water_source_2_edit_text);

        wQ5Area3EditText = findViewById(R.id.water_question_5_1_area_3_edit_text);
        wQ5WaterSource3EditText = findViewById(R.id.water_question_5_1_water_source_3_edit_text);
        wQ5Functional3EditText = findViewById(R.id.water_question_5_1_functional_3_edit_text);
        wQ5NoneFunctional3EditText = findViewById(R.id.water_question_5_1_none_functional_3_edit_text);
        wQ5NoWaterSource3EditText = findViewById(R.id.water_question_5_1_no_water_source_3_edit_text);

        wQ5Area4EditText = findViewById(R.id.water_question_5_1_area_4_edit_text);
        wQ5WaterSource4EditText = findViewById(R.id.water_question_5_1_water_source_4_edit_text);
        wQ5Functional4EditText = findViewById(R.id.water_question_5_1_functional_4_edit_text);
        wQ5NoneFunctional4EditText = findViewById(R.id.water_question_5_1_none_functional_4_edit_text);
        wQ5NoWaterSource4EditText = findViewById(R.id.water_question_5_1_no_water_source_4_edit_text);

        wQ5Area5EditText = findViewById(R.id.water_question_5_1_area_5_edit_text);
        wQ5WaterSource5EditText = findViewById(R.id.water_question_5_1_water_source_5_edit_text);
        wQ5Functional5EditText = findViewById(R.id.water_question_5_1_functional_5_edit_text);
        wQ5NoneFunctional5EditText = findViewById(R.id.water_question_5_1_none_functional_5_edit_text);
        wQ5NoWaterSource5EditText = findViewById(R.id.water_question_5_1_no_water_source_5_edit_text);

        wQ5Area6EditText = findViewById(R.id.water_question_5_1_area_6_edit_text);
        wQ5WaterSource6EditText = findViewById(R.id.water_question_5_1_water_source_6_edit_text);
        wQ5Functional6EditText = findViewById(R.id.water_question_5_1_functional_6_edit_text);
        wQ5NoneFunctional6EditText = findViewById(R.id.water_question_5_1_none_functional_6_edit_text);
        wQ5NoWaterSource6EditText = findViewById(R.id.water_question_5_1_no_water_source_6_edit_text);
    }

    private void populateViews() {
        waterDateTextView.setText(DynamicData.getDate());
        // init spinner
        wAgentFullName.setText(DynamicData.getAgentName());
        wAgentTelNumber.setText(DynamicData.getTelNumber());
        wAgentNumberET.setText(DynamicData.getAgentName());
    }

    private boolean getQuestionQ1ObjectiveAnswer(){
        return ((RadioGroup) findViewById(R.id.water_question_1_radio_group)).getCheckedRadioButtonId() == R.id.water_question_1_yes;
    }
    private boolean getQuestionQ3ObjectiveAnswer(){
        return ((RadioGroup) findViewById(R.id.water_question_3_radio_group)).getCheckedRadioButtonId() == R.id.water_question_3_yes;
    }
}