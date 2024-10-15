import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogExample {
        private static JDialog d;

        DialogExample() {
            JFrame frame = new JFrame("Button");
            d = new JDialog(frame, "Action Event", true);
            d.setLayout(new FlowLayout());
            JButton b = new JButton("Click");

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    DialogExample.d.setVisible(false);
                }
            });

            d.add(new JLabel("Pulsa el botón"));
            d.add(b);
            d.setSize(300, 300);
            d.setVisible(true);
        }

        public static void main(String[] args) {
            new DialogExample();
        }
}

