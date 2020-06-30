package com.mypackage.expressions.defaultmethods;

interface Left {
    default void m1(){
        System.out.println("This is Left interface");
    }
}
