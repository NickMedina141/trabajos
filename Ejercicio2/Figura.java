package Ejercicio2;

public class Figura {
    /* se declara los atributos de la clase pero ademas se declaran 
    un objeto de superheroe y otro de dimensiones para que la clase 
    figura los almacene, por lo tanto la clase figura sera una clase
    almacenadora y almacenara un objeto de las dos clases para ser 
    utilizada.
    
    */
    private String codigo;
    private double precio;
    private Superheroe superheroe;
    private Dimension dimension;
    
    /*
    se declara el constructor con los atributos y los objetos
    */
    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }
    
    
    // getters  & settes
    //nota miren el getters & setters de los objetos
    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    
    public void subirPrecio(double cantidad){
       this.precio += cantidad;
    }
    
    
    @Override
    public String toString() {
        return "\nDatos de la Figura\ncodigo:" + codigo + "\nPrecio: " + precio
                + "\nNombre: " + superheroe.getNombre() + "\nDescripcion: " + superheroe.getDescripcion()
                + "\nCapa: " + superheroe.getCapa();
    }
    
    // metodo para modificar la cantidad de figura
    public void modificadorAdicional(double cantidad) {
        precio += cantidad;
    }

}
