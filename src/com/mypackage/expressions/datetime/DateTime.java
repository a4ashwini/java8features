package com.mypackage.expressions.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();
        System.out.print("Today: ");
        System.out.printf("%d-%d-%d", day, month, year);
        System.out.println();

        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.print("Time: ");
        System.out.printf("%d:%d:%d", hour, minute, second);
        System.out.println();

        LocalDateTime dt = LocalDateTime.of(2020, Month.NOVEMBER, 28, 8, 55);
        System.out.println(dt);
        System.out.println();
        System.out.println(dt.plusMonths(1));
        System.out.println();
        System.out.println(dt.minusMonths(6));

    }
}
