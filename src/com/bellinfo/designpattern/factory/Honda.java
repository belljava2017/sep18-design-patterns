package com.bellinfo.designpattern.factory;

public class Honda implements Car{
    @Override
    public void getModels() {
        System.out.println("Honda models -> Accord, Civic");
    }
}
