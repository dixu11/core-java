package structural.for_beginners;

import java.util.Scanner;

public class ListaZakupow {
    public static void main(String[] args) {
        System.out.println(zrobListeZakupow());
    }

    public static String zrobListeZakupow() {
        StringBuilder notatki = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String notatka;
        do {
            System.out.println("Co chcesz zanotować?");
            notatka = scanner.nextLine();
            if (!notatka.equalsIgnoreCase("koniec")) {
                notatki.append(notatka);
                if (czyPalindrom(notatka)) {
                    notatki.append("- PALINDROM!");
                }
                notatki.append("\n");
            }
        } while (!notatka.equalsIgnoreCase("koniec"));
        return notatki.toString();
    }

    public static boolean czyPalindrom(String slowo) {
        StringBuilder odwrocone = new StringBuilder();
        for (int i = slowo.length() - 1; i >= 0; i--) {
            odwrocone.append(slowo.charAt(i));
        }
        if (odwrocone.toString().equalsIgnoreCase(slowo)) {
            return true;
        }
        return false;
    }
}
