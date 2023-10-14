package Ejercicio5;

public class Instalaciones {
    // se declara los atributos y los objetos 
    private int codigoI;
    private int año; 
    private String descripcion;
    private Zonas zona;
    
    // declaracion del constructor con los atributos y los objetos
    public Instalaciones(int codigoI, int año,String descripcion,Zonas zona){
        this.codigoI = codigoI;
        this.año = año;
        this.descripcion = descripcion;
        this.zona = zona;
    }
    
    // getters & setters
    public Zonas getZona() {
        return zona;
    }

    public void setZona(Zonas zona) {
        this.zona = zona;
    }

    public int getCodigoI() {
        return codigoI;
    }

    public void setCodigoI(int codigoI) {
        this.codigoI = codigoI;
    }
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
