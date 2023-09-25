package com.codedifferentlty.labs.partD;

import java.util.HashMap;
import java.util.Map;

public class POI implements Comparable<POI> {

    private String name;

    private String address;

    private String description;

    public POI(String name, String address, String description) {
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getDescription() { return description; }

    @Override
    public int compareTo(POI other) {
        return 0;
    }

    @Override
    public String toString() {
        return name + " - " + address + " - " + description;
    }

}
