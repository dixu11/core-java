package structural.zadania;

import java.util.LinkedList;
import java.util.List;

public class Zadanie11i12 {
    public static void main(String[] args) {
        List<Integer> silnia = new LinkedList<>();
        zapelnijSilnia(silnia);
        for (Integer integer : silnia) {
            System.out.println(integer);
        }
    }

    private static List<Integer> zapelnijSilnia(List<Integer> silnia) {
        if (silnia.size() == 0) {
            silnia.add(1);
        }
        int wynik = 1;
        for (int i = 1; i < silnia.size(); i++) {
            wynik *= i + 1;
        }
        if (wynik > 0) {
            silnia.add(wynik);
            zapelnijSilnia(silnia);
            return silnia;
        } else {
            return silnia;
        }

    }
}
