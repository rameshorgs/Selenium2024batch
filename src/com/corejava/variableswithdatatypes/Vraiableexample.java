package com.corejava.variableswithdatatypes;


class Vraiableexample {  // Variables is the class identifier

    //Default access specifier  is nothing but public to the complete current class

    //We can write n number of main methods in a class but the arguments should be different

    //Variable is just a user Defined value : for example : name , number,value.....etc .

    //Keyword is predefined word defined by java : for example : public,static,this,super............extc

    //We should not use variable as a keyword .

    //Types of Variable====three types

    /*
     * local Variable instance Variable static variable
     */


    int num = 10; //num is the variable   =====this statement is called initialization == instance variable and local variable for the class

    int num1;   //num1 is the identifier and fully qualified identifier ======this statement is declaration

    static int num2 = 20;  // static variable no need of  instance


    public void localVariableM1() {
        int num = 10; // local Variable
        System.out.println(" i am local " + num);   // calling of local variable

    }

    public static void main(String[] args) {

        Vraiableexample var = new Vraiableexample();

        System.out.println(var.num);  // calling of instance  variable  and which is not a static that is instance

        System.out.println(" Hello world ");
    }


}

