package com.mypackage.expressions.functionaiInterface;

interface Intref{
    void m1(int i);
/*
    static double m2(double y) {
        return y+y;
    }*/
}
public class AbsMethod {
    public static void main(String[] args) {
        Intref iref = i -> System.out.println(i * i);
        iref.m1(5);
    }
}
