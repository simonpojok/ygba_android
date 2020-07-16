package org.ygba.youthgobudget.data.budget_information;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BudgetInformationFormDao_Impl implements BudgetInformationFormDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<BudgetInformationForm> __insertionAdapterOfBudgetInformationForm;

  public BudgetInformationFormDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfBudgetInformationForm = new EntityInsertionAdapter<BudgetInformationForm>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `budget_information` (`primary_key`,`fin_year`,`admin_approved`,`admin_percentage`,`fin_approved`,`fin_percentage`,`statu_approved`,`statu_per`,`pro_approved`,`pro_perc`,`health_approved`,`health_percentage`,`education_approved`,`education_percentage`,`road_approved`,`road_percentagae`,`water_approved`,`water_percentage`,`natural_approved`,`natural_percentage`,`com_approved`,`com_percentage`,`planning_approved`,`planning_percentage`,`internal_audit`,`internal_percentage`,`trade_approved`,`trade_percentage`,`total_approved`,`total_percentage`,`wage_approved_b`,`wage_approved_a`,`none_wage_approved_d`,`none_wage_perce`,`domestic_approved`,`domestic_percentage`,`ext_approved`,`ext_percentage`,`dis_name`,`service_name`,`com_wish_name`,`dis_1_sector`,`sub_1_sect`,`fin_1_sec`,`service_1_sector`,`community_wishes_1`,`dis_2_sector`,`sub_2_sect`,`fin_2_sec`,`service_2_sector`,`community_wishes_2`,`dis_3_sector`,`sub_3_sect`,`fin_3_sec`,`service_3_sector`,`community_wishes_3`,`dis_4_sector`,`sub_4_sect`,`fin_4_sec`,`service_4_sector`,`community_wishes_4`,`dis_5_sector`,`sub_5_sect`,`fin_5_sec`,`service_5_sector`,`community_wishes_5`,`dis_6_sector`,`sub_6_sect`,`fin_6_sec`,`service_6_sector`,`community_wishes_6`,`dis_7_sector`,`sub_7_sect`,`fin_7_sec`,`service_7_sector`,`community_wishes_7`,`stored_locally`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BudgetInformationForm value) {
        stmt.bindLong(1, value.getPrimaryKey());
        if (value.getFinancialYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFinancialYear());
        }
        stmt.bindLong(3, value.getAdminApprovedBudget());
        stmt.bindLong(4, value.getAdminPercentage());
        stmt.bindLong(5, value.getFinanceApprovedBudget());
        stmt.bindLong(6, value.getFinancePercentage());
        stmt.bindLong(7, value.getStatutoryBodiesApprovedBudget());
        stmt.bindLong(8, value.getStatutoryBodiesPercentage());
        stmt.bindLong(9, value.getProductionApprovedBudget());
        stmt.bindLong(10, value.getProductionPercentage());
        stmt.bindLong(11, value.getHealthApprovedBudget());
        stmt.bindLong(12, value.getHealthPercentage());
        stmt.bindLong(13, value.getEducationApprovedBudget());
        stmt.bindLong(14, value.getEducationPercentage());
        stmt.bindLong(15, value.getRoadEngineeringApprovedBudget());
        stmt.bindLong(16, value.getRoadEngineeringPercentage());
        stmt.bindLong(17, value.getWaterApprovedBudget());
        stmt.bindLong(18, value.getWaterPercentage());
        stmt.bindLong(19, value.getNaturalApprovedBudget());
        stmt.bindLong(20, value.getNaturalPercentage());
        stmt.bindLong(21, value.getCommunityApprovedBudget());
        stmt.bindLong(22, value.getCommunityPercentage());
        stmt.bindLong(23, value.getPlanningApprovedBudget());
        stmt.bindLong(24, value.getPlanningPercentage());
        stmt.bindLong(25, value.getInternalApprovedBudget());
        stmt.bindLong(26, value.getInternalPercentage());
        stmt.bindLong(27, value.getTradeApprovedBudget());
        stmt.bindLong(28, value.getTradePercentage());
        stmt.bindLong(29, value.getTotalApprovedBudget());
        stmt.bindLong(30, value.getTotalPercentage());
        stmt.bindLong(31, value.getWageApprovedBudget());
        stmt.bindLong(32, value.getWagePercentage());
        stmt.bindLong(33, value.getNoneWageApprovedBudget());
        stmt.bindLong(34, value.getNoneWagePercentage());
        stmt.bindLong(35, value.getDomesticApprovedBudget());
        stmt.bindLong(36, value.getDomesticPercentage());
        stmt.bindLong(37, value.getExtApprovedBudget());
        stmt.bindLong(38, value.getExtPercentage());
        if (value.getDistrictName() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getDistrictName());
        }
        if (value.getServiceName() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getServiceName());
        }
        if (value.getCommunityWishName() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getCommunityWishName());
        }
        stmt.bindLong(42, value.getDistrict1Sector());
        stmt.bindLong(43, value.getSubCounty1Sector());
        if (value.getFinancialYear1Sector() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getFinancialYear1Sector());
        }
        if (value.getService1Sector() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getService1Sector());
        }
        if (value.getCommunityWishes1Sector() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getCommunityWishes1Sector());
        }
        stmt.bindLong(47, value.getDistrict2Sector());
        stmt.bindLong(48, value.getSubCounty2Sector());
        if (value.getFinancialYear2Sector() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getFinancialYear2Sector());
        }
        if (value.getService2Sector() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getService2Sector());
        }
        if (value.getCommunityWishes2Sector() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getCommunityWishes2Sector());
        }
        stmt.bindLong(52, value.getDistrict3Sector());
        stmt.bindLong(53, value.getSubCounty3Sector());
        if (value.getFinancialYear3Sector() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getFinancialYear3Sector());
        }
        if (value.getService3Sector() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getService3Sector());
        }
        if (value.getCommunityWishes3Sector() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getCommunityWishes3Sector());
        }
        stmt.bindLong(57, value.getDistrict4Sector());
        stmt.bindLong(58, value.getSubCounty4Sector());
        if (value.getFinancialYear4Sector() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getFinancialYear4Sector());
        }
        if (value.getService4Sector() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getService4Sector());
        }
        if (value.getCommunityWishes4Sector() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getCommunityWishes4Sector());
        }
        stmt.bindLong(62, value.getDistrict5Sector());
        stmt.bindLong(63, value.getSubCounty5Sector());
        if (value.getFinancialYear5Sector() == null) {
          stmt.bindNull(64);
        } else {
          stmt.bindString(64, value.getFinancialYear5Sector());
        }
        if (value.getService5Sector() == null) {
          stmt.bindNull(65);
        } else {
          stmt.bindString(65, value.getService5Sector());
        }
        if (value.getCommunityWishes5Sector() == null) {
          stmt.bindNull(66);
        } else {
          stmt.bindString(66, value.getCommunityWishes5Sector());
        }
        stmt.bindLong(67, value.getDistrict6Sector());
        stmt.bindLong(68, value.getSubCounty6Sector());
        if (value.getFinancialYear6Sector() == null) {
          stmt.bindNull(69);
        } else {
          stmt.bindString(69, value.getFinancialYear6Sector());
        }
        if (value.getService6Sector() == null) {
          stmt.bindNull(70);
        } else {
          stmt.bindString(70, value.getService6Sector());
        }
        if (value.getCommunityWishes6Sector() == null) {
          stmt.bindNull(71);
        } else {
          stmt.bindString(71, value.getCommunityWishes6Sector());
        }
        stmt.bindLong(72, value.getDistrict7Sector());
        stmt.bindLong(73, value.getSubCounty7Sector());
        if (value.getFinancialYear7Sector() == null) {
          stmt.bindNull(74);
        } else {
          stmt.bindString(74, value.getFinancialYear7Sector());
        }
        if (value.getService7Sector() == null) {
          stmt.bindNull(75);
        } else {
          stmt.bindString(75, value.getService7Sector());
        }
        if (value.getCommunityWishes7Sector() == null) {
          stmt.bindNull(76);
        } else {
          stmt.bindString(76, value.getCommunityWishes7Sector());
        }
        final int _tmp;
        _tmp = value.isStoredLocally() ? 1 : 0;
        stmt.bindLong(77, _tmp);
      }
    };
  }

  @Override
  public void saveBudgetInformationForm(final BudgetInformationForm informationForm) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfBudgetInformationForm.insert(informationForm);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<BudgetInformationForm>> getAllBudgetInformation() {
    final String _sql = "SELECT * FROM budget_information";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"budget_information"}, false, new Callable<List<BudgetInformationForm>>() {
      @Override
      public List<BudgetInformationForm> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
          final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_year");
          final int _cursorIndexOfAdminApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "admin_approved");
          final int _cursorIndexOfAdminPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "admin_percentage");
          final int _cursorIndexOfFinanceApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_approved");
          final int _cursorIndexOfFinancePercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_percentage");
          final int _cursorIndexOfStatutoryBodiesApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "statu_approved");
          final int _cursorIndexOfStatutoryBodiesPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "statu_per");
          final int _cursorIndexOfProductionApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_approved");
          final int _cursorIndexOfProductionPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "pro_perc");
          final int _cursorIndexOfHealthApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "health_approved");
          final int _cursorIndexOfHealthPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "health_percentage");
          final int _cursorIndexOfEducationApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "education_approved");
          final int _cursorIndexOfEducationPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "education_percentage");
          final int _cursorIndexOfRoadEngineeringApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "road_approved");
          final int _cursorIndexOfRoadEngineeringPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "road_percentagae");
          final int _cursorIndexOfWaterApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "water_approved");
          final int _cursorIndexOfWaterPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "water_percentage");
          final int _cursorIndexOfNaturalApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "natural_approved");
          final int _cursorIndexOfNaturalPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "natural_percentage");
          final int _cursorIndexOfCommunityApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "com_approved");
          final int _cursorIndexOfCommunityPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "com_percentage");
          final int _cursorIndexOfPlanningApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "planning_approved");
          final int _cursorIndexOfPlanningPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "planning_percentage");
          final int _cursorIndexOfInternalApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "internal_audit");
          final int _cursorIndexOfInternalPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "internal_percentage");
          final int _cursorIndexOfTradeApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "trade_approved");
          final int _cursorIndexOfTradePercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "trade_percentage");
          final int _cursorIndexOfTotalApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "total_approved");
          final int _cursorIndexOfTotalPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "total_percentage");
          final int _cursorIndexOfWageApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "wage_approved_b");
          final int _cursorIndexOfWagePercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "wage_approved_a");
          final int _cursorIndexOfNoneWageApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "none_wage_approved_d");
          final int _cursorIndexOfNoneWagePercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "none_wage_perce");
          final int _cursorIndexOfDomesticApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "domestic_approved");
          final int _cursorIndexOfDomesticPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "domestic_percentage");
          final int _cursorIndexOfExtApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "ext_approved");
          final int _cursorIndexOfExtPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "ext_percentage");
          final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_name");
          final int _cursorIndexOfServiceName = CursorUtil.getColumnIndexOrThrow(_cursor, "service_name");
          final int _cursorIndexOfCommunityWishName = CursorUtil.getColumnIndexOrThrow(_cursor, "com_wish_name");
          final int _cursorIndexOfDistrict1Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_1_sector");
          final int _cursorIndexOfSubCounty1Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_1_sect");
          final int _cursorIndexOfFinancialYear1Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_1_sec");
          final int _cursorIndexOfService1Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_1_sector");
          final int _cursorIndexOfCommunityWishes1Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_1");
          final int _cursorIndexOfDistrict2Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_2_sector");
          final int _cursorIndexOfSubCounty2Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_2_sect");
          final int _cursorIndexOfFinancialYear2Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_2_sec");
          final int _cursorIndexOfService2Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_2_sector");
          final int _cursorIndexOfCommunityWishes2Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_2");
          final int _cursorIndexOfDistrict3Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_3_sector");
          final int _cursorIndexOfSubCounty3Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_3_sect");
          final int _cursorIndexOfFinancialYear3Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_3_sec");
          final int _cursorIndexOfService3Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_3_sector");
          final int _cursorIndexOfCommunityWishes3Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_3");
          final int _cursorIndexOfDistrict4Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_4_sector");
          final int _cursorIndexOfSubCounty4Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_4_sect");
          final int _cursorIndexOfFinancialYear4Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_4_sec");
          final int _cursorIndexOfService4Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_4_sector");
          final int _cursorIndexOfCommunityWishes4Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_4");
          final int _cursorIndexOfDistrict5Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_5_sector");
          final int _cursorIndexOfSubCounty5Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_5_sect");
          final int _cursorIndexOfFinancialYear5Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_5_sec");
          final int _cursorIndexOfService5Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_5_sector");
          final int _cursorIndexOfCommunityWishes5Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_5");
          final int _cursorIndexOfDistrict6Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_6_sector");
          final int _cursorIndexOfSubCounty6Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_6_sect");
          final int _cursorIndexOfFinancialYear6Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_6_sec");
          final int _cursorIndexOfService6Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_6_sector");
          final int _cursorIndexOfCommunityWishes6Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_6");
          final int _cursorIndexOfDistrict7Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "dis_7_sector");
          final int _cursorIndexOfSubCounty7Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_7_sect");
          final int _cursorIndexOfFinancialYear7Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "fin_7_sec");
          final int _cursorIndexOfService7Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "service_7_sector");
          final int _cursorIndexOfCommunityWishes7Sector = CursorUtil.getColumnIndexOrThrow(_cursor, "community_wishes_7");
          final int _cursorIndexOfStoredLocally = CursorUtil.getColumnIndexOrThrow(_cursor, "stored_locally");
          final List<BudgetInformationForm> _result = new ArrayList<BudgetInformationForm>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final BudgetInformationForm _item;
            final String _tmpFinancialYear;
            _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
            final int _tmpAdminApprovedBudget;
            _tmpAdminApprovedBudget = _cursor.getInt(_cursorIndexOfAdminApprovedBudget);
            final int _tmpAdminPercentage;
            _tmpAdminPercentage = _cursor.getInt(_cursorIndexOfAdminPercentage);
            final int _tmpFinanceApprovedBudget;
            _tmpFinanceApprovedBudget = _cursor.getInt(_cursorIndexOfFinanceApprovedBudget);
            final int _tmpFinancePercentage;
            _tmpFinancePercentage = _cursor.getInt(_cursorIndexOfFinancePercentage);
            final int _tmpStatutoryBodiesApprovedBudget;
            _tmpStatutoryBodiesApprovedBudget = _cursor.getInt(_cursorIndexOfStatutoryBodiesApprovedBudget);
            final int _tmpStatutoryBodiesPercentage;
            _tmpStatutoryBodiesPercentage = _cursor.getInt(_cursorIndexOfStatutoryBodiesPercentage);
            final int _tmpProductionApprovedBudget;
            _tmpProductionApprovedBudget = _cursor.getInt(_cursorIndexOfProductionApprovedBudget);
            final int _tmpProductionPercentage;
            _tmpProductionPercentage = _cursor.getInt(_cursorIndexOfProductionPercentage);
            final int _tmpHealthApprovedBudget;
            _tmpHealthApprovedBudget = _cursor.getInt(_cursorIndexOfHealthApprovedBudget);
            final int _tmpHealthPercentage;
            _tmpHealthPercentage = _cursor.getInt(_cursorIndexOfHealthPercentage);
            final int _tmpEducationApprovedBudget;
            _tmpEducationApprovedBudget = _cursor.getInt(_cursorIndexOfEducationApprovedBudget);
            final int _tmpEducationPercentage;
            _tmpEducationPercentage = _cursor.getInt(_cursorIndexOfEducationPercentage);
            final int _tmpRoadEngineeringApprovedBudget;
            _tmpRoadEngineeringApprovedBudget = _cursor.getInt(_cursorIndexOfRoadEngineeringApprovedBudget);
            final int _tmpRoadEngineeringPercentage;
            _tmpRoadEngineeringPercentage = _cursor.getInt(_cursorIndexOfRoadEngineeringPercentage);
            final int _tmpWaterApprovedBudget;
            _tmpWaterApprovedBudget = _cursor.getInt(_cursorIndexOfWaterApprovedBudget);
            final int _tmpWaterPercentage;
            _tmpWaterPercentage = _cursor.getInt(_cursorIndexOfWaterPercentage);
            final int _tmpNaturalApprovedBudget;
            _tmpNaturalApprovedBudget = _cursor.getInt(_cursorIndexOfNaturalApprovedBudget);
            final int _tmpNaturalPercentage;
            _tmpNaturalPercentage = _cursor.getInt(_cursorIndexOfNaturalPercentage);
            final int _tmpCommunityApprovedBudget;
            _tmpCommunityApprovedBudget = _cursor.getInt(_cursorIndexOfCommunityApprovedBudget);
            final int _tmpCommunityPercentage;
            _tmpCommunityPercentage = _cursor.getInt(_cursorIndexOfCommunityPercentage);
            final int _tmpPlanningApprovedBudget;
            _tmpPlanningApprovedBudget = _cursor.getInt(_cursorIndexOfPlanningApprovedBudget);
            final int _tmpPlanningPercentage;
            _tmpPlanningPercentage = _cursor.getInt(_cursorIndexOfPlanningPercentage);
            final int _tmpInternalApprovedBudget;
            _tmpInternalApprovedBudget = _cursor.getInt(_cursorIndexOfInternalApprovedBudget);
            final int _tmpInternalPercentage;
            _tmpInternalPercentage = _cursor.getInt(_cursorIndexOfInternalPercentage);
            final int _tmpTradeApprovedBudget;
            _tmpTradeApprovedBudget = _cursor.getInt(_cursorIndexOfTradeApprovedBudget);
            final int _tmpTradePercentage;
            _tmpTradePercentage = _cursor.getInt(_cursorIndexOfTradePercentage);
            final int _tmpTotalApprovedBudget;
            _tmpTotalApprovedBudget = _cursor.getInt(_cursorIndexOfTotalApprovedBudget);
            final int _tmpTotalPercentage;
            _tmpTotalPercentage = _cursor.getInt(_cursorIndexOfTotalPercentage);
            final int _tmpWageApprovedBudget;
            _tmpWageApprovedBudget = _cursor.getInt(_cursorIndexOfWageApprovedBudget);
            final int _tmpWagePercentage;
            _tmpWagePercentage = _cursor.getInt(_cursorIndexOfWagePercentage);
            final int _tmpNoneWageApprovedBudget;
            _tmpNoneWageApprovedBudget = _cursor.getInt(_cursorIndexOfNoneWageApprovedBudget);
            final int _tmpNoneWagePercentage;
            _tmpNoneWagePercentage = _cursor.getInt(_cursorIndexOfNoneWagePercentage);
            final int _tmpDomesticApprovedBudget;
            _tmpDomesticApprovedBudget = _cursor.getInt(_cursorIndexOfDomesticApprovedBudget);
            final int _tmpDomesticPercentage;
            _tmpDomesticPercentage = _cursor.getInt(_cursorIndexOfDomesticPercentage);
            final int _tmpExtApprovedBudget;
            _tmpExtApprovedBudget = _cursor.getInt(_cursorIndexOfExtApprovedBudget);
            final int _tmpExtPercentage;
            _tmpExtPercentage = _cursor.getInt(_cursorIndexOfExtPercentage);
            final String _tmpDistrictName;
            _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
            final String _tmpServiceName;
            _tmpServiceName = _cursor.getString(_cursorIndexOfServiceName);
            final String _tmpCommunityWishName;
            _tmpCommunityWishName = _cursor.getString(_cursorIndexOfCommunityWishName);
            final int _tmpDistrict1Sector;
            _tmpDistrict1Sector = _cursor.getInt(_cursorIndexOfDistrict1Sector);
            final int _tmpSubCounty1Sector;
            _tmpSubCounty1Sector = _cursor.getInt(_cursorIndexOfSubCounty1Sector);
            final String _tmpFinancialYear1Sector;
            _tmpFinancialYear1Sector = _cursor.getString(_cursorIndexOfFinancialYear1Sector);
            final String _tmpService1Sector;
            _tmpService1Sector = _cursor.getString(_cursorIndexOfService1Sector);
            final String _tmpCommunityWishes1Sector;
            _tmpCommunityWishes1Sector = _cursor.getString(_cursorIndexOfCommunityWishes1Sector);
            final int _tmpDistrict2Sector;
            _tmpDistrict2Sector = _cursor.getInt(_cursorIndexOfDistrict2Sector);
            final int _tmpSubCounty2Sector;
            _tmpSubCounty2Sector = _cursor.getInt(_cursorIndexOfSubCounty2Sector);
            final String _tmpFinancialYear2Sector;
            _tmpFinancialYear2Sector = _cursor.getString(_cursorIndexOfFinancialYear2Sector);
            final String _tmpService2Sector;
            _tmpService2Sector = _cursor.getString(_cursorIndexOfService2Sector);
            final String _tmpCommunityWishes2Sector;
            _tmpCommunityWishes2Sector = _cursor.getString(_cursorIndexOfCommunityWishes2Sector);
            final int _tmpDistrict3Sector;
            _tmpDistrict3Sector = _cursor.getInt(_cursorIndexOfDistrict3Sector);
            final int _tmpSubCounty3Sector;
            _tmpSubCounty3Sector = _cursor.getInt(_cursorIndexOfSubCounty3Sector);
            final String _tmpFinancialYear3Sector;
            _tmpFinancialYear3Sector = _cursor.getString(_cursorIndexOfFinancialYear3Sector);
            final String _tmpService3Sector;
            _tmpService3Sector = _cursor.getString(_cursorIndexOfService3Sector);
            final String _tmpCommunityWishes3Sector;
            _tmpCommunityWishes3Sector = _cursor.getString(_cursorIndexOfCommunityWishes3Sector);
            final int _tmpDistrict4Sector;
            _tmpDistrict4Sector = _cursor.getInt(_cursorIndexOfDistrict4Sector);
            final int _tmpSubCounty4Sector;
            _tmpSubCounty4Sector = _cursor.getInt(_cursorIndexOfSubCounty4Sector);
            final String _tmpFinancialYear4Sector;
            _tmpFinancialYear4Sector = _cursor.getString(_cursorIndexOfFinancialYear4Sector);
            final String _tmpService4Sector;
            _tmpService4Sector = _cursor.getString(_cursorIndexOfService4Sector);
            final String _tmpCommunityWishes4Sector;
            _tmpCommunityWishes4Sector = _cursor.getString(_cursorIndexOfCommunityWishes4Sector);
            final int _tmpDistrict5Sector;
            _tmpDistrict5Sector = _cursor.getInt(_cursorIndexOfDistrict5Sector);
            final int _tmpSubCounty5Sector;
            _tmpSubCounty5Sector = _cursor.getInt(_cursorIndexOfSubCounty5Sector);
            final String _tmpFinancialYear5Sector;
            _tmpFinancialYear5Sector = _cursor.getString(_cursorIndexOfFinancialYear5Sector);
            final String _tmpService5Sector;
            _tmpService5Sector = _cursor.getString(_cursorIndexOfService5Sector);
            final String _tmpCommunityWishes5Sector;
            _tmpCommunityWishes5Sector = _cursor.getString(_cursorIndexOfCommunityWishes5Sector);
            final int _tmpDistrict6Sector;
            _tmpDistrict6Sector = _cursor.getInt(_cursorIndexOfDistrict6Sector);
            final int _tmpSubCounty6Sector;
            _tmpSubCounty6Sector = _cursor.getInt(_cursorIndexOfSubCounty6Sector);
            final String _tmpFinancialYear6Sector;
            _tmpFinancialYear6Sector = _cursor.getString(_cursorIndexOfFinancialYear6Sector);
            final String _tmpService6Sector;
            _tmpService6Sector = _cursor.getString(_cursorIndexOfService6Sector);
            final String _tmpCommunityWishes6Sector;
            _tmpCommunityWishes6Sector = _cursor.getString(_cursorIndexOfCommunityWishes6Sector);
            final int _tmpDistrict7Sector;
            _tmpDistrict7Sector = _cursor.getInt(_cursorIndexOfDistrict7Sector);
            final int _tmpSubCounty7Sector;
            _tmpSubCounty7Sector = _cursor.getInt(_cursorIndexOfSubCounty7Sector);
            final String _tmpFinancialYear7Sector;
            _tmpFinancialYear7Sector = _cursor.getString(_cursorIndexOfFinancialYear7Sector);
            final String _tmpService7Sector;
            _tmpService7Sector = _cursor.getString(_cursorIndexOfService7Sector);
            final String _tmpCommunityWishes7Sector;
            _tmpCommunityWishes7Sector = _cursor.getString(_cursorIndexOfCommunityWishes7Sector);
            _item = new BudgetInformationForm(_tmpFinancialYear,_tmpAdminApprovedBudget,_tmpAdminPercentage,_tmpFinanceApprovedBudget,_tmpFinancePercentage,_tmpStatutoryBodiesApprovedBudget,_tmpStatutoryBodiesPercentage,_tmpProductionApprovedBudget,_tmpProductionPercentage,_tmpHealthApprovedBudget,_tmpHealthPercentage,_tmpEducationApprovedBudget,_tmpEducationPercentage,_tmpRoadEngineeringApprovedBudget,_tmpRoadEngineeringPercentage,_tmpWaterApprovedBudget,_tmpWaterPercentage,_tmpNaturalApprovedBudget,_tmpNaturalPercentage,_tmpCommunityApprovedBudget,_tmpCommunityPercentage,_tmpPlanningApprovedBudget,_tmpPlanningPercentage,_tmpInternalApprovedBudget,_tmpInternalPercentage,_tmpTradeApprovedBudget,_tmpTradePercentage,_tmpTotalApprovedBudget,_tmpTotalPercentage,_tmpWageApprovedBudget,_tmpWagePercentage,_tmpNoneWageApprovedBudget,_tmpNoneWagePercentage,_tmpDomesticApprovedBudget,_tmpDomesticPercentage,_tmpExtApprovedBudget,_tmpExtPercentage,_tmpDistrictName,_tmpServiceName,_tmpCommunityWishName,_tmpDistrict1Sector,_tmpSubCounty1Sector,_tmpFinancialYear1Sector,_tmpService1Sector,_tmpCommunityWishes1Sector,_tmpDistrict2Sector,_tmpSubCounty2Sector,_tmpFinancialYear2Sector,_tmpService2Sector,_tmpCommunityWishes2Sector,_tmpDistrict3Sector,_tmpSubCounty3Sector,_tmpFinancialYear3Sector,_tmpService3Sector,_tmpCommunityWishes3Sector,_tmpDistrict4Sector,_tmpSubCounty4Sector,_tmpFinancialYear4Sector,_tmpService4Sector,_tmpCommunityWishes4Sector,_tmpDistrict5Sector,_tmpSubCounty5Sector,_tmpFinancialYear5Sector,_tmpService5Sector,_tmpCommunityWishes5Sector,_tmpDistrict6Sector,_tmpSubCounty6Sector,_tmpFinancialYear6Sector,_tmpService6Sector,_tmpCommunityWishes6Sector,_tmpDistrict7Sector,_tmpSubCounty7Sector,_tmpFinancialYear7Sector,_tmpService7Sector,_tmpCommunityWishes7Sector);
            final int _tmpPrimaryKey;
            _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
            _item.setPrimaryKey(_tmpPrimaryKey);
            final boolean _tmpStoredLocally;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfStoredLocally);
            _tmpStoredLocally = _tmp != 0;
            _item.setStoredLocally(_tmpStoredLocally);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
