package org.ygba.youthgobudget.agriculture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import org.ygba.youthgobudget.R;

public class AgricultureActivity extends AppCompatActivity {
    Spinner financialYearSpinner;
    EditText villageEditText;
    EditText parishTextEdit;
    EditText divisionEditText;
    EditText agentFullNameEditText;
    EditText agentTelephoneEditText;
    EditText agentNumberEditText;
    CheckBox yesWorkerCheckBox;
    CheckBox noWorkerCheckBox;
    EditText questionReasonEditText;
    EditText extensionServiceExpectedOrReceivedEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_activity);

        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        villageEditText = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionEditText = findViewById(R.id.division_text_edit);
        agentFullNameEditText = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelephoneEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        agentNumberEditText = findViewById(R.id.ygb_agent_no_edit_view);
        yesWorkerCheckBox = findViewById(R.id.yesSubCountyHasExtensionWorker);
        noWorkerCheckBox = findViewById(R.id.noSubCountyHasExtensionWorker);
        questionReasonEditText = findViewById(R.id.question_1_reason_text_edit);
        extensionServiceExpectedOrReceivedEditText = findViewById(R.id.extension_services_expected_or_approved);
    }
}