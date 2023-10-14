
package Ejercicio1;

import ejercicioPOO.principal;
/* la clase lavadora es una clase hija de electrodomeestico, es decir,
    heredara los atributos y metodos de la clase padre*/ 
public class Lavadora extends Electrodomesticos{
    private int precio;
    private boolean aguaCalciente;
    
    // se declara el constructor personalizado porque este llevara los otros atributos de la clase padre
    public Lavadora(String tipo, String marca, double potencia,int precio,boolean aguaCaliente){
        super(tipo, marca, potencia);
        // super es una palabra que permite traer los atributos de padre y declararlos en la hija
        this.precio = precio;
        this.aguaCalciente = aguaCaliente;
    }
    
    
    // getters & setters
    public int getPrecio(){
        return precio;
    }
    public boolean getAguaCaliente(){
        return aguaCalciente;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public void setAguaCaliente(boolean aguaCaliente){
        this.aguaCalciente = aguaCaliente;
    }
    
    @Override
    public String toString(){
        return "{"+super.toString()+"Precio: "+precio+" Agua caliente: "+aguaCalciente+'}';
    }
    
    // metodo de consumo sobrecargado por polimorfismo
    /*
    es decir que el metodo de lavadora es el mismo que el de padre pero los dos trabajan
    o se comportan de manera diferente por lo que toca que utilizar el @override para
    sobrecargarlo
    */
    @Override
    public double getConsumo(int horas){
        double totalKW = 0;
        System.out.print("¿La lavadora trabaja con agua fria o caliente?: ");
        String agua = principal.entrada.next();
        if(agua.equals("fria")){
            totalKW = (getPotencia() * horas);
            return totalKW;
        }
        else if(agua.equals("caliente")){
            totalKW = horas * (getPotencia() + getPotencia() * 0.20);
            return totalKW;
        }
       return totalKW;
       
    }
    // metodo personalizado de coste consumo
    @Override
    public double getCosteConsumo(int horas,double costeHora){
        double costeConsumo = horas * costeHora;
        return costeConsumo;
    }
    
    
}
