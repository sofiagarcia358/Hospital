package backEnde;

import hospital.Service.bdDoctores;
import hospital.model.DoctorGeneral;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackEnde {
    public static HashMap<String, String> validarDatos(String user, String password) {

        ArrayList<DoctorGeneral> data = bdDoctores.listaDoctores();

        for (DoctorGeneral infDoc : data) {

            if (infDoc.getUser().equalsIgnoreCase(user) || infDoc.getCorreo().equalsIgnoreCase(user)) {
                if (infDoc.getContrasenna().equalsIgnoreCase(password)) {

                    HashMap<String, String> datosDoctor = new HashMap<>();
                    datosDoctor.put("Nombre", infDoc.getNombre());
                    datosDoctor.put("Especialidad", infDoc.getCargo());
                    datosDoctor.put("password", infDoc.getContrasenna());
                    datosDoctor.put("email", infDoc.getCorreo());
                    datosDoctor.put("usuario", infDoc.getUser());

                    System.out.println(datosDoctor.entrySet());
                    return datosDoctor;
                }
            }
        }

        HashMap<String, String> datosDoctor = new HashMap<>();
        datosDoctor.put("Error", "¡¡ERROR!! Verifique usuario o contraseña");
        System.out.println(datosDoctor.get("Error"));
        return datosDoctor;
    }
}