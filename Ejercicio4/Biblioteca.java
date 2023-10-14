package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    // declara el arrayList
    private ArrayList<Libro> biblioteca;
    public Scanner entrada = new Scanner(System.in);

    // constructor por defecto
    public Biblioteca() {
        biblioteca = new ArrayList<>();
    }

    // registrar un libro
    public void Registrar(Libro libro1) {
        biblioteca.add(libro1);
        // hacer una condicion para que no ingresen el mismo codigo o algo parecido
    }

    public ArrayList<Libro> getBiblioteca() {
        return biblioteca;
    }

    //eliminar un libro del catalogo
    public void eliminar(String isbn) { 
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(isbn)) {
                biblioteca.remove(libro1.getIsbn());
                System.out.println("Su libro ha sido eliminado");
            } else if (libro1.getIsbn().equals(isbn) != true) { 
                System.out.println("El libro no existe");
                /* nota:el else if tal y como esta funciona solo con uno, con dos o mas elementos
                se vuelve infuncional*/
            }
        }
    }
    
    /*metodo para buscar un elemento especifico, lo mismo que lo anterior pero buscando un elemento
    en especifico, revisenlo con detalle*/
    public void buscarTitulo(String titulo) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getTitulo().equals(titulo)) {
                System.out.println(
                        "\nEl libro buscado es: " + libro1.getTitulo()
                        + "\nCodigo isbn: " + libro1.getIsbn()
                        + "\nCantidad de existencias: " + libro1.getExistencia());
            } else if (libro1.getTitulo().equals(titulo) != true) { // cuidado con esto
                System.out.println("El libro no existe");
            }

        }
    }
    
    // lo mismo que arriba pero en vez de titulo se busca por codigo 
    public void buscarIsbn(String codigo) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(codigo)) {
                System.out.println(
                        "\nEl libro buscado es: " + libro1.getTitulo()
                        + "\nCodigo isbn: " + libro1.getIsbn()
                        + "\nCantidad de existencias: " + libro1.getExistencia());
            } else if (libro1.getIsbn().equals(codigo) != true) {
                System.out.println("El libro no existe");
            }
        }
    }
    
    // metodo para saber el mas valioso
    public void masValioso() {
        double auxiliar = 0;
        String titular = null;
        for (Libro libro1 : biblioteca) {
            if (libro1.getPrecioCompra() > auxiliar) {
                auxiliar = libro1.getPrecioCompra();
                titular = libro1.getTitulo();
            }
        }
        System.out.println("El libro mas caro es el libro " + titular + "con el precio de: " + auxiliar + " $");
    }
    // metodo para saber el menos valioso
    public void menosValioso() {
        double auxiliar = 0;
        String titular = null;
        for (Libro libro1 : biblioteca) {
            if (libro1.getPrecioCompra() < auxiliar) {
                auxiliar = libro1.getPrecioCompra();
                titular = libro1.getTitulo();
            }

        }
        System.out.println("El libro menos caro es el libro " + titular + " con el precio de: " + auxiliar + " $");
    }
    
    //metodo para abastecer un libro
    /*
    se busca el elemento en especifico y se accede con un for each al atributo de cantidad y se le suma
    */
    public void abastecer(String isbn) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(isbn)) {
                System.out.print("Ingrese la cantidad que desea abastecer al libro " + libro1.getTitulo() + ": ");
                int cantidad = entrada.nextInt();
                libro1.subir(cantidad);
            } else if (libro1.getIsbn().equals(isbn) != true) { // cuidado
                System.out.println("El libro no existe");
            }
        }
    }

    // vender ejemplares de un libro
    /*
    algo parecido al anterior pero en vez de subir le bajamos, en la clase de libro entenderan mejor esto
    */
    public void vender(String isbn, int cantidad) { // 
        if(cantidad > 0){
            for (Libro libro1 : biblioteca) {
                if (libro1.getIsbn().equals(isbn)) {
                    if (cantidad > libro1.getExistencia()) {
                        System.out.println("Lo sentimos pero no hay esa cantidad de libros");
                    }
                    else {
                        libro1.bajar(cantidad);
                    }
                } else if (libro1.getIsbn().equals(isbn) != true) { // cuidado
                    System.out.println("El libro no existe");
                }
            }
       }
    }
    
    /* este metodo no esta en el documento pero yo mismo lo hice para controlar la informacion
    que se ingresa porque no pueden haber un libro con el mismo codigo o titulo*/
    public boolean validadorIngreso(String titulo, String isbn) {
        boolean valor = false;
        
        /* nota: lo que esta comentado es la manera normal de controlar pero mas abajo
        lo hice de otra manera y es funcional, ustedes deciden como hacerlo aunque claro
        lo ultimo no funcionara para todo por lo que toca analizar y revisar*/
        
        //cualquiera de las dos formas sirve, pero me fui por la mas corta jajaja
//        for (Libro libro1 : biblioteca) {
//            if (libro1.getTitulo().equals(titulo)) {
//                System.out.println("Titulo del libro ya existe en la base de datos");
//                return valor = true;
//            } else if (libro1.getIsbn().equals(isbn)) {
//                System.out.println("El codigo isbn ya existe en la base de datos");
//                return valor = true;
//            }
//
//        }
        if (biblioteca.contains(titulo) == true) {
            System.out.println("Titulo del libro ya existe en la base de datos");
            return valor = true;
        }
        if (biblioteca.contains(isbn) == true) {
            System.out.println("El codigo isbn ya existe en la base de datos");
            return valor = true;

        }
        return false;
    }
    // como dice el metodo, ni idea de lo que toca que hacer xd
    /* nah mentira se tendria que acada accion como vender, comprar etc. sumarle uno aca
    miren el de didier creo que el lo tiene*/
    public int transacciones(String codigo) {
        for (Libro libro1 : biblioteca) {
            if (libro1.getIsbn().equals(codigo)) {
                System.out.println("Ni idea de lo que tengo que hacer");
            }
        }
        return 0;
    }

}
