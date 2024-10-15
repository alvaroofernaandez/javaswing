import javax.swing.*;

public class Slider extends JFrame {

    public Slider() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

    public static void main(String[] args) {
        Slider frame = new Slider();
        frame.pack();
        frame.setVisible(true);
    }
}
