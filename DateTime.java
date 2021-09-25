package com.ttn.java.Collections;

import java.util.Calendar;
import java.text.SimpleDateFormat;


public class DateTime
{
    public static void main(String[] args)
    {
        SimpleDateFormat DTFormat = new SimpleDateFormat( "d/M/yyyy     hh:mm:ss a z");
        SimpleDateFormat DTFormat1 = new SimpleDateFormat("M/d/yyyy     mm:hh");
        SimpleDateFormat DTFormat2 = new SimpleDateFormat("yyyy-MM-dd   s.mm.hh");
        SimpleDateFormat DTFormat3 = new SimpleDateFormat("MM ,d, yyyy   hh:mm");
        Calendar calender = Calendar.getInstance();
        System.out.println("***************************");
        System.out.println("Date Pattern INDIA :     " + DTFormat.format(calender.getTime()));
        System.out.println("Date Pattern USA :     " + DTFormat1.format(calender.getTime()));
        System.out.println("Date Pattern GERMANY :     " + DTFormat2.format(calender.getTime()));
        System.out.println("Date Pattern AUSTRALIA :     " + DTFormat3.format(calender.getTime()));
    }

}
