package com.corejava.arrayexample;

public class ArraysExample {

    int arr1[]; //declaration of array

    int arr2[]={1,2,3,4,5,6}; //declare and intialization of array

    static int[] arr =new int[6];


    public void arrayex1(){
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=20;
        arr[4]=50;
        arr[5]=60;
        //arr[6]=70;

        System.out.println(arr.length);

        for (int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }

    }

    public void foreachloop(){
        String arr4[]={"Ramesh","Altaf","anusha","Kiran"};

        for(String name:arr4){
            System.out.println(name);
        }

    }

    public static void main(String[] args) {

        ArraysExample arr1=new ArraysExample();
        arr1.arrayex1();

        arr1.foreachloop();
    }

}
