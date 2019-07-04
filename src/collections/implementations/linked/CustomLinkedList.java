package collections.implementations.linked;

public class CustomLinkedList <E> implements CustomList<E> {

    private int size;
    private Node head;

    public CustomLinkedList() {
        head = new Node(null);
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E e) {
        Node copy = head;
//        System.out.println("Wartość copy: " + copy);
        head = new Node(e);
//        System.out.println("Wartość head :" + head);
        head.next = copy;
//        System.out.println("Wartość next: " + head.next);
        size++;
    }

    public void printList() {
        Node aktualny = head;
        System.out.println(head.data);
        for (int i = 0; i < size-1; i++) {
            aktualny = aktualny.next;
            System.out.println(aktualny.data);
        }

        // wersja prowadzacego:
       /* Node tmp = head;
        while (tmp !=null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }*/

    }

    @Override
    public void addTail(E e) {
        Node copy = head;
        for (int i = 0; i < size-1; i++) {
            copy=copy.next;
        }
        copy.next = new Node(e);
        size++;

        // metoda prowadzacego
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = new Node(e);
    }

    @Override
    public void find(int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println(tmp.data);
    }


    @Override
    public int size() {
        return 0;
    }
    class Node{
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }
}
