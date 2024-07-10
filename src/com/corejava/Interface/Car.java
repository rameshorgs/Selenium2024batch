package com.corejava.Interface;

public class Car implements Vehicle,VehicleFeature{

    @Override
    public void changeGear(int a) {
        System.out.println("changeGear");
    }

    @Override
    public void speedUp(int a) {
        System.out.println("changeGear");
    }

    @Override
    public void applyBrakes(int a) {
        System.out.println("changeGear");
    }

    @Override
    public void headlight(int a) {
        System.out.println("changeGear");
    }

    @Override
    public void stearing(int a) {
        System.out.println("changeGear");
    }

    @Override
    public void autogear(int a) {
        System.out.println("changeGear");
    }
}
