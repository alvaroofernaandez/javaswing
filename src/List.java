import javax.swing.*;

public class List {
    List() {
        JFrame frame = new JFrame();
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item 1");
        l1.addElement("Item 2");
        l1.addElement("Item 3");
        l1.addElement("Item 4");
        JList<String> list = new JList<>(l1);
        list.setBounds(100, 100, 75, 75);
        frame.add(list);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new List();
    }
}
