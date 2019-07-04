package collections.implementations.array;

// robimy arejlistę
public class MeinList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public Object[] getElements() {
        return elements;
    }

    public MeinList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T element) {
        if (size == elements.length) {
            growBigger();
        }
        elements[size++] = element;

    }

    public Object get(int index) {
        return elements[index];
    }
    public int size() {
        int iloscPozycji = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                iloscPozycji++;
            }
        }
        return iloscPozycji;
    }

    void growBigger() {
        Object[] nowaLista = new Object[elements.length *2];
        for (int i = 0; i < elements.length; i++) {
            nowaLista[i] = elements[i];
        }
        elements = nowaLista;

        // metoda 2
//        elements = Arrays.copyOf(nowaLista, elements.length *2);

    }
}
