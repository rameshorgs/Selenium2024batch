package com.corejava.Polymorpism;


import com.corejava.BaseClass;

public class PolyOverloading extends BaseClass {

    public void m1(String Name){
       print(Name);
    }

    public void m1(int sal){
        print(sal);
    }

    public void m1(int a , int b){
        print(a,b);
    }

    public void m1(String fname, String lname){
        System.out.println(fname+" "+lname);
    }

    public static void main(String[] args) {
        PolyOverloading pol=new PolyOverloading();

        pol.m1(10);
        pol.m1("ramesh");
        pol.m1(10,20);
        pol.m1("ramesh","Ponneri");
    }
}
