package com.corejava.Exceptionex;

public class Exceptionex {

    public static  void  erroex(int i){

        while(i!=0){
            i=i+1;
            System.out.println(i);
            erroex(i);

        }
    }


    public static  void  exceptionex(){

       int i=100;
       int j=0;

       try {
           int x=i/j;
           System.out.println(x);
       }catch (Exception e){
          // int x=i/j;
           System.out.println(e.getLocalizedMessage());
       }finally {
           System.out.println("Ramesh come out of exception");
       }

    }


    public static void trowex(){

        System.out.println("before throw");

        throw  new ArithmeticException("trying to print / zero value ");

      //  System.out.println("After throw");
    }

    public static void main(String[] args) {
     //   erroex(20);
        exceptionex();
        trowex();
    }
}
