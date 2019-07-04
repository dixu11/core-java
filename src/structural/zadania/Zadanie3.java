package structural.zadania;//3. Rozbuduj algorytm aby przyjmować 5 liczb z klawiatury. Parzyste powinny być sumowane, natomiast
//        nieparzyste odejmowane. Wyświetl listę wprowadzonych liczb oraz wynik.

import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        algorytm();
    }


    private static void algorytm() {
        ArrayList<Integer> liczby = new ArrayList<>();
        System.out.println("Podaj 5 liczby: ");
        liczby.add(przyjmijLiczbe());
        liczby.add(przyjmijLiczbe());
        liczby.add(przyjmijLiczbe());
        liczby.add(przyjmijLiczbe());
        liczby.add(przyjmijLiczbe());
        System.out.println("Wprowadzone liczby: ");
        for (Integer integer : liczby) {
            System.out.println(integer);
        }
        int suma = 0;
        for (Integer integer : liczby) {
            if (czyJestParzysta(integer)) {
                suma += integer;
            } else {
                suma -= integer;
            }
        }
        System.out.println("Po zliczeniu liczb parzystych i odjeciu nieparzystych wynik to: " + suma);
    }

    private static int przyjmijLiczbe() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static Boolean czyJestParzysta(int liczba) {
        if (liczba % 2 > 0) {
            return false;
        } else {
            return true;
        }
    }
}
