package Ejercicio2;

import java.util.ArrayList;

public class Coleccion {
    // se declara el atributo de la clase y el arrayList de objetos figura
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;
    
    
    /* se declara el constructor solo con el atributo nombreColeccion
    porque para declarar el arraylist se hace de la manera que se muestra*/
    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<>();
    }

    // getters & setters 
    // mirar los getters & setters del arrayList
    public ArrayList<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(ArrayList<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    
    // metodos
    
    // metodo para añadir figura
    // nota: asi es la estructura para añadir en un array un objeto, siempre
    public void añadirFiguras(Figura fig) {
        listaFiguras.add(fig);
    }
    // metodo para subir el precio de un objeto
    /*
    se utiliza un for each que recorra el arrayList y buscamos el objeto
    por eso era necesario que figura almacenara objetos de las otras dos clases
    para que el objeto de figuras pudiera acceder a los metodos de la otras dos
    
    nota: chicos asi es como siempre se buscara la informacion siempre, puede 
    llegar a ver pequeñas modificaciones dependiendo del ejercicio pero normalmente
    es asi
    */
    public void subirPrecio(double cantidad, String id) {
        for (Figura fig : listaFiguras) { // hacer para que se seleccione la figura querida
            if (fig.getCodigo().equals(id)) {
                fig.subirPrecio(cantidad);
                System.out.println("El precio de la figura fue hecho");
            }
        }
    }
    
    // metodo para saber si una figura tiene capa o no
    public void conCapa(){
        for(Figura fig: listaFiguras){
            if(fig.getSuperheroe().getCapa() == true){
                System.out.println("con capa: "+fig.getSuperheroe().getNombre());
            }
        }
    }
    // metodos de observadores
    // metodo para sacar la figura mas cara
    
    /*
    asi es como se saca el objeto o el elemento mas valioso en un array y
    se puede hacer lo mismo para el menos valioso 
    */
    public void masValioso() {
        double auxiliar = 0;
        for (Figura fig : listaFiguras) {
            if (fig.getPrecio() > auxiliar) {
                auxiliar = fig.getPrecio();
            }
        }
        System.out.println("EL precio de la figura mas cara es: " + auxiliar);
    }
    
    // metodo para buscar el valor total de la coleccion
    /*
    se crea una variable auxiliar que la declaramos en cero y recoreremos el 
    arraylist buscando todos los precios de las figuras que tenga y se las 
    iremos sumando a esa variable y al final el valor que tenga esa variable
    sera el valor de al coleccion
    */
    public double getValorColeccion() {
        double precioTotal = 0;
        for (Figura fig : listaFiguras) {
            precioTotal += fig.getPrecio();
        }
        return precioTotal;
    }
    
    // metodo para saber el volumen total de la coleccion
    // parecido al metodo anterior, misma dinamica y creacion pero en vez de precio el volumen
    public double getVolumenColeccion() {
        double volumenTotal = 0;
        for (Figura fig : listaFiguras) {
            volumenTotal += fig.getDimension().GetVolumen();

        }
        return (volumenTotal + 200);
    }

    @Override
    public String toString() { // revisar
        return "\nInformacion: \nColeccion: " + nombreColeccion + "\nLista: " + listaFiguras + "\n";
    }
}
