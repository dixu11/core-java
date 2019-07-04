package structural.zadania;//2. Rozbuduj algorytm aby przyjąć 3 liczby z klawiatury i zsumować tylko liczby parzyste.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        algorytm();
    }


    private static void algorytm() {
        ArrayList<Integer> liczby = new ArrayList<>();
        System.out.println("Podaj 3 liczby: ");
        liczby.add(przyjmijLiczbe());
        liczby.add(przyjmijLiczbe());
        liczby.add(przyjmijLiczbe());
        int suma = 0;
        for (Integer integer : liczby) {
            if (czyJestParzysta(integer)) {
                suma += integer;
            }
        }
        System.out.println("Suma liczb parzystych to: " + suma);
    }

    private static int przyjmijLiczbe() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static Boolean czyJestParzysta(int liczba) {
        System.out.println("Sprawdzam liczbe "+ liczba);
        if (liczba % 2 > 0) {
            System.out.println("nie, nie jest");
            return false;
        } else {
            System.out.println("tak jest");
            return true;
        }
    }
}
