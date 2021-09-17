package com.bridgelabz.collection;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet= new HashSet<Integer>();
        hashSet.add(60);//add method : it adds values randomly to list
        hashSet.add(30);
        hashSet.add(80);
        hashSet.add(3);
        System.out.println(hashSet);
        hashSet.remove(3);//remove method: specify value to remove it from list and not its index
        System.out.println(hashSet);
    }

}
