package com.mypackage.expressions.collections;

import java.util.Collections;
import java.util.TreeSet;

public class SortTree {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>((treeSet1,treeSet2) -> treeSet2-treeSet1);
        treeSet.add(5);
        treeSet.add(75);
        treeSet.add(15);
        treeSet.add(55);
        treeSet.add(95);

        System.out.println("TreeSet elements with lambda sort" +treeSet);

        //Collections.sort(treeSet);
    }
}
