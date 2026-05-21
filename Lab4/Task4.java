import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Task4 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

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