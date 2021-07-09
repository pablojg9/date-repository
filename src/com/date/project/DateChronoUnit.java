package com.date.project;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class DateChronoUnit {
    public static void main(String[] args) throws ParseException {
       // Date date = new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2021");

        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-07-01"), LocalDate.now());

        System.out.println("Possui " + dias + " dias durante o dia " + LocalDate.now());

    }

}
