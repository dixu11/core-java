package structural.zadania;//4. Napisz algorytm obliczajacy NWD - najwiekszy wspolny dizelnik.

import java.util.ArrayList;
import java.util.List;

public class Zadanie14 {
    public static void main(String[] args) {
        int liczba1 = 777;
        int liczba2 = 1000;
        List<Integer> wspolneDzielniki = zwrocWspolneDzielnikiLiczb(liczba1, liczba2);
        System.out.printf("Wspolne dzielniki liczb %d i %d to: \n", liczba1,liczba2);
        for (Integer integer : wspolneDzielniki) {
            System.out.println(integer);
        }
    }

    private static List<Integer> zwrocWspolneDzielnikiLiczb(int liczba1, int liczba2) {
        List<Integer> dzielniki1 = uzupelnijDzielnikiLiczby(liczba1);
        List<Integer> dzielniki2 = uzupelnijDzielnikiLiczby(liczba2);
        dzielniki1.retainAll(dzielniki2);

        return dzielniki1;
    }

    private static List<Integer> uzupelnijDzielnikiLiczby(int liczba) {
        List<Integer> dzielnikiLiczby = new ArrayList<>();
        for (int i = 1; i < liczba; i++) {
            if (liczba%i == 0) {
                dzielnikiLiczby.add(i);
//                System.out.println("dodaje i: " + i);
            }
        }
        return dzielnikiLiczby;
    }

   /* private static int pobierzLiczbe() {
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
        return number;
    }*/
}
