package org.ygba.youthgobudget.dialogs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.data.helpers.district.District;

import java.util.List;


public  class DistrictPickerAdapter extends RecyclerView.Adapter<DistrictPickerAdapter.DistrictViewHolder> {
    List<District> districts;
    Context context;
    private OnDistrictClickListener onDistrictClickListener;

    public DistrictPickerAdapter(Context context, List<District> districts) {
        this.districts = districts;
        this.context = context;

        if ( context instanceof OnDistrictClickListener ) {
            onDistrictClickListener = (OnDistrictClickListener) context;
        }
    }

    @NonNull
    @Override
    public DistrictViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_district, parent, false);
        return new DistrictViewHolder(view, onDistrictClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull DistrictViewHolder holder, int position) {
        if (districts != null ) {
            holder.bindView(districts.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return districts.size();
    }

    static class DistrictViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        private OnDistrictClickListener onDistrictClickListener;
        public DistrictViewHolder(@NonNull View itemView, OnDistrictClickListener onDistrictClickListener) {
            super(itemView);
            textView = itemView.findViewById(R.id.district_name);
            this.onDistrictClickListener = onDistrictClickListener;
        }

        public void bindView(final District district) {
            textView.setText(district.getName());
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onDistrictClickListener.onDistrictClick(district);
                }
            });
        }
    }

    public interface OnDistrictClickListener {
        public void onDistrictClick(District district);
    }
}