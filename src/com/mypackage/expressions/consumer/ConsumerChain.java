package com.mypackage.expressions.consumer;

import java.util.function.Consumer;

public class ConsumerChain {
    String movieName;
    String hitOrFlop;

    public ConsumerChain(String movieName, String hitOrFlop) {
        this.movieName = movieName;
        this.hitOrFlop = hitOrFlop;
    }
}

class MovieResult {

    public static void main(String[] args) {

        Consumer<ConsumerChain> c1 = movie -> System.out.println(movie.movieName + " is ready to be released");
        Consumer<ConsumerChain> c2 = movie -> System.out.println(movie.movieName + " is now released");
        Consumer<ConsumerChain> c3 = movie -> System.out.println(movie.movieName + " is a " + movie.hitOrFlop);

        Consumer<ConsumerChain> consumerChain = c1.andThen(c2).andThen(c3);

        ConsumerChain movie = new ConsumerChain("Jab We Met", "Hit");
        consumerChain.accept(movie);
    }
}
