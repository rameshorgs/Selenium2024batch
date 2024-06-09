package com.corejava.thisKeyword;

public class Thisex5 {

    Thisex5 getmsg(){
        return this;
    }

    void msg(){
        System.out.println(" Dis play the message ");
    }

    void msg1(){
        System.out.println(" Dis 1v play the message ");
    }

    public static void main(String[] args) {
        new Thisex5().getmsg().msg();
        new Thisex5().getmsg().msg1();
    }
}
