package com.designpatterns.factory;

class Invitation {

    //wzorzec ValueObject - tworzy się obiekt bez możliwości modyfikowania ponieważ dane obiektu
    //przekazuje sie przy tworzeniu obiektu i w danej klasie są tylko gettery, a nie ma setterow

    private String name;
    private String surname;
    private String address;



    public Invitation(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
