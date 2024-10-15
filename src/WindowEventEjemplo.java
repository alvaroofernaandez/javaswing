import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class WindowEventEjemplo extends JFrame {

    public WindowEventEjemplo() {

        super("Ejemplo Window Event");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(WindowEventEjemplo.this, "Ventana abierta.");
            }

           @Override
           public void windowClosing(java.awt.event.WindowEvent e) {
               JOptionPane.showMessageDialog(WindowEventEjemplo.this, "Ventana cerrada.");
           }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(400, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowEventEjemplo();
    }
}
