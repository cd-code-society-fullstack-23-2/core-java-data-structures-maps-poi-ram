package com.codedifferentlty.labs.partD;



public class POI implements Comparable<POI>{

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
    public String toString() {
        return name + " - " + address + " - " + description;
    }

    @Override
    public int compareTo(POI other) {
        // This line compares the age of the current person with the age of another person.
        // It returns a negative value if this.age < other.age, zero if they are equal, and a positive value otherwise.
        return CharSequence.compare(this.name, other.name);
    }
}
