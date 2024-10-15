import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonExample extends JFrame implements ItemListener {

    public static void main(String[] args) {
        new JToggleButtonExample();
    }

    private JToggleButton togglebutton;

    JToggleButtonExample () {
        setTitle("Toggle");
        setLayout(new FlowLayout());
        setJToggleButton();
        setAction();
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setJToggleButton() {
        togglebutton = new JToggleButton("ON");
        add(togglebutton);
    }

    private void setAction() {
        togglebutton.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent eve) {
        if (togglebutton.isSelected()) {
            togglebutton.setText("OFF");
        } else {
            togglebutton.setText("ON");
        }
    }
}
