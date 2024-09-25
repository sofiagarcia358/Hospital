//import Hospital.controller.loginController;
import backEnde.BackEnde;
import hospital.controller.loginController;
import hospital.view.DoctorView;
import hospital.view.LoginView;

public class Main{
    public static void main(String[] args) {

        LoginView loginView = new LoginView();
        BackEnde backEnde = new BackEnde();
        new loginController(loginView, backEnde);





        //Doctor
        //Enfermeras
        //Pacientes
        //Cirujanos
        //Secretarías
        //Fisioterapeutas
        //Farmacéuticos
        //Paramedicos
        //Pediatras
        //Camilleros

        //Sala de espera
        //Morgue
        //Sala Quírofano
    }

}

