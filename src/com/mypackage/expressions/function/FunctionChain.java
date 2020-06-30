package com.mypackage.expressions.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChain {

    public static void main(String[] args) {

        Function<String, String> f1 = str -> str.substring(0,7);
        Function<String, String> f2 = casing -> casing.toLowerCase();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String username = sc.next();
        System.out.println("Enter Password: ");
        String password = sc.next();

        if (f1.andThen(f2).apply(username).equals("ashwini") && password.equals("java")){
            System.out.println("Valid user");
        }
        else {
            System.out.println("Invalid user");
        }
    }
}
