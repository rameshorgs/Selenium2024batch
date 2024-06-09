package com.corejava.thisKeyword;

public class Thisex1 {

    int roll; // instance Vaiables an global to Class
    String sname;
    float fee;

    Thisex1(int roll,String sname,float fee){

        this.roll=roll;
        this.sname=sname;
        this.fee=fee;
    }

    void display(){
        System.out.println(roll+" "+sname+" "+fee);
    }

    public static void main(String[] args) {
        Thisex1 thi=new Thisex1(123,"Altaf",500);
        thi.display();
    }


}
