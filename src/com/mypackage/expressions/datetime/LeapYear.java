package com.mypackage.expressions.datetime;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = sc.nextInt();
        Year year = Year.of(n);
        if (year.isLeap()) {
            System.out.printf("%d is a Leap year", n);
        } else {
            System.out.printf("%d is not a Leap year", n);
        }
    }
}

