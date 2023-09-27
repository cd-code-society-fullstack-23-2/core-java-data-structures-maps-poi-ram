package com.codedifferentlty.labs.partD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CityGuideTest {
    private POI poi1;
    private POI poi2;
    private CityGuide cityGuide;
    private Rate rate;

    @BeforeEach
    public void setUp(){
        poi1 = new POI("Wilmington", "1200 N French St", "A community education building");
        poi2 = new POI("Bruh", "Cuh", "Duh");

        cityGuide = new CityGuide();
        Rate rate = new Rate();
    }
    @Test
    public void testAddAreas(){
        cityGuide.addToPOI(poi1);
        cityGuide.addRate("Wilmington", 5.0);
        String actual = poi1.getName();
        String expected = "Wilmington";
        cityGuide.searchByName("Wilmington");
        assertEquals(expected, actual);
       ;

    }

    @Test
    public void testAddRate01(){
        Rate rate = new Rate();
        rate.addRating(5.0);
        cityGuide.addToPOI(poi1);
        cityGuide.addRate("Wilmington",5.0);
        cityGuide.addRate("Wilmington",5.0);
        String actual = rate.getAverage();
        String expected = "Rating: 5.0/5 by 1 users.";
        assertEquals(expected, actual);

    }

    @Test
    public void searchForAPOIByName() {
        cityGuide.addToPOI(poi1);
        String actual = poi1.getName();
        String expected = "Wilmington";
        cityGuide.searchByName("Wilmington");
        assertEquals(expected, actual);
    }

    @Test
    public void testDisplayList01(){
        cityGuide.addToPOI(poi1);
        cityGuide.addToPOI(poi2);
        cityGuide.displayPOIs(cityGuide.getAreas());

        String expected = "Wilmington - 1200 N French St - A community education building \n Bruh - Cuh - Duh";

        assertEquals(expected, cityGuide.displayPOIs(cityGuide.getAreas()));

    }

    @Test
    public void testDeletePOI(){
        cityGuide.addToPOI(poi1);
        cityGuide.addToPOI(poi2);
        cityGuide.removeFromAreas("Wilmington");
        cityGuide.searchByName("Wilmington");

        assertEquals(null, cityGuide.getAreas());


    }
}
