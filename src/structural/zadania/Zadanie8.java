package structural.zadania;//8. Utwórz algorytm którty pobierze od użytkownika słowo, wyświetli je w połowie oraz jego długość.

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println(czyJestPalindromem(pobierzSlowo()));
    }

    private static boolean czyJestPalindromem(String slowo) {
        slowo = slowo.toLowerCase();
        StringBuilder slowoOdTylu = new StringBuilder();
        for (int i = 0; i < slowo.length(); i++) {
            slowoOdTylu.append(slowo.charAt((slowo.length() - i -1)));
        }
        System.out.println("Wyszlo mi takie cos: " + slowoOdTylu.toString());
        if (slowoOdTylu.toString().equals(slowo)) {
            System.out.println("TAK! Palindrom");
            return true;
        } else {
            System.out.println("NIE! Niestety nie palindrom");
            return false;
        }
    }

    private static String pobierzSlowo() {
        System.out.println("Wpisz slowo, sprawdzimy czy to palindrom");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
