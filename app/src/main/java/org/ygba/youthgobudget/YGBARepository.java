package org.ygba.youthgobudget;

import androidx.lifecycle.LiveData;

import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationForm;
import org.ygba.youthgobudget.data.health.HealthQuestion;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class YGBARepository {
    private static YGBARepository INSTANCE;
    private YGBDatabase ygbDatabase;

    private YGBARepository(YGBDatabase ygbDatabase) {
        this.ygbDatabase = ygbDatabase;
    }

    public static YGBARepository getInstance(YGBDatabase ygbDatabase){
        if (INSTANCE == null ) {
            synchronized (YGBARepository.class) {
                if (INSTANCE == null ) {
                    INSTANCE = new YGBARepository(ygbDatabase);
                }
            }
        }
        return INSTANCE;
    }

    public void saveAgricultureQuestion(final AgricultureQuestion agricultureQuestion) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.agricultureDao().saveAgricultureQuestion(agricultureQuestion);
            }
        });
    }

    public LiveData<List<AgricultureQuestion>> getAllAgricultureQuestions() throws ExecutionException, InterruptedException {
        Callable<LiveData<List<AgricultureQuestion>>> dataCallable = new Callable<LiveData<List<AgricultureQuestion>>>() {
            @Override
            public LiveData<List<AgricultureQuestion>> call() throws Exception {
                return ygbDatabase.agricultureDao().getAllAgricultureAnswers();
            }
        };

        return YGBDatabase.db_executor.submit(dataCallable).get();
    }

    public void saveSocialDevelopmentQuestion(final SocialDevelopmentQuestion socialDevelopmentQuestion) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.socialDevelopmentDao().saveSocialDevelopmentQuestion(socialDevelopmentQuestion);
            }
        });
    }

    public LiveData<List<SocialDevelopmentQuestion>> getAllSocialDevelopmentQuestions() throws ExecutionException, InterruptedException {
        Callable<LiveData<List<SocialDevelopmentQuestion>>> liveDataCallable = new Callable<LiveData<List<SocialDevelopmentQuestion>>>() {
            @Override
            public LiveData<List<SocialDevelopmentQuestion>> call() throws Exception {
                return ygbDatabase.socialDevelopmentDao().getAllSocialDevelopmentQuestions();
            }
        };

        return YGBDatabase.db_executor.submit(liveDataCallable).get();
    }

    public void saveWaterEnvironmentQuestion(final WaterEnvironmentQuestion question) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.waterEnvironmentQuestionDao().saveWaterEnvironmentQuestion(question);
            }
        });
    }

    public LiveData<List<WaterEnvironmentQuestion>> getAllWaterEnvironmentQuestions() throws ExecutionException, InterruptedException {
        Callable<LiveData<List<WaterEnvironmentQuestion>>> callable = new Callable<LiveData<List<WaterEnvironmentQuestion>>>() {
            @Override
            public LiveData<List<WaterEnvironmentQuestion>> call() throws Exception {
                return ygbDatabase.waterEnvironmentQuestionDao().getAllWaterEnvironmentQuestions();
            }
        };
        return YGBDatabase.db_executor.submit(callable).get();
    }

    public void saveBudgetInformationForm(final BudgetInformationForm informationForm) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.budgetInformationFormDao().saveBudgetInformationForm(informationForm);
            }
        });
    }

    public LiveData<List<BudgetInformationForm>> getAllBudgetInformationForms() throws ExecutionException, InterruptedException {
        Callable<LiveData<List<BudgetInformationForm>>> callable = new Callable<LiveData<List<BudgetInformationForm>>>() {
            @Override
            public LiveData<List<BudgetInformationForm>> call() throws Exception {
                return ygbDatabase.budgetInformationFormDao().getAllBudgetInformation();
            }
        };

        return YGBDatabase.db_executor.submit(callable).get();
    }

    public void insertHealthQuestion(final HealthQuestion healthQuestion) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.healthQuestionDao().insertHealthQuestion(healthQuestion);
            }
        });
    }
}
