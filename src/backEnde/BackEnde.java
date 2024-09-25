package backEnde;

import hospital.model.DoctorGeneral;
import hospital.Service.bdDoctores;

import java.util.HashMap;

public class BackEnde {

    public HashMap<String, String> validarDatos(String usuario, String contraseña) {
        HashMap<String, String> response = new HashMap<>();

        // Validación básica
        if (usuario == null || usuario.isEmpty()) {
            response.put("Error", "El usuario no puede estar vacío");
            return response;
        }

        if (contraseña == null || contraseña.isEmpty()) {
            response.put("Error", "La contraseña no puede estar vacía");
            return response;
        }

        if (contraseña.length() < 6) {
            response.put("Error", "La contraseña debe tener al menos 6 caracteres");
            return response;
        }

        // Validación de autenticación en el backend
        bdDoctores dataDoctor = new bdDoctores();
        DoctorGeneral doctor = dataDoctor.getDoctorByUsuario(usuario);

        if (doctor != null && doctor.getContraseña().equals(contraseña)) {
            response.put("Nombre", doctor.getNombre());
            response.put("Correo", doctor.getCorreo());
            response.put("Especialidad", doctor.getEspecialidad());
        } else {
            response.put("Error", "Credenciales incorrectas");
        }

        return response;
    }
}