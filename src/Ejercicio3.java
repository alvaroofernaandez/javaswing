import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 {

    public Ejercicio3() {
        JFrame frame = new JFrame("Ejercicio3");
        JPanel contentPanel = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.GridLayout(6, 1));

        JPanel panelNombre = new JPanel();
        JLabel nombre = new JLabel("Nombre:");
        nombre.setHorizontalAlignment(JLabel.CENTER);
        nombre.setBounds(0, 0, 100, 30);
        JTextField textFieldNombre = new JTextField(10);
        textFieldNombre.setBounds(0, 0, 100, 30);
        panelNombre.add(nombre);
        panelNombre.add(textFieldNombre);


        JPanel panelApellidos = new JPanel();
        JLabel apellidos = new JLabel("Apellidos:");
        apellidos.setHorizontalAlignment(JLabel.CENTER);
        apellidos.setBounds(0, 0, 100, 30);
        JTextField textFieldApellidos = new JTextField(10);
        textFieldApellidos.setBounds(0, 0, 100, 30);
        panelApellidos.add(apellidos);
        panelApellidos.add(textFieldApellidos);

        JPanel panelPassword = new JPanel();
        JLabel password = new JLabel("Contraseña:");
        password.setHorizontalAlignment(JLabel.CENTER);
        JPasswordField value = new JPasswordField(10);
        panelPassword.add(password);
        panelPassword.add(value);

        JPanel panelGenero = new JPanel();
        JLabel genero = new JLabel("Género:");
        genero.setHorizontalAlignment(JLabel.CENTER);
        JRadioButton radiobutton = new JRadioButton("A) Hombre");
        JRadioButton radiobutton2 = new JRadioButton("B) Mujer");
        panelGenero.add(genero);
        panelGenero.add(radiobutton);
        panelGenero.add(radiobutton2);

        JPanel panelCheckbox = new JPanel();
        JCheckBox checkBox1 = new JCheckBox("¿Estás de acuerdo?");
        panelCheckbox.add(checkBox1);

        JPanel panelEnviar = new JPanel();
        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                String apellidos = textFieldApellidos.getText();
                String password = value.getText();
                String genero = (radiobutton.isSelected()? "Hombre" : "Mujer");
                boolean checkbox = checkBox1.isSelected();

                JOptionPane.showMessageDialog(frame, "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nContraseña: " + ("*".repeat(password.length())) + "\nGénero: " + genero + "\nCheckbox: " + checkbox);
            }
        });
        panelEnviar.add(botonEnviar);

        panel.add(panelNombre);
        panel.add(panelApellidos);
        panel.add(panelPassword);
        panel.add(panelGenero);
        panel.add(panelCheckbox);
        panel.add(panelEnviar);
        contentPanel.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}
