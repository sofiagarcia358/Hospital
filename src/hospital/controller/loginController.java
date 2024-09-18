package hospital.controller;
import hospital.view.LoginView;
import backEnde.BackEnde;
import java.util.HashMap;

public class loginController {
    private BackEnde authService;
    private LoginView loginView;


        public loginController(LoginView loginView) {
            this.loginView = loginView;
            this.loginView.addActionListener(e -> controlDeLogin());
            this.authService = new BackEnde();
        }

    // Método para controlar el proceso de login
    public void controlDeLogin() {
        // Recupera los datos del formulario usando los métodos get de LoginView
        String usuario = loginView.getCorreo();
        String contraseña = loginView.getContrasena();

        // Llama al método validarDatos de BackEnde para validar el login
        HashMap<String, String> resultado = authService.validarDatos(usuario, contraseña);

        // Verifica si hubo un error o si la autenticación fue exitosa
        if (resultado.containsKey("Error")) {
            // Si hay un error, muestra el mensaje de error
            System.out.println("Error: " + resultado.get("Error"));
        } else {
            // Si la validación es exitosa, muestra la información del usuario
            System.out.println("Login exitoso. Información del usuario:");
            for (String key : resultado.keySet()) {
                System.out.println(key + ": " + resultado.get(key));
            }
        }
    }
        }






