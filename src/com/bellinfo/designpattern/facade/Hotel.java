package com.bellinfo.designpattern.facade;

public class Hotel {
    String name;
    String location;

    public Hotel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
