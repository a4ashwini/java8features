package com.mypackage.expressions.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeObject {

    int eNumber;
    String eName;

    public SortEmployeeObject(int eNumber, String eName) {
        this.eNumber = eNumber;
        this.eName = eName;
    }

    @Override
    public String toString() {
        return "EmployeeObject{" +
                "eNumber=" + eNumber +
                ", eName='" + eName + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        ArrayList<SortEmployeeObject> emp = new ArrayList<SortEmployeeObject>();
        emp.add(new SortEmployeeObject(3,"Anoosha"));
        emp.add(new SortEmployeeObject(1,"Akshata"));
        emp.add(new SortEmployeeObject(2,"Ashwini"));
        System.out.println("Before sorting: "+emp);
        Collections.sort(emp,(emp2,emp1) ->(emp2.eNumber - emp1.eNumber));
        System.out.println("Customised Sorting with Lambda: "+emp);
    }
}
