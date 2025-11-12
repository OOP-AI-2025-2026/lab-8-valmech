package ua.opnu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {
    public static <T> T[] select(T[] array, Predicate<T> rule) {
        List<T> list = new ArrayList<>();
        for (T elem : array) {
            if (rule.test(elem)) {
                list.add(elem);
            }
        }
        return list.toArray(java.util.Arrays.copyOf(array, list.size()));
    }
}

