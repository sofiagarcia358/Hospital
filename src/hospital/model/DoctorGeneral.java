package hospital.model;

public class DoctorGeneral {

        private String nombre;
        private String Especialidad;
        private int numeroLicencia;
    private String correoElectronico;

         public DoctorGeneral(String nombre, String Especialidad, int numeroLicencia, String correoElectronico) {
            this.nombre = nombre;
            this.Especialidad = Especialidad;
            this.numeroLicencia = numeroLicencia;
            this.correoElectronico =correoElectronico;
        }

        //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getters

    public String getNombre() {
        return this.nombre;
    }

    public String getEspecialidad() {
        return this.Especialidad;
    }

    public int getNumeroLicencia() {
        return this.numeroLicencia;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
}
