package com.designpatterns.cinema.moviesDetails;

import com.designpatterns.cinema.Movie;

public class PulpFiction implements Movie {

    @Override
    public void showMovieDetails() {

        System.out.println("Title: Pulp Fiction");
        System.out.println("type: drama, crime");
        System.out.println("year: 1994");
        System.out.println("time: 154 min");
        System.out.println("Stars: John Travolta, Uma Thurman, Samuel L. Jackson");
        System.out.println("Plot: The lives of two mob hitmen, a boxer, a gangster's wife, and a " +
                "pair of diner bandits intertwine in four tales of violence and redemption. ");

    }
}
