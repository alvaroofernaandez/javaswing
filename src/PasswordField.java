import javax.swing.*;

public class PasswordField {

    public static void main(String[] args) {
        JFrame frame = new JFrame("PasswordField");
        JPasswordField value = new JPasswordField();
        JLabel label = new JLabel("Password");
        label.setBounds(20, 100, 80,  30);
        value.setBounds(100, 100, 100,  30);
        frame.add(value);
        frame.add(label);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
