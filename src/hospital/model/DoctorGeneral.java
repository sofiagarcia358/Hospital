package hospital.model;

public class DoctorGeneral {

    private String nombre;
    private String Usuario;
    private String correo;
    private String contraseña;
    private String especialidad;

    public DoctorGeneral(String nombre, String correo, String especialidad, String Usuario, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "DoctorGeneral{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", usuario='" + Usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}