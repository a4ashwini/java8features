package com.mypackage.expressions.function;

import java.util.function.Function;

public class StrFunction {
    public static void main(String[] args) {
        String s = "This is my text.      ";

        Function<String, String> f = s1->s1.replace(" ", "");
        System.out.println("Text are replacing is: "+f.apply(s));
    }
}
