package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {

    @Test
    void customerSuccessfullyBuysOneCD() {
        Stock stock = new Stock(5);
        stock.boughtCD(1);
        assertEquals(4, stock.get());
    }

    @Test
    void customerSuccessfullyBuysMultipleCDs() {
        Stock stock = new Stock(5);
        stock.boughtCD(3);
        assertEquals(2, stock.get());
    }

    @Test
    void notEnoughStock() {
        Stock stock = new Stock(5);
        stock.boughtCD(6);
        assertEquals(5, stock.get());
    }
}
