public class Task2And3 {
    public static void main(String[] args) {
        // Завдання 2: Цикл for
        System.out.println("--- Завдання 2 (for) ---");
        for (int h = 0; h <= 2; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " h " + m + " min");
            }
        }
        
        // Завдання 3: Цикл while
        System.out.println("--- Завдання 3 (while) ---");
        int h_w = 0;
        while (h_w <= 2) {
            int m_w = 0;
            while (m_w <= 59) {
                System.out.println(h_w + " h " + m_w + " min");
                m_w++;
            }
            h_w++;
        }
    }
}