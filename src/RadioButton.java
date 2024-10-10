import javax.swing.*;

public class RadioButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton");
        JRadioButton button = new JRadioButton("A) Hombre");
        JRadioButton button2 = new JRadioButton("B) Mujer");
        button.setBounds(75, 50, 100, 30);
        button2.setBounds(75, 100, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(button);
        bg.add(button2);
        frame.add(button);
        frame.add(button2);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
