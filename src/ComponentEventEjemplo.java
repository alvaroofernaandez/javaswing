import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class ComponentEventEjemplo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ComponentEventEjemplo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400,300);
            frame.setVisible(true);

            JLabel label = new JLabel ("Resize me");
            frame.add(label, BorderLayout.CENTER);

            frame.addComponentListener(new ComponentListener() {
                @Override
                public void componentResized(ComponentEvent e) {
                    Dimension newSize = e.getComponent().getSize();
                    label.setText("Width: " + newSize.width + ", Height: " + newSize.height);
                }

                @Override
                public void componentMoved(ComponentEvent e) {

                }

                @Override
                public void componentShown(ComponentEvent e) {

                }

                @Override
                public void componentHidden(ComponentEvent e) {

                }
            });
        });
    }
}
