package structural.zadania;

import java.util.ArrayList;
import java.util.List;

public class Zadanie13 {
    public static void main(String[] args) {
        List<Integer> mojCiagFibonachiego = new ArrayList<>();
        zapelnijListeCiagiemFibonachiego(mojCiagFibonachiego);
        for (Integer integer : mojCiagFibonachiego) {
            System.out.printf("Liczba: %d\n", integer);
        }
    }



    private static List<Integer> zapelnijListeCiagiemFibonachiego(List<Integer> lista) {
        int suma = 0;
        if (lista.size() > 1) {
            suma += lista.get(lista.size()-2);
            suma += lista.get(lista.size()-1);
        } else {
            suma++;
        }
        if (suma > 0) {
            lista.add(suma);
            zapelnijListeCiagiemFibonachiego(lista);
            return lista;
        } else {
            return lista;
        }
    }
}
