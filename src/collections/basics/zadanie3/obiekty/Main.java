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
package collections.basics.zadanie3.obiekty;
/*
Dodaj klasę Country która będzie reprezentować dany kraj.
Klasa ta powinna przechowywać pola takie jak nazwa kraju, stolica i liczba ludności.
Zmodyfikuj klasę Countries tak aby w Secie przechowywane były obiekty klasy Country (zamiast String).
Dodaj metodę getInfoByName(name) która zwróci informacjęna temat kraju szukając po nazwie.
Dodaj metodę getCapitalCity(name) która zwróci informację o kraju szukając po nazwie stolicy.
Dodaj klasę User która posiada pola imię oraz nazwisko.
Dodaj do klasy Country pole klasy User które będzie reprezentowało prezydenta danego kraju.

Dodaj metodę getCountriesSortedByPopulation która zwróci wszystkie kraje posortowane
według liczby ludności.Ulepsz swoje sortowanie. Zmodyfikuj poprzednią metodę i zmień jej nazwę na
getCountriesSortedBy(value). Jeśli w miejscu value przekazane zostanie słowo „population” to zwróć
posortowane według populacji. Jeśli „country-name” to posortowane po nazwie kraju a jeśli „capital-
city” to nazwie stolicy.
Dodaj do swojej metody jeszcze jeden parametr - który będzie definiował czy sortowanie ma być w
porządku alfabetycznym czy odwróconym (np. getCountriesSortedBy(„population”, „desc”). ASC znaczy
ciąg alfabetyczny a DESC odwrócony.
Zamień klucze do sortowania na enumeratory.
 */


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Countries europa = new Countries();
        europa.add("Polska","polski",38,"Andrzej Duda");
        europa.add("Polska","polski",38,"Andrzej Duda");
        europa.add("Dania","duński",5 ,"Lars Rasmussen");
        europa.add("Chiszpania","hiszpański", 48,"Pedro Sanchez");

        System.out.println(europa.getAllCountries());

        europa.remove("Dania");
        europa.remove("Niemcy");

        System.out.println(europa.getAllCountries());

        europa.updateCountryName("Chiszpania","Hiszpania");
        europa.updateCountryName("Hiny", "Chiny");
        
        System.out.println(europa.getAllCountries());

        List<String> informacjeODanii = europa.getInfoByName("Polska");
        for (String s : informacjeODanii) {
            System.out.println(s);
        }
        europa.getInfoByName("Rosja");

        List<String> informacjeOHiszpanskimKraju = europa.getInfoByLanguage("hiszpański");
        for (String s : informacjeOHiszpanskimKraju) {
            System.out.println(s);
        }
        europa.getInfoByName("Rosja");

    }
}
