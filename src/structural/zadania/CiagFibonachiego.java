package structural.zadania;

import java.util.ArrayList;
import java.util.List;
//silnia
//rekurencja
public class CiagFibonachiego {
    public static void main(String[] args) {
        List<Integer> mojCiagFibonachiego = wygenerujCiagFibonachiego();
        for (Integer integer : mojCiagFibonachiego) {
            System.out.printf("Liczba: %d\n", integer);
        }
    }

    private static List<Integer> wygenerujCiagFibonachiego() {
        List<Integer> ciagFib = new ArrayList<>();
        while (dodajKolejnaLiczbe(ciagFib) >0) {
            ciagFib.add(dodajKolejnaLiczbe(ciagFib));
        }
        return ciagFib;
    }

    private static int dodajKolejnaLiczbe(List<Integer> lista) {
        int suma = 0;
        if (lista.size() > 1) {
               suma += lista.get(lista.size()-2);
               suma += lista.get(lista.size()-1);
        } else {
            suma++;
        }
        return suma;
    }
}
