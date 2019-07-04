package structural.for_beginners;

import java.util.Scanner;

public class Z17Pierwsza {
//    program sprawdza czy wprowadzona liczba to liczba pierwsza
//    liczba pierwsza ma tylko 2 dzielniki, siebie
    public static void main(String[] args) {
        System.out.println("Chcesz wiedzieć komu nie możesz ufać? Powiem Ci.\n" +
                "Nie możesz ufać liczbom pierwszym, one myślą tylko o sobie i z nikim się nie dzielą.\n");
        Scanner input = new Scanner(System.in);
        int number = -1;
        boolean isInputIncorrect = true;
        while (isInputIncorrect) {
            System.out.println("Wpisz liczbę, a ja powiem, czy można jej zaufać...");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    isInputIncorrect = false;
                }
            } else {
                input.next();
            }
        }
        System.out.printf("Sprawdźmy co mówi przyszłość, sprawdźmy, czy %d można zaufać...\n" +
                "Naciśnij ENTER aby kontynuować.\n", number);
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        boolean liczbaPierwsza = true;
        for (int i = 2; i < number; i++) {
            if (number%i ==0) {
                liczbaPierwsza = false;
            }
        }
        if (liczbaPierwsza) {
            System.out.printf("Niestety... %d nigdy niczym się z Tobą nie podzieli.",number);
        } else {
            System.out.printf("Nie martw się, Twój przyjaciel %d jest godny zaufania. Umie się dzielić po równo...",number);
        }
    }
}
//Zadanie wykonane w 17 min
