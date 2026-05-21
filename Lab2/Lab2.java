import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) throws Exception {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8.name());
        
        boolean success = false; 

        while (!success) {
            try {
                // 1. Квадратне рівняння
                System.out.println("1. Квадратне рівняння ax^2 + bx + c = 0");
                System.out.print("Введіть a, b, c: ");
                double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble();
                double d = b * b - 4 * a * c;
                if (d > 0) System.out.printf("x1 = %.2f, x2 = %.2f\n", (-b + Math.sqrt(d)) / (2 * a), (-b - Math.sqrt(d)) / (2 * a));
                else if (d == 0) System.out.printf("x = %.2f\n", -b / (2 * a));
                else System.out.println("Немає дійсних коренів");

                // 2. Квадрант точки
                System.out.print("\n2. Введіть координати x, y: ");
                double x = s.nextDouble(), y = s.nextDouble();
                if (x > 0 && y > 0) System.out.println("I квадрант");
                else if (x < 0 && y > 0) System.out.println("II квадрант");
                else if (x < 0 && y < 0) System.out.println("III квадрант");
                else if (x > 0 && y < 0) System.out.println("IV квадрант");
                else System.out.println("На осі або в центрі");

                // 3. Двозначне і парне число
                System.out.print("\n3. Введіть ціле число: ");
                int num = s.nextInt();
                boolean isTwoDigit = Math.abs(num) >= 10 && Math.abs(num) <= 99;
                if (isTwoDigit && num % 2 == 0) System.out.println("Число є двозначним і парним");
                else System.out.println("Умова не виконується");

                // 4.1. Обчислення f(x)
                System.out.print("\n4.1. Введіть x для f(x): ");
                double x_f = s.nextDouble();
                double result;
                if (x_f < -0.5) result = Math.pow(Math.cos(x_f), 2) + Math.pow(Math.sin(x_f - 4), 5);
                else if (x_f <= 1) result = Math.log(Math.abs(Math.cos(2 * x_f)));
                else result = Math.abs(Math.sin(2 * x_f));
                System.out.printf("f(x) = %.4f\n", result);

                // 4.2. Робочий/вихідний день
                System.out.print("\n4.2. Введіть день тижня (1-7): ");
                int day = s.nextInt();
                switch (day) {
                    case 1: case 2: case 3: case 4: case 5:
                        System.out.println("Робочий день");
                        break;
                    case 6: case 7:
                        System.out.println("Вихідний день");
                        break;
                    default:
                        System.out.println("Невірний день");
                        break;
                }

                success = true; 
                System.out.println("\nПрограму успішно завершено!");

            } catch (InputMismatchException e) {
                System.out.println("\n[ПОМИЛКА] Введено некоректні дані! Починаємо спочатку...");
                System.out.println("Пам'ятайте: для дробів використовуйте кому.\n");
                System.out.println("--------------------------------------------------");
                s.nextLine(); // Обов'язкове очищення буфера сканера від неправильного вводу
            } catch (Exception e) {
                System.out.println("\n[ФАТАЛЬНА ПОМИЛКА]: " + e.getMessage());
                break; // Виходимо з циклу при інших серйозних помилках
            }
        }
    }
}