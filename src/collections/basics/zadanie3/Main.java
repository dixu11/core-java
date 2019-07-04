/*
1. Utwórz nową klasę Countries a w niej dodaj zbiór pozwalający przechowywać
    pola typu String w kolejności alfoabetycznej.
2. Dodaj metodę add która pozwoli Ci dodać kraj do zbioru.
3. Dodaj metodę getAllCountries która pozwoli pobrać wszystkie zapisane kraje.
4. Zmodyfikuj metodę add aby dodawać tylko kraje które nie zostały wcześniej zapisane.
5. Dodaj metodę remove która pozwoli usuwać przekazany kraj.
6. Dodaj metodę updateCountryName która przyjmuje 2 wartości:
    Nazwa kraju który powinien zostać zmodyfikowany
    poprawiona nazwa kraju
    np. countries.updateCountryName("Polskaa", "Polska");
*/
package collections.basics.zadanie3;

public class Main {
    public static void main(String[] args) {
        Countries europa = new Countries();
        europa.addCountry("Polska");
        europa.addCountry("Polska");
        europa.addCountry("Dania");
        europa.addCountry("Chiszpania");

        System.out.println(europa.getAllCountries());

        europa.removeCountry("Dania");
        europa.removeCountry("Niemcy");

        System.out.println(europa.getAllCountries());

        europa.updateCountry("Chiszpania","Hiszpania");
        europa.updateCountry("Hiny", "Chiny");

        System.out.println(europa.getAllCountries());
    }
}
