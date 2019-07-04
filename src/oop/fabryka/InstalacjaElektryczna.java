package oop.fabryka;

public class InstalacjaElektryczna {
    Kierunkowskaz[] kierunkowskazy;
    Akumulator akumulator;

    public InstalacjaElektryczna(Kierunkowskaz[] kierunkowskazy, Akumulator akumulator) {
        System.out.println("Powstała instalacja elektryczna!");
        this.kierunkowskazy = kierunkowskazy;
        this.akumulator = akumulator;
    }
}
