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
    private String question1SchoolName;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_MALE)
    private int question2MaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_FEMALE)
    private String question2FemaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_MALE_PWDS)
    private String question2MaleTeachersPWDS;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_TEACHERS_FEMALE_PWDS)
    private String question2FemaleTeacherPWDS;

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

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_2_P7_TOTAL)
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

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_1_PERFORMANCE)
    private String question41Performance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_4_2_REASON)
    private String question42Reason;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NO_BLOCKS)
    private boolean question5ToiletNoOfBlocks;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_NO_STANCES)
    private boolean question5ToiletNoOfStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_PUPIL_MALE_STANCES)
    private boolean question5ToiletPupilMaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_PUPIL_FEMALE_STANCES)
    private boolean question5ToiletPupilFemaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET__TEACHER_MALE_STANCES)
    private boolean question5ToiletTeacherMaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET__TEACHER_FEMALE_STANCES)
    private boolean question5ToiletTeacherMFemaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET__TEACHER_MIXED_STANCES)
    private boolean question5ToiletTeacherMixedStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_FUNC_FUNC)
    private boolean question5ToiletFuncFunctional;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_TOILET_FUNC_NONE)
    private boolean question5ToiletFuncNone;



    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_NO_BLOCKS)
    private boolean question5LatrineNoOfBlocks;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_NO_STANCES)
    private boolean question5LatrineNoOfStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_PUPIL_MALE_STANCES)
    private boolean question5LatrinePupilMaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_PUPIL_FEMALE_STANCES)
    private boolean question5LatrinePupilFemaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_TEACHER_MALE_STANCES)
    private boolean question5LatrineTeacherMaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_TEACHER_FEMALE_STANCES)
    private boolean question5LatrineTeacherMFemaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_TEACHER_MIXED_STANCES)
    private boolean question5LatrineTeacherMixedStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_FUNC_FUNC)
    private boolean question5LatrineFuncFunctional;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_LATRINE_FUNC_NONE)
    private boolean question5LatrineFuncNone;

    // vip
    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_NO_BLOCKS)
    private boolean question5VIPNoOfBlocks;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_NO_STANCES)
    private boolean question5VIPNoOfStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_PUPIL_MALE_STANCES)
    private boolean question5VIPPupilMaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_PUPIL_FEMALE_STANCES)
    private boolean question5VIPePupilFemaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_TEACHER_MALE_STANCES)
    private boolean question5VIPTeacherMaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_TEACHER_FEMALE_STANCES)
    private boolean question5VIPTeacherMFemaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_TEACHER_MIXED_STANCES)
    private boolean question5VIPTeacherMixedStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_FUNC_FUNC)
    private boolean question5VIPFuncFunctional;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_VIP_FUNC_NONE)
    private boolean question5VIPFuncNone;

    // female chnaging rooms
    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_NO_BLOCKS)
    private boolean question5FCROOMNoOfBlocks;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_NO_STANCES)
    private boolean question5FCROOMNoOfStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_PUPIL_MALE_STANCES)
    private boolean question5FCROOMPupilMaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_PUPIL_FEMALE_STANCES)
    private boolean question5FCROOMPupilFemaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_TEACHER_MALE_STANCES)
    private boolean question5FCROOMTeacherMaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_TEACHER_FEMALE_STANCES)
    private boolean question5FCROOMTeacherMFemaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_TEACHER_MIXED_STANCES)
    private boolean question5FCROOMTeacherMixedStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_FUNC_FUNC)
    private boolean question5FCROOMFuncFunctional;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_FCROOM_FUNC_NONE)
    private boolean question5FCROOMFuncNone;

    // boys urinals
    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_NO_BLOCKS)
    private boolean question5UFBNoOfBlocks;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_NO_STANCES)
    private boolean question5UFBNoOfStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_PUPIL_MALE_STANCES)
    private boolean question5UFBPupilMaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_PUPIL_FEMALE_STANCES)
    private boolean question5UFBPupilFemaleStances;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_TEACHER_MALE_STANCES)
    private boolean question5UFBTeacherMaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_TEACHER_FEMALE_STANCES)
    private boolean question5UFBTeacherMFemaleStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_TEACHER_MIXED_STANCES)
    private boolean question5UFBTeacherMixedStance;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_FUNC_FUNC)
    private boolean question5UFBFuncFunctional;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_UFB_FUNC_NONE)
    private boolean question5UFBFuncNone;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_1_LATRINE)
    private boolean question51Latrine;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_2_RAMPS)
    private String question52Ramps;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_2_PWD)
    private String question52PWD;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_2_NONE)
    private String question52None;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_2_OTHERS_SPEC)
    private String question52OtherSpec;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_3_WATER_POINT)
    private boolean question53YesNo;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_5_3_DISTANCE)
    private String question53Reason;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_6_1_NUMBER)
    private String question61Number;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_6_2_NUMBER)
    private String question62Number;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_6_3_NUMBER)
    private String question63Number;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_ENROLLED_MALE_TEACHERS)
    private String question7EnrolledMaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_ENROLLED_FEMALE_TEACHERS)
    private String question7EnrolledFeMaleTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_ENROLLED_MALE_TEACHERS_VISIT_TIME)
    private String question7EnrolledMaleTeachersPresentAtVisit;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_ENROLLED_FEMALE_TEACHERS_VISIT_TIME)
    private String question7EnrolledFeMaleTeachersPresentAtTimeOfVisit;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_TOTAL_NUM_TEACHERS)
    private String question7TotalNumOfTeachers;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION7_1_PUPIL_RATIO)
    private String question71PupilRatio;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_2_WOMAN_TEACHER)
    private boolean question72WomanTeacher;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_7_3_QUESTION)
    private String question73Question;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_8_1_INSPECTOR)
    private String question81Inspector;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_8_2_INSPECTOR_VISIT)
    private String question82InspectorVisit;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_8_3_COMMITTEE)
    private boolean question83Committee;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_8_4_MEET)
    private String question83Meet;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_8_5_SCHOOL_MGT)
    private String question84SchoolMGT;

    @ColumnInfo(name = EducationQuestionConstants.QUESTION_8_OTHER_OBSERVATIONS)
    private String question8OtherObservations;

    @ColumnInfo(name = EducationQuestionConstants.LOCALLY_STORED)
    private boolean locallyStored;

}
