import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


public class ColorChooser extends JFrame implements ActionListener {
    JButton b;
    Container c;

    ColorChooser() {
        c =getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Choose Color");
        b.addActionListener(this);
        c.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        Color initialcolor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        ColorChooser ch = new ColorChooser();
        ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ch.setSize(400, 400);
        ch.setVisible(true);
    }
}
