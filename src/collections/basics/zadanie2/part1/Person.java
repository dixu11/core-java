package collections.basics.zadanie2.part1;

import java.time.LocalDate;

public class Person {
   private final int ID;
    private static int nextId = 1;
    private String imie;
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Person(String imie, String nazwisko, LocalDate dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        ID = nextId;
        nextId++;
    }

    public int getID() {
        return ID;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
}
