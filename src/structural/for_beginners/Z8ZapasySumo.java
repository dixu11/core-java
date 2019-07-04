package structural.for_beginners;

import java.util.Scanner;

public class Z8ZapasySumo {
//    pobieramy 2 liczby pierwsza mniejsza od drugiej
//    sumowanie ciągu liczb od a do b włącznie
//    while, dowhile, for

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInputIncorrect = true;
        int liczba1 = -1;
        while (isInputIncorrect) {
            System.out.println("Podaj pierwszą liczbę:");
            if (input.hasNextInt()) {
                liczba1 = input.nextInt();
                isInputIncorrect = false;
            } else {
                input.next();
            }
        }
        isInputIncorrect = true;
        int liczba2 = -1;
        while (isInputIncorrect) {
            System.out.println("Podaj drugą liczbę liczbę (większą od pierwszej):");
            if (input.hasNextInt()) {
                liczba2 = input.nextInt();
                if (liczba2 > liczba1) {
                    isInputIncorrect = false;
                }
            } else {
                input.next();
            }
        }
        int counter = liczba1;
        int wynik = liczba1;
        while (counter <liczba2) {
            wynik+=counter+1;
            counter++;
        }
        System.out.printf("Pętla while powiedziała: %d\n",wynik);

        counter = liczba1;
        wynik = liczba1;
        do {
            wynik+=counter+1;
            counter++;
        }
            while (counter <liczba2) ;
        System.out.printf("Pętla do while powiedziała: %d\n", wynik);



        wynik = liczba1;
        for (int i = liczba1; i < liczba2; i++) {
            wynik += i +1;
        }
        System.out.printf("Pętla for powiedziała: %d\n", wynik);
    }
}
