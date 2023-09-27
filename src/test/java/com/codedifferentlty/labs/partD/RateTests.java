package com.codedifferentlty.labs.partD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class RateTests {

    @Test
    public void getAverage(){
        Rate rate = new Rate();
        rate.addRating(3.0);
        rate.addRating(5.0);

        assertEquals(4.0, rate.getAverageDouble());
    }

    @Test
    public void getAverage1(){
        Rate rate = new Rate();
        rate.addRating(3.0);
        rate.addRating(3.0);

        assertEquals(3.0, rate.getAverageDouble());
    }

    @Test
    public void getAverage2(){
        Rate rate = new Rate();
        rate.addRating(3.0);
        rate.addRating(5.0);
        rate.addRating(4.0);
        rate.addRating(5.0);

        assertEquals(4.25, rate.getAverageDouble());
    }
}
