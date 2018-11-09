package com.bellinfo.designpattern.factory;

public class Demo {
    public static void main(String[] args) {

        CarMax carMax = new CarMax();
        Car car = carMax.getCar("Audi");
        car.getModels();


    }
}
