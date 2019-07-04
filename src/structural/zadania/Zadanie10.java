package structural.zadania;//na hashmapach

import java.util.*;

public class Zadanie10 {
    public static void main(String[] args) {
        //program ktory w podanym ciagu slow (zdanie) znajdzie i wyswietli najdlusze i najkrotsze slowo
        String zdanie = "Takie przykladowe zdanie ktore ktore ktore zostalo napisane w jezyku polskim.";
        String zdanie2 = "slowo slowo slowo slowo wrona wrona kot kot kot";
        String zdanie3 = "slowo slowo slowo slowo wrona wrona kot kot kot kot";
        szukaczKrancowychDlugosciSlow(zdanie2);
    }

    private static void szukaczKrancowychDlugosciSlow(String zdanie) {

        Scanner sc = new Scanner(zdanie);
        String najdluzszeSlowo = "";
        String najkrotszeSlowo = "";
        List<String> wszystkieSlowa = new ArrayList<>();
        Map<String, Integer> slowaMapa = new HashMap<>();

        // mozna zrobic przez:
//        String[] splittedText = text.split(" ");

//poszukiwania najdluzszego i najkrotszego slowa
        boolean pierwszaIteracja = true;
        while (sc.hasNext()) {
            String sprawdzaneSlowo = sc.next();
            wszystkieSlowa.add(sprawdzaneSlowo);
            if (sprawdzaneSlowo.length() > najdluzszeSlowo.length()) {
                najdluzszeSlowo = sprawdzaneSlowo;
                if (pierwszaIteracja) {
                    najkrotszeSlowo = najdluzszeSlowo;
                    pierwszaIteracja = false;
                }
            }
            if (sprawdzaneSlowo.length() < najkrotszeSlowo.length()) {
                najkrotszeSlowo = sprawdzaneSlowo;
            }
        }
        System.out.printf("Najdluzsze slowo: %s\n", najdluzszeSlowo);
        System.out.printf("Najkrotsze slowo: %s\n", najkrotszeSlowo);

//        poszukiwania najczestszego i najrzadszego slowa:
// wersja na jednej liscie chodzi srednio
       /* String najczestszeSlowo = "";
        int iloscWystapienSprawdzanego = 0;
        int iloscWystapienNajczestszego = 0;
        List<String> listaNajczestszych = new ArrayList<>();

        for (String s : wszystkieSlowa) {
            for (String s2 : wszystkieSlowa) {
                if (s.equals(s2)) {
                    System.out.printf("zwiekszam bo %s = %s\n", s,s2);
                    iloscWystapienSprawdzanego++;
                }
            }
            if (iloscWystapienSprawdzanego > iloscWystapienNajczestszego) {
                iloscWystapienNajczestszego = iloscWystapienSprawdzanego;
                najczestszeSlowo = s;
                iloscWystapienSprawdzanego = 0;
                listaNajczestszych.clear();
                listaNajczestszych.add(s);
            } else if (iloscWystapienSprawdzanego == iloscWystapienNajczestszego){
                listaNajczestszych.add(s);
            }
            iloscWystapienSprawdzanego = 0;
        }

        if (listaNajczestszych.size() == 1) {
            System.out.printf("Najczestsze slowo to %s i wystepuje %d razy\n", najczestszeSlowo, iloscWystapienNajczestszego);
        } else {
            System.out.printf("%d slow wystepuje równie często, są to:\n", listaNajczestszych.size());
            for (String s : listaNajczestszych) {
                System.out.println(s);
            }
        }*/

        for (String s : wszystkieSlowa) {
            if (!slowaMapa.containsKey(s)) {
                slowaMapa.put(s, 1);
            } else {
                slowaMapa.put(s, slowaMapa.get(s) + 1);
            }
        }

        int iloscWystapienNajczestszego = 1;
        int iloscWystapienNajrzadszego = 1;

        List<String> najczestszeSlowa = new ArrayList<>();
        List<String> najrzadszeSlowa = new ArrayList<>();
        boolean pierwszaIteracja2 = true;

        // można zrobić zmienna boolean czy jest slowo unikalne ktote bedzie
//        przy pierwszym wystapieniu dodawalo slowo z 1 a przy kolejnym tylko zwiekszalo licznik na 2

        for (String s : slowaMapa.keySet()) {
            //najczestsze slowa
            if (slowaMapa.get(s) > iloscWystapienNajczestszego) {
                iloscWystapienNajczestszego = slowaMapa.get(s);
                najczestszeSlowa.clear();
                najczestszeSlowa.add(s);
            } else if (slowaMapa.get(s) == iloscWystapienNajczestszego) {
                najczestszeSlowa.add(s);
            }
            //najrzadsze slowa
            if (pierwszaIteracja2) {
                iloscWystapienNajrzadszego = iloscWystapienNajczestszego;
                pierwszaIteracja2 = false;
            }
            if (slowaMapa.get(s) < iloscWystapienNajrzadszego) {

                iloscWystapienNajrzadszego = slowaMapa.get(s);
                najrzadszeSlowa.clear();
                najrzadszeSlowa.add(s);
            } else if (slowaMapa.get(s) == iloscWystapienNajrzadszego) {
                najrzadszeSlowa.add(s);
            }
        }
        //najczestsze
        if (najczestszeSlowa.size() <= 1) {
            System.out.printf("Najczestsze slowo to: %s i wystepuje %d razy\n", najczestszeSlowa.toString(), iloscWystapienNajczestszego);
        } else {
            System.out.printf("Najczestsze slowa wystepuja %d razy\n", iloscWystapienNajczestszego);
            for (String s : najczestszeSlowa) {
                System.out.printf("Jedno z najczestszych slow: %s\n", s);
            }
        }
        //najrzadsze
        if (najrzadszeSlowa.size() <= 1) {
            System.out.printf("Najrzadsze slowo to: %s i wystepuje %d razy\n", najrzadszeSlowa.toString(), iloscWystapienNajrzadszego);
        } else {
            System.out.printf("Najrzadsze slowa wystepuja %dx\n", iloscWystapienNajrzadszego);
            for (String s : najrzadszeSlowa) {
                System.out.printf("Jedno z najrzadszych slow: %s\n", s);
            }
        }


        //test:
        /*for (String s : slowaMapa.keySet()) {
            System.out.printf("%s : %d\n",s,slowaMapa.get(s));
        }*/

    }

}
