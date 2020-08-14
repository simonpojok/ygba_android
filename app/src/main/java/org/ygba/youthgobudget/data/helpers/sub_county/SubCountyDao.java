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

    @Query("SELECT * FROM " + SubCountyConstants.TABLE_NAME + " WHERE " + SubCountyConstants.SUB_COUNTY_ID_COLUMN + " =:id")
    SubCounty getSubCountyById(int id);

    @Query(
            "SELECT * FROm " + SubCountyConstants.TABLE_NAME + " WHERE " + SubCountyConstants.DISTRICT_ID_COLUMN + " =:districtId"
    )
    List<SubCounty> getSubCountyByDistrictId(int districtId);
}
