import javax.swing.*;

public class Table {
    JFrame frame;

    Table() {
        frame = new JFrame();
        String data[][] = {{ "101", "Amit", "6700000"},{"102", "Jai", "67000002"}, {"101", "Sachin", "67000003"}};
        String columnNames[] = {"ID", "Name", "Salary"};
        JTable table = new JTable(data, columnNames);
        table.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Table();
    }
}
