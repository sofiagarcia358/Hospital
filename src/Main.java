import backEnde.BackEnde;
import hospital.model.DoctorGeneral;
import hospital.view.LoginView;
import hospital.Service.bdDoctores;
import hospital.controller.loginController;

public class Main {
    public static void main(String[] args) {
        LoginView loginView =new LoginView();
        bdDoctores dataDoctores = new bdDoctores();

        BackEnde backEnde = new BackEnde(dataDoctores);

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

