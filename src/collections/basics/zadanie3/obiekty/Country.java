package collections.basics.zadanie3.obiekty;

import java.util.Objects;

public class Country implements Comparable{
   private String nazwa;
   private String jezyk;
    private int milionyLudnosci;
    private User prezydent;

    public User getPrezydent() {
        return prezydent;
    }

    public Country(String nazwa, String jezyk, int milionyLudnosci, User prezydent) {
        this.nazwa = nazwa;
        this.jezyk = jezyk;
        this.milionyLudnosci = milionyLudnosci;
        this.prezydent = prezydent;
    }

    public Country(String nazwa, String jezyk, int milionyLudnosci, String imieINazwiskoPrezydenta) {
        this.nazwa = nazwa;
        this.jezyk = jezyk;
        this.milionyLudnosci = milionyLudnosci;
        prezydent = new User(imieINazwiskoPrezydenta);
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getJezyk() {
        return jezyk;
    }

    public int getMilionyLudnosci() {
        return milionyLudnosci;
    }

      @Override
    public int hashCode() {
        return Objects.hash(nazwa);
    }

    @Override
    public int compareTo(Object o) {
        if (this.toString().equals(o.toString())) {
            return 0;
        } else {
            return -1;
        }
    }
}
