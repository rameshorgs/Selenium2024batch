package com.corejava.thisKeyword;

public class ThisEx4 {

    void m1(ThisEx4 thi){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
        m1(this);

    }

    public static void main(String[] args) {
       ThisEx4 th4=new ThisEx4();

       th4.m2();
    }
}
