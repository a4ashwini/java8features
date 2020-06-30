package com.mypackage.expressions.streams;

import java.util.ArrayList;

public class ToArrayMethod {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(10);
        num.add(20);
        num.add(15);
        num.add(0);
        num.add(25);
        Integer[] array = num.stream().sorted().toArray(Integer[]::new);
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}
