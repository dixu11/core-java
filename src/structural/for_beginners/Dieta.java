package structural.for_beginners;

public class Dieta {
//    nie udzielamy porad dla absurdalnych wartości
//    poradnik dietetyczny
//    komunikat i opuszczenie programu - return
//    nie udzielamy porad starszym niż 100 lat inny komunikat
//    porady dla nieletnich opatrzone klauzulą

//    ostre ostrzeżenie dla 10 latków powyżek 100 kg

//    ostrzeżenie anorektyczne >10 lat mniej niż 40 kg i wieszych niż 1m
//    dla cięższych niż 100 kg uwaga w zależności od wzrostu

//    na koniec napisać ile poradnik udzielił porad

    public static void main(String[] args) {
        poradz(28, 106, 185);
        poradz(90, 20, 30);
        poradz(90, 20, 30);
        poradz(90, 20, 30);

    }

    public static void poradz(double wiek, double waga, double wzrost) {
        /*     double test = Math.random();
        double wiek = test * 90 + 10;
        double waga = test * 50 + 100;
        double wzrost = test * 100 + 150; // od 150 do 200*/
        int porady = 0;

//        System.out.printf("Test %.2f\n", test);
        System.out.printf("Wiek: %.0f\n", wiek);
        System.out.printf("Waga: %.0f\n", waga);
        System.out.printf("Wzrost: %.0f\n", wzrost);

        if (wiek > 150 || wiek < 1 || waga < 5 || waga > 300 || wzrost > 250 || wzrost < 25) {
            System.out.println("Program nie obsługuje takich wartości :[\n");
            return;
        } else if (wiek > 100) {
            System.out.println("Panie... Gratuluję pańskiego wieku, to my moglibyśmy uczyć się od Ciebie!");
            return;
        } else if (wiek < 18) {
            System.out.println("Zaraz przygotujemy poradę ale przed zastosowaniem się do niej koniecznie powiadom rodziców o swoich planach żywieniowych!");
        }

        System.out.println("\nPorada:");
        if (waga > 100) {
            if (wiek == 10) {
                porady++;
                System.out.println("Uwaga! Twoja waga jest ZDECYDOWANIE za duża. Stanowi zagrożenie dla życia! Koniecznie przeanalizuj z rodzicami swoją dietę!");
            } else if (wzrost > 200 && waga < 150) {
                porady++;
                System.out.println("Twoja waga jest dosyć duża ale wzrost to uzasadnia więc wszystko jest ok :)");
            }
        }

        if (wiek > 10 && waga < 40 && wzrost > 100) {
            porady++;
            System.out.println("Twoja waga jest za niska... Będziesz wyglądać lepiej jeśli dodasz do swojej diety trochę kalorii. Nie krępuj się :)");
        }

        double bmi = waga / (wzrost*wzrost/100);
        System.out.printf("BMI = %.2f\n", bmi);
        System.out.printf("Udzielonych porad: %d\n", porady);
        System.out.println();
    }

}
