import java.util.Scanner;

public class ConsoleLoopStop {
    
    // Змінна-прапорець для керування циклом. 
    // volatile гарантує, що зміни будуть миттєво видимі для всіх потоків.
    
    private static volatile boolean keepRunning = true;

    public static void main(String[] args) {
        // Створюємо потік, який чекатиме на введення пробілу 
        Thread inputThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Натисніть Пробіл, а потім Enter, щоб зупинити цикл.");
            
            while (keepRunning) {
                String input = scanner.nextLine();
                // Якщо введено пробіл (або рядок містить пробіл)
                if (input.contains(" ")) { 
                    keepRunning = false; // Змінюємо прапорець, щоб зупинити основний цикл
                    System.out.println("Зупинка...");
                    break;
                }
            }
            scanner.close();
        });

        // Запускаємо потік зчитування
        inputThread.start();

        // Ваш основний цикл while
        int counter = 0;
        while (keepRunning) {
            System.out.println("Цикл працює... " + counter++);
            try {
                Thread.sleep(1000); // Чекаємо 1 секунду, щоб не засмічувати консоль
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Програму успішно завершено.");
    }
} 



