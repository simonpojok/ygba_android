package org.ygba.youthgobudget.agriculture;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.utils.networktask.AgricultureNetworkTask;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

import static org.ygba.youthgobudget.utils.Constants.AGRICULTURE_COLLECTION_URL;


public class AgricultureUploadWorker extends Worker {
    private AgricultureDao agricultureDao;
    private Context context;
    private YGBARepository ygbaRepository;
    public AgricultureUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        agricultureDao = YGBDatabase.getInstance(context.getApplicationContext()).agricultureDao();
        this.context = context;
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(context.getApplicationContext()));
    }

    @NonNull
    @Override
    public Result doWork() {
        new AgricultureNetworkTask(context, agricultureDao, ygbaRepository).doAgricultureNetworkTask();
        return Result.success();
    }
}
