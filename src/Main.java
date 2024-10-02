import javax.swing.*;
import hospital.controller.loginController;
import hospital.view.LoginView;

public class Main extends JFrame{
    public static void main(String[] args) {

        LoginView loginView = new LoginView();
        loginController controller = new loginController(loginView);

    }
}

