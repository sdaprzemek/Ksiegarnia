package com.designpatterns.strategy;

import java.util.Scanner;

public class KnightApp {

    //wzorzec strategia służy do tego żeby zaprojektować w ten sposob program aby w przyszlosci mozna bylo
    //rozbudowywac aplikacje i dodawc kolejne funkcje


    public static void main(String[] args) {
        Knight knight = new Knight(new KillDragonQuest());
        System.out.println("Choose quest to do:");
        System.out.println("1. Default quest - kill the Dragon");
        System.out.println("2. Save the Queen");
        System.out.println("3. Burn the city");

        Scanner in = new Scanner(System.in);
        int quest = in.nextInt();

        switch (quest) {
            case 1:
                knight.play();
                break;

            case 2:
                knight.setQuest(new SaveTheQueen());
                knight.play();
                break;

            case 3:
                knight.setQuest(new BurnTheCity());
                knight.play();
                break;
        }
    }
}
