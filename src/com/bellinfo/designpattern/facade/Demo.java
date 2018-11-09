package com.bellinfo.designpattern.facade;

import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        FlightAndHotelFacade facade = new FlightAndHotelFacade();
        System.out.println(facade.getFlightAndHotelInfo(new Date(), new Date(new Date().getTime() + (7 *  1000 * 60 * 60 * 24))));


    }
}
