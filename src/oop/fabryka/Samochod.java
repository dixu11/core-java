package oop.fabryka;

public class Samochod {
    Podwozie podwozie;
    Nadwozie nadwozie;
    InstalacjaElektryczna instalacjaElektryczna;

    public Samochod(Podwozie podwozie, Nadwozie nadwozie, InstalacjaElektryczna instalacjaElektryczna) {
        this.podwozie = podwozie;
        this.nadwozie = nadwozie;
        this.instalacjaElektryczna = instalacjaElektryczna;
        System.out.println("Stworzylem samochod");
    }

    void jedz() {
        System.out.println("Odpalam samochód i jadę!");
    }
}
