import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox {

    public CheckBox() {
        JFrame frame = new JFrame("Checkbox");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400, 100);
        JCheckBox checkBox1 = new JCheckBox("Pulsar Checkbox 1");
        checkBox1.setBounds(150, 100, 300, 50);
        JCheckBox checkBox2 = new JCheckBox("Pulsar Checkbox 2");
        checkBox2.setBounds(150, 150, 300, 50);
        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(label);

        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Checkbox 1 " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
                JButton button = new JButton("Checked");
                frame.add(button);
                button.setBackground(Color.GREEN);
                button.setBounds(150, 200, 300, 50);
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Checkbox 2 " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
                label.setBackground(Color.GREEN);
            }
        });

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);



    }

    public static void main(String[] args) {
        new CheckBox();
    }
}
