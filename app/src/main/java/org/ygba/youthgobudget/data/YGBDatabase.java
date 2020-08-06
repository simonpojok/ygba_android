package org.ygba.youthgobudget.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationForm;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationFormDao;
import org.ygba.youthgobudget.data.education.EducationQuestion;
import org.ygba.youthgobudget.data.education.EducationQuestionDao;
import org.ygba.youthgobudget.data.health.HealthQuestion;
import org.ygba.youthgobudget.data.health.HealthQuestionDao;
import org.ygba.youthgobudget.data.helpers.district.District;
import org.ygba.youthgobudget.data.helpers.district.DistrictDao;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCounty;
import org.ygba.youthgobudget.data.helpers.sub_county.SubCountyDao;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentDao;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestionDao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {
        AgricultureQuestion.class,
        EducationQuestion.class,
        SocialDevelopmentQuestion.class,
        WaterEnvironmentQuestion.class,
        BudgetInformationForm.class,
        HealthQuestion.class,
        District.class,
        SubCounty.class
}, version = 1, exportSchema = false)
public abstract class YGBDatabase extends RoomDatabase {
    private static YGBDatabase INSTANCE;
    public abstract AgricultureDao agricultureDao();
    public abstract SocialDevelopmentDao socialDevelopmentDao();
    public abstract EducationQuestionDao educationQuestionDao();
    public abstract WaterEnvironmentQuestionDao waterEnvironmentQuestionDao();
    public abstract BudgetInformationFormDao budgetInformationFormDao();
    public abstract HealthQuestionDao healthQuestionDao();
    public abstract DistrictDao districtDao();
    public abstract SubCountyDao subCountyDao();


    public static final int NUMBER_OF_THREADS = 5;
    public static final ExecutorService db_executor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);


    public static YGBDatabase getInstance(Context context) {
        if (INSTANCE == null ) {
           synchronized (YGBDatabase.class) {
               if (INSTANCE == null) {
                   INSTANCE = Room.databaseBuilder(context.getApplicationContext(), YGBDatabase.class, "ygba-db").build();
               }
           }
        }
        return INSTANCE;
    }
}
