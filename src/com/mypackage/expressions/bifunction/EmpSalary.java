package com.mypackage.expressions.bifunction;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class EmpSalary {
    String name;
    int salary;

    public EmpSalary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class SalIncrement{
    public static void main(String[] args) {
        ArrayList<EmpSalary> employee = new ArrayList<>();
        BiFunction<String,Integer,EmpSalary> f = (name, salary) -> new EmpSalary(name, salary);
        employee.add(f.apply("Ashwini", 70000));
        employee.add(f.apply("Jamie", 80000));
        employee.add(f.apply("Mary",100000));

        BiConsumer<EmpSalary, Integer> c = (e,increment) -> e.salary = e.salary + increment;
        for(EmpSalary e: employee){
            c.accept(e,5000);
        }

        for(EmpSalary e: employee){
            System.out.println(e.name);
            System.out.println(e.salary);
        }
    }

}