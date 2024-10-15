import javax.swing.*;

public class TextArea {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea");
        JTextArea textArea = new JTextArea("TextArea");
        textArea.setBounds(10, 30, 200, 200);
        frame.add(textArea);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
