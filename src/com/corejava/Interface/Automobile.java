package com.corejava.Interface;

public class Automobile {

    public static void main(String[] args) {
        Bike bik=new Bike();
        bik.changeGear(1);
        bik.applyBrakes(2);
        bik.speedUp(3);

        Car car=new Car();
        car.applyBrakes(1);
    }


}
