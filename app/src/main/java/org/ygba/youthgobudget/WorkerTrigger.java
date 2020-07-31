package org.ygba.youthgobudget;

import android.content.Context;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import org.ygba.youthgobudget.agriculture.AgricultureUploadWorker;

import java.util.concurrent.TimeUnit;

import static org.ygba.youthgobudget.utils.Constants.WORKER_TIME_INTERVAL_MINUTES;

public class WorkerTrigger {

    public static void startAllUploadWorker(Context context) {
        startAgricultureUploadWorker(context);
    }

    private static void startAgricultureUploadWorker(Context context) {
        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(
                AgricultureUploadWorker.class,
                WORKER_TIME_INTERVAL_MINUTES,
                TimeUnit.MINUTES
        ).setConstraints(constraints).build();
        WorkManager.getInstance(context).enqueue(workRequest);
    }
}
