package com.cc.java;

public class Bewerbung {
    private String firmName;
    private String lastName;
    private String firstName;
    private String streetName;
    private int houseNr;
    private int zip;
    private String city;

    public Bewerbung(String firmName, String lastName, String firstName, String streetName, int houseNr, int zip, String city) {
        this.firmName = firmName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetName = streetName;
        this.houseNr = houseNr;
        this.zip = zip;
        this.city = city;
    }


    public int getHouseNr() {
        return houseNr;
    }


    public void setHouseNr(int houseNr) {
        this.houseNr = houseNr;
    }


    public int getZip() {
        return zip;
    }


    public void setZip(int zip) {
        this.zip = zip;
    }


    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#firmName":
                return firmName;
            case "#lastName":
                return lastName;
            case "#firstName":
                return firstName;
            case "#streetName":
                return streetName;
            case "#city":
                return city;
            default:
                return "#!ERROR";
        }
    }
}
