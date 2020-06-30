package com.mypackage.expressions.streams;

import java.util.ArrayList;

public class MinMaxMethod {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(10);
        number.add(0);
        number.add(15);
        number.add(25);
        number.add(20);
        System.out.println("List of numbers: " + number);

        Integer min = number.stream().min((i1, i2) -> i1 - i2).get();
        System.out.println("Minimum value is: " + min);

        Integer max = number.stream().max((i1, i2) -> i1 - i2).get();
        System.out.println("Maximum value is: " + max);
    }
}
