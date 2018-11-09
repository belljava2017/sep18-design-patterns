package com.bellinfo.designpattern.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightAndHotelFacade {


     Map<List<Flight>,List<Hotel>> getFlightAndHotelInfo(Date from, Date to){
         FlightInfo finfo = new FlightInfo();
         List<Flight> flightList = finfo.getFlightDetails();

         HotelInfo hinfo = new HotelInfo();
         List<Hotel> hotelList = hinfo.getHotelDetails();

         Map<List<Flight>, List<Hotel>> map = new HashMap<>();
         map.put(flightList,hotelList);

         return map;

    }




}
