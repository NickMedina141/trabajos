package Ejercicio5;
public class Asignacion{
    
    // declaramos el atributo y un objeto de zonas y trabajador
    private Trabajadores trabajador;
    private Zonas zona;
    private String horario;
    
    // se declara el constructor con el atributo y los objetos
    public Asignacion(Trabajadores trabajador, Zonas zona, String horario) {
        this.trabajador = trabajador;
        this.zona = zona;
        this.horario = horario;
    }
    
    // getters & setters
    public Trabajadores getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajadores trabajador) {
        this.trabajador = trabajador;
    }

    public Zonas getZona() {
        return zona;
    }

    public void setZona(Zonas zona) {
        this.zona = zona;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    

}
