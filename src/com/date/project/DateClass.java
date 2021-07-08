package com.date.project;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Data em milisegundos: " + date.getTime());
        System.out.println("Dia da mês: " + date.getDate());
        System.out.println("Dia da semana: " + date.getDay());
        System.out.println("Horas do dia: " + date.getHours());

        System.out.println("Minutos em hora: " + date.getMinutes());
        System.out.println("segundos: " + date.getSeconds());

        // Simple Date Format

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(simpleDateFormat.format(date));


    }
}
