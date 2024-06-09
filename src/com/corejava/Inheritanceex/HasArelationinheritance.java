package com.corejava.Inheritanceex;

public class HasArelationinheritance {

    int a=50;
    String sname="Ramesh";


    void m1(){
        System.out.println(" print m1");
    }

    void m2(){
        System.out.println("m1");
    }
}

class HasArelationinheritance1{ // Association

    public static void main(String[] args) {
        HasArelationinheritance has=new HasArelationinheritance();
        has= new HasArelationinheritance();

        System.out.println(has.a);
        System.out.println(has.sname);
        has.m1();
    }

}
