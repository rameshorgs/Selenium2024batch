package com.corejava.Operators;

public class Operatorexample {


    int a=10; //global variable
    int b=20;
    int c=30;

    int sum,diff,sub,mul,div;

    String fathersname="Narasimha";

    String fatherRole="Hero";

    int age=50;

    String sonName="Ramesh Reddy";

    public void family(){

        System.out.println(sonName+" fathername is "+fathersname+" and his age is "+age +" and played role as "+fatherRole);
    }

    public void addition(){

        sum=a+b;

        System.out.println(sum);

        System.out.println("a+b");

        System.out.println("a+b"+a+b); //Concat ==combining of some values

        System.out.println("a+b"+(a+b));


        sub=c-a;

        mul=c*a;

        diff=b%a;

        div=b/a;

        System.out.println(div);

        System.out.println(diff);


    }

    public void logical(){

        boolean val1=a>b; //false
        boolean val2=a<c; //true
        boolean val3=a<b; //true
        boolean val4=c<a; //false

        System.out.println(val1?val2:a);

        System.out.println(val1&&val2); //false

        System.out.println(val1&&val4); //false

        System.out.println(val2&&val3); //true

        System.out.println(val1||val2); //true

        System.out.println(val1||val4); //false

        System.out.println(val2||val1); //true

        System.out.println(val1!=val2);

        System.out.println(a|b); // will explain tommarow



    }


    public void unaryOperators(){
int a=10;
int b=10;
int c=10;
int d=10;
        System.out.println(a++); //10

        System.out.println(++b); //11

        System.out.println(c--); //10

        System.out.println(--d); //9
    }


    public static void main(String[] args) {
        Operatorexample op=new Operatorexample();

        op.addition();
        op.logical();
        op.unaryOperators();
        op.family();

        int x=50;
        int y=2;
        System.out.println(~10); //-11
    }
}
