package org.ygba.youthgobudget.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import org.ygba.youthgobudget.R;

public class HomeFragment extends Fragment {
    private CardView cv_agriculture;
    private CardView cv_education;
    private CardView cv_social_development;
    private CardView cv_health;
    private CardView cv_water_environment;
    private CardView cv_budget_info;
    private OnAgricultureIconClickListener agricultureIconClickListener;
    private OnEducationIconClickListener onEducationIconClickListener;
    private OnSocialDevelopmentIconClickListener socialDevelopmentIconClickListener;
    private OnHealthIconClickListener onHealthIconClickListener;
    private OnWaterEnvironmentListener onWaterEnvironmentListener;
    private OnBudgetInformationClickListener onBudgetInformationClickListener;

    private HomeViewModel homeViewModel;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        agricultureIconClickListener = (OnAgricultureIconClickListener) context;
        onEducationIconClickListener = (OnEducationIconClickListener) context;
        socialDevelopmentIconClickListener = (OnSocialDevelopmentIconClickListener) context;
        onHealthIconClickListener = (OnHealthIconClickListener) context;
        onWaterEnvironmentListener = (OnWaterEnvironmentListener) context;
        onBudgetInformationClickListener = (OnBudgetInformationClickListener) context;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        cv_agriculture = root.findViewById(R.id.cv_agriculture);
        cv_education = root.findViewById(R.id.cv_education);
        cv_social_development = root.findViewById(R.id.cv_social_development_icon);
        cv_health = root.findViewById(R.id.cv_health_icon);
        cv_water_environment = root.findViewById(R.id.water_environment_icon);
        cv_budget_info = root.findViewById(R.id.budget_info_icon);


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

        cv_social_development.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (socialDevelopmentIconClickListener != null ) {
                    socialDevelopmentIconClickListener.onSocialDevelopmentIconClick();
                }
            }
        });

        cv_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onHealthIconClickListener != null ) {
                    onHealthIconClickListener.onHealthIconClick();
                }
            }
        });

        cv_water_environment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onWaterEnvironmentListener != null) {
                    onWaterEnvironmentListener.onWaterEnvironmentClick();
                }
            }
        });

        cv_budget_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (onBudgetInformationClickListener != null ) {
                    onBudgetInformationClickListener.onBudgetInformationClick();
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

    public static interface OnSocialDevelopmentIconClickListener {
        public void onSocialDevelopmentIconClick();
    }

    public static  interface OnHealthIconClickListener {
        public void onHealthIconClick();
    }

    public static  interface OnWaterEnvironmentListener {
        public void onWaterEnvironmentClick();
    }

    public static interface OnBudgetInformationClickListener {
        public void onBudgetInformationClick();
    }
}