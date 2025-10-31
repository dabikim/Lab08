package com.example.lab08;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomListTest {

    // --- hasCity ---
    @Test
    public void hasCity_true_whenPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void hasCity_false_whenAbsent() {
        CustomList list = new CustomList();
        assertFalse(list.hasCity(new City("Edmonton", "AB")));
    }

    @Test
    public void deleteCity_removesExisting() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary","AB");
        City edmonton = new City("Edmonton","AB");
        list.addCity(calgary); list.addCity(edmonton);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));
    }

    @Test(expected = IllegalArgumentException.class)
    public void deleteCity_throwsWhenMissing() {
        new CustomList().deleteCity(new City("Nowhere","ZZ"));
    }
    @Test
    public void countCities_countsCorrectly() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Calgary","AB"));
        list.addCity(new City("Edmonton","AB"));
        assertEquals(2, list.countCities());
        list.deleteCity(new City("Calgary","AB"));
        assertEquals(1, list.countCities());
    }


}
