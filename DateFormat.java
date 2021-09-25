package com.ttn.java.Collections;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat DTFormat = new SimpleDateFormat("dd-MMMMM-yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Today's Date: " + DTFormat.format(calendar.getTimeInMillis()));
    }
}
