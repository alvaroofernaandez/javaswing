import javax.swing.*;

public class Button {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button");
        JButton button = new JButton("Click");
        button.setBounds(50, 100, 95, 30);
        frame.add(button);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
