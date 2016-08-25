package bester;

public class Cookie implements  Comparable{

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean better(Comparable other) {
        return numberOfChocolateChips > ((Cookie) other).numberOfChocolateChips;
    }
}
