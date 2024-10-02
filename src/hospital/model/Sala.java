package hospital.model;

public class Sala {
    private String nombre;
    private String estado;

    // Constructor
    public Sala(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para representar la Sala como String
    @Override
    public String toString() {
        return "Sala{" +
                "nombre='" + nombre + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

