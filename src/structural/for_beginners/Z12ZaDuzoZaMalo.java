package structural.for_beginners;

import java.util.Random;
import java.util.Scanner;

public class Z12ZaDuzoZaMalo {
//    komputer losuje liczbe od 1 do 100 gracz stara się ją zgadnąć. Komputer podpowiada za duzo za malo
//    jak wygra to wyswietla gratulacje
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isInputIncorrect = true;
        boolean isFirstTry = true;
        int number = -1;
        int winningNumber = -1;
        Random losowa = new Random();
        winningNumber = (losowa.nextInt(101))+1;
        while (isInputIncorrect) {
            if (isFirstTry) {
                System.out.println("Spróbuj zgadnąć o jakiej liczbie myślę ;)");
                isFirstTry = false;
            }else {
                System.out.println("No dawaj, spróbuj jeszcze raz!");
            }
            if (input.hasNextInt()) {
                number = input.nextInt();
                if (number == winningNumber) {
                    System.out.println("Trafiłeś właściwą liczbę!");
                    isInputIncorrect = false;
                } else if (number<winningNumber) {
                    if (number + 10 < winningNumber) {
                        System.out.println("Zdecydowanie za mało!");
                    } else {
                        System.out.println("No... troszkę za mało.");
                    }
                }else {
                    if (number - 10 > winningNumber) {
                        System.out.println("Zdecydowanie za dużo!");
                    } else {
                        System.out.println("No... troszkę za dużo.");
                    }
                }
            }
        }
        System.out.println("'Gratulacje!' powiedziałby jakiś nudny program...\n Ale ja wykorzystam ten moment, żeby zareklamować swoją grę!\n Naciśnij ENTER aby kontynuować.");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        System.out.println("\n\n\t\t\t  \uD83D\uDE66 \uD835\uDD78\uD835\uDD86\uD835\uDD88\uD835\uDD86\uD835\uDD94 \uD83D\uDE64 ");
        System.out.println(" Najlepsza gra konsolowa!\n (odpalana w konsoli javy), jedyne 199zł!\n" +
                " zgłoś w ciągu 5 min a otrzymasz karcianą grę Wojna zupełnie za darmo!");
    }
//    29:15min czas wykonania
}
