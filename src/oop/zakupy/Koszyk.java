package oop.zakupy;

import java.util.Scanner;

public class Koszyk {

    double ceaPapryki = 0.70;
    double cenaPomidorow = 0.50;
    double iloscPieniedzy = 0;
    double cenaKoncowa = 0;
    double iloscPapryki;
    double iloscPomidorow;

    public Koszyk(double ceaPapryki, double cenaPomidorow, double iloscPieniedzy) {
        this.ceaPapryki = ceaPapryki;
        this.cenaPomidorow = cenaPomidorow;
        this.iloscPieniedzy = iloscPieniedzy;
    }

    public Koszyk() {

    }

    public void rozpoczynamZakupy(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz pieniedzy?");
        iloscPieniedzy = scanner.nextInt();
        System.out.println("Jesteś na targu. Masz pusty koszyk i " + iloscPieniedzy + "zł.");
        poczatekZakopow();
    }

    void poczatekZakopow(){
        System.out.printf("Zamawiam:\n Cena Papryki %.2fzł\n Cena Pomidorów %.2fzł\n", ceaPapryki, cenaPomidorow);
        wyswietlPoczatekZakupow();
    }

    public  void wyswietlPoczatekZakupow(){
        Scanner scanner = new Scanner(System.in);
        iloscPapryki = scanner.nextDouble();
        System.out.printf("Ile Papryki kupuje: %.2fszt.", + iloscPapryki);
        Scanner scanner2 = new Scanner(System.in);
        iloscPomidorow = scanner2.nextDouble();
        System.out.printf("Ile Pomidorów kupuje: %.2fszt.",  + iloscPomidorow);
    }

    public void koniecZakopow() {
        double cenaKoncowa = iloscPieniedzy - ((iloscPapryki * ceaPapryki) + (iloscPomidorow * cenaPomidorow));
        System.out.printf("Ile zostało po zakupach: %.2f PLN.", +cenaKoncowa);
    }

}
