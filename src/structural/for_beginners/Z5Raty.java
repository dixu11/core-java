package structural.for_beginners;

import java.util.Scanner;

public class Z5Raty {

    //obliczamy wysokośc miesięcznej raty za zakupiony sprzęt
    //wchodzi:
//    cena towaru 100zł - 10 tyś
//    liczba rat 6-48

//    oprocentowanie kredytu wg ilości wybranych rat:
//    6-12 : 2,5
//    13-24 : 5
//    25-48 : 10

//    rata ma zawierać odsetki
//    prośba o wprowadzenie danych ponownie jeżeli zły zakres

    public static void main(String[] args) {
        System.out.println("Zaraz sobie razem wspólnie policzymy Twoją miesięczną ratę... Zaczynamy!\n");
        Scanner input = new Scanner(System.in);
        double cena = -1;
        //dodać while

        boolean isInputIncorrect = true;
        while (isInputIncorrect) {
            System.out.println("Podaj cenę towaru (w zakresie 100zł - 10 000zł)");
            if (input.hasNextDouble()) {
                cena = input.nextDouble();
                if (cena >= 100 && cena <= 10000) {
                    isInputIncorrect = false;
                }
            } else {
                input.next();
            }
        }

        isInputIncorrect = true;
        int raty = -1;
        while (isInputIncorrect) {
            System.out.println("Podaj ilość rat (w zakresie 6-48)");
            if (input.hasNextInt()) {
                raty = input.nextInt();
                if (raty >= 6 && raty <= 48) {
                    isInputIncorrect = false;
                }
            } else {
                input.next();
            }
        }

        System.out.printf("Kupujesz produkt za %5.2fzł na ilość rat: %2d.\n", cena, raty);
        System.out.println("No to działamy!");
        System.out.println("...\n...\n...");
        double procent;
        if (raty <= 12) {
            procent = 0.025;
        } else if (raty >= 25) {
            procent = 0.1;
        } else {
            procent = 0.05;
        }
        double wynik = cena / raty + cena / raty * procent;
        System.out.printf("Twoja miesięczna rata będzie wynosiła: %4.2fzł," +
                " chyba nie jest tak źle?\n Oprocentowanie to tylko %2.1f%%", wynik,(procent*100));
double calosc;
calosc= cena * procent + cena;
        System.out.printf("\nZapłacisz za całość: %.2f zł", calosc);
    }
}
