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

    public void displayPOIs(Map<POI, Integer> POIList) {
        // Iterate through each item in the inventory map
        for (Map.Entry<POI, Integer> entry : POIList.entrySet()) {
            // Print the product name (key) and its quantity (value)
            System.out.println(entry.toString() + "(Rating " + entry.getValue() + "/5)");
        }
    }
}
