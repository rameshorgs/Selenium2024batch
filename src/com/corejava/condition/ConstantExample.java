package com.corejava.condition;

public class ConstantExample {

    static int a=10;

    int b=30;

    public void oneVal(){
        a=20;
        System.out.println(b);
    }

    public  void twoVal(){
        System.out.println(a);
        b=40;
        System.out.println(b);

    }

    public static void main(String[] args) {

        ConstantExample con=new ConstantExample();
        con.oneVal();
        con.twoVal();
        System.out.println(a);
    }
}
