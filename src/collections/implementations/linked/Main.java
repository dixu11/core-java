package collections.implementations.linked;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");

        CustomList<String> customList = new CustomLinkedList<>();
        customList.add("Jeden");
        customList.add("Dwa");
        customList.add("Trzy");
        customList.add("Cztery");
        customList.add("Pięć");
        customList.add("Sześć");
        customList.add("Siedem");
        customList.add("Osiem");
        customList.addTail("kotlet");
        customList.addTail("grochówka");
        customList.printList();

        System.out.println("testujemy indeks *****");
        customList.find(0);


        customList.add("1");
        customList.add("2");
        customList.add("3");
    }
}
