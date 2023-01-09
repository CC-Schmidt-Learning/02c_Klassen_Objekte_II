package com.cc;

public class Bewerbung {
    private String lastName;
    private String firstName;
    private String streetName;
    private int houseNr;
    private int zip;
    private String city;

    public Bewerbung(String lastName, String firstName, String streetName, int houseNr, int zip, String city) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetName = streetName;
        this.houseNr = houseNr;
        this.zip = zip;
        this.city = city;
    }
}
