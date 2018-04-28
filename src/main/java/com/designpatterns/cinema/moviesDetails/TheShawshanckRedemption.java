package com.designpatterns.cinema.moviesDetails;

import com.designpatterns.cinema.Movie;

public class TheShawshanckRedemption implements Movie {


    @Override
    public void showMovieDetails() {

        System.out.println("Title: The Shawshank Redemption");
        System.out.println("type: drama, crime");
        System.out.println("year: 2008");
        System.out.println("time: 152 min");
        System.out.println("Stars: Christian Bale, Heath Ledger, Morgan Freeman");
        System.out.println("When the menace known as the Joker emerges from his mysterious past, he wreaks " +
                "havoc and chaos on the people of Gotham, the Dark Knight must accept one of the greatest " +
                "psychological and physical tests of his ability to fight injustice.");
    }
}
