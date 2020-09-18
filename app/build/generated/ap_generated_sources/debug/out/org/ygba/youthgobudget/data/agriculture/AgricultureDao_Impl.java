package org.ygba.youthgobudget.data.agriculture;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
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
public final class AgricultureDao_Impl implements AgricultureDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AgricultureQuestion> __insertionAdapterOfAgricultureQuestion;

  private final EntityDeletionOrUpdateAdapter<AgricultureQuestion> __deletionAdapterOfAgricultureQuestion;

  public AgricultureDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAgricultureQuestion = new EntityInsertionAdapter<AgricultureQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `agric` (`id`,`fy`,`date`,`village`,`parish`,`sub_county`,`name`,`tel`,`num`,`q1o`,`q1reason`,`q2ext`,`q2extreceived`,`q2dateextReceived`,`q2extdatewithdrawn`,`q2devexp`,`q2devrecieved`,`q2devdaterecieved`,`q2devdatewithdrawn`,`q2_1`,`q2_2`,`q2_3`,`q2_4`,`q2_5`,`q3_1`,`q3_2_num`,`q3_3_mention`,`q3_4_male`,`q3_4_female`,`q3_5_reason`,`q4_1_inputs`,`q4_2_input_1`,`q4_2_date_1`,`q4_2_male_number_1`,`q4_2_female_number_1`,`q4_2_village_1`,`q4_2_input_2`,`q4_2_date_2`,`q4_2_male_number_2`,`q4_2_female_number_2`,`q4_2_village_2`,`q4_2_input_3`,`q4_2_date_3`,`q4_2_male_number_3`,`q4_2_female_number_3`,`q4_2_village_3`,`q4_2_input_4`,`q4_2_date_4`,`q4_2_male_number_4`,`q4_2_female_number_4`,`q4_2_village_4`,`q4_2_input_5`,`q4_2_date_5`,`q4_2_male_number_5`,`q4_2_female_number_5`,`q4_2_village_5`,`q4_3_reason`,`q4_3_any_other_reason`,`locally`,`quarter`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AgricultureQuestion value) {
        stmt.bindLong(1, value.getId());
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
        if (value.getVillage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getVillage());
        }
        if (value.getParish() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getParish());
        }
        if (value.getSubCounty() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSubCounty());
        }
        if (value.getAgentName() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getAgentName());
        }
        if (value.getTel() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTel());
        }
        if (value.getAgentNumber() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getAgentNumber());
        }
        if (value.getQuestion1Objective() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getQuestion1Objective());
        }
        if (value.getQuestion1Reason() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getQuestion1Reason());
        }
        if (value.getQuestion2ExtensionExpectedAmount() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getQuestion2ExtensionExpectedAmount());
        }
        if (value.getQuestion2ExtensionAmountReceived() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getQuestion2ExtensionAmountReceived());
        }
        if (value.getQuestion2ExtensionDateReceived() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getQuestion2ExtensionDateReceived());
        }
        if (value.getQuestion2ExtensionDateWithdram() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getQuestion2ExtensionDateWithdram());
        }
        if (value.getQuestion2DevelopmentAmountExpected() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getQuestion2DevelopmentAmountExpected());
        }
        if (value.getQuestion2DevelopmentAmountReceived() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getQuestion2DevelopmentAmountReceived());
        }
        if (value.getQuestion2DevelopmentDateReceived() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getQuestion2DevelopmentDateReceived());
        }
        if (value.getQuestion2DevelopmentDateWithdrawn() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getQuestion2DevelopmentDateWithdrawn());
        }
        if (value.getAnswerQuestion2_1() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getAnswerQuestion2_1());
        }
        if (value.getAnswerQuestion2_2() == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.getAnswerQuestion2_2());
        }
        if (value.getAnswerQuestion2_3() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getAnswerQuestion2_3());
        }
        if (value.getAnswerQuestion2_4() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getAnswerQuestion2_4());
        }
        if (value.getAnswerQuestion2_5() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getAnswerQuestion2_5());
        }
        if (value.getAnswerQuestion3_1() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getAnswerQuestion3_1());
        }
        if (value.getAnswerQuestion3_2() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getAnswerQuestion3_2());
        }
        if (value.getAnswerQuestion3_3() == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.getAnswerQuestion3_3());
        }
        if (value.getAnswerQuestion3_4_Male() == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.getAnswerQuestion3_4_Male());
        }
        if (value.getAnswerQuestion3_4_Female() == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.getAnswerQuestion3_4_Female());
        }
        if (value.getAnswerQuestion3_5() == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.getAnswerQuestion3_5());
        }
        if (value.getAnswerQuestion4_1() == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.getAnswerQuestion4_1());
        }
        if (value.getAnswerQuestion4_2_Input_1() == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.getAnswerQuestion4_2_Input_1());
        }
        if (value.getAnswerQuestion4_2_Date_1() == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.getAnswerQuestion4_2_Date_1());
        }
        if (value.getAnswerQuestion4_2_Male_Number_1() == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.getAnswerQuestion4_2_Male_Number_1());
        }
        if (value.getAnswerQuestion4_2_Female_Number_1() == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.getAnswerQuestion4_2_Female_Number_1());
        }
        if (value.getAnswerQuestion4_2_village_1() == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.getAnswerQuestion4_2_village_1());
        }
        if (value.getAnswerQuestion4_2_Input_2() == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.getAnswerQuestion4_2_Input_2());
        }
        if (value.getAnswerQuestion4_2_Date_2() == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.getAnswerQuestion4_2_Date_2());
        }
        if (value.getAnswerQuestion4_2_Male_Number_2() == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.getAnswerQuestion4_2_Male_Number_2());
        }
        if (value.getAnswerQuestion4_2_Female_Number_2() == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.getAnswerQuestion4_2_Female_Number_2());
        }
        if (value.getAnswerQuestion4_2_village_2() == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.getAnswerQuestion4_2_village_2());
        }
        if (value.getAnswerQuestion4_2_Input_3() == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.getAnswerQuestion4_2_Input_3());
        }
        if (value.getAnswerQuestion4_2_Date_3() == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.getAnswerQuestion4_2_Date_3());
        }
        if (value.getAnswerQuestion4_2_Male_Number_3() == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.getAnswerQuestion4_2_Male_Number_3());
        }
        if (value.getAnswerQuestion4_2_Female_Number_3() == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.getAnswerQuestion4_2_Female_Number_3());
        }
        if (value.getAnswerQuestion4_2_village_3() == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.getAnswerQuestion4_2_village_3());
        }
        if (value.getAnswerQuestion4_2_Input_4() == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.getAnswerQuestion4_2_Input_4());
        }
        if (value.getAnswerQuestion4_2_Date_4() == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.getAnswerQuestion4_2_Date_4());
        }
        if (value.getAnswerQuestion4_2_Male_Number_4() == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.getAnswerQuestion4_2_Male_Number_4());
        }
        if (value.getAnswerQuestion4_2_Female_Number_4() == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.getAnswerQuestion4_2_Female_Number_4());
        }
        if (value.getAnswerQuestion4_2_village_4() == null) {
          stmt.bindNull(51);
        } else {
          stmt.bindString(51, value.getAnswerQuestion4_2_village_4());
        }
        if (value.getAnswerQuestion4_2_Input_5() == null) {
          stmt.bindNull(52);
        } else {
          stmt.bindString(52, value.getAnswerQuestion4_2_Input_5());
        }
        if (value.getAnswerQuestion4_2_Date_5() == null) {
          stmt.bindNull(53);
        } else {
          stmt.bindString(53, value.getAnswerQuestion4_2_Date_5());
        }
        if (value.getAnswerQuestion4_2_Male_Number_5() == null) {
          stmt.bindNull(54);
        } else {
          stmt.bindString(54, value.getAnswerQuestion4_2_Male_Number_5());
        }
        if (value.getAnswerQuestion4_2_Female_Number_5() == null) {
          stmt.bindNull(55);
        } else {
          stmt.bindString(55, value.getAnswerQuestion4_2_Female_Number_5());
        }
        if (value.getAnswerQuestion4_2_village_5() == null) {
          stmt.bindNull(56);
        } else {
          stmt.bindString(56, value.getAnswerQuestion4_2_village_5());
        }
        if (value.getAnswerQuestion4_3_reason() == null) {
          stmt.bindNull(57);
        } else {
          stmt.bindString(57, value.getAnswerQuestion4_3_reason());
        }
        if (value.getAnswerQuestion4_3_otherReason() == null) {
          stmt.bindNull(58);
        } else {
          stmt.bindString(58, value.getAnswerQuestion4_3_otherReason());
        }
        final int _tmp;
        _tmp = value.isStoredLocally() ? 1 : 0;
        stmt.bindLong(59, _tmp);
        if (value.getQuarter() == null) {
          stmt.bindNull(60);
        } else {
          stmt.bindString(60, value.getQuarter());
        }
      }
    };
    this.__deletionAdapterOfAgricultureQuestion = new EntityDeletionOrUpdateAdapter<AgricultureQuestion>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `agric` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AgricultureQuestion value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public void saveAgricultureQuestion(final AgricultureQuestion agricultureQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAgricultureQuestion.insert(agricultureQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAgricultureQuestion(final AgricultureQuestion agricultureQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAgricultureQuestion.handle(agricultureQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<AgricultureQuestion>> getAllAgricultureAnswers() {
    final String _sql = "SELECT * FROM agric";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"agric"}, false, new Callable<List<AgricultureQuestion>>() {
      @Override
      public List<AgricultureQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "fy");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
          final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
          final int _cursorIndexOfSubCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
          final int _cursorIndexOfAgentName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
          final int _cursorIndexOfAgentNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "num");
          final int _cursorIndexOfQuestion1Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q1o");
          final int _cursorIndexOfQuestion1Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q1reason");
          final int _cursorIndexOfQuestion2ExtensionExpectedAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "q2ext");
          final int _cursorIndexOfQuestion2ExtensionAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2extreceived");
          final int _cursorIndexOfQuestion2ExtensionDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2dateextReceived");
          final int _cursorIndexOfQuestion2ExtensionDateWithdram = CursorUtil.getColumnIndexOrThrow(_cursor, "q2extdatewithdrawn");
          final int _cursorIndexOfQuestion2DevelopmentAmountExpected = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devexp");
          final int _cursorIndexOfQuestion2DevelopmentAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devrecieved");
          final int _cursorIndexOfQuestion2DevelopmentDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devdaterecieved");
          final int _cursorIndexOfQuestion2DevelopmentDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devdatewithdrawn");
          final int _cursorIndexOfAnswerQuestion21 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_1");
          final int _cursorIndexOfAnswerQuestion22 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_2");
          final int _cursorIndexOfAnswerQuestion23 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_3");
          final int _cursorIndexOfAnswerQuestion24 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_4");
          final int _cursorIndexOfAnswerQuestion25 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_5");
          final int _cursorIndexOfAnswerQuestion31 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_1");
          final int _cursorIndexOfAnswerQuestion32 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_2_num");
          final int _cursorIndexOfAnswerQuestion33 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_3_mention");
          final int _cursorIndexOfAnswerQuestion34Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_4_male");
          final int _cursorIndexOfAnswerQuestion34Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_4_female");
          final int _cursorIndexOfAnswerQuestion35 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_5_reason");
          final int _cursorIndexOfAnswerQuestion41 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_1_inputs");
          final int _cursorIndexOfAnswerQuestion42Input1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_1");
          final int _cursorIndexOfAnswerQuestion42Date1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_1");
          final int _cursorIndexOfAnswerQuestion42MaleNumber1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_1");
          final int _cursorIndexOfAnswerQuestion42FemaleNumber1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_1");
          final int _cursorIndexOfAnswerQuestion42Village1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_1");
          final int _cursorIndexOfAnswerQuestion42Input2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_2");
          final int _cursorIndexOfAnswerQuestion42Date2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_2");
          final int _cursorIndexOfAnswerQuestion42MaleNumber2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_2");
          final int _cursorIndexOfAnswerQuestion42FemaleNumber2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_2");
          final int _cursorIndexOfAnswerQuestion42Village2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_2");
          final int _cursorIndexOfAnswerQuestion42Input3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_3");
          final int _cursorIndexOfAnswerQuestion42Date3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_3");
          final int _cursorIndexOfAnswerQuestion42MaleNumber3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_3");
          final int _cursorIndexOfAnswerQuestion42FemaleNumber3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_3");
          final int _cursorIndexOfAnswerQuestion42Village3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_3");
          final int _cursorIndexOfAnswerQuestion42Input4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_4");
          final int _cursorIndexOfAnswerQuestion42Date4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_4");
          final int _cursorIndexOfAnswerQuestion42MaleNumber4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_4");
          final int _cursorIndexOfAnswerQuestion42FemaleNumber4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_4");
          final int _cursorIndexOfAnswerQuestion42Village4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_4");
          final int _cursorIndexOfAnswerQuestion42Input5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_5");
          final int _cursorIndexOfAnswerQuestion42Date5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_5");
          final int _cursorIndexOfAnswerQuestion42MaleNumber5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_5");
          final int _cursorIndexOfAnswerQuestion42FemaleNumber5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_5");
          final int _cursorIndexOfAnswerQuestion42Village5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_5");
          final int _cursorIndexOfAnswerQuestion43Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_3_reason");
          final int _cursorIndexOfAnswerQuestion43OtherReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_3_any_other_reason");
          final int _cursorIndexOfStoredLocally = CursorUtil.getColumnIndexOrThrow(_cursor, "locally");
          final int _cursorIndexOfQuarter = CursorUtil.getColumnIndexOrThrow(_cursor, "quarter");
          final List<AgricultureQuestion> _result = new ArrayList<AgricultureQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AgricultureQuestion _item;
            final String _tmpFinancialYear;
            _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
            final String _tmpDate;
            _tmpDate = _cursor.getString(_cursorIndexOfDate);
            final String _tmpVillage;
            _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
            final String _tmpParish;
            _tmpParish = _cursor.getString(_cursorIndexOfParish);
            final String _tmpSubCounty;
            _tmpSubCounty = _cursor.getString(_cursorIndexOfSubCounty);
            final String _tmpAgentName;
            _tmpAgentName = _cursor.getString(_cursorIndexOfAgentName);
            final String _tmpTel;
            _tmpTel = _cursor.getString(_cursorIndexOfTel);
            final String _tmpAgentNumber;
            _tmpAgentNumber = _cursor.getString(_cursorIndexOfAgentNumber);
            final String _tmpQuestion1Objective;
            _tmpQuestion1Objective = _cursor.getString(_cursorIndexOfQuestion1Objective);
            final String _tmpQuestion1Reason;
            _tmpQuestion1Reason = _cursor.getString(_cursorIndexOfQuestion1Reason);
            final String _tmpQuestion2ExtensionExpectedAmount;
            _tmpQuestion2ExtensionExpectedAmount = _cursor.getString(_cursorIndexOfQuestion2ExtensionExpectedAmount);
            final String _tmpQuestion2ExtensionAmountReceived;
            _tmpQuestion2ExtensionAmountReceived = _cursor.getString(_cursorIndexOfQuestion2ExtensionAmountReceived);
            final String _tmpQuestion2ExtensionDateReceived;
            _tmpQuestion2ExtensionDateReceived = _cursor.getString(_cursorIndexOfQuestion2ExtensionDateReceived);
            final String _tmpQuestion2ExtensionDateWithdram;
            _tmpQuestion2ExtensionDateWithdram = _cursor.getString(_cursorIndexOfQuestion2ExtensionDateWithdram);
            final String _tmpQuestion2DevelopmentAmountExpected;
            _tmpQuestion2DevelopmentAmountExpected = _cursor.getString(_cursorIndexOfQuestion2DevelopmentAmountExpected);
            final String _tmpQuestion2DevelopmentAmountReceived;
            _tmpQuestion2DevelopmentAmountReceived = _cursor.getString(_cursorIndexOfQuestion2DevelopmentAmountReceived);
            final String _tmpQuestion2DevelopmentDateReceived;
            _tmpQuestion2DevelopmentDateReceived = _cursor.getString(_cursorIndexOfQuestion2DevelopmentDateReceived);
            final String _tmpQuestion2DevelopmentDateWithdrawn;
            _tmpQuestion2DevelopmentDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion2DevelopmentDateWithdrawn);
            final String _tmpAnswerQuestion2_1;
            _tmpAnswerQuestion2_1 = _cursor.getString(_cursorIndexOfAnswerQuestion21);
            final String _tmpAnswerQuestion2_2;
            _tmpAnswerQuestion2_2 = _cursor.getString(_cursorIndexOfAnswerQuestion22);
            final String _tmpAnswerQuestion2_3;
            _tmpAnswerQuestion2_3 = _cursor.getString(_cursorIndexOfAnswerQuestion23);
            final String _tmpAnswerQuestion2_4;
            _tmpAnswerQuestion2_4 = _cursor.getString(_cursorIndexOfAnswerQuestion24);
            final String _tmpAnswerQuestion2_5;
            _tmpAnswerQuestion2_5 = _cursor.getString(_cursorIndexOfAnswerQuestion25);
            final String _tmpAnswerQuestion3_1;
            _tmpAnswerQuestion3_1 = _cursor.getString(_cursorIndexOfAnswerQuestion31);
            final String _tmpAnswerQuestion3_2;
            _tmpAnswerQuestion3_2 = _cursor.getString(_cursorIndexOfAnswerQuestion32);
            final String _tmpAnswerQuestion3_3;
            _tmpAnswerQuestion3_3 = _cursor.getString(_cursorIndexOfAnswerQuestion33);
            final String _tmpAnswerQuestion3_4_Male;
            _tmpAnswerQuestion3_4_Male = _cursor.getString(_cursorIndexOfAnswerQuestion34Male);
            final String _tmpAnswerQuestion3_4_Female;
            _tmpAnswerQuestion3_4_Female = _cursor.getString(_cursorIndexOfAnswerQuestion34Female);
            final String _tmpAnswerQuestion3_5;
            _tmpAnswerQuestion3_5 = _cursor.getString(_cursorIndexOfAnswerQuestion35);
            final String _tmpAnswerQuestion4_1;
            _tmpAnswerQuestion4_1 = _cursor.getString(_cursorIndexOfAnswerQuestion41);
            final String _tmpAnswerQuestion4_2_Input_1;
            _tmpAnswerQuestion4_2_Input_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input1);
            final String _tmpAnswerQuestion4_2_Date_1;
            _tmpAnswerQuestion4_2_Date_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date1);
            final String _tmpAnswerQuestion4_2_Male_Number_1;
            _tmpAnswerQuestion4_2_Male_Number_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber1);
            final String _tmpAnswerQuestion4_2_Female_Number_1;
            _tmpAnswerQuestion4_2_Female_Number_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber1);
            final String _tmpAnswerQuestion4_2_village_1;
            _tmpAnswerQuestion4_2_village_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village1);
            final String _tmpAnswerQuestion4_2_Input_2;
            _tmpAnswerQuestion4_2_Input_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input2);
            final String _tmpAnswerQuestion4_2_Date_2;
            _tmpAnswerQuestion4_2_Date_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date2);
            final String _tmpAnswerQuestion4_2_Male_Number_2;
            _tmpAnswerQuestion4_2_Male_Number_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber2);
            final String _tmpAnswerQuestion4_2_Female_Number_2;
            _tmpAnswerQuestion4_2_Female_Number_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber2);
            final String _tmpAnswerQuestion4_2_village_2;
            _tmpAnswerQuestion4_2_village_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village2);
            final String _tmpAnswerQuestion4_2_Input_3;
            _tmpAnswerQuestion4_2_Input_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input3);
            final String _tmpAnswerQuestion4_2_Date_3;
            _tmpAnswerQuestion4_2_Date_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date3);
            final String _tmpAnswerQuestion4_2_Male_Number_3;
            _tmpAnswerQuestion4_2_Male_Number_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber3);
            final String _tmpAnswerQuestion4_2_Female_Number_3;
            _tmpAnswerQuestion4_2_Female_Number_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber3);
            final String _tmpAnswerQuestion4_2_village_3;
            _tmpAnswerQuestion4_2_village_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village3);
            final String _tmpAnswerQuestion4_2_Input_4;
            _tmpAnswerQuestion4_2_Input_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input4);
            final String _tmpAnswerQuestion4_2_Date_4;
            _tmpAnswerQuestion4_2_Date_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date4);
            final String _tmpAnswerQuestion4_2_Male_Number_4;
            _tmpAnswerQuestion4_2_Male_Number_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber4);
            final String _tmpAnswerQuestion4_2_Female_Number_4;
            _tmpAnswerQuestion4_2_Female_Number_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber4);
            final String _tmpAnswerQuestion4_2_village_4;
            _tmpAnswerQuestion4_2_village_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village4);
            final String _tmpAnswerQuestion4_2_Input_5;
            _tmpAnswerQuestion4_2_Input_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input5);
            final String _tmpAnswerQuestion4_2_Date_5;
            _tmpAnswerQuestion4_2_Date_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date5);
            final String _tmpAnswerQuestion4_2_Male_Number_5;
            _tmpAnswerQuestion4_2_Male_Number_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber5);
            final String _tmpAnswerQuestion4_2_Female_Number_5;
            _tmpAnswerQuestion4_2_Female_Number_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber5);
            final String _tmpAnswerQuestion4_2_village_5;
            _tmpAnswerQuestion4_2_village_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village5);
            final String _tmpAnswerQuestion4_3_reason;
            _tmpAnswerQuestion4_3_reason = _cursor.getString(_cursorIndexOfAnswerQuestion43Reason);
            final String _tmpAnswerQuestion4_3_otherReason;
            _tmpAnswerQuestion4_3_otherReason = _cursor.getString(_cursorIndexOfAnswerQuestion43OtherReason);
            final String _tmpQuarter;
            _tmpQuarter = _cursor.getString(_cursorIndexOfQuarter);
            _item = new AgricultureQuestion(_tmpFinancialYear,_tmpQuarter,_tmpDate,_tmpVillage,_tmpParish,_tmpSubCounty,_tmpAgentName,_tmpTel,_tmpAgentNumber,_tmpQuestion1Objective,_tmpQuestion1Reason,_tmpQuestion2ExtensionExpectedAmount,_tmpQuestion2ExtensionAmountReceived,_tmpQuestion2ExtensionDateReceived,_tmpQuestion2ExtensionDateWithdram,_tmpQuestion2DevelopmentAmountExpected,_tmpQuestion2DevelopmentAmountReceived,_tmpQuestion2DevelopmentDateReceived,_tmpQuestion2DevelopmentDateWithdrawn,_tmpAnswerQuestion2_1,_tmpAnswerQuestion2_2,_tmpAnswerQuestion2_3,_tmpAnswerQuestion2_4,_tmpAnswerQuestion2_5,_tmpAnswerQuestion3_1,_tmpAnswerQuestion3_2,_tmpAnswerQuestion3_3,_tmpAnswerQuestion3_4_Male,_tmpAnswerQuestion3_4_Female,_tmpAnswerQuestion3_5,_tmpAnswerQuestion4_1,_tmpAnswerQuestion4_2_Input_1,_tmpAnswerQuestion4_2_Date_1,_tmpAnswerQuestion4_2_Male_Number_1,_tmpAnswerQuestion4_2_Female_Number_1,_tmpAnswerQuestion4_2_village_1,_tmpAnswerQuestion4_2_Input_2,_tmpAnswerQuestion4_2_Date_2,_tmpAnswerQuestion4_2_Male_Number_2,_tmpAnswerQuestion4_2_Female_Number_2,_tmpAnswerQuestion4_2_village_2,_tmpAnswerQuestion4_2_Input_3,_tmpAnswerQuestion4_2_Date_3,_tmpAnswerQuestion4_2_Male_Number_3,_tmpAnswerQuestion4_2_Female_Number_3,_tmpAnswerQuestion4_2_village_3,_tmpAnswerQuestion4_2_Input_4,_tmpAnswerQuestion4_2_Date_4,_tmpAnswerQuestion4_2_Male_Number_4,_tmpAnswerQuestion4_2_Female_Number_4,_tmpAnswerQuestion4_2_village_4,_tmpAnswerQuestion4_2_Input_5,_tmpAnswerQuestion4_2_Date_5,_tmpAnswerQuestion4_2_Male_Number_5,_tmpAnswerQuestion4_2_Female_Number_5,_tmpAnswerQuestion4_2_village_5,_tmpAnswerQuestion4_3_reason,_tmpAnswerQuestion4_3_otherReason);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
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

  @Override
  public List<AgricultureQuestion> getAgricultureQuestionForUpload(final boolean isStoredLocally) {
    final String _sql = "SELECT * FROM agric WHERE locally =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    final int _tmp;
    _tmp = isStoredLocally ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "fy");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
      final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
      final int _cursorIndexOfSubCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
      final int _cursorIndexOfAgentName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
      final int _cursorIndexOfAgentNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "num");
      final int _cursorIndexOfQuestion1Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q1o");
      final int _cursorIndexOfQuestion1Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q1reason");
      final int _cursorIndexOfQuestion2ExtensionExpectedAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "q2ext");
      final int _cursorIndexOfQuestion2ExtensionAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2extreceived");
      final int _cursorIndexOfQuestion2ExtensionDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2dateextReceived");
      final int _cursorIndexOfQuestion2ExtensionDateWithdram = CursorUtil.getColumnIndexOrThrow(_cursor, "q2extdatewithdrawn");
      final int _cursorIndexOfQuestion2DevelopmentAmountExpected = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devexp");
      final int _cursorIndexOfQuestion2DevelopmentAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devrecieved");
      final int _cursorIndexOfQuestion2DevelopmentDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devdaterecieved");
      final int _cursorIndexOfQuestion2DevelopmentDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devdatewithdrawn");
      final int _cursorIndexOfAnswerQuestion21 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_1");
      final int _cursorIndexOfAnswerQuestion22 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_2");
      final int _cursorIndexOfAnswerQuestion23 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_3");
      final int _cursorIndexOfAnswerQuestion24 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_4");
      final int _cursorIndexOfAnswerQuestion25 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_5");
      final int _cursorIndexOfAnswerQuestion31 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_1");
      final int _cursorIndexOfAnswerQuestion32 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_2_num");
      final int _cursorIndexOfAnswerQuestion33 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_3_mention");
      final int _cursorIndexOfAnswerQuestion34Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_4_male");
      final int _cursorIndexOfAnswerQuestion34Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_4_female");
      final int _cursorIndexOfAnswerQuestion35 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_5_reason");
      final int _cursorIndexOfAnswerQuestion41 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_1_inputs");
      final int _cursorIndexOfAnswerQuestion42Input1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_1");
      final int _cursorIndexOfAnswerQuestion42Date1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_1");
      final int _cursorIndexOfAnswerQuestion42MaleNumber1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_1");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_1");
      final int _cursorIndexOfAnswerQuestion42Village1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_1");
      final int _cursorIndexOfAnswerQuestion42Input2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_2");
      final int _cursorIndexOfAnswerQuestion42Date2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_2");
      final int _cursorIndexOfAnswerQuestion42MaleNumber2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_2");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_2");
      final int _cursorIndexOfAnswerQuestion42Village2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_2");
      final int _cursorIndexOfAnswerQuestion42Input3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_3");
      final int _cursorIndexOfAnswerQuestion42Date3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_3");
      final int _cursorIndexOfAnswerQuestion42MaleNumber3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_3");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_3");
      final int _cursorIndexOfAnswerQuestion42Village3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_3");
      final int _cursorIndexOfAnswerQuestion42Input4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_4");
      final int _cursorIndexOfAnswerQuestion42Date4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_4");
      final int _cursorIndexOfAnswerQuestion42MaleNumber4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_4");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_4");
      final int _cursorIndexOfAnswerQuestion42Village4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_4");
      final int _cursorIndexOfAnswerQuestion42Input5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_5");
      final int _cursorIndexOfAnswerQuestion42Date5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_5");
      final int _cursorIndexOfAnswerQuestion42MaleNumber5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_5");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_5");
      final int _cursorIndexOfAnswerQuestion42Village5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_5");
      final int _cursorIndexOfAnswerQuestion43Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_3_reason");
      final int _cursorIndexOfAnswerQuestion43OtherReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_3_any_other_reason");
      final int _cursorIndexOfStoredLocally = CursorUtil.getColumnIndexOrThrow(_cursor, "locally");
      final int _cursorIndexOfQuarter = CursorUtil.getColumnIndexOrThrow(_cursor, "quarter");
      final List<AgricultureQuestion> _result = new ArrayList<AgricultureQuestion>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AgricultureQuestion _item;
        final String _tmpFinancialYear;
        _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpVillage;
        _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
        final String _tmpParish;
        _tmpParish = _cursor.getString(_cursorIndexOfParish);
        final String _tmpSubCounty;
        _tmpSubCounty = _cursor.getString(_cursorIndexOfSubCounty);
        final String _tmpAgentName;
        _tmpAgentName = _cursor.getString(_cursorIndexOfAgentName);
        final String _tmpTel;
        _tmpTel = _cursor.getString(_cursorIndexOfTel);
        final String _tmpAgentNumber;
        _tmpAgentNumber = _cursor.getString(_cursorIndexOfAgentNumber);
        final String _tmpQuestion1Objective;
        _tmpQuestion1Objective = _cursor.getString(_cursorIndexOfQuestion1Objective);
        final String _tmpQuestion1Reason;
        _tmpQuestion1Reason = _cursor.getString(_cursorIndexOfQuestion1Reason);
        final String _tmpQuestion2ExtensionExpectedAmount;
        _tmpQuestion2ExtensionExpectedAmount = _cursor.getString(_cursorIndexOfQuestion2ExtensionExpectedAmount);
        final String _tmpQuestion2ExtensionAmountReceived;
        _tmpQuestion2ExtensionAmountReceived = _cursor.getString(_cursorIndexOfQuestion2ExtensionAmountReceived);
        final String _tmpQuestion2ExtensionDateReceived;
        _tmpQuestion2ExtensionDateReceived = _cursor.getString(_cursorIndexOfQuestion2ExtensionDateReceived);
        final String _tmpQuestion2ExtensionDateWithdram;
        _tmpQuestion2ExtensionDateWithdram = _cursor.getString(_cursorIndexOfQuestion2ExtensionDateWithdram);
        final String _tmpQuestion2DevelopmentAmountExpected;
        _tmpQuestion2DevelopmentAmountExpected = _cursor.getString(_cursorIndexOfQuestion2DevelopmentAmountExpected);
        final String _tmpQuestion2DevelopmentAmountReceived;
        _tmpQuestion2DevelopmentAmountReceived = _cursor.getString(_cursorIndexOfQuestion2DevelopmentAmountReceived);
        final String _tmpQuestion2DevelopmentDateReceived;
        _tmpQuestion2DevelopmentDateReceived = _cursor.getString(_cursorIndexOfQuestion2DevelopmentDateReceived);
        final String _tmpQuestion2DevelopmentDateWithdrawn;
        _tmpQuestion2DevelopmentDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion2DevelopmentDateWithdrawn);
        final String _tmpAnswerQuestion2_1;
        _tmpAnswerQuestion2_1 = _cursor.getString(_cursorIndexOfAnswerQuestion21);
        final String _tmpAnswerQuestion2_2;
        _tmpAnswerQuestion2_2 = _cursor.getString(_cursorIndexOfAnswerQuestion22);
        final String _tmpAnswerQuestion2_3;
        _tmpAnswerQuestion2_3 = _cursor.getString(_cursorIndexOfAnswerQuestion23);
        final String _tmpAnswerQuestion2_4;
        _tmpAnswerQuestion2_4 = _cursor.getString(_cursorIndexOfAnswerQuestion24);
        final String _tmpAnswerQuestion2_5;
        _tmpAnswerQuestion2_5 = _cursor.getString(_cursorIndexOfAnswerQuestion25);
        final String _tmpAnswerQuestion3_1;
        _tmpAnswerQuestion3_1 = _cursor.getString(_cursorIndexOfAnswerQuestion31);
        final String _tmpAnswerQuestion3_2;
        _tmpAnswerQuestion3_2 = _cursor.getString(_cursorIndexOfAnswerQuestion32);
        final String _tmpAnswerQuestion3_3;
        _tmpAnswerQuestion3_3 = _cursor.getString(_cursorIndexOfAnswerQuestion33);
        final String _tmpAnswerQuestion3_4_Male;
        _tmpAnswerQuestion3_4_Male = _cursor.getString(_cursorIndexOfAnswerQuestion34Male);
        final String _tmpAnswerQuestion3_4_Female;
        _tmpAnswerQuestion3_4_Female = _cursor.getString(_cursorIndexOfAnswerQuestion34Female);
        final String _tmpAnswerQuestion3_5;
        _tmpAnswerQuestion3_5 = _cursor.getString(_cursorIndexOfAnswerQuestion35);
        final String _tmpAnswerQuestion4_1;
        _tmpAnswerQuestion4_1 = _cursor.getString(_cursorIndexOfAnswerQuestion41);
        final String _tmpAnswerQuestion4_2_Input_1;
        _tmpAnswerQuestion4_2_Input_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input1);
        final String _tmpAnswerQuestion4_2_Date_1;
        _tmpAnswerQuestion4_2_Date_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date1);
        final String _tmpAnswerQuestion4_2_Male_Number_1;
        _tmpAnswerQuestion4_2_Male_Number_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber1);
        final String _tmpAnswerQuestion4_2_Female_Number_1;
        _tmpAnswerQuestion4_2_Female_Number_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber1);
        final String _tmpAnswerQuestion4_2_village_1;
        _tmpAnswerQuestion4_2_village_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village1);
        final String _tmpAnswerQuestion4_2_Input_2;
        _tmpAnswerQuestion4_2_Input_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input2);
        final String _tmpAnswerQuestion4_2_Date_2;
        _tmpAnswerQuestion4_2_Date_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date2);
        final String _tmpAnswerQuestion4_2_Male_Number_2;
        _tmpAnswerQuestion4_2_Male_Number_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber2);
        final String _tmpAnswerQuestion4_2_Female_Number_2;
        _tmpAnswerQuestion4_2_Female_Number_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber2);
        final String _tmpAnswerQuestion4_2_village_2;
        _tmpAnswerQuestion4_2_village_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village2);
        final String _tmpAnswerQuestion4_2_Input_3;
        _tmpAnswerQuestion4_2_Input_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input3);
        final String _tmpAnswerQuestion4_2_Date_3;
        _tmpAnswerQuestion4_2_Date_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date3);
        final String _tmpAnswerQuestion4_2_Male_Number_3;
        _tmpAnswerQuestion4_2_Male_Number_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber3);
        final String _tmpAnswerQuestion4_2_Female_Number_3;
        _tmpAnswerQuestion4_2_Female_Number_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber3);
        final String _tmpAnswerQuestion4_2_village_3;
        _tmpAnswerQuestion4_2_village_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village3);
        final String _tmpAnswerQuestion4_2_Input_4;
        _tmpAnswerQuestion4_2_Input_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input4);
        final String _tmpAnswerQuestion4_2_Date_4;
        _tmpAnswerQuestion4_2_Date_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date4);
        final String _tmpAnswerQuestion4_2_Male_Number_4;
        _tmpAnswerQuestion4_2_Male_Number_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber4);
        final String _tmpAnswerQuestion4_2_Female_Number_4;
        _tmpAnswerQuestion4_2_Female_Number_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber4);
        final String _tmpAnswerQuestion4_2_village_4;
        _tmpAnswerQuestion4_2_village_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village4);
        final String _tmpAnswerQuestion4_2_Input_5;
        _tmpAnswerQuestion4_2_Input_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input5);
        final String _tmpAnswerQuestion4_2_Date_5;
        _tmpAnswerQuestion4_2_Date_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date5);
        final String _tmpAnswerQuestion4_2_Male_Number_5;
        _tmpAnswerQuestion4_2_Male_Number_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber5);
        final String _tmpAnswerQuestion4_2_Female_Number_5;
        _tmpAnswerQuestion4_2_Female_Number_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber5);
        final String _tmpAnswerQuestion4_2_village_5;
        _tmpAnswerQuestion4_2_village_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village5);
        final String _tmpAnswerQuestion4_3_reason;
        _tmpAnswerQuestion4_3_reason = _cursor.getString(_cursorIndexOfAnswerQuestion43Reason);
        final String _tmpAnswerQuestion4_3_otherReason;
        _tmpAnswerQuestion4_3_otherReason = _cursor.getString(_cursorIndexOfAnswerQuestion43OtherReason);
        final String _tmpQuarter;
        _tmpQuarter = _cursor.getString(_cursorIndexOfQuarter);
        _item = new AgricultureQuestion(_tmpFinancialYear,_tmpQuarter,_tmpDate,_tmpVillage,_tmpParish,_tmpSubCounty,_tmpAgentName,_tmpTel,_tmpAgentNumber,_tmpQuestion1Objective,_tmpQuestion1Reason,_tmpQuestion2ExtensionExpectedAmount,_tmpQuestion2ExtensionAmountReceived,_tmpQuestion2ExtensionDateReceived,_tmpQuestion2ExtensionDateWithdram,_tmpQuestion2DevelopmentAmountExpected,_tmpQuestion2DevelopmentAmountReceived,_tmpQuestion2DevelopmentDateReceived,_tmpQuestion2DevelopmentDateWithdrawn,_tmpAnswerQuestion2_1,_tmpAnswerQuestion2_2,_tmpAnswerQuestion2_3,_tmpAnswerQuestion2_4,_tmpAnswerQuestion2_5,_tmpAnswerQuestion3_1,_tmpAnswerQuestion3_2,_tmpAnswerQuestion3_3,_tmpAnswerQuestion3_4_Male,_tmpAnswerQuestion3_4_Female,_tmpAnswerQuestion3_5,_tmpAnswerQuestion4_1,_tmpAnswerQuestion4_2_Input_1,_tmpAnswerQuestion4_2_Date_1,_tmpAnswerQuestion4_2_Male_Number_1,_tmpAnswerQuestion4_2_Female_Number_1,_tmpAnswerQuestion4_2_village_1,_tmpAnswerQuestion4_2_Input_2,_tmpAnswerQuestion4_2_Date_2,_tmpAnswerQuestion4_2_Male_Number_2,_tmpAnswerQuestion4_2_Female_Number_2,_tmpAnswerQuestion4_2_village_2,_tmpAnswerQuestion4_2_Input_3,_tmpAnswerQuestion4_2_Date_3,_tmpAnswerQuestion4_2_Male_Number_3,_tmpAnswerQuestion4_2_Female_Number_3,_tmpAnswerQuestion4_2_village_3,_tmpAnswerQuestion4_2_Input_4,_tmpAnswerQuestion4_2_Date_4,_tmpAnswerQuestion4_2_Male_Number_4,_tmpAnswerQuestion4_2_Female_Number_4,_tmpAnswerQuestion4_2_village_4,_tmpAnswerQuestion4_2_Input_5,_tmpAnswerQuestion4_2_Date_5,_tmpAnswerQuestion4_2_Male_Number_5,_tmpAnswerQuestion4_2_Female_Number_5,_tmpAnswerQuestion4_2_village_5,_tmpAnswerQuestion4_3_reason,_tmpAnswerQuestion4_3_otherReason);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final boolean _tmpStoredLocally;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfStoredLocally);
        _tmpStoredLocally = _tmp_1 != 0;
        _item.setStoredLocally(_tmpStoredLocally);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public AgricultureQuestion getAgricultureQuestionById(final int primaryKey) {
    final String _sql = "SELECT * FROM agric WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, primaryKey);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "fy");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfVillage = CursorUtil.getColumnIndexOrThrow(_cursor, "village");
      final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
      final int _cursorIndexOfSubCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
      final int _cursorIndexOfAgentName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "tel");
      final int _cursorIndexOfAgentNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "num");
      final int _cursorIndexOfQuestion1Objective = CursorUtil.getColumnIndexOrThrow(_cursor, "q1o");
      final int _cursorIndexOfQuestion1Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q1reason");
      final int _cursorIndexOfQuestion2ExtensionExpectedAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "q2ext");
      final int _cursorIndexOfQuestion2ExtensionAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2extreceived");
      final int _cursorIndexOfQuestion2ExtensionDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2dateextReceived");
      final int _cursorIndexOfQuestion2ExtensionDateWithdram = CursorUtil.getColumnIndexOrThrow(_cursor, "q2extdatewithdrawn");
      final int _cursorIndexOfQuestion2DevelopmentAmountExpected = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devexp");
      final int _cursorIndexOfQuestion2DevelopmentAmountReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devrecieved");
      final int _cursorIndexOfQuestion2DevelopmentDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devdaterecieved");
      final int _cursorIndexOfQuestion2DevelopmentDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q2devdatewithdrawn");
      final int _cursorIndexOfAnswerQuestion21 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_1");
      final int _cursorIndexOfAnswerQuestion22 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_2");
      final int _cursorIndexOfAnswerQuestion23 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_3");
      final int _cursorIndexOfAnswerQuestion24 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_4");
      final int _cursorIndexOfAnswerQuestion25 = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_5");
      final int _cursorIndexOfAnswerQuestion31 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_1");
      final int _cursorIndexOfAnswerQuestion32 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_2_num");
      final int _cursorIndexOfAnswerQuestion33 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_3_mention");
      final int _cursorIndexOfAnswerQuestion34Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_4_male");
      final int _cursorIndexOfAnswerQuestion34Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_4_female");
      final int _cursorIndexOfAnswerQuestion35 = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_5_reason");
      final int _cursorIndexOfAnswerQuestion41 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_1_inputs");
      final int _cursorIndexOfAnswerQuestion42Input1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_1");
      final int _cursorIndexOfAnswerQuestion42Date1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_1");
      final int _cursorIndexOfAnswerQuestion42MaleNumber1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_1");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_1");
      final int _cursorIndexOfAnswerQuestion42Village1 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_1");
      final int _cursorIndexOfAnswerQuestion42Input2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_2");
      final int _cursorIndexOfAnswerQuestion42Date2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_2");
      final int _cursorIndexOfAnswerQuestion42MaleNumber2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_2");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_2");
      final int _cursorIndexOfAnswerQuestion42Village2 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_2");
      final int _cursorIndexOfAnswerQuestion42Input3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_3");
      final int _cursorIndexOfAnswerQuestion42Date3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_3");
      final int _cursorIndexOfAnswerQuestion42MaleNumber3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_3");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_3");
      final int _cursorIndexOfAnswerQuestion42Village3 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_3");
      final int _cursorIndexOfAnswerQuestion42Input4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_4");
      final int _cursorIndexOfAnswerQuestion42Date4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_4");
      final int _cursorIndexOfAnswerQuestion42MaleNumber4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_4");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_4");
      final int _cursorIndexOfAnswerQuestion42Village4 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_4");
      final int _cursorIndexOfAnswerQuestion42Input5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_input_5");
      final int _cursorIndexOfAnswerQuestion42Date5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_date_5");
      final int _cursorIndexOfAnswerQuestion42MaleNumber5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_male_number_5");
      final int _cursorIndexOfAnswerQuestion42FemaleNumber5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_female_number_5");
      final int _cursorIndexOfAnswerQuestion42Village5 = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_village_5");
      final int _cursorIndexOfAnswerQuestion43Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_3_reason");
      final int _cursorIndexOfAnswerQuestion43OtherReason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_3_any_other_reason");
      final int _cursorIndexOfStoredLocally = CursorUtil.getColumnIndexOrThrow(_cursor, "locally");
      final int _cursorIndexOfQuarter = CursorUtil.getColumnIndexOrThrow(_cursor, "quarter");
      final AgricultureQuestion _result;
      if(_cursor.moveToFirst()) {
        final String _tmpFinancialYear;
        _tmpFinancialYear = _cursor.getString(_cursorIndexOfFinancialYear);
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpVillage;
        _tmpVillage = _cursor.getString(_cursorIndexOfVillage);
        final String _tmpParish;
        _tmpParish = _cursor.getString(_cursorIndexOfParish);
        final String _tmpSubCounty;
        _tmpSubCounty = _cursor.getString(_cursorIndexOfSubCounty);
        final String _tmpAgentName;
        _tmpAgentName = _cursor.getString(_cursorIndexOfAgentName);
        final String _tmpTel;
        _tmpTel = _cursor.getString(_cursorIndexOfTel);
        final String _tmpAgentNumber;
        _tmpAgentNumber = _cursor.getString(_cursorIndexOfAgentNumber);
        final String _tmpQuestion1Objective;
        _tmpQuestion1Objective = _cursor.getString(_cursorIndexOfQuestion1Objective);
        final String _tmpQuestion1Reason;
        _tmpQuestion1Reason = _cursor.getString(_cursorIndexOfQuestion1Reason);
        final String _tmpQuestion2ExtensionExpectedAmount;
        _tmpQuestion2ExtensionExpectedAmount = _cursor.getString(_cursorIndexOfQuestion2ExtensionExpectedAmount);
        final String _tmpQuestion2ExtensionAmountReceived;
        _tmpQuestion2ExtensionAmountReceived = _cursor.getString(_cursorIndexOfQuestion2ExtensionAmountReceived);
        final String _tmpQuestion2ExtensionDateReceived;
        _tmpQuestion2ExtensionDateReceived = _cursor.getString(_cursorIndexOfQuestion2ExtensionDateReceived);
        final String _tmpQuestion2ExtensionDateWithdram;
        _tmpQuestion2ExtensionDateWithdram = _cursor.getString(_cursorIndexOfQuestion2ExtensionDateWithdram);
        final String _tmpQuestion2DevelopmentAmountExpected;
        _tmpQuestion2DevelopmentAmountExpected = _cursor.getString(_cursorIndexOfQuestion2DevelopmentAmountExpected);
        final String _tmpQuestion2DevelopmentAmountReceived;
        _tmpQuestion2DevelopmentAmountReceived = _cursor.getString(_cursorIndexOfQuestion2DevelopmentAmountReceived);
        final String _tmpQuestion2DevelopmentDateReceived;
        _tmpQuestion2DevelopmentDateReceived = _cursor.getString(_cursorIndexOfQuestion2DevelopmentDateReceived);
        final String _tmpQuestion2DevelopmentDateWithdrawn;
        _tmpQuestion2DevelopmentDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion2DevelopmentDateWithdrawn);
        final String _tmpAnswerQuestion2_1;
        _tmpAnswerQuestion2_1 = _cursor.getString(_cursorIndexOfAnswerQuestion21);
        final String _tmpAnswerQuestion2_2;
        _tmpAnswerQuestion2_2 = _cursor.getString(_cursorIndexOfAnswerQuestion22);
        final String _tmpAnswerQuestion2_3;
        _tmpAnswerQuestion2_3 = _cursor.getString(_cursorIndexOfAnswerQuestion23);
        final String _tmpAnswerQuestion2_4;
        _tmpAnswerQuestion2_4 = _cursor.getString(_cursorIndexOfAnswerQuestion24);
        final String _tmpAnswerQuestion2_5;
        _tmpAnswerQuestion2_5 = _cursor.getString(_cursorIndexOfAnswerQuestion25);
        final String _tmpAnswerQuestion3_1;
        _tmpAnswerQuestion3_1 = _cursor.getString(_cursorIndexOfAnswerQuestion31);
        final String _tmpAnswerQuestion3_2;
        _tmpAnswerQuestion3_2 = _cursor.getString(_cursorIndexOfAnswerQuestion32);
        final String _tmpAnswerQuestion3_3;
        _tmpAnswerQuestion3_3 = _cursor.getString(_cursorIndexOfAnswerQuestion33);
        final String _tmpAnswerQuestion3_4_Male;
        _tmpAnswerQuestion3_4_Male = _cursor.getString(_cursorIndexOfAnswerQuestion34Male);
        final String _tmpAnswerQuestion3_4_Female;
        _tmpAnswerQuestion3_4_Female = _cursor.getString(_cursorIndexOfAnswerQuestion34Female);
        final String _tmpAnswerQuestion3_5;
        _tmpAnswerQuestion3_5 = _cursor.getString(_cursorIndexOfAnswerQuestion35);
        final String _tmpAnswerQuestion4_1;
        _tmpAnswerQuestion4_1 = _cursor.getString(_cursorIndexOfAnswerQuestion41);
        final String _tmpAnswerQuestion4_2_Input_1;
        _tmpAnswerQuestion4_2_Input_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input1);
        final String _tmpAnswerQuestion4_2_Date_1;
        _tmpAnswerQuestion4_2_Date_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date1);
        final String _tmpAnswerQuestion4_2_Male_Number_1;
        _tmpAnswerQuestion4_2_Male_Number_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber1);
        final String _tmpAnswerQuestion4_2_Female_Number_1;
        _tmpAnswerQuestion4_2_Female_Number_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber1);
        final String _tmpAnswerQuestion4_2_village_1;
        _tmpAnswerQuestion4_2_village_1 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village1);
        final String _tmpAnswerQuestion4_2_Input_2;
        _tmpAnswerQuestion4_2_Input_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input2);
        final String _tmpAnswerQuestion4_2_Date_2;
        _tmpAnswerQuestion4_2_Date_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date2);
        final String _tmpAnswerQuestion4_2_Male_Number_2;
        _tmpAnswerQuestion4_2_Male_Number_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber2);
        final String _tmpAnswerQuestion4_2_Female_Number_2;
        _tmpAnswerQuestion4_2_Female_Number_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber2);
        final String _tmpAnswerQuestion4_2_village_2;
        _tmpAnswerQuestion4_2_village_2 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village2);
        final String _tmpAnswerQuestion4_2_Input_3;
        _tmpAnswerQuestion4_2_Input_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input3);
        final String _tmpAnswerQuestion4_2_Date_3;
        _tmpAnswerQuestion4_2_Date_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date3);
        final String _tmpAnswerQuestion4_2_Male_Number_3;
        _tmpAnswerQuestion4_2_Male_Number_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber3);
        final String _tmpAnswerQuestion4_2_Female_Number_3;
        _tmpAnswerQuestion4_2_Female_Number_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber3);
        final String _tmpAnswerQuestion4_2_village_3;
        _tmpAnswerQuestion4_2_village_3 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village3);
        final String _tmpAnswerQuestion4_2_Input_4;
        _tmpAnswerQuestion4_2_Input_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input4);
        final String _tmpAnswerQuestion4_2_Date_4;
        _tmpAnswerQuestion4_2_Date_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date4);
        final String _tmpAnswerQuestion4_2_Male_Number_4;
        _tmpAnswerQuestion4_2_Male_Number_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber4);
        final String _tmpAnswerQuestion4_2_Female_Number_4;
        _tmpAnswerQuestion4_2_Female_Number_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber4);
        final String _tmpAnswerQuestion4_2_village_4;
        _tmpAnswerQuestion4_2_village_4 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village4);
        final String _tmpAnswerQuestion4_2_Input_5;
        _tmpAnswerQuestion4_2_Input_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Input5);
        final String _tmpAnswerQuestion4_2_Date_5;
        _tmpAnswerQuestion4_2_Date_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Date5);
        final String _tmpAnswerQuestion4_2_Male_Number_5;
        _tmpAnswerQuestion4_2_Male_Number_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42MaleNumber5);
        final String _tmpAnswerQuestion4_2_Female_Number_5;
        _tmpAnswerQuestion4_2_Female_Number_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42FemaleNumber5);
        final String _tmpAnswerQuestion4_2_village_5;
        _tmpAnswerQuestion4_2_village_5 = _cursor.getString(_cursorIndexOfAnswerQuestion42Village5);
        final String _tmpAnswerQuestion4_3_reason;
        _tmpAnswerQuestion4_3_reason = _cursor.getString(_cursorIndexOfAnswerQuestion43Reason);
        final String _tmpAnswerQuestion4_3_otherReason;
        _tmpAnswerQuestion4_3_otherReason = _cursor.getString(_cursorIndexOfAnswerQuestion43OtherReason);
        final String _tmpQuarter;
        _tmpQuarter = _cursor.getString(_cursorIndexOfQuarter);
        _result = new AgricultureQuestion(_tmpFinancialYear,_tmpQuarter,_tmpDate,_tmpVillage,_tmpParish,_tmpSubCounty,_tmpAgentName,_tmpTel,_tmpAgentNumber,_tmpQuestion1Objective,_tmpQuestion1Reason,_tmpQuestion2ExtensionExpectedAmount,_tmpQuestion2ExtensionAmountReceived,_tmpQuestion2ExtensionDateReceived,_tmpQuestion2ExtensionDateWithdram,_tmpQuestion2DevelopmentAmountExpected,_tmpQuestion2DevelopmentAmountReceived,_tmpQuestion2DevelopmentDateReceived,_tmpQuestion2DevelopmentDateWithdrawn,_tmpAnswerQuestion2_1,_tmpAnswerQuestion2_2,_tmpAnswerQuestion2_3,_tmpAnswerQuestion2_4,_tmpAnswerQuestion2_5,_tmpAnswerQuestion3_1,_tmpAnswerQuestion3_2,_tmpAnswerQuestion3_3,_tmpAnswerQuestion3_4_Male,_tmpAnswerQuestion3_4_Female,_tmpAnswerQuestion3_5,_tmpAnswerQuestion4_1,_tmpAnswerQuestion4_2_Input_1,_tmpAnswerQuestion4_2_Date_1,_tmpAnswerQuestion4_2_Male_Number_1,_tmpAnswerQuestion4_2_Female_Number_1,_tmpAnswerQuestion4_2_village_1,_tmpAnswerQuestion4_2_Input_2,_tmpAnswerQuestion4_2_Date_2,_tmpAnswerQuestion4_2_Male_Number_2,_tmpAnswerQuestion4_2_Female_Number_2,_tmpAnswerQuestion4_2_village_2,_tmpAnswerQuestion4_2_Input_3,_tmpAnswerQuestion4_2_Date_3,_tmpAnswerQuestion4_2_Male_Number_3,_tmpAnswerQuestion4_2_Female_Number_3,_tmpAnswerQuestion4_2_village_3,_tmpAnswerQuestion4_2_Input_4,_tmpAnswerQuestion4_2_Date_4,_tmpAnswerQuestion4_2_Male_Number_4,_tmpAnswerQuestion4_2_Female_Number_4,_tmpAnswerQuestion4_2_village_4,_tmpAnswerQuestion4_2_Input_5,_tmpAnswerQuestion4_2_Date_5,_tmpAnswerQuestion4_2_Male_Number_5,_tmpAnswerQuestion4_2_Female_Number_5,_tmpAnswerQuestion4_2_village_5,_tmpAnswerQuestion4_3_reason,_tmpAnswerQuestion4_3_otherReason);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final boolean _tmpStoredLocally;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfStoredLocally);
        _tmpStoredLocally = _tmp != 0;
        _result.setStoredLocally(_tmpStoredLocally);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
