
package Ejercicio5;

public class Zonas {
    // se declara los atributos
    private  String codigoZ;
    private String nombreZona;
    private int espacio;

    // se declara el constructor
    public Zonas(String codigoZ, String nombreZona, int espacio) {
        this.codigoZ = codigoZ;
        this.nombreZona = nombreZona;
        this.espacio = espacio;
    }
    
    // getters & setters
    public String getCodigoZ() {
        return codigoZ;
    }

    public void setCodigoZ(String codigoZ) {
        this.codigoZ = codigoZ;
    }

    public String getNombreZona() {
        return nombreZona;
    }

    public void setNombreZona(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    
    
}
