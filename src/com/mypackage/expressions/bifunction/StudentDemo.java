package com.mypackage.expressions.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class StudentDemo {
    String name;
    int rollNo;

    public StudentDemo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<StudentDemo> student = new ArrayList<>();
        BiFunction<String, Integer, StudentDemo> f = (name, rollNo) -> new StudentDemo(name, rollNo);
        student.add(f.apply("Ashwini", 5));
        student.add(f.apply("Jammie", 3));

        for (StudentDemo s : student) {
            System.out.println(s.name);
            System.out.println(s.rollNo);
        }
    }
}