package structural.zadania;//6. Napisz program który będzie przyjmował od użytkownika liczby do momentu podania 0.
//        Jeśli użytkownik wpisze 0, wprowadzenie danych powinno się zakończyć i powinna zostać
//        wyświetlona liczba wszystkich elementów, liczb parzystych oraz nieparzystych.


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zadania6 {
    public static void main(String[] args) {
algorytm();
    }

    private static void algorytm() {
        List<Integer> parzyste = new LinkedList<>();
        List<Integer> nieparzyste = new LinkedList<>();
        boolean inputIsNotZero = true;
        System.out.println("Podaj mie liczby. Jak wpiszesz 0 to znaczy ze koniec.");
        while (inputIsNotZero) {
            int wprowadzona = przyjmijLiczbe();
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
