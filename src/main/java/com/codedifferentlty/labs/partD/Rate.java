package com.codedifferentlty.labs.partD;

import java.util.ArrayList;
import java.util.List;

public class Rate implements Comparable<Rate>{

    private List<Double> ratings;

    public Rate() {
        ratings = new ArrayList<>();
    }

    public void addRating(Double rating) {
        ratings.add(rating);
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public Double getAverageDouble() {
        double total = 0;
        for (double i : ratings) {
            total += i;
        }
        return total/ratings.size();
    }

    public String getAverage() {
        if (ratings == null || ratings.isEmpty()) {
            return "Rating: No ratings";
        }
        else {
            double total = 0;
            for (double i : ratings) {
                total += i;
            }
            double average = total/ratings.size();
            return "Rating: " + String.valueOf(average) + "/5 by " + ratings.size() + " users.";
        }
    }

    @Override
    public int compareTo(Rate o) {
        return this.getAverageDouble().compareTo(o.getAverageDouble());
    }
}