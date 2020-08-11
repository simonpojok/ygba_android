package org.ygba.youthgobudget.education;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import org.json.JSONException;
import org.json.JSONObject;
import org.ygba.youthgobudget.YGBARepository;
import org.ygba.youthgobudget.data.YGBDatabase;
import org.ygba.youthgobudget.data.education.EducationQuestion;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class EducationUploadWorker extends Worker {
    YGBARepository ygbaRepository;
    public EducationUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        ygbaRepository = YGBARepository.getInstance(YGBDatabase.getInstance(context.getApplicationContext()));
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



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        } else {
            return Result.success();
        }
        return Result.success();
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

        $table->integer('Sanitation_facility_oilet_No_of_Blocks')->nullable();
        $table->integer('Sanitation_facility_ilet_No_of_Stances')->nullable();
        $table->integer('Sanitation_facility_f_Pupil_Male_Stances')->nullable();
        $table->integer('Sanitation_facility_Pupil_Female_Stances')->nullable();
        $table->integer('Sanitation_facility_Teacher_Male_Stances')->nullable();
        $table->integer('Sanitation_facility_acher_Female_Stances')->nullable();
        $table->integer('Sanitation_facility_Teacher_Mix_Stances')->nullable();
        $table->integer('Sanitation_facility_Toilet_Functional')->nullable();
        $table->integer('Sanitation_facility_ilet_Non_Functional')->nullable();
        $table->integer('Sanitation_facility_trine_No_of_Blocks')->nullable();
        $table->integer('Sanitation_facility_rine_No_of_Stances')->nullable();
        $table->integer('Sanitation_facility_Stances_Pupils_Male')->nullable();
        $table->integer('Sanitation_facility_ances_Pupils_Female')->nullable();
        $table->integer('Sanitation_facility_tances_Teacher_Male')->nullable();
        $table->integer('Sanitation_facility_nces_Teacher_Female')->nullable();
        $table->integer('Sanitation_facility_nces_Teachers_Mixed')->nullable();
        $table->integer('Sanitation_facility_Stances_Functional')->nullable();
        $table->integer('Sanitation_facility_nces_Non_Functional')->nullable();
        $table->integer('Sanitation_facility_trine_No_of_Blocks_001')->nullable();
        $table->integer('Sanitation_facility_rine_No_of_Stances_001')->nullable();
        $table->integer('Sanitation_facility_Stances_Pupils_Male_001')->nullable();
        $table->integer('Sanitation_facility_ances_Pupils_Female_001')->nullable();
        $table->integer('Sanitation_facility_ances_Teachers_Male')->nullable();
        $table->integer('Sanitation_facility_ces_Teachers_Female')->nullable();
        $table->integer('Sanitation_facility_rine_No_Functional')->nullable();
        $table->integer('Sanitation_facility_No_Non_Functional')->nullable();
        $table->integer('Female_changing_rooms_Pupil_Female')->nullable();
        $table->integer('Female_changing_rooms_No_of_Blocks')->nullable();
        $table->integer('Female_changing_rooms_No_of_Stances')->nullable();
        $table->integer('Female_changing_rooms_No_Pupil_Female')->nullable();
        $table->integer('Female_changing_room_ocks_Teachers_Female')->nullable();
        $table->integer('Female_changing_rooms_Functional')->nullable();
        $table->integer('Female_changing_rooms_Non_Functional')->nullable();
        $table->integer('Urinals_for_boys_Blocks')->nullable();
        $table->integer('Urinals_for_boys_Stances')->nullable();
        $table->integer('Urinals_for_boys_Pupil_Male')->nullable();
        $table->integer('Urinals_for_boys_Teachers_Male')->nullable();
        $table->integer('Urinals_for_boys_Functional')->nullable();
        $table->integer('Urinals_for_boys_Non_Functional')->nullable();
        $table->string('Are_the_school_toilet_latrine_')->nullable();
        $table->string('If_yes_how_accessib_ls_with_disabilities')->nullable();
        $table->string('Is_there_a_functional_water_po')->nullable();
        $table->integer('Estimate_Distance')->nullable();
        $table->integer('How_many_permanent_c_ks_are_at_the_school')->nullable();
        $table->integer('How_many_desks_are_i_he_time_of_the_visit')->nullable();
        $table->integer('What_is_the_pupil_desk_ratio')->nullable();
        $table->integer('Total_No_of_teachers_enrolled_Male')->nullable();
        $table->integer('Total_No_of_teachers_enrolled_Female')->nullable();
        $table->integer('No_of_teachers_prese_time_of_visit_Male')->nullable();
        $table->integer('No_of_teachers_prese_ime_of_visit_Female')->nullable();
        $table->integer('No_of_Teachers_accessing_payroll_Male')->nullable();
        $table->integer('No_of_Teachers_acce_sing_payroll_Female')->nullable();
        $table->integer('What_is_the_teacher_pupil_ratio')->nullable();
        $table->string('Does_the_school_have_senior_woman_teacher')->nullable();
        $table->string('How_often_does_the_s_ticipation_in_school')->nullable();
        $table->string('How_often_does_Schoo_tor_visit_the_school')->nullable();
        $table->date('When_was_the_last_ti_ed_the_school_Date')->nullable();
        $table->string('Does_the_school_have_a_Managem')->nullable();
        $table->string('If_Yes_how_often_do_they_meet')->nullable();
        $table->string('Attach_Mininutes')->nullable();
        $table->string('Is_the_school_manage_nt_committee_trained')->nullable();
        $table->string('List_any_other_obser_ations_or_challenges')->nullable();
        $table->timestamps();
        $table->softDeletes();
