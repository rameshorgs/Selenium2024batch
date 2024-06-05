package com.corejava.loopsexample;

public class Loopsexample {

    public void forloopexample(){
        int i;
        for( i=0;i<=10;i++){
            System.out.println("print the no of iterations "+i);
        }

        for( i=0;i<=10;i++){
            System.out.println(i+" ");
        }
    }

    public static void main(String[] args) {
        Loopsexample loo= new Loopsexample();
        loo.forloopexample();
    }
}
