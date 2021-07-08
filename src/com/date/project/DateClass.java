package com.date.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) throws ParseException {


        Date date = new Date();

        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Dia da mês: " + date.getDate());
        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Horas do dia: " + date.getHours());

        System.out.println("Minutos em hora: " + date.getMinutes());
        System.out.println("segundos: " + date.getSeconds());

        // Simple Date Format

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");

        System.out.println("Data atual: " + simpleDateFormat.format(date));


        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Segunda data atual convertido em formato de banco de dados: " + simpleDateFormat1.format(date));

        System.out.println("Objeto date" +  simpleDateFormat1.parse("2004-09-24"));


    }
}
