package com.codedifferentlty.labs.partD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CityGuide {


    private Map<POI, Double> areas;
    public CityGuide(){
        areas = new HashMap<>();
    }

    public Map<POI, Double> getAreas() {
        return areas;
    }

    public void addToPOI(POI poi, double rating) {

        double currentRating = areas.getOrDefault(poi, 0.0);
        areas.put(poi, currentRating + rating);
    }

//    public void addToAreas(POI poi, Integer rate) {
//        ArrayList<Integer> ratings;
//        ratings = (areas.containsKey(poi))? areas.get(poi): new ArrayList<>();
//        ratings.add(rate);
//        areas.put(poi, ratings);
//    }

    public void removeFromAreas(POI poi, Integer rate) {
        areas.remove(poi);
    }



}
