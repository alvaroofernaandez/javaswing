import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuEventEjemplo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ejemplo PopupMenu Event");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);

            JLabel label = new JLabel("Haz click derecho", SwingConstants.CENTER);
            JPopupMenu popupMenu = new JPopupMenu();

            popupMenu.add(new JMenuItem("Opción 1"));

            popupMenu.addPopupMenuListener(new PopupMenuListener() {
                @Override
                public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
                    label.setText("El menú está apareciendo");
                }

                @Override
                public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
                    label.setText("Haz click derecho");
                }

                @Override
                public void popupMenuCanceled(PopupMenuEvent e) {
                    label.setText("Haz click derecho");
                }
            });

            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    }
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (e.isPopupTrigger()) {
                        popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
            });

            frame.add(label);
            frame.setVisible(true);
        });
    }
}
