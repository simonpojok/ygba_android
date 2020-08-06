package org.ygba.youthgobudget.data.helpers.sub_county;

import androidx.room.ColumnInfo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface SubCountyDao {
    @Insert
    void saveSubCounty(SubCounty subCounty);

    @Query("SELECT * FROM " + SubCountyConstants.TABLE_NAME)
    List<SubCounty> getAllSubCounty();
}
