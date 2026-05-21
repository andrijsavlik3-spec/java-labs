import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Variant15 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtV0;
    private JTextField txtAlpha;
    private JTextField txtResult;

    public Variant15() {
        // Налаштування основного вікна (фрейму)
        setTitle("Лабораторна робота 9 - Варіант 15");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 420, 250);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Абсолютне позиціювання
        setContentPane(contentPane);

        // --- Створення та розміщення елементів керування ---

        // Мітка та поле для початкової швидкості (v0)
        JLabel lblV0 = new JLabel("Початкова швидкість v0 (м/с):");
        lblV0.setBounds(30, 30, 190, 20);
        contentPane.add(lblV0);

        txtV0 = new JTextField();
        txtV0.setBounds(230, 30, 130, 20);
        contentPane.add(txtV0);

        // Мітка та поле для кута (alpha)
        JLabel lblAlpha = new JLabel("Кут α (в градусах):");
        lblAlpha.setBounds(30, 70, 190, 20);
        contentPane.add(lblAlpha);

        txtAlpha = new JTextField();
        txtAlpha.setBounds(230, 70, 130, 20);
        contentPane.add(txtAlpha);

        // Мітка та поле для результату (відстань)
        JLabel lblResult = new JLabel("Відстань польоту (м):");
        lblResult.setBounds(30, 110, 190, 20);
        contentPane.add(lblResult);

        txtResult = new JTextField();
        txtResult.setBounds(230, 110, 130, 20);
        txtResult.setEditable(false); // В поле для результату ввід заборонено
        contentPane.add(txtResult);

        // Кнопка для запуску обчислення
        JButton btnCalculate = new JButton("Обчислити");
        btnCalculate.setBounds(130, 160, 150, 30);
        contentPane.add(btnCalculate);

        // --- Обробник події натискання кнопки ---
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Зчитування даних з текстових полів
                    double v0 = Double.parseDouble(txtV0.getText());
                    double alpha = Double.parseDouble(txtAlpha.getText());
                    double g = 9.81; // Прискорення вільного падіння
                    
                    // Переведення кута з градусів у радіани для методу Math.sin()
                    double alphaRad = Math.toRadians(alpha);
                    
                    // Обчислення за заданою формулою
                    double h_rmax = (Math.pow(v0, 2) * Math.sin(2 * alphaRad)) / g;
                    
                    // Вивід результату з округленням до двох знаків після коми
                    txtResult.setText(String.format("%.2f", h_rmax));
                    
                    // Вивід у консоль для перевірки кодування UTF-8
                    System.out.println("Обчислено відстань: " + String.format("%.2f", h_rmax) + " м");
                    
                } catch (NumberFormatException ex) {
                    // Обробка помилки некоректного вводу
                    JOptionPane.showMessageDialog(null, 
                        "Будь ласка, введіть коректні числові дані!", 
                        "Помилка вводу", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Примусове встановлення кодування UTF-8 для виводу в консоль
        try {
            System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Запуск форми
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Variant15 frame = new Variant15();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}