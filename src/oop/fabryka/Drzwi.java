package oop.fabryka;

public class Drzwi {
    String leweCzyPrawe;
    boolean zamkniete;

    public Drzwi(String leweCzyPrawe) {
        this.leweCzyPrawe = leweCzyPrawe;
        System.out.println("Stworzylem " + leweCzyPrawe + " drzwi.");
    }
}
