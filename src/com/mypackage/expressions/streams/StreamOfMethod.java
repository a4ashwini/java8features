package com.mypackage.expressions.streams;

import java.util.stream.Stream;

public class StreamOfMethod {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
        s.forEach(System.out::println);
        System.out.println();

        //Double array
        Double[] d = {10.2, 5.2, 3.6, 4.5, 9.09};
        Stream<Double> array = Stream.of(d).sorted();
        array.forEach(System.out::println);
    }
}
