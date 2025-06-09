package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    private Stock stock;

    @BeforeEach
    void setup() {
        List<String> inventory = new ArrayList<>();
        inventory.add("Cruel Summer-Taylor Swift");
        inventory.add("Cruel Summer-Taylor Swift");
        inventory.add("Cruel Summer-Taylor Swift");
        inventory.add("Shake It Off-Taylor Swift");
        inventory.add("Shake It Off-Taylor Swift");
        inventory.add("The Scientist-Coldplay");
        inventory.add("The Scientist-Coldplay");
        inventory.add("The Scientist-Coldplay");
        inventory.add("Yellow-Coldplay");

        stock = new Stock(inventory);
    }

    @Test
    void searchByArtistNoResults() {
        Search search = new Search(stock, "Adele");
        assertEquals(0, search.getCountByArtist());
    }

    @Test
    void searchByArtistWithResults() {
        Search search = new Search(stock, "Coldplay");
        assertEquals(4, search.getCountByArtist());
    }
}
