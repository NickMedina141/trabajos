package Ejercicio2;

public class Dimension {
    // se declaran los atributos de la clase dimension
    private double alto;
    private double ancho;
    private double profundidad;
    
    /* se declara un constructor por defecto  que instancie o establezca los valores en 0
       si el usuario lo eligue asi*/
    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }
    
    /* se declara un constructor con parametros para establecer los atributos si el usuario
    lo eligue asi
    */
    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }
    
    // getters & setters
    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    
    // metodo de get volumen que coje los 3 atributos se multiplican y se retorna
    public double GetVolumen() {
        return (alto * ancho * profundidad);

    }

    @Override
    public String toString() {
        return "\nDimensiones: " + "\nAlto: " + alto + "\nAncho: " + ancho + "\nProfundidad: " + profundidad + "\nVolumen: " + GetVolumen();
    }

}
