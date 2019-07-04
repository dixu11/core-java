package oop.kalkulator;

public class Dzielenie implements Operacje {
    @Override
    public double wykonajOperacje(double a, double b) {
        if (b != 0) {
            return (a / b);
        } else if (b == 0) {
            System.out.println("Nie wolno dzielic przez 0!");
            return 0;
        }else
            return 0;

    }

    @Override
    public char znak() {
        return '/';
    }
}