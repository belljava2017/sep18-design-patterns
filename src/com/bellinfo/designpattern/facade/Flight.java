package com.bellinfo.designpattern.facade;

public class Flight {
    private int no;
    private String name;

    public Flight(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
