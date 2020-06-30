package com.mypackage.expressions.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> I > 10;
        System.out.println(p.test(15));
        System.out.println(p.test(1));
        System.out.println("");

        Predicate<String> s = S -> S.length() > 5;
        System.out.println(s.test("Ashwini"));
        System.out.println(s.test("Appi"));
        System.out.println("");

        Predicate<Collection> c = C -> C.isEmpty();
        ArrayList<String> a = new ArrayList<>();
        //a.add("");
        System.out.println(c.test(a));
        System.out.println("");

        Predicate<Collection> ts = TS -> TS.contains("Ashwini");
        TreeSet<String> t = new TreeSet<>();
        //ts.contains("Ashwini");
        Predicate<Collection> test = ts.negate();
        System.out.println("Negate of test: " + test);
        System.out.println(ts.test(t));
    }
}
