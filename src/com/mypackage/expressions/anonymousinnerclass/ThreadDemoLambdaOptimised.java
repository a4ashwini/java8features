package com.mypackage.expressions.anonymousinnerclass;

public class ThreadDemoLambdaOptimised {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Child thread");
            }
        });
        t.start();
        for (int i=0;i<5;i++){
            System.out.println("Main thread");
        }
    }
}
