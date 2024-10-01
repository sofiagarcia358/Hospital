package hospital.Service;

import hospital.model.Sala;
import java.util.ArrayList;
import java.util.List;

public class DataSalas {

    public static List<Sala> listaSalas() {
        List<Sala> salas = new ArrayList<>();

        salas.add(new Sala("Sala de Emergencias", "En uso"));
        salas.add(new Sala("Sala de Cirugía", "Disponible"));
        salas.add(new Sala("Sala de Cuidados Intensivos", "Fuera de servicio"));
        salas.add(new Sala("Sala de Observación", "En uso"));
        salas.add(new Sala("Sala de Pediatría", "Disponible"));
        salas.add(new Sala("Sala de Neonatología", "Fuera de servicio"));
        salas.add(new Sala("Sala de Ginecología", "En uso"));
        salas.add(new Sala("Sala de Traumatología", "Disponible"));
        salas.add(new Sala("Sala de Cardiología", "En uso"));
        salas.add(new Sala("Sala de Oncología", "Disponible"));
        salas.add(new Sala("Sala de Urología", "Fuera de servicio"));
        salas.add(new Sala("Sala de Neurología", "Disponible"));

        return salas;
    }
}