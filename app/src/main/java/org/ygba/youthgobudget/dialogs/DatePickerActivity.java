package org.ygba.youthgobudget.dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;

import org.ygba.youthgobudget.R;

public class DatePickerActivity extends AppCompatActivity {

    public static final String SELECTED_DATE = "org.ygba.youthgobudget.dialogs.SELECTED_DATE";
    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        datePicker = findViewById(R.id.date_picker_activity_date_picker);
    }
}