package ua.opnu;

public class MyOptional<T> {
    private T content;
    private boolean hasValue;

    public MyOptional() {
        this.hasValue = false;
    }

    public MyOptional(T item) {
        if (item == null) {
            throw new IllegalArgumentException("OptionalBox не дозволяє null");
        }
        this.content = item;
        this.hasValue = true;
    }

    public boolean isAvailable() {
        return hasValue;
    }

    public boolean isEmpty() {
        return !hasValue;
    }

    public T fetch() {
        if (!hasValue) {
            throw new IllegalStateException("Значення відсутнє");
        }
        return content;
    }

    public T getOrDefault(T fallback) {
        return hasValue ? content : fallback;
    }

    @Override
    public String toString() {
        return hasValue ? "OptionalBox[value=" + content + "]" : "OptionalBox[empty]";
    }
}
