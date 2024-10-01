package hospital.view;

import hospital.model.Sala;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SalasView {

    public JPanel crearPanelGrid(List<Sala> salas) {
        // Crear un panel que contendrá el título y el grid
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añadir padding alrededor del panel principal

        // Crear un JLabel para el título
        JLabel titulo = new JLabel("Salas", SwingConstants.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD, 10)); // Establecer el tamaño de la fuente
        titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10)); // Margen inferior para el título

        // Añadir el título en la parte superior del panel principal
        panelPrincipal.add(titulo, BorderLayout.NORTH);

        // Crear el panel con GridLayout: 3 filas por 4 columnas (puedes ajustar el número de filas y columnas)
        JPanel panelGrid = new JPanel(new GridLayout(3, 4, 15, 15));
        panelGrid.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Añadir padding dentro del grid

        // Recorrer la lista de salas y agregar cada una al panel grid
        for (Sala sala : salas) {
            // Crear un panel para cada sala utilizando el método crearPanelSala
            JPanel panelSala = crearPanelSala(sala.getNombre(), sala.getEstado());

            // Añadir el panel de la sala al grid
            panelGrid.add(panelSala);
        }

        // Añadir el panel de grid en el centro del panel principal
        panelPrincipal.add(panelGrid, BorderLayout.CENTER);

        return panelPrincipal; // Devolver el panel principal con el título y el grid
    }

    // Método para crear el panel de cada sala con su nombre y color de estado
    public JPanel crearPanelSala(String nombre, String estado) {
        // Crear un panel para la sala
        JPanel panelSala = new JPanel();
        panelSala.setPreferredSize(new Dimension(140, 100)); // Tamaño preferido para cada panel

        // Crear un JLabel con el nombre de la sala
        JLabel labelNombre = new JLabel(nombre);
        labelNombre.setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto del nombre

        // Asignar color según el estado de la sala
        switch (estado) {
            case "En uso":
                panelSala.setBackground(Color.PINK); // Color para 'En uso'
                break;
            case "Fuera de servicio":
                panelSala.setBackground(Color.YELLOW); // Color para 'Fuera de servicio'
                break;
            case "Disponible":
                panelSala.setBackground(Color.CYAN); // Color para 'Disponible'
                break;
            default:
                panelSala.setBackground(Color.WHITE); // Estado no reconocido o por defecto
                break;
        }

        // Añadir el nombre de la sala al panel
        panelSala.add(labelNombre);

        return panelSala; // Devolver el panel configurado para la sala
    }
}
