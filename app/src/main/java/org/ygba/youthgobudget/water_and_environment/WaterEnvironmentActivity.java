package org.ygba.youthgobudget.water_and_environment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;
import org.ygba.youthgobudget.utils.DynamicData;

import java.util.List;

public class WaterEnvironmentActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener, Validator.ValidationListener {
    private TextView waterDateTextView;
    private Spinner waterFinancialYearSpinner;

    @NotEmpty
    private EditText waterDistrictEditText;

    @NotEmpty
    private EditText waterVillageEditText;

    @NotEmpty
    private EditText wParishEditText;

    @NotEmpty
    private EditText wDivisionET;

    @NotEmpty
    private EditText wAgentFullName;

    @NotEmpty
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
    private EditText wQ5TextEdit;
    private EditText wQ6EditText;

    private EditText wQ61Village1EditText;
    private EditText wQ61Wetland1EditText;

    private EditText wQ61Village2EditText;
    private EditText wQ61Wetland2EditText;

    private EditText wQ61Village3EditText;
    private EditText wQ61Wetland3EditText;

    private EditText wQ61Village4EditText;
    private EditText wQ61Wetland4EditText;

    private EditText wQ61Village5EditText;
    private EditText wQ61Wetland5EditText;

    private EditText wQ61Village6EditText;
    private EditText wQ61Wetland6EditText;


    private EditText wQ62EditText;
    private WaterEnvironmentViewModel viewModel;

