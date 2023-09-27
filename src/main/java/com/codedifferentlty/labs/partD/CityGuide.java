package com.codedifferentlty.labs.partD;


import java.util.HashMap;
import java.util.Map;

public class CityGuide{


    private Map<POI, Rate> areas;
    public CityGuide(){
        areas = new HashMap<>();
    }

    public Map<POI, Rate> getAreas() {
        if(areas.isEmpty()){
            System.out.println("List is empty. Please add POIs.");
        }
        return areas;
    }

    public void addToPOI(POI poi) {
        Rate rate = new Rate();
        areas.put(poi, rate);
    }

    public void addRate(String name, Double rate) {
        for (POI poi : areas.keySet()) {
            if (poi.getName().equals(name)) {
                Rate newRate = areas.get(poi);
                newRate.addRating(rate);
                areas.put(poi, areas.get(poi));
                return;
            } }
        throw new POINotFoundException("This POI is not found.");

    }

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
                System.out.println(areas.get(poi).getAverage());
                return;
            }}
        throw new POINotFoundException("This POI is not found.");

    }

    public void displayPOIs(Map<POI, Rate> POIList) {
        for (Map.Entry<POI, Rate> entry : POIList.entrySet()) {
            System.out.println(entry.getKey().toString() + " (" + entry.getValue().getAverage() + ")");
        }
    }

}
