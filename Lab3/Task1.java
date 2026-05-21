import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Task1 {
    public static void main(String[] args) {
        // Змінюємо кодування виводу консолі на UTF-8, щоб кирилиця відображалася коректно
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        
        String phrase = "1000-7";
        
        // Використання циклу for
        System.out.println("--- Цикл for ---");
        for (int i = 0; i < 50; i++) {
            System.out.println((i + 1) + ": " + phrase);
        }
        
        // Використання циклу while
        System.out.println("--- Цикл while ---");
        int j = 0;
        while (j < 50) {
            System.out.println((j + 1) + ": " + phrase);
            j++;
        }
    }
}