package com.corejava.accesmodifierexample;

public class ProtectedExample {

    protected int val=100;

    protected  String name="Ram Charan";

    public static  int val2=200;

    protected  void m1(){
        System.out.println(val);
    }

    public void m2(){
        System.out.println(val);
    }


}

class Subclass1 {

    public static void main(String[] args) {
        System.out.println(ProtectedExample.val2);
    }
}
