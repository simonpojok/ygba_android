package org.ygba.youthgobudget.agriculture;

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

import org.w3c.dom.Text;
import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.dialogs.DatePickerActivity;
import org.ygba.youthgobudget.dialogs.DistrictPickerActivity;
import org.ygba.youthgobudget.dialogs.SubCountyPickerActivity;
import org.ygba.youthgobudget.dialogs.SuccessActivity;
import org.ygba.youthgobudget.utils.DynamicData;



import java.util.List;

public class AgricultureActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {
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
    EditText question1ReasonEditText;
    EditText extensionServiceExpectedOrReceivedEditText;
    EditText extensionServiceAmountReceivedTextEdit;
    TextView extensionServiceDateReceivedEditText;
    TextView extensionServiceDateWithdrawnEditText;
    EditText developmentExpectedOrApprovedTextEdit;
    EditText developmentAmountReceived;
    TextView developmentDateReceived;
    TextView developmentDateWithdrawn;
    EditText question21EditText;
    RadioGroup question22RadioGroup;
    EditText question23EditText;
    EditText question24EditText;
    EditText question25EditEdit;
    EditText question32MeetingCapacity;
    EditText question24MeetingCell;
    EditText question34FemaleNumber;
    EditText question34MaleNumber;
    EditText question35EditText;
    EditText question42Plant1;
    TextView question42Date1;
    EditText question42Male1;
    EditText question42Female1;
    EditText question42Village1;
    EditText question42Village2;
    EditText question42Female2;
    EditText question42Male2;
    TextView question42Date2;
    EditText question42Plant2;
    EditText question42Plant3;
    TextView question42Date3;
    EditText question42Male3;
    EditText question42Female3;
    EditText question42Village3;
    EditText question42Plant4;
    TextView question42Date4;
    EditText question42Male4;
    EditText question42Female4;
    EditText question42Village4;
    EditText question42Village5;
    EditText question42Female5;
    EditText question42Male5;
    TextView question42Date5;
    EditText question42Plant5;
    EditText question43Reason;
    EditText question43AnyReason;
    CardView saveFormData;
    AgricultureActivityViewModel activityViewModel;
    private final String[] quarterList = {"I", "II", "III", "IV", "V", "VI", "VII"};
    private final String[] financialYearList = {"2021/22", "2020/21", "2019/20"};
    private String selectedQuarter;
    private String selectedFinancialYear;
    RadioGroup question41RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture_activity);
         activityViewModel = new ViewModelProvider(this).get(AgricultureActivityViewModel.class);

        initViews();

        saveFormData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveAgricultureQuestion();
            }
        });

        activityViewModel.getAllAgricultureQuestions().observe(this, new Observer<List<AgricultureQuestion>>() {
            @Override
            public void onChanged(List<AgricultureQuestion> agricultureQuestions) {
                if (agricultureQuestions != null ) {
                    Toast.makeText(AgricultureActivity.this, "Found Questions: " + String.valueOf(agricultureQuestions.size()), Toast.LENGTH_LONG).show();
                }
            }
        });

        TextView textView = findViewById(R.id.date);
        textView.setText(DynamicData.getDate());
    }

    private void saveAgricultureQuestion() {
        AgricultureQuestion agricultureQuestion = new AgricultureQuestion(
                selectedQuarter,
                selectedQuarter,
                DynamicData.getDate(),
                villageEditText.getText().toString(),
                parishTextEdit.getText().toString(),
                parishTextEdit.getText().toString(),
                agentFullNameEditText.getText().toString(),
                agentTelephoneEditText.getText().toString(),
                agentNumberEditText.getText().toString(),
                getQuestion1RadioAnswer(),
                question1ReasonEditText.getText().toString(),
                extensionServiceExpectedOrReceivedEditText.getText().toString(),
                extensionServiceAmountReceivedTextEdit.getText().toString(),
                extensionServiceDateReceivedEditText.getText().toString(),
                extensionServiceDateWithdrawnEditText.getText().toString(),
                developmentExpectedOrApprovedTextEdit.getText().toString(),
                developmentAmountReceived.getText().toString(),
                extensionServiceDateReceivedEditText.getText().toString(),
                developmentDateWithdrawn.getText().toString(),
                question21EditText.getText().toString(),
                getQuestion22RadioAnswer(),
                question23EditText.getText().toString(),
                question24EditText.getText().toString(),
                question25EditEdit.getText().toString(),
                null,
                question32MeetingCapacity.getText().toString(),
                question24MeetingCell.getText().toString(),
                question34MaleNumber.getText().toString(),
                question34FemaleNumber.getText().toString(),
                question35EditText.getText().toString(),
                getQuestion41Answer(),

                question42Plant1.getText().toString(),
                question42Date1.getText().toString(),
                question42Male1.getText().toString(),
                question42Female1.getText().toString(),
                question42Village1.getText().toString(),

                question42Plant2.getText().toString(),
                question42Date2.getText().toString(),
                question42Male2.getText().toString(),
                question42Female2.getText().toString(),
                question42Village2.getText().toString(),

                question42Plant3.getText().toString(),
                question42Date3.getText().toString(),
                question42Male3.getText().toString(),
                question42Female3.getText().toString(),
                question42Village3.getText().toString(),

                question42Plant4.getText().toString(),
                question42Date4.getText().toString(),
                question42Male4.getText().toString(),
                question42Female4.getText().toString(),
                question42Village4.getText().toString(),

                question42Plant5.getText().toString(),
                question42Date5.getText().toString(),
                question42Male5.getText().toString(),
                question42Female5.getText().toString(),
                question42Village5.getText().toString(),
                question43Reason.getText().toString(),
                question43AnyReason.getText().toString()
        );

        activityViewModel.saveAgricultureQuestion(agricultureQuestion);
        startActivityForResult(new Intent(this, SuccessActivity.class), DISPLAY_SUCCESS_MESSAGE_ACTIVITY);
    }

    private String getQuestion41Answer() {
        if (question41RadioGroup.getCheckedRadioButtonId() == R.id.question41Yes) {
            return "Yes";
        }
        return "No";
    }

    private String getQuestion1RadioAnswer() {
        if (question1RadioGroup.getCheckedRadioButtonId() == R.id.question1Yes) {
            return "Yes";
        }
        return "No";
    }

    private String getQuestion22RadioAnswer() {
        if (question22RadioGroup.getCheckedRadioButtonId() == R.id.question22Yes) {
            return "Yes";
        }
        return "No";
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
        question1RadioGroup = findViewById(R.id.question1RadioGroup);
        question1ReasonEditText = findViewById(R.id.question_1_reason_text_edit);
        extensionServiceExpectedOrReceivedEditText = findViewById(R.id.q2extension_services_expected_or_approved);
        extensionServiceAmountReceivedTextEdit = findViewById(R.id.q2extension_services_amount_received);
        extensionServiceDateReceivedEditText = findViewById(R.id.q2extension_services_date_received);
        extensionServiceDateReceivedEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_2_DATE_RECEIVED_1_REQUEST_CODE);
            }
        });
        extensionServiceDateWithdrawnEditText = findViewById(R.id.extension_services_date_withdrawn);
        extensionServiceDateWithdrawnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_2_DATE_WITHDRAWN_1_REQUEST_CODE);
            }
        });
        developmentExpectedOrApprovedTextEdit = findViewById(R.id.development_expected_or_approved);
        developmentAmountReceived = findViewById(R.id.development_amount_received);
        developmentDateReceived = findViewById(R.id.development_date_received);
        developmentDateReceived.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_2_DATE_RECEIVED_2_REQUEST_CODE);
            }
        });
        developmentDateWithdrawn = findViewById(R.id.development_date_withdrawn);
        developmentDateWithdrawn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_2_DATE_WITHDRAWN_2_REQUEST_CODE);
            }
        });
        question21EditText = findViewById(R.id.question_2_1_edit_text);
        question23EditText = findViewById(R.id.question_2_3_edit_text);
        question22RadioGroup = findViewById(R.id.question22RadioGroup);
        question24EditText = findViewById(R.id.question_2_4_text_edit);
        question25EditEdit = findViewById(R.id.question_2_5_text_view);
        question32MeetingCapacity = findViewById(R.id.question32MeetingCapacity);
        question24MeetingCell = findViewById(R.id.question24MeetingCell);
        question34FemaleNumber = findViewById(R.id.question34FemaleNumber);
        question34MaleNumber = findViewById(R.id.question34MaleNumber);
        question35EditText = findViewById(R.id.question35EditText);
        question41RadioGroup = findViewById(R.id.question41RadioGroup);
        question42Plant1 = findViewById(R.id.question42Plant1);
        question42Date1 = findViewById(R.id.question42Date1);
        question42Date1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_4_DATE_WITHDRAWN_1_REQUEST_CODE);
            }
        });
        question42Male1 = findViewById(R.id.question42Male1);
        question42Female1 = findViewById(R.id.question42Female1);
        question42Village1 = findViewById(R.id.question42Village1);
        question42Village2 = findViewById(R.id.question42Village2);
        question42Female2 = findViewById(R.id.question42Female2);
        question42Male2 = findViewById(R.id.question42Male2);
        question42Date2 = findViewById(R.id.question42Date2);
        question42Date2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_4_DATE_WITHDRAWN_2_REQUEST_CODE);
            }
        });
        question42Plant2 = findViewById(R.id.question42Plant2);
        question42Plant3 = findViewById(R.id.question42Plant3);
        question42Date3 = findViewById(R.id.question42Date3);
        question42Date3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_4_DATE_WITHDRAWN_3_REQUEST_CODE);
            }
        });
        question42Male3 = findViewById(R.id.question42Male3);
        question42Female3 = findViewById(R.id.question42Female3);
        question42Village3 = findViewById(R.id.question42Village3);
        question42Plant4 = findViewById(R.id.question42Plant4);
        question42Date4 = findViewById(R.id.question42Date4);
        question42Date4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_4_DATE_WITHDRAWN_4_REQUEST_CODE);
            }
        });
        question42Male4 = findViewById(R.id.question42Male4);
        question42Female4 = findViewById(R.id.question42Female4);
        question42Village4 = findViewById(R.id.question42Village4);
        question42Village5 = findViewById(R.id.question42Village5);
        question42Female5 = findViewById(R.id.question42Female5);
        question42Male5 = findViewById(R.id.question42Male5);
        question42Date5 = findViewById(R.id.question42Date5);
        question42Date5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(AgricultureActivity.this, DatePickerActivity.class), QUESTION_4_DATE_WITHDRAWN_5_REQUEST_CODE);
            }
        });
        question42Plant5 =  findViewById(R.id.question42Plant5);
        question43Reason = findViewById(R.id.question43Reason);
        question43AnyReason =  findViewById(R.id.question43AnyReason);
        saveFormData = findViewById(R.id.saved_form_data);

        financialYear = findViewById(R.id.financial_text_edit);
        districtText = findViewById(R.id.district_text_edit);


        // listeners
        districtText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AgricultureActivity.this, DistrictPickerActivity.class);
                startActivityForResult(intent, DISTRICT_NAME_REQUESTER_CODE);
            }
        });

        divisionEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (districtId == 0) {
                    divisionEditText.setError("Please Set District Continue");
                } else {
                    Intent intent = new Intent(AgricultureActivity.this, SubCountyPickerActivity.class);
                    startActivityForResult(intent, SUB_COUNTY_NAME_REQUEST_CODE);
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        if (view.getId() == R.id.financial_year_spinner) {
            selectedFinancialYear = financialYearList[position];
        } else if (view.getId() == R.id.quarter_spinner) {
            selectedQuarter = quarterList[position];
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        selectedQuarter = "";
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (data != null) {
                if (requestCode == DISTRICT_NAME_REQUESTER_CODE) {
                    districtText.setText(data.getStringExtra(DistrictPickerActivity.DISTRICT_NAME));
                    districtId = data.getIntExtra(DistrictPickerActivity.DISTRICT_ID, 0);
                } else if (requestCode == SUB_COUNTY_NAME_REQUEST_CODE) {
                    divisionEditText.setText(data.getStringExtra(SubCountyPickerActivity.SUB_COUNTY_NAME));
                } else if (requestCode == QUESTION_2_DATE_RECEIVED_1_REQUEST_CODE) {
                    extensionServiceDateReceivedEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_2_DATE_WITHDRAWN_1_REQUEST_CODE) {
                    extensionServiceDateWithdrawnEditText.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_2_DATE_RECEIVED_2_REQUEST_CODE) {
                    developmentDateReceived.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_2_DATE_WITHDRAWN_2_REQUEST_CODE) {
                    developmentDateWithdrawn.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_4_DATE_WITHDRAWN_5_REQUEST_CODE) {
                    question42Date5.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_4_DATE_WITHDRAWN_4_REQUEST_CODE) {
                    question42Date4.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_4_DATE_WITHDRAWN_3_REQUEST_CODE) {
                    question42Date3.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_4_DATE_WITHDRAWN_2_REQUEST_CODE) {
                    question42Date2.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                } else if (requestCode == QUESTION_4_DATE_WITHDRAWN_1_REQUEST_CODE) {
                    question42Date1.setText(data.getStringExtra(DatePickerActivity.SELECTED_DATE));
                }
            }
        }

        if (requestCode == DISPLAY_SUCCESS_MESSAGE_ACTIVITY ) {
            clearForm();
        }
    }

    private void clearForm() {
        selectedQuarter = "";
        selectedQuarter = "";
        villageEditText.setText("");
        parishTextEdit.setText("");
        parishTextEdit.setText("");
        agentFullNameEditText.setText("");
        agentTelephoneEditText.setText("");
        agentNumberEditText.setText("");
        question1ReasonEditText.setText("");
        extensionServiceExpectedOrReceivedEditText.setText("");
        extensionServiceAmountReceivedTextEdit.setText("");
        extensionServiceDateReceivedEditText.setText("");
        extensionServiceDateWithdrawnEditText.setText("");
        developmentExpectedOrApprovedTextEdit.setText("");
        developmentAmountReceived.setText("");
        extensionServiceDateReceivedEditText.setText("");
        developmentDateWithdrawn.setText("");
        question21EditText.setText("");
        question23EditText.setText("");
        question24EditText.setText("");
        question25EditEdit.setText("");
        question32MeetingCapacity.setText("");
        question24MeetingCell.setText("");
        question34MaleNumber.setText("");
        question34FemaleNumber.setText("");
        question35EditText.setText("");
        question42Plant1.setText("");
        question42Date1.setText("");
        question42Male1.setText("");
        question42Female1.setText("");
        question42Village1.setText("");
        question42Plant2.setText("");
        question42Date2.setText("");
        question42Male2.setText("");
        question42Female2.setText("");
        question42Village2.setText("");
        question42Plant3.setText("");
        question42Date3.setText("");
        question42Male3.setText("");
        question42Female3.setText("");
        question42Village3.setText("");
        question42Plant4.setText("");
        question42Date4.setText("");
        question42Male4.setText("");
        question42Female4.setText("");
        question42Village4.setText("");
        question42Plant5.setText("");
        question42Date5.setText("");
        question42Male5.setText("");
        question42Female5.setText("");
        question42Village5.setText("");
        question43Reason.setText("");
        question43AnyReason.setText("");
    }
}