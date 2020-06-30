package com.mypackage.expressions.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {
    String movieName;
    String actor;
    String actress;

    public Movie(String movieName, String actor, String actress) {
        this.movieName = movieName;
        this.actor = actor;
        this.actress = actress;
    }
}

class Test {
    public static void populate(ArrayList<Movie> movieArrayList) {
        movieArrayList.add(new Movie("Ek Tha Tiger", "Salman Khan", "Katrina Kaif"));
        movieArrayList.add(new Movie("Jab We Met", "Shahid Kapoor", "Kareena Kapoor"));
    }

    public static void main(String[] args) {
        ArrayList<Movie> movieArrayList = new ArrayList<>();
        populate(movieArrayList);
        Consumer<Movie> c = m -> {
            System.out.println(m.movieName);
            System.out.println(m.actor);
            System.out.println(m.actress);
            System.out.println();
        };
        for (Movie m : movieArrayList) {
            c.accept(m);
        }
    }
}