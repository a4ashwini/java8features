package com.mypackage.expressions.predicate.employee;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String name;
    String role;
    long salary;
    String city;

    public Employee(String name, String role, long salary, String city) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.city = city;
    }

    @Override
    public String toString() {
        return "[" + name + " " + role + " " + salary + " " + city + " " + "]";
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<Employee>();
        populate(arrayList);

        Predicate<Employee> role = employee -> employee.role.contains("Manager");
        System.out.println("Mangers information: ");
        display(role, arrayList);

        System.out.println("***********************");
        System.out.println("");

        Predicate<Employee> city = employee -> employee.city.equals("Mangalore");
        System.out.println("Employees from Mangalore city: ");
        display(city, arrayList);

        System.out.println("***********************");
        System.out.println("");
        Predicate<Employee> salary = employee -> employee.salary < 20000;
        System.out.println("Employees salary less than 20000");
        display(salary, arrayList);

        System.out.println("***********************");
        System.out.println("");
        Predicate<Employee> transfer = employee -> employee.city.equals("Mysore");
        System.out.println("Employee is from Mysore AND has salary less than 20000: ");
        display(salary.and(transfer), arrayList);

        System.out.println("***********************");
        System.out.println("");
        System.out.println("Either employee is a manager OR has salary less than 20000: ");
        display(role.or(salary), arrayList);

        System.out.println("***********************");
        System.out.println("");
        System.out.println("Employees who are NOT managers: ");
        display(role.negate(), arrayList);
        //System.out.println(arrayList);
    }

    private static void display(Predicate<Employee> p, ArrayList<Employee> arrayList) {
        for (Employee e : arrayList) {
            if (p.test(e)) {
                System.out.println(e);
            }
        }
    }

    private static void populate(ArrayList<Employee> arrayList) {
        arrayList.add(new Employee("James", "Senior Technology Manager", 25000, "Mangalore"));
        arrayList.add(new Employee("Ashwini", "Senior Technology Manager", 25000, "Mangalore"));
        arrayList.add(new Employee("Jamie", "DevOps Manager", 1000, "Marvanthe"));
        arrayList.add(new Employee("Rimantas", "Accounts", 1000, "Bangalore"));
        arrayList.add(new Employee("Alan", "Senior Developer", 100000, "Mudipu"));
        arrayList.add(new Employee("Enver", "System Administrator", 15000, "Masthikatte"));
        arrayList.add(new Employee("Saddy", "Operations Manager", 15000, "Mysore"));

    }
}
