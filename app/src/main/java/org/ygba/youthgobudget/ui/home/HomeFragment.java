package org.ygba.youthgobudget.ui.home;

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

public class HomeFragment extends Fragment {
    private CardView cv_agriculture;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        cv_agriculture = root.findViewById(R.id.cv_agriculture);

        cv_agriculture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeFragment.this, AgricultureActivity.class));
            }
        });
        return root;
    }

    public static interface OnAgricultureIconClickListener {
        public void onAgricultureIconClick();
    }
}