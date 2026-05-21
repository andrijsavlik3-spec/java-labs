import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) {
        // Примусове встановлення кодування UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

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
        
        System.out.println("Пусті масиви створено та успішно заповнено 50 парними і 50 непарними числами.");
    }
}