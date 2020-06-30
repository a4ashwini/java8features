package com.mypackage.expressions.streams;

import java.util.ArrayList;

public class CountMethod {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ashwini");
        names.add("Akshata");
        names.add("Anoosha");
        names.add("Arjun");
        names.add("Ajit");
        names.add("Aakruti");
        names.add("Anvi");
        System.out.println("Generic list: " + names);

        long count = names.stream().filter(s -> s.length() >= 5).count();
        System.out.println("Names after filtering: " + count);
    }
}
