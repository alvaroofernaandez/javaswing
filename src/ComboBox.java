import javax.swing.*;

public class ComboBox{

    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox");
        String nombres[] = { "Alvaro", "Juan", "Fran", "Ruben", "Pablo"};
        JComboBox comboBox = new JComboBox(nombres);
        comboBox.setBounds(50, 50, 90, 20);
        frame.add(comboBox);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}
