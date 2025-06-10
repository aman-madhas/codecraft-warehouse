package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewTest {
    private Stock stock;

    @BeforeEach
    void setUp(){
        List<String> inventory = new ArrayList<>();
        inventory.add("Thriller-Michael Jackson");
        inventory.add("Thriller-Michael Jackson");

        stock = new Stock(inventory);
    }

    @Test
    void addReviewRating() {
        stock.addRating("Thriller-Michael Jackson",8);
        List<Review> reviews = stock.getRating("Thriller-Michael Jackson");
        assertEquals(8, reviews.get(0).getRating());
    }
}
