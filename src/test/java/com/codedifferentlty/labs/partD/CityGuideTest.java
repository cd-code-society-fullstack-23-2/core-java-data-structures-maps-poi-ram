package com.codedifferentlty.labs.partD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityGuideTest {
    private POI poi1;
    private CityGuide cityGuide;

    @BeforeEach
    public void setUp(){
        poi1 = new POI("Wilmington", "1200 N French St", "A community education building");
        cityGuide = new CityGuide();
    }
    @Test
    public void testAddAreas(){
        cityGuide.addToPOI(poi1, 5);


        assertEquals(5, cityGuide.getAreas().get(poi1));


    }
}
