package org.ygba.youthgobudget;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import org.ygba.youthgobudget.agriculture.AgricultureActivity;
import org.ygba.youthgobudget.budget_cycle.BudgetCycleActivity;
import org.ygba.youthgobudget.health.HealthActivity;
import org.ygba.youthgobudget.local_government.LocalGovernmentActivity;
import org.ygba.youthgobudget.polls.PollActivity;
import org.ygba.youthgobudget.social_development.SocialDevelopmentActivity;
import org.ygba.youthgobudget.water_and_environment.WaterEnvironmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.cv_agriculture).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AgricultureActivity.class));
            }
        });

        findViewById(R.id.cv_allocation_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        findViewById(R.id.cv_social_development_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SocialDevelopmentActivity.class));
            }
        });

        findViewById(R.id.water_environment_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WaterEnvironmentActivity.class));
            }
        });

        findViewById(R.id.cv_local_government_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LocalGovernmentActivity.class));
            }
        });

        findViewById(R.id.cv_budget_cycle_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BudgetCycleActivity.class));
            }
        });

        findViewById(R.id.cv_health_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, HealthActivity.class));
            }
        });

        findViewById(R.id.cv_polls_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PollActivity.class));
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}