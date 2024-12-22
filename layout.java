import javax.swing.*;
import java.awt.*;

public class LayoutManagersDemo {

    public LayoutManagersDemo() {
        // Создание основного окна
        JFrame frame = new JFrame("Layout Managers Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout()); // BorderLayout для основного окна

        // Панель с FlowLayout
        JPanel flowPanel = new JPanel();
        flowPanel.setLayout(new FlowLayout()); // FlowLayout для панели
        flowPanel.setBackground(Color.LIGHT_GRAY);

        // Добавление кнопок на FlowLayout панель
        for (int i = 1; i <= 5; i++) {
            flowPanel.add(new JButton("Button " + i));
        }

        // Добавление панели в центральную область BorderLayout
        frame.add(flowPanel, BorderLayout.CENTER);

        // Панель с кнопками в нижней части BorderLayout
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(new JButton("Left Button"), BorderLayout.WEST);
        bottomPanel.add(new JButton("Right Button"), BorderLayout.EAST);

        // Добавление панели в нижнюю часть окна
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Отображение окна
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LayoutManagersDemo::new);
    }
}
