package com;

public class Stock {

    private int count;

    Stock(int c) {
        count = c;
    }

    int get() {
        return count;
    }

    void boughtCD(int howMany) {
        count = count - howMany;
    }
}
