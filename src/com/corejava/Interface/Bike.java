package com.corejava.Interface;

public class Bike implements Vehicle{


    @Override
    public void changeGear(int a) {
        System.out.println("changeGear");
    }

    @Override
    public void speedUp(int a) {
        System.out.println("speedUp");
    }

    @Override
    public void applyBrakes(int a) {
        System.out.println("applyBrakes");
    }
}
