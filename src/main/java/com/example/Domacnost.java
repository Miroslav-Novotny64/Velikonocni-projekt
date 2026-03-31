package com.example;

class Domacnost {
    String nazev;
    int pocetVajicek;
    int pocetSladkosti;

    public Domacnost(String nazev, int pocetVajicek, int pocetSladkosti) {
        this.nazev = nazev;
        this.pocetVajicek = pocetVajicek;
        this.pocetSladkosti = pocetSladkosti;
    }

    @Override
    public String toString() {
        return nazev;
    }
}