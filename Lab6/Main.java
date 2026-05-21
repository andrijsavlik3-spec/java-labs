import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        // Примусове встановлення UTF-8 для коректного відображення кирилиці в консолі
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Помилка кодування консолі");
        }

        System.out.println("--- Завдання 1: Person ---");
        Person p1 = new Person();
        Person p2 = new Person("Іван Іванов", 20);
        p1.talk();
        p2.move();

        System.out.println("\n--- Завдання 2: Phone ---");
        Phone phone1 = new Phone("0991112233", "Samsung", 180.5);
        Phone phone2 = new Phone("0674445566", "iPhone");
        
        System.out.println("Телефон 1: " + phone1.getNumber() + " " + phone1.model + " " + phone1.weight + "g");
        phone1.receiveCall("Анна");
        phone2.receiveCall("Петро", "0501234567");
        phone1.sendMessage("0991112233", "0674445566", "0639998877");

        System.out.println("\n--- Завдання 3: Ієрархія Shape ---");
        Cylinder cyl = new Cylinder(5, 10);
        System.out.println("Об'єм циліндра: " + cyl.getVolume());

        System.out.println("\n--- Завдання 4: Ієрархія Car ---");
        Sedan mySedan = new Sedan("Toyota Camry", "Чорний", 220);
        Truck myTruck = new Truck("Volvo FH", "Білий", 140);
        mySedan.gas();
        mySedan.brake();
        myTruck.brake();

        System.out.println("\n--- Завдання 5 & 6: Матриця (Варіант 15) ---");
        int[][] sampleData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        NamedMatrix myMatrix = new NamedMatrix("Одинична трансформація", "22.04.2026");
        myMatrix.setMatrix(sampleData);
        myMatrix.printMatrix();
        myMatrix.printTransposed();
    }
}