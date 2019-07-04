//zadanie domowe

//1. Utwórz klasę Person reprezentującą osobę - imie, nazwisko, data urodzenia (localDate)
//2. Dodaj klasę PersonService która będzie imitacją bazy danych.
//3. W klasie PersonService dodaj HashMapę która będzie przechowywała
//   listę użytkowników
//4. Kluczem w mapie powinien być Integer który będzie reprezentował ID użytkownika.
//5. Dodaj metody:
//    Dodawanie użytkowników
//    Usuwanie użytkowników po przekazaniu Stringa - nie ważne czy przekazane
//      zostało imie czy nazwisko
//    Modyfikowanie użytkowników - przekazujemy klucz oraz zmodyfikowany obiekt
//    person
//6. Do klasy Person dodaj metodę getAge obliczającą wiek z daty urodzenia.
//7. Do klasy PersonService dodaj metodę getYounger i getOlder oraz przekazując
//   np. 18 zwróć liczbę osób starszych/młodszych.
//8. Dodaj do klasy Person pole email i zmodyfikuj klasę PersonService tak aby
//   dodawani użytkownicy posiadali unikatowe adresy mailowe.
//9. Dodaj do klasy Person pole password i zmodyfikuj PersonService tak aby zapisywać użytkowniuków
//   tylko wtedy kiedy długość hasła jest dłuższa niż 8.
//10.Dodaj do klasy PersonService metodę login(login,password)
//   która zwróci true/false jeśli w naszej "bazie" znajdzie
//   się użytkownik który posiada zapisane konto z przekazanym loginem i hasłem.

package collections.basics.zadanie2.part1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    }
}
