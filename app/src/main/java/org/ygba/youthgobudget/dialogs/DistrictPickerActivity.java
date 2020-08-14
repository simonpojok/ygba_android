package org.ygba.youthgobudget.dialogs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
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

public class DistrictPickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_picker);
        RecyclerView recyclerView = findViewById(R.id.district_recycler_view);
        DistrictAdapter districtAdapter = new DistrictAdapter(this, getDistricts());
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
}