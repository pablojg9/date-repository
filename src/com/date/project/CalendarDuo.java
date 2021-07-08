package com.date.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDuo {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));

        calendar.add(Calendar.DAY_OF_MONTH, 5);

        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));


    }

}
