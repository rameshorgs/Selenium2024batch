package com.corejava.stringex;

public class StringBufferex {



    public static void main(String[] args) {
        String lname ="Ponneri";

        StringBuffer sb= new StringBuffer("Ramesh");

        StringBuffer name= sb.append(lname);



        StringBuffer xname=name.append("trainter");
        System.out.println(xname.reverse());



        // String is immutable


        String lnam1="o";

        String fname="Kiran";


        System.out.println(lnam1.concat(fname));
    }
}
