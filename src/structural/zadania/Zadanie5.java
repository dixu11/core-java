package structural.zadania;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (int)(Math.random()*10);
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.printf("%2d element tablicy to: %d\n",i,tablica[i]);
        }
        wyswietlKrancoweWartosciIZwrocIndeksPodanejLiczby(tablica, 3);
    }

    private static int wyswietlKrancoweWartosciIZwrocIndeksPodanejLiczby(int[] tablica,int szukana) {
        //wyszukiwanie najwiekszej i najmniejszej
        int najmniejsza = Integer.MAX_VALUE;
        int najwieksza = Integer.MIN_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < najmniejsza) {
                najmniejsza = tablica[i];
            }
            if (tablica[i] > najwieksza) {
                najwieksza = tablica[i];
            }
        }
        System.out.printf("Najwieksza wartosc w tablicy to: %d\n", najwieksza);
        System.out.printf("Najmniejsza wartosc w tablicy to: %d\n", najmniejsza);
        //zwaracanie indeksu
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == szukana) {
                System.out.printf("Znalazlem liczbe: %d, zwracam jej indeks czyli: %d\n", szukana, i);
                return i;
            }
        }
        System.out.printf("Nie znalazlem liczby: %d wiec zwracana liczba to 0\n", szukana);
        return 0;
    }
}
