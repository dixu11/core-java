package oop.zadanie5tankowanie;

import java.util.Random;
import java.util.Scanner;

public class Dystrybutor {
    private int iloscPaliwa;
    private double doZaplaty;
    private final static double cenaPaliwa = 5.15;
    private int pojemnoscBaku;

    public void rozpocznijTankowanie (int pojemnoscBaku){
        this.pojemnoscBaku = pojemnoscBaku;
        Scanner input = new Scanner(System.in);
        System.out.println("Rozpoczynam tankowanie:\n");
        wyswietlStan();
        do {
            System.out.println("\nDolewamy paliwa.");
    kontynuacja();
            wyswietlStan();
            System.out.println("Czy dolewać dalej?\n" +
                    "t - tak\n" +
                    "n - nie");
        } while (input.nextLine().equals("t") && !((pojemnoscBaku - iloscPaliwa) <2)); // ma nam jeszcze sprawdzac czy juz pelny bak
       // System.out.println("Koniec tankowania");
        zakonczenie();
        //scaner - pyta czy kontynuowac
        //do while
       // if () {
        //}
    }

    void kontynuacja(){
        //System.out.println("Teraz dolewa sie troche paliwa");
        Random dolewacz = new Random();
        iloscPaliwa += dolewacz.nextInt((pojemnoscBaku - iloscPaliwa+1));
        doZaplaty = cenaPaliwa * iloscPaliwa;
        //random
        // ile do zaplaty i ile nalane mowi
    }

    void zakonczenie(){
        wyswietlStan();
        System.out.println("Dziekujemy za tankowanie!\n" +
                "Zapraszamy do kasy");
    }

    void wyswietlStan(){
        System.out.printf("Stan:\nZatankowano: %d l\nKoszt: %.2fzł\nCena za litr: %.2fzł\n", iloscPaliwa,doZaplaty, cenaPaliwa);
    }

}
