package ua.opnu;

class TripleTuple<T, V, S> {
    public final PairTuple<T, V> pair;
    public final S extra;

    public TripleTuple(T left, V right, S extra) {
        this.pair = new PairTuple<>(left, right);
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "(" + pair.left + ", " + pair.right + ", " + extra + ")";
    }
}