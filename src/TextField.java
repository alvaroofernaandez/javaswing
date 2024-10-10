import javax.swing.*;

public class TextField {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextField");
        JTextField tf1, tf2;
        tf1 = new JTextField("Bienvenido");
        tf1.setBounds(50, 100, 200, 30);
        tf2 = new JTextField("¿Cómo estás?");
        tf2.setBounds(50, 150, 200, 30);
        frame.add(tf1);
        frame.add(tf2);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
