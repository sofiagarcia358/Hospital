package hospital.model;

public class DoctorGeneral {

        private String nombre;
        private String correo;
        private String Especialidad;
        private String usuario;
        private String contrasena;

         public DoctorGeneral(String nombre, String correo, String Especialidad, String usuario, String contrasena) {
            this.nombre = nombre;
            this.correo = correo;
            this.Especialidad = Especialidad;
            this.usuario = usuario;
            this.contrasena = contrasena;
        }

        //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getters

    public String getNombre() {
        return this.nombre;
    }
    public String getCorreo(){return this.correo;}
    public String getEspecialidad() {
        return this.Especialidad;
    }

    public String getUsuario() { return usuario;}

    public String getContrasena() {return contrasena;}
}
