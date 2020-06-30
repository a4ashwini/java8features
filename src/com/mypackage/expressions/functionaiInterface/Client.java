package com.mypackage.expressions.functionaiInterface;

public class Client {

    public static void main(String[] args){

        Runnable r = () -> {
            for(int i=1; i<15;i++) {
                System.out.println("Child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=1;i<5;i++){
            System.out.println("Main thread");
        }

        //HelloWorldInterface hello = new Client();

    }
}
