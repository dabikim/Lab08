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
}
