package com.codedifferentlty.labs.partD;


import java.util.*;

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
                areas.put(poi, newRate);
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

    // Display Points of Interest (POIs) along with their rates.
    public String displayPOIs(Map<POI, Rate> POIList) {
        String message = ""; // Initialize an empty message
        // Creating a list of entries from the areas map, which can then be sorted or iterated
        List<Map.Entry<POI, Rate>> entryList = new ArrayList<>(areas.entrySet());

        // Sorting the entryList based on the keys of the Map.Entry objects in ascending order
        Collections.sort(entryList, new Comparator<>() {
            // Using a custom comparison defined by the Comparator, implemented as an anonymous inner class.
            // Comparing keys of two entries and using compareTo method in Comparable to sort
            @Override
            public int compare(Map.Entry<POI, Rate> o1, Map.Entry<POI, Rate> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        // Iterate over the sorted entries and build the message
        for (Map.Entry<POI, Rate> entry : entryList) {
            // Build the message with the POI name and its average rate
            message = entry.getKey().toString() + " (" + entry.getValue().getAverage() + ")";
            System.out.println(message);// Print the message to the console
        }
        return message;
    }

}
