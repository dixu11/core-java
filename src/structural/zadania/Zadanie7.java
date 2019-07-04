package structural.zadania;//7. Rozbuduj algorytm w taki sposób aby po zakończeniu przyjmowania danych, wyświetlone zostały użytkownikowi
//        wszystkie liczby a w kolejnych liniach parzyste i nieparzyste.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        algorytm();
    }

    private static void algorytm() {
        List<Integer> parzyste = new LinkedList<>();
        List<Integer> nieparzyste = new LinkedList<>();
        List<Integer> wszystkie = new LinkedList<>();
        boolean inputIsNotZero = true;
        System.out.println("Podaj mie liczby. Jak wpiszesz 0 to znaczy ze koniec.");
        while (inputIsNotZero) {
            int wprowadzona = przyjmijLiczbe();
            wszystkie.add(wprowadzona);
            if (wprowadzona == 0) {
                inputIsNotZero = false;
            } else {
                if (czyJestParzysta(wprowadzona)) {
                    parzyste.add(wprowadzona);
                } else {
                    nieparzyste.add(wprowadzona);
                }
            }
        }
        System.out.println("Wszystkie wprowadzone liczby to: ");
        for (Integer integer : wszystkie) {
            System.out.print(integer + ", ");
        }
        System.out.println();
        System.out.println("Parzyste to: ");
        for (Integer integer : parzyste) {
            System.out.print(integer + ", ");
        }
        System.out.println();
        System.out.println("Nieparzyste to: ");
        for (Integer integer : nieparzyste) {
            System.out.print(integer + ", ");
        }
        System.out.println();
    }

    private static Boolean czyJestParzysta(int liczba) {
        if (liczba % 2 > 0) {
            return false;
        } else {
            return true;
        }
    }

    private static int przyjmijLiczbe() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
