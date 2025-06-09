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
        if (count - howMany > 0) {
            count = count - howMany;
        }
    }
}
