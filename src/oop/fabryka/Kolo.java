package oop.fabryka;

public class Kolo {
    int cisnienie;
    String przednieCzyTylne;

    public Kolo(int cisnienie, String przednieCzyTylne) {
        this.cisnienie = cisnienie;
        this.przednieCzyTylne = przednieCzyTylne;
        System.out.println("Stworzylem " + przednieCzyTylne + " kolo z cisnieniem " + cisnienie);
    }
}
