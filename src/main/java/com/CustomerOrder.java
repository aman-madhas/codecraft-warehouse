package com;

public class CustomerOrder {

    private boolean charged;

    CustomerOrder(boolean c) {
        charged = c;
    }

    boolean wasCharged() {
        return charged;
    }
}
