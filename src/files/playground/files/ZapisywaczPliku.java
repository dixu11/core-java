package files.playground.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ZapisywaczPliku {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("plik.txt", false);
//            append true zeby nie tworzylo nowego pliku
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("zapiszmietomaszyno gupiaty");
        bufferedWriter.flush(); // zrzucenie wszystkiego do pliku | bezpieczne usuwanie pendrive
        bufferedWriter.close(); // must have!!! inny program nie moze tego otworzyc

        FileWriter fileWriter1 = new FileWriter("Daniel.txt");
        BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
        bufferedWriter1.write("101010 karbunkuły");
        bufferedWriter1.flush();
        bufferedWriter1.close();

        Scanner czytacz = new Scanner(new File("Daniel.txt")); // new File!!
        String linia = czytacz.nextLine();
        String[] tablica = linia.split(" ");//zwraca tablice stringów 2elementową
        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        int liczba = Integer.parseInt(tablica[0]);
//        pdfy drukujace bilet... itd


//        wczesniej mielismy odczytac sama cyfre, potem sam string a teraz jedno i drugie, podzielic i zapisac w tablicy stringów
    }
}
