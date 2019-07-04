package collections.basics.zadanie3.obiekty;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Countries {
    private Set<Country> panstwa = new TreeSet<>();

    public void add(String nazwa, String jezyk, int milionyLudnosci, String ImieINazwiskoPrezydenta) {
        Country panstwo = new Country(nazwa, jezyk, milionyLudnosci, ImieINazwiskoPrezydenta);
        if (!panstwa.contains(panstwo)) {
            panstwa.add(panstwo);
        } else {
            bladWprowadzaniaDanych("add", panstwo.toString());
        }
    }

    public void remove(String nazwa) {
        Country panstwo = null;
        for (Country country : panstwa) {
            if (country.toString().equals(nazwa)) {
                panstwo = country;
                panstwa.remove(panstwo);
                break;
            }
        }
        if (panstwo == null) {
            bladWprowadzaniaDanych("remove", nazwa);
        }
    }

    public List<String> getInfoByLanguage(String language) {
        List<String> informacje = new ArrayList<>();
        for (Country country : panstwa) {
            if (country.getJezyk().equals(language)) {
                informacje.add("Nazwa panstwa: " + country.getNazwa());
                informacje.add("Jezyk: " + country.getJezyk());
                informacje.add("Miliony mieszkancow: " + Integer.toString(country.getMilionyLudnosci()));
                informacje.add("Głowa państwa: " + country.getPrezydent().toString());
            }
        }
        if (informacje.isEmpty()) {
            bladWprowadzaniaDanych("get language", language);
        }
        return informacje;
    }

    public List<String> getInfoByName(String name) {
        List<String> informacje = new ArrayList<>();
        for (Country country : panstwa) {
            if (country.toString().equals(name)) {
                informacje.add("Nazwa panstwa: " + country.getNazwa());
                informacje.add("Jezyk: " + country.getJezyk());
                informacje.add("Miliony mieszkancow: " + Integer.toString(country.getMilionyLudnosci()));
                informacje.add("Głowa państwa: " + country.getPrezydent().toString());
            }
        }
        if (informacje.isEmpty()) {
            bladWprowadzaniaDanych("get country", name);
        }
        return informacje;
    }


    public Set<Country> getAllCountries() {
        return panstwa;
    }

    public void updateCountryName(String starePanstwo, String nowePanstwo) {
        Country panstwo = null;
        for (Country country : panstwa) {
            if (country.toString().equals(starePanstwo)) {
                panstwo = country;
                panstwa.add(new Country(nowePanstwo, panstwo.getJezyk(), panstwo.getMilionyLudnosci(),panstwo.getPrezydent()));
                panstwa.remove(panstwo);
                break;
            }
        }
        if (panstwo == null) {
            bladWprowadzaniaDanych("update", starePanstwo);
        }
    }

//    public List<Country> getCountriesSortedByPopulation() {
//
//    }

    public void bladWprowadzaniaDanych(String czynnosc, String panstwo) {
        System.out.printf("operacja nie powiodla sie : %s - %s\n", czynnosc, panstwo);
    }
}
