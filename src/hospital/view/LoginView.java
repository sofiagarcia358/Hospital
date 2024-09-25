package hospital.view;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    private JTextField userField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginView() {

        // VENTANA LOGIN
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 600);
        this.setLocationRelativeTo(null);

        // |-- [ PANEL LOGIN ]
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridBagLayout());
        loginPanel.setBackground(Color.WHITE);

        // |---[ resGb = Restricciones de diseño generales ]
        GridBagConstraints resGb = new GridBagConstraints();
        resGb.insets = new Insets(15, 15, 15, 15);
        resGb.fill = GridBagConstraints.HORIZONTAL;
        Font myFont = new Font("Arial", Font.PLAIN, 18);

        // |--- [ Componentes del panel ]
        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setFont(myFont);
        userLabel.setForeground(Color.GRAY);
        resGb.gridx = 0;
        resGb.gridy = 0;
        loginPanel.add(userLabel, resGb);

        userField = new JTextField();
        userField.setPreferredSize(new Dimension(250, 40));
        userField.setFont(myFont);
        userField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        resGb.gridx = 1;
        resGb.gridy = 0;
        loginPanel.add(userField, resGb);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setFont(myFont);
        passwordLabel.setForeground(Color.GRAY);
        resGb.gridx = 0;
        resGb.gridy = 1;
        loginPanel.add(passwordLabel, resGb);

        passwordField = new JPasswordField();
        passwordField.setFont(myFont);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY));
        resGb.gridx = 1;
        resGb.gridy = 1;
        loginPanel.add(passwordField, resGb);

        loginButton = new JButton("Iniciar sesión");
        loginButton.setFont(myFont);
        loginButton.setBackground(Color.LIGHT_GRAY);
        loginButton.setForeground(Color.WHITE);
        resGb.gridx = 1;
        resGb.gridy = 2;
        loginPanel.add(loginButton, resGb);

        this.add(loginPanel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public String getUsuario() {
        return userField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }
}