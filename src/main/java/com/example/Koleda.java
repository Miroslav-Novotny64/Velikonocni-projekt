package com.example;

import java.util.ArrayList;

public class Koleda {
    ArrayList<Domacnost> domacnosti;
    int pocetVajicek = 0;
    int avgVajicka = 0;
    int pocetSladkosti = 0;
    int avgSladkosti = 0;

    public Koleda() {
        this.domacnosti = new ArrayList<Domacnost>();
    }

    public void addDomacnost(Domacnost domacnost) {
        this.domacnosti.add(domacnost);
        pocetVajicek += domacnost.pocetVajicek;
        pocetSladkosti += domacnost.pocetSladkosti;
        avgVajicka   = pocetVajicek   / domacnosti.size();
        avgSladkosti = pocetSladkosti / domacnosti.size();

        if (pocetVajicek == 0 && pocetSladkosti == 0) {
            System.out.println("Warning: Tato domácnost neposkytla žádnou odměnu");
        }
    }

    public Domacnost getNejstedrejsiDomacnost(){
        Domacnost nejstedrejsiDomacnost = domacnosti.get(0);
        for (Domacnost domacnost : domacnosti) {
            if (nejstedrejsiDomacnost.pocetVajicek < domacnost.pocetVajicek) {
                nejstedrejsiDomacnost = domacnost;
            }
        }
        return nejstedrejsiDomacnost;
    }

    public String getVyhodnodnoceni(){
        if (pocetVajicek >= 20){
            return "Koleda byla velmi úspěšná.";
        } else if (pocetVajicek >= 10){
            return "Koleda byla průměrně úspěšná.";
        }
        return "Koleda byla spíše slabá..";
    }

    @Override
    public String toString() {
        StringBuilder domacnostiString = new StringBuilder("\n\t");
        for (Domacnost domacnost : domacnosti) {
            domacnostiString.append("\n\t").append(domacnost.toString());
        }
        return domacnostiString.toString();
    }
}
