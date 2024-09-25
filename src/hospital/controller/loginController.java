package hospital.controller;

import backEnde.BackEnde;
import hospital.view.DoctorView;
import hospital.view.LoginView;

import java.util.HashMap;

public class loginController {

    private LoginView loginView;
    private BackEnde backEnde;

    public loginController(LoginView loginView, BackEnde backEnde) {
        this.loginView = loginView;
        this.backEnde = backEnde;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    private void iniciarSesion() {
        String usuario = loginView.getUsuario();
        String password = loginView.getPassword();

        HashMap<String, String> result = backEnde.validarDatos(usuario, password);

        if (result.containsKey("Error")) {
            System.out.println("Error: " + result.get("Error"));
        } else {
            System.out.println("Login exitoso:");
            System.out.println("Nombre: " + result.get("Nombre"));
            System.out.println("Correo: " + result.get("Correo"));
            System.out.println("Especialidad: " + result.get("Especialidad"));


            loginView.setVisible(false);
            new DoctorView(result);
        }
    }
}