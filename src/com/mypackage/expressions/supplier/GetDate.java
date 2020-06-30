package com.mypackage.expressions.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class GetDate {
    public static void main(String[] args) {
        Supplier<Date> date = () -> new Date();
        System.out.println(date.get());
    }
}
