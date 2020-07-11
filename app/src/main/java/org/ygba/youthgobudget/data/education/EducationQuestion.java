package org.ygba.youthgobudget.data.education;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = EducationQuestionConstants.TABLE_NAME)
public class EducationQuestion {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = EducationQuestionConstants.PRIMARY_KEY)
    private  int id;

    @ColumnInfo(name = EducationQuestionConstants.FINANCIAL_YEAR)
    private String financialYear;

    @ColumnInfo(name = EducationQuestionConstants.DATE)
    private String date;

    @ColumnInfo(name = EducationQuestionConstants.DISTRICT)
    private String district;

    @ColumnInfo(name = EducationQuestionConstants.PARISH)
    private String parish;

    @ColumnInfo(name = EducationQuestionConstants.SUB_COUNTY)
    private String sub_county;

    @ColumnInfo(name = EducationQuestionConstants.AGENT_FULL_NAME)
    private String fullname;

    @ColumnInfo(name = EducationQuestionConstants.AGENT_TELL)
    private String tel;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_1_UPE_SCHOOL)
    private String question1;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_MALE)
    private String question2TeacherMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_FEMALE)
    private String question2TeacherFemale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_MALE_PWDS)
    private String question2TeacherMalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_FEMALE_PWDS)
    private String question2TeacherFemalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_TOTAL)
    private String question2TeacherTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PUPIL_MALE)
    private String question2PupilMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PUPIL_FEMALE)
    private String question2PupilFemale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PUPIL_MALE_PWDS)
    private String question2PupilMalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PUPIL_FEMALE_PWDS)
    private String question2PupilFemalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PUPIL_TOTAL)
    private String question2PupilTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_P7_MALE)
    private String question2P7Male;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_P7_FEMALE)
    private String question2P7Female;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_P7_MALE_PWDS)
    private String question2P7MalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_P7_FEMALE_PWDS)
    private String question2P7FemalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_PUPIL_TOTAL)
    private String question2P7Total;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROP_MALE)
    private String question2DropMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROP_FEMALE)
    private String question2DropFemale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROP_MALE_PWDS)
    private String question2DropMalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROP_FEMALE_PWDS)
    private String question2DropFemalePWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_DROP_TOTAL)
    private String question2DropTotal;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_1_REASON)
    private String question21Reason;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_GRANT_APPROVED_BUDGET)
    private String question3GrantApprovedBudget;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_GRANT_BUDGET_RELEASED)
    private String question3GrantBudgetReleased;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_GRANT_DATE_RECEIVED)
    private String question3GrantDateReceived;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_GRANT_DATE_WITHDRAWN)
    private String question3GrantDateWithdrawn;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_APPROVED_BUDGET)
    private String question3SFGApprovedBudget;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_BUDGET_RELEASED)
    private String question3SFGBudgetReleased;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_DATE_RECEIVED)
    private String question3SFGDateReceived;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_SFG_DATE_WITHDRAWN)
    private String question3SFGDateWithdrawn;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_1_DISPLAY)
    private String question31Display;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_3_2_PERIOD)
    private String question32Period;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_1_MALE)
    private String question4Grade1Male;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_1_FEMALE)
    private String question4Grade1Female;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_2_MALE)
    private String question4Grade2Male;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_2_FEMALE)
    private String question4Grade2Female;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_3_MALE)
    private String question4Grade3Male;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_3_FEMALE)
    private String question4Grade3Female;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_OTHER_MALE)
    private String question4GradeOtherMale;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_GRADE_OTHER_FEMALE)
    private String question4GradeOtherFemale;

}
