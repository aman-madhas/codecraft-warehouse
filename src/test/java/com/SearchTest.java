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
        SearchCDs search = new SearchCDs(stock, "Adele");
        assertEquals(0, search.getCountByArtist());
    }

    @Test
    void searchByArtistWithResults() {
        SearchCDs search = new SearchCDs(stock, "Coldplay");
        assertEquals(4, search.getCountByArtist());
    }

    @Test
    void searchByTitleNoResults() {
        SearchCDs search = new SearchCDs(stock, "21");
        assertEquals(0, search.getCountByTitle());
    }

    @Test
    void searchByTitleWithResults() {
        SearchCDs search = new SearchCDs(stock, "The Scientist");
        assertEquals(3, search.getCountByTitle());
    }
}
