import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    
    // Головний метод, який запускає всю програму
    public static void main(String[] args) {
        // Примусове встановлення кодування UTF-8 для правильного виводу кирилиці
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("=== ПОЧАТОК ВИКОНАННЯ ЛАБОРАТОРНОЇ РОБОТИ ===\n");
        
        task1();
        System.out.println("\n------------------------------------------------\n");
        
        task2();
        System.out.println("\n------------------------------------------------\n");
        
        task3();
        System.out.println("\n------------------------------------------------\n");
        
        task4();
        
        System.out.println("\n=== ЛАБОРАТОРНУ РОБОТУ ЗАВЕРШЕНО ===");
    }

    // --- Окремий метод для Завдання 1 ---
    public static void task1() {
        System.out.println("--- Завдання 1 ---");
        int[] evenNumbers = new int[50];
        int[] oddNumbers = new int[50];

        // Заповнюємо парними
        for (int i = 0; i < 50; i++) {
            evenNumbers[i] = (i + 1) * 2;
        }
        
        // Заповнюємо непарними
        for (int i = 0; i < 50; i++) {
            oddNumbers[i] = (i * 2) + 1;
        }
        
        System.out.println("Масив парних чисел:");
        for (int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Перехід на новий рядок

        System.out.println("\nМасив непарних чисел:");
        for (int num : oddNumbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Перехід на новий рядок
    }

    // --- Окремий метод для Завдання 2 ---
    public static void task2() {
        System.out.println("--- Завдання 2 ---");
        int[] arr2 = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};

        System.out.print("Перебір циклом while: "); 
        int i = 0;
        while (i < arr2.length) {
            System.out.print(arr2[i] + " ");
            i++;
        }

        System.out.print("\nПеребір циклом for: "); 
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }

        System.out.print("\nЦикл while (тільки непарні індекси): "); 
        int k = 1;
        while (k < arr2.length) {
            System.out.print(arr2[k] + " ");
            k += 2;
        }

        System.out.print("\nЦикл for (тільки парні індекси): "); 
        for (int m = 0; m < arr2.length; m += 2) {
            System.out.print(arr2[m] + " ");
        }

        System.out.print("\nМасив у зворотньому порядку: "); 
        for (int n = arr2.length - 1; n >= 0; n--) {
            System.out.print(arr2[n] + " ");
        }
        System.out.println(); 
    }

    // --- Окремий метод для Завдання 3 ---
    public static void task3() {
        System.out.println("--- Завдання 3 ---");
        double[] arr3 = {1.5, 2.5, -1.0, 4.2, 5.0};
        double sum = 0;
        
        for (int j = 0; j < arr3.length; j++) {
            sum += arr3[j];
        }
        
        System.out.println("Сума елементів масиву: " + sum);
    }

    // --- Окремий метод для Завдання 4 ---
    public static void task4() {
        System.out.println("--- Завдання 4 ---");
        int[] arr4 = {1, 4, -3, 8, 11, -6, 7};
        
        System.out.print("Початковий масив: ");
        for (int val : arr4) {
            System.out.print(val + " ");
        }

        // Зміна знаку непарних елементів
        for (int w = 0; w < arr4.length; w++) {
            if (arr4[w] % 2 != 0) { 
                arr4[w] = -arr4[w];
            }
        }

        System.out.print("\nМасив після зміни знаку непарних елементів: ");
        for (int val : arr4) {
            System.out.print(val + " ");
        }
        System.out.println(); 
    }
}