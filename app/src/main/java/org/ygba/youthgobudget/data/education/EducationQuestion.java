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

    public EducationQuestion(String financialYear, String date, String district, String parish, String sub_county, String fullname, String tel, String question1, String question2TeacherMale, String question2TeacherFemale, String question2TeacherMalePWDS, String question2TeacherFemalePWDS, String question2TeacherTotal, String question2PupilMale, String question2PupilFemale, String question2PupilMalePWDS, String question2PupilFemalePWDS, String question2PupilTotal, String question2P7Male, String question2P7Female, String question2P7MalePWDS, String question2P7FemalePWDS, String question2P7Total, String question2DropMale, String question2DropFemale, String question2DropMalePWDS, String question2DropFemalePWDS, String question2DropTotal, String question21Reason, String question3GrantApprovedBudget, String question3GrantBudgetReleased, String question3GrantDateReceived, String question3GrantDateWithdrawn, String question3SFGApprovedBudget, String question3SFGBudgetReleased, String question3SFGDateReceived, String question3SFGDateWithdrawn, String question31Display, String question32Period, String question4Grade1Male, String question4Grade1Female, String question4Grade2Male, String question4Grade2Female, String question4Grade3Male, String question4Grade3Female, String question4GradeOtherMale, String question4GradeOtherFemale, String question41Performance, String question42Reason, boolean question5ToiletNoOfBlocks, boolean question5ToiletNoOfStances, boolean question5ToiletPupilMaleStances, boolean question5ToiletPupilFemaleStances, boolean question5ToiletTeacherMaleStance, boolean question5ToiletTeacherMFemaleStance, boolean question5ToiletTeacherMixedStance, boolean question5ToiletFuncFunctional, boolean question5ToiletFuncNone, boolean question5LatrineNoOfBlocks, boolean question5LatrineNoOfStances, boolean question5LatrinePupilMaleStances, boolean question5LatrinePupilFemaleStances, boolean question5LatrineTeacherMaleStance, boolean question5LatrineTeacherMFemaleStance, boolean question5LatrineTeacherMixedStance, boolean question5LatrineFuncFunctional, boolean question5LatrineFuncNone, boolean question5VIPNoOfBlocks, boolean question5VIPNoOfStances, boolean question5VIPPupilMaleStances, boolean question5VIPePupilFemaleStances, boolean question5VIPTeacherMaleStance, boolean question5VIPTeacherMFemaleStance, boolean question5VIPTeacherMixedStance, boolean question5VIPFuncFunctional, boolean question5VIPFuncNone, boolean question5FCROOMNoOfBlocks, boolean question5FCROOMNoOfStances, boolean question5FCROOMPupilMaleStances, boolean question5FCROOMPupilFemaleStances, boolean question5FCROOMTeacherMaleStance, boolean question5FCROOMTeacherMFemaleStance, boolean question5FCROOMTeacherMixedStance, boolean question5FCROOMFuncFunctional, boolean question5FCROOMFuncNone, boolean question5UFBNoOfBlocks, boolean question5UFBNoOfStances, boolean question5UFBPupilMaleStances, boolean question5UFBPupilFemaleStances, boolean question5UFBTeacherMaleStance, boolean question5UFBTeacherMFemaleStance, boolean question5UFBTeacherMixedStance, boolean question5UFBFuncFunctional, boolean question5UFBFuncNone, boolean question51Latrine, String question52Ramps, String question52PWD, String question52None, String question52OtherSpec, boolean question53YesNo, String question53Reason, String question61Number, String question62Number, String question63Number, String question7EnrolledMaleTeachers, String question7EnrolledFeMaleTeachers, String question7EnrolledMaleTeachersPresentAtVisit, String question7EnrolledFeMaleTeachersPresentAtTimeOfVisit, String question7TotalNumOfTeachers, String question71PupilRatio, boolean question72WomanTeacher, String question73Question, String question81Inspector, String question82InspectorVisit, boolean question83Committee, String question83Meet, String question84SchoolMGT, String question8OtherObservations) {
        this.financialYear = financialYear;
        this.date = date;
        this.district = district;
        this.parish = parish;
        this.sub_county = sub_county;
        this.fullname = fullname;
        this.tel = tel;
        this.question1 = question1;
        this.question2TeacherMale = question2TeacherMale;
        this.question2TeacherFemale = question2TeacherFemale;
        this.question2TeacherMalePWDS = question2TeacherMalePWDS;
        this.question2TeacherFemalePWDS = question2TeacherFemalePWDS;
        this.question2TeacherTotal = question2TeacherTotal;
        this.question2PupilMale = question2PupilMale;
        this.question2PupilFemale = question2PupilFemale;
        this.question2PupilMalePWDS = question2PupilMalePWDS;
        this.question2PupilFemalePWDS = question2PupilFemalePWDS;
        this.question2PupilTotal = question2PupilTotal;
        this.question2P7Male = question2P7Male;
        this.question2P7Female = question2P7Female;
        this.question2P7MalePWDS = question2P7MalePWDS;
        this.question2P7FemalePWDS = question2P7FemalePWDS;
        this.question2P7Total = question2P7Total;
        this.question2DropMale = question2DropMale;
        this.question2DropFemale = question2DropFemale;
        this.question2DropMalePWDS = question2DropMalePWDS;
        this.question2DropFemalePWDS = question2DropFemalePWDS;
        this.question2DropTotal = question2DropTotal;
        this.question21Reason = question21Reason;
        this.question3GrantApprovedBudget = question3GrantApprovedBudget;
        this.question3GrantBudgetReleased = question3GrantBudgetReleased;
        this.question3GrantDateReceived = question3GrantDateReceived;
        this.question3GrantDateWithdrawn = question3GrantDateWithdrawn;
        this.question3SFGApprovedBudget = question3SFGApprovedBudget;
        this.question3SFGBudgetReleased = question3SFGBudgetReleased;
        this.question3SFGDateReceived = question3SFGDateReceived;
        this.question3SFGDateWithdrawn = question3SFGDateWithdrawn;
        this.question31Display = question31Display;
        this.question32Period = question32Period;
        this.question4Grade1Male = question4Grade1Male;
        this.question4Grade1Female = question4Grade1Female;
        this.question4Grade2Male = question4Grade2Male;
        this.question4Grade2Female = question4Grade2Female;
        this.question4Grade3Male = question4Grade3Male;
        this.question4Grade3Female = question4Grade3Female;
        this.question4GradeOtherMale = question4GradeOtherMale;
        this.question4GradeOtherFemale = question4GradeOtherFemale;
        this.question41Performance = question41Performance;
        this.question42Reason = question42Reason;
        this.question5ToiletNoOfBlocks = question5ToiletNoOfBlocks;
        this.question5ToiletNoOfStances = question5ToiletNoOfStances;
        this.question5ToiletPupilMaleStances = question5ToiletPupilMaleStances;
        this.question5ToiletPupilFemaleStances = question5ToiletPupilFemaleStances;
        this.question5ToiletTeacherMaleStance = question5ToiletTeacherMaleStance;
        this.question5ToiletTeacherMFemaleStance = question5ToiletTeacherMFemaleStance;
        this.question5ToiletTeacherMixedStance = question5ToiletTeacherMixedStance;
        this.question5ToiletFuncFunctional = question5ToiletFuncFunctional;
        this.question5ToiletFuncNone = question5ToiletFuncNone;
        this.question5LatrineNoOfBlocks = question5LatrineNoOfBlocks;
        this.question5LatrineNoOfStances = question5LatrineNoOfStances;
        this.question5LatrinePupilMaleStances = question5LatrinePupilMaleStances;
        this.question5LatrinePupilFemaleStances = question5LatrinePupilFemaleStances;
        this.question5LatrineTeacherMaleStance = question5LatrineTeacherMaleStance;
        this.question5LatrineTeacherMFemaleStance = question5LatrineTeacherMFemaleStance;
        this.question5LatrineTeacherMixedStance = question5LatrineTeacherMixedStance;
        this.question5LatrineFuncFunctional = question5LatrineFuncFunctional;
        this.question5LatrineFuncNone = question5LatrineFuncNone;
        this.question5VIPNoOfBlocks = question5VIPNoOfBlocks;
        this.question5VIPNoOfStances = question5VIPNoOfStances;
        this.question5VIPPupilMaleStances = question5VIPPupilMaleStances;
        this.question5VIPePupilFemaleStances = question5VIPePupilFemaleStances;
        this.question5VIPTeacherMaleStance = question5VIPTeacherMaleStance;
        this.question5VIPTeacherMFemaleStance = question5VIPTeacherMFemaleStance;
        this.question5VIPTeacherMixedStance = question5VIPTeacherMixedStance;
        this.question5VIPFuncFunctional = question5VIPFuncFunctional;
        this.question5VIPFuncNone = question5VIPFuncNone;
        this.question5FCROOMNoOfBlocks = question5FCROOMNoOfBlocks;
        this.question5FCROOMNoOfStances = question5FCROOMNoOfStances;
        this.question5FCROOMPupilMaleStances = question5FCROOMPupilMaleStances;
        this.question5FCROOMPupilFemaleStances = question5FCROOMPupilFemaleStances;
        this.question5FCROOMTeacherMaleStance = question5FCROOMTeacherMaleStance;
        this.question5FCROOMTeacherMFemaleStance = question5FCROOMTeacherMFemaleStance;
        this.question5FCROOMTeacherMixedStance = question5FCROOMTeacherMixedStance;
        this.question5FCROOMFuncFunctional = question5FCROOMFuncFunctional;
        this.question5FCROOMFuncNone = question5FCROOMFuncNone;
        this.question5UFBNoOfBlocks = question5UFBNoOfBlocks;
        this.question5UFBNoOfStances = question5UFBNoOfStances;
        this.question5UFBPupilMaleStances = question5UFBPupilMaleStances;
        this.question5UFBPupilFemaleStances = question5UFBPupilFemaleStances;
        this.question5UFBTeacherMaleStance = question5UFBTeacherMaleStance;
        this.question5UFBTeacherMFemaleStance = question5UFBTeacherMFemaleStance;
        this.question5UFBTeacherMixedStance = question5UFBTeacherMixedStance;
        this.question5UFBFuncFunctional = question5UFBFuncFunctional;
        this.question5UFBFuncNone = question5UFBFuncNone;
        this.question51Latrine = question51Latrine;
        this.question52Ramps = question52Ramps;
        this.question52PWD = question52PWD;
        this.question52None = question52None;
        this.question52OtherSpec = question52OtherSpec;
        this.question53YesNo = question53YesNo;
        this.question53Reason = question53Reason;
        this.question61Number = question61Number;
        this.question62Number = question62Number;
        this.question63Number = question63Number;
        this.question7EnrolledMaleTeachers = question7EnrolledMaleTeachers;
        this.question7EnrolledFeMaleTeachers = question7EnrolledFeMaleTeachers;
        this.question7EnrolledMaleTeachersPresentAtVisit = question7EnrolledMaleTeachersPresentAtVisit;
        this.question7EnrolledFeMaleTeachersPresentAtTimeOfVisit = question7EnrolledFeMaleTeachersPresentAtTimeOfVisit;
        this.question7TotalNumOfTeachers = question7TotalNumOfTeachers;
        this.question71PupilRatio = question71PupilRatio;
        this.question72WomanTeacher = question72WomanTeacher;
        this.question73Question = question73Question;
        this.question81Inspector = question81Inspector;
        this.question82InspectorVisit = question82InspectorVisit;
        this.question83Committee = question83Committee;
        this.question83Meet = question83Meet;
        this.question84SchoolMGT = question84SchoolMGT;
        this.question8OtherObservations = question8OtherObservations;
        this.locallyStored = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFinancialYear() {
        return financialYear;
    }

    public void setFinancialYear(String financialYear) {
        this.financialYear = financialYear;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public String getSub_county() {
        return sub_county;
    }

    public void setSub_county(String sub_county) {
        this.sub_county = sub_county;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2TeacherMale() {
        return question2TeacherMale;
    }

    public void setQuestion2TeacherMale(String question2TeacherMale) {
        this.question2TeacherMale = question2TeacherMale;
    }

    public String getQuestion2TeacherFemale() {
        return question2TeacherFemale;
    }

    public void setQuestion2TeacherFemale(String question2TeacherFemale) {
        this.question2TeacherFemale = question2TeacherFemale;
    }

    public String getQuestion2TeacherMalePWDS() {
        return question2TeacherMalePWDS;
    }

    public void setQuestion2TeacherMalePWDS(String question2TeacherMalePWDS) {
        this.question2TeacherMalePWDS = question2TeacherMalePWDS;
    }

    public String getQuestion2TeacherFemalePWDS() {
        return question2TeacherFemalePWDS;
    }

    public void setQuestion2TeacherFemalePWDS(String question2TeacherFemalePWDS) {
        this.question2TeacherFemalePWDS = question2TeacherFemalePWDS;
    }

    public String getQuestion2TeacherTotal() {
        return question2TeacherTotal;
    }

    public void setQuestion2TeacherTotal(String question2TeacherTotal) {
        this.question2TeacherTotal = question2TeacherTotal;
    }

    public String getQuestion2PupilMale() {
        return question2PupilMale;
    }

    public void setQuestion2PupilMale(String question2PupilMale) {
        this.question2PupilMale = question2PupilMale;
    }

    public String getQuestion2PupilFemale() {
        return question2PupilFemale;
    }

    public void setQuestion2PupilFemale(String question2PupilFemale) {
        this.question2PupilFemale = question2PupilFemale;
    }

    public String getQuestion2PupilMalePWDS() {
        return question2PupilMalePWDS;
    }

    public void setQuestion2PupilMalePWDS(String question2PupilMalePWDS) {
        this.question2PupilMalePWDS = question2PupilMalePWDS;
    }

    public String getQuestion2PupilFemalePWDS() {
        return question2PupilFemalePWDS;
    }

    public void setQuestion2PupilFemalePWDS(String question2PupilFemalePWDS) {
        this.question2PupilFemalePWDS = question2PupilFemalePWDS;
    }

    public String getQuestion2PupilTotal() {
        return question2PupilTotal;
    }

    public void setQuestion2PupilTotal(String question2PupilTotal) {
        this.question2PupilTotal = question2PupilTotal;
    }

    public String getQuestion2P7Male() {
        return question2P7Male;
    }

    public void setQuestion2P7Male(String question2P7Male) {
        this.question2P7Male = question2P7Male;
    }

    public String getQuestion2P7Female() {
        return question2P7Female;
    }

    public void setQuestion2P7Female(String question2P7Female) {
        this.question2P7Female = question2P7Female;
    }

    public String getQuestion2P7MalePWDS() {
        return question2P7MalePWDS;
    }

    public void setQuestion2P7MalePWDS(String question2P7MalePWDS) {
        this.question2P7MalePWDS = question2P7MalePWDS;
    }

    public String getQuestion2P7FemalePWDS() {
        return question2P7FemalePWDS;
    }

    public void setQuestion2P7FemalePWDS(String question2P7FemalePWDS) {
        this.question2P7FemalePWDS = question2P7FemalePWDS;
    }

    public String getQuestion2P7Total() {
        return question2P7Total;
    }

    public void setQuestion2P7Total(String question2P7Total) {
        this.question2P7Total = question2P7Total;
    }

    public String getQuestion2DropMale() {
        return question2DropMale;
    }

    public void setQuestion2DropMale(String question2DropMale) {
        this.question2DropMale = question2DropMale;
    }

    public String getQuestion2DropFemale() {
        return question2DropFemale;
    }

    public void setQuestion2DropFemale(String question2DropFemale) {
        this.question2DropFemale = question2DropFemale;
    }

    public String getQuestion2DropMalePWDS() {
        return question2DropMalePWDS;
    }

    public void setQuestion2DropMalePWDS(String question2DropMalePWDS) {
        this.question2DropMalePWDS = question2DropMalePWDS;
    }

    public String getQuestion2DropFemalePWDS() {
        return question2DropFemalePWDS;
    }

    public void setQuestion2DropFemalePWDS(String question2DropFemalePWDS) {
        this.question2DropFemalePWDS = question2DropFemalePWDS;
    }

    public String getQuestion2DropTotal() {
        return question2DropTotal;
    }

    public void setQuestion2DropTotal(String question2DropTotal) {
        this.question2DropTotal = question2DropTotal;
    }

    public String getQuestion21Reason() {
        return question21Reason;
    }

    public void setQuestion21Reason(String question21Reason) {
        this.question21Reason = question21Reason;
    }

    public String getQuestion3GrantApprovedBudget() {
        return question3GrantApprovedBudget;
    }

    public void setQuestion3GrantApprovedBudget(String question3GrantApprovedBudget) {
        this.question3GrantApprovedBudget = question3GrantApprovedBudget;
    }

    public String getQuestion3GrantBudgetReleased() {
        return question3GrantBudgetReleased;
    }

    public void setQuestion3GrantBudgetReleased(String question3GrantBudgetReleased) {
        this.question3GrantBudgetReleased = question3GrantBudgetReleased;
    }

    public String getQuestion3GrantDateReceived() {
        return question3GrantDateReceived;
    }

    public void setQuestion3GrantDateReceived(String question3GrantDateReceived) {
        this.question3GrantDateReceived = question3GrantDateReceived;
    }

    public String getQuestion3GrantDateWithdrawn() {
        return question3GrantDateWithdrawn;
    }

    public void setQuestion3GrantDateWithdrawn(String question3GrantDateWithdrawn) {
        this.question3GrantDateWithdrawn = question3GrantDateWithdrawn;
    }

    public String getQuestion3SFGApprovedBudget() {
        return question3SFGApprovedBudget;
    }

    public void setQuestion3SFGApprovedBudget(String question3SFGApprovedBudget) {
        this.question3SFGApprovedBudget = question3SFGApprovedBudget;
    }

    public String getQuestion3SFGBudgetReleased() {
        return question3SFGBudgetReleased;
    }

    public void setQuestion3SFGBudgetReleased(String question3SFGBudgetReleased) {
        this.question3SFGBudgetReleased = question3SFGBudgetReleased;
    }

    public String getQuestion3SFGDateReceived() {
        return question3SFGDateReceived;
    }

    public void setQuestion3SFGDateReceived(String question3SFGDateReceived) {
        this.question3SFGDateReceived = question3SFGDateReceived;
    }

    public String getQuestion3SFGDateWithdrawn() {
        return question3SFGDateWithdrawn;
    }

    public void setQuestion3SFGDateWithdrawn(String question3SFGDateWithdrawn) {
        this.question3SFGDateWithdrawn = question3SFGDateWithdrawn;
    }

    public String getQuestion31Display() {
        return question31Display;
    }

    public void setQuestion31Display(String question31Display) {
        this.question31Display = question31Display;
    }

    public String getQuestion32Period() {
        return question32Period;
    }

    public void setQuestion32Period(String question32Period) {
        this.question32Period = question32Period;
    }

    public String getQuestion4Grade1Male() {
        return question4Grade1Male;
    }

    public void setQuestion4Grade1Male(String question4Grade1Male) {
        this.question4Grade1Male = question4Grade1Male;
    }

    public String getQuestion4Grade1Female() {
        return question4Grade1Female;
    }

    public void setQuestion4Grade1Female(String question4Grade1Female) {
        this.question4Grade1Female = question4Grade1Female;
    }

    public String getQuestion4Grade2Male() {
        return question4Grade2Male;
    }

    public void setQuestion4Grade2Male(String question4Grade2Male) {
        this.question4Grade2Male = question4Grade2Male;
    }

    public String getQuestion4Grade2Female() {
        return question4Grade2Female;
    }

    public void setQuestion4Grade2Female(String question4Grade2Female) {
        this.question4Grade2Female = question4Grade2Female;
    }

    public String getQuestion4Grade3Male() {
        return question4Grade3Male;
    }

    public void setQuestion4Grade3Male(String question4Grade3Male) {
        this.question4Grade3Male = question4Grade3Male;
    }

    public String getQuestion4Grade3Female() {
        return question4Grade3Female;
    }

    public void setQuestion4Grade3Female(String question4Grade3Female) {
        this.question4Grade3Female = question4Grade3Female;
    }

    public String getQuestion4GradeOtherMale() {
        return question4GradeOtherMale;
    }

    public void setQuestion4GradeOtherMale(String question4GradeOtherMale) {
        this.question4GradeOtherMale = question4GradeOtherMale;
    }

    public String getQuestion4GradeOtherFemale() {
        return question4GradeOtherFemale;
    }

    public void setQuestion4GradeOtherFemale(String question4GradeOtherFemale) {
        this.question4GradeOtherFemale = question4GradeOtherFemale;
    }

    public String getQuestion41Performance() {
        return question41Performance;
    }

    public void setQuestion41Performance(String question41Performance) {
        this.question41Performance = question41Performance;
    }

    public String getQuestion42Reason() {
        return question42Reason;
    }

    public void setQuestion42Reason(String question42Reason) {
        this.question42Reason = question42Reason;
    }

    public boolean isQuestion5ToiletNoOfBlocks() {
        return question5ToiletNoOfBlocks;
    }

    public void setQuestion5ToiletNoOfBlocks(boolean question5ToiletNoOfBlocks) {
        this.question5ToiletNoOfBlocks = question5ToiletNoOfBlocks;
    }

    public boolean isQuestion5ToiletNoOfStances() {
        return question5ToiletNoOfStances;
    }

    public void setQuestion5ToiletNoOfStances(boolean question5ToiletNoOfStances) {
        this.question5ToiletNoOfStances = question5ToiletNoOfStances;
    }

    public boolean isQuestion5ToiletPupilMaleStances() {
        return question5ToiletPupilMaleStances;
    }

    public void setQuestion5ToiletPupilMaleStances(boolean question5ToiletPupilMaleStances) {
        this.question5ToiletPupilMaleStances = question5ToiletPupilMaleStances;
    }

    public boolean isQuestion5ToiletPupilFemaleStances() {
        return question5ToiletPupilFemaleStances;
    }

    public void setQuestion5ToiletPupilFemaleStances(boolean question5ToiletPupilFemaleStances) {
        this.question5ToiletPupilFemaleStances = question5ToiletPupilFemaleStances;
    }

    public boolean isQuestion5ToiletTeacherMaleStance() {
        return question5ToiletTeacherMaleStance;
    }

    public void setQuestion5ToiletTeacherMaleStance(boolean question5ToiletTeacherMaleStance) {
        this.question5ToiletTeacherMaleStance = question5ToiletTeacherMaleStance;
    }

    public boolean isQuestion5ToiletTeacherMFemaleStance() {
        return question5ToiletTeacherMFemaleStance;
    }

    public void setQuestion5ToiletTeacherMFemaleStance(boolean question5ToiletTeacherMFemaleStance) {
        this.question5ToiletTeacherMFemaleStance = question5ToiletTeacherMFemaleStance;
    }

    public boolean isQuestion5ToiletTeacherMixedStance() {
        return question5ToiletTeacherMixedStance;
    }

    public void setQuestion5ToiletTeacherMixedStance(boolean question5ToiletTeacherMixedStance) {
        this.question5ToiletTeacherMixedStance = question5ToiletTeacherMixedStance;
    }

    public boolean isQuestion5ToiletFuncFunctional() {
        return question5ToiletFuncFunctional;
    }

    public void setQuestion5ToiletFuncFunctional(boolean question5ToiletFuncFunctional) {
        this.question5ToiletFuncFunctional = question5ToiletFuncFunctional;
    }

    public boolean isQuestion5ToiletFuncNone() {
        return question5ToiletFuncNone;
    }

    public void setQuestion5ToiletFuncNone(boolean question5ToiletFuncNone) {
        this.question5ToiletFuncNone = question5ToiletFuncNone;
    }

    public boolean isQuestion5LatrineNoOfBlocks() {
        return question5LatrineNoOfBlocks;
    }

    public void setQuestion5LatrineNoOfBlocks(boolean question5LatrineNoOfBlocks) {
        this.question5LatrineNoOfBlocks = question5LatrineNoOfBlocks;
    }

    public boolean isQuestion5LatrineNoOfStances() {
        return question5LatrineNoOfStances;
    }

    public void setQuestion5LatrineNoOfStances(boolean question5LatrineNoOfStances) {
        this.question5LatrineNoOfStances = question5LatrineNoOfStances;
    }

    public boolean isQuestion5LatrinePupilMaleStances() {
        return question5LatrinePupilMaleStances;
    }

    public void setQuestion5LatrinePupilMaleStances(boolean question5LatrinePupilMaleStances) {
        this.question5LatrinePupilMaleStances = question5LatrinePupilMaleStances;
    }

    public boolean isQuestion5LatrinePupilFemaleStances() {
        return question5LatrinePupilFemaleStances;
    }

    public void setQuestion5LatrinePupilFemaleStances(boolean question5LatrinePupilFemaleStances) {
        this.question5LatrinePupilFemaleStances = question5LatrinePupilFemaleStances;
    }

    public boolean isQuestion5LatrineTeacherMaleStance() {
        return question5LatrineTeacherMaleStance;
    }

    public void setQuestion5LatrineTeacherMaleStance(boolean question5LatrineTeacherMaleStance) {
        this.question5LatrineTeacherMaleStance = question5LatrineTeacherMaleStance;
    }

    public boolean isQuestion5LatrineTeacherMFemaleStance() {
        return question5LatrineTeacherMFemaleStance;
    }

    public void setQuestion5LatrineTeacherMFemaleStance(boolean question5LatrineTeacherMFemaleStance) {
        this.question5LatrineTeacherMFemaleStance = question5LatrineTeacherMFemaleStance;
    }

    public boolean isQuestion5LatrineTeacherMixedStance() {
        return question5LatrineTeacherMixedStance;
    }

    public void setQuestion5LatrineTeacherMixedStance(boolean question5LatrineTeacherMixedStance) {
        this.question5LatrineTeacherMixedStance = question5LatrineTeacherMixedStance;
    }

    public boolean isQuestion5LatrineFuncFunctional() {
        return question5LatrineFuncFunctional;
    }

    public void setQuestion5LatrineFuncFunctional(boolean question5LatrineFuncFunctional) {
        this.question5LatrineFuncFunctional = question5LatrineFuncFunctional;
    }

    public boolean isQuestion5LatrineFuncNone() {
        return question5LatrineFuncNone;
    }

    public void setQuestion5LatrineFuncNone(boolean question5LatrineFuncNone) {
        this.question5LatrineFuncNone = question5LatrineFuncNone;
    }

    public boolean isQuestion5VIPNoOfBlocks() {
        return question5VIPNoOfBlocks;
    }

    public void setQuestion5VIPNoOfBlocks(boolean question5VIPNoOfBlocks) {
        this.question5VIPNoOfBlocks = question5VIPNoOfBlocks;
    }

    public boolean isQuestion5VIPNoOfStances() {
        return question5VIPNoOfStances;
    }

    public void setQuestion5VIPNoOfStances(boolean question5VIPNoOfStances) {
        this.question5VIPNoOfStances = question5VIPNoOfStances;
    }

    public boolean isQuestion5VIPPupilMaleStances() {
        return question5VIPPupilMaleStances;
    }

    public void setQuestion5VIPPupilMaleStances(boolean question5VIPPupilMaleStances) {
        this.question5VIPPupilMaleStances = question5VIPPupilMaleStances;
    }

    public boolean isQuestion5VIPePupilFemaleStances() {
        return question5VIPePupilFemaleStances;
    }

    public void setQuestion5VIPePupilFemaleStances(boolean question5VIPePupilFemaleStances) {
        this.question5VIPePupilFemaleStances = question5VIPePupilFemaleStances;
    }

    public boolean isQuestion5VIPTeacherMaleStance() {
        return question5VIPTeacherMaleStance;
    }

    public void setQuestion5VIPTeacherMaleStance(boolean question5VIPTeacherMaleStance) {
        this.question5VIPTeacherMaleStance = question5VIPTeacherMaleStance;
    }

    public boolean isQuestion5VIPTeacherMFemaleStance() {
        return question5VIPTeacherMFemaleStance;
    }

    public void setQuestion5VIPTeacherMFemaleStance(boolean question5VIPTeacherMFemaleStance) {
        this.question5VIPTeacherMFemaleStance = question5VIPTeacherMFemaleStance;
    }

    public boolean isQuestion5VIPTeacherMixedStance() {
        return question5VIPTeacherMixedStance;
    }

    public void setQuestion5VIPTeacherMixedStance(boolean question5VIPTeacherMixedStance) {
        this.question5VIPTeacherMixedStance = question5VIPTeacherMixedStance;
    }

    public boolean isQuestion5VIPFuncFunctional() {
        return question5VIPFuncFunctional;
    }

    public void setQuestion5VIPFuncFunctional(boolean question5VIPFuncFunctional) {
        this.question5VIPFuncFunctional = question5VIPFuncFunctional;
    }

    public boolean isQuestion5VIPFuncNone() {
        return question5VIPFuncNone;
    }

    public void setQuestion5VIPFuncNone(boolean question5VIPFuncNone) {
        this.question5VIPFuncNone = question5VIPFuncNone;
    }

    public boolean isQuestion5FCROOMNoOfBlocks() {
        return question5FCROOMNoOfBlocks;
    }

    public void setQuestion5FCROOMNoOfBlocks(boolean question5FCROOMNoOfBlocks) {
        this.question5FCROOMNoOfBlocks = question5FCROOMNoOfBlocks;
    }

    public boolean isQuestion5FCROOMNoOfStances() {
        return question5FCROOMNoOfStances;
    }

    public void setQuestion5FCROOMNoOfStances(boolean question5FCROOMNoOfStances) {
        this.question5FCROOMNoOfStances = question5FCROOMNoOfStances;
    }

    public boolean isQuestion5FCROOMPupilMaleStances() {
        return question5FCROOMPupilMaleStances;
    }

    public void setQuestion5FCROOMPupilMaleStances(boolean question5FCROOMPupilMaleStances) {
        this.question5FCROOMPupilMaleStances = question5FCROOMPupilMaleStances;
    }

    public boolean isQuestion5FCROOMPupilFemaleStances() {
        return question5FCROOMPupilFemaleStances;
    }

    public void setQuestion5FCROOMPupilFemaleStances(boolean question5FCROOMPupilFemaleStances) {
        this.question5FCROOMPupilFemaleStances = question5FCROOMPupilFemaleStances;
    }

    public boolean isQuestion5FCROOMTeacherMaleStance() {
        return question5FCROOMTeacherMaleStance;
    }

    public void setQuestion5FCROOMTeacherMaleStance(boolean question5FCROOMTeacherMaleStance) {
        this.question5FCROOMTeacherMaleStance = question5FCROOMTeacherMaleStance;
    }

    public boolean isQuestion5FCROOMTeacherMFemaleStance() {
        return question5FCROOMTeacherMFemaleStance;
    }

    public void setQuestion5FCROOMTeacherMFemaleStance(boolean question5FCROOMTeacherMFemaleStance) {
        this.question5FCROOMTeacherMFemaleStance = question5FCROOMTeacherMFemaleStance;
    }

    public boolean isQuestion5FCROOMTeacherMixedStance() {
        return question5FCROOMTeacherMixedStance;
    }

    public void setQuestion5FCROOMTeacherMixedStance(boolean question5FCROOMTeacherMixedStance) {
        this.question5FCROOMTeacherMixedStance = question5FCROOMTeacherMixedStance;
    }

    public boolean isQuestion5FCROOMFuncFunctional() {
        return question5FCROOMFuncFunctional;
    }

    public void setQuestion5FCROOMFuncFunctional(boolean question5FCROOMFuncFunctional) {
        this.question5FCROOMFuncFunctional = question5FCROOMFuncFunctional;
    }

    public boolean isQuestion5FCROOMFuncNone() {
        return question5FCROOMFuncNone;
    }

    public void setQuestion5FCROOMFuncNone(boolean question5FCROOMFuncNone) {
        this.question5FCROOMFuncNone = question5FCROOMFuncNone;
    }

    public boolean isQuestion5UFBNoOfBlocks() {
        return question5UFBNoOfBlocks;
    }

    public void setQuestion5UFBNoOfBlocks(boolean question5UFBNoOfBlocks) {
        this.question5UFBNoOfBlocks = question5UFBNoOfBlocks;
    }

    public boolean isQuestion5UFBNoOfStances() {
        return question5UFBNoOfStances;
    }

    public void setQuestion5UFBNoOfStances(boolean question5UFBNoOfStances) {
        this.question5UFBNoOfStances = question5UFBNoOfStances;
    }

    public boolean isQuestion5UFBPupilMaleStances() {
        return question5UFBPupilMaleStances;
    }

    public void setQuestion5UFBPupilMaleStances(boolean question5UFBPupilMaleStances) {
        this.question5UFBPupilMaleStances = question5UFBPupilMaleStances;
    }

    public boolean isQuestion5UFBPupilFemaleStances() {
        return question5UFBPupilFemaleStances;
    }

    public void setQuestion5UFBPupilFemaleStances(boolean question5UFBPupilFemaleStances) {
        this.question5UFBPupilFemaleStances = question5UFBPupilFemaleStances;
    }

    public boolean isQuestion5UFBTeacherMaleStance() {
        return question5UFBTeacherMaleStance;
    }

    public void setQuestion5UFBTeacherMaleStance(boolean question5UFBTeacherMaleStance) {
        this.question5UFBTeacherMaleStance = question5UFBTeacherMaleStance;
    }

    public boolean isQuestion5UFBTeacherMFemaleStance() {
        return question5UFBTeacherMFemaleStance;
    }

    public void setQuestion5UFBTeacherMFemaleStance(boolean question5UFBTeacherMFemaleStance) {
        this.question5UFBTeacherMFemaleStance = question5UFBTeacherMFemaleStance;
    }

    public boolean isQuestion5UFBTeacherMixedStance() {
        return question5UFBTeacherMixedStance;
    }

    public void setQuestion5UFBTeacherMixedStance(boolean question5UFBTeacherMixedStance) {
        this.question5UFBTeacherMixedStance = question5UFBTeacherMixedStance;
    }

    public boolean isQuestion5UFBFuncFunctional() {
        return question5UFBFuncFunctional;
    }

    public void setQuestion5UFBFuncFunctional(boolean question5UFBFuncFunctional) {
        this.question5UFBFuncFunctional = question5UFBFuncFunctional;
    }

    public boolean isQuestion5UFBFuncNone() {
        return question5UFBFuncNone;
    }

    public void setQuestion5UFBFuncNone(boolean question5UFBFuncNone) {
        this.question5UFBFuncNone = question5UFBFuncNone;
    }

    public boolean isQuestion51Latrine() {
        return question51Latrine;
    }

    public void setQuestion51Latrine(boolean question51Latrine) {
        this.question51Latrine = question51Latrine;
    }

    public String getQuestion52Ramps() {
        return question52Ramps;
    }

    public void setQuestion52Ramps(String question52Ramps) {
        this.question52Ramps = question52Ramps;
    }

    public String getQuestion52PWD() {
        return question52PWD;
    }

    public void setQuestion52PWD(String question52PWD) {
        this.question52PWD = question52PWD;
    }

    public String getQuestion52None() {
        return question52None;
    }

    public void setQuestion52None(String question52None) {
        this.question52None = question52None;
    }

    public String getQuestion52OtherSpec() {
        return question52OtherSpec;
    }

    public void setQuestion52OtherSpec(String question52OtherSpec) {
        this.question52OtherSpec = question52OtherSpec;
    }

    public boolean isQuestion53YesNo() {
        return question53YesNo;
    }

    public void setQuestion53YesNo(boolean question53YesNo) {
        this.question53YesNo = question53YesNo;
    }

    public String getQuestion53Reason() {
        return question53Reason;
    }

    public void setQuestion53Reason(String question53Reason) {
        this.question53Reason = question53Reason;
    }

    public String getQuestion61Number() {
        return question61Number;
    }

    public void setQuestion61Number(String question61Number) {
        this.question61Number = question61Number;
    }

    public String getQuestion62Number() {
        return question62Number;
    }

    public void setQuestion62Number(String question62Number) {
        this.question62Number = question62Number;
    }

    public String getQuestion63Number() {
        return question63Number;
    }

    public void setQuestion63Number(String question63Number) {
        this.question63Number = question63Number;
    }

    public String getQuestion7EnrolledMaleTeachers() {
        return question7EnrolledMaleTeachers;
    }

    public void setQuestion7EnrolledMaleTeachers(String question7EnrolledMaleTeachers) {
        this.question7EnrolledMaleTeachers = question7EnrolledMaleTeachers;
    }

    public String getQuestion7EnrolledFeMaleTeachers() {
        return question7EnrolledFeMaleTeachers;
    }

    public void setQuestion7EnrolledFeMaleTeachers(String question7EnrolledFeMaleTeachers) {
        this.question7EnrolledFeMaleTeachers = question7EnrolledFeMaleTeachers;
    }

    public String getQuestion7EnrolledMaleTeachersPresentAtVisit() {
        return question7EnrolledMaleTeachersPresentAtVisit;
    }

    public void setQuestion7EnrolledMaleTeachersPresentAtVisit(String question7EnrolledMaleTeachersPresentAtVisit) {
        this.question7EnrolledMaleTeachersPresentAtVisit = question7EnrolledMaleTeachersPresentAtVisit;
    }

    public String getQuestion7EnrolledFeMaleTeachersPresentAtTimeOfVisit() {
        return question7EnrolledFeMaleTeachersPresentAtTimeOfVisit;
    }

    public void setQuestion7EnrolledFeMaleTeachersPresentAtTimeOfVisit(String question7EnrolledFeMaleTeachersPresentAtTimeOfVisit) {
        this.question7EnrolledFeMaleTeachersPresentAtTimeOfVisit = question7EnrolledFeMaleTeachersPresentAtTimeOfVisit;
    }

    public String getQuestion7TotalNumOfTeachers() {
        return question7TotalNumOfTeachers;
    }

    public void setQuestion7TotalNumOfTeachers(String question7TotalNumOfTeachers) {
        this.question7TotalNumOfTeachers = question7TotalNumOfTeachers;
    }

    public String getQuestion71PupilRatio() {
        return question71PupilRatio;
    }

    public void setQuestion71PupilRatio(String question71PupilRatio) {
        this.question71PupilRatio = question71PupilRatio;
    }

    public boolean isQuestion72WomanTeacher() {
        return question72WomanTeacher;
    }

    public void setQuestion72WomanTeacher(boolean question72WomanTeacher) {
        this.question72WomanTeacher = question72WomanTeacher;
    }

    public String getQuestion73Question() {
        return question73Question;
    }

    public void setQuestion73Question(String question73Question) {
        this.question73Question = question73Question;
    }

    public String getQuestion81Inspector() {
        return question81Inspector;
    }

    public void setQuestion81Inspector(String question81Inspector) {
        this.question81Inspector = question81Inspector;
    }

    public String getQuestion82InspectorVisit() {
        return question82InspectorVisit;
    }

    public void setQuestion82InspectorVisit(String question82InspectorVisit) {
        this.question82InspectorVisit = question82InspectorVisit;
    }

    public boolean isQuestion83Committee() {
        return question83Committee;
    }

    public void setQuestion83Committee(boolean question83Committee) {
        this.question83Committee = question83Committee;
    }

    public String getQuestion83Meet() {
        return question83Meet;
    }

    public void setQuestion83Meet(String question83Meet) {
        this.question83Meet = question83Meet;
    }

    public String getQuestion84SchoolMGT() {
        return question84SchoolMGT;
    }

    public void setQuestion84SchoolMGT(String question84SchoolMGT) {
        this.question84SchoolMGT = question84SchoolMGT;
    }

    public String getQuestion8OtherObservations() {
        return question8OtherObservations;
    }

    public void setQuestion8OtherObservations(String question8OtherObservations) {
        this.question8OtherObservations = question8OtherObservations;
    }

    public boolean isLocallyStored() {
        return locallyStored;
    }

    public void setLocallyStored(boolean locallyStored) {
        this.locallyStored = locallyStored;
    }
}
