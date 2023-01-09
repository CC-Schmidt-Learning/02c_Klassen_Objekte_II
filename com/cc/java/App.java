package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Bewerbung bewerbung = new Bewerbung("White","Grizabella","Buxtehudestr.", 29, 01407,"Leipzig");
        output(bewerbung.getStringAttributes("#name"));
        output(bewerbung.getStringAttributes("#color"));
        output(bewerbung.getAge());
        output(bewerbung.getAge());
        output(bewerbung.getAge());
    
        output("------------------------");

        Cat cat1 = new Cat("Alonzo", "grey", 35, false);
        output(cat1.getStringAttributes("#name"));
        output(cat1.getStringAttributes("#color"));
        output(cat1.getAge());

    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

