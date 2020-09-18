package org.ygba.youthgobudget.dialogs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class SubCountyPickerActivity extends Activity implements SubCountyAdapter.OnSubCountyClickListener {

    public static final String DISTRICT_ID = "org.ygba.youthgobudget.dialogs.SubCountyPickerActivity.DISTRICT_ID";
    public static final String SUB_COUNTY_NAME = "org.ygba.youthgobudget.dialogs.SubCountyPickerActivity.SUB_COUNTY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_county_picker);

        List<SubCounty> subCounties = getSubCounties();
        if (subCounties == null ) {
            finish();
        }

        RecyclerView recyclerView = findViewById(R.id.sub_county_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new SubCountyAdapter(this, subCounties));

    }

    @Override
    public void onSubCountyClick(String subCountyName) {
        Intent intent = new Intent();
        intent.putExtra(SUB_COUNTY_NAME, subCountyName);
        setResult(RESULT_OK, intent);
        finish();
    }

    private List<SubCounty> getSubCounties() {
        int districtId = getIntent().getIntExtra(DISTRICT_ID, 1);
        try {
            return YGBARepository.getInstance(YGBDatabase.getInstance(this)).getSubCountyByDistrict(districtId);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}