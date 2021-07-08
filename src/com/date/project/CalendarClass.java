package com.date.project;

import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Milisegudos: " + calendar.getTimeInMillis());


        System.out.println("Dia do mês: " + Calendar.DAY_OF_MONTH);

        System.out.println("Dia da semana: " + Calendar.DAY_OF_WEEK);


    }
}
