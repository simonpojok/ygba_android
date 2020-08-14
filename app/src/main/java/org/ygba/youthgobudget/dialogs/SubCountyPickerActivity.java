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
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class SubCountyPickerActivity extends AppCompatActivity {

    private String DISTRICT_ID = "org.ygba.youthgobudget.dialogs.SubCountyPickerActivity.DISTRICT_ID";

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

    private static class SubCountyAdapter extends RecyclerView.Adapter<SubCountyAdapter.SubCountyViewHolder> {
        private Context context;
        private List<SubCounty> subCounties;

        public SubCountyAdapter(Context context, List<SubCounty> subCounties) {
            this.context = context;
            this.subCounties = subCounties;
        }

        @NonNull
        @Override
        public SubCountyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_sub_county, parent, false);
            return new SubCountyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull SubCountyViewHolder holder, int position) {
            if (subCounties != null) {
                holder.bindSubCounty(subCounties.get(position));
            }

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public static class SubCountyViewHolder extends RecyclerView.ViewHolder {
            TextView textView;

            public SubCountyViewHolder(@NonNull View itemView) {
                super(itemView);
            }

            public void bindSubCounty(SubCounty subCounty) {
                textView.setText(subCounty.getName());
            }
        }
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