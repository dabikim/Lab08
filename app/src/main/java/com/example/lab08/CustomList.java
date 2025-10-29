package com.example.lab08;

import java.util.ArrayList;

public class CustomList {
    private ArrayList<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }
}
