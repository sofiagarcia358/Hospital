package hospital.view;

import hospital.model.Medicamento; // Asegúrate de que el modelo Medicamento esté disponible
import hospital.Service.DataFarmacia; // Asegúrate de importar el servicio que devuelve los medicamentos

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class FarmaciaView {
    public JPanel crearPanelFarmacia() {
        JPanel panelFarmacia = new JPanel(new BorderLayout());
        panelFarmacia.setBackground(Color.white);

        List<Medicamento> listaMedicamentos = DataFarmacia.listaMedicamentos(); // Método para obtener la lista de medicamentos
        String[] columnNames = {"Nombre", "Forma Farmacéutica", "Dosis", "Principio Activo", "Fecha de Caducidad", "Número de Lote", "Precio", "Indicaciones", "Contraindicaciones"};

        String[][] data = new String[listaMedicamentos.size()][columnNames.length];

        for (int i = 0; i < listaMedicamentos.size(); i++) {
            Medicamento medicamento = listaMedicamentos.get(i);
            data[i][0] = medicamento.getNombre();
            data[i][1] = medicamento.getFormaFarmaceutica();
            data[i][2] = medicamento.getDosis();
            data[i][3] = medicamento.getPrincipioActivo();
            data[i][4] = medicamento.getNumeroLote();
            data[i][5] = String.valueOf(medicamento.getPrecio());
            data[i][6] = medicamento.getIndicaciones();
            data[i][7] = medicamento.getContraindicaciones();
        }

        JTable table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        panelFarmacia.add(scrollPane, BorderLayout.CENTER);

        return panelFarmacia;
    }
}
