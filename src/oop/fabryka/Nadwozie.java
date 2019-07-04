package oop.fabryka;

public class Nadwozie {
    Szyberdach szyberdach;
    Drzwi[] drzwi;

    public Nadwozie(Szyberdach szyberdach, Drzwi[] drzwi) {
        this.szyberdach = szyberdach;
        this.drzwi = drzwi;
        System.out.println("Stworzylem nadwozie!");
    }
}
