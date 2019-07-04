package collections.implementations.arra_list.md;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

//        new arra_list.Runner().run();


        Integer[] tablica = {34, 56, 678, 23};
        int[] tablica2 = {0,0,0,0};

        System.out.println(Arrays.toString(tablica2));

        for (int i = 0; i < tablica.length; i++) {
            tablica2[i] = tablica[i];
        }


        System.out.println(tablica[2]);

        System.out.println(Arrays.toString(tablica2));


            Uzytkownik uzytkownik1 = new Uzytkownik();
        uzytkownik1.zmienImie("Marcin");
        uzytkownik1.wiek = 18;
        Uzytkownik uzytkownik2 = new Uzytkownik();
        uzytkownik2.zmienImie("Radek");
        uzytkownik2.wiek = 30;

        Uzytkownik uzytkownik3 = new Uzytkownik();
        uzytkownik3.zmienImie("Radek");
        uzytkownik2.wiek = 30;

       MyArrayList<Uzytkownik> uzytkownicy = new MyArrayList<>();



        uzytkownicy.add(uzytkownik1);
        uzytkownicy.add(uzytkownik2);
        uzytkownicy.add(uzytkownik2);
        uzytkownicy.add(uzytkownik2);
        uzytkownicy.add(uzytkownik2);
        uzytkownicy.add(uzytkownik2);

        uzytkownicy.indexOf(uzytkownik2);
        uzytkownicy.indexOf(uzytkownik3);

        System.out.println(uzytkownicy);

        System.out.println(uzytkownicy.size());


        Uzytkownik odczytany1 = uzytkownicy.get(0);
        Uzytkownik odczytany2 = uzytkownicy.get(1);

        System.out.println(odczytany1);

        System.out.println(odczytany2);


        ArrayList<Integer> lis = new ArrayList<>();

        lis.toArray(tablica);

        Collection lista = lis;



    }

}
