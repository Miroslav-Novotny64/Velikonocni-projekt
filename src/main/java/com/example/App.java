package com.example;

public class App {
    public static void main(String[] args) {
        while (true) {
            int pocetDomacnosti = Input.getInt("Kolik domácností jste navštívil?", false);

            Koleda koleda = new Koleda();

            for (int i = 0; i < pocetDomacnosti; i++) {
                String nazev = Input.getText("Zadejte název domácnosti");
                int pocetVajicek = Input.getInt("Zadejte počet získaných vajíček", true);
                int pocetSladkosti = Input.getInt("Zadejte počet získaných sladkostí", true);
                koleda.addDomacnost(new Domacnost(nazev, pocetVajicek, pocetSladkosti));
            }

            System.out.println("Přehled navštívěných domácností");
            System.out.println(koleda);
            System.out.printf("""
        Statistiky
        ----------------------------------------------------------------------------
        • Celkový počet vajíček:                        %d
        • Průměrný počet vajíček na domácnost:          %d
        • Celkový počet sladkostí:                      %d
        • Průměrný počet sladkostí na domácnost:        %d
        • Nejštědřejší domácnost:                       %s
        ----------------------------------------------------------------------------
        • Vyhodnocení:                                  %s
        """,
                    koleda.pocetVajicek,
                    koleda.avgVajicka,
                    koleda.pocetSladkosti,
                    koleda.avgSladkosti,
                    koleda.getNejstedrejsiDomacnost(),
                    koleda.getVyhodnodnoceni()
            );
        }
    }
}
