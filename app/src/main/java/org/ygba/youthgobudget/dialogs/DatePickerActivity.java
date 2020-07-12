package org.ygba.youthgobudget.dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import org.ygba.youthgobudget.R;

public class DatePickerActivity extends Activity {

    public static final String SELECTED_DATE = "org.ygba.youthgobudget.dialogs.SELECTED_DATE";
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        datePicker = findViewById(R.id.date_picker_activity_date_picker);
        Button okButton = findViewById(R.id.button_ok);
        Button cancelButton = findViewById(R.id.button_cancel);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date_string = datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear();
                Intent intent = new Intent();
                intent.putExtra(SELECTED_DATE, date_string);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED, null);
                finish();
            }
        });
    }
}