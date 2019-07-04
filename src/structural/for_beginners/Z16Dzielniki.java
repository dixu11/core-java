package structural.for_beginners;

import java.util.Scanner;

public class Z16Dzielniki {
//    wczytuje liczbę i wyświetla jej dzielniki
    public static void main(String[] args) {
        System.out.println("Nie wiesz co to są Dzielniki? \n" +
                "Ja jeszcze przed chwilą też nie wiedziałem ale już wiem.\n" +
                "Dzielnik to taka wyjątkowa liczba przez którą można podzielić konkretną liczbę.\n" +
                "Dlaczego wyjątkowa? Bo jak podzielisz przez dzielnik to nic nie zostanie na podłodze...\n" +
                "To znaczy... Liczba podzieli się na idealnie równe części!\n\n" +
                "Naciśnij ENTER aby kontynuować.");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        boolean isInputIncorrect = true;
        int number = -1;
        Scanner input = new Scanner(System.in);
        while (isInputIncorrect) {
            System.out.println("Wpisz liczbę a ja Ci podam jej Dzielne Nicki.");
            if (input.hasNextInt()) {
                number = input.nextInt();
                isInputIncorrect = false;
            } else {
                input.next();
            }
        }
        System.out.println("Jej Dzielniki to:");
        for (int i = 1; i < number; i++) {
            if (number%i == 0) {
                System.out.printf("%d, ",i);
            }
        }
    }
//    Zadanie zrobione w 12:04 min

}
