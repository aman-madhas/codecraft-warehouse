package com;

public class SearchCDs {

    private String artistOrTitle;
    private Stock stock;

    SearchCDs(Stock s, String a) {
        stock = s;
        artistOrTitle = a;
    }

    long getCountByArtist() {
        return stock.getCountByArtist(artistOrTitle);
    }

    long getCountByTitle() {return stock.getCountByTitle(artistOrTitle);}
}