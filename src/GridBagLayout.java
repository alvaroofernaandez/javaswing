import javax.swing.*;
import java.awt.*;

public class GridBagLayout extends JFrame {

    public GridBagLayout() {
        GridBagConstraints gbc = new GridBagConstraints();
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();

        this.setLayout(layout);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(new JButton("Botón 1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(new JButton("Botón 2"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 20;
        this.add(new JButton("Botón 3"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(new JButton("Botón 4"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill  = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(new JButton("Botón 5"), gbc);

            setSize(300, 300);
            setPreferredSize(getSize());
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main (String[] args) {
        GridBagLayout a = new GridBagLayout();
    }
}
