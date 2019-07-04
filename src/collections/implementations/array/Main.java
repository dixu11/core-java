package collections.implementations.array;

public class Main {
    public static void main(String[] args) {
        MeinList<String> lista = new MeinList<>();
        lista.add("Johnny");
        lista.add("Mysz");
        lista.add("Pedziwiatr");
        lista.add("Pedziwiatr");
        lista.add("Pedziwiatr");
        lista.add("Pedziwiatr");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
