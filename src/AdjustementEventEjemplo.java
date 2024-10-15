import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustementEventEjemplo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("AdjustementEventEjemplo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0 ,100);
            JLabel lbl = new JLabel("Valor: " + sb.getValue());

            sb.addAdjustmentListener(new AdjustmentListener() {
                @Override
                public void adjustmentValueChanged(AdjustmentEvent e) {
                    lbl.setText("Valor: " + sb.getValue());
                }
            });

            frame.setLayout(new FlowLayout());
            frame.add(sb);
            frame.add(lbl);
            frame.setVisible(true);
        });
    }
}
