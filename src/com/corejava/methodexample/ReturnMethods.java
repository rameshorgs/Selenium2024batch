package com.corejava.methodexample;

public class ReturnMethods {

    public static String shopkeeper(){

        String item="Mangos";

      //  System.out.println("Selling goods");
        return item;
    }

    public static int custometer(){

        int price=100;

      //  System.out.println("buying goods");
        return price;
    }

    public  static char customerintial(){

        char intial='M';

        return intial;
    }

    public static String intial(String intial){

    return intial;

    }

    public static String firstname(String Fname){

        return Fname;

    }

    public static void market(){

        System.out.println("shopkeeper selling the "+shopkeeper()+" and customer paying the "+custometer()+" Customer name witb the intial of "+customerintial());
      //  System.out.println("sdgsdgs "+sample()); //error

        System.out.println("my name is "+ intial("Ponneri")+" "+firstname("Ramesh"));
        System.out.println("my name is "+ intial("Altaf")+" "+firstname("Hussian"));
        System.out.println("my name is "+ intial("O")+" "+firstname("Anusha"));
        System.out.println("my name is "+ intial("O")+" "+firstname("Kiran"));
    }




    public static void main(String[] args) {

        market();
    }
}
