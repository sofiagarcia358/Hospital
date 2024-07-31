import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    public Login() {
        JFrame miVentana = new JFrame("Luch");
        miVentana.setSize(1000, 1000);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.gray);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());

        JPanel cuadros = new JPanel();
        cuadros.setLayout(new GridLayout(2, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setForeground(Color.BLACK);
        JTextField nameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.black);
        JPasswordField passwordField = new JPasswordField(15);

        JButton boton = new JButton("Login");
        boton.setBounds(4,7,200,300);

        cuadros.add(nameLabel);
        cuadros.add(nameField);
        cuadros.add(passwordLabel);
        cuadros.add(passwordField);

        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = 0;
        grid.anchor = GridBagConstraints.CENTER;
        panel2.add(cuadros, grid);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        miVentana.add(mainPanel);
        miVentana.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login();
            }
        });
    }
}