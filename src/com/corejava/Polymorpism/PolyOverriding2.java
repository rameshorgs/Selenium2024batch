package com.corejava.Polymorpism;

public class PolyOverriding2 extends PolyOverriding {
    public void m1(String name){
       System.out.println("m2");
       print(name);
    }

    public static void main(String[] args) {
        PolyOverriding ply2=new PolyOverriding();
        ply2.m1("method in second extend class");
    }

}
