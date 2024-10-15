import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPopUp {

    MenuPopUp() {
        final JFrame frame = new JFrame("PopUp");
        final JPopupMenu popupmenu = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cortar");
        JMenuItem copy = new JMenuItem("Copiar");
        JMenuItem paste = new JMenuItem("Pegar");

        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(frame, e.getX(), e.getY());
            }
        });
        frame.add(popupmenu);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuPopUp();
    }
}
