package org.ygba.youthgobudget.budget_information;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationForm;

public class BudgetInformationActivityViewModel extends AndroidViewModel {
    YGBARepository ygbaRepository;

    public BudgetInformationActivityViewModel(@NonNull Application application) {
        super(application);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(application));
    }

    public void saveBudgetInformationForm(BudgetInformationForm budgetInformationForm) {
        ygbaRepository.saveBudgetInformationForm(budgetInformationForm);
    }
}
