package com.corejava.accesmodifierexample;

public class Publicexample {

    public int sal=20;

    public String name="Kiran";

    public static String kiranwife="Sreeleeela";

    public void setSal() {
       System.out.println(sal);

       System.out.println(name);
    }

    public static void geSal() {
        System.out.println(kiranwife);

        System.out.println(kiranwife);
    }

    public static void main(String[] args) {
        Publicexample pub=new Publicexample();
        pub.setSal();
        System.out.println(kiranwife);
    }
}
