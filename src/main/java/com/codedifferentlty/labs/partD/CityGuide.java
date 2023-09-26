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
        if(areas.isEmpty()){
            System.out.println("List is empty. Please add POIs.");
        }
        return areas;
    }

    public void addToPOI(POI poi, Double rate) {
        areas.put(poi, rate);
}

    public void addRate(String name, Double rate) {
        for (POI poi : areas.keySet()) {
            if (poi.getName().equals(name)) {
                areas.put(poi, rate);
                return;
            } }
        throw new POINotFoundException("This POI is not found.");

    }


//        ArrayList<Double> ratings;
//        ratings = (areas.containsKey(poi))? areas.get(poi): new ArrayList<>();
//        ratings.add(rate);
//        areas.put(poi, ratings);


    public void removeFromAreas(String name) {
        for (POI poi : areas.keySet()) {
            if (poi.getName().equals(name)) {
                areas.remove(poi);
                return;
            }}
        throw new POINotFoundException("This POI is not found.");
}



    public void searchByName(String name) {
        for (POI poi : areas.keySet()) {
            if (poi.getName().equals(name)) {
                System.out.println("\nDetails:");
                System.out.println("-------");
                System.out.println("Name: " + poi.getName());
                System.out.println("Address: " + poi.getAddress());
                System.out.println("Description: " + poi.getDescription());
                System.out.println("Rating: " + areas.get(poi) + "/5");
                return;
            }}
        throw new POINotFoundException("This POI is not found.");

    }

    public void displayPOIs(Map<POI, Double> POIList) {
        for (Map.Entry<POI, Double> entry : POIList.entrySet()) {
            System.out.println(entry.getKey().toString() + "  (Rating " + entry.getValue() + "/5)");
        }
    }
}
