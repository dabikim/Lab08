package com.example.lab08;

import java.util.ArrayList;

public class CustomList {
    private final ArrayList<City> cities = new ArrayList<>();

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    public void deleteCity(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException("City not in list");
        }
    }

    public int countCities() {
        return cities.size();
    }
}
