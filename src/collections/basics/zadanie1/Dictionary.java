//        1. Utworz klase Dictionary, ktora bedzie reprezentowala slownik.
//        2. Dodac mozliwosc dodawania i przechowywanie slow polskich wraz z tlumaczeniem ( poki co 1 polskie slowo = 1 tlumaczenie)
//        3. Zmodyfikuj poprzednia metode tak aby nie dodawac do slownika PL slow ktore juz istnieja
//        4. Zaimplementuj mechanizm wyszukiwania haseł, np. printTranslation("pilka");
//        5. Dodaj mozliwosc modyfikacji tlumaczen, np. dictionary.remove("pilka");
//        6. dodaj funkcjonalnosc pobierania wszystkich haseł: getAll();
//        7. Zmodyfikuj slownik w taki sposob aby 1 slowo polskie moglo posiadac
//              kilka zagranicznych tlumaczen (wartośćią w Twojej mapie będzie lista typu String)
//        8. Zmodyfikuj wyszulkiwanie haseł tak aby bez podania pełnego zwrotu znaleźć hasła które spełniają kryteria wyszukiwania,
//             np. po wywołaniu: dictuonary.search("ho"); wynikiem niech bedzie lista pasujących haseł.


package collections.basics.zadanie1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private Map<String, List<String>> zeszyt = new HashMap<>();

    public List<String> getAll() {
        List<String> tlumaczenia = new ArrayList<>();
        for (String key : zeszyt.keySet()) {
            tlumaczenia.addAll(zeszyt.get(key));
            for (String s : zeszyt.get(key)) {
                System.out.printf("dodaje Ci do zwracanej listy slowo: '%s'\n", s);
            }
        }
        return tlumaczenia;
    }

    public void remove(String slowo) {
        if (zeszyt.containsKey(slowo)) {
            zeszyt.remove(slowo);
            System.out.printf("Wywalam ze slownika slowo: '%s'\n", slowo);
        } else {
            System.out.printf("Slowa '%s' nie ma w naszym slowniku śmieszny człowieku :)\n", slowo);
        }
    }

    public void addWord(String slowo, List<String> tlumaczenia) {
        if (zeszyt.containsKey(slowo)) {
            zeszyt.get(slowo).addAll(tlumaczenia);
            System.out.printf("Do tlumaczen slowa '%s' dodalem nowe tlumaczenia.\n", slowo);
        } else {
            zeszyt.put(slowo, tlumaczenia);
            System.out.printf("Dodalem slowo '%s' i jego nowe tlumaczenia.\n", slowo);
        }
    }

    public void addWord(String slowo, String tlumaczenie) {
        if (!zeszyt.containsKey(slowo)) {
            List<String> noweTlumaczenia = new ArrayList<>();
            noweTlumaczenia.add(tlumaczenie);
            zeszyt.put(slowo, noweTlumaczenia);
            System.out.printf("Slowo '%s' zostalo dodane do slownika jako '%s'\n", slowo, tlumaczenie);
        } else if (zeszyt.get(slowo).contains(tlumaczenie)) {
            System.out.printf("Tlumaczenie '%s' widnieje juz w naszym slowniku :)\n", tlumaczenie);
        } else {
            zeszyt.get(slowo).add(tlumaczenie);
            System.out.printf("Slowo '%s' zostalo dodane do slownika jako '%s'\n", slowo, tlumaczenie);
        }
    }

    //wersja prosta
    /*public List<String> printTranslation(String slowo) {
        if (zeszyt.containsKey(slowo)) {
            for (String tlumaczenia : zeszyt.get(slowo)) {
                System.out.printf("'%s' to w tlumaczeniu: '%s'\n", slowo, tlumaczenia);
            }
            return zeszyt.get(slowo);
        } else {
            System.out.printf("W naszym slowniku nie ma slowa: '%s' :( \n", slowo);
            return null;
        }
    }*/

    //    wersja wyszukujaca skroty
    public void printTranslation(String slowo) {
            for (String s : zeszyt.keySet()) {
                if (s.length() >= slowo.length() && s.substring(0, (slowo.length())).equals(slowo)) {
                    //zamiast substring mozna .contains albo .startsWith
                    System.out.printf("%s = %s\n", s, zeszyt.get(s));
                }
            }
    }

    public List<String> getWords(String slowo) {
        List<String> znalezione = new ArrayList<>();
        for (String s : zeszyt.keySet()) {
            if (s.length() >= slowo.length() && s.substring(0, (slowo.length())).equals(slowo)) {
                znalezione.add(s);
            }
        }
        if (znalezione.isEmpty()) {
            System.out.println("Nic nie znalazlem");
        }
        return znalezione;
    }


    public void printAllTranslations() {
        for (String key : zeszyt.keySet()) {
            for (String tlumaczenie : zeszyt.get(key)) {
                System.out.printf("%s = %s\n", key, tlumaczenie);
            }
        }
    }


}
