import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import models.Car;
import models.User;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        System.out.println("=== Завдання 1 ===");
        int[] numbers = {10, 20, 5, 2, 8, 4, 50, 10, 3, 7};


        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        int sub = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            sub -= numbers[i]; 
        }

        long mult = 1;
        for (int num : numbers) {
            mult *= num;
        }

        double div = (double) numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) div /= numbers[i];
        }

        System.out.printf("Сума: %d\nРізниця: %d\nДобуток: %d\nДілення: %.4f\n\n", sum, sub, mult, div);


        System.out.println("=== Завдання 2 ===");
        String[] words = {"Java", "is", "a", "powerful", "language", "that", "uses", "arrays", "and", "loops."};
        
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println("\n");


        System.out.println("=== Завдання 3 ===");
        User[] users = new User[10]; 
        
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(i, 20 + i, "Name" + i, "Surname" + i, 60 + i, 170 + i);
        }

        int totalAge = 0;
        double totalWeight = 0;
        double totalHeight = 0;

        for (User u : users) {
            totalAge += u.age;
            totalWeight += u.weight;
            totalHeight += u.height;
        }

        System.out.println("Сума віку: " + totalAge);
        System.out.println("Сума ваги: " + totalWeight);
        System.out.println("Сума зросту: " + totalHeight + "\n");


        System.out.println("=== Завдання 4 ===");
        Car[] cars = new Car[10];
        
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(100 + (i * 10), 1.5 + (i * 0.1)); 
        }

        double totalVolume = 0;
        int totalHP = 0;

        for (Car c : cars) {
            totalVolume += c.engineVolume;
            totalHP += c.horsePower;
        }

        System.out.printf("Сумарний об'єм: %.2f\n", totalVolume);
        System.out.println("Сумарна потужність: " + totalHP + "\n");


        System.out.println("=== Завдання 5 ===");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть число для реверсу: ");
            
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                int reversed = 0;
                
                while (number != 0) {
                    int digit = number % 10;          
                    reversed = reversed * 10 + digit; 
                    number = number / 10;             
                }
                System.out.println("Результат: " + reversed);
            } else {
                System.out.println("Ви ввели не число!");
            }
        }
    }
}