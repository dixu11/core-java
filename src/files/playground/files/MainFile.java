package files.playground.files;

import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        Scanner czytacz = new Scanner(System.in);
        System.out.println("Ile mam pobrać tych imion?");
        int counter = 0;
        boolean isInputIncorrect = true;
        while (isInputIncorrect) {
            if (czytacz.hasNextInt()) {
                counter = czytacz.nextInt();
                isInputIncorrect = false;
            } else {
                System.out.println("Wprowadź liczbe!");
                czytacz.next();
            }
        }
        String[] imiona = new String[counter];
        System.out.println("No to pisz imiona!");
        for (int i = 0 ; i < counter; i++) {
            imiona[i] = czytacz.next();
            System.out.println(imiona[i]);
        }
        System.out.println("Dziękuję za wpisane imiona");

    }
}
