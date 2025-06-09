package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void successfullyBuyCD() {
        Customer customer = new Customer(true);
        assertEquals(true, customer.wasCharged());
    }

    @Test
    void paymentDeclined() {
        Customer customer = new Customer(false);
        assertEquals(false, customer.wasCharged());
    }
}
