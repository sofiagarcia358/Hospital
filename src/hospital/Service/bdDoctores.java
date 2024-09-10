package hospital.Service;

import hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class bdDoctores {
    public static ArrayList Listadoctores() {
        ArrayList<DoctorGeneral> doctores = new ArrayList();
        doctores.add(new DoctorGeneral("Luis", "Reyes", 17, "luisReyes@gmail.com"));
        return doctores;
    }
}