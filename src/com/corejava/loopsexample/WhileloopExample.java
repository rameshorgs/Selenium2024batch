package com.corejava.loopsexample;

public class WhileloopExample {

    public void whileloopex(){

        int i=1;

        while (i<=10){

            System.out.println(i);

            i++;
        }
    }


    public  void dowhileex(){

        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i>=10);
    }

    public static void main(String[] args) {
        WhileloopExample whi=new WhileloopExample();
       // whi.whileloopex();
        whi.dowhileex();
    }
}


