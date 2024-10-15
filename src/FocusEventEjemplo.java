import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FocusEventEjemplo {

    public FocusEventEjemplo() {
        JFrame frame = new JFrame();

        JButton b = new JButton("Pasa el ratón");
        b.setPreferredSize(new Dimension(200, 100));

        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                b.setBackground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                b.setBackground(UIManager.getColor("Button.background"));
            }
        });

        frame.add(b);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FocusEventEjemplo();
    }

}
