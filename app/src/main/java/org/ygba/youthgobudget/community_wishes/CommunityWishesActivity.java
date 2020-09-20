package org.ygba.youthgobudget.community_wishes;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.ygba.youthgobudget.R;

public class CommunityWishesActivity extends AppCompatActivity {
    private   final int DISTRICT_NAME_REQUESTER_CODE = 1;
    private   final int SUB_COUNTY_NAME_REQUEST_CODE = 2;
    private  final int QUESTION_2_DATE_RECEIVED_1_REQUEST_CODE = 3;
    private  final int  QUESTION_2_DATE_WITHDRAWN_1_REQUEST_CODE = 4;
    private  final int  QUESTION_2_DATE_RECEIVED_2_REQUEST_CODE = 5;
    private  final int  QUESTION_2_DATE_WITHDRAWN_2_REQUEST_CODE = 6;
    private  final int  QUESTION_4_DATE_WITHDRAWN_5_REQUEST_CODE = 8;
    private final int QUESTION_4_DATE_WITHDRAWN_4_REQUEST_CODE = 9;
    private final int QUESTION_4_DATE_WITHDRAWN_3_REQUEST_CODE = 10;
    private final int QUESTION_4_DATE_WITHDRAWN_2_REQUEST_CODE = 11;
    private final int QUESTION_4_DATE_WITHDRAWN_1_REQUEST_CODE = 12;
    private final int DISPLAY_SUCCESS_MESSAGE_ACTIVITY = 13;
    private int districtId = 0;
    RadioGroup question1RadioGroup;
    Spinner quarterSpinner;
    Spinner financialSpinner;

    EditText financialYear;
    TextView districtText;

    EditText villageEditText;
    EditText parishTextEdit;
    TextView divisionEditText;
    EditText agentFullNameEditText;
    EditText agentTelephoneEditText;
    EditText agentNumberEditText;

    private final String[] quarterList = {"I", "II", "III", "IV", "V", "VI", "VII"};
    private final String[] financialYearList = {"2021/22", "2020/21", "2019/20"};
    private String selectedQuarter;
    private String selectedFinancialYear;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_wish);
        initViews();
    }

    private void initViews() {
        quarterSpinner = findViewById(R.id.quarter_spinner);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, quarterList);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quarterSpinner.setAdapter(aa);

        financialSpinner = findViewById(R.id.financial_year_spinner);
        ArrayAdapter<String> fa=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, financialYearList);
        fa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        financialSpinner.setAdapter(fa);


        villageEditText = findViewById(R.id.village_text_edit);
        parishTextEdit = findViewById(R.id.parish_text_edit);
        divisionEditText = findViewById(R.id.division_text_edit);
        agentFullNameEditText = findViewById(R.id.ygb_agent_name_edit_view);
        agentTelephoneEditText = findViewById(R.id.ygb_agent_tel_edit_view);
        agentNumberEditText = findViewById(R.id.ygb_agent_no_edit_view);
    }
}
