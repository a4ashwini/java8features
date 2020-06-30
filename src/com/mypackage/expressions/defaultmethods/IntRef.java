package com.mypackage.expressions.defaultmethods;

interface IntRef {
    default void method1(){
        System.out.println("Default method in the Interface");
    }
}
