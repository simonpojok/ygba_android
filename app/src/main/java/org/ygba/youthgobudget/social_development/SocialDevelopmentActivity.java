package org.ygba.youthgobudget.social_development;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.*;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;
import org.ygba.youthgobudget.utils.DynamicData;

import java.util.List;

public class SocialDevelopmentActivity extends AppCompatActivity implements Validator.ValidationListener,
        AdapterView.OnItemSelectedListener {
    private final int OTHER_DATE_WITHDRAWN_REQUEST_CODE = 1;
    private final int OTHER_DATE_RECEIVED_REQUEST_CODE = 2;
    private final int COMMUNITY_DATE_RECEIVED_REQUEST_CODE = 4;
    private final int COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE = 5;
    private SocialDevelopmentActivityViewModel activityViewModel;
    private TextView socialDateTextView;

    private Spinner financialYearSpinner;

    @NotEmpty
    private EditText villageTextEdit;

    @NotEmpty
    private EditText parishTextEdit;

    @NotEmpty
    private EditText districtTextEdit;

    @NotEmpty
    private EditText divisionTextEdit;

    @NotEmpty
    private EditText fullNameTextEdit;

    @NotEmpty
    private EditText agentTelEditText;
    private EditText communityExpectedAmountEditText;
    private EditText communityReceivedAmountEditText;
    private EditText communityDateReceivedEditText;
    private EditText comDateWithdrawnEditText;
    private EditText otherExpectedAmountEditText;
    private EditText otherReceivedAmountEditText;
    private EditText otherDateReceivedEditText;
    private EditText otherDateWithdrawnEditText;
    private RadioGroup socialQn3RadioGroup;
    private EditText socialQuestion3EditText;
    private EditText sQuestion3GroupName1;
    private EditText sQuestion3GroupVillage1;
    private EditText sQuestion3GroupNumberFemales1;
    private EditText sQuestion3GroupNumberMales1;
    private EditText sQuestion3GroupAmountReceived1;
    private EditText sQuestion3GroupName2;
    private EditText sQuestion3GroupVillage2;
    private EditText sQuestion3GroupNumberFemales2;
    private EditText sQuestion3GroupNumberMales2;
    private EditText sQuestion3GroupAmountReceived2;
    private EditText sQuestion3GroupName3;
    private EditText sQuestion3GroupVillage3;
    private EditText sQuestion3GroupNumberFemales3;
    private EditText sQuestion3GroupNumberMales3;
    private EditText sQuestion3GroupAmountReceived3;
    private EditText sQuestion3GroupName4;
    private EditText sQuestion3GroupVillage4;
    private EditText sQuestion3GroupNumberFemales4;
    private EditText sQuestion3GroupNumberMales4;
    private EditText sQuestion3GroupAmountReceived4;
    private EditText sQuestion3GroupName5;
    private EditText sQuestion3GroupVillage5;
    private EditText sQuestion3GroupNumberFemales5;
    private EditText sQuestion3GroupNumberMales5;
    private EditText sQuestion3GroupAmountReceived5;
    private EditText sQuestion3GroupName6;
    private EditText sQuestion3GroupVillage6;
    private EditText sQuestion3GroupNumberFemales6;
    private EditText sQuestion3GroupNumberMales6;
    private EditText sQuestion3GroupAmountReceived6;
    private EditText sQuestion3GroupName7;
    private EditText sQuestion3GroupVillage7;
    private EditText sQuestion3GroupNumberFemales7;
    private EditText sQuestion3GroupNumberMales7;
    private EditText sQuestion3GroupAmountReceived7;
    private RadioGroup socialQn4RadioGroup;
    private EditText sQ4YouthList;

    // youth groups
    private EditText sQuestion4GroupName1;
    private EditText sQuestion4GroupVillage1;
    private EditText sQuestion4GroupNumberFemales1;
    private EditText sQuestion4GroupNumberMales1;
    private EditText sQuestion4GroupAmountReceived1;
    private EditText sQuestion4GroupName2;
    private EditText sQuestion4GroupVillage2;
    private EditText sQuestion4GroupNumberFemales2;
    private EditText sQuestion4GroupNumberMales2;
    private EditText sQuestion4GroupAmountReceived2;
    private EditText sQuestion4GroupName3;
    private EditText sQuestion4GroupVillage3;
    private EditText sQuestion4GroupNumberFemales3;
    private EditText sQuestion4GroupNumberMales3;
    private EditText sQuestion4GroupAmountReceived3;
    private EditText sQuestion4GroupName4;
    private EditText sQuestion4GroupVillage4;
    private EditText sQuestion4GroupNumberFemales4;
    private EditText sQuestion4GroupNumberMales4;
    private EditText sQuestion4GroupAmountReceived4;
    private EditText sQuestion4GroupName5;
    private EditText sQuestion4GroupVillage5;
    private EditText sQuestion4GroupNumberFemales5;
    private EditText sQuestion4GroupNumberMales5;
    private EditText sQuestion4GroupAmountReceived5;
    private EditText sQuestion4GroupName6;
    private EditText sQuestion4GroupVillage6;
    private EditText sQuestion4GroupNumberFemales6;
    private EditText sQuestion4GroupNumberMales6;
    private EditText sQuestion4GroupAmountReceived6;
    private EditText sQuestion4GroupName7;
    private EditText sQuestion4GroupVillage7;
    private EditText sQuestion4GroupNumberFemales7;
    private EditText sQuestion4GroupNumberMales7;
    private EditText sQuestion4GroupAmountReceived7;
    private EditText sQuestion5NumberMaleTrained;
    private EditText sQuestion5NumberFemaleTrained;
    private EditText sQuestion6NumberCommunityGroupsTrained;
    private EditText sQuestion7ChallengerObservations;
    private CardView saveFormData;
    private Validator validator;

    private final String[] financialYears = {"I", "II", "III", "IV", "V", "VI", "VII"};
    private String selectedFinancialYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_development);
        activityViewModel = new ViewModelProvider(this).get(SocialDevelopmentActivityViewModel.class);

        validator = new Validator(this);
        validator.setValidationListener(this);

        initViews();

        setOnClickListeners();
        activityViewModel.getAllSocialDevelopmentQuestions().observe(this, new Observer<List<SocialDevelopmentQuestion>>() {
            @Override
            public void onChanged(List<SocialDevelopmentQuestion> socialDevelopmentQuestions) {
                Toast.makeText(SocialDevelopmentActivity.this, "Size is " + String.valueOf(socialDevelopmentQuestions.size()), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setOnClickListeners() {
        otherDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), OTHER_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });

        otherDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), OTHER_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        communityDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), COMMUNITY_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        comDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });

        saveFormData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });
    }

    private void initViews() {
        districtTextEdit = findViewById(R.id.district_text_edit);
        socialDateTextView = findViewById(R.id.social_date_text_view);
        financialYearSpinner = findViewById(R.id.quarter_spinner);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, financialYears);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        financialYearSpinner.setAdapter(aa);
        villageTextEdit = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionTextEdit = findViewById(R.id.division_text_edit);
        fullNameTextEdit = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        communityExpectedAmountEditText = findViewById(R.id.community_expected_amount_edit_text);
        communityReceivedAmountEditText = findViewById(R.id.community_received_amount_edit_text);
        communityDateReceivedEditText = findViewById(R.id.community_date_received_edit_text);
        communityDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        comDateWithdrawnEditText = findViewById(R.id.community_date_withdrawn_edit_text);
        comDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        otherExpectedAmountEditText = findViewById(R.id.other_expected_amount_edit_text);
        otherReceivedAmountEditText = findViewById(R.id.other_received_amount_edit_text);
        otherDateReceivedEditText = findViewById(R.id.other_date_received_edit_text);
        otherDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        otherDateWithdrawnEditText =  findViewById(R.id.other_date_withdrawn_edit_text);
        otherDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        socialQn3RadioGroup = findViewById(R.id.social_qn_3_radio_group);
        socialQuestion3EditText = findViewById(R.id.social_q_3_women_list);
        sQuestion3GroupName1 = findViewById(R.id.social_q_3_women_group_name_1);
        sQuestion3GroupVillage1 = findViewById(R.id.social_q_3_women_group_village_1);
        sQuestion3GroupNumberFemales1 = findViewById(R.id.social_q_3_women_group_number_females_1);
        sQuestion3GroupNumberMales1 = findViewById(R.id.social_q_3_women_group_number_males_1);
        sQuestion3GroupAmountReceived1 = findViewById(R.id.social_q_3_women_group_amount_received_1);
        sQuestion3GroupName2 = findViewById(R.id.social_q_3_women_group_name_2);
        sQuestion3GroupVillage2 = findViewById(R.id.social_q_3_women_group_village_2);
        sQuestion3GroupNumberFemales2 = findViewById(R.id.social_q_3_women_group_number_females_2);
        sQuestion3GroupNumberMales2 = findViewById(R.id.social_q_3_women_group_number_males_2);
        sQuestion3GroupAmountReceived2 = findViewById(R.id.social_q_3_women_group_amount_received_2);
        sQuestion3GroupName3 = findViewById(R.id.social_q_3_women_group_name_3);
        sQuestion3GroupVillage3 = findViewById(R.id.social_q_3_women_group_village_3);
        sQuestion3GroupNumberFemales3 = findViewById(R.id.social_q_3_women_group_number_females_3);
        sQuestion3GroupNumberMales3 = findViewById(R.id.social_q_3_women_group_number_males_3);
        sQuestion3GroupAmountReceived3 = findViewById(R.id.social_q_3_women_group_amount_received_3);
        sQuestion3GroupName4 = findViewById(R.id.social_q_3_women_group_name_4);
        sQuestion3GroupVillage4 = findViewById(R.id.social_q_3_women_group_village_4);
        sQuestion3GroupNumberFemales4 = findViewById(R.id.social_q_3_women_group_number_females_4);
        sQuestion3GroupNumberMales4 = findViewById(R.id.social_q_3_women_group_number_males_4);
        sQuestion3GroupAmountReceived4 = findViewById(R.id.social_q_3_women_group_amount_received_4);
        sQuestion3GroupName5 = findViewById(R.id.social_q_3_women_group_name_5);
        sQuestion3GroupVillage5 = findViewById(R.id.social_q_3_women_group_village_5);
        sQuestion3GroupNumberFemales5 = findViewById(R.id.social_q_3_women_group_number_females_5);
        sQuestion3GroupNumberMales5 = findViewById(R.id.social_q_3_women_group_number_males_5);
        sQuestion3GroupAmountReceived5 = findViewById(R.id.social_q_3_women_group_amount_received_5);
        sQuestion3GroupName6 = findViewById(R.id.social_q_3_women_group_name_6);
        sQuestion3GroupVillage6 = findViewById(R.id.social_q_3_women_group_village_6);
        sQuestion3GroupNumberFemales6 = findViewById(R.id.social_q_3_women_group_number_females_6);
        sQuestion3GroupNumberMales6 = findViewById(R.id.social_q_3_women_group_number_males_6);
        sQuestion3GroupAmountReceived6 = findViewById(R.id.social_q_3_women_group_amount_received_6);
        sQuestion3GroupName7 = findViewById(R.id.social_q_3_women_group_name_7);
        sQuestion3GroupVillage7 = findViewById(R.id.social_q_3_women_group_village_7);
        sQuestion3GroupNumberFemales7 = findViewById(R.id.social_q_3_women_group_number_females_7);
        sQuestion3GroupNumberMales7 = findViewById(R.id.social_q_3_women_group_number_males_7);
        sQuestion3GroupAmountReceived7 = findViewById(R.id.social_q_3_women_group_amount_received_7);
        socialQn4RadioGroup = findViewById(R.id.social_qn_4_radio_group);
        sQ4YouthList = findViewById(R.id.social_q_4_youth_list);

        // youth groups
        sQuestion4GroupName1 = findViewById(R.id.social_q_3_youth_group_name_1);
        sQuestion4GroupVillage1 = findViewById(R.id.social_q_3_youth_group_village_1);
        sQuestion4GroupNumberFemales1 = findViewById(R.id.social_q_3_youth_group_number_females_1);
        sQuestion4GroupNumberMales1 = findViewById(R.id.social_q_3_youth_group_number_males_1);
        sQuestion4GroupAmountReceived1 = findViewById(R.id.social_q_3_youth_group_amount_received_1);
        sQuestion4GroupName2 = findViewById(R.id.social_q_3_youth_group_name_2);
        sQuestion4GroupVillage2 = findViewById(R.id.social_q_3_youth_group_village_2);
        sQuestion4GroupNumberFemales2 = findViewById(R.id.social_q_3_youth_group_number_females_2);
        sQuestion4GroupNumberMales2 = findViewById(R.id.social_q_3_youth_group_number_males_2);
        sQuestion4GroupAmountReceived2 = findViewById(R.id.social_q_3_youth_group_amount_received_2);
        sQuestion4GroupName3 = findViewById(R.id.social_q_3_youth_group_name_3);
        sQuestion4GroupVillage3 = findViewById(R.id.social_q_3_youth_group_village_3);
        sQuestion4GroupNumberFemales3 = findViewById(R.id.social_q_3_youth_group_number_females_3);
        sQuestion4GroupNumberMales3 = findViewById(R.id.social_q_3_youth_group_number_males_3);
        sQuestion4GroupAmountReceived3 = findViewById(R.id.social_q_3_youth_group_amount_received_3);
        sQuestion4GroupName4 = findViewById(R.id.social_q_3_youth_group_name_4);
        sQuestion4GroupVillage4 = findViewById(R.id.social_q_3_youth_group_village_4);
        sQuestion4GroupNumberFemales4 = findViewById(R.id.social_q_3_youth_group_number_females_4);
        sQuestion4GroupNumberMales4 = findViewById(R.id.social_q_3_youth_group_number_males_4);
        sQuestion4GroupAmountReceived4 = findViewById(R.id.social_q_3_youth_group_amount_received_4);
        sQuestion4GroupName5 = findViewById(R.id.social_q_3_youth_group_name_5);
        sQuestion4GroupVillage5 = findViewById(R.id.social_q_3_youth_group_village_5);
        sQuestion4GroupNumberFemales5 = findViewById(R.id.social_q_3_youth_group_number_females_5);
        sQuestion4GroupNumberMales5 = findViewById(R.id.social_q_3_youth_group_number_males_5);
        sQuestion4GroupAmountReceived5 = findViewById(R.id.social_q_3_youth_group_amount_received_5);
        sQuestion4GroupName6 = findViewById(R.id.social_q_3_youth_group_name_6);
        sQuestion4GroupVillage6 = findViewById(R.id.social_q_3_youth_group_village_6);
        sQuestion4GroupNumberFemales6 = findViewById(R.id.social_q_3_youth_group_number_females_6);
        sQuestion4GroupNumberMales6 = findViewById(R.id.social_q_3_youth_group_number_males_6);
        sQuestion4GroupAmountReceived6 = findViewById(R.id.social_q_3_youth_group_amount_received_6);
        sQuestion4GroupName7 = findViewById(R.id.social_q_3_youth_group_name_7);
        sQuestion4GroupVillage7 = findViewById(R.id.social_q_3_youth_group_village_7);
        sQuestion4GroupNumberFemales7 = findViewById(R.id.social_q_3_youth_group_number_females_7);
        sQuestion4GroupNumberMales7 = findViewById(R.id.social_q_3_youth_group_number_males_7);
        sQuestion4GroupAmountReceived7 = findViewById(R.id.social_q_3_youth_group_amount_received_7);
        sQuestion5NumberMaleTrained = findViewById(R.id.social_q_5_male_number_trained);
        sQuestion5NumberFemaleTrained = findViewById(R.id.social_q_5_female_number_trained);
        sQuestion6NumberCommunityGroupsTrained = findViewById(R.id.social_q_5_community_groups_trained);
        sQuestion7ChallengerObservations = findViewById(R.id.social_q_7_other_challengers_observations);

        saveFormData = findViewById(R.id.saved_form_data);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((data != null) && (resultCode == RESULT_OK)) {
            switch (requestCode) {
                case OTHER_DATE_WITHDRAWN_REQUEST_CODE:
                    otherDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                case OTHER_DATE_RECEIVED_REQUEST_CODE:
                    otherDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                case COMMUNITY_DATE_RECEIVED_REQUEST_CODE:
                    communityDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                case COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE:
                    comDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                    return;

                default:
            }
        }
    }

    private boolean getQ3ObjectiveAnswer() {
        return socialQn3RadioGroup.getCheckedRadioButtonId() == R.id.social_qn_3_radio_button_yes;
    }

    private boolean getQ4ObjectiveAnswer() {
        return socialQn4RadioGroup.getCheckedRadioButtonId() == R.id.social_qn_4_radio_button_yes;
    }

    @Override
    public void onValidationSucceeded() {
        SocialDevelopmentQuestion question = new SocialDevelopmentQuestion();
        question.setFinancialYear(selectedFinancialYear);
        question.setDate(DynamicData.getDate());
        question.setDistrict(getStringValue(districtTextEdit));
        question.setVillage(getStringValue(villageTextEdit));
        question.setParish(getStringValue(parishTextEdit));
        question.setDivision(getStringValue(divisionTextEdit));
        question.setYgbaAgentFullName(getStringValue(fullNameTextEdit));
        question.setYgbaTel(getStringValue(agentTelEditText));
        question.setQ2CommunityExpected(getDoubleValue(communityExpectedAmountEditText));
        question.setQ2CommunityAmountReceived(getDoubleValue(communityReceivedAmountEditText));
        question.setQ2CommunityDateReceived(getStringValue(communityDateReceivedEditText));
        question.setQ2CommunityDateWithdrawn(getStringValue(comDateWithdrawnEditText));
        question.setQ2OtherExpectedAmount(getDoubleValue(otherExpectedAmountEditText));
        question.setQ2OtherAmountedReceived(getDoubleValue(otherExpectedAmountEditText));
        question.setQ2OthersDateReceived(getStringValue(otherDateReceivedEditText));
        question.setQ2OthersDateWithdrawn(getStringValue(otherDateWithdrawnEditText));
        question.setQ3WomenEmpowermentObjective(getQ3ObjectiveAnswer());
        question.setQ3WomenEmpowermentObjectiveReason(getStringValue(socialQuestion3EditText));

        question.setQ3WomanGroup1Name(getStringValue(sQuestion3GroupName1));
        question.setQ3WomenGroup1Village(getStringValue(sQuestion3GroupVillage1));
        question.setQ3WomenGroup1MaleNumber(getIntegerValue(sQuestion3GroupNumberMales1));
        question.setQ3WomenGroup1FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales1));
        question.setQ3WomenGroup1AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived1));

        question.setQ3WomanGroup2Name(getStringValue(sQuestion3GroupName2));
        question.setQ3WomenGroup2Village(getStringValue(sQuestion3GroupVillage2));
        question.setQ3WomenGroup2MaleNumber(getIntegerValue(sQuestion3GroupNumberMales2));
        question.setQ3WomenGroup2FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales2));
        question.setQ3WomenGroup2AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived2));

        question.setQ3WomanGroup3Name(getStringValue(sQuestion3GroupName3));
        question.setQ3WomenGroup3Village(getStringValue(sQuestion3GroupVillage3));
        question.setQ3WomenGroup3MaleNumber(getIntegerValue(sQuestion3GroupNumberMales3));
        question.setQ3WomenGroup3FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales3));
        question.setQ3WomenGroup3AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived3));

        question.setQ3WomanGroup4Name(getStringValue(sQuestion3GroupName4));
        question.setQ3WomenGroup4Village(getStringValue(sQuestion3GroupVillage4));
        question.setQ3WomenGroup4MaleNumber(getIntegerValue(sQuestion3GroupNumberMales4));
        question.setQ3WomenGroup4FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales4));
        question.setQ3WomenGroup4AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived4));

        question.setQ3WomanGroup5Name(getStringValue(sQuestion3GroupName5));
        question.setQ3WomenGroup5Village(getStringValue(sQuestion3GroupVillage5));
        question.setQ3WomenGroup5MaleNumber(getIntegerValue(sQuestion3GroupNumberMales5));
        question.setQ3WomenGroup5FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales5));
        question.setQ3WomenGroup5AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived5));

        question.setQ3WomanGroup6Name(getStringValue(sQuestion3GroupName6));
        question.setQ3WomenGroup6Village(getStringValue(sQuestion3GroupVillage6));
        question.setQ3WomenGroup6MaleNumber(getIntegerValue(sQuestion3GroupNumberMales6));
        question.setQ3WomenGroup6FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales6));
        question.setQ3WomenGroup6AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived6));

        question.setQ3WomanGroup7Name(getStringValue(sQuestion3GroupName7));
        question.setQ3WomenGroup7Village(getStringValue(sQuestion3GroupVillage7));
        question.setQ3WomenGroup7MaleNumber(getIntegerValue(sQuestion3GroupNumberMales7));
        question.setQ3WomenGroup7FemaleNumber(getIntegerValue(sQuestion3GroupNumberFemales7));
        question.setQ3WomenGroup7AmountReceived(getDoubleValue(sQuestion3GroupAmountReceived7));

        question.setQ4LivelihoodObjective(getQ4ObjectiveAnswer());
        question.setQ4LivelihoodObjectiveReason(getStringValue(sQ4YouthList));


        question.setQ4YouthGroup1Name(getStringValue(sQuestion4GroupName1));
        question.setQ4YouthGroup1Village(getStringValue(sQuestion4GroupVillage1));
        question.setQ4YouthGroup1MaleNumber(getIntegerValue(sQuestion4GroupNumberMales1));
        question.setQ4YouthGroup1FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales1));
        question.setQ4YouthGroup1AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived1));

        question.setQ4YouthGroup2Name(getStringValue(sQuestion4GroupName2));
        question.setQ4YouthGroup2Village(getStringValue(sQuestion4GroupVillage2));
        question.setQ4YouthGroup2MaleNumber(getIntegerValue(sQuestion4GroupNumberMales2));
        question.setQ4YouthGroup2FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales2));
        question.setQ4YouthGroup2AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived2));

        question.setQ4YouthGroup3Name(getStringValue(sQuestion4GroupName3));
        question.setQ4YouthGroup3Village(getStringValue(sQuestion4GroupVillage3));
        question.setQ4YouthGroup3MaleNumber(getIntegerValue(sQuestion4GroupNumberMales3));
        question.setQ4YouthGroup3FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales3));
        question.setQ4YouthGroup3AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived3));

        question.setQ4YouthGroup4Name(getStringValue(sQuestion4GroupName4));
        question.setQ4YouthGroup4Village(getStringValue(sQuestion4GroupVillage4));
        question.setQ4YouthGroup4MaleNumber(getIntegerValue(sQuestion4GroupNumberMales4));
        question.setQ4YouthGroup4FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales4));
        question.setQ4YouthGroup4AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived4));

        question.setQ4YouthGroup5Name(getStringValue(sQuestion4GroupName5));
        question.setQ4YouthGroup5Village(getStringValue(sQuestion4GroupVillage5));
        question.setQ4YouthGroup5MaleNumber(getIntegerValue(sQuestion4GroupNumberMales5));
        question.setQ4YouthGroup5FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales5));
        question.setQ4YouthGroup5AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived5));

        question.setQ4YouthGroup6Name(getStringValue(sQuestion4GroupName6));
        question.setQ4YouthGroup6Village(getStringValue(sQuestion4GroupVillage6));
        question.setQ4YouthGroup6MaleNumber(getIntegerValue(sQuestion4GroupNumberMales6));
        question.setQ4YouthGroup6FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales6));
        question.setQ4YouthGroup6AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived6));

        question.setQ4YouthGroup7Name(getStringValue(sQuestion4GroupName7));
        question.setQ4YouthGroup7Village(getStringValue(sQuestion4GroupVillage7));
        question.setQ4YouthGroup7MaleNumber(getIntegerValue(sQuestion4GroupNumberMales7));
        question.setQ4YouthGroup7FemaleNumber(getIntegerValue(sQuestion4GroupNumberFemales7));
        question.setQ4YouthGroup7AmountReceived(getDoubleValue(sQuestion4GroupAmountReceived7));

        question.setQ5NumberMaleTrained(getIntegerValue(sQuestion5NumberMaleTrained));
        question.setQ5NumberFemaleTrained(getIntegerValue(sQuestion5NumberFemaleTrained));
        question.setQ6CommunityGroupFormed(getStringValue(sQuestion6NumberCommunityGroupsTrained));
        question.setQ7OtherChallengesObservations(getStringValue(sQuestion7ChallengerObservations));

        activityViewModel.saveSocialDevelopmentQuestion(question);
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

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        selectedFinancialYear = financialYears[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        selectedFinancialYear = "";
    }


    private String getStringValue(TextView textView) {
        return textView.getText().toString();
    }

    private String getStringValue(EditText editText) {
        return editText.getText().toString();
    }

    private int getIntegerValue(EditText editText) {
        return Integer.parseInt(editText.getText().toString());
    }

    private double getDoubleValue(EditText editText) {
//        return 90.0;
        return Double.parseDouble(editText.getText().toString());
    }
}