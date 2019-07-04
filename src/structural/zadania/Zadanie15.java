package structural.zadania;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        System.out.println("Bedziemy sprawdzac czy liczba jest pierwsza\n");
        Scanner input = new Scanner(System.in);
        int number = -1;
        boolean isInputIncorrect = true;
        while (isInputIncorrect) {
            System.out.println("Wpisz liczbę, a ja powiem, to liczba pierwsza");
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number > 0) {
                    isInputIncorrect = false;
                }
            } else {
                input.next();
            }
        }
        System.out.printf("Naciśnij ENTER aby kontynuować.\n", number);
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        boolean liczbaPierwsza = true;
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                liczbaPierwsza = false;
            }
        }
        if (liczbaPierwsza) {
            System.out.printf("%d jest liczba pierwsza :)", number);
        } else {
            System.out.printf("Niestety... %d nie jest liczba pierwsza", number);
        }
    }
}

