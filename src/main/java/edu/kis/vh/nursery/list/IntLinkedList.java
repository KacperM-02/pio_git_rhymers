package edu.kis.vh.nursery.list;

/**
 * IntLinkedList - klasa implementująca liste z dowiązaniami, zawiera klasę Node, która przedstawia
 * elementy tej listy.
 */
public class IntLinkedList {
    private static class Node {

        private final int VALUE;
        private Node prev;
        private Node next;

        /** Konstruktor, ustawiający wartość danego elementu w liście z dowiązaniami
         * @param i wartość elementu, który dodamy do listy z dowiązaniami
         */
        public Node(int i) {
            VALUE = i;
        }

        /**
         * @return wartość elementu z listy z dowiązaniami
         */
        public int getVALUE() {
            return VALUE;
        }

        /**
         * @return wartość poprzednia od danego elementu
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * @param prev element do ustawienia odpowiedniego pola klasy
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * @return element kolejny w liście z dowiązaniami
         */
        public Node getNext() {
            return next;
        }

        /**
         * @param next ustawia pole next w liście z dowiązaniami
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }


    private static final int IF_EMPTY = -1;
    private Node last;
    private int i;

    /**
     * dodaje element
     * @param i
     * na koniec listy z dowiązaniami
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * @return czy lista z dowiązaniami jest pusta
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * @return czy lista z dowiązaniami jest pełna
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return element z wierzchu listy z dowiązaniami
     */
    public int top() {
        if (isEmpty())
            return IF_EMPTY;
        return last.getVALUE();
    }

    /**
     * @return zdejmuje ostatni element z listy z dowiązaniami
     */
    public int pop() {
        if (isEmpty())
            return IF_EMPTY;
        int ret = last.getVALUE();
        last = last.getPrev();
        return ret;
    }

}
