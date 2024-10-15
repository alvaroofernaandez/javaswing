import javax.swing.*;
import java.awt.*;

public class ToolBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JToolBar toolbar = new JToolBar();
        toolbar.setRollover(true);
        JButton button = new JButton("File");
        toolbar.add(button);
        toolbar.addSeparator();
        toolbar.add(new JButton("Edit"));
        toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4"}));
        Container contentPane = frame.getContentPane();
        contentPane.add(toolbar, BorderLayout.NORTH);
        JTextArea textArea = new JTextArea();
        JScrollPane scrollBar = new JScrollPane(textArea);
        contentPane.add(scrollBar, BorderLayout.EAST);
        frame.setSize(450, 250);
        frame.setVisible(true);
    }
}
