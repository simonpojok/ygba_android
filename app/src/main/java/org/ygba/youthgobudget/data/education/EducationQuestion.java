package org.ygba.youthgobudget.data.education;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = EducationQuestionConstants.TABLE_NAME)
public class EducationQuestion {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EducationQuestionConstants.PRIMARY_KEY)
    private int id;



    public static class Builder {
        private final EducationQuestion INSTANCE;
        public Builder() {
            INSTANCE = new EducationQuestion();
        }
    }

    @Ignore
    private EducationQuestion() {
    }
}
