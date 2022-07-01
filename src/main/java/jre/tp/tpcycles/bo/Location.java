package jre.tp.tpcycles.bo;

import java.time.LocalDate;
import java.time.Month;

public class Location {

    /**
     * Cr�e un tableau de cycles et les affiche
     *
     * @param args pas n�cessaire
     */
    public static void main(String[] args) {
        Cycle[] aLouer = {new Velo(LocalDate.of(2017, Month.JUNE, 2), "Lapierre", "speed 400", 27),
                new Velo(LocalDate.of(2018, Month.APRIL, 9), "Btwin", "riverside 900", 10),
                new Gyropode(LocalDate.of(2018, Month.JUNE, 5), "Segway", "Ninebot Elite", 40, 150),
                new Gyropode(LocalDate.of(2017, Month.MAY, 2), "Weebot", "Echo", 35, 160),
                new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Immotion", "v8", 40),
                new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Segway", "Ninebot One E+", 30)};
        System.out.println("Voici les cycles que nous proposons à la location :");
        for (Cycle c : aLouer) {
            System.out.printf("- %-95s %5.2fe/heure%n", c, c.getTarifLocationHeure());
        }
    }

}
