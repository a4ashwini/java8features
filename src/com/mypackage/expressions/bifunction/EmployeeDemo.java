package com.mypackage.expressions.bifunction;

import java.util.function.BiFunction;

public class EmployeeDemo {
    int eNo;
    String name;
    int dayRate;

    public EmployeeDemo(int eNo, String name, int dayRate) {
        this.eNo = eNo;
        this.name = name;
        this.dayRate = dayRate;
    }
}

class TimeSheet {
    int eNo;
    int days;

    public TimeSheet(int eNo, int days) {
        this.eNo = eNo;
        this.days = days;
    }
}

class Demo {
    public static void main(String[] args) {
        BiFunction<EmployeeDemo, TimeSheet, Double> f = (e, t) -> Double.valueOf(e.dayRate * t.days);
        EmployeeDemo emp = new EmployeeDemo(1, "Ashwini", 500);
        TimeSheet timeSheet = new TimeSheet(1, 22);
        System.out.println("Monthly salary is: " + f.apply(emp, timeSheet));
    }
}