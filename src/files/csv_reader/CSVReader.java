package files.csv_reader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*

1. Please download a CSV file containing the stock history of 3 companies, for example:
        http://finance.yahoo.com/q/hp?s=GOOG
        http://finance.yahoo.com/q/hp?s=IBM
        http://finance.yahoo.com/q/hp?s=MSFT

        (Download Data)
        Save files giving them different names to a location on your drive

        2. Write a program that searches for CSV files with stock rates in a given folder and for every one of them:

        3. Calculates the percentage change betweeen Close and Open price and adds these values as another column to this CSV file.
        You can replace the old file or create a new one.

        Change = (Close-Open)/Open

        Note, you can also use data from Stooq - in that case you can use the FileDownloader to automatically download data from the site.
*/

// aby program zadziałał jak należy trzeba najpierw odpalić FileDownloader - on ściągnie pliki
// następnie żeby zmodyfikować pliki - CSVReader


public class CSVReader {
    public static void main(String[] args) throws IOException {
        String directory = "."; // sciezka do pliku oznaczajaca główny folder projektu
        File mainFolderDirectory = new File(directory); // tworzę ścieżkę do foldera głównego
        List<File> csvFiles = new ArrayList<>(); // tworzę listę do której zapiszę nazwy plików CSV
        for (File file : mainFolderDirectory.listFiles()) { // dostaję się do listy plików w folderze i je przeglądam
            if (file.getName().contains(".csv")) { // jeśli plik kończy się na .csv to...
                csvFiles.add(file);// dodaję go do listy
            }
        }
        for (File csvFile : csvFiles) { // przeglądam listę plików CSV
            // tworzę listę zawartości plików
            // dodaję do niej całą zawartość pliku dzięki narzędziu w bibliotece Files
            // metoda readAllLines wymaga pliku typu Path, więc korzystając z biblioteki Paths przekształcam
            // zwrócony przez metodę .getPath String do typu opiektowego Path
            List<String> content = Files.readAllLines(Paths.get(csvFile.getPath()));
            List<String> newContent = new ArrayList<>();
            int numerKolumnyZamkniecia = 0;
            int numerKolumnyOtwarcia = 0;
            boolean firstLine = true;
            for (String line : content) {
                // przeksztalcam kazda linie pliku tak, żeby mieć tablicę słów które były rozdzielone przecinkiem
                String[] lineArray = line.split(",");
                //tylko w przypadku pierwszej linii chcę uaktualniać zmienne informujące o pozycji kolumn
                if (firstLine) {
                    for (int i = 0; i < lineArray.length; i++) {
                        switch (lineArray[i]) {
                            case "Otwarcie":
                                numerKolumnyOtwarcia = i;
                                break;
                            case "Zamkniecie":
                                numerKolumnyZamkniecia = i;
                                break;
                        }
                    }
                    line += ",Zmiana";
                    System.out.println(line);
                    firstLine = false;// zmieniam przelacznik first line aby ten if wykonał się tylko dla pierwszej linii pliku
                } else {
                    double close = Double.parseDouble(lineArray[numerKolumnyZamkniecia]); // zmieniam wartość na int
                    double open = Double.parseDouble(lineArray[numerKolumnyOtwarcia]);
                    double change = (close - open) / open;
                    // uzywam string formata aby przyciac liczbe do 2 znakow po przecinku
                    // niestety otrzymana liczba ma w tresci przecinek a powinna miec kropke
                    // dzieki metodzie Stringa .replace - zmieniam to
                    String changeAsString = String.format("%.5f", change).replace(',', '.');
                    line += "," + changeAsString;
                    System.out.println(line);
                }
                newContent.add(line);
            }
            System.out.println("File: " + csvFile.getName());
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(csvFile));
            for (String line : newContent) {
                bufferedWriter.write(line+"\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
}
