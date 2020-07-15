package org.ygba.youthgobudget.water_and_environment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;

public class WaterEnvironmentViewModel extends AndroidViewModel {
    private YGBARepository ygbaRepository;

    public WaterEnvironmentViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }
}
