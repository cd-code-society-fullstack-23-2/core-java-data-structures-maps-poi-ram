package com.codedifferentlty.labs.partD;

public class MainPOIApp {
    public static void main(String[] args) {
        POI city1 = new POI("Wilmington", "1200 N French St", "A community educational building");
        POI city2 = new POI("Wilmington", "111 W 10th St", "DECO Wilmington");
        POI city3 = new POI("WWilmington", "608 N Market St", "Bardea Steak");
        System.out.print(city1.toString());
    }
}
