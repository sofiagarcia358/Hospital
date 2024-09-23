package hospital.controller;

import hospital.model.DoctorGeneral;
import hospital.view.LoginView;
import backEnde.BackEnde;
import java.util.HashMap;

public class loginController {
    private BackEnde backEnde;
    private LoginView loginView;


        public loginController(LoginView loginView, BackEnde backEnde) {
            this.loginView = loginView;
            this.backEnde = backEnde;
            this.loginView.addActionListener(e -> processLogin());
        }
    private void processLogin() {
        String usuario = loginView.getUsuario();
        String password = loginView.getContrasena();

        DoctorGeneral doctor = backEnde.validarDatos(usuario, password);

        if (doctor != null) {
            System.out.println("Estan en:");
            System.out.println("Usuario: " + doctor.getUsuario());
            System.out.println("Contraseña: " + doctor.getContrasena());
            System.out.println("Especialidad: " + doctor.getEspecialidad());
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos");
        }

            }
        }







