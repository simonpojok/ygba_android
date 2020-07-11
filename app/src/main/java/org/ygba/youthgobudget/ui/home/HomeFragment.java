package org.ygba.youthgobudget.ui.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import org.ygba.youthgobudget.MainActivity;
import org.ygba.youthgobudget.R;
import org.ygba.youthgobudget.agriculture.AgricultureActivity;

import java.util.concurrent.Callable;

public class HomeFragment extends Fragment {
    private CardView cv_agriculture;
    private CardView cv_education;
    private OnAgricultureIconClickListener agricultureIconClickListener;
    private OnEducationIconClickListener onEducationIconClickListener;

    private HomeViewModel homeViewModel;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        agricultureIconClickListener = (OnAgricultureIconClickListener) context;
        onEducationIconClickListener = (OnEducationIconClickListener) context;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        cv_agriculture = root.findViewById(R.id.cv_agriculture);
        cv_education = root.findViewById(R.id.cv_education);


        cv_agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (agricultureIconClickListener != null ) {
                    agricultureIconClickListener.onAgricultureIconClick();
                }
            }
        });

        cv_education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onEducationIconClickListener != null ) {
                    onEducationIconClickListener.onEducationIconClick();
                }
            }
        });

        return root;
    }

    public static interface OnAgricultureIconClickListener {
        public void onAgricultureIconClick();
    }

    public static interface OnEducationIconClickListener {
        public void onEducationIconClick();
    }
}