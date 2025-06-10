package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {

    private List<String> inventory;
    private Map<String, List<Review>> reviews = new HashMap<>();

    Stock(List<String> s) {
        inventory = s;
    }

    long getCountByArtist(String artist) {
        return inventory.stream().filter(t -> t.endsWith("-" + artist)).count();
    }
    long getCountByTitle(String title) {return inventory.stream().filter(t-> t.startsWith(title + "-")).count();}

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

    void addRating(String cd, int rating){
        reviews.computeIfAbsent(cd, c->new ArrayList<>()).add(new Review(rating));
    }

    List<Review> getRating(String cd){
        return reviews.get(cd);
    }
}
