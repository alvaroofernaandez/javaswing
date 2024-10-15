import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventEjemplo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ItemEventEjemplo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLayout(new FlowLayout());
            JCheckBox checkBox = new JCheckBox("Mostrar texto");
            JLabel label = new JLabel("Texto oculto");

            checkBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        label.setText("Texto visible");
                    }
                    else {
                        label.setText("Texto oculto");
                    }
                }
            });
            frame.add(checkBox);
            frame.add(label);
            frame.setVisible(true);
        });
    }
}
