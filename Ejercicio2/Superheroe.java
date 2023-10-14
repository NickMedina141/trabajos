package Ejercicio2;

public class Superheroe {
    // declaramos los atributos de la clase superheroe
    private String nombre;
    private String descripcion;
    private boolean capa;
    
    // se declara el constructor con los atributos
    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = null;
        this.capa = false;
    }

    // getters & setters
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean getCapa() {
        return capa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "\nSuperheroe: " + "\nNombre: " + nombre + "\nDescripcion: " + descripcion + "\nCapa: " + capa;
    }

}
