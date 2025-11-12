package ua.opnu;

class Printer {
    public <T> void showArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el);
        }
    }
}
