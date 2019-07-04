package structural.projects;

// plansza 10 / 10
// system losuje 1-0
// 2 lub 3 sasiadów przezywaja
// po drugiej jesli maja 1 lub 2 sasiadow

import java.util.Arrays;
import java.util.Random;

public class Cywilizacja {
    static int[][] plansza = new int[10][10];
    static int[][] planszaTestowa;

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza[i].length; j++) {
                plansza[i][j] = random.nextInt(2);
            }
        }
        wyswietlPlansze();
        przygotujTestowa();
        odsiewanie(2,3); // minimum 2
        System.out.println("\n----------------------------\n");
        wyswietlPlansze();
        System.out.println("\n----------------------------\n");
        przygotujTestowa();
        odsiewanie(1,2); // minimum 1
        wyswietlPlansze();
    }

    public static void wyswietlPlansze() {
        for (int[] liczby : plansza) {
            for (int liczba : liczby) {
                System.out.printf(" %d ", liczba);
            }
            System.out.println();
        }
    }

    public static void wyswietlPlanszeTestwa() {
        for (int[] liczby : planszaTestowa) {
            for (int liczba : liczby) {
                System.out.printf(" %d ", liczba);
            }
            System.out.println();
        }
    }

    public static void przygotujTestowa() {
        planszaTestowa = Arrays.copyOf(plansza, 10);
    }

    public static void odsiewanie(int wymagani1, int wymagani2) {
//        System.out.println("zaczynam odsiewac");
        for (int i = 0; i < planszaTestowa.length; i++) {
            for (int j = 0; j < planszaTestowa[i].length; j++) {
//                System.out.printf(" odsiewam: %d, %d\n",i, j);
                if (planszaTestowa[i][j] == 1) {
                    int sasiedzi = countNeighbours(i, j);
//                    System.out.println("Znalazlem jedynke! ma " + sasiedzi + "sasiadow");
                    if  (sasiedzi != wymagani1 && sasiedzi != wymagani2) {
                        plansza[i][j] = 0;
//                        System.out.println("odsiany");
                    }
                }

            }
        }
    }

    public static int countNeighbours(int y, int x) {  // zle dla 4 . 9 z wszystkimi
//        System.out.printf(" otrzymane dane: %d, %d\n", y, x);
        int counter = 0;
        if (x - 1 > -1) {
//            System.out.println("sprawdzmy lewego");
            if (planszaTestowa[y][x-1] == 1) {
//                System.out.println("sasiad lewy znaleziony!"); // nie dziala przy rogu - 0.9
                counter++;
//                System.out.println("sasiad!");
            }
        }
        if (x + 1 < 10) {
            if (planszaTestowa[y][x + 1] == 1) {
//                System.out.println("sasiad prawy znaleziony!"); // dobrze
                counter++;
//                System.out.println("sasiad!");
            }
        }
        if (y - 1 > -1) {
            if (planszaTestowa[y - 1][x] == 1) {
//                System.out.println("sasiad gorny znaleziony!"); // zle
                counter++;
//                System.out.println("sasiad!");
            }
        }
        if (y + 1 < 10) {
            if (planszaTestowa[y + 1][x] == 1) {
//                System.out.println("sasiad dolny znaleziony!");
                counter++;
//                System.out.println("sasiad!");
            }
        }
//        System.out.println("zwracam: " + counter);
        return counter;
    }
}
