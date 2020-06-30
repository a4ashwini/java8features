package com.mypackage.expressions.collections;

import java.util.TreeMap;

public class SortMapTree {

    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<Integer, String>(
                (treeMap1,treeMap2) -> (treeMap2-treeMap1)
        );
        treeMap.put(3,"Akshata");
        treeMap.put(2,"Vidya");
        treeMap.put(1,"Shrikanth");
        treeMap.put(6,"Pilli");
        treeMap.put(5,"Anoosha");
        treeMap.put(4,"Ashwini");

        System.out.println("Elements in TreeMap = "+treeMap);
    }
}
