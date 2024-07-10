package com.corejava.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {
        TreeSet<String> ll= new TreeSet<>();

        ll.add("Ramesh");

        ll.add("Ramesh");

        ll.add("Hussian");

        ll.add("Anusha");

        System.out.println(ll);

        Set<String> ll1= new TreeSet<>();

        ll1.add("Ramesh");

        ll1.add("Ramesh");

        ll1.add("Hussian");

        ll1.add("Anusha");



        System.out.println(ll1);

        HashSet<String> hs=new HashSet<String>();

        hs.add("ramesh");
        hs.add("suresh");
        hs.add("ramesh");

        System.out.println(hs);

    }
}
