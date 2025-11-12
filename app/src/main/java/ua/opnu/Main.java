package ua.opnu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");

        MyOptional<String> patronymic = new MyOptional<>();
        System.out.println("patronymic: " + patronymic);
        System.out.println("isAvailable: " + patronymic.isAvailable());
        System.out.println("orElse (default): " + patronymic.getOrDefault("відсутнє"));

        MyOptional<String> loginName = new MyOptional<>("superUser");
        System.out.println("\nloginName: " + loginName);
        System.out.println("isAvailable: " + loginName.isAvailable());
        System.out.println("get(): " + loginName.fetch());
        System.out.println("orElse: " + loginName.getOrDefault("defaultUser"));

        try {
            String res = patronymic.fetch();
            System.out.println("unexpected: " + res);
        } catch (IllegalStateException e) {
            System.out.println("Очікуваемо виняток: " + e.getMessage());
        }

        try {
            MyOptional<String> wrong = new MyOptional<>(null);
            System.out.println("unexpected: " + wrong);
        } catch (IllegalArgumentException e) {
            System.out.println("Не дозволив null: " + e.getMessage());
        }

        System.out.println("\nЗавдання 2");

        BookInfo javaBook = new BookInfo("Effective Java", "Joshua Bloch", 120, 540);
        BookInfo kotlinBook = new BookInfo("book1", "author1", 200, 850);

        System.out.println(javaBook);
        System.out.println(kotlinBook);

        int result = javaBook.compareTo(kotlinBook);
        if (result < 0)
            System.out.println(javaBook + " має нижчий рейтинг, ніж " + kotlinBook);
        else if (result > 0)
            System.out.println(kotlinBook + " має нижчий рейтинг, ніж " + javaBook);
        else
            System.out.println("Рейтинги однакові");

        System.out.println("\nЗавдання 3");

        Printer printer = new Printer();
        Integer[] numbers = {10, 20, 30};
        String[] words = {"Hello", "friend"};
        printer.showArray(numbers);
        printer.showArray(words);

        System.out.println("\nЗавдання 4");

        String[] cities = {"Kyiv", "Kharkiv", "London", "Lviv", "Paris"};
        System.out.println("Початкові міста: " + Arrays.toString(cities));
        String[] startsWithL = GenericFilter.select(cities, s -> s.startsWith("L"));
        System.out.println("Міста на L: " + Arrays.toString(startsWithL));

        System.out.println("\nЗавдання 5");

        Double[] values = {1.5, 2.0, 3.0, 4.5};
        System.out.println("Масив: " + Arrays.toString(values));
        System.out.println("Є 3.0? " + Contains.contains(values, 3.0));
        System.out.println("Є 5.0? " + Contains.contains(values, 5.0));

        System.out.println("\nЗавдання 6");

        PairTuple<String, Integer> dataPair = new PairTuple<>("Olga", 22);
        System.out.println("Пара (ім’я + вік): " + dataPair);

        TripleTuple<String, Integer, Double> fullInfo = new TripleTuple<>("Denis", 28, 98.7);
        System.out.println("Трійка (ім’я + вік + рейтинг): " + fullInfo);
    }
}
