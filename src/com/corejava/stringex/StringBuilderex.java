package com.corejava.stringex;

public class StringBuilderex {
    //Stringbuffer is mutable

    //string builder is not synchronized

    //String builder is faster than  string Buffer



    public static void main(String[] args) {
        String lname ="Ponneri";

        StringBuilder sb= new StringBuilder("Ramesh");

        StringBuilder name= sb.append(lname);



        StringBuilder xname=name.append("trainter");
        System.out.println(xname.reverse());



        // String is immutable


        String lnam1="o";

        String fname="Kiran";


        System.out.println(lnam1.concat(fname));
    }
}
