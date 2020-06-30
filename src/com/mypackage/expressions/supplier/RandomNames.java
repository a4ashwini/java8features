package com.mypackage.expressions.supplier;

import java.util.function.Supplier;

public class RandomNames {
    public static void main(String[] args) {
        Supplier<String> S = () -> {
            String[] s1 = {"Ashthu", "Jimmy", "Jenny", "Jamie"};
            int x = (int) (Math.random() * 4);
            return s1[x];
        };
        System.out.println(S.get());
        System.out.println(S.get());
        System.out.println(S.get());
        System.out.println(S.get());
    }
}
