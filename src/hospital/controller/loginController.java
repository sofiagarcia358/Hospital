package hospital.controller;

import backEnde.BackEnde;
import hospital.view.DoctorView;
import hospital.view.LoginView;

import java.util.HashMap;

public class loginController {
    private LoginView loginView;

    public loginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginView.addLoginListener(e -> iniciarSesion());
    }

    public void iniciarSesion(){

        HashMap validar = BackEnde.validarDatos(loginView.getUsuario(), loginView.getPassword());

        DoctorView doctorView = new DoctorView(validar);
        loginView.dispose();
    }

}