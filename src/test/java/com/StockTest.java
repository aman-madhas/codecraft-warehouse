package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {

    private Stock stock;

    @BeforeEach
    void setup() {
        List<String> inventory = new ArrayList<>();
        inventory.add("Cruel Summer-Taylor Swift");
        inventory.add("Cruel Summer-Taylor Swift");
        inventory.add("Cruel Summer-Taylor Swift");
        inventory.add("Shake It Off-Taylor Swift");
        inventory.add("Shake It Off-Taylor Swift");
        inventory.add("The Scientist-Coldplay");

        stock = new Stock(inventory);
    }

    @Test
    void customerSuccessfullyBuysOneCD() {
        stock.boughtCD("Cruel Summer","Taylor Swift", 1);
        assertEquals(2, stock.getCount("Cruel Summer", "Taylor Swift"));
    }

    @Test
    void customerSuccessfullyBuysMultipleCDs() {
        stock.boughtCD("Cruel Summer","Taylor Swift", 2);
        assertEquals(1, stock.getCount("Cruel Summer", "Taylor Swift"));
    }

    @Test
    void notEnoughStock() {
        stock.boughtCD("Cruel Summer","Taylor Swift", 6);
        assertEquals(3, stock.getCount("Cruel Summer", "Taylor Swift"));
    }
}
