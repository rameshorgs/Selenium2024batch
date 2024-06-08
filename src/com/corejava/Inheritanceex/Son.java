package com.corejava.Inheritanceex;

public class Son extends Father{

    public void sproperty(){
        gfproperty();
        values();
    }

    public static void main(String[] args) {
        Son son= new Son();
        son.sproperty();
    }
}
