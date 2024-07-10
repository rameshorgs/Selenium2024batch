package com.corejava.abstarction;

public class SBIBank extends RBIBank{


    @Override
    public void getintrestrate() {
        System.out.println("SBI Intrest rate");
    }

    @Override
    public void getloan() {

    }

    public void display(){
        banknorms();
    }
}
