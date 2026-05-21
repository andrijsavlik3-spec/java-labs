import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        // Налаштування для підтримки кирилиці в консолі
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Помилка кодування: " + e.getMessage());
        }

        HashMap<String, String> phoneBook = new HashMap<>();

        // 1. Додавання елементів (put)
        phoneBook.put("Kaneki", "+819033334444");
        phoneBook.put("Touka", "+819033334444");
        phoneBook.put("Tsukiyama", "+819055556666");
        phoneBook.put("Arima", "+819077778888");
        phoneBook.put("Eto", "+819099990000");
        phoneBook.put("Yoshimura", "+819012345678");
        phoneBook.put("Ichika", "+819087654321");
        phoneBook.put("Rize", "+818011223344");
        phoneBook.put("Furuta", "+818055667788");
        phoneBook.put("Juuzou", "+818099887766");

        // Виведення інформації з книги через цикл
        System.out.println("--- Список абонентів ---");
        for (String key : phoneBook.keySet()) {
            System.out.println("Прізвище: " + key + " | Телефон: " + phoneBook.get(key));
        }

        // 2. Пошук заданого номера за прізвищем (get / containsKey)
        System.out.println("\n--- Пошук абонента ---");
        String searchName = "Kaneki";
        if (phoneBook.containsKey(searchName)) {
            System.out.println("Знайдено: " + phoneBook.get(searchName));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // Пошук відсутнього абонента
        String missingName = "Yta";
        if (phoneBook.containsKey(missingName)) {
            System.out.println("Знайдено: " + phoneBook.get(missingName));
        } else {
            System.out.println("У книзі відсутній такий абонент");
        }

        // 3. Перевірка наявності значення (containsValue)
        System.out.println("\nЧи є номер '+818055667788' у книзі? " + phoneBook.containsValue("+818055667788"));

        // 4. Видалення довільного запису з книги (remove)
        System.out.println("\nВидаляємо запис 'Furuta'...");
        phoneBook.remove("Furuta");
        

        // 5. Вивід кількості записів (size)
        System.out.println("Кількість записів у книзі після видалення: " + phoneBook.size());
    }
}