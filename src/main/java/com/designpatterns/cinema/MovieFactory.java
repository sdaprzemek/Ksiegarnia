package com.designpatterns.cinema;

import com.designpatterns.cinema.moviesDetails.PulpFiction;
import com.designpatterns.cinema.moviesDetails.TheDarkKnight;
import com.designpatterns.cinema.moviesDetails.TheGodFather;
import com.designpatterns.cinema.moviesDetails.TheShawshanckRedemption;

public class MovieFactory {

    private static MovieFactory movieFactory = null;
    private MovieFactory() {}

    public static MovieFactory getInstance() {
        if (movieFactory == null) {
            movieFactory = new MovieFactory();
        }
        return movieFactory;
    }

    public Movie createMovie(int movieNumber) {
        switch (movieNumber) {
            case 1:
                return new PulpFiction();
            case 2:
                return new TheShawshanckRedemption();
            case 3:
                return new TheDarkKnight();
            case 4:
                return new TheGodFather();
        }
        throw new RuntimeException("Invalid number, out of menu ...");
    }
}
