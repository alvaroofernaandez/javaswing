import javax.swing.*;

public class OptionPane {
    JFrame f;

    OptionPane() {
        f = new JFrame();
        JOptionPane.showMessageDialog(f, "Correcto", "Alert", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new OptionPane();
    }
}
