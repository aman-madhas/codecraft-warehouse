package com;

import java.util.List;

public class Stock {

    private List<String> inventory;

    Stock(List<String> s) {
        inventory = s;
    }

    long getCountByArtist(String artist) {
        return inventory.stream().filter(t -> t.endsWith("-" + artist)).count();
    }

    long getCount(String title, String artist) {
        return inventory.stream().filter(t -> t.equals(title + "-" + artist)).count();
    }

    void boughtCD(String title, String artist, int quantity) {
        long count = getCount(title, artist);

        if (count - quantity > 0) {
            for (int i = 0; i < quantity; i++) {
                inventory.remove(title + "-" + artist);
            }
        }
    }
}
