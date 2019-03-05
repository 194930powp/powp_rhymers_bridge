package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int minusOne = -1;
    public static final int eleven = 11;
    public static final int twelve = 12;
    private int[] numbers = new int[twelve];

    public int total = minusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == minusOne;
    }

    public boolean isFull() {
        return total == eleven;
    }

    protected int peekaboo() {
        if (callCheck())
            return minusOne;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return minusOne;
        return numbers[total--];
    }

}