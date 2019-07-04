package collections.basics.zadanie3.obiekty;

public class User {
    private String imie;
    private String nazwisko;
    private static final String DOMYSLNE_IMIE = "Jan";
    private static final String DOMYSLNE_NAZWISKO = "Kowalski";
    public User(String imieINazwisko) {
        String[] tablica = imieINazwisko.split(" ");
        if (tablica.length == 2) {
            imie = tablica[0];
            nazwisko = tablica[1];
        } else {
            imie = DOMYSLNE_IMIE;
            nazwisko = DOMYSLNE_NAZWISKO;
        }
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
