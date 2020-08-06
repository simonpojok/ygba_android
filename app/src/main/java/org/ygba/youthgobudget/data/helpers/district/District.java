package org.ygba.youthgobudget.data.helpers.district;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = DistrictConstants.TABLE_NAME)
public class District {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DistrictConstants.COLUMN_PRIMARY_KEY)
    private int primaryKey;

    @ColumnInfo(name = DistrictConstants.COLUMN_DISTRICT_NAME)
    private String name;

    @ColumnInfo(name = DistrictConstants.COLUMN_REGION_NAME)
    private String region;

    @ColumnInfo(name = DistrictConstants.COLUMN_REGION_ID)
    private int region_id;

    @ColumnInfo(name = DistrictConstants.COLUMN_ID)
    private int id;

    public District(String name, String region, int region_id, int id) {
        this.name = name;
        this.region = region;
        this.region_id = region_id;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
