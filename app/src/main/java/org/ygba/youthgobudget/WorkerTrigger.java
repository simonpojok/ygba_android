package org.ygba.youthgobudget;

import android.content.Context;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import org.ygba.youthgobudget.agriculture.AgricultureUploadWorker;
import org.ygba.youthgobudget.data.helpers.district.DistrictDownloadWorker;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCountyDownloadWorker;
import org.ygba.youthgobudget.social_development.SocialDevelopmentUploadWorker;
import org.ygba.youthgobudget.water_and_environment.WaterEnvironmentUploadWorker;

import java.util.concurrent.TimeUnit;

import static org.ygba.youthgobudget.utils.Constants.WORKER_TIME_INTERVAL_MINUTES;

public class WorkerTrigger {

    public static void startAllUploadWorker(Context context) {
        startAgricultureUploadWorker(context);
        startWaterAndEnvironmentUploadWorker(context);
        startSocialDevelopmentUploadWorker(context);
        startDistrictDownloadWorker(context);
        startSubCountyDownloadWorker(context);
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

    private static void startWaterAndEnvironmentUploadWorker(Context context) {
        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(
                WaterEnvironmentUploadWorker.class,
                WORKER_TIME_INTERVAL_MINUTES,
                TimeUnit.MINUTES
        ).setConstraints(constraints).build();
        WorkManager.getInstance(context).enqueue(workRequest);
    }

    private static void startSocialDevelopmentUploadWorker(Context context) {
        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(
                SocialDevelopmentUploadWorker.class,
                WORKER_TIME_INTERVAL_MINUTES,
                TimeUnit.MINUTES
        ).setConstraints(constraints).build();
        WorkManager.getInstance(context).enqueue(workRequest);
    }

    private static void startDistrictDownloadWorker(Context context) {
        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(
                DistrictDownloadWorker.class,
                WORKER_TIME_INTERVAL_MINUTES,
                TimeUnit.MINUTES
        ).setConstraints(constraints).build();
        WorkManager.getInstance(context).enqueue(workRequest);
    }

    private static void startSubCountyDownloadWorker(Context context) {
        Constraints constraints = new Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        PeriodicWorkRequest workRequest = new PeriodicWorkRequest.Builder(
                SubCountyDownloadWorker.class,
                WORKER_TIME_INTERVAL_MINUTES,
                TimeUnit.MINUTES
        ).setConstraints(constraints).build();
        WorkManager.getInstance(context).enqueue(workRequest);
    }
}
