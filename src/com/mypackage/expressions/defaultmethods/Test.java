package com.mypackage.expressions.defaultmethods;

public class Test implements Left, Right {

    public void m1(){
        System.out.println("My own class implementation");
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}
