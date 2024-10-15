import javax.swing.*;

public class ScrollBar {

    ScrollBar() {
        JFrame frame = new JFrame("Scrollbar");
        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(100, 100, 50, 100);
        frame.add(scrollBar);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ScrollBar();
    }
}
