package com.corejava.methodexample;

public class MethodsEx {

    public static void m1(){  // default parameterized method
        System.out.println(" print m1 method");
    }

    public static void m2(int a){
        System.out.println(" print single parameter method"+a);
    }

    public static void m3(int a,int b,int c){
        System.out.println(" print multiple parameter method"+a);
        System.out.println(" print multiple parameter method"+b);
        System.out.println(" print multiple parameter method"+c);

        int vsum;

        vsum=a+b-c;

        System.out.println(vsum);
    }

    public static void main(String[] args) {

        m1();

        m2(10);

        m3(10,20,30);
    }

}
