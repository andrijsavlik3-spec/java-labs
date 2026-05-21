import java.io.PrintStream;

public class Main {
    // Об'єднали все в один єдиний метод main
    public static void main(String[] args) throws Exception {
        
        // Налаштування кодування для консолі
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // Жорстко задаємо значення прямо в коді
        String fileName = "numbers.txt";
        int b1 = 5;   // Початок діапазону
        int b2 = 100; // Кінець діапазону

        System.out.println("Файл: " + fileName + ", Діапазон: від " + b1 + " до " + b2 + "\n");

        // Створюємо об'єкт класу із завданнями та викликаємо методи
        FileTask task = new FileTask();

        // Виконуємо запис
        task.writeRandomNumbers(fileName, b1, b2);

        // Виконуємо читання
        task.readFromFile(fileName);
    }
}
