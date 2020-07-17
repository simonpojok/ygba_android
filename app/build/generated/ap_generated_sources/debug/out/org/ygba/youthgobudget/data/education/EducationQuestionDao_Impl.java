package org.ygba.youthgobudget.data.education;

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
public final class EducationQuestionDao_Impl implements EducationQuestionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EducationQuestion> __insertionAdapterOfEducationQuestion;

  public EducationQuestionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEducationQuestion = new EntityInsertionAdapter<EducationQuestion>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `educ_table` (`pri`,`educ_financial`,`date`,`district`,`parish`,`sub_county`,`full_name`,`telephone`,`q1`,`q2_t_m`,`q2_t_f`,`q2_t_m_pwd`,`q2_t_f_pwd`,`q2_t_t`,`q2_p_m`,`q2_p_f`,`q2_p_m_pwds`,`q2_p_f_pwds`,`q2_p_t`,`q2_p7_m`,`q2_p7_f`,`q2_p7_m_pwds`,`q2_p7_f_pwds`,`q2_p_7_total`,`q2_drop_male`,`q2_drop_female`,`q2_drop_m_pwds`,`q2_d_f_pwds`,`q2_d_t`,`q2_1_reason`,`q3_a_b`,`q3_b_r`,`q3_g_d_r`,`q3_g_d_w`,`q3_sfg_a_b`,`q3_sfg_b_r`,`q3_sfg_d_r`,`q3_fg_d_w`,`q3_1_sd`,`q3_2_period`,`q4_g1_m`,`q4_g1_f`,`q4_g2_m`,`q4_g2_f`,`q4_g3_m`,`q4_g3_f`,`q4_other_m`,`q4_other_f`,`q4_1_performance`,`q4_2_reason`,`q5_t_nb`,`q5_t_ts`,`q5_t_m_s`,`q5_t_f_s`,`q5_t_t_m_s`,`q5_t_t_f_s`,`q5_t_t_mx_S`,`q5_t_f_f`,`q5_t_none`,`q5_l_n_b`,`q5_l_n_s`,`q5_l_m_s`,`q5_l_p_m_s`,`q5_l_p_f_s`,`q5_l_t_f_m_s`,`q5_l_t_m_m_s`,`q5_l_fun_func_ext`,`q5_l_b_fun_func`,`q5_VIP_n_blocks`,`q5_VIP_n_stances`,`q5_VIP_m_stances`,`q5_VIP_f_stances`,`q5_VIP_t_f_stances_23`,`q5_VIP_t_f_stances_3`,`q5_VIP_t_mixed_stances`,`q5_VIP_func_functional`,`q5_VIP_func_none`,`q5_FCROOM_n_blocks`,`q5_FCROOM_n_stances`,`q5_FCROOM_n_male_stances`,`q5_FCROOM_n_female_stances`,`q5_FCROOM_n_t_male_stances`,`q5_FCROOM_n_t_f_stances`,`q5_FCROOM_n_t_mixed_stances`,`q5_FCROOM_func_functional`,`q5_FCROOM_func_none`,`q5_UFB_n_blocks`,`q5_UFB_n_stances`,`q5_UFB_m_stances`,`q5_UFB_f_stances`,`q5_UFB_t_m_stances`,`q5_UFB_t_f_stances`,`q5_UFB_t_mixed_stances`,`q5_UFB_func_functional`,`q5_UFB_func_none`,`q5_1_l`,`q5_2_ramps`,`q5_2_pwd`,`q5_2_none`,`q5_2_others_Spec`,`q5_3_yes_no`,`q5_3_reason`,`q6_1_num`,`q6_2_num`,`q6_3_ratio`,`q7_e_m_t`,`q7_e_f_t`,`q7_e_t_P_a_T_visit`,`q5_t_p_a_Time`,`q7_total_number_of1_teachers`,`q7_1_p_r`,`q7_2_w_teacher`,`q7_3_q`,`q8_1_inspector`,`q8_2_inspector_visits`,`q8_3_com`,`q8_4_meet`,`q8_5_sch_mgt`,`q8_other_observations`,`stored_locally`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EducationQuestion value) {
        stmt.bindLong(1, value.id);
        if (value.financialYear == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.financialYear);
        }
        if (value.date == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.date);
        }
        if (value.district == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.district);
        }
        if (value.parish == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.parish);
        }
        if (value.sub_county == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.sub_county);
        }
        if (value.fullname == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.fullname);
        }
        if (value.tel == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.tel);
        }
        if (value.question1SchoolName == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.question1SchoolName);
        }
        if (value.question2TeacherMale == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.question2TeacherMale);
        }
        if (value.question2TeacherFemale == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.question2TeacherFemale);
        }
        if (value.question2TeacherMalePWDS == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.question2TeacherMalePWDS);
        }
        if (value.question2TeacherFemalePWDS == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.question2TeacherFemalePWDS);
        }
        if (value.question2TeacherTotal == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.question2TeacherTotal);
        }
        if (value.question2PupilMale == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.question2PupilMale);
        }
        if (value.question2PupilFemale == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.question2PupilFemale);
        }
        if (value.question2PupilMalePWDS == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.question2PupilMalePWDS);
        }
        if (value.question2PupilFemalePWDS == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.question2PupilFemalePWDS);
        }
        if (value.question2PupilTotal == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.question2PupilTotal);
        }
        if (value.question2P7Male == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.question2P7Male);
        }
        if (value.question2P7Female == null) {
          stmt.bindNull(21);
        } else {
          stmt.bindString(21, value.question2P7Female);
        }
        if (value.question2P7MalePWDS == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.question2P7MalePWDS);
        }
        if (value.question2P7FemalePWDS == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.question2P7FemalePWDS);
        }
        if (value.question2P7Total == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.question2P7Total);
        }
        if (value.question2DropMale == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.question2DropMale);
        }
        if (value.question2DropFemale == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.question2DropFemale);
        }
        if (value.question2DropMalePWDS == null) {
          stmt.bindNull(27);
        } else {
          stmt.bindString(27, value.question2DropMalePWDS);
        }
        if (value.question2DropFemalePWDS == null) {
          stmt.bindNull(28);
        } else {
          stmt.bindString(28, value.question2DropFemalePWDS);
        }
        if (value.question2DropTotal == null) {
          stmt.bindNull(29);
        } else {
          stmt.bindString(29, value.question2DropTotal);
        }
        if (value.question21Reason == null) {
          stmt.bindNull(30);
        } else {
          stmt.bindString(30, value.question21Reason);
        }
        if (value.question3GrantApprovedBudget == null) {
          stmt.bindNull(31);
        } else {
          stmt.bindString(31, value.question3GrantApprovedBudget);
        }
        if (value.question3GrantBudgetReleased == null) {
          stmt.bindNull(32);
        } else {
          stmt.bindString(32, value.question3GrantBudgetReleased);
        }
        if (value.question3GrantDateReceived == null) {
          stmt.bindNull(33);
        } else {
          stmt.bindString(33, value.question3GrantDateReceived);
        }
        if (value.question3GrantDateWithdrawn == null) {
          stmt.bindNull(34);
        } else {
          stmt.bindString(34, value.question3GrantDateWithdrawn);
        }
        if (value.question3SFGApprovedBudget == null) {
          stmt.bindNull(35);
        } else {
          stmt.bindString(35, value.question3SFGApprovedBudget);
        }
        if (value.question3SFGBudgetReleased == null) {
          stmt.bindNull(36);
        } else {
          stmt.bindString(36, value.question3SFGBudgetReleased);
        }
        if (value.question3SFGDateReceived == null) {
          stmt.bindNull(37);
        } else {
          stmt.bindString(37, value.question3SFGDateReceived);
        }
        if (value.question3SFGDateWithdrawn == null) {
          stmt.bindNull(38);
        } else {
          stmt.bindString(38, value.question3SFGDateWithdrawn);
        }
        if (value.question31Display == null) {
          stmt.bindNull(39);
        } else {
          stmt.bindString(39, value.question31Display);
        }
        if (value.question32Period == null) {
          stmt.bindNull(40);
        } else {
          stmt.bindString(40, value.question32Period);
        }
        if (value.question4Grade1Male == null) {
          stmt.bindNull(41);
        } else {
          stmt.bindString(41, value.question4Grade1Male);
        }
        if (value.question4Grade1Female == null) {
          stmt.bindNull(42);
        } else {
          stmt.bindString(42, value.question4Grade1Female);
        }
        if (value.question4Grade2Male == null) {
          stmt.bindNull(43);
        } else {
          stmt.bindString(43, value.question4Grade2Male);
        }
        if (value.question4Grade2Female == null) {
          stmt.bindNull(44);
        } else {
          stmt.bindString(44, value.question4Grade2Female);
        }
        if (value.question4Grade3Male == null) {
          stmt.bindNull(45);
        } else {
          stmt.bindString(45, value.question4Grade3Male);
        }
        if (value.question4Grade3Female == null) {
          stmt.bindNull(46);
        } else {
          stmt.bindString(46, value.question4Grade3Female);
        }
        if (value.question4GradeOtherMale == null) {
          stmt.bindNull(47);
        } else {
          stmt.bindString(47, value.question4GradeOtherMale);
        }
        if (value.question4GradeOtherFemale == null) {
          stmt.bindNull(48);
        } else {
          stmt.bindString(48, value.question4GradeOtherFemale);
        }
        if (value.question41Performance == null) {
          stmt.bindNull(49);
        } else {
          stmt.bindString(49, value.question41Performance);
        }
        if (value.question42Reason == null) {
          stmt.bindNull(50);
        } else {
          stmt.bindString(50, value.question42Reason);
        }
        final int _tmp;
        _tmp = value.question5ToiletNoOfBlocks ? 1 : 0;
        stmt.bindLong(51, _tmp);
        final int _tmp_1;
        _tmp_1 = value.question5ToiletNoOfStances ? 1 : 0;
        stmt.bindLong(52, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.question5ToiletPupilMaleStances ? 1 : 0;
        stmt.bindLong(53, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.question5ToiletPupilFemaleStances ? 1 : 0;
        stmt.bindLong(54, _tmp_3);
        final int _tmp_4;
        _tmp_4 = value.question5ToiletTeacherMaleStance ? 1 : 0;
        stmt.bindLong(55, _tmp_4);
        final int _tmp_5;
        _tmp_5 = value.question5ToiletTeacherMFemaleStance ? 1 : 0;
        stmt.bindLong(56, _tmp_5);
        final int _tmp_6;
        _tmp_6 = value.question5ToiletTeacherMixedStance ? 1 : 0;
        stmt.bindLong(57, _tmp_6);
        final int _tmp_7;
        _tmp_7 = value.question5ToiletFuncFunctional ? 1 : 0;
        stmt.bindLong(58, _tmp_7);
        final int _tmp_8;
        _tmp_8 = value.question5ToiletFuncNone ? 1 : 0;
        stmt.bindLong(59, _tmp_8);
        final int _tmp_9;
        _tmp_9 = value.question5LatrineNoOfBlocks ? 1 : 0;
        stmt.bindLong(60, _tmp_9);
        final int _tmp_10;
        _tmp_10 = value.question5LatrineNoOfStances ? 1 : 0;
        stmt.bindLong(61, _tmp_10);
        final int _tmp_11;
        _tmp_11 = value.question5LatrinePupilMaleStances ? 1 : 0;
        stmt.bindLong(62, _tmp_11);
        final int _tmp_12;
        _tmp_12 = value.question5LatrinePupilFemaleStances ? 1 : 0;
        stmt.bindLong(63, _tmp_12);
        final int _tmp_13;
        _tmp_13 = value.question5LatrineTeacherMaleStance ? 1 : 0;
        stmt.bindLong(64, _tmp_13);
        final int _tmp_14;
        _tmp_14 = value.question5LatrineTeacherMFemaleStance ? 1 : 0;
        stmt.bindLong(65, _tmp_14);
        final int _tmp_15;
        _tmp_15 = value.question5LatrineTeacherMixedStance ? 1 : 0;
        stmt.bindLong(66, _tmp_15);
        final int _tmp_16;
        _tmp_16 = value.question5LatrineFuncFunctional ? 1 : 0;
        stmt.bindLong(67, _tmp_16);
        final int _tmp_17;
        _tmp_17 = value.question5LatrineFuncNone ? 1 : 0;
        stmt.bindLong(68, _tmp_17);
        final int _tmp_18;
        _tmp_18 = value.question5VIPNoOfBlocks ? 1 : 0;
        stmt.bindLong(69, _tmp_18);
        final int _tmp_19;
        _tmp_19 = value.question5VIPNoOfStances ? 1 : 0;
        stmt.bindLong(70, _tmp_19);
        final int _tmp_20;
        _tmp_20 = value.question5VIPPupilMaleStances ? 1 : 0;
        stmt.bindLong(71, _tmp_20);
        final int _tmp_21;
        _tmp_21 = value.question5VIPePupilFemaleStances ? 1 : 0;
        stmt.bindLong(72, _tmp_21);
        final int _tmp_22;
        _tmp_22 = value.question5VIPTeacherMaleStance ? 1 : 0;
        stmt.bindLong(73, _tmp_22);
        final int _tmp_23;
        _tmp_23 = value.question5VIPTeacherMFemaleStance ? 1 : 0;
        stmt.bindLong(74, _tmp_23);
        final int _tmp_24;
        _tmp_24 = value.question5VIPTeacherMixedStance ? 1 : 0;
        stmt.bindLong(75, _tmp_24);
        final int _tmp_25;
        _tmp_25 = value.question5VIPFuncFunctional ? 1 : 0;
        stmt.bindLong(76, _tmp_25);
        final int _tmp_26;
        _tmp_26 = value.question5VIPFuncNone ? 1 : 0;
        stmt.bindLong(77, _tmp_26);
        final int _tmp_27;
        _tmp_27 = value.question5FCROOMNoOfBlocks ? 1 : 0;
        stmt.bindLong(78, _tmp_27);
        final int _tmp_28;
        _tmp_28 = value.question5FCROOMNoOfStances ? 1 : 0;
        stmt.bindLong(79, _tmp_28);
        final int _tmp_29;
        _tmp_29 = value.question5FCROOMPupilMaleStances ? 1 : 0;
        stmt.bindLong(80, _tmp_29);
        final int _tmp_30;
        _tmp_30 = value.question5FCROOMPupilFemaleStances ? 1 : 0;
        stmt.bindLong(81, _tmp_30);
        final int _tmp_31;
        _tmp_31 = value.question5FCROOMTeacherMaleStance ? 1 : 0;
        stmt.bindLong(82, _tmp_31);
        final int _tmp_32;
        _tmp_32 = value.question5FCROOMTeacherMFemaleStance ? 1 : 0;
        stmt.bindLong(83, _tmp_32);
        final int _tmp_33;
        _tmp_33 = value.question5FCROOMTeacherMixedStance ? 1 : 0;
        stmt.bindLong(84, _tmp_33);
        final int _tmp_34;
        _tmp_34 = value.question5FCROOMFuncFunctional ? 1 : 0;
        stmt.bindLong(85, _tmp_34);
        final int _tmp_35;
        _tmp_35 = value.question5FCROOMFuncNone ? 1 : 0;
        stmt.bindLong(86, _tmp_35);
        final int _tmp_36;
        _tmp_36 = value.question5UFBNoOfBlocks ? 1 : 0;
        stmt.bindLong(87, _tmp_36);
        final int _tmp_37;
        _tmp_37 = value.question5UFBNoOfStances ? 1 : 0;
        stmt.bindLong(88, _tmp_37);
        final int _tmp_38;
        _tmp_38 = value.question5UFBPupilMaleStances ? 1 : 0;
        stmt.bindLong(89, _tmp_38);
        final int _tmp_39;
        _tmp_39 = value.question5UFBPupilFemaleStances ? 1 : 0;
        stmt.bindLong(90, _tmp_39);
        final int _tmp_40;
        _tmp_40 = value.question5UFBTeacherMaleStance ? 1 : 0;
        stmt.bindLong(91, _tmp_40);
        final int _tmp_41;
        _tmp_41 = value.question5UFBTeacherMFemaleStance ? 1 : 0;
        stmt.bindLong(92, _tmp_41);
        final int _tmp_42;
        _tmp_42 = value.question5UFBTeacherMixedStance ? 1 : 0;
        stmt.bindLong(93, _tmp_42);
        final int _tmp_43;
        _tmp_43 = value.question5UFBFuncFunctional ? 1 : 0;
        stmt.bindLong(94, _tmp_43);
        final int _tmp_44;
        _tmp_44 = value.question5UFBFuncNone ? 1 : 0;
        stmt.bindLong(95, _tmp_44);
        final int _tmp_45;
        _tmp_45 = value.question51Latrine ? 1 : 0;
        stmt.bindLong(96, _tmp_45);
        if (value.question52Ramps == null) {
          stmt.bindNull(97);
        } else {
          stmt.bindString(97, value.question52Ramps);
        }
        if (value.question52PWD == null) {
          stmt.bindNull(98);
        } else {
          stmt.bindString(98, value.question52PWD);
        }
        if (value.question52None == null) {
          stmt.bindNull(99);
        } else {
          stmt.bindString(99, value.question52None);
        }
        if (value.question52OtherSpec == null) {
          stmt.bindNull(100);
        } else {
          stmt.bindString(100, value.question52OtherSpec);
        }
        final int _tmp_46;
        _tmp_46 = value.question53YesNo ? 1 : 0;
        stmt.bindLong(101, _tmp_46);
        if (value.question53Reason == null) {
          stmt.bindNull(102);
        } else {
          stmt.bindString(102, value.question53Reason);
        }
        if (value.question61Number == null) {
          stmt.bindNull(103);
        } else {
          stmt.bindString(103, value.question61Number);
        }
        if (value.question62Number == null) {
          stmt.bindNull(104);
        } else {
          stmt.bindString(104, value.question62Number);
        }
        if (value.question63Number == null) {
          stmt.bindNull(105);
        } else {
          stmt.bindString(105, value.question63Number);
        }
        if (value.question7EnrolledMaleTeachers == null) {
          stmt.bindNull(106);
        } else {
          stmt.bindString(106, value.question7EnrolledMaleTeachers);
        }
        if (value.question7EnrolledFeMaleTeachers == null) {
          stmt.bindNull(107);
        } else {
          stmt.bindString(107, value.question7EnrolledFeMaleTeachers);
        }
        if (value.question7EnrolledMaleTeachersPresentAtVisit == null) {
          stmt.bindNull(108);
        } else {
          stmt.bindString(108, value.question7EnrolledMaleTeachersPresentAtVisit);
        }
        if (value.question7EnrolledFeMaleTeachersPresentAtTimeOfVisit == null) {
          stmt.bindNull(109);
        } else {
          stmt.bindString(109, value.question7EnrolledFeMaleTeachersPresentAtTimeOfVisit);
        }
        if (value.question7TotalNumOfTeachers == null) {
          stmt.bindNull(110);
        } else {
          stmt.bindString(110, value.question7TotalNumOfTeachers);
        }
        if (value.question71PupilRatio == null) {
          stmt.bindNull(111);
        } else {
          stmt.bindString(111, value.question71PupilRatio);
        }
        final int _tmp_47;
        _tmp_47 = value.question72WomanTeacher ? 1 : 0;
        stmt.bindLong(112, _tmp_47);
        if (value.question73Question == null) {
          stmt.bindNull(113);
        } else {
          stmt.bindString(113, value.question73Question);
        }
        if (value.question81Inspector == null) {
          stmt.bindNull(114);
        } else {
          stmt.bindString(114, value.question81Inspector);
        }
        if (value.question82InspectorVisit == null) {
          stmt.bindNull(115);
        } else {
          stmt.bindString(115, value.question82InspectorVisit);
        }
        final int _tmp_48;
        _tmp_48 = value.question83Committee ? 1 : 0;
        stmt.bindLong(116, _tmp_48);
        if (value.question83Meet == null) {
          stmt.bindNull(117);
        } else {
          stmt.bindString(117, value.question83Meet);
        }
        if (value.question84SchoolMGT == null) {
          stmt.bindNull(118);
        } else {
          stmt.bindString(118, value.question84SchoolMGT);
        }
        if (value.question8OtherObservations == null) {
          stmt.bindNull(119);
        } else {
          stmt.bindString(119, value.question8OtherObservations);
        }
        final int _tmp_49;
        _tmp_49 = value.locallyStored ? 1 : 0;
        stmt.bindLong(120, _tmp_49);
      }
    };
  }

  @Override
  public void saveEducationQuestion(final EducationQuestion educationQuestion) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEducationQuestion.insert(educationQuestion);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<EducationQuestion>> getAllEducationQuestions() {
    final String _sql = "SELECT * FROM educ_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"educ_table"}, false, new Callable<List<EducationQuestion>>() {
      @Override
      public List<EducationQuestion> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "pri");
          final int _cursorIndexOfFinancialYear = CursorUtil.getColumnIndexOrThrow(_cursor, "educ_financial");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfParish = CursorUtil.getColumnIndexOrThrow(_cursor, "parish");
          final int _cursorIndexOfSubCounty = CursorUtil.getColumnIndexOrThrow(_cursor, "sub_county");
          final int _cursorIndexOfFullname = CursorUtil.getColumnIndexOrThrow(_cursor, "full_name");
          final int _cursorIndexOfTel = CursorUtil.getColumnIndexOrThrow(_cursor, "telephone");
          final int _cursorIndexOfQuestion1SchoolName = CursorUtil.getColumnIndexOrThrow(_cursor, "q1");
          final int _cursorIndexOfQuestion2TeacherMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_t_m");
          final int _cursorIndexOfQuestion2TeacherFemale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_t_f");
          final int _cursorIndexOfQuestion2TeacherMalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_t_m_pwd");
          final int _cursorIndexOfQuestion2TeacherFemalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_t_f_pwd");
          final int _cursorIndexOfQuestion2TeacherTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_t_t");
          final int _cursorIndexOfQuestion2PupilMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p_m");
          final int _cursorIndexOfQuestion2PupilFemale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p_f");
          final int _cursorIndexOfQuestion2PupilMalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p_m_pwds");
          final int _cursorIndexOfQuestion2PupilFemalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p_f_pwds");
          final int _cursorIndexOfQuestion2PupilTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p_t");
          final int _cursorIndexOfQuestion2P7Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p7_m");
          final int _cursorIndexOfQuestion2P7Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p7_f");
          final int _cursorIndexOfQuestion2P7MalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p7_m_pwds");
          final int _cursorIndexOfQuestion2P7FemalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p7_f_pwds");
          final int _cursorIndexOfQuestion2P7Total = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_p_7_total");
          final int _cursorIndexOfQuestion2DropMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_drop_male");
          final int _cursorIndexOfQuestion2DropFemale = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_drop_female");
          final int _cursorIndexOfQuestion2DropMalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_drop_m_pwds");
          final int _cursorIndexOfQuestion2DropFemalePWDS = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_d_f_pwds");
          final int _cursorIndexOfQuestion2DropTotal = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_d_t");
          final int _cursorIndexOfQuestion21Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q2_1_reason");
          final int _cursorIndexOfQuestion3GrantApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_a_b");
          final int _cursorIndexOfQuestion3GrantBudgetReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_b_r");
          final int _cursorIndexOfQuestion3GrantDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_g_d_r");
          final int _cursorIndexOfQuestion3GrantDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_g_d_w");
          final int _cursorIndexOfQuestion3SFGApprovedBudget = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_sfg_a_b");
          final int _cursorIndexOfQuestion3SFGBudgetReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_sfg_b_r");
          final int _cursorIndexOfQuestion3SFGDateReceived = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_sfg_d_r");
          final int _cursorIndexOfQuestion3SFGDateWithdrawn = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_fg_d_w");
          final int _cursorIndexOfQuestion31Display = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_1_sd");
          final int _cursorIndexOfQuestion32Period = CursorUtil.getColumnIndexOrThrow(_cursor, "q3_2_period");
          final int _cursorIndexOfQuestion4Grade1Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_g1_m");
          final int _cursorIndexOfQuestion4Grade1Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_g1_f");
          final int _cursorIndexOfQuestion4Grade2Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_g2_m");
          final int _cursorIndexOfQuestion4Grade2Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_g2_f");
          final int _cursorIndexOfQuestion4Grade3Male = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_g3_m");
          final int _cursorIndexOfQuestion4Grade3Female = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_g3_f");
          final int _cursorIndexOfQuestion4GradeOtherMale = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_other_m");
          final int _cursorIndexOfQuestion4GradeOtherFemale = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_other_f");
          final int _cursorIndexOfQuestion41Performance = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_1_performance");
          final int _cursorIndexOfQuestion42Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q4_2_reason");
          final int _cursorIndexOfQuestion5ToiletNoOfBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_nb");
          final int _cursorIndexOfQuestion5ToiletNoOfStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_ts");
          final int _cursorIndexOfQuestion5ToiletPupilMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_m_s");
          final int _cursorIndexOfQuestion5ToiletPupilFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_f_s");
          final int _cursorIndexOfQuestion5ToiletTeacherMaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_t_m_s");
          final int _cursorIndexOfQuestion5ToiletTeacherMFemaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_t_f_s");
          final int _cursorIndexOfQuestion5ToiletTeacherMixedStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_t_mx_S");
          final int _cursorIndexOfQuestion5ToiletFuncFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_f_f");
          final int _cursorIndexOfQuestion5ToiletFuncNone = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_none");
          final int _cursorIndexOfQuestion5LatrineNoOfBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_n_b");
          final int _cursorIndexOfQuestion5LatrineNoOfStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_n_s");
          final int _cursorIndexOfQuestion5LatrinePupilMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_m_s");
          final int _cursorIndexOfQuestion5LatrinePupilFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_p_m_s");
          final int _cursorIndexOfQuestion5LatrineTeacherMaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_p_f_s");
          final int _cursorIndexOfQuestion5LatrineTeacherMFemaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_t_f_m_s");
          final int _cursorIndexOfQuestion5LatrineTeacherMixedStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_t_m_m_s");
          final int _cursorIndexOfQuestion5LatrineFuncFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_fun_func_ext");
          final int _cursorIndexOfQuestion5LatrineFuncNone = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_l_b_fun_func");
          final int _cursorIndexOfQuestion5VIPNoOfBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_n_blocks");
          final int _cursorIndexOfQuestion5VIPNoOfStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_n_stances");
          final int _cursorIndexOfQuestion5VIPPupilMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_m_stances");
          final int _cursorIndexOfQuestion5VIPePupilFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_f_stances");
          final int _cursorIndexOfQuestion5VIPTeacherMaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_t_f_stances_23");
          final int _cursorIndexOfQuestion5VIPTeacherMFemaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_t_f_stances_3");
          final int _cursorIndexOfQuestion5VIPTeacherMixedStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_t_mixed_stances");
          final int _cursorIndexOfQuestion5VIPFuncFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_func_functional");
          final int _cursorIndexOfQuestion5VIPFuncNone = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_VIP_func_none");
          final int _cursorIndexOfQuestion5FCROOMNoOfBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_blocks");
          final int _cursorIndexOfQuestion5FCROOMNoOfStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_stances");
          final int _cursorIndexOfQuestion5FCROOMPupilMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_male_stances");
          final int _cursorIndexOfQuestion5FCROOMPupilFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_female_stances");
          final int _cursorIndexOfQuestion5FCROOMTeacherMaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_t_male_stances");
          final int _cursorIndexOfQuestion5FCROOMTeacherMFemaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_t_f_stances");
          final int _cursorIndexOfQuestion5FCROOMTeacherMixedStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_n_t_mixed_stances");
          final int _cursorIndexOfQuestion5FCROOMFuncFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_func_functional");
          final int _cursorIndexOfQuestion5FCROOMFuncNone = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_FCROOM_func_none");
          final int _cursorIndexOfQuestion5UFBNoOfBlocks = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_n_blocks");
          final int _cursorIndexOfQuestion5UFBNoOfStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_n_stances");
          final int _cursorIndexOfQuestion5UFBPupilMaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_m_stances");
          final int _cursorIndexOfQuestion5UFBPupilFemaleStances = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_f_stances");
          final int _cursorIndexOfQuestion5UFBTeacherMaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_t_m_stances");
          final int _cursorIndexOfQuestion5UFBTeacherMFemaleStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_t_f_stances");
          final int _cursorIndexOfQuestion5UFBTeacherMixedStance = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_t_mixed_stances");
          final int _cursorIndexOfQuestion5UFBFuncFunctional = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_func_functional");
          final int _cursorIndexOfQuestion5UFBFuncNone = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_UFB_func_none");
          final int _cursorIndexOfQuestion51Latrine = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_1_l");
          final int _cursorIndexOfQuestion52Ramps = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_2_ramps");
          final int _cursorIndexOfQuestion52PWD = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_2_pwd");
          final int _cursorIndexOfQuestion52None = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_2_none");
          final int _cursorIndexOfQuestion52OtherSpec = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_2_others_Spec");
          final int _cursorIndexOfQuestion53YesNo = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_3_yes_no");
          final int _cursorIndexOfQuestion53Reason = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_3_reason");
          final int _cursorIndexOfQuestion61Number = CursorUtil.getColumnIndexOrThrow(_cursor, "q6_1_num");
          final int _cursorIndexOfQuestion62Number = CursorUtil.getColumnIndexOrThrow(_cursor, "q6_2_num");
          final int _cursorIndexOfQuestion63Number = CursorUtil.getColumnIndexOrThrow(_cursor, "q6_3_ratio");
          final int _cursorIndexOfQuestion7EnrolledMaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_e_m_t");
          final int _cursorIndexOfQuestion7EnrolledFeMaleTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_e_f_t");
          final int _cursorIndexOfQuestion7EnrolledMaleTeachersPresentAtVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_e_t_P_a_T_visit");
          final int _cursorIndexOfQuestion7EnrolledFeMaleTeachersPresentAtTimeOfVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "q5_t_p_a_Time");
          final int _cursorIndexOfQuestion7TotalNumOfTeachers = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_total_number_of1_teachers");
          final int _cursorIndexOfQuestion71PupilRatio = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_1_p_r");
          final int _cursorIndexOfQuestion72WomanTeacher = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_2_w_teacher");
          final int _cursorIndexOfQuestion73Question = CursorUtil.getColumnIndexOrThrow(_cursor, "q7_3_q");
          final int _cursorIndexOfQuestion81Inspector = CursorUtil.getColumnIndexOrThrow(_cursor, "q8_1_inspector");
          final int _cursorIndexOfQuestion82InspectorVisit = CursorUtil.getColumnIndexOrThrow(_cursor, "q8_2_inspector_visits");
          final int _cursorIndexOfQuestion83Committee = CursorUtil.getColumnIndexOrThrow(_cursor, "q8_3_com");
          final int _cursorIndexOfQuestion83Meet = CursorUtil.getColumnIndexOrThrow(_cursor, "q8_4_meet");
          final int _cursorIndexOfQuestion84SchoolMGT = CursorUtil.getColumnIndexOrThrow(_cursor, "q8_5_sch_mgt");
          final int _cursorIndexOfQuestion8OtherObservations = CursorUtil.getColumnIndexOrThrow(_cursor, "q8_other_observations");
          final int _cursorIndexOfLocallyStored = CursorUtil.getColumnIndexOrThrow(_cursor, "stored_locally");
          final List<EducationQuestion> _result = new ArrayList<EducationQuestion>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EducationQuestion _item;
            _item = new EducationQuestion();
            _item.id = _cursor.getInt(_cursorIndexOfId);
            _item.financialYear = _cursor.getString(_cursorIndexOfFinancialYear);
            _item.date = _cursor.getString(_cursorIndexOfDate);
            _item.district = _cursor.getString(_cursorIndexOfDistrict);
            _item.parish = _cursor.getString(_cursorIndexOfParish);
            _item.sub_county = _cursor.getString(_cursorIndexOfSubCounty);
            _item.fullname = _cursor.getString(_cursorIndexOfFullname);
            _item.tel = _cursor.getString(_cursorIndexOfTel);
            _item.question1SchoolName = _cursor.getString(_cursorIndexOfQuestion1SchoolName);
            _item.question2TeacherMale = _cursor.getString(_cursorIndexOfQuestion2TeacherMale);
            _item.question2TeacherFemale = _cursor.getString(_cursorIndexOfQuestion2TeacherFemale);
            _item.question2TeacherMalePWDS = _cursor.getString(_cursorIndexOfQuestion2TeacherMalePWDS);
            _item.question2TeacherFemalePWDS = _cursor.getString(_cursorIndexOfQuestion2TeacherFemalePWDS);
            _item.question2TeacherTotal = _cursor.getString(_cursorIndexOfQuestion2TeacherTotal);
            _item.question2PupilMale = _cursor.getString(_cursorIndexOfQuestion2PupilMale);
            _item.question2PupilFemale = _cursor.getString(_cursorIndexOfQuestion2PupilFemale);
            _item.question2PupilMalePWDS = _cursor.getString(_cursorIndexOfQuestion2PupilMalePWDS);
            _item.question2PupilFemalePWDS = _cursor.getString(_cursorIndexOfQuestion2PupilFemalePWDS);
            _item.question2PupilTotal = _cursor.getString(_cursorIndexOfQuestion2PupilTotal);
            _item.question2P7Male = _cursor.getString(_cursorIndexOfQuestion2P7Male);
            _item.question2P7Female = _cursor.getString(_cursorIndexOfQuestion2P7Female);
            _item.question2P7MalePWDS = _cursor.getString(_cursorIndexOfQuestion2P7MalePWDS);
            _item.question2P7FemalePWDS = _cursor.getString(_cursorIndexOfQuestion2P7FemalePWDS);
            _item.question2P7Total = _cursor.getString(_cursorIndexOfQuestion2P7Total);
            _item.question2DropMale = _cursor.getString(_cursorIndexOfQuestion2DropMale);
            _item.question2DropFemale = _cursor.getString(_cursorIndexOfQuestion2DropFemale);
            _item.question2DropMalePWDS = _cursor.getString(_cursorIndexOfQuestion2DropMalePWDS);
            _item.question2DropFemalePWDS = _cursor.getString(_cursorIndexOfQuestion2DropFemalePWDS);
            _item.question2DropTotal = _cursor.getString(_cursorIndexOfQuestion2DropTotal);
            _item.question21Reason = _cursor.getString(_cursorIndexOfQuestion21Reason);
            _item.question3GrantApprovedBudget = _cursor.getString(_cursorIndexOfQuestion3GrantApprovedBudget);
            _item.question3GrantBudgetReleased = _cursor.getString(_cursorIndexOfQuestion3GrantBudgetReleased);
            _item.question3GrantDateReceived = _cursor.getString(_cursorIndexOfQuestion3GrantDateReceived);
            _item.question3GrantDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion3GrantDateWithdrawn);
            _item.question3SFGApprovedBudget = _cursor.getString(_cursorIndexOfQuestion3SFGApprovedBudget);
            _item.question3SFGBudgetReleased = _cursor.getString(_cursorIndexOfQuestion3SFGBudgetReleased);
            _item.question3SFGDateReceived = _cursor.getString(_cursorIndexOfQuestion3SFGDateReceived);
            _item.question3SFGDateWithdrawn = _cursor.getString(_cursorIndexOfQuestion3SFGDateWithdrawn);
            _item.question31Display = _cursor.getString(_cursorIndexOfQuestion31Display);
            _item.question32Period = _cursor.getString(_cursorIndexOfQuestion32Period);
            _item.question4Grade1Male = _cursor.getString(_cursorIndexOfQuestion4Grade1Male);
            _item.question4Grade1Female = _cursor.getString(_cursorIndexOfQuestion4Grade1Female);
            _item.question4Grade2Male = _cursor.getString(_cursorIndexOfQuestion4Grade2Male);
            _item.question4Grade2Female = _cursor.getString(_cursorIndexOfQuestion4Grade2Female);
            _item.question4Grade3Male = _cursor.getString(_cursorIndexOfQuestion4Grade3Male);
            _item.question4Grade3Female = _cursor.getString(_cursorIndexOfQuestion4Grade3Female);
            _item.question4GradeOtherMale = _cursor.getString(_cursorIndexOfQuestion4GradeOtherMale);
            _item.question4GradeOtherFemale = _cursor.getString(_cursorIndexOfQuestion4GradeOtherFemale);
            _item.question41Performance = _cursor.getString(_cursorIndexOfQuestion41Performance);
            _item.question42Reason = _cursor.getString(_cursorIndexOfQuestion42Reason);
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfQuestion5ToiletNoOfBlocks);
            _item.question5ToiletNoOfBlocks = _tmp != 0;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfQuestion5ToiletNoOfStances);
            _item.question5ToiletNoOfStances = _tmp_1 != 0;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfQuestion5ToiletPupilMaleStances);
            _item.question5ToiletPupilMaleStances = _tmp_2 != 0;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfQuestion5ToiletPupilFemaleStances);
            _item.question5ToiletPupilFemaleStances = _tmp_3 != 0;
            final int _tmp_4;
            _tmp_4 = _cursor.getInt(_cursorIndexOfQuestion5ToiletTeacherMaleStance);
            _item.question5ToiletTeacherMaleStance = _tmp_4 != 0;
            final int _tmp_5;
            _tmp_5 = _cursor.getInt(_cursorIndexOfQuestion5ToiletTeacherMFemaleStance);
            _item.question5ToiletTeacherMFemaleStance = _tmp_5 != 0;
            final int _tmp_6;
            _tmp_6 = _cursor.getInt(_cursorIndexOfQuestion5ToiletTeacherMixedStance);
            _item.question5ToiletTeacherMixedStance = _tmp_6 != 0;
            final int _tmp_7;
            _tmp_7 = _cursor.getInt(_cursorIndexOfQuestion5ToiletFuncFunctional);
            _item.question5ToiletFuncFunctional = _tmp_7 != 0;
            final int _tmp_8;
            _tmp_8 = _cursor.getInt(_cursorIndexOfQuestion5ToiletFuncNone);
            _item.question5ToiletFuncNone = _tmp_8 != 0;
            final int _tmp_9;
            _tmp_9 = _cursor.getInt(_cursorIndexOfQuestion5LatrineNoOfBlocks);
            _item.question5LatrineNoOfBlocks = _tmp_9 != 0;
            final int _tmp_10;
            _tmp_10 = _cursor.getInt(_cursorIndexOfQuestion5LatrineNoOfStances);
            _item.question5LatrineNoOfStances = _tmp_10 != 0;
            final int _tmp_11;
            _tmp_11 = _cursor.getInt(_cursorIndexOfQuestion5LatrinePupilMaleStances);
            _item.question5LatrinePupilMaleStances = _tmp_11 != 0;
            final int _tmp_12;
            _tmp_12 = _cursor.getInt(_cursorIndexOfQuestion5LatrinePupilFemaleStances);
            _item.question5LatrinePupilFemaleStances = _tmp_12 != 0;
            final int _tmp_13;
            _tmp_13 = _cursor.getInt(_cursorIndexOfQuestion5LatrineTeacherMaleStance);
            _item.question5LatrineTeacherMaleStance = _tmp_13 != 0;
            final int _tmp_14;
            _tmp_14 = _cursor.getInt(_cursorIndexOfQuestion5LatrineTeacherMFemaleStance);
            _item.question5LatrineTeacherMFemaleStance = _tmp_14 != 0;
            final int _tmp_15;
            _tmp_15 = _cursor.getInt(_cursorIndexOfQuestion5LatrineTeacherMixedStance);
            _item.question5LatrineTeacherMixedStance = _tmp_15 != 0;
            final int _tmp_16;
            _tmp_16 = _cursor.getInt(_cursorIndexOfQuestion5LatrineFuncFunctional);
            _item.question5LatrineFuncFunctional = _tmp_16 != 0;
            final int _tmp_17;
            _tmp_17 = _cursor.getInt(_cursorIndexOfQuestion5LatrineFuncNone);
            _item.question5LatrineFuncNone = _tmp_17 != 0;
            final int _tmp_18;
            _tmp_18 = _cursor.getInt(_cursorIndexOfQuestion5VIPNoOfBlocks);
            _item.question5VIPNoOfBlocks = _tmp_18 != 0;
            final int _tmp_19;
            _tmp_19 = _cursor.getInt(_cursorIndexOfQuestion5VIPNoOfStances);
            _item.question5VIPNoOfStances = _tmp_19 != 0;
            final int _tmp_20;
            _tmp_20 = _cursor.getInt(_cursorIndexOfQuestion5VIPPupilMaleStances);
            _item.question5VIPPupilMaleStances = _tmp_20 != 0;
            final int _tmp_21;
            _tmp_21 = _cursor.getInt(_cursorIndexOfQuestion5VIPePupilFemaleStances);
            _item.question5VIPePupilFemaleStances = _tmp_21 != 0;
            final int _tmp_22;
            _tmp_22 = _cursor.getInt(_cursorIndexOfQuestion5VIPTeacherMaleStance);
            _item.question5VIPTeacherMaleStance = _tmp_22 != 0;
            final int _tmp_23;
            _tmp_23 = _cursor.getInt(_cursorIndexOfQuestion5VIPTeacherMFemaleStance);
            _item.question5VIPTeacherMFemaleStance = _tmp_23 != 0;
            final int _tmp_24;
            _tmp_24 = _cursor.getInt(_cursorIndexOfQuestion5VIPTeacherMixedStance);
            _item.question5VIPTeacherMixedStance = _tmp_24 != 0;
            final int _tmp_25;
            _tmp_25 = _cursor.getInt(_cursorIndexOfQuestion5VIPFuncFunctional);
            _item.question5VIPFuncFunctional = _tmp_25 != 0;
            final int _tmp_26;
            _tmp_26 = _cursor.getInt(_cursorIndexOfQuestion5VIPFuncNone);
            _item.question5VIPFuncNone = _tmp_26 != 0;
            final int _tmp_27;
            _tmp_27 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMNoOfBlocks);
            _item.question5FCROOMNoOfBlocks = _tmp_27 != 0;
            final int _tmp_28;
            _tmp_28 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMNoOfStances);
            _item.question5FCROOMNoOfStances = _tmp_28 != 0;
            final int _tmp_29;
            _tmp_29 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMPupilMaleStances);
            _item.question5FCROOMPupilMaleStances = _tmp_29 != 0;
            final int _tmp_30;
            _tmp_30 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMPupilFemaleStances);
            _item.question5FCROOMPupilFemaleStances = _tmp_30 != 0;
            final int _tmp_31;
            _tmp_31 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMTeacherMaleStance);
            _item.question5FCROOMTeacherMaleStance = _tmp_31 != 0;
            final int _tmp_32;
            _tmp_32 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMTeacherMFemaleStance);
            _item.question5FCROOMTeacherMFemaleStance = _tmp_32 != 0;
            final int _tmp_33;
            _tmp_33 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMTeacherMixedStance);
            _item.question5FCROOMTeacherMixedStance = _tmp_33 != 0;
            final int _tmp_34;
            _tmp_34 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMFuncFunctional);
            _item.question5FCROOMFuncFunctional = _tmp_34 != 0;
            final int _tmp_35;
            _tmp_35 = _cursor.getInt(_cursorIndexOfQuestion5FCROOMFuncNone);
            _item.question5FCROOMFuncNone = _tmp_35 != 0;
            final int _tmp_36;
            _tmp_36 = _cursor.getInt(_cursorIndexOfQuestion5UFBNoOfBlocks);
            _item.question5UFBNoOfBlocks = _tmp_36 != 0;
            final int _tmp_37;
            _tmp_37 = _cursor.getInt(_cursorIndexOfQuestion5UFBNoOfStances);
            _item.question5UFBNoOfStances = _tmp_37 != 0;
            final int _tmp_38;
            _tmp_38 = _cursor.getInt(_cursorIndexOfQuestion5UFBPupilMaleStances);
            _item.question5UFBPupilMaleStances = _tmp_38 != 0;
            final int _tmp_39;
            _tmp_39 = _cursor.getInt(_cursorIndexOfQuestion5UFBPupilFemaleStances);
            _item.question5UFBPupilFemaleStances = _tmp_39 != 0;
            final int _tmp_40;
            _tmp_40 = _cursor.getInt(_cursorIndexOfQuestion5UFBTeacherMaleStance);
            _item.question5UFBTeacherMaleStance = _tmp_40 != 0;
            final int _tmp_41;
            _tmp_41 = _cursor.getInt(_cursorIndexOfQuestion5UFBTeacherMFemaleStance);
            _item.question5UFBTeacherMFemaleStance = _tmp_41 != 0;
            final int _tmp_42;
            _tmp_42 = _cursor.getInt(_cursorIndexOfQuestion5UFBTeacherMixedStance);
            _item.question5UFBTeacherMixedStance = _tmp_42 != 0;
            final int _tmp_43;
            _tmp_43 = _cursor.getInt(_cursorIndexOfQuestion5UFBFuncFunctional);
            _item.question5UFBFuncFunctional = _tmp_43 != 0;
            final int _tmp_44;
            _tmp_44 = _cursor.getInt(_cursorIndexOfQuestion5UFBFuncNone);
            _item.question5UFBFuncNone = _tmp_44 != 0;
            final int _tmp_45;
            _tmp_45 = _cursor.getInt(_cursorIndexOfQuestion51Latrine);
            _item.question51Latrine = _tmp_45 != 0;
            _item.question52Ramps = _cursor.getString(_cursorIndexOfQuestion52Ramps);
            _item.question52PWD = _cursor.getString(_cursorIndexOfQuestion52PWD);
            _item.question52None = _cursor.getString(_cursorIndexOfQuestion52None);
            _item.question52OtherSpec = _cursor.getString(_cursorIndexOfQuestion52OtherSpec);
            final int _tmp_46;
            _tmp_46 = _cursor.getInt(_cursorIndexOfQuestion53YesNo);
            _item.question53YesNo = _tmp_46 != 0;
            _item.question53Reason = _cursor.getString(_cursorIndexOfQuestion53Reason);
            _item.question61Number = _cursor.getString(_cursorIndexOfQuestion61Number);
            _item.question62Number = _cursor.getString(_cursorIndexOfQuestion62Number);
            _item.question63Number = _cursor.getString(_cursorIndexOfQuestion63Number);
            _item.question7EnrolledMaleTeachers = _cursor.getString(_cursorIndexOfQuestion7EnrolledMaleTeachers);
            _item.question7EnrolledFeMaleTeachers = _cursor.getString(_cursorIndexOfQuestion7EnrolledFeMaleTeachers);
            _item.question7EnrolledMaleTeachersPresentAtVisit = _cursor.getString(_cursorIndexOfQuestion7EnrolledMaleTeachersPresentAtVisit);
            _item.question7EnrolledFeMaleTeachersPresentAtTimeOfVisit = _cursor.getString(_cursorIndexOfQuestion7EnrolledFeMaleTeachersPresentAtTimeOfVisit);
            _item.question7TotalNumOfTeachers = _cursor.getString(_cursorIndexOfQuestion7TotalNumOfTeachers);
            _item.question71PupilRatio = _cursor.getString(_cursorIndexOfQuestion71PupilRatio);
            final int _tmp_47;
            _tmp_47 = _cursor.getInt(_cursorIndexOfQuestion72WomanTeacher);
            _item.question72WomanTeacher = _tmp_47 != 0;
            _item.question73Question = _cursor.getString(_cursorIndexOfQuestion73Question);
            _item.question81Inspector = _cursor.getString(_cursorIndexOfQuestion81Inspector);
            _item.question82InspectorVisit = _cursor.getString(_cursorIndexOfQuestion82InspectorVisit);
            final int _tmp_48;
            _tmp_48 = _cursor.getInt(_cursorIndexOfQuestion83Committee);
            _item.question83Committee = _tmp_48 != 0;
            _item.question83Meet = _cursor.getString(_cursorIndexOfQuestion83Meet);
            _item.question84SchoolMGT = _cursor.getString(_cursorIndexOfQuestion84SchoolMGT);
            _item.question8OtherObservations = _cursor.getString(_cursorIndexOfQuestion8OtherObservations);
            final int _tmp_49;
            _tmp_49 = _cursor.getInt(_cursorIndexOfLocallyStored);
            _item.locallyStored = _tmp_49 != 0;
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
