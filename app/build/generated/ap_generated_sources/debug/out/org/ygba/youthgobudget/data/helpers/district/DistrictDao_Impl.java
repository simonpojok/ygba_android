package org.ygba.youthgobudget.data.helpers.district;

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
public final class DistrictDao_Impl implements DistrictDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<District> __insertionAdapterOfDistrict;

  public DistrictDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDistrict = new EntityInsertionAdapter<District>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `district_table` (`primary_key`,`district`,`region`,`region_id`,`id`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, District value) {
        stmt.bindLong(1, value.getPrimaryKey());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getRegion() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRegion());
        }
        stmt.bindLong(4, value.getRegion_id());
        stmt.bindLong(5, value.getId());
      }
    };
  }

  @Override
  public void saveDistrict(final District district) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDistrict.insert(district);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<District> getAllDistricts() {
    final String _sql = "SELECT * FROM district_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
      final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
      final int _cursorIndexOfRegionId = CursorUtil.getColumnIndexOrThrow(_cursor, "region_id");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final List<District> _result = new ArrayList<District>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final District _item;
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRegion;
        _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
        final int _tmpRegion_id;
        _tmpRegion_id = _cursor.getInt(_cursorIndexOfRegionId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item = new District(_tmpName,_tmpRegion,_tmpRegion_id,_tmpId);
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
  public District getDistrictByID(final int id) {
    final String _sql = "SELECT * FROM district_table WHERE id =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfPrimaryKey = CursorUtil.getColumnIndexOrThrow(_cursor, "primary_key");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
      final int _cursorIndexOfRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "region");
      final int _cursorIndexOfRegionId = CursorUtil.getColumnIndexOrThrow(_cursor, "region_id");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final District _result;
      if(_cursor.moveToFirst()) {
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpRegion;
        _tmpRegion = _cursor.getString(_cursorIndexOfRegion);
        final int _tmpRegion_id;
        _tmpRegion_id = _cursor.getInt(_cursorIndexOfRegionId);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result = new District(_tmpName,_tmpRegion,_tmpRegion_id,_tmpId);
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
