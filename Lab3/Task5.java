import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Налаштування UTF-8 для коректного відображення кирилиці в консолі
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть нижню межу діапазону для пошуку результатів (наприклад, -5): ");
        double lowerBound = scanner.nextDouble();
        System.out.print("Введіть верхню межу діапазону для пошуку результатів (наприклад, 10): ");
        double upperBound = scanner.nextDouble();

        // Параметри з таблиці варіанту 3
        double start = 0.0;
        double end = 4.0;
        double step = 0.2;

        System.out.println("\n--- Реалізація через цикл FOR ---");
        int countFor = 0;
        for (double x = start; x <= end + 0.0001; x += step) {
            double y = 3 * x - 4 * Math.sin(Math.pow(x, 2)); 
            
            System.out.printf("x = %.1f \t f(x) = %.4f\n", x, y);

            if (y >= lowerBound && y <= upperBound) {
                countFor++;
            }
        }
        if (countFor > 0) {
            System.out.println("Кількість значень у діапазоні: " + countFor);
        } else {
            System.out.println("Значення у заданому діапазоні відсутні.");
        }

        System.out.println("\n--- Реалізація через цикл WHILE ---");
        int countWhile = 0;
        double xw = start;
        
        while (xw <= end + 0.0001) {
            double yw = 3 * xw - 4 * Math.sin(Math.pow(xw, 2));
            
            System.out.printf("x = %.1f \t f(x) = %.4f\n", xw, yw);

            if (yw >= lowerBound && yw <= upperBound) {
                countWhile++;
            }
            xw += step;
        }
        if (countWhile > 0) {
            System.out.println("Кількість значень у діапазоні: " + countWhile);
        } else {
            System.out.println("Значення у заданому діапазоні відсутні.");
        }
        
        scanner.close();
    }
}