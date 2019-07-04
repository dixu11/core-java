package oop.kalkulator;


public class Modulo implements Operacje {
    @Override
    public double wykonajOperacje(double a, double b) {
        return (a % b);
    }

    @Override
    public char znak() {
        return '%';
    }
}
