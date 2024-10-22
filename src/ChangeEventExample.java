import javax.swing.*;
import javax.swing.event.*;

public class ChangeEventExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ChangeEvent Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
            JLabel label = new JLabel("Valor seleccionado: " + slider.getValue());

            slider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e) {
                    label.setText("Valor seleccionado: " + slider.getValue());
                }
            });

            frame.setLayout(new java.awt.BorderLayout());
            frame.add(slider, java.awt.BorderLayout.CENTER);
            frame.add(label, java.awt.BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
