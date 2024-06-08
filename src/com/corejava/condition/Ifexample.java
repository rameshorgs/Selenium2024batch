package com.corejava.condition;

public class Ifexample {



    public void ifelseexample(){
        int a=35;

        int b=60;

        int c=70;
        if(c>75)

            if(a>35){
                System.out.println("Pass");
            } else if (b>60) {
                System.out.println("first class");
            } else if (c<70) {
                System.out.println("Distinction class");

            }else{
                System.out.println("Fail");
            }

    }

    public void ififexample(){

        int a=35;

        int b=60;

        int c=70;

        if(c>75)
            if(a<45){
                if (b<70){
                    System.out.println("Pass");
                }else{
                    System.out.println("Fail");
                }

            } else if (b>60) {
                System.out.println("first class");
            } else if (c<70) {
                System.out.println("Distinction class");
            }else{
                System.out.println("Fail");
            }
    }

    public static void main(String[] args) {


    }
}
