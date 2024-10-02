package hospital.view;

import hospital.model.Paciente;
import hospital.model.Sala;
import hospital.Service.DataPacientes;
import hospital.Service.DataSalas;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DoctorView extends JFrame {
    private int[] pantalla = {1300, 800};
    private ArrayList<Paciente> pacienteList = DataPacientes.listaPacientes();
    private HashMap<String, String> datosDoctor;
    private JPanel panelCentral; // Panel para mostrar el contenido dinámico
    private CardLayout cardLayout; // Para cambiar entre el panel de pacientes y el panel de salas

    public DoctorView(HashMap<String, String> datosDoctor) {
        this.datosDoctor = datosDoctor;

        this.setSize(pantalla[0], pantalla[1]);
        this.setLayout(new BorderLayout());
        this.setTitle("Perfil del doctor");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setPreferredSize(new Dimension(1300, 60));
        headerPanel.setBackground(Color.darkGray);

        JLabel nombreHospital = new JLabel("Hospital Santa Catalina");
        nombreHospital.setForeground(Color.white);
        nombreHospital.setFont(new Font("Arial", Font.BOLD, 16));
        nombreHospital.setBorder(new EmptyBorder(0, 30, 0, 0)); // establece un margen

        JPanel userPanel = new JPanel(new GridBagLayout());
        userPanel.setPreferredSize(new Dimension(270, 60));
        userPanel.setBackground(Color.darkGray);

        JPanel representacionLogo = new JPanel();
        representacionLogo.setPreferredSize(new Dimension(40, 40));
        representacionLogo.setBackground(Color.orange);

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridheight = 2;
        restricciones.insets = new Insets(0, 14, 0, 0);

        userPanel.add(representacionLogo, restricciones);

        JLabel nombreDoc = new JLabel(String.valueOf(datosDoctor.get("Nombre")));
        nombreDoc.setFont(new Font("Arial", Font.BOLD, 15));
        nombreDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 0;
        restricciones.gridheight = 1;

        userPanel.add(nombreDoc, restricciones);

        JLabel especialidadDoc = new JLabel(String.valueOf(datosDoctor.get("Especialidad")));
        especialidadDoc.setFont(new Font("Arial", Font.PLAIN, 13));
        especialidadDoc.setForeground(Color.white);

        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridheight = 2;
        restricciones.anchor = GridBagConstraints.WEST;

        userPanel.add(especialidadDoc, restricciones);

        headerPanel.add(userPanel, BorderLayout.EAST);
        headerPanel.add(nombreHospital, BorderLayout.WEST);
        this.add(headerPanel, BorderLayout.NORTH);

        // Crear el panel central con CardLayout para alternar entre paneles
        cardLayout = new CardLayout();
        panelCentral = new JPanel(cardLayout);

        // Panel de pacientes
        JPanel panelPacientes = PacienteView.panelPaciente(pacienteList);

        // Panel de salas
        List<Sala> salas = DataSalas.listaSalas(); // Suponiendo que DataSalas.listaSalas() devuelve una lista de salas
        SalasView salasView = new SalasView();
        JPanel panelSalas = salasView.crearPanelGrid(salas);

        // Añadir ambos paneles al panel central
        panelCentral.add(panelPacientes, "Pacientes");
        panelCentral.add(panelSalas, "Salas");

        // Añadir el panel central a la ventana
        this.add(panelCentral, BorderLayout.CENTER);

        // Añadir el menú lateral
        this.add(componenteMenuLateral(), BorderLayout.WEST);

        this.setVisible(true);
    }

    private JPanel componenteMenuLateral() {

        JPanel panelMenu = new JPanel();
        panelMenu.setPreferredSize(new Dimension(250, pantalla[1]));
        panelMenu.setBackground(Color.darkGray);

        JPanel menu = new JPanel(new GridBagLayout());

        GridBagConstraints restricciones = new GridBagConstraints();
        restricciones.fill = GridBagConstraints.HORIZONTAL;
        restricciones.gridx = 0;

        menu.add(crearBoton("Consulta Del Día"), restricciones);
        menu.add(crearBotonSalas("Salas"), restricciones); // Cambiar este botón para mostrar el panel de salas
        menu.add(crearBoton("Farmacía"), restricciones);
        menu.add(crearBoton("Pacientes Registrados"), restricciones);
        menu.add(crearBoton("Citar en otra Area"), restricciones);

        panelMenu.add(menu);
        return panelMenu;
    }

    private JButton crearBoton(String texto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> {
            System.out.println(texto);
        });
        return boton;
    }

    // Nuevo botón para alternar a las salas
    private JButton crearBotonSalas(String texto) {
        JButton boton = new JButton(texto);
        boton.addActionListener(e -> {
            cardLayout.show(panelCentral, "Salas"); // Muestra el panel de salas
        });
        return boton;
    }
}