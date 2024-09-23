package backEnde;

import hospital.Service.bdDoctores;
import hospital.model.DoctorGeneral;
import java.util.HashMap;

public class BackEnde {
    private bdDoctores dataDoctores;

    public BackEnde(bdDoctores dataDoctores) {
        this.dataDoctores = dataDoctores;
    }


    public DoctorGeneral validarDatos(String usuario, String contrasena) {
        return dataDoctores.login(usuario, contrasena);
    }
}








