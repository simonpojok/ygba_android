package org.ygba.youthgobudget;

import androidx.lifecycle.LiveData;

import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationForm;
import org.ygba.youthgobudget.data.education.EducationQuestion;
import org.ygba.youthgobudget.data.health.HealthQuestion;
import org.ygba.youthgobudget.data.helpers.district.District;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;
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

    public List<HealthQuestion> getHealthQuestion4BackUp() throws ExecutionException, InterruptedException {
        Callable<List<HealthQuestion>> callable = new Callable<List<HealthQuestion>>() {
            @Override
            public List<HealthQuestion> call() throws Exception {
                return ygbDatabase.healthQuestionDao().getHealthQuestion(true);
            }
        };

        return YGBDatabase.db_executor.submit(callable).get();
    }

    public List<EducationQuestion> getEducationQuestion4BackUp() throws ExecutionException, InterruptedException {
        Callable<List<EducationQuestion>> listCallable = new Callable<List<EducationQuestion>>() {
            @Override
            public List<EducationQuestion> call() throws Exception {
                return ygbDatabase.educationQuestionDao().getEducationQuestionForBackUp(true);
            }
        };
        return YGBDatabase.db_executor.submit(listCallable).get();
    }

    public void saveEducationQuestion(final EducationQuestion educationQuestion) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                ygbDatabase.educationQuestionDao().saveEducationQuestion(educationQuestion);
            }
        });
    }

    public List<WaterEnvironmentQuestion> getWaterEnvironmentForBackUp() throws ExecutionException, InterruptedException {
        Callable<List<WaterEnvironmentQuestion>> callable = new Callable<List<WaterEnvironmentQuestion>>() {
            @Override
            public List<WaterEnvironmentQuestion> call() throws Exception {
                return ygbDatabase.waterEnvironmentQuestionDao().getWaterEnvironmentForBackUp();
            }
        };
        return YGBDatabase.db_executor.submit(callable).get();
    }

    public void getWaterAndEnvironmentQuestionAndDelete(int primaryKey) {
        try {
            final WaterEnvironmentQuestion waterEnvironmentQuestion = getWaterAndEnvironmentQuestionByPrimaryKey(primaryKey);
            YGBDatabase.db_executor.execute(new Runnable() {
                @Override
                public void run() {
                    ygbDatabase.waterEnvironmentQuestionDao().deleteWaterAndEnvironmentQuestion(waterEnvironmentQuestion);
                }
            });
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WaterEnvironmentQuestion getWaterAndEnvironmentQuestionByPrimaryKey(final int primaryKey) throws ExecutionException, InterruptedException {
        Callable<WaterEnvironmentQuestion> callable = new Callable<WaterEnvironmentQuestion>() {
            @Override
            public WaterEnvironmentQuestion call() throws Exception {
                return ygbDatabase.waterEnvironmentQuestionDao().getWaterAndEnvironmentById(primaryKey);
            }
        };
        return YGBDatabase.db_executor.submit(callable).get();
    }

    public  void getAgricultureQuestionByIdAndDelete(int primaryKey) {
        try {
            final AgricultureQuestion agricultureQuestion = getAgricultureQuestionById(primaryKey);
            if (agricultureQuestion != null) {
                YGBDatabase.db_executor.execute(new Runnable() {
                    @Override
                    public void run() {
                        ygbDatabase.agricultureDao().deleteAgricultureQuestion(agricultureQuestion);
                    }
                });
            }
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public AgricultureQuestion getAgricultureQuestionById(final int primaryKey) throws ExecutionException, InterruptedException {
        Callable<AgricultureQuestion> callable = new Callable<AgricultureQuestion>() {
            @Override
            public AgricultureQuestion call() throws Exception {
                return ygbDatabase.agricultureDao().getAgricultureQuestionById(primaryKey);
            }
        };
        return YGBDatabase.db_executor.submit(callable).get();
    }

    public List<District> getDistrictList() throws ExecutionException, InterruptedException {
        Callable<List<District>> callable = new Callable<List<District>>() {
            @Override
            public List<District> call() throws Exception {
                return ygbDatabase.districtDao().getAllDistricts();
            }
        };

        return YGBDatabase.db_executor.submit(callable).get();
    }

    public List<SubCounty> getSubCountyByDistrict(final int districtId) throws ExecutionException, InterruptedException {
        Callable<List<SubCounty>> callable = new Callable<List<SubCounty>>() {
            @Override
            public List<SubCounty> call() throws Exception {
                return ygbDatabase.subCountyDao().getSubCountyByDistrictId(districtId);
            }
        };
        return YGBDatabase.db_executor.submit(callable).get();
    }
}
