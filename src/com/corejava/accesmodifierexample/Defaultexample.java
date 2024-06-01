package com.corejava.accesmodifierexample;

 class Defaultexample {

     int a =10;

     static int  b=20;

     void m1(){
         System.out.println("calling the m1 method"+a);
     }

     void m2(){
         System.out.println("calling the m2 method+"+b);
     }

     static void m3(){
         System.out.println("calling the static m3 method");
     }


}

class defaultsubclass{
    public static void main(String[] args) {
        System.out.println(Defaultexample.b);
    }
}