package com.designpatterns.cinema.moviesDetails;

import com.designpatterns.cinema.Movie;

public class TheDarkKnight implements Movie {


    @Override
    public void showMovieDetails() {

        System.out.println("Title: The Dark Knight");
        System.out.println("type: action, drama, crime");
        System.out.println("year: 1972");
        System.out.println("time: 175 min");
        System.out.println("Stars: Marlon Brando, Al Pacino, James Caan");
        System.out.println("Plot: The aging patriarch of an organized crime dynasty " +
                "transfers control of his clandestine empire to his reluctant son.");

    }
}
