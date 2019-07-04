package structural.zadania;//9. Utwórz algorytm który sprawdzi czy słowo jest palindromem i zwróci TAK lub NIE.

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println(dajMiePoloweSlowa(pobierzSlowo()));
    }

    private static String dajMiePoloweSlowa(String slowo) {
        slowo = slowo.substring(0,slowo.length() / 2);
        return slowo;
    }

    private static String pobierzSlowo() {
        System.out.println("Wpisz slowo");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
