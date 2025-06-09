package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockTest {

    @Test
    void customerSuccessfullyBuysCD() {
        Stock stock = new Stock(5);
        stock.boughtCD();
        assertEquals(4, stock.get());
    }
}
