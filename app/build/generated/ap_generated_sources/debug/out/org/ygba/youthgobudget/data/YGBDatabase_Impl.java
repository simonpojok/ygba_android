package org.ygba.youthgobudget.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.ygba.youthgobudget.data.agriculture.AgricultureDao;
import org.ygba.youthgobudget.data.agriculture.AgricultureDao_Impl;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationFormDao;
import org.ygba.youthgobudget.data.budget_information.BudgetInformationFormDao_Impl;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentDao;
import org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentDao_Impl;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestionDao;
import org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestionDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class YGBDatabase_Impl extends YGBDatabase {
  private volatile AgricultureDao _agricultureDao;

  private volatile SocialDevelopmentDao _socialDevelopmentDao;

  private volatile WaterEnvironmentQuestionDao _waterEnvironmentQuestionDao;

  private volatile BudgetInformationFormDao _budgetInformationFormDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `agric` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fy` TEXT, `date` TEXT, `village` TEXT, `parish` TEXT, `sub_county` TEXT, `name` TEXT, `tel` TEXT, `num` TEXT, `q1o` TEXT, `q1reason` TEXT, `q2ext` TEXT, `q2extreceived` TEXT, `q2dateextReceived` TEXT, `q2extdatewithdrawn` TEXT, `q2devexp` TEXT, `q2devrecieved` TEXT, `q2devdaterecieved` TEXT, `q2devdatewithdrawn` TEXT, `q2_1` TEXT, `q2_2` TEXT, `q2_3` TEXT, `q2_4` TEXT, `q2_5` TEXT, `q3_1` TEXT, `q3_2_num` TEXT, `q3_3_mention` TEXT, `q3_4_male` TEXT, `q3_4_female` TEXT, `q3_5_reason` TEXT, `q4_1_inputs` TEXT, `q4_2_input_1` TEXT, `q4_2_date_1` TEXT, `q4_2_male_number_1` TEXT, `q4_2_female_number_1` TEXT, `q4_2_village_1` TEXT, `q4_2_input_2` TEXT, `q4_2_date_2` TEXT, `q4_2_male_number_2` TEXT, `q4_2_female_number_2` TEXT, `q4_2_village_2` TEXT, `q4_2_input_3` TEXT, `q4_2_date_3` TEXT, `q4_2_male_number_3` TEXT, `q4_2_female_number_3` TEXT, `q4_2_village_3` TEXT, `q4_2_input_4` TEXT, `q4_2_date_4` TEXT, `q4_2_male_number_4` TEXT, `q4_2_female_number_4` TEXT, `q4_2_village_4` TEXT, `q4_2_input_5` TEXT, `q4_2_date_5` TEXT, `q4_2_male_number_5` TEXT, `q4_2_female_number_5` TEXT, `q4_2_village_5` TEXT, `q4_3_reason` TEXT, `q4_3_any_other_reason` TEXT, `locally` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `social_dev` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `financial_year` TEXT, `date` TEXT, `district` TEXT, `village` TEXT, `parish` TEXT, `division` TEXT, `agent_name` TEXT, `tel` TEXT, `q2_com_expec` TEXT, `q2_com_received` TEXT, `q2_com_date_received` TEXT, `q2_com_date_withdrawn` TEXT, `q2_others_expected` TEXT, `q2_others_amount_received` TEXT, `q2_others_date_received` TEXT, `q2_others_date_withdrawn` TEXT, `q3_w_e_objective` TEXT, `q3_w_e_objective_reason` TEXT, `q3_w_g_1_name` TEXT, `q3_w_g_1_village` TEXT, `q3_w_g_1_m_numbers` TEXT, `q3_w_g_1_f_numbers` TEXT, `q3_w_g_1_a_received` TEXT, `q3_w_g_2_name` TEXT, `q3_w_g_2_village` TEXT, `q3_w_g_2_m_numbers` TEXT, `q3_w_g_2_f_numbers` TEXT, `q3_w_g_2_a_received` TEXT, `q3_w_g_3_name` TEXT, `q3_w_g_3_village` TEXT, `q3_w_g_3_m_numbers` TEXT, `q3_w_g_3_f_numbers` TEXT, `q3_w_g_3_a_received` TEXT, `q3_w_g_4_name` TEXT, `q3_w_g_4_village` TEXT, `q3_w_g_4_m_numbers` TEXT, `q3_w_g_4_f_numbers` TEXT, `q3_w_g_4_a_received` TEXT, `q3_w_g_5_name` TEXT, `q3_w_g_5_village` TEXT, `q3_w_g_5_m_numbers` TEXT, `q3_w_g_5_f_numbers` TEXT, `q3_w_g_5_a_received` TEXT, `q3_w_g_6_name` TEXT, `q3_w_g_6_village` TEXT, `q3_w_g_6_m_numbers` TEXT, `q3_w_g_6_f_numbers` TEXT, `q3_w_g_6_a_received` TEXT, `q3_w_g_7_name` TEXT, `q3_w_g_7_village` TEXT, `q3_w_g_7_m_numbers` TEXT, `q3_w_g_7_f_numbers` TEXT, `q3_w_g_7_a_received` TEXT, `q5_li_obj` TEXT, `q5_li_obj_reason` TEXT, `q4_y_g_1_name` TEXT, `q4_Y_g_1_village` TEXT, `q4_Y_g_1_m_numbers` TEXT, `q4_Y_g_1_f_numbers` TEXT, `q4_Y_g_1_a_received` TEXT, `q4_Y_g_2_name` TEXT, `q4_Y_g_2_village` TEXT, `q4_Y_g_2_m_numbers` TEXT, `q4_Y_g_2_f_numbers` TEXT, `q4_Y_g_2_a_received` TEXT, `q4_Y_g_3_name` TEXT, `q4_Y_g_3_village` TEXT, `q4_Y_g_3_m_numbers` TEXT, `q4_4_g_3_f_numbers` TEXT, `q4_Y_g_3_a_received` TEXT, `q4_Y_g_4_name` TEXT, `q4_Y_g_4_village` TEXT, `q4_Y_g_4_m_numbers` TEXT, `q4_Y_g_4_f_numbers` TEXT, `q4_Y_g_4_a_received` TEXT, `q4_Y_g_5_name` TEXT, `q4_Y_g_5_village` TEXT, `q4_Y_g_5_m_numbers` TEXT, `q4_Y_g_5_f_numbers` TEXT, `q4_Y_g_5_a_received` TEXT, `q4_6_g_6_name` TEXT, `q5_Y_g_6_village` TEXT, `q4_Y_g_6_m_numbers` TEXT, `Q4_Y_g_6_f_numbers` TEXT, `q4_Y_g_6_a_received` TEXT, `q4_Y_g_7_name` TEXT, `q4_Y_g_7_village` TEXT, `q4_Y_g_7_m_numbers` TEXT, `q4_Y_g_7_f_numbers` TEXT, `q4_Y_g_7_a_received` TEXT, `q5_number_m_trained` TEXT, `q5_number_f_trained` TEXT, `q6_com_g_formed` TEXT, `q7_others_challenges` TEXT, `locally_stored` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `water_and_env` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `financial_year` TEXT, `date` TEXT, `district` TEXT, `village` TEXT, `parish` TEXT, `sub_county` TEXT, `agent_name` TEXT, `agent_tel` TEXT, `q_1_objective` INTEGER NOT NULL, `q_1_reason` TEXT, `q_2_reason` TEXT, `q_4_answer` TEXT, `q_3_objective` INTEGER NOT NULL, `q_5_text` TEXT, `q_5_sub_1` TEXT, `q_5_ws_1` TEXT, `q_5_functional_1` INTEGER NOT NULL, `q_5_none_functional_1` INTEGER NOT NULL, `q_5_no_ws_available_1` INTEGER NOT NULL, `q_5_sub_2` TEXT, `q_5_ws_2` TEXT, `q_5_functional_2` INTEGER NOT NULL, `q_5_none_functional_2` INTEGER NOT NULL, `q_5_no_ws_available_2` INTEGER NOT NULL, `q_5_sub_3` TEXT, `q_5_ws_3` TEXT, `q_5_functional_3` INTEGER NOT NULL, `q_5_none_functional_3` INTEGER NOT NULL, `q_5_no_ws_available_3` INTEGER NOT NULL, `q_5_sub_4` TEXT, `q_5_ws_4` TEXT, `q_5_functional_4` INTEGER NOT NULL, `q_5_none_functional_4` INTEGER NOT NULL, `q_5_no_ws_available_4` INTEGER NOT NULL, `q_5_sub_5` TEXT, `q_5_ws_5` TEXT, `q_5_functional_5` INTEGER NOT NULL, `q_5_none_functional_5` INTEGER NOT NULL, `q_5_no_ws_available_5` INTEGER NOT NULL, `q_5_sub_6` TEXT, `q_5_ws_6` TEXT, `q_5_functional_6` INTEGER NOT NULL, `q_5_none_functional_6` INTEGER NOT NULL, `q_5_no_ws_available_6` INTEGER NOT NULL, `q_5_objective` INTEGER NOT NULL, `q_5_objective_reason` TEXT, `q_6_wetland_demarcated` TEXT, `q_6_village_name_1` TEXT, `q_6_1_wetland_1` INTEGER NOT NULL, `q_6_village_name_2` TEXT, `q_6_1_wetland_2` INTEGER NOT NULL, `q_6_village_name_3` TEXT, `q_6_1_wetland_3` INTEGER NOT NULL, `q_6_village_name_4` TEXT, `q_6_1_wetland_4` INTEGER NOT NULL, `q_6_village_name_5` TEXT, `q_6_1_wetland_5` INTEGER NOT NULL, `q_6_village_name_6` TEXT, `q_6_1_wetland_6` INTEGER NOT NULL, `q_6_2_tree_planting` TEXT, `locally_stored` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `budget_information` (`primary_key` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fin_year` TEXT, `admin_approved` INTEGER NOT NULL, `admin_percentage` INTEGER NOT NULL, `fin_approved` INTEGER NOT NULL, `fin_percentage` INTEGER NOT NULL, `statu_approved` INTEGER NOT NULL, `statu_per` INTEGER NOT NULL, `pro_approved` INTEGER NOT NULL, `pro_perc` INTEGER NOT NULL, `health_approved` INTEGER NOT NULL, `health_percentage` INTEGER NOT NULL, `education_approved` INTEGER NOT NULL, `education_percentage` INTEGER NOT NULL, `road_approved` INTEGER NOT NULL, `road_percentagae` INTEGER NOT NULL, `water_approved` INTEGER NOT NULL, `water_percentage` INTEGER NOT NULL, `natural_approved` INTEGER NOT NULL, `natural_percentage` INTEGER NOT NULL, `com_approved` INTEGER NOT NULL, `com_percentage` INTEGER NOT NULL, `planning_approved` INTEGER NOT NULL, `planning_percentage` INTEGER NOT NULL, `internal_audit` INTEGER NOT NULL, `internal_percentage` INTEGER NOT NULL, `trade_approved` INTEGER NOT NULL, `trade_percentage` INTEGER NOT NULL, `total_approved` INTEGER NOT NULL, `total_percentage` INTEGER NOT NULL, `wage_approved_b` INTEGER NOT NULL, `wage_approved_a` INTEGER NOT NULL, `none_wage_approved_d` INTEGER NOT NULL, `none_wage_perce` INTEGER NOT NULL, `domestic_approved` INTEGER NOT NULL, `domestic_percentage` INTEGER NOT NULL, `ext_approved` INTEGER NOT NULL, `ext_percentage` INTEGER NOT NULL, `dis_name` TEXT, `service_name` TEXT, `com_wish_name` TEXT, `dis_1_sector` INTEGER NOT NULL, `sub_1_sect` INTEGER NOT NULL, `fin_1_sec` TEXT, `service_1_sector` TEXT, `community_wishes_1` TEXT, `dis_2_sector` INTEGER NOT NULL, `sub_2_sect` INTEGER NOT NULL, `fin_2_sec` TEXT, `service_2_sector` TEXT, `community_wishes_2` TEXT, `dis_3_sector` INTEGER NOT NULL, `sub_3_sect` INTEGER NOT NULL, `fin_3_sec` TEXT, `service_3_sector` TEXT, `community_wishes_3` TEXT, `dis_4_sector` INTEGER NOT NULL, `sub_4_sect` INTEGER NOT NULL, `fin_4_sec` TEXT, `service_4_sector` TEXT, `community_wishes_4` TEXT, `dis_5_sector` INTEGER NOT NULL, `sub_5_sect` INTEGER NOT NULL, `fin_5_sec` TEXT, `service_5_sector` TEXT, `community_wishes_5` TEXT, `dis_6_sector` INTEGER NOT NULL, `sub_6_sect` INTEGER NOT NULL, `fin_6_sec` TEXT, `service_6_sector` TEXT, `community_wishes_6` TEXT, `dis_7_sector` INTEGER NOT NULL, `sub_7_sect` INTEGER NOT NULL, `fin_7_sec` TEXT, `service_7_sector` TEXT, `community_wishes_7` TEXT, `stored_locally` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd765022a807ff35192ccf32881b31a79')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `agric`");
        _db.execSQL("DROP TABLE IF EXISTS `social_dev`");
        _db.execSQL("DROP TABLE IF EXISTS `water_and_env`");
        _db.execSQL("DROP TABLE IF EXISTS `budget_information`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAgric = new HashMap<String, TableInfo.Column>(59);
        _columnsAgric.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("fy", new TableInfo.Column("fy", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("sub_county", new TableInfo.Column("sub_county", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("tel", new TableInfo.Column("tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("num", new TableInfo.Column("num", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q1o", new TableInfo.Column("q1o", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q1reason", new TableInfo.Column("q1reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2ext", new TableInfo.Column("q2ext", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2extreceived", new TableInfo.Column("q2extreceived", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2dateextReceived", new TableInfo.Column("q2dateextReceived", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2extdatewithdrawn", new TableInfo.Column("q2extdatewithdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devexp", new TableInfo.Column("q2devexp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devrecieved", new TableInfo.Column("q2devrecieved", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devdaterecieved", new TableInfo.Column("q2devdaterecieved", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2devdatewithdrawn", new TableInfo.Column("q2devdatewithdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_1", new TableInfo.Column("q2_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_2", new TableInfo.Column("q2_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_3", new TableInfo.Column("q2_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_4", new TableInfo.Column("q2_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q2_5", new TableInfo.Column("q2_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_1", new TableInfo.Column("q3_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_2_num", new TableInfo.Column("q3_2_num", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_3_mention", new TableInfo.Column("q3_3_mention", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_4_male", new TableInfo.Column("q3_4_male", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_4_female", new TableInfo.Column("q3_4_female", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q3_5_reason", new TableInfo.Column("q3_5_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_1_inputs", new TableInfo.Column("q4_1_inputs", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_1", new TableInfo.Column("q4_2_input_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_1", new TableInfo.Column("q4_2_date_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_1", new TableInfo.Column("q4_2_male_number_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_1", new TableInfo.Column("q4_2_female_number_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_1", new TableInfo.Column("q4_2_village_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_2", new TableInfo.Column("q4_2_input_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_2", new TableInfo.Column("q4_2_date_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_2", new TableInfo.Column("q4_2_male_number_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_2", new TableInfo.Column("q4_2_female_number_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_2", new TableInfo.Column("q4_2_village_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_3", new TableInfo.Column("q4_2_input_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_3", new TableInfo.Column("q4_2_date_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_3", new TableInfo.Column("q4_2_male_number_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_3", new TableInfo.Column("q4_2_female_number_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_3", new TableInfo.Column("q4_2_village_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_4", new TableInfo.Column("q4_2_input_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_4", new TableInfo.Column("q4_2_date_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_4", new TableInfo.Column("q4_2_male_number_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_4", new TableInfo.Column("q4_2_female_number_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_4", new TableInfo.Column("q4_2_village_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_input_5", new TableInfo.Column("q4_2_input_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_date_5", new TableInfo.Column("q4_2_date_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_male_number_5", new TableInfo.Column("q4_2_male_number_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_female_number_5", new TableInfo.Column("q4_2_female_number_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_2_village_5", new TableInfo.Column("q4_2_village_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_3_reason", new TableInfo.Column("q4_3_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("q4_3_any_other_reason", new TableInfo.Column("q4_3_any_other_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAgric.put("locally", new TableInfo.Column("locally", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAgric = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAgric = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAgric = new TableInfo("agric", _columnsAgric, _foreignKeysAgric, _indicesAgric);
        final TableInfo _existingAgric = TableInfo.read(_db, "agric");
        if (! _infoAgric.equals(_existingAgric)) {
          return new RoomOpenHelper.ValidationResult(false, "agric(org.ygba.youthgobudget.data.agriculture.AgricultureQuestion).\n"
                  + " Expected:\n" + _infoAgric + "\n"
                  + " Found:\n" + _existingAgric);
        }
        final HashMap<String, TableInfo.Column> _columnsSocialDev = new HashMap<String, TableInfo.Column>(96);
        _columnsSocialDev.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("financial_year", new TableInfo.Column("financial_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("division", new TableInfo.Column("division", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("agent_name", new TableInfo.Column("agent_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("tel", new TableInfo.Column("tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_expec", new TableInfo.Column("q2_com_expec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_received", new TableInfo.Column("q2_com_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_date_received", new TableInfo.Column("q2_com_date_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_com_date_withdrawn", new TableInfo.Column("q2_com_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_expected", new TableInfo.Column("q2_others_expected", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_amount_received", new TableInfo.Column("q2_others_amount_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_date_received", new TableInfo.Column("q2_others_date_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q2_others_date_withdrawn", new TableInfo.Column("q2_others_date_withdrawn", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_e_objective", new TableInfo.Column("q3_w_e_objective", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_e_objective_reason", new TableInfo.Column("q3_w_e_objective_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_name", new TableInfo.Column("q3_w_g_1_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_village", new TableInfo.Column("q3_w_g_1_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_m_numbers", new TableInfo.Column("q3_w_g_1_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_f_numbers", new TableInfo.Column("q3_w_g_1_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_1_a_received", new TableInfo.Column("q3_w_g_1_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_name", new TableInfo.Column("q3_w_g_2_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_village", new TableInfo.Column("q3_w_g_2_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_m_numbers", new TableInfo.Column("q3_w_g_2_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_f_numbers", new TableInfo.Column("q3_w_g_2_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_2_a_received", new TableInfo.Column("q3_w_g_2_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_name", new TableInfo.Column("q3_w_g_3_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_village", new TableInfo.Column("q3_w_g_3_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_m_numbers", new TableInfo.Column("q3_w_g_3_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_f_numbers", new TableInfo.Column("q3_w_g_3_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_3_a_received", new TableInfo.Column("q3_w_g_3_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_name", new TableInfo.Column("q3_w_g_4_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_village", new TableInfo.Column("q3_w_g_4_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_m_numbers", new TableInfo.Column("q3_w_g_4_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_f_numbers", new TableInfo.Column("q3_w_g_4_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_4_a_received", new TableInfo.Column("q3_w_g_4_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_name", new TableInfo.Column("q3_w_g_5_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_village", new TableInfo.Column("q3_w_g_5_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_m_numbers", new TableInfo.Column("q3_w_g_5_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_f_numbers", new TableInfo.Column("q3_w_g_5_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_5_a_received", new TableInfo.Column("q3_w_g_5_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_name", new TableInfo.Column("q3_w_g_6_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_village", new TableInfo.Column("q3_w_g_6_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_m_numbers", new TableInfo.Column("q3_w_g_6_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_f_numbers", new TableInfo.Column("q3_w_g_6_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_6_a_received", new TableInfo.Column("q3_w_g_6_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_name", new TableInfo.Column("q3_w_g_7_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_village", new TableInfo.Column("q3_w_g_7_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_m_numbers", new TableInfo.Column("q3_w_g_7_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_f_numbers", new TableInfo.Column("q3_w_g_7_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q3_w_g_7_a_received", new TableInfo.Column("q3_w_g_7_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_li_obj", new TableInfo.Column("q5_li_obj", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_li_obj_reason", new TableInfo.Column("q5_li_obj_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_y_g_1_name", new TableInfo.Column("q4_y_g_1_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_village", new TableInfo.Column("q4_Y_g_1_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_m_numbers", new TableInfo.Column("q4_Y_g_1_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_f_numbers", new TableInfo.Column("q4_Y_g_1_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_1_a_received", new TableInfo.Column("q4_Y_g_1_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_name", new TableInfo.Column("q4_Y_g_2_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_village", new TableInfo.Column("q4_Y_g_2_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_m_numbers", new TableInfo.Column("q4_Y_g_2_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_f_numbers", new TableInfo.Column("q4_Y_g_2_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_2_a_received", new TableInfo.Column("q4_Y_g_2_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_name", new TableInfo.Column("q4_Y_g_3_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_village", new TableInfo.Column("q4_Y_g_3_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_m_numbers", new TableInfo.Column("q4_Y_g_3_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_4_g_3_f_numbers", new TableInfo.Column("q4_4_g_3_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_3_a_received", new TableInfo.Column("q4_Y_g_3_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_name", new TableInfo.Column("q4_Y_g_4_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_village", new TableInfo.Column("q4_Y_g_4_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_m_numbers", new TableInfo.Column("q4_Y_g_4_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_f_numbers", new TableInfo.Column("q4_Y_g_4_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_4_a_received", new TableInfo.Column("q4_Y_g_4_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_name", new TableInfo.Column("q4_Y_g_5_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_village", new TableInfo.Column("q4_Y_g_5_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_m_numbers", new TableInfo.Column("q4_Y_g_5_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_f_numbers", new TableInfo.Column("q4_Y_g_5_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_5_a_received", new TableInfo.Column("q4_Y_g_5_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_6_g_6_name", new TableInfo.Column("q4_6_g_6_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_Y_g_6_village", new TableInfo.Column("q5_Y_g_6_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_6_m_numbers", new TableInfo.Column("q4_Y_g_6_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("Q4_Y_g_6_f_numbers", new TableInfo.Column("Q4_Y_g_6_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_6_a_received", new TableInfo.Column("q4_Y_g_6_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_name", new TableInfo.Column("q4_Y_g_7_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_village", new TableInfo.Column("q4_Y_g_7_village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_m_numbers", new TableInfo.Column("q4_Y_g_7_m_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_f_numbers", new TableInfo.Column("q4_Y_g_7_f_numbers", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q4_Y_g_7_a_received", new TableInfo.Column("q4_Y_g_7_a_received", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_number_m_trained", new TableInfo.Column("q5_number_m_trained", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q5_number_f_trained", new TableInfo.Column("q5_number_f_trained", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q6_com_g_formed", new TableInfo.Column("q6_com_g_formed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("q7_others_challenges", new TableInfo.Column("q7_others_challenges", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSocialDev.put("locally_stored", new TableInfo.Column("locally_stored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSocialDev = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSocialDev = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSocialDev = new TableInfo("social_dev", _columnsSocialDev, _foreignKeysSocialDev, _indicesSocialDev);
        final TableInfo _existingSocialDev = TableInfo.read(_db, "social_dev");
        if (! _infoSocialDev.equals(_existingSocialDev)) {
          return new RoomOpenHelper.ValidationResult(false, "social_dev(org.ygba.youthgobudget.data.socialdevelopment.SocialDevelopmentQuestion).\n"
                  + " Expected:\n" + _infoSocialDev + "\n"
                  + " Found:\n" + _existingSocialDev);
        }
        final HashMap<String, TableInfo.Column> _columnsWaterAndEnv = new HashMap<String, TableInfo.Column>(62);
        _columnsWaterAndEnv.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("financial_year", new TableInfo.Column("financial_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("district", new TableInfo.Column("district", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("village", new TableInfo.Column("village", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("parish", new TableInfo.Column("parish", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("sub_county", new TableInfo.Column("sub_county", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("agent_name", new TableInfo.Column("agent_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("agent_tel", new TableInfo.Column("agent_tel", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_1_objective", new TableInfo.Column("q_1_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_1_reason", new TableInfo.Column("q_1_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_2_reason", new TableInfo.Column("q_2_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_4_answer", new TableInfo.Column("q_4_answer", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_3_objective", new TableInfo.Column("q_3_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_text", new TableInfo.Column("q_5_text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_1", new TableInfo.Column("q_5_sub_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_1", new TableInfo.Column("q_5_ws_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_1", new TableInfo.Column("q_5_functional_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_1", new TableInfo.Column("q_5_none_functional_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_1", new TableInfo.Column("q_5_no_ws_available_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_2", new TableInfo.Column("q_5_sub_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_2", new TableInfo.Column("q_5_ws_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_2", new TableInfo.Column("q_5_functional_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_2", new TableInfo.Column("q_5_none_functional_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_2", new TableInfo.Column("q_5_no_ws_available_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_3", new TableInfo.Column("q_5_sub_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_3", new TableInfo.Column("q_5_ws_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_3", new TableInfo.Column("q_5_functional_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_3", new TableInfo.Column("q_5_none_functional_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_3", new TableInfo.Column("q_5_no_ws_available_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_4", new TableInfo.Column("q_5_sub_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_4", new TableInfo.Column("q_5_ws_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_4", new TableInfo.Column("q_5_functional_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_4", new TableInfo.Column("q_5_none_functional_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_4", new TableInfo.Column("q_5_no_ws_available_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_5", new TableInfo.Column("q_5_sub_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_5", new TableInfo.Column("q_5_ws_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_5", new TableInfo.Column("q_5_functional_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_5", new TableInfo.Column("q_5_none_functional_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_5", new TableInfo.Column("q_5_no_ws_available_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_sub_6", new TableInfo.Column("q_5_sub_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_ws_6", new TableInfo.Column("q_5_ws_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_functional_6", new TableInfo.Column("q_5_functional_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_none_functional_6", new TableInfo.Column("q_5_none_functional_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_no_ws_available_6", new TableInfo.Column("q_5_no_ws_available_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_objective", new TableInfo.Column("q_5_objective", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_5_objective_reason", new TableInfo.Column("q_5_objective_reason", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_wetland_demarcated", new TableInfo.Column("q_6_wetland_demarcated", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_1", new TableInfo.Column("q_6_village_name_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_1", new TableInfo.Column("q_6_1_wetland_1", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_2", new TableInfo.Column("q_6_village_name_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_2", new TableInfo.Column("q_6_1_wetland_2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_3", new TableInfo.Column("q_6_village_name_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_3", new TableInfo.Column("q_6_1_wetland_3", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_4", new TableInfo.Column("q_6_village_name_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_4", new TableInfo.Column("q_6_1_wetland_4", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_5", new TableInfo.Column("q_6_village_name_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_5", new TableInfo.Column("q_6_1_wetland_5", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_village_name_6", new TableInfo.Column("q_6_village_name_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_1_wetland_6", new TableInfo.Column("q_6_1_wetland_6", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("q_6_2_tree_planting", new TableInfo.Column("q_6_2_tree_planting", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWaterAndEnv.put("locally_stored", new TableInfo.Column("locally_stored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWaterAndEnv = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWaterAndEnv = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWaterAndEnv = new TableInfo("water_and_env", _columnsWaterAndEnv, _foreignKeysWaterAndEnv, _indicesWaterAndEnv);
        final TableInfo _existingWaterAndEnv = TableInfo.read(_db, "water_and_env");
        if (! _infoWaterAndEnv.equals(_existingWaterAndEnv)) {
          return new RoomOpenHelper.ValidationResult(false, "water_and_env(org.ygba.youthgobudget.data.water_and_environment.WaterEnvironmentQuestion).\n"
                  + " Expected:\n" + _infoWaterAndEnv + "\n"
                  + " Found:\n" + _existingWaterAndEnv);
        }
        final HashMap<String, TableInfo.Column> _columnsBudgetInformation = new HashMap<String, TableInfo.Column>(77);
        _columnsBudgetInformation.put("primary_key", new TableInfo.Column("primary_key", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_year", new TableInfo.Column("fin_year", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("admin_approved", new TableInfo.Column("admin_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("admin_percentage", new TableInfo.Column("admin_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_approved", new TableInfo.Column("fin_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_percentage", new TableInfo.Column("fin_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("statu_approved", new TableInfo.Column("statu_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("statu_per", new TableInfo.Column("statu_per", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("pro_approved", new TableInfo.Column("pro_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("pro_perc", new TableInfo.Column("pro_perc", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("health_approved", new TableInfo.Column("health_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("health_percentage", new TableInfo.Column("health_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("education_approved", new TableInfo.Column("education_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("education_percentage", new TableInfo.Column("education_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("road_approved", new TableInfo.Column("road_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("road_percentagae", new TableInfo.Column("road_percentagae", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("water_approved", new TableInfo.Column("water_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("water_percentage", new TableInfo.Column("water_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("natural_approved", new TableInfo.Column("natural_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("natural_percentage", new TableInfo.Column("natural_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("com_approved", new TableInfo.Column("com_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("com_percentage", new TableInfo.Column("com_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("planning_approved", new TableInfo.Column("planning_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("planning_percentage", new TableInfo.Column("planning_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("internal_audit", new TableInfo.Column("internal_audit", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("internal_percentage", new TableInfo.Column("internal_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("trade_approved", new TableInfo.Column("trade_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("trade_percentage", new TableInfo.Column("trade_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("total_approved", new TableInfo.Column("total_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("total_percentage", new TableInfo.Column("total_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("wage_approved_b", new TableInfo.Column("wage_approved_b", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("wage_approved_a", new TableInfo.Column("wage_approved_a", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("none_wage_approved_d", new TableInfo.Column("none_wage_approved_d", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("none_wage_perce", new TableInfo.Column("none_wage_perce", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("domestic_approved", new TableInfo.Column("domestic_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("domestic_percentage", new TableInfo.Column("domestic_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("ext_approved", new TableInfo.Column("ext_approved", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("ext_percentage", new TableInfo.Column("ext_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_name", new TableInfo.Column("dis_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_name", new TableInfo.Column("service_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("com_wish_name", new TableInfo.Column("com_wish_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_1_sector", new TableInfo.Column("dis_1_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_1_sect", new TableInfo.Column("sub_1_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_1_sec", new TableInfo.Column("fin_1_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_1_sector", new TableInfo.Column("service_1_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_1", new TableInfo.Column("community_wishes_1", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_2_sector", new TableInfo.Column("dis_2_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_2_sect", new TableInfo.Column("sub_2_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_2_sec", new TableInfo.Column("fin_2_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_2_sector", new TableInfo.Column("service_2_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_2", new TableInfo.Column("community_wishes_2", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_3_sector", new TableInfo.Column("dis_3_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_3_sect", new TableInfo.Column("sub_3_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_3_sec", new TableInfo.Column("fin_3_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_3_sector", new TableInfo.Column("service_3_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_3", new TableInfo.Column("community_wishes_3", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_4_sector", new TableInfo.Column("dis_4_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_4_sect", new TableInfo.Column("sub_4_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_4_sec", new TableInfo.Column("fin_4_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_4_sector", new TableInfo.Column("service_4_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_4", new TableInfo.Column("community_wishes_4", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_5_sector", new TableInfo.Column("dis_5_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_5_sect", new TableInfo.Column("sub_5_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_5_sec", new TableInfo.Column("fin_5_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_5_sector", new TableInfo.Column("service_5_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_5", new TableInfo.Column("community_wishes_5", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_6_sector", new TableInfo.Column("dis_6_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_6_sect", new TableInfo.Column("sub_6_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_6_sec", new TableInfo.Column("fin_6_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_6_sector", new TableInfo.Column("service_6_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_6", new TableInfo.Column("community_wishes_6", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("dis_7_sector", new TableInfo.Column("dis_7_sector", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("sub_7_sect", new TableInfo.Column("sub_7_sect", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("fin_7_sec", new TableInfo.Column("fin_7_sec", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("service_7_sector", new TableInfo.Column("service_7_sector", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("community_wishes_7", new TableInfo.Column("community_wishes_7", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgetInformation.put("stored_locally", new TableInfo.Column("stored_locally", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBudgetInformation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBudgetInformation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBudgetInformation = new TableInfo("budget_information", _columnsBudgetInformation, _foreignKeysBudgetInformation, _indicesBudgetInformation);
        final TableInfo _existingBudgetInformation = TableInfo.read(_db, "budget_information");
        if (! _infoBudgetInformation.equals(_existingBudgetInformation)) {
          return new RoomOpenHelper.ValidationResult(false, "budget_information(org.ygba.youthgobudget.data.budget_information.BudgetInformationForm).\n"
                  + " Expected:\n" + _infoBudgetInformation + "\n"
                  + " Found:\n" + _existingBudgetInformation);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "d765022a807ff35192ccf32881b31a79", "d295ed0da5cc36ef50bf94e31d87392c");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "agric","social_dev","water_and_env","budget_information");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `agric`");
      _db.execSQL("DELETE FROM `social_dev`");
      _db.execSQL("DELETE FROM `water_and_env`");
      _db.execSQL("DELETE FROM `budget_information`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public AgricultureDao agricultureDao() {
    if (_agricultureDao != null) {
      return _agricultureDao;
    } else {
      synchronized(this) {
        if(_agricultureDao == null) {
          _agricultureDao = new AgricultureDao_Impl(this);
        }
        return _agricultureDao;
      }
    }
  }

  @Override
  public SocialDevelopmentDao socialDevelopmentDao() {
    if (_socialDevelopmentDao != null) {
      return _socialDevelopmentDao;
    } else {
      synchronized(this) {
        if(_socialDevelopmentDao == null) {
          _socialDevelopmentDao = new SocialDevelopmentDao_Impl(this);
        }
        return _socialDevelopmentDao;
      }
    }
  }

  @Override
  public WaterEnvironmentQuestionDao waterEnvironmentQuestionDao() {
    if (_waterEnvironmentQuestionDao != null) {
      return _waterEnvironmentQuestionDao;
    } else {
      synchronized(this) {
        if(_waterEnvironmentQuestionDao == null) {
          _waterEnvironmentQuestionDao = new WaterEnvironmentQuestionDao_Impl(this);
        }
        return _waterEnvironmentQuestionDao;
      }
    }
  }

  @Override
  public BudgetInformationFormDao budgetInformationFormDao() {
    if (_budgetInformationFormDao != null) {
      return _budgetInformationFormDao;
    } else {
      synchronized(this) {
        if(_budgetInformationFormDao == null) {
          _budgetInformationFormDao = new BudgetInformationFormDao_Impl(this);
        }
        return _budgetInformationFormDao;
      }
    }
  }
}
