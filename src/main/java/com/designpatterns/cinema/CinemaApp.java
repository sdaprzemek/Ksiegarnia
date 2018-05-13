package com.designpatterns.cinema;

import java.util.Scanner;

class CinemaApp {


    public static void main(String[] args) {
        MovieFactory movieFactory = MovieFactory.getInstance();

        printMainMenuWithListOfTheMovies();

        int movieNumber = getMovieNumber();

        Movie movie = movieFactory.createMovie(movieNumber);
        movie.showMovieDetails();

    }

    private static int getMovieNumber() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private static void printMainMenuWithListOfTheMovies() {
        System.out.println("******************************");
        System.out.println("**WELCOME TO ROCKSTAR CINEMA**");
        System.out.println("******************************");
        System.out.println("Chose a movie to see details and buy ticket:");
        System.out.println("1. Pulp Fiction");
        System.out.println("2. The Shawshank Redemption");
        System.out.println("3. The Dark Knight");
        System.out.println("4. The Godfather");
    }

}
