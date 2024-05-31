package com.corejava.variableswithdatatypes;

class Datatypeexample {

    int value =10;

    int age =30;

    long adhar=9596633333l;

    char intial='P';

    String name="ponneri ramesh";

    float sal=200.25f;

    double laptopprice=200.456d;

    void m1(){
        System.out.println(age);
    }

    void m2(){
        System.out.println(name);
    }

    public static void main(String[] args) {

        System.out.println("Anusha unmuting the class always without any reason ");

        Datatypeexample da=new Datatypeexample();   //we can create a Object

       // new Datatypeexample();   da is the reference

        da.m1();

        da.m2();

        System.out.println("age "+da.value);

        System.out.println("intial "+da.intial);

        System.out.println("adhar "+da.adhar);

    }


}
