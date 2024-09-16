package hospital.controller;
import hospital.view.LoginView;

public class loginController {

        private LoginView loginView;

        public loginController(LoginView loginView) {
            this.loginView = loginView;
            this.loginView.addActionListener(e -> controlDeLogin());
        }

        public void controlDeLogin(){
            System.out.println("Hola Login!");
        }
    }

