package org.ygba.youthgobudget.health;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;

public class HealthActivity extends AppCompatActivity {
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

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
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
    }


}