    private final String[] financialYears = {"I", "II", "III", "IV", "V", "VI", "VII"};
    private String selectedFinancialYear;
    private Validator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_environment);
        viewModel = new ViewModelProvider(this).get(WaterEnvironmentViewModel.class);
        validator = new Validator(this);
        validator.setValidationListener(this);
        initViews();
        populateViews();

        viewModel.getAllWaterEnvironmentQuestions().observe(this, new Observer<List<WaterEnvironmentQuestion>>() {
            @Override
            public void onChanged(List<WaterEnvironmentQuestion> waterEnvironmentQuestions) {
//                if (waterEnvironmentQuestions != null ) {
//                    if (waterEnvironmentQuestions.size() > 0 ) {
//                        TextView textView = findViewById(R.id.display_data);
//                        textView.setVisibility(View.VISIBLE);
//                        textView.setText(waterEnvironmentQuestions.get(0).toString());
//                    }
//                }
            }
        });
    }

    private void initViews() {
        waterDateTextView = findViewById(R.id.water_date_text_view);
        waterFinancialYearSpinner = findViewById(R.id.water_financial_year_spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, financialYears);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        waterFinancialYearSpinner.setAdapter(aa);
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

        wQ5TextEdit = findViewById(R.id.water_question_5_edit_text);
        wQ6EditText = findViewById(R.id.water_question_6_edit_text);

        wQ61Village1EditText = findViewById(R.id.water_question_6_1_edit_text);
        wQ61Wetland1EditText = findViewById(R.id.water_question_6_wetland_1_edit_text);

        wQ61Village2EditText = findViewById(R.id.water_question_6_2_edit_text);
        wQ61Wetland2EditText = findViewById(R.id.water_question_6_wetland_2_edit_text);

        wQ61Village3EditText = findViewById(R.id.water_question_6_3_edit_text);
        wQ61Wetland3EditText = findViewById(R.id.water_question_6_wetland_3_edit_text);

        wQ61Village4EditText = findViewById(R.id.water_question_6_4_edit_text);
        wQ61Wetland4EditText = findViewById(R.id.water_question_6_wetland_4_edit_text);

        wQ61Village5EditText = findViewById(R.id.water_question_6_5_edit_text);
        wQ61Wetland5EditText = findViewById(R.id.water_question_6_wetland_5_edit_text);

        wQ61Village6EditText = findViewById(R.id.water_question_6_6_edit_text);
        wQ61Wetland6EditText = findViewById(R.id.water_question_6_wetland_6_edit_text);

        wQ62EditText = findViewById(R.id.water_question_6__edit_text);

        findViewById(R.id.saved_form_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });
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
    private boolean getQuestionQ5ObjectiveAnswer(){
        return ((RadioGroup) findViewById(R.id.water_question_5_radio_group)).getCheckedRadioButtonId() == R.id.water_question_5_yes;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        selectedFinancialYear = financialYears[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        selectedFinancialYear = "";
    }

    @Override
    public void onValidationSucceeded() {
        WaterEnvironmentQuestion waterEnvironmentQuestion = new WaterEnvironmentQuestion.Builder()
                .setFinancialYear(selectedFinancialYear)
                .setDate(DynamicData.getDate())
                .setDistrict(getStringValue(waterDistrictEditText))
                .setVillage(getStringValue(waterVillageEditText))
                .setParish(getStringValue(wParishEditText))
                .setDivision(getStringValue(wDivisionET))
                .setAgentFullName(getStringValue(wAgentFullName))
                .setAgentTel(getStringValue(wAgentTelNumber))
                .setQuestion1Objective(getQuestionQ1ObjectiveAnswer())
                .setQuestion1Reason(getStringValue(wQ1ObjectiveReasonET))
                .setQuestion2LongAnswer(getStringValue(wQ2EditText))
                .setQuestion3ObjectiveAnswer(getQuestionQ3ObjectiveAnswer())
                .setQuestion4LongAnswer(getStringValue(wQ4EditText))
                .setQuestion5LongText("some text")


                .setQuestion5Area1(getStringValue(wQ5Area1EditText))
                .setQuestion5WaterSource1(getStringValue(wQ5WaterSource1EditText))
                .setQuestion5Functional1(getIntegerValue(wQ5Functional1EditText))
                .setNonFunctional1(getIntegerValue(wQ5NoneFunctional6EditText))
                .setQuestion5NoWaterSourceAvailable(getIntegerValue(wQ5NoWaterSource1EditText))

                .setQuestion5Area2(getStringValue(wQ5Area2EditText))
                .setQuestion5WaterSource2(getStringValue(wQ5WaterSource2EditText))
                .setQuestion5Functional2(getIntegerValue(wQ5Functional2EditText))
                .setNonFunctional2(getIntegerValue(wQ5NoneFunctional1EditText))
                .setQuestion5NoWaterSourceAvailable2(getIntegerValue(wQ5NoWaterSource2EditText))

                .setQuestion5Area3(getStringValue(wQ5Area3EditText))
                .setQuestion5WaterSource3(getStringValue(wQ5WaterSource3EditText))
                .setQuestion5Functional3(getIntegerValue(wQ5Functional3EditText))
                .setNonFunctional3(getIntegerValue(wQ5NoneFunctional2EditText))
                .setQuestion5NoWaterSourceAvailable3(getIntegerValue(wQ5NoWaterSource3EditText))

                .setQuestion5Area4(getStringValue(wQ5Area4EditText))
                .setQuestion5WaterSource4(getStringValue(wQ5WaterSource4EditText))
                .setQuestion5Functional4(getIntegerValue(wQ5Functional4EditText))
                .setQuestion5Functional4(getIntegerValue(wQ5Functional4EditText))
                .setNonFunctional4(getIntegerValue(wQ5NoneFunctional4EditText))
                .setQuestion5NoWaterSourceAvailable4(getIntegerValue(wQ5NoWaterSource4EditText))

                .setQuestion5Area5(getStringValue(wQ5Area5EditText))
                .setQuestion5WaterSource5(getStringValue(wQ5WaterSource5EditText))
                .setQuestion5Functional5(getIntegerValue(wQ5Functional5EditText))
                .setNonFunctional5(getIntegerValue(wQ5NoneFunctional5EditText))
                .setQuestion5NoWaterSourceAvailable5(getIntegerValue(wQ5NoWaterSource5EditText))

                .setQuestion5Area6(getStringValue(wQ5Area6EditText))
                .setQuestion5WaterSource6(getStringValue(wQ5WaterSource6EditText))
                .setQuestion5Functional6(getIntegerValue(wQ5Functional6EditText))
                .setNonFunctional6(getIntegerValue(wQ5NoneFunctional6EditText))
                .setQuestion5NoWaterSourceAvailable6(getIntegerValue(wQ5NoWaterSource6EditText))

                .setQuestion5Objective(getQuestionQ5ObjectiveAnswer())
                .setQuestion5ObjectiveReason(getStringValue(wQ5TextEdit))
                .setQuestion6WetlandDemarcated(getStringValue(wQ6EditText))

                .setQuestion6SubCounty1(getStringValue(wQ61Village1EditText))
                .setQuestion6WetlandUnderDestruction1(getIntegerValue(wQ61Wetland1EditText))

                .setQuestion6SubCounty2(getStringValue(wQ61Village2EditText))
                .setQuestion6WetlandUnderDestruction2(getIntegerValue(wQ61Wetland2EditText))

                .setQuestion6SubCounty3(getStringValue(wQ61Village3EditText))
                .setQuestion6WetlandUnderDestruction3(getIntegerValue(wQ61Wetland3EditText))

                .setQuestion6SubCounty4(getStringValue(wQ61Village4EditText))
                .setQuestion6WetlandUnderDestruction4(getIntegerValue(wQ61Wetland4EditText))

                .setQuestion6SubCounty5(getStringValue(wQ61Village5EditText))
                .setQuestion6WetlandUnderDestruction5(getIntegerValue(wQ61Wetland5EditText))

                .setQuestion6SubCounty6(getStringValue(wQ61Village6EditText))
                .setQuestion6WetlandUnderDestruction6(getIntegerValue(wQ61Wetland6EditText))

                .setQuestion62TreePlanting(getStringValue(wQ62EditText))

                .build();

        viewModel.saveWaterEnvironmentQuestion(waterEnvironmentQuestion);
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error: errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);
            if (view instanceof EditText) {
                ( (EditText) view).setError(message);
            }
        }
    }

    private int getIntegerValue(EditText editText) {
        return Integer.parseInt(editText.getText().toString());
    }

    private String getStringValue(EditText editText) {
        return  editText.getText().toString();
    }

    private String getStringValue(TextView textView) {
        return  textView.getText().toString();
    }
}