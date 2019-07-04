package collections.basics.zadanie2.part1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
public class PersonService {
    Map<Integer, Person> uzytkownicy = new HashMap();

    public void addUser(String imie, String nazwisko, LocalDate dataUrodzenia) {
        Person user = new Person(imie, nazwisko, dataUrodzenia);
        uzytkownicy.put(user.getID(), user);
    }
}


