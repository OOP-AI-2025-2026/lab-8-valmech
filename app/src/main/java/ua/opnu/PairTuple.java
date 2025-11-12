package ua.opnu;

class PairTuple<T, V> {
    public final T left;
    public final V right;

    public PairTuple(T left, V right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left + ", " + right + ")";
    }
}
