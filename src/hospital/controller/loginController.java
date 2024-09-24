package hospital.controller;

import hospital.model.DoctorGeneral;
import hospital.view.LoginView;
import hospital.view.DoctorView;
import backEnde.BackEnde;
import java.util.HashMap;

public class loginController {
    private BackEnde backEnde;
    private LoginView loginView;


        public loginController(LoginView loginView, BackEnde backEnde) {
            this.loginView = loginView;
            this.backEnde = backEnde;
            this.loginView.addActionListener(e -> iniciarSesion());
        }
    private void iniciarSesion() {
        String usuario = loginView.getUsuario();
        String password = loginView.getContrasena();

        DoctorGeneral doctor = backEnde.login(usuario, password);

        if (doctor != null) {
            HashMap<String, String> doctorData = new HashMap<>();
            doctorData.put("nombre", doctor.getNombre());
            doctorData.put("especialidad", doctor.getEspecialidad());

            DoctorView doctorView = new DoctorView(doctorData);
        } else {
            System.out.println("Error: Usuario o contraseña incorrectos");
        }

            }
        }







