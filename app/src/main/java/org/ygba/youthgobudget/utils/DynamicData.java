package org.ygba.youthgobudget.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DynamicData {
    public static String getDate() {
        return new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(Calendar.getInstance());
    }

    public static String getTime() {
        return "08: 30pm";
    }

    public static String getAgentName() {
        return "Simon Peter";
    }

    public static String getAgentNumber() {
        return "364526";
    }

    public static String getTelNumber() {
        return "0772241709";
    }
}
