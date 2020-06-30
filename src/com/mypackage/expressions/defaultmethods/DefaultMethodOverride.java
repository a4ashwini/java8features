package com.mypackage.expressions.defaultmethods;

class DefaultMethodOverride implements IntRef {
    @Override
    public void method1() {
        System.out.println("Inside the DefaultMethodOverride Class");
    }

    public static void main(String[] args) {
        DefaultMethodOverride dmo = new DefaultMethodOverride();
        dmo.method1();
    }
}
