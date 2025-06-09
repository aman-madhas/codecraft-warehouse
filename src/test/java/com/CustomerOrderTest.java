package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerOrderTest {

    @Test
    void paymentAccepted() {
        CustomerOrder customer = new CustomerOrder(true);
        assertEquals(true, customer.wasCharged());
    }

    @Test
    void paymentDeclined() {
        CustomerOrder customer = new CustomerOrder(false);
        assertEquals(false, customer.wasCharged());
    }
}
