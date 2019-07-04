package oop.kalkulator;

public class Mnozenie implements Operacje {
    @Override
    public double wykonajOperacje(double a, double b) {
            return (a * b);
    }

    @Override
    public char znak() {
        return '*';
    }
}
