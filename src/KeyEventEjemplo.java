import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEjemplo extends JFrame {

    public JTextField tf;

    public KeyEventEjemplo() {
        JFrame frame = new JFrame();

        tf = new JTextField(20);
        tf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    tf.setText("Enter presionado");
                    tf.setBackground(Color.RED);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(tf);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new KeyEventEjemplo();
    }
}
