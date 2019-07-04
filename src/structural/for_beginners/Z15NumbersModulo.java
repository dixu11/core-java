package structural.for_beginners;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Z15NumbersModulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int wynik = 0;
        String stringNumber = "none";
        int number = -1;
        boolean isInputIncorrect = true;
        while (isInputIncorrect) {
            System.out.println("Chopie. Podaj mie liczbę.");
            if (input.hasNextInt()) {
                stringNumber = Integer.toString(input.nextInt());
                isInputIncorrect = false;
            } else {
                input.next();
            }
        }
        System.out.println("Doskonale. Teraz magiczna sztuczka, uwaga.");
//        można to zrobić bez listy, tak jak zrobiłem to w jednym z wcześniejszych ale jest trudniej
        List<Integer> parzyste = new ArrayList<>();
        List<Integer> nieparzyste = new ArrayList<>();
        for (int i = 0; i<stringNumber.length();i++) {
            number = Integer.parseInt(stringNumber.substring(i,i+1));
            wynik += number;
            if (number % 2 != 0) {
                nieparzyste.add(number);
            } else {
                parzyste.add(number);
            }
        }
        System.out.printf("Suma wszystkich cyfr Twojej liczby wynosi: %d\n\n",wynik);
        System.out.println("Parzyste:");
        double sredniaParzyste = 0;
        for (int i :
                parzyste) {
            System.out.printf("%d, ",i);
            sredniaParzyste += i;
        }
        if (parzyste.size() != 0) {
            sredniaParzyste = sredniaParzyste / parzyste.size();
        }
        System.out.println("\nNieparzyste:");
        double sredniaNieparzyste = 0;
        for (int i :
                nieparzyste) {
            System.out.printf("%d, ",i);
            sredniaNieparzyste += i;
        }
        if (nieparzyste.size() != 0) {
            sredniaNieparzyste = sredniaNieparzyste / nieparzyste.size();
        }
        System.out.printf("\nśrednia parzystych: %.2f", sredniaParzyste);


        System.out.printf("\nśrednia nieparzystych: %.2f", sredniaNieparzyste);
        double stosunek = sredniaParzyste / sredniaNieparzyste;
        System.out.printf("\nStosunek parzystych do nieparzystych wynosi: %.2f", (stosunek));
    }
}
//zadanie wykonane w 37:40min
