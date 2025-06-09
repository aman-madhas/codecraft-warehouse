package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void successfullyBuyCD() {
        Customer customer = new Customer();
        assertEquals(true, customer.charged());
    }
}
