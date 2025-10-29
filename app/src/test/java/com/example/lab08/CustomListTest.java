package com.example.lab08;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomListTest {

    @Test
    public void hasCity_returnsTrue_whenCityPresent() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void hasCity_returnsFalse_whenCityAbsent() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        assertFalse(list.hasCity(edmonton));
    }
}
