package com.corejava.constructorex;

public class Constructorex {

    public void m1(){
       System.out.println("m1");
    }

    public void m2(){
        System.out.println("m2");
    }

    public Constructorex(){
        System.out.println("Default parameterized Constructor");
    }

     Constructorex(int a){
        System.out.println(" Parameterized Constructor "+a);

    }

    Constructorex(String a){
        System.out.println(" Parameterized Constructor "+a);
    }

    Constructorex(boolean a){
        System.out.println(" Parameterized Constructor "+a);
    }

    Constructorex(String lname,String fname){
        System.out.println(" Parameterized Constructor "+lname+" "+fname);
    }

    public static void main(String[] args) {

        Constructorex con= new Constructorex("Ponneri","Ramesh");
        con=new Constructorex(10);
        con=new Constructorex("Altaf");
        con=new Constructorex(true);
        con=new Constructorex(20);
        con=new Constructorex(30);

    }
}
