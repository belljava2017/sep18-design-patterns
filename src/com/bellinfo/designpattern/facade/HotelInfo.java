package com.bellinfo.designpattern.facade;

import java.util.ArrayList;
import java.util.List;

public class HotelInfo {

    public List<Hotel> getHotelDetails(){

        ArrayList<Hotel> hlist = new ArrayList<>();
        hlist.add(new Hotel("Motel6", "Sterling"));
        hlist.add(new Hotel("Suite Inn", "Ash Burn"));
        hlist.add(new Hotel("Hilton", "Fairfax"));
        return hlist;
    }
}
