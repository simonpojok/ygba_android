package org.ygba.youthgobudget.dialogs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;

import java.util.List;

public class SubCountyPickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_county_picker);

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
}