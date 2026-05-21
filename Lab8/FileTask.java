import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileTask {

    // Метод для перевірки/створення файлу та запису чисел
    public void writeRandomNumbers(String fileName, int b1, int b2) {
        File file = new File(fileName);
        
        try {
            // Перевірка існування файлу
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Файл відсутній. Створено новий файл: " + fileName);
                }
            } else {
                System.out.println("Файл знайдено: " + fileName);
            }

            // Запис випадкових чисел у потік виведення
            try (FileWriter writer = new FileWriter(file)) {
                Random rand = new Random();
                int numbersCount = 15; // Кількість чисел у послідовності

                for (int i = 0; i < numbersCount; i++) {
                    // Генерування випадкового числа в межах [b1,b2]
                    int number = rand.nextInt(b2 - b1 + 1) + b1;
                    writer.write(number + " ");
                }
                System.out.println("Послідовність випадкових чисел успішно записана у файл.");
            }
        } catch (IOException e) {
            System.out.println("Виникла помилка під час запису: " + e.getMessage());
        }
    }

    // Метод для читання та виведення на консоль
    public void readFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Помилка читання: файл не знайдено.");
            return;
        }

        System.out.println("\n--- Результат читання з файлу ---");
        // Зчитування даних з файлового потоку введення
        try (FileReader reader = new FileReader(file)) {
            int character;
            // Посимвольне читання та виведення на консоль
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n---------------------------------");
        } catch (IOException e) {
            System.out.println("Виникла помилка під час читання: " + e.getMessage());
        }
    }
}
