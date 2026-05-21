import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Примусово встановлюємо кодування UTF-8 для правильного відображення кирилиці
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Ініціалізація вхідних даних
        double side = 5.0;
        int a = 15, b = 7, c = 22;
        int[] numbers = {10, 45, 3, 78, 21, 9};

        // Виклик методів з інших класів та збереження результатів
        double area = Task1.getSquareArea(side);
        int minNumber = Task2.getMin(a, b, c);
        String arrayString = Task3.getArrayAsString(numbers);
        int maxNumber = Task4.getMax(numbers);

        // Вивід усіх результатів
        System.out.println("--- Результати виконання Лабораторної ---");
        System.out.println("Площа квадрата (сторона " + side + "): " + area);
        System.out.println("Найменше число серед (" + a + ", " + b + ", " + c + "): " + minNumber);
        System.out.println("Елементи масиву: " + arrayString);
        System.out.println("Максимальне число в масиві: " + maxNumber);
    }
}