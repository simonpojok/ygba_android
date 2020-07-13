package org.ygba.youthgobudget.health;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;

public class HealthActivity extends AppCompatActivity {
    private final int Q_1_RECURRENT_DATE_RECEIVED_REQUEST_CODE = 1;
    private final int Q_1_RECURRENT_DATE_WITHDRAWN_REQUEST_CODE = 2;
    private final int Q_1_RECURRENT_DATE_DEVELOPMENT_RECEIVED_REQUEST_CODE = 3;
    private final int Q_1_RECURRENT_DATE_DEVELOPMENT_WITHDRAWN_REQUEST_CODE = 4;
    TextView hDateTextView;
    Spinner hFinancialSpinner;
    EditText villageEditText;
    EditText parishEditText;
    EditText divisionEditText;
    EditText agentFulNameEditText;
    EditText agentTelEditText;
    EditText qQANameAndGradeHealthCenterEditText;
    EditText hQBAttendanceEditText;
    EditText hQCInpatientNumberEditText;
    EditText hQ1RecurrentApprovedEditText;
    EditText hQ1RecurrentBudgetReleaseTextEdit;
    EditText hQ1RecurrentDateReceivedEditText;
    EditText hQ1RecurrentDateWithdrawnEditText;
    EditText hQ1DevelopmentApprovedEditText;
    EditText hQ1DevelopmentBudgetReleaseTextEdit;
    EditText hQ1DevelopmentDateReceivedEditText;
    EditText hQ1DevelopmentDateWithdrawnEditText;
    EditText hQ1_2BudgetInformationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        initViews();
        initEventHandlers();
    }

    private void initEventHandlers() {
        hQ1RecurrentDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_RECEIVED_REQUEST_CODE);
            }
        });

        hQ1RecurrentDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });

        hQ1DevelopmentDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_DEVELOPMENT_WITHDRAWN_REQUEST_CODE);
            }
        });

        hQ1DevelopmentDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(HealthActivity.this, DatePickerActivity.class), Q_1_RECURRENT_DATE_DEVELOPMENT_RECEIVED_REQUEST_CODE);
            }
        });

    }


    private void initViews() {
        hDateTextView = findViewById(R.id.date_text_view);
        hFinancialSpinner = findViewById(R.id.financial_year_spinner);
        villageEditText = findViewById(R.id.village_text_edit);
        parishEditText = findViewById(R.id.parish_text_edit);
        divisionEditText = findViewById(R.id.division_text_edit);
        agentFulNameEditText = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        qQANameAndGradeHealthCenterEditText = findViewById(R.id.h_name_and_grade_health_center);
        hQBAttendanceEditText = findViewById(R.id.h_question_d_attendance_edit_text);
        hQCInpatientNumberEditText = findViewById(R.id.h_question_c_inpatient_number);
        hQ1RecurrentApprovedEditText = findViewById(R.id.h_question_1_recurrent_approved);
        hQ1RecurrentBudgetReleaseTextEdit = findViewById(R.id.h_question_1_recurrent_budget_released_edit_text);
        hQ1RecurrentDateReceivedEditText = findViewById(R.id.h_question_1_recurrent_date_received_edit_text);
        hQ1RecurrentDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ1RecurrentDateWithdrawnEditText = findViewById(R.id.h_question_1_recurrent_date_withdrawn_edit_text);
        hQ1RecurrentDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ1DevelopmentApprovedEditText = findViewById(R.id.h_question_1_development_approved);
        hQ1DevelopmentBudgetReleaseTextEdit = findViewById(R.id.h_question_1_development_budget_released_edit_text);
        hQ1DevelopmentDateReceivedEditText = findViewById(R.id.h_question_1_development_date_received_edit_text);
        hQ1DevelopmentDateReceivedEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ1DevelopmentDateWithdrawnEditText = findViewById(R.id.h_question_1_development_date_withdrawn_edit_text);
        hQ1DevelopmentDateWithdrawnEditText.setInputType(View.AUTOFILL_TYPE_NONE);
        hQ1_2BudgetInformationEditText = findViewById(R.id.h_question_1_2_budget_information);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((resultCode == RESULT_OK) && (data != null) ) {
            if (requestCode == Q_1_RECURRENT_DATE_RECEIVED_REQUEST_CODE) {
                hQ1RecurrentDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_1_RECURRENT_DATE_DEVELOPMENT_WITHDRAWN_REQUEST_CODE) {
                hQ1DevelopmentDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_1_RECURRENT_DATE_DEVELOPMENT_RECEIVED_REQUEST_CODE) {
                hQ1DevelopmentDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            } else if (requestCode == Q_1_RECURRENT_DATE_WITHDRAWN_REQUEST_CODE ) {
                hQ1RecurrentDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            }
        }
    }

    private boolean getBudgetNotDisplayOnNoticeBoard() {
        return ((CheckBox) findViewById(R.id.h_q_1_health_not_displayed)).isChecked();
    }

    private boolean getBudgetDisplayedFacilityNoticeBoard() {
        return ((CheckBox) findViewById(R.id.h_q_1_health_facility_notice_board)).isChecked();
    }

    private boolean getBudgetDisplayedFacilityAdamOffice() {
        return ((CheckBox) findViewById(R.id.h_q_1_1_facility_admin_notice_board)).isChecked();
    }

    private boolean getQuestion2MaternityWardObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_maternity_radio_group);
        if (radioGroup.getCheckedRadioButtonId() == R.id.question_2_maternity_yes) return true;
        return false;
    }

    private boolean getQuestion2GeneralWardObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_general_ward_radio_group);
        if (radioGroup.getCheckedRadioButtonId() == R.id.question_2_general_ward_yes) return true;
        return false;
    }

    private boolean getQuestion2DeliveryBedsObjective() {
        RadioGroup radioGroup = findViewById(R.id.question_2_delivery_beds_radio_group);
        if (radioGroup.getCheckedRadioButtonId() == R.id.question_2_delivery_beds_yes) return true;
        return false;
    }
}