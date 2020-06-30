package com.mypackage.expressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {
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

        List<String> list = names.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
        System.out.println("Names after filtering: " + list);

        List<String> list1 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("After mapping: " + list1);
    }
}
