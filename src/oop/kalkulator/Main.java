package oop.kalkulator;

public class Main {

    static Operacje[] obslugiwaneOperacje = {
            new Dodawanie(),
            new Odejmowanie(),
            new Mnozenie(),
            new Dzielenie(),
            new Modulo()
    };


    public static void main(String[] args) {
//com.all.kalkulator.BladParsowaniaWartosci.testWyjatku();
        double liczba1 = 0;
        double liczba2 = 0;

        liczba1 = parsowanie(args, 0);
        liczba2 = parsowanie(args, 2);
        char znak = parsowanieZnaku(args, 1);

        for (Operacje operacje : obslugiwaneOperacje) {
            if (znak == operacje.znak()) {
                System.out.println(operacje.wykonajOperacje(liczba1, liczba2));
            }
        }
    }

    static double parsowanie(String[] liczbaString, int pozycja) {
        double wynik = 0;
        try {
            wynik = Double.parseDouble(liczbaString[pozycja]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ec) {
            throw new BladParsowaniaWartosci("A cóż to. Parsowanie nie wyszło.");
        }
        return wynik;
    }

    static char parsowanieZnaku(String[] znakString, int pozycja) {
        char wynik = '+';
        boolean brakObslugiwanegoZnaku = true;
        try {
            wynik = znakString[pozycja].charAt(0);
        } catch (NullPointerException | ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException exc) {
            throw new BladParsowaniaWartosci("A cóż to. Parsowanie nie wyszło.");
        }
        for (Operacje operacje : obslugiwaneOperacje) {
            if (wynik == operacje.znak()) {
                brakObslugiwanegoZnaku = false;
            }
        }
        if (brakObslugiwanegoZnaku) {
            System.out.println("Wstawiam domyślny znak '+' bo nie rozpoznałem Twojego znaku :(");
        }
        return wynik;
    }

}