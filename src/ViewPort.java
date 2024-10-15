import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class ViewPort {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Simple ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("label");
        label.setPreferredSize(new Dimension(1000, 1000));
        JScrollPane scrollPane = new JScrollPane(label);

        JButton button = new JButton();
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setViewportBorder(new LineBorder(Color.RED));
        scrollPane.getViewport().add(button, null);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(400, 150);
        frame.setVisible(true);

    }
}
