package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Bewerbung bewerbung = new Bewerbung( " ","White","Grizabella","Buxtehudestr.", 29, 11407, "Leipzig");
        output(bewerbung.getStringAttributes("#lastName"));
        output(bewerbung.getStringAttributes("#firstName"));
        output(bewerbung.getStringAttributes("#streetName"));
        System.out.println(bewerbung.getHouseNr());
        System.out.println(bewerbung.getZip());
        output(bewerbung.getStringAttributes("#city"));
      
       
    
        output("------------------------");

        Bewerbung bewerbung1 = new Bewerbung("ItCrowd", "Grey", "Alonzo", "Klabauterst.", 35, 14299, "Leipzig");
        output(bewerbung1.getStringAttributes("#firmName"));
        output(bewerbung1.getStringAttributes("#lastName"));
        output(bewerbung1.getStringAttributes("#firstName"));
        output(bewerbung1.getStringAttributes("#streetName"));
        System.out.println(bewerbung1.getHouseNr());
        System.out.println(bewerbung1.getZip());
        output(bewerbung1.getStringAttributes("#city"));
    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

