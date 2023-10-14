
package Ejercicio5;

public class Trabajadores {
    // declaracion de los atributos
    private String nombre_apellido;
    private String especialidad;
    private String dni;
    
    // declaracion del constructor
    public Trabajadores(String nombre_apellido, String especialidad, String dni) {
        this.nombre_apellido = nombre_apellido;
        this.especialidad = especialidad;
        this.dni = dni;
    }
    
    // getters & setters
    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "nombre_apellido=" + nombre_apellido + ", especialidad=" + especialidad + ", dni=" + dni + '}';
    }
    
    
}
