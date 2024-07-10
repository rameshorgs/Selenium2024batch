package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> li  = new ArrayList<>();

        ArrayList<String> al=new ArrayList<>();

        li.add("Ramesh");
        li.add("Ramesh");
        li.add("hussan");

        al.add("ramesh");
        al.add("ramesh");
        al.add("Samesh");



        System.out.println(al);

        System.out.println(li.size());
        System.out.println(al.size());

        li.remove(1);
        li.addAll(al);
        li.addFirst("ANUSHA");
        li.addLast("Ramesh");


        System.out.println(li);

        for(String names:li){
            System.out.println(names);
        }

    }
}
