package com.codedifferentlty.labs.partD;

import java.util.HashMap;
import java.util.Map;

public class CityGuide {


    private Map<POI, Integer> areas;
    public CityGuide(){
        areas = new HashMap<>();
    }

    public Map<POI, Integer> getAreas() {
        // Return the current inventory map
        return areas;
    }
    public void addToAreas(POI poi, Integer rate) {
        // Get the current quantity of the specified product, defaulting to 0 if it doesn't exist in the inventory
        int currentRating = areas.getOrDefault(poi, 0);
        // Update the inventory by adding the specified amount to the product's current quantity
        areas.put(poi, rate);
    }



}
