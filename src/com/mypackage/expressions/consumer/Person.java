package com.mypackage.expressions.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Person {
    String name;
    int marks;

    public Person(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class GradeDemo {

    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        populate(personArrayList);

        Predicate<Person> p = person -> person.marks >= 60;

        Function<Person, String> f = person -> {
            int marks = person.marks;
            if (marks >= 80) {
                return "Distinction";
            } else if (marks >= 60) {
                return "First Class";
            } else if (marks >= 50) {
                return "Second Class";
            } else if (marks >= 45) {
                return "Third Class";
            } else {
                return "Fail";
            }
        };

        Consumer<Person> c = person -> {
            System.out.println("Name: " + person.name);
            System.out.println("Marks: " + person.marks);
            System.out.println("Grade: " + f.apply(person));
            System.out.println();
        };
        for (Person person : personArrayList) {
            if (p.test(person)) {
                c.accept(person);
            }
        }
    }

    private static void populate(ArrayList<Person> personArrayList) {
        personArrayList.add(new Person("Ashwini", 95));
        personArrayList.add(new Person("Johnny", 70));
        personArrayList.add(new Person("Rose", 55));
        personArrayList.add(new Person("Robbie", 30));
        personArrayList.add(new Person("Clayton", 65));
        personArrayList.add(new Person("Neal", 45));
    }

}