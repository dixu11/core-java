package structural.projects;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        // wprowadzanie liczb
        int pula = 6;
        System.out.println("Wprowadź " + pula + " liczb od 1 do 24\n");
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int[] wybrane = new int[pula];
        for (int i = 0; i < wybrane.length; i++) {
            boolean czyPoprawna = false;
            do {
                System.out.println("Wprowadź " + (i + 1) + " liczbę:");
                int wprowadzona = input.nextInt();
                input.nextLine();
                if (wprowadzona > 0 && wprowadzona <= 24) {
                    wybrane[i] = wprowadzona;
                    czyPoprawna = true;
                } else {
                    System.out.println("\t#Wprowadzono nieprawidłową liczbę.\n");
                }
            } while (!czyPoprawna);
        }
        System.out.println("Wprowadzone liczby:");
        for (int wybrana : wybrane) {
            System.out.print(wybrana + " ");
        }

        //losowanie
        System.out.println("\n\nRozpoczynam losowanie!\n");
        int[] wylosowane = new int[pula];
        for (int i = 0; i < wylosowane.length; i++) {
            wylosowane[i] = random.nextInt(24) + 1;
        }
        System.out.println("Wylosowane liczby: ");
        for (int wylosowana : wylosowane) {
            System.out.print(wylosowana + " ");
        }

        //porównywanie liczb
        System.out.println("\nSprawdźmy ile trafień...\n");
        int iloscTrafien = 0;
        for (int wylosowana : wylosowane) {
            for (int wybrana : wybrane) {
                if (wylosowana == wybrana) {
                    System.out.println("Trafiona liczba: " + wybrana + "!");
                    iloscTrafien++;
                }
            }
        }

        //ogłaszanie wyników
        if (iloscTrafien == 0) {
            System.out.println("Niestety nie trafiłeś żadnej liczby...\n" +
                    "Spróbuj szczęścia następnym razem!");
        } else {
            System.out.println(iloscTrafien + " trafionych liczb!\n");
        }
        double nagroda;
        switch (iloscTrafien) {
            case 3:
                nagroda = 16;
                break;
            case 4:
                nagroda = 200;
                break;
            case 5:
                nagroda = 4_000;
                break;
            case 6:
                nagroda = 1_500_000;
                break;
            default:
                nagroda = 0;
        }
        System.out.println("Twoja nagroda to: " + nagroda + "zł");
    }
}

//dodać zapisywanie trafionych do nowej listy
//int[] trafione = new int[6];
