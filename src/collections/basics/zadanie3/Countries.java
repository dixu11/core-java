package collections.basics.zadanie3;

import java.util.Set;
import java.util.TreeSet;

public class Countries {
    private Set<String> panstwa = new TreeSet<>();

    public void addCountry(String panstwo) {
        if (!panstwa.contains(panstwo)) {
            panstwa.add(panstwo);
        } else {
           bladWprowadzaniaDanych("add",panstwo);
        }
    }

    public void removeCountry(String panstwo) {
        if (panstwa.contains(panstwo)) {
            panstwa.remove(panstwo);
        } else {
           bladWprowadzaniaDanych("remove", panstwo);
        }
    }

    public Set<String> getAllCountries() {
        return panstwa;
    }

    public void updateCountry(String starePanstwo,String nowePanstwo) {
        if (panstwa.contains(starePanstwo)) {
            panstwa.remove(starePanstwo);
            panstwa.add(nowePanstwo);
        } else {
            bladWprowadzaniaDanych("update", starePanstwo);
        }
    }

    public void bladWprowadzaniaDanych(String czynnosc , String dane) {
        System.out.printf("operacja nie powiodla sie : %s - %s\n", czynnosc, dane);
    }
}
