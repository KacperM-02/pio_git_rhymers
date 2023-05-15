package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1;
    private static final int IF_EMPTY = -1;
    private static final int CAPACITY = 12;
    private final int[] NUMBERS = new int[CAPACITY];


    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return NUMBERS[total--];
    }

}
