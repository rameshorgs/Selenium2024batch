package com.corejava.thisKeyword;

public class Thisex3 {
    Thisex3(){
        System.out.println(" default constructor Method ");
    }

    Thisex3(int a){
        this();
        System.out.println(" Parameterized constructor Method ");

    }

    Thisex3(String sname){
        this(10);
    }

    public static void main(String[] args) {
        Thisex3 th3= new Thisex3("Ramesh");
     //   th3=new Thisex3();

    }
}
