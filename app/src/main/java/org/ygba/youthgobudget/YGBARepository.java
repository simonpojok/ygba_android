package org.ygba.youthgobudget;

import org.ygba.youthgobudget.data.YGBDatabase;

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
}
