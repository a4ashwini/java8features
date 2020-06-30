package com.mypackage.expressions.predicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

class PredicateExample {
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", "Katrina", "Kareena", "Mallika"};
        Predicate<String> p = s -> s.startsWith("K");
        System.out.println("Names starting with K are: ");
        m1(p,names);
    }

    public static void m1(Predicate<String> p, String names[]){
        for(String s: names){
            if(p.test(s)){
                System.out.println(s);
            }
        }
    }
}
