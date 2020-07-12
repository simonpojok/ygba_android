package org.ygba.youthgobudget.socialdevelopment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import org.ygba.youthgobudget.R;

public class SocialDevelopmentActivity extends AppCompatActivity {
    private SocialDevelopmentActivityViewModel activityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_development);

        activityViewModel = new ViewModelProvider(this).get(SocialDevelopmentActivityViewModel.class);
    }
}