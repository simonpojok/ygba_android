package org.ygba.youthgobudget.data.helpers.sub_county;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SubCountyDao_Impl implements SubCountyDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SubCounty> __insertionAdapterOfSubCounty;

  public SubCountyDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubCounty = new EntityInsertionAdapter<SubCounty>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `sub_county` (`primary_key`,`name`,`district_name`,`district`,`sub_county`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SubCounty value) {
        stmt.bindLong(1, value.getPrimaryKey());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDistrict());
        }
        stmt.bindLong(4, value.getDistrict_id());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void saveSubCounty(final SubCounty subCounty) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubCounty.insert(subCounty);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<SubCounty> getAllSubCounty() {
    final String _sql = "SELECT * FROM sub_county";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name");
      final int _cursorIndexOfDistrictId = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
      final List<SubCounty> _result = new ArrayList<SubCounty>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final SubCounty _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        final int _tmpDistrict_id;
        _tmpDistrict_id = _cursor.getInt(_cursorIndexOfDistrictId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item = new SubCounty(_tmpName,_tmpDistrict,_tmpDistrict_id,_tmpId);
        final int _tmpPrimaryKey;
        _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
        _item.setPrimaryKey(_tmpPrimaryKey);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SubCounty getSubCountyById(final int id) {
    final String _sql = "SELECT * FROM sub_county WHERE sub_county =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district_name");
      final int _cursorIndexOfDistrictId = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
      final SubCounty _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDistrict;
        _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
        final int _tmpDistrict_id;
        _tmpDistrict_id = _cursor.getInt(_cursorIndexOfDistrictId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result = new SubCounty(_tmpName,_tmpDistrict,_tmpDistrict_id,_tmpId);
        final int _tmpPrimaryKey;
        _tmpPrimaryKey = _cursor.getInt(_cursorIndexOfPrimaryKey);
        _result.setPrimaryKey(_tmpPrimaryKey);
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
