package org.ygba.youthgobudget.data.water_and_environment;

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
public final class WaterEnvironmentQuestionDao_Impl implements WaterEnvironmentQuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WaterEnvironmentQuestion> __insertionAdapterOfWaterEnvironmentQuestion;

  public WaterEnvironmentQuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWaterEnvironmentQuestion = new EntityInsertionAdapter<WaterEnvironmentQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `water_and_env` (`id`,`financial_year`,`date`,`district`,`village`,`parish`,`sub_county`,`agent_name`,`agent_tel`,`q_1_objective`,`q_1_reason`,`q_2_reason`,`q_4_answer`,`q_3_objective`,`q_5_text`,`q_5_sub_1`,`q_5_ws_1`,`q_5_functional_1`,`q_5_none_functional_1`,`q_5_no_ws_available_1`,`q_5_sub_2`,`q_5_ws_2`,`q_5_functional_2`,`q_5_none_functional_2`,`q_5_no_ws_available_2`,`q_5_sub_3`,`q_5_ws_3`,`q_5_functional_3`,`q_5_none_functional_3`,`q_5_no_ws_available_3`,`q_5_sub_4`,`q_5_ws_4`,`q_5_functional_4`,`q_5_none_functional_4`,`q_5_no_ws_available_4`,`q_5_sub_5`,`q_5_ws_5`,`q_5_functional_5`,`q_5_none_functional_5`,`q_5_no_ws_available_5`,`q_5_sub_6`,`q_5_ws_6`,`q_5_functional_6`,`q_5_none_functional_6`,`q_5_no_ws_available_6`,`q_5_objective`,`q_5_objective_reason`,`q_6_wetland_demarcated`,`q_6_village_name_1`,`q_6_1_wetland_1`,`q_6_village_name_2`,`q_6_1_wetland_2`,`q_6_village_name_3`,`q_6_1_wetland_3`,`q_6_village_name_4`,`q_6_1_wetland_4`,`q_6_village_name_5`,`q_6_1_wetland_5`,`q_6_village_name_6`,`q_6_1_wetland_6`,`q_6_2_tree_planting`,`locally_stored`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WaterEnvironmentQuestion value) {
        stmt.bindLong(1, value.getPrimaryKey());
        if (value.getFinancialYear() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFinancialYear());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrict());
        }
        if (value.getVillage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getVillage());
        }
        if (value.getParish() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getParish());
        }
        if (value.getSub_county() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getSub_county());
        }
        if (value.getAgentName() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getAgentName());
        }
        if (value.getAgentTel() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAgentTel());
        }
        final int _tmp;
        _tmp = value.isQuestion1Objective() ? 1 : 0;
        stmt.bindLong(10, _tmp);
        if (value.getQuestion1ObjectiveReason() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getQuestion1ObjectiveReason());
        }
        if (value.getQuestion2Water() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getQuestion2Water());
        }
        if (value.getQuestion4Answer() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getQuestion4Answer());
        }
        final int _tmp_1;
        _tmp_1 = value.getQuestion3Objective() ? 1 : 0;
        stmt.bindLong(14, _tmp_1);
        if (value.getQuestion5Text() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getQuestion5Text());
        }
        if (value.getSubCounty1() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getSubCounty1());
        }
        if (value.getWaterSource1() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getWaterSource1());
        }
        stmt.bindLong(18, value.getQuestion5Functional1());
        stmt.bindLong(19, value.getQuestion5NoneFunctional1());
        stmt.bindLong(20, value.getQuestion5WaterSourceAvailable1());
        if (value.getSubCounty2() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getSubCounty2());
        }
        if (value.getWaterSource2() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getWaterSource2());
        }
        stmt.bindLong(23, value.getQuestion5Functional2());
        stmt.bindLong(24, value.getQuestion5NoneFunctional2());
        stmt.bindLong(25, value.getQuestion5WaterSourceAvailable2());
        if (value.getSubCounty3() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getSubCounty3());
        }
        if (value.getWaterSource3() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getWaterSource3());
        }
        stmt.bindLong(28, value.getQuestion5Functional3());
        stmt.bindLong(29, value.getQuestion5NoneFunctional3());
        stmt.bindLong(30, value.getQuestion5WaterSourceAvailable3());
        if (value.getSubCounty4() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getSubCounty4());
        }
        if (value.getWaterSource4() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getWaterSource4());
        }
        stmt.bindLong(33, value.getQuestion5Functional4());
        stmt.bindLong(34, value.getQuestion5NoneFunctional4());
        stmt.bindLong(35, value.getQuestion5WaterSourceAvailable4());
        if (value.getSubCounty5() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getSubCounty5());
        }
        if (value.getWaterSource5() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getWaterSource5());
        }
        stmt.bindLong(38, value.getQuestion5Functional5());
        stmt.bindLong(39, value.getQuestion5NoneFunctional5());
        stmt.bindLong(40, value.getQuestion5WaterSourceAvailable5());
        if (value.getSubCounty6() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getSubCounty6());
        }
        if (value.getWaterSource6() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getWaterSource6());
        }
        stmt.bindLong(43, value.getQuestion5Functional6());
        stmt.bindLong(44, value.getQuestion5NoneFunctional6());
        stmt.bindLong(45, value.getQuestion5WaterSourceAvailable6());
        final int _tmp_2;
        _tmp_2 = value.isQuestion5Objective() ? 1 : 0;
        stmt.bindLong(46, _tmp_2);
        if (value.getQuestion5ObjectiveReason() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getQuestion5ObjectiveReason());
        }
        if (value.getQuestion6WetLandDemarcated() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getQuestion6WetLandDemarcated());
        }
        if (value.getQuestion6VillageName1() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getQuestion6VillageName1());
        }
        stmt.bindLong(50, value.getQuestion61WetlandUnderDestruction1());
        if (value.getQuestion6VillageName2() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getQuestion6VillageName2());
        }
        stmt.bindLong(52, value.getQuestion61WetlandUnderDestruction2());
        if (value.getQuestion6VillageName3() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getQuestion6VillageName3());
        }
        stmt.bindLong(54, value.getQuestion61WetlandUnderDestruction3());
        if (value.getQuestion6VillageName4() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getQuestion6VillageName4());
        }
        stmt.bindLong(56, value.getQuestion61WetlandUnderDestruction4());
        if (value.getQuestion6VillageName5() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getQuestion6VillageName5());
        }
        stmt.bindLong(58, value.getQuestion61WetlandUnderDestruction5());
        if (value.getQuestion6VillageName6() == null) {
          stmt.bindNull(59);
        } else {
          stmt.bindString(59, value.getQuestion6VillageName6());
        }
        stmt.bindLong(60, value.getQuestion61WetlandUnderDestruction6());
        if (value.getQuestion62TreePlanting() == null) {
          stmt.bindNull(61);
        } else {
          stmt.bindString(61, value.getQuestion62TreePlanting());
        }
        final int _tmp_3;
        _tmp_3 = value.isLocallyStored() ? 1 : 0;
        stmt.bindLong(62, _tmp_3);
      }
    };
  }

  @Override
  public void saveWaterEnvironmentQuestion(final WaterEnvironmentQuestion waterEnvironmentQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWaterEnvironmentQuestion.insert(waterEnvironmentQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<WaterEnvironmentQuestion>> getAllWaterEnvironmentQuestions() {
    final String _sql = "SELECT * FROM water_and_env";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"water_and_env"}, false, new Callable<List<WaterEnvironmentQuestion>>() {
      @Override
      public List<WaterEnvironmentQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "financial_year");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
          final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
          final int _cursorIndexOfSubCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
          final int _cursorIndexOfAgentName = CursorUtil.getColumnIndexOrThrow(_cursor, "agent_name");
          final int _cursorIndexOfAgentTel = CursorUtil.getColumnIndexOrThrow(_cursor, "agent_tel");
          final int _cursorIndexOfQuestion1Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q_1_objective");
          final int _cursorIndexOfQuestion1ObjectiveReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q_1_reason");
          final int _cursorIndexOfQuestion2Water = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_reason");
          final int _cursorIndexOfQuestion4Answer = CursorUtil.getColumnIndexOrThrow(_cursor, "q_4_answer");
          final int _cursorIndexOfQuestion3Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q_3_objective");
          final int _cursorIndexOfQuestion5Text = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_text");
          final int _cursorIndexOfSubCounty1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_1");
          final int _cursorIndexOfWaterSource1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_1");
          final int _cursorIndexOfQuestion5Functional1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_1");
          final int _cursorIndexOfQuestion5NoneFunctional1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_1");
          final int _cursorIndexOfQuestion5WaterSourceAvailable1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_1");
          final int _cursorIndexOfSubCounty2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_2");
          final int _cursorIndexOfWaterSource2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_2");
          final int _cursorIndexOfQuestion5Functional2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_2");
          final int _cursorIndexOfQuestion5NoneFunctional2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_2");
          final int _cursorIndexOfQuestion5WaterSourceAvailable2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_2");
          final int _cursorIndexOfSubCounty3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_3");
          final int _cursorIndexOfWaterSource3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_3");
          final int _cursorIndexOfQuestion5Functional3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_3");
          final int _cursorIndexOfQuestion5NoneFunctional3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_3");
          final int _cursorIndexOfQuestion5WaterSourceAvailable3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_3");
          final int _cursorIndexOfSubCounty4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_4");
          final int _cursorIndexOfWaterSource4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_4");
          final int _cursorIndexOfQuestion5Functional4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_4");
          final int _cursorIndexOfQuestion5NoneFunctional4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_4");
          final int _cursorIndexOfQuestion5WaterSourceAvailable4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_4");
          final int _cursorIndexOfSubCounty5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_5");
          final int _cursorIndexOfWaterSource5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_5");
          final int _cursorIndexOfQuestion5Functional5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_5");
          final int _cursorIndexOfQuestion5NoneFunctional5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_5");
          final int _cursorIndexOfQuestion5WaterSourceAvailable5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_5");
          final int _cursorIndexOfSubCounty6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_6");
          final int _cursorIndexOfWaterSource6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_6");
          final int _cursorIndexOfQuestion5Functional6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_6");
          final int _cursorIndexOfQuestion5NoneFunctional6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_6");
          final int _cursorIndexOfQuestion5WaterSourceAvailable6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_6");
          final int _cursorIndexOfQuestion5Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_objective");
          final int _cursorIndexOfQuestion5ObjectiveReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_objective_reason");
          final int _cursorIndexOfQuestion6WetLandDemarcated = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_wetland_demarcated");
          final int _cursorIndexOfQuestion6VillageName1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_1");
          final int _cursorIndexOfQuestion61WetlandUnderDestruction1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_1");
          final int _cursorIndexOfQuestion6VillageName2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_2");
          final int _cursorIndexOfQuestion61WetlandUnderDestruction2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_2");
          final int _cursorIndexOfQuestion6VillageName3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_3");
          final int _cursorIndexOfQuestion61WetlandUnderDestruction3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_3");
          final int _cursorIndexOfQuestion6VillageName4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_4");
          final int _cursorIndexOfQuestion61WetlandUnderDestruction4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_4");
          final int _cursorIndexOfQuestion6VillageName5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_5");
          final int _cursorIndexOfQuestion61WetlandUnderDestruction5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_5");
          final int _cursorIndexOfQuestion6VillageName6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_6");
          final int _cursorIndexOfQuestion61WetlandUnderDestruction6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_6");
          final int _cursorIndexOfQuestion62TreePlanting = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_2_tree_planting");
          final int _cursorIndexOfLocallyStored = CursorUtil.getColumnIndexOrThrow(_cursor, "locally_stored");
          final List<WaterEnvironmentQuestion> _result = new ArrayList<WaterEnvironmentQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WaterEnvironmentQuestion _item;
            final String _tmpFinancialYear;
            _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpDistrict;
            _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            final String _tmpVillage;
            _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
            final String _tmpParish;
            _tmpParish = _cursor.getString(_cursorIndexOfParish);
            final String _tmpSub_county;
            _tmpSub_county = _cursor.getString(_cursorIndexOfSubCounty);
            final String _tmpAgentName;
            _tmpAgentName = _cursor.getString(_cursorIndexOfAgentName);
            final String _tmpAgentTel;
            _tmpAgentTel = _cursor.getString(_cursorIndexOfAgentTel);
            final boolean _tmpQuestion1Objective;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfQuestion1Objective);
            _tmpQuestion1Objective = _tmp != 0;
            final String _tmpQuestion1ObjectiveReason;
            _tmpQuestion1ObjectiveReason = _cursor.getString(_cursorIndexOfQuestion1ObjectiveReason);
            final String _tmpQuestion2Water;
            _tmpQuestion2Water = _cursor.getString(_cursorIndexOfQuestion2Water);
            final String _tmpQuestion4Answer;
            _tmpQuestion4Answer = _cursor.getString(_cursorIndexOfQuestion4Answer);
            final boolean _tmpQuestion3Objective;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfQuestion3Objective);
            _tmpQuestion3Objective = _tmp_1 != 0;
            final String _tmpQuestion5Text;
            _tmpQuestion5Text = _cursor.getString(_cursorIndexOfQuestion5Text);
            final String _tmpSubCounty1;
            _tmpSubCounty1 = _cursor.getString(_cursorIndexOfSubCounty1);
            final String _tmpWaterSource1;
            _tmpWaterSource1 = _cursor.getString(_cursorIndexOfWaterSource1);
            final int _tmpQuestion5Functional1;
            _tmpQuestion5Functional1 = _cursor.getInt(_cursorIndexOfQuestion5Functional1);
            final int _tmpQuestion5NoneFunctional1;
            _tmpQuestion5NoneFunctional1 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional1);
            final int _tmpQuestion5WaterSourceAvailable1;
            _tmpQuestion5WaterSourceAvailable1 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable1);
            final String _tmpSubCounty2;
            _tmpSubCounty2 = _cursor.getString(_cursorIndexOfSubCounty2);
            final String _tmpWaterSource2;
            _tmpWaterSource2 = _cursor.getString(_cursorIndexOfWaterSource2);
            final int _tmpQuestion5Functional2;
            _tmpQuestion5Functional2 = _cursor.getInt(_cursorIndexOfQuestion5Functional2);
            final int _tmpQuestion5NoneFunctional2;
            _tmpQuestion5NoneFunctional2 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional2);
            final int _tmpQuestion5WaterSourceAvailable2;
            _tmpQuestion5WaterSourceAvailable2 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable2);
            final String _tmpSubCounty3;
            _tmpSubCounty3 = _cursor.getString(_cursorIndexOfSubCounty3);
            final String _tmpWaterSource3;
            _tmpWaterSource3 = _cursor.getString(_cursorIndexOfWaterSource3);
            final int _tmpQuestion5Functional3;
            _tmpQuestion5Functional3 = _cursor.getInt(_cursorIndexOfQuestion5Functional3);
            final int _tmpQuestion5NoneFunctional3;
            _tmpQuestion5NoneFunctional3 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional3);
            final int _tmpQuestion5WaterSourceAvailable3;
            _tmpQuestion5WaterSourceAvailable3 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable3);
            final String _tmpSubCounty4;
            _tmpSubCounty4 = _cursor.getString(_cursorIndexOfSubCounty4);
            final String _tmpWaterSource4;
            _tmpWaterSource4 = _cursor.getString(_cursorIndexOfWaterSource4);
            final int _tmpQuestion5Functional4;
            _tmpQuestion5Functional4 = _cursor.getInt(_cursorIndexOfQuestion5Functional4);
            final int _tmpQuestion5NoneFunctional4;
            _tmpQuestion5NoneFunctional4 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional4);
            final int _tmpQuestion5WaterSourceAvailable4;
            _tmpQuestion5WaterSourceAvailable4 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable4);
            final String _tmpSubCounty5;
            _tmpSubCounty5 = _cursor.getString(_cursorIndexOfSubCounty5);
            final String _tmpWaterSource5;
            _tmpWaterSource5 = _cursor.getString(_cursorIndexOfWaterSource5);
            final int _tmpQuestion5Functional5;
            _tmpQuestion5Functional5 = _cursor.getInt(_cursorIndexOfQuestion5Functional5);
            final int _tmpQuestion5NoneFunctional5;
            _tmpQuestion5NoneFunctional5 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional5);
            final int _tmpQuestion5WaterSourceAvailable5;
            _tmpQuestion5WaterSourceAvailable5 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable5);
            final String _tmpSubCounty6;
            _tmpSubCounty6 = _cursor.getString(_cursorIndexOfSubCounty6);
            final String _tmpWaterSource6;
            _tmpWaterSource6 = _cursor.getString(_cursorIndexOfWaterSource6);
            final int _tmpQuestion5Functional6;
            _tmpQuestion5Functional6 = _cursor.getInt(_cursorIndexOfQuestion5Functional6);
            final int _tmpQuestion5NoneFunctional6;
            _tmpQuestion5NoneFunctional6 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional6);
            final int _tmpQuestion5WaterSourceAvailable6;
            _tmpQuestion5WaterSourceAvailable6 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable6);
            final boolean _tmpQuestion5Objective;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfQuestion5Objective);
            _tmpQuestion5Objective = _tmp_2 != 0;
            final String _tmpQuestion5ObjectiveReason;
            _tmpQuestion5ObjectiveReason = _cursor.getString(_cursorIndexOfQuestion5ObjectiveReason);
            final String _tmpQuestion6WetLandDemarcated;
            _tmpQuestion6WetLandDemarcated = _cursor.getString(_cursorIndexOfQuestion6WetLandDemarcated);
            final String _tmpQuestion6VillageName1;
            _tmpQuestion6VillageName1 = _cursor.getString(_cursorIndexOfQuestion6VillageName1);
            final int _tmpQuestion61WetlandUnderDestruction1;
            _tmpQuestion61WetlandUnderDestruction1 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction1);
            final String _tmpQuestion6VillageName2;
            _tmpQuestion6VillageName2 = _cursor.getString(_cursorIndexOfQuestion6VillageName2);
            final int _tmpQuestion61WetlandUnderDestruction2;
            _tmpQuestion61WetlandUnderDestruction2 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction2);
            final String _tmpQuestion6VillageName3;
            _tmpQuestion6VillageName3 = _cursor.getString(_cursorIndexOfQuestion6VillageName3);
            final int _tmpQuestion61WetlandUnderDestruction3;
            _tmpQuestion61WetlandUnderDestruction3 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction3);
            final String _tmpQuestion6VillageName4;
            _tmpQuestion6VillageName4 = _cursor.getString(_cursorIndexOfQuestion6VillageName4);
            final int _tmpQuestion61WetlandUnderDestruction4;
            _tmpQuestion61WetlandUnderDestruction4 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction4);
            final String _tmpQuestion6VillageName5;
            _tmpQuestion6VillageName5 = _cursor.getString(_cursorIndexOfQuestion6VillageName5);
            final int _tmpQuestion61WetlandUnderDestruction5;
            _tmpQuestion61WetlandUnderDestruction5 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction5);
            final String _tmpQuestion6VillageName6;
            _tmpQuestion6VillageName6 = _cursor.getString(_cursorIndexOfQuestion6VillageName6);
            final int _tmpQuestion61WetlandUnderDestruction6;
            _tmpQuestion61WetlandUnderDestruction6 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction6);
            final String _tmpQuestion62TreePlanting;
            _tmpQuestion62TreePlanting = _cursor.getString(_cursorIndexOfQuestion62TreePlanting);
            _item = new WaterEnvironmentQuestion(_tmpFinancialYear,_tmpDate,_tmpDistrict,_tmpVillage,_tmpParish,_tmpSub_county,_tmpAgentName,_tmpAgentTel,_tmpQuestion1Objective,_tmpQuestion1ObjectiveReason,_tmpQuestion2Water,_tmpQuestion4Answer,_tmpQuestion3Objective,_tmpQuestion5Text,_tmpSubCounty1,_tmpWaterSource1,_tmpQuestion5Functional1,_tmpQuestion5NoneFunctional1,_tmpQuestion5WaterSourceAvailable1,_tmpSubCounty2,_tmpWaterSource2,_tmpQuestion5Functional2,_tmpQuestion5NoneFunctional2,_tmpQuestion5WaterSourceAvailable2,_tmpSubCounty3,_tmpWaterSource3,_tmpQuestion5Functional3,_tmpQuestion5NoneFunctional3,_tmpQuestion5WaterSourceAvailable3,_tmpSubCounty4,_tmpWaterSource4,_tmpQuestion5Functional4,_tmpQuestion5NoneFunctional4,_tmpQuestion5WaterSourceAvailable4,_tmpSubCounty5,_tmpWaterSource5,_tmpQuestion5Functional5,_tmpQuestion5NoneFunctional5,_tmpQuestion5WaterSourceAvailable5,_tmpSubCounty6,_tmpWaterSource6,_tmpQuestion5Functional6,_tmpQuestion5NoneFunctional6,_tmpQuestion5WaterSourceAvailable6,_tmpQuestion5Objective,_tmpQuestion5ObjectiveReason,_tmpQuestion6WetLandDemarcated,_tmpQuestion6VillageName1,_tmpQuestion61WetlandUnderDestruction1,_tmpQuestion6VillageName2,_tmpQuestion61WetlandUnderDestruction2,_tmpQuestion6VillageName3,_tmpQuestion61WetlandUnderDestruction3,_tmpQuestion6VillageName4,_tmpQuestion61WetlandUnderDestruction4,_tmpQuestion6VillageName5,_tmpQuestion61WetlandUnderDestruction5,_tmpQuestion6VillageName6,_tmpQuestion61WetlandUnderDestruction6,_tmpQuestion62TreePlanting);
            final int _tmpPrimaryKey;
            _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
            _item.setPrimaryKey(_tmpPrimaryKey);
            final boolean _tmpLocallyStored;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfLocallyStored);
            _tmpLocallyStored = _tmp_3 != 0;
            _item.setLocallyStored(_tmpLocallyStored);
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

  @Override
  public List<WaterEnvironmentQuestion> getWaterEnvironmentForBackUp() {
    final String _sql = "SELECT * FROM water_and_env";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "financial_year");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
      final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
      final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
      final int _cursorIndexOfSubCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
      final int _cursorIndexOfAgentName = CursorUtil.getColumnIndexOrThrow(_cursor, "agent_name");
      final int _cursorIndexOfAgentTel = CursorUtil.getColumnIndexOrThrow(_cursor, "agent_tel");
      final int _cursorIndexOfQuestion1Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q_1_objective");
      final int _cursorIndexOfQuestion1ObjectiveReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q_1_reason");
      final int _cursorIndexOfQuestion2Water = CursorUtil.getColumnIndexOrThrow(_cursor, "q_2_reason");
      final int _cursorIndexOfQuestion4Answer = CursorUtil.getColumnIndexOrThrow(_cursor, "q_4_answer");
      final int _cursorIndexOfQuestion3Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q_3_objective");
      final int _cursorIndexOfQuestion5Text = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_text");
      final int _cursorIndexOfSubCounty1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_1");
      final int _cursorIndexOfWaterSource1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_1");
      final int _cursorIndexOfQuestion5Functional1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_1");
      final int _cursorIndexOfQuestion5NoneFunctional1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_1");
      final int _cursorIndexOfQuestion5WaterSourceAvailable1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_1");
      final int _cursorIndexOfSubCounty2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_2");
      final int _cursorIndexOfWaterSource2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_2");
      final int _cursorIndexOfQuestion5Functional2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_2");
      final int _cursorIndexOfQuestion5NoneFunctional2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_2");
      final int _cursorIndexOfQuestion5WaterSourceAvailable2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_2");
      final int _cursorIndexOfSubCounty3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_3");
      final int _cursorIndexOfWaterSource3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_3");
      final int _cursorIndexOfQuestion5Functional3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_3");
      final int _cursorIndexOfQuestion5NoneFunctional3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_3");
      final int _cursorIndexOfQuestion5WaterSourceAvailable3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_3");
      final int _cursorIndexOfSubCounty4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_4");
      final int _cursorIndexOfWaterSource4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_4");
      final int _cursorIndexOfQuestion5Functional4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_4");
      final int _cursorIndexOfQuestion5NoneFunctional4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_4");
      final int _cursorIndexOfQuestion5WaterSourceAvailable4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_4");
      final int _cursorIndexOfSubCounty5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_5");
      final int _cursorIndexOfWaterSource5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_5");
      final int _cursorIndexOfQuestion5Functional5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_5");
      final int _cursorIndexOfQuestion5NoneFunctional5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_5");
      final int _cursorIndexOfQuestion5WaterSourceAvailable5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_5");
      final int _cursorIndexOfSubCounty6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_sub_6");
      final int _cursorIndexOfWaterSource6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_ws_6");
      final int _cursorIndexOfQuestion5Functional6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_functional_6");
      final int _cursorIndexOfQuestion5NoneFunctional6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_none_functional_6");
      final int _cursorIndexOfQuestion5WaterSourceAvailable6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_no_ws_available_6");
      final int _cursorIndexOfQuestion5Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_objective");
      final int _cursorIndexOfQuestion5ObjectiveReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q_5_objective_reason");
      final int _cursorIndexOfQuestion6WetLandDemarcated = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_wetland_demarcated");
      final int _cursorIndexOfQuestion6VillageName1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_1");
      final int _cursorIndexOfQuestion61WetlandUnderDestruction1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_1");
      final int _cursorIndexOfQuestion6VillageName2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_2");
      final int _cursorIndexOfQuestion61WetlandUnderDestruction2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_2");
      final int _cursorIndexOfQuestion6VillageName3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_3");
      final int _cursorIndexOfQuestion61WetlandUnderDestruction3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_3");
      final int _cursorIndexOfQuestion6VillageName4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_4");
      final int _cursorIndexOfQuestion61WetlandUnderDestruction4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_4");
      final int _cursorIndexOfQuestion6VillageName5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_5");
      final int _cursorIndexOfQuestion61WetlandUnderDestruction5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_5");
      final int _cursorIndexOfQuestion6VillageName6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_village_name_6");
      final int _cursorIndexOfQuestion61WetlandUnderDestruction6 = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_1_wetland_6");
      final int _cursorIndexOfQuestion62TreePlanting = CursorUtil.getColumnIndexOrThrow(_cursor, "q_6_2_tree_planting");
      final int _cursorIndexOfLocallyStored = CursorUtil.getColumnIndexOrThrow(_cursor, "locally_stored");
      final List<WaterEnvironmentQuestion> _result = new ArrayList<WaterEnvironmentQuestion>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final WaterEnvironmentQuestion _item;
        final String _tmpFinancialYear;
        _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        final String _tmpVillage;
        _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
        final String _tmpParish;
        _tmpParish = _cursor.getString(_cursorIndexOfParish);
        final String _tmpSub_county;
        _tmpSub_county = _cursor.getString(_cursorIndexOfSubCounty);
        final String _tmpAgentName;
        _tmpAgentName = _cursor.getString(_cursorIndexOfAgentName);
        final String _tmpAgentTel;
        _tmpAgentTel = _cursor.getString(_cursorIndexOfAgentTel);
        final boolean _tmpQuestion1Objective;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfQuestion1Objective);
        _tmpQuestion1Objective = _tmp != 0;
        final String _tmpQuestion1ObjectiveReason;
        _tmpQuestion1ObjectiveReason = _cursor.getString(_cursorIndexOfQuestion1ObjectiveReason);
        final String _tmpQuestion2Water;
        _tmpQuestion2Water = _cursor.getString(_cursorIndexOfQuestion2Water);
        final String _tmpQuestion4Answer;
        _tmpQuestion4Answer = _cursor.getString(_cursorIndexOfQuestion4Answer);
        final boolean _tmpQuestion3Objective;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfQuestion3Objective);
        _tmpQuestion3Objective = _tmp_1 != 0;
        final String _tmpQuestion5Text;
        _tmpQuestion5Text = _cursor.getString(_cursorIndexOfQuestion5Text);
        final String _tmpSubCounty1;
        _tmpSubCounty1 = _cursor.getString(_cursorIndexOfSubCounty1);
        final String _tmpWaterSource1;
        _tmpWaterSource1 = _cursor.getString(_cursorIndexOfWaterSource1);
        final int _tmpQuestion5Functional1;
        _tmpQuestion5Functional1 = _cursor.getInt(_cursorIndexOfQuestion5Functional1);
        final int _tmpQuestion5NoneFunctional1;
        _tmpQuestion5NoneFunctional1 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional1);
        final int _tmpQuestion5WaterSourceAvailable1;
        _tmpQuestion5WaterSourceAvailable1 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable1);
        final String _tmpSubCounty2;
        _tmpSubCounty2 = _cursor.getString(_cursorIndexOfSubCounty2);
        final String _tmpWaterSource2;
        _tmpWaterSource2 = _cursor.getString(_cursorIndexOfWaterSource2);
        final int _tmpQuestion5Functional2;
        _tmpQuestion5Functional2 = _cursor.getInt(_cursorIndexOfQuestion5Functional2);
        final int _tmpQuestion5NoneFunctional2;
        _tmpQuestion5NoneFunctional2 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional2);
        final int _tmpQuestion5WaterSourceAvailable2;
        _tmpQuestion5WaterSourceAvailable2 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable2);
        final String _tmpSubCounty3;
        _tmpSubCounty3 = _cursor.getString(_cursorIndexOfSubCounty3);
        final String _tmpWaterSource3;
        _tmpWaterSource3 = _cursor.getString(_cursorIndexOfWaterSource3);
        final int _tmpQuestion5Functional3;
        _tmpQuestion5Functional3 = _cursor.getInt(_cursorIndexOfQuestion5Functional3);
        final int _tmpQuestion5NoneFunctional3;
        _tmpQuestion5NoneFunctional3 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional3);
        final int _tmpQuestion5WaterSourceAvailable3;
        _tmpQuestion5WaterSourceAvailable3 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable3);
        final String _tmpSubCounty4;
        _tmpSubCounty4 = _cursor.getString(_cursorIndexOfSubCounty4);
        final String _tmpWaterSource4;
        _tmpWaterSource4 = _cursor.getString(_cursorIndexOfWaterSource4);
        final int _tmpQuestion5Functional4;
        _tmpQuestion5Functional4 = _cursor.getInt(_cursorIndexOfQuestion5Functional4);
        final int _tmpQuestion5NoneFunctional4;
        _tmpQuestion5NoneFunctional4 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional4);
        final int _tmpQuestion5WaterSourceAvailable4;
        _tmpQuestion5WaterSourceAvailable4 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable4);
        final String _tmpSubCounty5;
        _tmpSubCounty5 = _cursor.getString(_cursorIndexOfSubCounty5);
        final String _tmpWaterSource5;
        _tmpWaterSource5 = _cursor.getString(_cursorIndexOfWaterSource5);
        final int _tmpQuestion5Functional5;
        _tmpQuestion5Functional5 = _cursor.getInt(_cursorIndexOfQuestion5Functional5);
        final int _tmpQuestion5NoneFunctional5;
        _tmpQuestion5NoneFunctional5 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional5);
        final int _tmpQuestion5WaterSourceAvailable5;
        _tmpQuestion5WaterSourceAvailable5 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable5);
        final String _tmpSubCounty6;
        _tmpSubCounty6 = _cursor.getString(_cursorIndexOfSubCounty6);
        final String _tmpWaterSource6;
        _tmpWaterSource6 = _cursor.getString(_cursorIndexOfWaterSource6);
        final int _tmpQuestion5Functional6;
        _tmpQuestion5Functional6 = _cursor.getInt(_cursorIndexOfQuestion5Functional6);
        final int _tmpQuestion5NoneFunctional6;
        _tmpQuestion5NoneFunctional6 = _cursor.getInt(_cursorIndexOfQuestion5NoneFunctional6);
        final int _tmpQuestion5WaterSourceAvailable6;
        _tmpQuestion5WaterSourceAvailable6 = _cursor.getInt(_cursorIndexOfQuestion5WaterSourceAvailable6);
        final boolean _tmpQuestion5Objective;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfQuestion5Objective);
        _tmpQuestion5Objective = _tmp_2 != 0;
        final String _tmpQuestion5ObjectiveReason;
        _tmpQuestion5ObjectiveReason = _cursor.getString(_cursorIndexOfQuestion5ObjectiveReason);
        final String _tmpQuestion6WetLandDemarcated;
        _tmpQuestion6WetLandDemarcated = _cursor.getString(_cursorIndexOfQuestion6WetLandDemarcated);
        final String _tmpQuestion6VillageName1;
        _tmpQuestion6VillageName1 = _cursor.getString(_cursorIndexOfQuestion6VillageName1);
        final int _tmpQuestion61WetlandUnderDestruction1;
        _tmpQuestion61WetlandUnderDestruction1 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction1);
        final String _tmpQuestion6VillageName2;
        _tmpQuestion6VillageName2 = _cursor.getString(_cursorIndexOfQuestion6VillageName2);
        final int _tmpQuestion61WetlandUnderDestruction2;
        _tmpQuestion61WetlandUnderDestruction2 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction2);
        final String _tmpQuestion6VillageName3;
        _tmpQuestion6VillageName3 = _cursor.getString(_cursorIndexOfQuestion6VillageName3);
        final int _tmpQuestion61WetlandUnderDestruction3;
        _tmpQuestion61WetlandUnderDestruction3 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction3);
        final String _tmpQuestion6VillageName4;
        _tmpQuestion6VillageName4 = _cursor.getString(_cursorIndexOfQuestion6VillageName4);
        final int _tmpQuestion61WetlandUnderDestruction4;
        _tmpQuestion61WetlandUnderDestruction4 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction4);
        final String _tmpQuestion6VillageName5;
        _tmpQuestion6VillageName5 = _cursor.getString(_cursorIndexOfQuestion6VillageName5);
        final int _tmpQuestion61WetlandUnderDestruction5;
        _tmpQuestion61WetlandUnderDestruction5 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction5);
        final String _tmpQuestion6VillageName6;
        _tmpQuestion6VillageName6 = _cursor.getString(_cursorIndexOfQuestion6VillageName6);
        final int _tmpQuestion61WetlandUnderDestruction6;
        _tmpQuestion61WetlandUnderDestruction6 = _cursor.getInt(_cursorIndexOfQuestion61WetlandUnderDestruction6);
        final String _tmpQuestion62TreePlanting;
        _tmpQuestion62TreePlanting = _cursor.getString(_cursorIndexOfQuestion62TreePlanting);
        _item = new WaterEnvironmentQuestion(_tmpFinancialYear,_tmpDate,_tmpDistrict,_tmpVillage,_tmpParish,_tmpSub_county,_tmpAgentName,_tmpAgentTel,_tmpQuestion1Objective,_tmpQuestion1ObjectiveReason,_tmpQuestion2Water,_tmpQuestion4Answer,_tmpQuestion3Objective,_tmpQuestion5Text,_tmpSubCounty1,_tmpWaterSource1,_tmpQuestion5Functional1,_tmpQuestion5NoneFunctional1,_tmpQuestion5WaterSourceAvailable1,_tmpSubCounty2,_tmpWaterSource2,_tmpQuestion5Functional2,_tmpQuestion5NoneFunctional2,_tmpQuestion5WaterSourceAvailable2,_tmpSubCounty3,_tmpWaterSource3,_tmpQuestion5Functional3,_tmpQuestion5NoneFunctional3,_tmpQuestion5WaterSourceAvailable3,_tmpSubCounty4,_tmpWaterSource4,_tmpQuestion5Functional4,_tmpQuestion5NoneFunctional4,_tmpQuestion5WaterSourceAvailable4,_tmpSubCounty5,_tmpWaterSource5,_tmpQuestion5Functional5,_tmpQuestion5NoneFunctional5,_tmpQuestion5WaterSourceAvailable5,_tmpSubCounty6,_tmpWaterSource6,_tmpQuestion5Functional6,_tmpQuestion5NoneFunctional6,_tmpQuestion5WaterSourceAvailable6,_tmpQuestion5Objective,_tmpQuestion5ObjectiveReason,_tmpQuestion6WetLandDemarcated,_tmpQuestion6VillageName1,_tmpQuestion61WetlandUnderDestruction1,_tmpQuestion6VillageName2,_tmpQuestion61WetlandUnderDestruction2,_tmpQuestion6VillageName3,_tmpQuestion61WetlandUnderDestruction3,_tmpQuestion6VillageName4,_tmpQuestion61WetlandUnderDestruction4,_tmpQuestion6VillageName5,_tmpQuestion61WetlandUnderDestruction5,_tmpQuestion6VillageName6,_tmpQuestion61WetlandUnderDestruction6,_tmpQuestion62TreePlanting);
        final int _tmpPrimaryKey;
        _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
        _item.setPrimaryKey(_tmpPrimaryKey);
        final boolean _tmpLocallyStored;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfLocallyStored);
        _tmpLocallyStored = _tmp_3 != 0;
        _item.setLocallyStored(_tmpLocallyStored);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
