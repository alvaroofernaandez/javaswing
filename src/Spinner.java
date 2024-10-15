import javax.swing.*;

public class Spinner {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spinner");
        SpinnerModel value = new SpinnerNumberModel(5, 0, 10, 1);
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100, 100, 50, 30);
        frame.add(spinner);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
