import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Ejercicio {

    public Ejercicio() {
        JFrame frame = new JFrame("Ejercicio");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 5));

        for (int i = 1; i <= 25; i++) {
            JButton button = new JButton(String.valueOf(i + 1));
            button.setText("Botón "+ i);
            panel.add(button);
        }

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ejercicio ej = new Ejercicio();
            }
        });
    }
}
