package org.ygba.youthgobudget.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;

import java.util.List;

public class SubCountyAdapter extends RecyclerView.Adapter<SubCountyAdapter.SubCountyViewHolder> {
    private Context context;
    private List<SubCounty> subCounties;
    private OnSubCountyClickListener onSubCountyClickListener;

    public SubCountyAdapter(Context context, List<SubCounty> subCounties) {
        this.context = context;
        this.subCounties = subCounties;
        if ( context instanceof OnSubCountyClickListener) {
            onSubCountyClickListener = (OnSubCountyClickListener) context;
        }
    }

    @NonNull
    @Override
    public SubCountyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_sub_county, parent, false);
        return new SubCountyViewHolder(view, onSubCountyClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SubCountyViewHolder holder, int position) {
        if (subCounties != null) {
            holder.bindSubCounty(subCounties.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return subCounties.size();
    }

    public static class SubCountyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private OnSubCountyClickListener onSubCountyClickListener;

        public SubCountyViewHolder(@NonNull View itemView, OnSubCountyClickListener onSubCountyClickListener) {
            super(itemView);
            textView = itemView.findViewById(R.id.sub_county_name);
            this.onSubCountyClickListener = onSubCountyClickListener;
        }

        public void bindSubCounty(final SubCounty subCounty) {
            textView.setText(subCounty.getName());
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onSubCountyClickListener.onSubCountyClick(subCounty.getName());
                }
            });
        }
    }

    public interface OnSubCountyClickListener {
        public void onSubCountyClick(String subCountyName);
    }
}