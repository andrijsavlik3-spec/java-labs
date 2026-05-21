import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Task3 {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("--- Завдання 3 ---");
        double[] arr3 = {1.5, 2.5, -1.0, 4.2, 5.0};
        double sum = 0;
        
        for (int j = 0; j < arr3.length; j++) {
            sum += arr3[j];
        }
        
        System.out.println("Сума елементів масиву: " + sum);
    }
}