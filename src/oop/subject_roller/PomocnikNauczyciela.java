package oop.subject_roller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PomocnikNauczyciela {

    //POLA / SKŁADOWE / ATRYBUTY

    private String[] pomysly = {
            "Samochod",
            "Listonosz",
            "Pracownik",
            "Telewizor",
            "Ciezarowka",
            "Naukowiec",
            "Papuga",
            "Kwiat",
            "Pralka",
            "Utwor (muzyczny)"
    };

    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    //METODY

    //METODA GŁÓWNA
    public void uruchom() {
        System.out.println("Ile chcesz pomyslow? Maksymalnie można " + pomysly.length);
        int ilosc = scanner.nextInt();
        scanner.nextLine();
        String[] pomysly = losujUnikatowePomysly(ilosc);
        wyswietlPomysly(pomysly);
        wyswietlPomyslDlaNauczyciela(pomysly);
    }


    //METODY POMOCNICZE
    private String[] losujUnikatowePomysly(int ile) {
        if (ile>pomysly.length) {
            System.out.println("Wybrałeś za dużo! Zamykamy program. Życzę szczęścia następnym razem");
            return new String[0];
        }


        String[] wylosowane = new String[ile];

        for (int i = 0; i < wylosowane.length; i++) {
            int indeksPomyslu = random.nextInt(pomysly.length);
            String wylosowany = pomysly[indeksPomyslu];
            usunPomysl(indeksPomyslu);
            wylosowane[i] = wylosowany;
        }

        return wylosowane;
    }

    private void usunPomysl(int indeks) {
        pomysly[indeks] = pomysly[pomysly.length - 1];
        pomysly = Arrays.copyOf(pomysly, pomysly.length - 1);
    }

    private void wyswietlPomysly(String[] pomysly) {
        for (String pomysl : pomysly) {
            System.out.printf("Pomysł na klasę: %s\n", pomysl);
        }
        System.out.println();
        zaczekajNaEnter();
    }

    private void wyswietlPomyslDlaNauczyciela(String[] pomysly) {
        System.out.println("Myślę, że nauczyciel powinien omówić wszystko na przykładzie...\n");
        zaczekajNaEnter();
        int indeksWylosowanego = random.nextInt(pomysly.length);
        System.out.printf("Obiektu %s!!\n", pomysly[indeksWylosowanego]);
        System.out.println("Powodzenia wam oboje!");
    }

    //METODY NARZĘDZIOWE / UNIWERSALNE
    private void zaczekajNaEnter() {
        System.out.println("Naciśnij ENTER aby kontynuować...");
        scanner.nextLine();
    }
}
