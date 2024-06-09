package com.corejava.superex;

public class Superex1  extends  Superex{

    String color="black";


     Superex1(){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }

    Superex1(int a){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        Superex1 sup1= new Superex1();


    }
}
