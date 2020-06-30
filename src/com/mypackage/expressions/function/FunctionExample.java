package com.mypackage.expressions.function;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Integer> squareNumber = i -> i * i;
        System.out.println("The square of the number is: " + squareNumber.apply(5));
        System.out.println();

        //Input is String and Output is Integer type so use ToIntFunction
        ToIntFunction<String> f = s->s.length();
        System.out.println(f.applyAsInt("Ashwini"));
        System.out.println();

        //Input variable Integer and Output variable as Double
        IntToDoubleFunction sq = i->Math.sqrt(i);
        System.out.println(sq.applyAsDouble(5));

    }
}
