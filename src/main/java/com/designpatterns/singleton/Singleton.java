package com.designpatterns.singleton;

//Signleton służy do utworzenia tylko jednego obiektu danej klasy, nie ma mozliwosci utworzenia w jednej chwili kilku obiektow danego typu
//wykorzystuje sie to np. do zapisywania logow do pliku. Nie chcemy zeby w jednej chwili kilka obiektow zapisywalo dane do pliku
//poniewaz plik moze sie zle zapisywac, lub dane moga sie nadpisywac

public class Singleton {
    private static Singleton singleton = null; //warunkiem jest prywatny obiekt tej klasy
    private Singleton(){}; //prywatny konstuktor

    public static Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
    public String testSingleton(){
        String text = "Jestem";
        return text;
    }
}
