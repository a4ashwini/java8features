package com.mypackage.expressions.function;

import java.util.ArrayList;
import java.util.function.Function;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Result {

    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        populate(studentArrayList);
        Function<Student, String> grade = Student -> {
            int marks = Student.marks;
            if (marks >= 80 && marks < 100) {
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
        for (Student s : studentArrayList) {
            System.out.println("Name: " + s.name);
            System.out.println("Marks: " + s.marks);
            System.out.println("Grade: " + grade.apply(s));
            System.out.println("");
        }

    }

    private static void populate(ArrayList<Student> studentArrayList) {
        studentArrayList.add(new Student("Ashwini", 95));
        studentArrayList.add(new Student("Johnny", 70));
        studentArrayList.add(new Student("Rose", 55));
        studentArrayList.add(new Student("Robbie", 30));
        studentArrayList.add(new Student("Clayton", 65));
        studentArrayList.add(new Student("Neal", 45));
    }

}