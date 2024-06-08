package com.corejava.Inheritanceex;

public class Stepfather extends Grandfather {

    public void ssproperty(){

        lands();
       money();
       name();

        System.out.println("Step sons property");
    }

    public static void main(String[] args) {
        Stepfather ste= new Stepfather();
        ste.ssproperty();
    }
}
