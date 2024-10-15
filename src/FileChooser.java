import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.Label;
import java.awt.event.ActionEvent;

public class FileChooser {

    public  void actionPerformed(ActionEvent e) {
        String com = e.getActionCommand();

        Label l = null;
        if (com.equals("save")) {
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());
            int r = jf.showSaveDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                l.setText(jf.getSelectedFile().getAbsolutePath());
            }
            else {
                l.setText("El usuario ha cancelado la operacion");
            }
        }
        else {
            JFileChooser jf = new JFileChooser(FileSystemView.getFileSystemView());

            int r = jf.showOpenDialog(null);

            if (r == JFileChooser.APPROVE_OPTION) {
                l.setText(jf.getSelectedFile().getAbsolutePath());
            }
            else {
                l.setText("El usuario ha cancelado la operacion");
            }
        }


    }
}
