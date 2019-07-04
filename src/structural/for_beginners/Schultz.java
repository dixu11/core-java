package structural.for_beginners;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Schultz {
    public static void main(String[] args) {
        graj(5);
    }

    public static void graj(int ileRazy) {
        LocalDateTime start = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ileRazy; i++) {
            wyswietlTablice(9);
            System.out.println("Naciśnij ENTER jak znajdziesz...");
            scanner.nextLine();
        }
        LocalDateTime end = LocalDateTime.now();
        System.out.println("Gra zajęła Ci: " + SECONDS.between(start, end) + " sec");
    }

    public static void wyswietlTablice(int wielkosc) {
        if (wielkosc % 2 == 0) {
            System.out.println("Nieprawidłowa wielkość! Podaj liczbę nieparzystą!");
        } else {
            int srodek = (wielkosc - 1) / 2;
            Random random = new Random();
            int[][] plansza = new int[wielkosc][wielkosc];
            for (int i = 0; i < plansza.length; i++) {
                for (int j = 0; j < plansza.length; j++) {
                    plansza[i][j] = random.nextInt(99) + 1;
                }
            }
            plansza[srodek][srodek] = 0;
            int losowaLiczba = plansza[random.nextInt(wielkosc)][random.nextInt(wielkosc)];
            System.out.println("Znajdź: " + losowaLiczba);
            for (int[] rzad : plansza) {
                for (int liczba : rzad) {
                    System.out.printf("%3d", liczba);
                }
                System.out.println();
            }
        }
    }

    //- zmienia na prawa strone

}
