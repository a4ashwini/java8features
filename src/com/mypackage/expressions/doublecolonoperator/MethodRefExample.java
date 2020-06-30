package com.mypackage.expressions.doublecolonoperator;

//Method Reference using double colon operator

public class MethodRefExample {

    public static void m2() {
        System.out.println("Method Reference");
    }

    public static void main(String[] args) {
        Intref i = MethodRefExample::m2;
        i.m1();
    }
}

interface Intref {
    public void m1();
}