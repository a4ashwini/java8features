package com.mypackage.expressions.supplier;

import java.util.function.Supplier;

public class RandomPassword {
    public static void main(String[] args) {
        Supplier<String> password = () -> {

            Supplier<Integer> digits = () -> (int) (Math.random() * 10);

            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$#@";
            Supplier<Character> character = () -> symbols.charAt((int) (Math.random() * 29));

            String pwd = "";
            for (int i = 1; i <= 8; i++) {
                if (i % 2 == 0) {
                    pwd = pwd + digits.get();
                } else {
                    pwd = pwd + character.get();
                }
            }
            return pwd;
        };
        System.out.println(password.get());
    }
}
