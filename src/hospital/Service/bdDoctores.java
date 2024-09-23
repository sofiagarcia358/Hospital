package hospital.Service;

import hospital.model.DoctorGeneral;
import java.util.ArrayList;

public class bdDoctores {
    private ArrayList<DoctorGeneral> doctores;
    public bdDoctores(){
        doctores = new ArrayList<>();


        doctores.add(new DoctorGeneral("Luis", "luisreyes@gmail.com", "cirujano", "luis12", "contra123"));
        doctores.add(new DoctorGeneral("Aaron", "aaronTecu@gmail.com", "cardiologo", "aaron2", "contra34"));
        doctores.add(new DoctorGeneral("Alejandro", "alejandroRodas@gmail.com", "Enfermero", "ale345", "contra33"));
        doctores.add(new DoctorGeneral("Yaretzi", "Yare@gmail.com", "medico General", "yare17", "contra172"));
    }
    public DoctorGeneral login(String usuario, String contrasena) {

        for (DoctorGeneral doctor : doctores) {

            if (doctor.getUsuario().equals(usuario) && doctor.getContrasena().equals(contrasena)) {
                return doctor;
            }
        }
        return null;
    }

}
