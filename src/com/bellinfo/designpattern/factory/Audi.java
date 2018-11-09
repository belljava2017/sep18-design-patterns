package com.bellinfo.designpattern.factory;

public class Audi implements Car{
    @Override
    public void getModels() {
        System.out.println("Audi Models -> A4, A3, A8");
    }
}
