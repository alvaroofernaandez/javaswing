import javax.swing.*;
import java.awt.*;
import java.awt.GridLayout;

public class Ejercicio2 {

    public Ejercicio2() {
        JFrame frame = new JFrame("Ejercicio2");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JButton("Botón 1"), BorderLayout.NORTH);
        panel.add(new JButton("Botón 2"), BorderLayout.EAST);
        panel.add(new JButton("Botón 3"), BorderLayout.WEST);
        panel.add(new JButton("Botón 4"), BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2,2));
        panel2.add(new JButton("Botón 5"));
        panel2.add(new JButton("Botón 6"));
        panel2.add(new JButton("Botón 7"));
        panel2.add(new JButton("Botón 8"));

        panel.add(panel2, BorderLayout.CENTER);
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Ejercicio2 ej2 = new Ejercicio2();
            }
        });
    }
}
