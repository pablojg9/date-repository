package com.date.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormateClass {
    public static void main(String[] args) throws ParseException {

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2021");

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        for (int counter = 1; counter <= 12; counter++) {
            calendar.add(Calendar.MONTH, 1);

            System.out.println("Parcela de número "+ counter
                    + " vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
    }

}
