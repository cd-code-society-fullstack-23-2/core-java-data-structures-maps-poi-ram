package com.codedifferentlty.labs.partD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class POITest {
    @Test
    public void testGetAndSetName01() {
        //Given
        POI local = new POI("The Queen", "500 N Market St, Wilmington, DE 19801", "The queen is a concert hall in wilmington");
        //When
        String expected = "The Queen";
        String actual = local.getName();
        //Then
        assertEquals(expected,actual);

    }
    @Test
    public void testGetAndSetAddress01() {
        //Given
        POI local = new POI("The Queen", "500 N Market St, Wilmington, DE 19801", "The queen is a concert hall in wilmington");
        //When
        String expected = "500 N Market St, Wilmington, DE 19801";
        String actual = local.getAddress();
        //Then
        assertEquals(expected,actual);

    }

    @Test
    public void testGetAndSetDescription01() {
        //Given
        POI local = new POI("The Queen", "500 N Market St, Wilmington, DE 19801", "The queen is a concert hall in wilmington");
        //When
        String expected = "The queen is a concert hall in wilmington";
        String actual = local.getDescription();
        //Then
        assertEquals(expected,actual);

    }




}
