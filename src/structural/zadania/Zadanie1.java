package structural.zadania;//1. wprowadz liczbe dodatnia calkowita i sprawdz czy podana liczba jest parzysta.

public class Zadanie1 {
    public static void main(String[] args) {
        czyJestParzysta(1);
        czyJestParzysta(2);
        czyJestParzysta(3);
        czyJestParzysta(4);
        czyJestParzysta(5);
        czyJestParzysta(6);
    }

    private static void czyJestParzysta(int liczba) {
        System.out.println("Sprawdzam liczbe "+ liczba);
        if (liczba % 2 > 0) {
            System.out.println("nie, nie jest");
        } else {
            System.out.println("tak jest");
        }
    }
}
