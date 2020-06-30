package com.mypackage.expressions.predicate;

import java.util.function.IntPredicate;

public class IntPredicateDemo {
    public static void main(String[] args) {
        int x[] = {5,10,15,20,25,30};
        IntPredicate p = i-> i%2 == 0;
        for(int x1: x){
            if(p.test(x1)){
                System.out.println("Even numbers are: "+x1);
            }
        }
    }
}
