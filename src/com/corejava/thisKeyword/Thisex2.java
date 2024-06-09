package com.corejava.thisKeyword;

public class Thisex2 {


    void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
        this.m1();  // m1()

    }

    public static void main(String[] args) {
        Thisex2 thi2=new Thisex2();
        thi2.m2();
    }
}
