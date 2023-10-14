
package Ejercicio4;

public class Libro {
    // se declara los atributos
    private String titulo;
    private String isbn;
    private double precioCompra;
    private double precioVenta;
    private int existencia;
    
    // se declara el constructor
    public Libro(String titulo, String isbn, double precioCompra, double precioVenta,int existencia) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.existencia = existencia;
    }
    
    
    // getters & setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    
    // idea loca pero factible 
    // lo que les comentaba anteriormente en biblioteca
    /*
    para facilitar el abastecimiento y venta de libro, cree dos metodos,
    uno para subir cuando se vaya a abastecer y otro para bajar cuando se vaya 
    a vender, un modo interesante y util de facilitar las cosas chicos, tengan en cuenta
    */
    public void subir(int cantidad){
        this.existencia += cantidad;
    }
    public void bajar(int cantidad){
        this.existencia -= cantidad;
                }
}
