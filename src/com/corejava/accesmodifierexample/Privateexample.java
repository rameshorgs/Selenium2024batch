package com.corejava.accesmodifierexample;

public class Privateexample {

    private int id=10;

    private  String name="locker";

    private static boolean ans=true;

    private void m1(){
        System.out.println(id);
        System.out.println(name);
        System.out.println("2256");
        System.out.println(ans);
    }

    private static void m2(){
        System.out.println(ans);
    }

    public  void m3(){
        System.out.println(id);
        m1();
    }

    public static void main(String[] args) {

    }
}
