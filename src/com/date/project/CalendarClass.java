package com.date.project;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dateVencimento = simpleDateFormat.parse("15/07/2021");

        Date dateAtual = simpleDateFormat.parse("20/07/2021");


        if (dateVencimento.after(dateAtual)){
            JOptionPane.showMessageDialog(null, "Boleto gerado!");
        } else {
            JOptionPane.showMessageDialog(null, "A data do boleto expirou!");
        }




    }
}
