package com.mypackage.expressions.datetime;

import java.time.LocalDate;
import java.time.Period;

public class Birthday {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1983, 11, 28);
        LocalDate today = LocalDate.now();
        Period p = Period.between(date, today);
        System.out.println("Your age now is: " + p);
        System.out.println();
        System.out.printf("%d Years %d Months %d Days", p.getYears(), p.getMonths(), p.getDays());
        System.out.println();
    }
}
