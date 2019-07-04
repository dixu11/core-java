package structural.zadania;//4. Utwórz algorytm który w zdefiniowanej 10 elementowej tablicy policzy i wyświetli średnią.

import java.util.Random;

public class Zadanie4 {
    public static void main(String[] args) {
        wypiszSrednia(zapelnijLosowymi(new int[10]));
    }

    private static void wypiszSrednia(int[] tablica) {
        double suma = 0;
        for (int i : tablica) {
            suma += i;
        }
        System.out.println("Srednia liczb w tablicy to: " + suma/tablica.length);

    }

    private static int[] zapelnijLosowymi(int[] tablica) {
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(11);
        }
        return tablica;
    }
}
