
package Ejercicio3;

import java.util.ArrayList;

public class Parking {
    // declaramos atributos y el arrayList
    private ArrayList<String> matriculas;
    private String nombreParking;
    
    // declaramos el constructor
    /*
    nota importante: este constructor es especial porque en este nosotros 
    declaramos el limite o el rango que tendra el arrayList con el metodo o la
    funcion ensureCapacity(cantidad) y haremos un for para declarar cada posicion
    en null
    */
    public Parking(String nombreParking,int plazeta){
        this.nombreParking = nombreParking;
        matriculas = new ArrayList<>();
        matriculas.ensureCapacity(plazeta);
        for(int i=0; i< plazeta; i++){
            matriculas.add(i,null);
        }
        
    }   
    
    // get de nombre
    public String getNombre(){
        return nombreParking;
    }
    
    // metodo para entrar un coche que tiene condicionales para evitar un fallo
    // analizar con detenimiento por favor 
    public void entrada(int plaza,String matricula){
        if(matricula.length() < 4){
            System.out.println("Error");
            }
        // revisen el como se sabe si un puesto esta libre o ocupado
        // es esta parte
        else if(matriculas.get(plaza) != null){
            System.out.println("Plaza ocupada");
        }
        else if(matriculas.contains(matricula) != false){
            System.out.println("Matricula repetida");
        }
        else{
          matriculas.add(plaza,matricula);  
        }
        }
    
    // metodo para salir y eliminar un coche
    public int salida(String matricula){
        int posicion = matriculas.indexOf(matricula);
        if(matriculas.contains(matricula) == false){
           System.out.println("La matricula no existente");
        }
        else{
          matriculas.set(posicion,null);
            System.out.println(
                    "El auto fue retirado\n Informacion del parking+\nPlaza totales: "+getPLazasTotales()+
                            "\nPlazas ocupadas: "+getPlazasOcupadas()+"\nPlazas libres: "+getPlazasLibres());
            
        }
        return posicion;  
    }
    // para saber las plazas totales
    public int getPLazasTotales(){
        
        return matriculas.size();
    }
    //para saber las plazas ocupadas
    /* para saber eso toca hacer una variable auxiliar que almacene unos elementos
        toca hacer un for normal que recorra el array por ensima y buscar posicion por
        posicion, y las posiciones que sean diferentes de null se les sumaran 1 por
    que estas estaran ocupadas*/
    public int getPlazasOcupadas(){
        int ocupadas=0;
        for(int i=0; i < matriculas.size();i++){
            if(matriculas.get(i) != null){ // mirar esto en especifico chicos
                ocupadas += 1;
            }
        }
        // verificar como hacerlo
        return  ocupadas;
    }
    // metodo para saber las plazas libres
    // es lo mismo que lo anterior solo que es lo contrario
    public int getPlazasLibres(){
        int libres = 0;
        for(int i=0;i < matriculas.size();i++){
            if(matriculas.get(i) == null){
                libres +=1;
            }
        }
        // tambien revisar
        return libres;
    }
    
    // un metodo to String o en mi caso un metodo normal para retornar la informacion
    public void mostrar(){ 
        int cantidad = matriculas.size();
        System.out.println("cantidad del arraylist: "+cantidad);
        System.out.println("""
        ---------------------
           Parking Avenida
        --------------------""");
         for(int i=0; i < cantidad; i++ ){
               System.out.println("Plaza "+i+": "+ matriculas.get(i));
              }
                
    }
    
    
}
