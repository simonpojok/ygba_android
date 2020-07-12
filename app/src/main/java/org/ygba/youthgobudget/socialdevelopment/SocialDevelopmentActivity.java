package org.ygba.youthgobudget.socialdevelopment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;

public class SocialDevelopmentActivity extends AppCompatActivity {
    private final int COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE = 1;
    private SocialDevelopmentActivityViewModel activityViewModel;
    private TextView socialDateTextView;
    private Spinner financialYearSpinner;
    private EditText villageTextEdit;
    private EditText parishTextEdit;
    private EditText divisionTextEdit;
    private EditText fullNameTextEdit;
    private EditText agentTelEditText;
    private EditText communityExpectedAmountEditText;
    private EditText communityReceivedAmountEditText;
    private EditText communityDateReceivedEditText;
    private EditText comDateWithdrawnEditText;
    private EditText otherExpectedAmountEditText;
    private EditText otherReceivedAmountEditText;
    private EditText otherDateReceivedEditText;
    private TextView otherDateWithdrawnEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_development);
        activityViewModel = new ViewModelProvider(this).get(SocialDevelopmentActivityViewModel.class);

        initViews();

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        otherDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(SocialDevelopmentActivity.this, DatePickerActivity.class), COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE);
            }
        });
    }

    private void initViews() {
        socialDateTextView = findViewById(R.id.social_date_text_view);
        financialYearSpinner = findViewById(R.id.financial_year_spinner);
        villageTextEdit = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionTextEdit = findViewById(R.id.division_text_edit);
        fullNameTextEdit = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        communityExpectedAmountEditText = findViewById(R.id.community_expected_amount_edit_text);
        communityReceivedAmountEditText = findViewById(R.id.community_received_amount_edit_text);
        communityDateReceivedEditText = findViewById(R.id.community_date_received_edit_text);
        comDateWithdrawnEditText = findViewById(R.id.community_date_withdrawn_edit_text);
        otherExpectedAmountEditText = findViewById(R.id.other_expected_amount_edit_text);
        otherReceivedAmountEditText = findViewById(R.id.other_received_amount_edit_text);
        otherDateReceivedEditText = findViewById(R.id.other_date_received_edit_text);
        otherDateWithdrawnEditText =  findViewById(R.id.other_date_withdrawn_edit_text);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((data != null) && (resultCode == RESULT_OK)) {
            switch (requestCode) {
                case COMMUNITY_DATE_WITHDRAWN_REQUEST_CODE:
                    otherDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
            }
        }
    }
}