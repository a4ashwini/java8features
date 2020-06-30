package com.mypackage.expressions.collections;

import java.util.ArrayList;
import java.util.Collections;

class MyComparator {

    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(0);
        list.add(25);
        list.add(15);
        list.add(30);
        System.out.println("Before sorting:"+list);

        Collections.sort(list);
        System.out.println("After sorting: "+list);

        Collections.sort(list,(list1,list2) -> (list2-list1));
        //Collections.sort(list,(list1,list2) -> (list2.compareTo(list1)));
        System.out.println("Sorting with Lambda" +list);

    }
}