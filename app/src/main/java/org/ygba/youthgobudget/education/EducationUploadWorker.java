package org.ygba.youthgobudget.education;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.education.EducationQuestion;
import org.ygba.youthgobudget.data.education.EducationQuestionDao;

import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.ygba.youthgobudget.utils.Constants.WATER_COLLECTION_URL;

public class EducationUploadWorker extends Worker {
    YGBARepository ygbaRepository;
    EducationQuestionDao questionDao;
    Context context;
    public EducationUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(context.getApplicationContext()));
        questionDao = YGBDatabase.getInstance(context.getApplicationContext()).educationQuestionDao();
        this.context = context;
    }

    @NonNull
    @Override
    public Result doWork() {
        // some work
        List<EducationQuestion> educationQuestions = getList();
        if (educationQuestions != null ) {
            for (EducationQuestion educationQuestion: educationQuestions) {
                // json
                try {
                    JSONObject body = new JSONObject();
                    body.put("name", "No provided");
                    body.put("record_id", educationQuestion.getId());
                    body.put("phone_number", educationQuestion.getTel());
                    body.put("financial_Year", educationQuestion.getFinancialYear());
                    body.put("quarter", educationQuestion.getQuarter());
                    body.put("date", educationQuestion.getDate());
                    body.put("district", educationQuestion.getDistrict());
                    body.put("region", educationQuestion.getRegion());
                    body.put("subcounty", educationQuestion.getParish());
                    body.put("Village", educationQuestion.getVillage());
                    body.put("Name_of_Monitor_YGB", educationQuestion.getFullNames());
                    body.put("Tel_No", educationQuestion.getTel());
                    body.put("Name_of_Universal_Pr_ucation_UPE_school", educationQuestion.getQuestion1Answer());
                    body.put("School_Name", educationQuestion.getQuestion2SchoolName());

                    // teachers
                    body.put("Teachers_Male", educationQuestion.getQuestion2MaleTeachers());
                    body.put("Teachers_Female", educationQuestion.getQuestion2FeMaleTeachers());
                    body.put("Teachers_Male_PWDs", educationQuestion.getQuestion2MalePWDTeachers());
                    body.put("Teachers_Female_PWDs", educationQuestion.getQuestion2FemalePWDTeachers());
                    body.put("Teachers_total", educationQuestion.getQuestion2TeachersTotal());

                    // pupil enrollment
                    body.put("Pupil_enrollment_Male", educationQuestion.getQuestion2MalePupilEnrollment());
                    body.put("Pupil_enrolment_Female", educationQuestion.getQuestion2FeMalePupilEnrollment());
                    body.put("Pupil_enrolment_Male_PWDs", educationQuestion.getQuestion2MalePWDTeachers());
                    body.put("Pupil_enrolment_Female_PWDs", educationQuestion.getQuestion2FemalePWDTeachers());
                    body.put("Pupil_enrolment_total", educationQuestion.getQuestion2PupilEnrollmentTotal());

                    // number p 7
                    body.put("Number_of_P7_pupils_Male", educationQuestion.getQuestion2NumberP7Male());
                    body.put("Number_of_P7_pupils_Female", educationQuestion.getQuestion2NumberP7FeMale());
                    body.put("Number_of_P7_pupils_Male_PWDs", educationQuestion.getQuestion2NumberP7MalePWD());
                    body.put("Number_of_P7_pupils_Female_PWDs", educationQuestion.getQuestion2NumberP7FeMalePWD());
                    body.put("Number_of_p7_pupils_total", educationQuestion.getQuestion2NumberP7Total());

                    // no of drop outs
                    body.put("No_of_pupils_dropping_out_of_school_Male", educationQuestion.getQuestion2NumberDropoutMale());
                    body.put("No_of_pupils_droppin_out_of_school_Female", educationQuestion.getQuestion2NumberDropOutFemale());
                    body.put("No_of_pupils_droppin_of_school_Male_PWDs", educationQuestion.getQuestion2NumberDropoutMalePWD());
                    body.put("No_of_pupils_droppin_f_school_Female_PWDs", educationQuestion.getQuestion2NumberDropOutFemalePWD());
                    body.put("No_of_pupils_droppin_total", educationQuestion.getQuestion2NumberDropOutTotal());

                    body.put("If_dropout_is_regist_opping_out_of_school", educationQuestion.getQuestion2DropOutReasonIfAny());

                    // question 3
                    body.put("Budgeted_funds_rece_nts_Approved_budgets", educationQuestion.getQuestion3capitalGrantApprovedBudget());
                    body.put("Budgeted_funds_rece_get_released_Actual", educationQuestion.getQuestion3CapitalGrantReleaseBudget());
                    body.put("Date_received", educationQuestion.getQuestion3CapitalReceivedDate());
                    body.put("Date_Withdrawn", educationQuestion.getQuestion3CapitalDateWithdrawn());

                    // sfg
                    body.put("Budgeted_funds_rece_FG_Approved_budgets", educationQuestion.getQuestion3SFGApprovedBudgetEditText());
                    body.put("Budgeted_funds_rece_get_released_Actual_001", educationQuestion.getQuestion3SFGBudgetReceived());
                    body.put("Budget_released_Actual_Date_Received", educationQuestion.getQuestion3SFGDateReceived());
                    body.put("Budget_released_Actual_Date_Withdrawn", educationQuestion.getQuestion3SFGDateWithdrawn());

                    body.put("Does_the_school_disp_ck_where_appropriate", educationQuestion.getQuestion31DisplayBudgetInformation());
                    body.put("state_the_period_which_the_budget_relates", educationQuestion.getQuestion32StatementPeriod());

                    // question 4
                    body.put("P_7_TERMLY_PERFORMANCE_Grade_1_Male", educationQuestion.getQuestion4Grade1MaleNumber());
                    body.put("P_7_TERMLY_PERFORMANCE_Grade_1_Female", educationQuestion.getQuestion4Grade1FemaleNumber());

                    body.put("P_7_TERMLY_PERFORMANCE_Grade_2_Male", educationQuestion.getQuestion4Grade2MaleNumber());
                    body.put("P_7_TERMLY_PERFORMANCE_Grade_2_Female", educationQuestion.getQuestion4Grade2FemaleNumber());

                    body.put("P_7_TERMLY_PERFORMANCE_Grade_3_Male", educationQuestion.getQuestion4Grade3MaleNumber());
                    body.put("P_7_TERMLY_PERFORMANCE_Grade_3_Female", educationQuestion.getQuestion4Grade3FemaleNumber());

                    body.put("P_7_TERMLY_PERFORMANCE_Grade_Other_Male", educationQuestion.getQuestion4Grade4MaleNumber());
                    body.put("P_7_TERMLY_PERFORMAN_Grade_Other_Female", educationQuestion.getQuestion4Grade4FemaleNumber());

                    body.put("How_is_the_current_t_pared_to_last_term_s", educationQuestion.getQuestion41CurrentTermPerformance());
                    body.put("what_reason_is_attributed_to_the_above_answer", educationQuestion.getQuestion42ReasonAttribute());

                    // question 5
                    body.put("Sanitation_facility_oilet_No_of_Blocks", educationQuestion.getQuestion5ToiletNumberBlocks());
                    body.put("Sanitation_facility_ilet_No_of_Stances", educationQuestion.getQuestion5ToiletNumberStances());
                    body.put("Sanitation_facility_f_Pupil_Male_Stances", educationQuestion.getQuestion5ToiletNumberMaleStancesPupil());
                    body.put("Sanitation_facility_Pupil_Female_Stances", educationQuestion.getQuestion5ToiletNumberFemaleStancesPupil());
                    body.put("Sanitation_facility_Teacher_Male_Stances", educationQuestion.getQuestion5ToiletNumberMaleStancesTeacher());
                    body.put("Sanitation_facility_acher_Female_Stances", educationQuestion.getQuestion5ToiletNumberStancesFemaleTeachers());
                    body.put("Sanitation_facility_Teacher_Mix_Stances", educationQuestion.getQuestion5ToiletNumberStancesMixed());
                    body.put("Sanitation_facility_Toilet_Functional", educationQuestion.getQuestion5ToiletFunctional());
                    body.put("Sanitation_facility_ilet_Non_Functional", educationQuestion.getQuestion5ToiletNoneFunctional());

                    // latrine
                    body.put("Sanitation_facility_trine_No_of_Blocks", educationQuestion.getQuestion5LatrineNumberBlocks());
                    body.put("Sanitation_facility_rine_No_of_Stances", educationQuestion.getQuestion5LatrineNumberStances());
                    body.put("Sanitation_facility_Stances_Pupils_Male", educationQuestion.getQuestion5LatrineNumberStanceMalePupil());
                    body.put("Sanitation_facility_ances_Pupils_Female", educationQuestion.getQuestion5LatrineNumberStanceFemalePupil());
                    body.put("Sanitation_facility_tances_Teacher_Male", educationQuestion.getQuestion5LatrineNumberStancesMaleTeachers());
                    body.put("Sanitation_facility_nces_Teacher_Female", educationQuestion.getQuestion5LatrineNumberStancesFemaleTeachers());
                    body.put("Sanitation_facility_nces_Teachers_Mixed", educationQuestion.getQuestion5LatrineMixedTeachers());
                    body.put("Sanitation_facility_Stances_Functional", educationQuestion.getQuestion5LatrineFunctional());
                    body.put("Sanitation_facility_nces_Non_Functional", educationQuestion.getQuestion5LatrineNoneFunctional());

                    // vip
                    body.put("Sanitation_facility_vip_latrine_no_of_Blocks", educationQuestion.getQuestion5VIPLatrineNumberBlocks());
                    body.put("Sanitation_facility_latrine_No_of_Stances", educationQuestion.getQuestion5VIPLatrineNumberStances());
                    body.put("Sanitation_facility_vip_latrine_Stances_Pupils_Male", educationQuestion.getQuestion5VIPLatrineNumberStancesMalePupil());
                    body.put("Sanitation_facility_vip_latrine_stances_Pupils_Female", educationQuestion.getQuestion5VIPLatrineNumberStancesFemalePupil());
                    body.put("Sanitation_facility_vip_latrine_stances_Teacher_Male", educationQuestion.getQuestion5VIPLatrineNumberStancesMaleTeacher());
                    body.put("Sanitation_facility_vip_latrine_stances_Teacher_Female", educationQuestion.getQuestion5VIPLatrineNumberStancesFemaleTeachers());
                    body.put("Sanitation_facility_vip_latrine_stances_Teachers_Mixed", educationQuestion.getQuestion5VIPLatrineNumberStancesMixedTeachers());
                    body.put("Sanitation_facility_vip_latrine_Stances_Functional", educationQuestion.getQuestion5VIPLatrineFunction());
                    body.put("Sanitation_facility_vip_latrine_stances_Non_Functional", educationQuestion.getQuestion5VIPNoneFunctional());

                    body.put("Female_changing_rooms_Pupil_Female", educationQuestion.getQuestion5FemaleChangingRoomBlockNumber());
                    body.put("Female_changing_rooms_No_of_Stances", educationQuestion.getQuestion5FemaleChangingRoomStanceNumber());
                    body.put("Female_changing_rooms_No_Pupil_Female", educationQuestion.getQuestion5FemaleChangingRoomFemaleStances());
                    body.put("Female_changing_room_ocks_Teachers_Female", educationQuestion.getQuestion5FemaleChangingRoomFemaleTeacher());
                    body.put("Female_changing_rooms_Functional_mixed", educationQuestion.getQuestion5FemaleChangingRoomMixedTeacher());
                    body.put("Female_changing_rooms_Functional", educationQuestion.getQuestion5FemaleChangingRoomFunctional());
                    body.put("Female_changing_rooms_Non_Functional", educationQuestion.getQuestion5FemaleChangingRoomNoneFunctional());

                    body.put("Urinals_for_boys_Blocks", educationQuestion.getQuestion5UrinalsForBoysBlockNumber());
                    body.put("Urinals_for_boys_Stances", educationQuestion.getQuestion5UrinalsForBoysNumberStances());
                    body.put("Urinals_for_boys_Pupil_Male", educationQuestion.getQuestion5UrinalsForBoysStancesPupil());
                    body.put("Urinals_for_boys_Teachers_Male", educationQuestion.getQuestion5UrinalsForBoysNumberStancesTeacher());
                    body.put("Urinals_for_boys_Teachers_Male_mixed", educationQuestion.getQuestion5UrinalsForBoysMixedTeachers());
                    body.put("Urinals_for_boys_Functional", educationQuestion.getQuestion5UrinalsForBoysTeacherFunctional());
                    body.put("Urinals_for_boys_Non_Functional", educationQuestion.getQuestion5UrinalsForBoysNoneFunctional());

                    // question 5Yes
                    body.put("Are_the_school_toilet_latrine_", educationQuestion.isQ5SchoolToiletAccessible());
                    body.put("If_yes_how_accessib_ls_with_disabilities", "Missing value");
                    body.put("Is_there_a_functional_water_po", educationQuestion.isQ5FunctionalWaterPoint());
                    body.put("Estimate_Distance", educationQuestion.getQ5FunctionalWaterPointReasonIfNo());

                    // QUESTION 6
                    body.put("How_many_permanent_c_ks_are_at_the_school", educationQuestion.getQuestion61NumberPermanentClassRooms());
                    body.put("How_many_desks_are_i_he_time_of_the_visit", educationQuestion.getQuestion62NumberOfDeskInSchool());
                    body.put("What_is_the_pupil_desk_ratio", educationQuestion.getQuestion63PupilDeskRatio());

                    // question 7

                    body.put("Total_No_of_teachers_enrolled_Male", educationQuestion.getQuestion70NumberOfMaleTeacherEnrolled());
                    body.put("Total_No_of_teachers_enrolled_Female", educationQuestion.getQuestion70NumberOfFemaleTeacherEnrolled());
                    body.put("No_of_teachers_prese_time_of_visit_Male", educationQuestion.getQuestion70NumberOfTeachersPresentMale());
                    body.put("No_of_teachers_prese_ime_of_visit_Female", educationQuestion.getQuestion70NumberOfFemaleTeacherPresent());
                    body.put("No_of_Teachers_accessing_payroll_Male", educationQuestion.getQuestion70NumberOfTeachersOnPayroll());
                    body.put("No_of_Teachers_acce_sing_payroll_Female", educationQuestion.getQuestion70NumberOfTeachersOnPayroll());
                    body.put("What_is_the_teacher_pupil_ratio", educationQuestion.getQuestion71TeacherPupilRatio());
                    body.put("Does_the_school_have_senior_woman_teacher", educationQuestion.isQuestion72SeniorWomanTeacherYesNo());
                    body.put("How_often_does_the_s_ticipation_in_school", educationQuestion.getQuestion73SWFOfferSupportHow());

                    // question 8
                    body.put("How_often_does_Schoo_tor_visit_the_school", educationQuestion.getQuestion8HowOftenSchoolInspectorVisit());
                    body.put("When_was_the_last_ti_ed_the_school_Date", educationQuestion.getQuestion82LastTimeInspectorVisit());
                    body.put("Does_the_school_have_a_Managem", educationQuestion.isQuestion83SchoolHaveSchoolManagementCommittee());
                    body.put("If_Yes_how_often_do_they_meet", educationQuestion.getQuestion84HowOftenSMCMeet());
                    body.put("Is_the_school_manage_nt_committee_trained", educationQuestion.getQuestion85IsSMCTrained());
                    body.put("List_any_other_obser_ations_or_challenges", educationQuestion.getQuestion8ObservationsOrChallenges());

                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                            Request.Method.POST,
                            WATER_COLLECTION_URL,
                            body,
                            new Response.Listener<JSONObject>() {
                                @Override
                                public void onResponse(JSONObject response) {
                                    Log.d("WaterEnvironmentWorker", response.toString());
                                    try {
                                        deleteEducationQuestion(response.getInt("record_id"));
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            },
                            new Response.ErrorListener() {//
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    Log.d("Error", error.toString());
                                }
                            }
                    );

                    RequestQueue requestQueue = Volley.newRequestQueue(context);
                    requestQueue.add(jsonObjectRequest);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return Result.success();
        }
        return Result.success();
    }

    private void deleteEducationQuestion(final int record_id) {
        YGBDatabase.db_executor.execute(new Runnable() {
            @Override
            public void run() {
                EducationQuestion educationQuestion = questionDao.getEducationQuestionByID(record_id);
                if (educationQuestion != null) {
                    questionDao.deleteEducationQuestion(educationQuestion);
                }
            }
        });
    }

    private List<EducationQuestion> getList() {
        try {
            return ygbaRepository.getEducationQuestion4BackUp();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
