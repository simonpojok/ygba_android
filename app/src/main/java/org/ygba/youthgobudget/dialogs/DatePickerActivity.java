package org.ygba.youthgobudget.dialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.ygba.youthgobudget.R;

public class DatePickerActivity extends AppCompatActivity {

    public static final String SELECTED_DATE = "org.ygba.youthgobudget.dialogs.SELECTED_DATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
    }
}