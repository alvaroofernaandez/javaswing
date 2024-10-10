import javax.swing.*;
import java.awt.*;

public class GridLayout {

    public GridLayout( ) {
    JFrame frame = new JFrame("GridLayout");
    JPanel contentPane = (JPanel) frame.getContentPane();
    JPanel panel = new JPanel();
    panel.setLayout(new java.awt.GridLayout(3, 2));
    panel.add(new JButton("Botón 1"));
    panel.add(new JButton("Botón 2"));
    panel.add(new JButton("Botón 3"));
    panel.add(new JButton("Botón 4"));
    panel.add(new JButton("Botón 5"));
    contentPane.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,200);
    frame.setVisible(true);
    }

    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            GridLayout gui = new GridLayout();
        }
    });
    }
}