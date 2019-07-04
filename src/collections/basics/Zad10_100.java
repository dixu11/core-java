package collections.basics;
/*2. Napisz program, w którym wylosujesz do listy n liczb całkowitych.
        Wartość zmiennej n oraz elementy kolekcji losowane są z przedziału
<10, 100>. Następnie zaimplementuj nową listę, w której z wygenerowanej
        wcześniej listy umieścisz tylko te elementy, które są liczbami
        pierwszymi. Na koniec utwórz listę napisów. Element listy napisów na
        i-tej pozycji powstaje jako słowna reprezentacja
        największej z cyfr i-tego elementu listy liczb pierwszych. Przykładowo
        jeżeli w liście liczb pierwszych mamy liczbę 31, to jej słowna
        reprezentacja w liście napisów to TRZY, ponieważ 3 jest największą
        cyfrą liczby 31. Zapisz otrzymaną listę napisów do pliku tekstowego o
        wybranej przez Ciebie nazwie.*/

import java.util.*;

public class Zad10_100 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(90) + 10;
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(90) + 10);
        }

        System.out.println(3872%10);
        System.out.println(3872/10%10);
        System.out.println(3872/100%10);

        int liczba2 = 323232357;
        String liczbaString = String.valueOf(liczba2);
//        liczbaString.retain
        char[] cyfry =  liczbaString.toCharArray();
        int liczba =  Integer.parseInt(String.valueOf(cyfry[0]));

    }

    public static List<Integer> filterFirsts(List<Integer> lista) {
        List<Integer> listaPierwszych = new ArrayList<>(lista);
        for (Integer liczba : listaPierwszych) {
            boolean liczbaPierwsza = true;
            for (int i = 2; i < liczba; i++) {
                if (liczba%i ==0) {
                    liczbaPierwsza = false;
                }
            }
            if (liczbaPierwsza) {
                listaPierwszych.add(liczba);
            }
        }
        return listaPierwszych;
    }

    public static List<String> szykujListeNajwyzszychCyfrSlownie(List<Integer> listaLiczb) {
        Map<Integer, String> slownaReprezentacja = new HashMap<>();
        slownaReprezentacja.put(0, "zero");
        slownaReprezentacja.put(1, "jeden");
        slownaReprezentacja.put(2, "dwa");
        slownaReprezentacja.put(3, "trzy");
        slownaReprezentacja.put(4, "cztery");
        slownaReprezentacja.put(5, "piec");
        slownaReprezentacja.put(6, "szesc");
        slownaReprezentacja.put(7, "siedem");
        slownaReprezentacja.put(8, "osiem");
        slownaReprezentacja.put(9, "dziewiec");
        for (Integer liczba : listaLiczb) {

        }
        return null;
    }
}

