package com.corejava.castingex;

public class CastingEx {


    //byte short int long float double
    //char boolean
    public static void widetypecasting(){

       int i=10;

       double d=i;

       System.out.println("Widening type casting ");

    }


    public static void narrowtypecasting(){

        long d=10000l;

        int i= (int) d;

        long data=1000000000000000000l;

        short s=(short)data;

        System.out.println(s);

        System.out.println("Narrow type casting "+i);

    }

    public static void convertinttostring(){

       int i=100;

       String data=String.valueOf(i);

        System.out.println("Narrow type casting "+(data+100));

    }

    public static void convertStringtoInt(){

       String value="200";

        int i=Integer.parseInt(value);

        System.out.println("Narrow type casting "+(i+100));

    }

    public static void main(String[] args) {
        convertinttostring();
        convertStringtoInt();
        narrowtypecasting();
        widetypecasting();

    }
}
