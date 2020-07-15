package org.ygba.youthgobudget.water_and_environment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.utils.DynamicData;

public class WaterEnvironmentActivity extends AppCompatActivity {
    private TextView waterDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_environment);
        initViews();
        populateViews();
    }

    private void initViews() {
        waterDateTextView = findViewById(R.id.water_date_text_view);
    }

    private void populateViews() {
        waterDateTextView.setText(DynamicData.getDate());
    }
}