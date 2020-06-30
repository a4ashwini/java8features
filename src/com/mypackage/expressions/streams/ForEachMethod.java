package com.mypackage.expressions.streams;

import java.util.ArrayList;

public class ForEachMethod {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Ashwini");
        str.add("Anoosha");
        str.add("Akshata");

        str.stream().sorted().forEach(s-> System.out.println("Names: "+s));
    }
}
