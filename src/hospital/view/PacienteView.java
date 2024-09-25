package hospital.view;

import hospital.model.paciente;
import hospital.Service.DataPaciente;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PacienteView extends JFrame {

    private ArrayList<paciente> listaPacientes;

    // Constructor que recibe el ArrayList de pacientes y lo asigna al atributo local
    public PacienteView(ArrayList<paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
        this.setTitle("Listado de Pacientes");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Añade el panel de pacientes a la ventana
        this.add(panelPaciente(listaPacientes));
        this.setVisible(true);
    }

    // Método que crea el panel con la lista de pacientes
    public JPanel panelPaciente(ArrayList<paciente> listaPacientes) {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Título de la lista de pacientes
        JLabel titulo = new JLabel("Listado de Pacientes", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(titulo, BorderLayout.NORTH);

        // Panel que contendrá las filas con los datos de los pacientes
        JPanel panelListado = new JPanel();
        panelListado.setLayout(new GridLayout(listaPacientes.size() + 1, 4, 10, 10)); // +1 para los títulos

        // Crear los títulos de la tabla
        String[] campos = {"NOMBRE", "FECHA_NACIMIENTO", "HORARIO_CITA", "VISITA"};
        for (String campo : campos) {
            JLabel labelCampo = new JLabel(campo, SwingConstants.CENTER);
            labelCampo.setFont(new Font("Arial", Font.BOLD, 14));
            panelListado.add(labelCampo);
        }

        // Agregar los datos de los pacientes en forma de fila
        for (paciente paciente: listaPacientes) {
            panelListado.add(crearLabelFila(paciente.getNombre()));
            panelListado.add(crearLabelFila(paciente.getFechaNacimiento()));
            panelListado.add(crearLabelFila(paciente.getHorarioCita()));
            panelListado.add(crearLabelFila(paciente.getMotivoVisita()));
        }

        // Agregar el panel listado de pacientes al panel principal
        panel.add(panelListado, BorderLayout.CENTER);

        return panel;
    }

    // Método auxiliar para crear un JLabel con el dato de cada paciente
    private JLabel crearLabelFila(String dato) {
        JLabel label = new JLabel(dato, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 12));
        return label;
    }

    // Método principal para probar la clase PacienteView
    public static void main(String[] args) {
        // Obtener la lista de pacientes desde DataPaciente
        ArrayList<paciente>listaPacientes = DataPaciente.obtenerPacientes();

        // Crear la vista con la lista de pacientes
        new PacienteView(listaPacientes);
    }
}
