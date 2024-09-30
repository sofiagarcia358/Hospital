package backEnde;

import hospital.Service.bdDoctores;
import hospital.model.DoctorGeneral;
import hospital.view.DoctorView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackEnde {
    public static HashMap<String, String> validarDatos(String user, String password) {

        ArrayList<DoctorGeneral> doctores = bdDoctores.listaDoctores();

        for (DoctorGeneral infDoc : doctores) {

            if (infDoc.getCorreo().equalsIgnoreCase(user) || infDoc.getUser().equalsIgnoreCase(user)) {
                if (infDoc.getContrasenna().equalsIgnoreCase(password)) {

                    HashMap<String, String> datosDoctor = new HashMap<>();
                    datosDoctor.put("nombre doctor", infDoc.getNombre());
                    datosDoctor.put("especialidad", infDoc.getCargo());
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