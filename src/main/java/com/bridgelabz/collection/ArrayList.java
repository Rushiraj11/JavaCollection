package com.bridgelabz.collection;

import java.util.AbstractList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> arraylist = new java.util.ArrayList<Integer>();

            arraylist.add(1); // add method
            arraylist.add(2);
            arraylist.add(5);
            arraylist.add(3);
            arraylist.set(0,100); //set method :specify index and then element value
        System.out.println(arraylist);
        arraylist.add(2, 20);
        System.out.println("list1:" +arraylist);
        List<Integer> arraylist2 = new java.util.ArrayList<Integer>();
        arraylist2.addAll(arraylist);
        arraylist2.add(60);
        System.out.println("list2:" + arraylist2);
        arraylist2.remove(5); // remove method: removes index value from list
        System.out.println("list2:" + arraylist2);
        System.out.println(arraylist.contains(100) );// contains method :to check if value is present in list or not
        arraylist.clear();
        System.out.println(arraylist);
        }
    }

