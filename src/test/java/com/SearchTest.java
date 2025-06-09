package com;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    @Test
    void searchByArtistNoResults() {
        Search search = new Search("Taylor Swift");
        assertEquals(0, search.results());
    }
}
