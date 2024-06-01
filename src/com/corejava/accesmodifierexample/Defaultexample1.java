package com.corejava.accesmodifierexample;

public class Defaultexample1 {

    public static void main(String[] args) {
        Defaultexample1 def1= new Defaultexample1();

        Defaultexample def=new Defaultexample();

        def.m1();

        def.m2();

        Defaultexample.m3();

        System.out.println(Defaultexample.b);



    }
}
