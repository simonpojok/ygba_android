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
    }
}
