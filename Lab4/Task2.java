import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Task2 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

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
}