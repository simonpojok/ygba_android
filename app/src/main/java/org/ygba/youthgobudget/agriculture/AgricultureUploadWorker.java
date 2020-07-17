package org.ygba.youthgobudget.agriculture;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class AgricultureUploadWorker extends Worker {
    public AgricultureUploadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        return null;
    }
}

//'record_id',
//        'region',
//        'district',
//        'subcounty',
//        'parish',
//        'village',
//        'phone_id',
//        'staffName',
//        'date_recorded',
//        'ageCategory',
//        'financial_year',
//        'quarter',
//        'gender',
//        'phone_number',
//        'is_there_substantive_agricultural_extension_worker',
//        'if_no_why',
//        'extension_services_expected_or_approved',
//        'extension_services_amount_received',
//        'extension_services_date_received',
//        'extension_services_date_withdrawn',
//        'development_expected_or_approved',
//        'development_amount_received',
//        'development_date_received',
//        'development_date_withdrawn',
//        'number_of_field_visits_for_farmer_support',
//        'advisory_demonstration_community',
//        'if_yes_how_many_during_the_quarter',
//        'areas_where_the_meetings_or_workshops_were_held',
//        'reasons_for_not_conducting_the_community_meeting',
//        'are_there_any_advisory_services',
//        'if_yes_how_many_were_done_during_the_quarter',
//        'mention_the_areas_where_the_visits_were_made',
//        'male_number_of_farmers_visited_for_advisory_services',
//        'female_number_of_farmers_visited_for_advisory_services',
//        'reasons_for_not_conducting_the_farmer_advisory_services_visits',
//        'reasons_for_no_agriculture_inputs_and_livestock',
//        'any_owc_inputs',
//        'owc_inputs'
