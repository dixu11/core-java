package files.playground;
/*
Napisz program, w którym przygotujesz listę napisów. Każdy element tej
        listy to nazwa pliku tekstowego. Przygotuj w wybranej przez Ciebie
        lokalizacji pliki tekstowe o nazwach, które umieścisz w liście.
        Następnie przygotuj nową listę, w której na i-tej pozycji umieścisz
        zawartość pliku tekstowego o nazwie przechowanej na i-tej pozycji
        pierwszej listy. Każdy element drugiej listy zmień w taki sposób, żeby
        każdy wyraz zaczynał się z dużej litery, a następnie zawierał same
        małe litery. Znaki inne niż litery pozostawiamy bez zmian. Następnie
        nadpisz zawartość plików tak zmodyfikowanymi napisami z drugiej listy.

        1 godz. 29 min 20 s
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EditingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> napisy = new ArrayList<>(Arrays.asList("tekst", "imie", "nazwisko", "koza"));
        List<String> zawartosciPlikow = new ArrayList<>();
        for (String nazwa : napisy) {

            File file = new File("src/kolekcje/" + nazwa + ".txt");
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String line = "";
            if (scanner != null) {
                while (scanner.hasNextLine()) {
                    line += scanner.nextLine();
                }
            }
            zawartosciPlikow.add(line);
        }

        for (String tekst : zawartosciPlikow) {
            System.out.println("Plik: " + tekst);
        }

        Scanner scanner2 = new Scanner("tekst tekst mój tekst \ntekst tada");
        List<String> lines = new ArrayList<>();
        while (scanner2.hasNextLine()) {
            lines.add(scanner2.nextLine());
        }
        for (String line : lines) {
            String[] strings = line.split(" ");
            String modifiedWord = "";
            for (String string : strings) {
                modifiedWord = string.toLowerCase();
//                modifiedWord = modifiedWord.
            }
        }


        String name  = "stackoverflow";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }
}
