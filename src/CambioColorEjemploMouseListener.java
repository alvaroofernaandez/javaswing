import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CambioColorEjemploMouseListener extends JFrame {

    public CambioColorEjemploMouseListener() {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Pasa el Ratón");
        button.setPreferredSize(new Dimension(200, 100));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(UIManager.getColor("Button.background"));
            }
        });

        frame.add(button, BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setSize(400, 400);
    }

    public static void main(String[] args) {
        new CambioColorEjemploMouseListener();
    }
}
