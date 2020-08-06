package org.ygba.youthgobudget.data.helpers.sub_county;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = SubCountyConstants.TABLE_NAME)
public class SubCounty {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = SubCountyConstants.PRIMARY_KEY_COLUMN)
    private int primaryKey;

    @ColumnInfo(name = SubCountyConstants.SUB_COUNTY_NAME)
    private String name;

    @ColumnInfo(name = SubCountyConstants.DISTRICT_NAME_COLUMN)
    private String district;

    @ColumnInfo(name = SubCountyConstants.DISTRICT_ID_COLUMN)
    private int district_id;

    @ColumnInfo(name = SubCountyConstants.SUB_COUNTY_ID_COLUMN)
    private int id;

    public SubCounty(String name, String district, int district_id, int id) {
        this.name = name;
        this.district = district;
        this.district_id = district_id;
        this.id = id;
    }

    public int getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(int primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
