package com.corejava.Inheritanceex;

public class ISArelationinhertance {

    int a=50;
    String sname="Ramesh";


    void m1(){
        System.out.println(" print m1");
    }

    void m2(){
        System.out.println("m1");
    }
}

class ISArelationinhertance1 extends  ISArelationinhertance{

    public static void main(String[] args) {
        ISArelationinhertance1 is= new ISArelationinhertance1();

        is.m1();
        is.m2();
    }
}


