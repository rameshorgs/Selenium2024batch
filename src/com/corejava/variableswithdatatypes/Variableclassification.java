package com.corejava.variableswithdatatypes;

public class Variableclassification {

    int value=10; // instance Variable

    static int salary=500000; //static variable global variable

    void son1(){ // instance method
        Variableclassification var1=new Variableclassification();

        String wifename ="Samantha"; // local variable

        String s1="Avirup"; // local variable

        System.out.println(wifename);

        System.out.println(s1);

        System.out.println(val1);

      System.out.println(value);
      System.out.println(var1.value);

      System.out.println(salary);
    }

    static void elderson(){
        System.out.println(" All access after the father ");
    }

    String val1="200";

    public static void main(String[] args) {
        Variableclassification var=new Variableclassification();

        System.out.println(var.value);

        System.out.println(salary);

        var.son1();

        elderson();
    }


}
