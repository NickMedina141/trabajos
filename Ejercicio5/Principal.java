
package Ejercicio5;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static Scanner entrada = new Scanner(System.in);
    public static Zoologico zoo1;
    public static void main(String[] args){
        int opcion;
        do{
            System.out.println(
                    """
                        Zoologico
                    ------------------------
                    1. ingresar datos del zoologico
                    2. listado de las instalaciones
                    3. listado de animales
                    4. listado de zonas de trabajadores
                    
                    5. salir 
                    ------------------------
                    
                    """);
            System.out.print("Ingrese la opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    // zona
                    System.out.println("Zoologico\n");
                    entrada.nextLine();
                    System.out.print("Ingrese el nombre del zoologico: ");
                    String nombreZoologico = entrada.nextLine();
                    System.out.println("\nInformacion de zonas\n");
                    System.out.print("Ingrese el codigo de la zona: ");
                    String codigoZ = entrada.nextLine();
                    System.out.print("Ingrese el nombre de la zona: ");
                    String nombreZona = entrada.nextLine();
                    System.out.print("Ingrese el espacio de la zona: ");
                    int espacio = entrada.nextInt();
                    Zonas zona = new Zonas(codigoZ, nombreZona, espacio);
                    // instalacion
                    System.out.println("\nInformacion de instlaciones\n");
                    System.out.print("Ingrese el codigo de la instalacion: ");
                    int codigoI = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el año en el que se instalo la instalacion: : ");
                    int año = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese la descripcion de la instalacion: ");
                    String descripcion = entrada.nextLine();
                    Instalaciones instalacion = new Instalaciones(codigoI, año, descripcion,zona);
                    // animal
                    System.out.println("\nInformacion de animales\n");
                    System.out.print("Ingrese el nombre del animal: ");
                    String nombreAnimal = entrada.nextLine();
                    System.out.print("Ingrese la especie del animal: ");
                    String especie = entrada.nextLine();
                    System.out.print("Ingrese el año de nacimiento del animal: ");
                    int añoNacimiento = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Ingrese el codigo del animal: ");
                    String codigoA = entrada.nextLine();
                    Animales animal = new Animales(nombreAnimal, especie, añoNacimiento, codigoA, instalacion, zona);
                    // trabajador
                    System.out.println("\nInformacion de trabajadores\n");
                    System.out.print("Ingrese el nombre y apellido del trabajador: ");
                    String nombre_apellido = entrada.nextLine();
                    System.out.print("Ingrese la especialidad del trabajador: ");
                    String especialidad = entrada.nextLine();
                    System.out.print("Ingrese el DNI del trabajdor: ");
                    String dni = entrada.nextLine();
                    Trabajadores trabajador = new Trabajadores(nombre_apellido, especialidad, dni);
                    // zoologico
                    System.out.print("Ingrese el horario del trabajador: ");
                    String horario = entrada.nextLine();
                    Asignacion asigancion = new Asignacion(trabajador, zona, horario);
                    zoo1 = new Zoologico(nombreZoologico);
                    zoo1.ingresoZona(zona);
                    zoo1.ingresoAnimal(animal);
                    zoo1.ingresoInstalacion(instalacion);
                    zoo1.ingresoAsignacion(asigancion);
                    zoo1.ingresoTrabajador(trabajador);
                    break;
                case 2:
                    zoo1.listadoInstalacionesZoologico();break;
                case 3:
                    zoo1.listadoAnimales();break;
                case 4:
                    entrada.nextLine();
                    System.out.print("Ingrese el dni de la persona que desea buscar: ");
                    String dni1 = entrada.nextLine();
                    zoo1.listadoTrabajadores(dni1);
                    break;
                case 5:
                    System.out.println("Sistema cerrado");break;
                default:
                    throw new AssertionError();
            }
        }while(opcion >0 || opcion < 5);
    }
}
