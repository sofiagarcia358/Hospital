package hospital.view;
import hospital.Service.bdDoctores;
import hospital.model.DoctorGeneral;
import org.w3c.dom.events.EventListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;
import java.util.ArrayList;


public class LoginView extends JFrame {

    // Componentes de la interfaz
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldContraseña;
    private JButton botonIniciarSesion;

    // Constructor
    public LoginView() {
        // Configuración de la ventana
        setTitle("Login");
        setSize(900, 1800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setLayout(new GridBagLayout()); // Usamos GridBagLayout para centrar los elementos

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Margen entre los componentes
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Creación de los componentes
        JLabel etiquetaUsuario = new JLabel("Usuario:");
        textFieldUsuario = new JTextField(15);

        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        passwordFieldContraseña = new JPasswordField(15);

        botonIniciarSesion = new JButton("Iniciar sesión");

        // Posicionamiento de los componentes
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(etiquetaUsuario, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(textFieldUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(etiquetaContraseña, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(passwordFieldContraseña, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(botonIniciarSesion, gbc);


        // Hacemos visible la ventana
        setVisible(true);
    }
    public String getCorreo() {
        return textFieldUsuario.getText();
    }

    public String getContrasena() {
        return passwordFieldContraseña.getText();
    }

    public void addActionListener(ActionListener listener) {
        botonIniciarSesion.addActionListener(listener);
    }
}

