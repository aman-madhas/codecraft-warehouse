package com;

public class Customer {

    private boolean charged;

    Customer(boolean c) {
        charged = c;
    }

    boolean wasCharged() {
        return charged;
    }
}
