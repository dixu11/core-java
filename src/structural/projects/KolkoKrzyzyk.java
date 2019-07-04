package structural.projects;

import java.util.Scanner;

public class KolkoKrzyzyk {
    public static char[][] plansza = new char[3][3];
    public static char neutralnePole = '-';

    public static void main(String[] args) {
        graj();
    }

    public static void graj() {
        przygotujPlansze();
        boolean graTrwa;
        boolean graczPierwszy = true;
        do {
            wyswietlPlansze();
            if (graczPierwszy) {
                turaGracza('X');
                graczPierwszy = false;
            } else {
                turaGracza('O');
                graczPierwszy = true;
            }
            graTrwa = czyGraTrwa();
            System.out.println("gra trwa?" + graTrwa);
        } while (graTrwa);
    }

    public static boolean czyGraTrwa() {
        if (czyKtosWygral()) {
            return false;
        }
        if (czyJestMiejsce()) {
            return false;
        }
        return true;
    }

    public static boolean czyKtosWygral() {
        char wynikPoziomu = sprawdzPoziom();
        char wynikPionu = sprawdzPion();
        char wynikPrzekatnej = sprawdzPrzekatne();
        if (czyZwyciezca(wynikPionu) || czyZwyciezca(wynikPoziomu) || czyZwyciezca(wynikPrzekatnej)) {
            return true;
        }
        return false;
    }

    public static boolean czyZwyciezca(char wynikSprawdzenia) {
        if (wynikSprawdzenia == 'O') {
            System.out.println("Wygrywa grający O!!");
            return true;
        } else if (wynikSprawdzenia == 'X') {
            System.out.println("Wygrywa grający X!!");
            return true;
        } else {
            return false;
        }
    }

    public static char sprawdzPoziom() {
        for (int i = 0; i < plansza.length; i++) {
            char sprawdzany = plansza[i][0];
            if (sprawdzany != neutralnePole) {
                if (sprawdzany == plansza[i][1] && sprawdzany == plansza[i][2]) {
                    return sprawdzany;
                }
            }
        }
        return neutralnePole;
    }

    public static char sprawdzPion() {
        for (int i = 0; i < plansza[0].length; i++) {
            char sprawdzany = plansza[0][i];
            if (sprawdzany != neutralnePole) {
                if (sprawdzany == plansza[1][i] && sprawdzany == plansza[2][i]) {
                    return sprawdzany;
                }
            }
        }
        return neutralnePole;
    }

    public static char sprawdzPrzekatne() {
        char srodek = plansza[1][1];
        if (srodek != neutralnePole) {
            if (srodek == plansza[0][0] && srodek == plansza[2][2]) {
                return srodek;
            } else if (srodek == plansza[0][2] && srodek == plansza[2][0]) {
                return srodek;
            }
        }
        return neutralnePole;
    }

    public static boolean czyJestMiejsce() {
        for (char[] wiersz : plansza) {
            for (char znak : wiersz) {
                if (znak == '-') {
                    return true;
                }
            }
        }
        return false;
    }

    public static void przygotujPlansze() {
        plansza = new char[3][3];
        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                plansza[i][j] = '-';
            }
        }
    }

    public static void wyswietlPlansze() {
        System.out.println("  A B C");
        for (int i = 0; i < plansza.length; i++) {
            System.out.print(i + 1 + " ");
            for (char znak : plansza[i]) {
                System.out.print(znak + " ");
            }
            System.out.println();
        }
    }

    public static void wprowadzZnak(int y, int x, char znak) {
        plansza[y][x] = znak;
    }

    public static void turaGracza(char gracz) {
        System.out.println("Tura gracza: " + gracz);
        int y = wprowadzWspolrzednaY();
        int x = wprowadzWspolrzednaX();
        plansza[y][x] = gracz;
    }

    private static int wprowadzWspolrzednaX() {
        char wprowadzona;
        do {
            System.out.println("Wprowadź współrzędną X z zakresu A - C");
            Scanner scanner = new Scanner(System.in);
            wprowadzona = scanner.nextLine().charAt(0);
            wprowadzona = Character.toLowerCase(wprowadzona);
        } while (wprowadzona < 'a' || wprowadzona > 'c');
        switch (wprowadzona) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
        }
        return -1;
    }

    public static int wprowadzWspolrzednaY() {
        int wprowadzona;
        do {
            System.out.println("Wprowadź współrzędną Y z zakresu 0 - " + plansza.length);
            Scanner scanner = new Scanner(System.in);
            wprowadzona = scanner.nextInt();
        } while (wprowadzona < 0 || wprowadzona > plansza.length);
        return wprowadzona -1;
    }
}
