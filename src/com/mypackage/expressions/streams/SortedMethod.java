package com.mypackage.expressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(25);
        numbers.add(15);
        numbers.add(5);
        numbers.add(10);
        System.out.println("Numbers list: " + numbers);

        List<Integer> list = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("List after sorting: " + list);

        List<Integer> list2 = numbers.stream().sorted((i1,i2) -> - i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Descending order: "+list2);

        //another way
        List<Integer> list3 = numbers.stream().sorted((i1,i2) -> i2 -i1).collect(Collectors.toList());
        System.out.println("Descending order again: "+list3);
    }
}
