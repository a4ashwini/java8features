package com.mypackage.expressions.defaultmethods;

interface Right {
    default void m1(){
        System.out.println("This is Right interface");
    }
}
