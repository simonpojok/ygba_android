package org.ygba.youthgobudget;

import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.agriculture.AgricultureQuestion;

public class YGBARepository {
    private static YGBARepository INSTANCE;
    private YGBDatabase ygbDatabase;

    private YGBARepository(YGBDatabase ygbDatabase) {
        this.ygbDatabase = ygbDatabase;
    }

    private YGBARepository getInstance(YGBDatabase ygbDatabase){
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
}
