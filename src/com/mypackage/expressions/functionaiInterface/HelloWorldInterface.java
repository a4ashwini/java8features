package com.mypackage.expressions.functionaiInterface;

@FunctionalInterface
interface HelloWorldInterface {

    void add(int a, int b);

    default void m2() {

    }

}

class Test2 {
    public static void main(String[] args) {
        HelloWorldInterface h = (a, b) -> System.out.println("The sum is " + (a + b));

        h.add(10, 20);
        h.add(85, 23);
    }
}
