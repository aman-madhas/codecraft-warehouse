package com;

public class Search {

    private String artist;
    private Stock stock;

    Search(Stock s, String a) {
        stock = s;
        artist = a;
    }

    long getCountByArtist() {
        return stock.getCountByArtist(artist);
    }
}
