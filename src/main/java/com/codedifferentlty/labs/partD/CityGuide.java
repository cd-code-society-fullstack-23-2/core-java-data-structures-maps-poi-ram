package com.codedifferentlty.labs.partD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CityGuide {


    private Map<POI, ArrayList<Integer>> areas;
    public CityGuide(){
        areas = new HashMap<>();
    }

    public Map<POI, ArrayList<Integer>> getAreas() {
        return areas;
    }

    public void addToAreas(POI poi, Integer rate) {
        ArrayList<Integer> ratings;
        ratings = (areas.containsKey(poi))? areas.get(poi): new ArrayList<>();
        ratings.add(rate);
        areas.put(poi, ratings);
    }
    public void removeFromAreas(POI poi, Integer rate) {
        areas.remove(poi);
    }
    public void removePOI(){

    }


}
