import javax.swing.*;
import javax.swing.event.*;

public class ListSelectionEventExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ListSelectionEvent Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);

            DefaultListModel<String> listModel = new DefaultListModel<>();
            listModel.addElement("Elemento 1");
            listModel.addElement("Elemento 2");
            listModel.addElement("Elemento 3");
            listModel.addElement("Elemento 4");

            JList<String> list = new JList<>(listModel);
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            list.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        int selectedIndex = list.getSelectedIndex();
                        if (selectedIndex != -1) {
                            String selectedValue = listModel.getElementAt(selectedIndex);
                            updateLabel(selectedValue);
                        }
                    }
                }
            });

            frame.add(new JScrollPane(list));
            frame.setVisible(true);
        });
    }

    // Método para actualizar una etiqueta o cualquier componente con el valor seleccionado
    private static void updateLabel(String selectedValue) {
        System.out.println("Elemento seleccionado: " + selectedValue);
    }
}
