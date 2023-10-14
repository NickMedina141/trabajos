
package Ejercicio5;

public class Animales {
    // se declara los tributos y un objeto de la clase zonas y instalaciones
    private String nombreAnimal;
    private String especie;
    private int añoNacimiento;
    private String cogidoA;
    private Instalaciones instalacion;
    private Zonas zona;
    
    
    // se crea el constructor y se establece los atributos con los objetos
    public Animales(String nombreAnimal, String especie, int añoNacimiento, String cogidoA, Instalaciones instalacion, Zonas zona) {
        this.nombreAnimal = nombreAnimal;
        this.especie = especie;
        this.añoNacimiento = añoNacimiento;
        this.cogidoA = cogidoA;
        this.instalacion = instalacion;
        this.zona = zona;
    }

    // getters & setters
    public Instalaciones getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalaciones instalacion) {
        this.instalacion = instalacion;
    }

    public Zonas getZona() {
        return zona;
    }

    public void setZona(Zonas zona) {
        this.zona = zona;
    }
    

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getCogidoA() {
        return cogidoA;
    }

    public void setCogidoA(String cogidoA) {
        this.cogidoA = cogidoA;
    }

    
    
}
