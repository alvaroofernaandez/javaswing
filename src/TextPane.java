import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class TextPane {
    public static void main(String[] args) throws BadLocationException {
        JFrame frame = new JFrame("Text Pane");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = frame.getContentPane();
        JTextPane pane = new JTextPane();
        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true);

        pane.setCharacterAttributes(attributeSet, true);
        pane.setText("Welcome");

        attributeSet = new SimpleAttributeSet();
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setForeground(attributeSet, Color.blue);
        StyleConstants.setBackground(attributeSet, Color.red);

        Document doc = pane.getStyledDocument();
        doc.insertString(doc.getLength(), "To Java ", attributeSet);

        attributeSet = new SimpleAttributeSet();
        doc.insertString(doc.getLength(), "World ", attributeSet);

        JScrollPane scrollpane = new JScrollPane(pane);
        cp.add(scrollpane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
