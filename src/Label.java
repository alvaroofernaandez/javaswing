import javax.swing.*;

public class Label {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Label");
        JLabel l1, l2;
        l1 = new JLabel("Label1");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("Label2");
        l2.setBounds(50, 100, 100, 30);
        frame.add(l1);
        frame.add(l2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
