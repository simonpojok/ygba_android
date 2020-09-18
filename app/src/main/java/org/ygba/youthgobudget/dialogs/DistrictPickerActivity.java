package org.ygba.youthgobudget.dialogs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.helpers.district.District;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class DistrictPickerActivity extends Activity implements DistrictPickerAdapter.OnDistrictClickListener {
    public static final String DISTRICT_NAME = "org.ygba.youthgobudget.dialogs.DistrictPickerActivity.DISTRICT_NAME";
    public static final String DISTRICT_ID = "org.ygba.youthgobudget.dialogs.DistrictPickerActivity.DISTRICT_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_picker);
        RecyclerView recyclerView = findViewById(R.id.district_recycler_view);
        DistrictPickerAdapter districtAdapter = new DistrictPickerAdapter(this, getDistricts());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(districtAdapter);
    }

    private List<District> getDistricts() {
        try {
            return YGBARepository.getInstance(YGBDatabase.getInstance(this)).getDistrictList();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void onDistrictClick(District district) {
        Intent intent = new Intent();
        intent.putExtra(DISTRICT_NAME, district.getName());
        intent.putExtra(DISTRICT_ID, district.getId());
        setResult(RESULT_OK, intent);
        finish();
    }
}