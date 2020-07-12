package org.ygba.youthgobudget.socialdevelopment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.ygba.youthgobudget.R;

public class SocialDevelopmentActivity extends AppCompatActivity {
    private SocialDevelopmentActivityViewModel activityViewModel;
    private TextView socialDateTextView;
    private Spinner financialYearSpinner;
    private EditText villageTextEdit;
    private EditText parishTextEdit;
    private EditText divisionTextEdit;
    private EditText fullNameTextEdit;
    private EditText agentTelEditText;
    private EditText communityExpectedAmountEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_development);
        activityViewModel = new ViewModelProvider(this).get(SocialDevelopmentActivityViewModel.class);

        initViews();
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

    }
}