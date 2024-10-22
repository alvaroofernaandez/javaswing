import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample1 extends JFrame {

    public BoxLayoutExample1() {

        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("Boton 4");
        JButton boton5 = new JButton("Boton 5");


        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);


        add(panel);
        setTitle("BoxLayout Example");
        setSize(50, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutExample1();
    }
}
