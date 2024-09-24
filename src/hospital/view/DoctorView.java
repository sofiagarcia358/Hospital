package hospital.view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;


public class DoctorView  extends JFrame {


    // Atributo de tipo Array que almacena las dimensiones de la pantalla
    private int[] pantally = {1300, 800}; // Resolución de la ventana (1300 x 800)

    // Constructor
    public DoctorView(HashMap<String, String> doctorData) {
        // Configurar la ventana con las dimensiones del array
        setTitle("Perfil del Doctor");
        setSize(pantally[0], pantally[1]); // Usar las dimensiones del array
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Administrador de diseño BorderLayout
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        // Crear el panel de encabezado (headerPanel)
        JPanel headerPanel = new JPanel();
        headerPanel.setPreferredSize(new Dimension(1300, 60)); // Establecer tamaño 1300x60
        headerPanel.setBackground(Color.DARK_GRAY); // Color de fondo darkGray
        headerPanel.setLayout(new BorderLayout()); // Administrador de diseño BorderLayout
        add(headerPanel, BorderLayout.NORTH); // Añadir el panel al norte del JFrame

        // Panel para el nombre del hospital
        JPanel hospitalPanel = new JPanel();
        hospitalPanel.setBackground(Color.DARK_GRAY); // Fondo oscuro como en la imagen
        hospitalPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // Alinear a la izquierda
        headerPanel.add(hospitalPanel, BorderLayout.WEST); // Colocar en el lado izquierdo

        // Crear JLabel para el nombre del hospital
        JLabel nombreHospital = new JLabel("Hospital Santa Catalina:");
        nombreHospital.setForeground(Color.WHITE); // Letras blancas
        nombreHospital.setFont(new Font("Arial", Font.BOLD, 20)); // Fuente y tamaño de letra
        hospitalPanel.add(nombreHospital); // Añadir al hospitalPanel

        // Panel para la información del doctor y el logo
        JPanel doctorPanel = new JPanel();
        doctorPanel.setBackground(Color.DARK_GRAY); // Fondo oscuro
        doctorPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); // Alinear a la derecha
        headerPanel.add(doctorPanel, BorderLayout.EAST); // Añadir al lado derecho

        // Añadir el logo (simulado con un JLabel)
        JLabel logoLabel = new JLabel();
        logoLabel.setOpaque(true);
        logoLabel.setBackground(Color.green); // Fondo amarillo para simular un logo
        logoLabel.setPreferredSize(new Dimension(40, 40)); // Tamaño del logo
        doctorPanel.add(logoLabel); // Añadir el logo al panel doctorPanel

        // Panel para contener el nombre y la especialidad del doctor en vertical
        JPanel infoDoctorPanel = new JPanel();
        infoDoctorPanel.setBackground(Color.DARK_GRAY);
        infoDoctorPanel.setLayout(new BoxLayout(infoDoctorPanel, BoxLayout.Y_AXIS)); // Alinear verticalmente
        doctorPanel.add(infoDoctorPanel); // Añadir al doctorPanel

        // Añadir el nombre del doctor
        JLabel nombreDoctor = new JLabel("Luis Reyes");
        nombreDoctor.setForeground(Color.WHITE); // Letras blancas
        nombreDoctor.setFont(new Font("Arial", Font.BOLD, 16)); // Fuente y tamaño de letra
        nombreDoctor.setAlignmentX(Component.RIGHT_ALIGNMENT); // Alinear a la derecha
        infoDoctorPanel.add(nombreDoctor); // Añadir al infoDoctorPanel

        // Añadir la especialidad del doctor
        JLabel especialidadDoctor = new JLabel("Doctor General");
        especialidadDoctor.setForeground(Color.LIGHT_GRAY); // Letras en gris claro
        especialidadDoctor.setFont(new Font("Arial", Font.PLAIN, 14)); // Fuente y tamaño de letra
        especialidadDoctor.setAlignmentX(Component.RIGHT_ALIGNMENT); // Alinear a la derecha
        infoDoctorPanel.add(especialidadDoctor); // Añadir la especialidad al infoDoctorPanel

        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        HashMap<String, String> dummyData = new HashMap<>();
        dummyData.put("nombre", "Sofía García");
        dummyData.put("especialidad", "Doctora General");

        new DoctorView(dummyData);

    }
}




