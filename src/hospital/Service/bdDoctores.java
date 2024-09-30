package hospital.Service;

import hospital.model.DoctorGeneral;

import java.util.ArrayList;

public class bdDoctores {

    public static ArrayList listaDoctores(){

        ArrayList<DoctorGeneral> data = new ArrayList<>();
        data.add(new DoctorGeneral("Luis", "luisreyes@gmail.com", "cirujano", "luis12", "contra123"));
        data.add(new DoctorGeneral("Aaron", "aaronTecu@gmail.com", "cardiologo", "aaron2", "contra34"));
        data.add(new DoctorGeneral("Alejandro", "alejandroRodas@gmail.com", "Enfermero", "ale345", "contra33"));
        data.add(new DoctorGeneral("Yaretzi", "Yare@gmail.com", "medico General", "yare17", "contra172"));

        return data;
    }
}