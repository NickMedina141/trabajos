package Ejercicio1;

import java.util.Scanner;

public class Principal {
    public Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        // donde se declara el objeto y se prueba el codigo
        Electrodomesticos objeto1 = new Electrodomesticos("casa", "que le importa xd", 12);
        Lavadora objeto2 = new Lavadora("lavadora", "didier", 12, 4500, true);
        System.out.println(objeto1.toString());
        System.out.println("El consumo fue: "+objeto1.getConsumo(14));
        System.out.println("EL coste por consumo de luz es: "+objeto1.getCosteConsumo(14, 575.95));
        
        
        System.out.println(" ");
        System.out.println(objeto2.toString());
        System.out.println("el consumo de lavadora fue: "+objeto2.getConsumo(14));
        System.out.println("El coste total por consumo de luz es: "+objeto2.getCosteConsumo(14, 575.95));
        
        
        // nota si quieren mejorar intenten hacer un menu para ello
        /* como ayuda les aconsejo que declaren e instancien el objeto o objetos 
        para no tener que crearlos varias veces ejemplo:
        public static Lavadora lava1;
        public static Electrodomestico;
        
        */
    }
}
