package collections.implementations.arra_list.md;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class MyArrayList<E> implements List<E> {

    private final int initialSize = 4;
    int actualSize;
    E data[];

    public MyArrayList() {
        clear();
    }

    @Override
    public int size() {
        return actualSize;
    }

    @Override
    public boolean isEmpty() {
        return actualSize == 0;
    }

    @Override
    public boolean contains(Object o) { // metoda sprawdza czy o znajduje sie na liscie
        for (E item : data) { // przegladam elementy
            if (o.equals(item)) { // equals sprawdza czy dostarczy mu element to ten sam na ktorym zostal wywolany
                return true;
            }
        }
        return false;


    }

    @Override
    public Iterator<E> iterator() { // iterator to narzedzie wykorzystywane wrzez petle for do przegladania strutur danych
        // ta metoda zwraca iterator pasujacy do danej struktury
        throw new NotImplementedException();
    }

    @Override
    public Object[] toArray() { // metoda ma zwrócić tablicę elementow z listy
        return Arrays.copyOf(data,actualSize); // wykorzystuje do tego bibliteke Arrays aby stworzyć kopię tablicy ze
    }// zmniejszana wielkoscia do jej aktualnej wielkosci (pomijam puste miejsca)

    @Override
    public <T> T[] toArray(T[] a) {// metoda umieszcza elementy z listy w dostarczonej tablicy
        if (a.length <= actualSize) { // sprawdzenie czy tablica nie jest za mala
            for (int i = 0; i < a.length; i++) {
                a[i] = (T) data[i]; // linija spowoduje blad jest naszych obiektow nie bedzie mozna castowac na typ uzytkownika
            }
        }
        return a;

    }


    @Override
    public boolean add(E e) {

        if (actualSize >= data.length) {  // czy pora powiekszyc tabice?
            int newSize = data.length * 2; // 4, 8, 16, 32, 64
            E[] newData = (E[]) new Object[newSize]; // tworzymy nowa tablice zadanej wielkosci
            for (int i = 0; i < actualSize; i++) { // przenoszenie elementow ze starej tablicy do nowej
                newData[i] = data[i];
            }
            data = newData; // zastepowanie starej tablicy nowa
        }

        data[actualSize] = e;  // faktyczne dodanie wartoci
        actualSize++;
        return true;
    }

    @Override
    public boolean remove(Object o) { // metoda usuwa wybrany obiekt i zwraca info czy sie udalo
        int index = indexOf(o); // sprawdzam indeks obiektu
        if (index < 0) { // jesli indeks to -1 czyli nie zostal znaleziony
            return false; // wychodze zwracajac false
        }

        // przesuniecie wszystykich elementow od miejsca usunieto o jeden wczesniej

        for (int i = index; i < actualSize; i++) {
            if (i+1<actualSize) { // zabezpieczam sie zeby nie wyjsc poza zakres tablicy
                data[i] = data[i + 1];
            }
        }
        data[actualSize] = null; // kasuje ostatni faktyczny elemen zebvy sie nie dublowal
        actualSize--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) { // metoda odpowiada na ptanie czy
        // dostarczna kolecja elementow zawiera same elementy pokrywajace sie z tymi na naszej liscie

        for (Object przegladany : c) { // przegladam elementy dostarczonej kolekcji
            if (!contains(przegladany)) { // jesli ktoregos ze sprawdzanych elementow nie ma u nas
                return false; // zwracam false
            }
        }
        return true; // jesli wszystkie byly zwracam true
    }

    // metoda dodaje wszystkie elementy z dostarczonej kolekcji
    @Override
    public boolean addAll(Collection<? extends E> c) {  // c to dowolna kolekcja z elementami ktore dodamy
        for (E element : c) {
            add(element);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new NotImplementedException();
    }

    @Override
    public boolean removeAll(Collection<?> c) { // usuwa wszystkie lementy z danej listy jesli je zawieramy
        if (containsAll(c)) { // sprawdzam czy zawieram wszystkie elementy dostarzonej kolecji
            for (Object element : c) { // w petli usuwam jeden po drugi
                remove(element);
            }
            return true;
        }
        return false; // jesli nie wszystkie elementy sa zawarte nic nie robie i zwracam false
    }

    @Override
    public boolean retainAll(Collection<?> c) { // metoda ma usunac wszystkie elementy ktore nie sa wspolne z dostarczona kolekcja
        throw new NotImplementedException();
    }

    @Override
    public void clear() {
        this.data = (E[]) new Object[initialSize];
        actualSize = 0;
    }

    @Override
    public E get(int index) {
        return data[index]; // zwaracym elemnt tablicy o indexie z argumentu metody
    }

    @Override
    public E set(int index, E element) { // metoda ma zamienić element pod okreslonym indeksem na dostarczony element
        if (index >= actualSize || index < 0) { // czy indeks nie jest poza zakresem listy
            return element; // jesli jest wychodzimy zwracajac dostarczony element
        }

        E oldElement = data[index]; // wstawiam do zmiennej stary element, ten do zastapienia
        data[index] = element; // zastepuje go nowym elementem
        return oldElement; // zwracam stary element
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        E result = data[index];
        for (int k = index; k < actualSize - 1; k++) {
            data[k] = data[k + 1];
        }
        data[actualSize - 1] = null;
        actualSize--;
        return result;
    }


    // Object - > najbardziej ogólny typ, stanowi szablon do wszystkich obiektów w java
    @Override
    public int indexOf(Object o) {  // metoda wymaga podania obiektu i zwraca jego index na liscie
        for (int i = 0; i < actualSize; i++) {
            if (o == data[i]) { // powinno się zastosować metodę equals
                return i;
            }
        }
        return -1;
    }





    @Override
    public int lastIndexOf(Object o) {
        for (int i = actualSize-1; i >= 0; i--) {  // podobna implementacja ale przegladamy od konca
            if (o == data[i]) {
                return i;
            }
        }
        return -1;

    }

    @Override
    public ListIterator<E> listIterator() {
        throw new NotImplementedException();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new NotImplementedException();
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) { // metoda zwraca liste z elementami od okreslonego indeksu do okreslonego indeksu
        MyArrayList<E> nowaLista = new MyArrayList<>(); // tworze nowa pusta liste
        if (toIndex >= actualSize) { // wychodze awaryjnie jesli wybrany index koncowy przekracza faktyczny rozmiar listy
            return nowaLista;
        }


        for (int i = fromIndex; i < toIndex; i++) { // przerzucam tylko elementy z zadanego zakresu do nowej lisy
            E element = data[i];
            nowaLista.add(element);
        }
        return nowaLista; // zwracam nowa liste
    }


}