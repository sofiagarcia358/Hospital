package backEnde;
import java.util.HashMap;

import java.util.ArrayList;

public class BackEnde {
    private HashMap<String, String> services;
    private HashMap<String, HashMap<String, String>> userInfo;

    public BackEnde() {
        services = new HashMap<>();
        userInfo = new HashMap<>();

        // Añadir usuarios a la "base de datos"
        services.put("luis12", "contra123");
        services.put("aaron2", "contra34");

        // Añadir información adicional de los usuarios
        HashMap<String, String> infoUsuario1 = new HashMap<>();
        infoUsuario1.put("Nombre", "Luis");
        infoUsuario1.put("Correo", "luisreyes@gmail.com");

        HashMap<String, String> infoUsuario2 = new HashMap<>();
        infoUsuario2.put("Nombre", "Aarón");
        infoUsuario2.put("Correo", "aaronTecu@gmail.com");

        userInfo.put("usuario1", infoUsuario1);
        userInfo.put("usuario2", infoUsuario2);
    }

    // Método para validar los datos de usuario y contraseña
    public HashMap<String, String> validarDatos(String usuario, String contraseña) {
        HashMap<String, String> resultado = new HashMap<>();

        // Verifica si el usuario existe en el sistema
        if (services.containsKey(usuario)) {
            // Verifica si la contraseña es correcta
            if (services.get(usuario).equals(contraseña)) {
                // Retorna la información del usuario si la validación es exitosa
                return userInfo.get(usuario);
            } else {
                // Error: Contraseña incorrecta
                resultado.put("Error", "Contraseña incorrecta");
                return resultado;
            }
        } else {
            // Error: Usuario no encontrado
            resultado.put("Error", "Usuario no encontrado");
            return resultado;
        }
    }
}




