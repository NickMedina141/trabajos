package Ejercicio5;

import java.util.*;

public class Zoologico {
    // se declara el atributo y los arrayList
    private String nombreZoologico;
    private ArrayList<Zonas> zonas;
    private ArrayList<Instalaciones> instalaciones;
    private ArrayList<Animales> animales;
    private ArrayList<Trabajadores> trabajadores;
    private ArrayList<Asignacion> asignaciones;
    
    // se declara el constructor con un unico valor y lo demas se instancian los arrayList
    public Zoologico(String nombreZoologico) {
        this.nombreZoologico = nombreZoologico;
        this.zonas = new ArrayList<>();
        this.instalaciones = new ArrayList<>();
        this.animales = new ArrayList<>();
        this.trabajadores = new ArrayList<>();
        this.asignaciones = new ArrayList<>();
    }
    
    // getters & setters
    public String getNombreZoologico() {
        return nombreZoologico;
    }

    public void setNombreZoologico(String nombreZoologico) {
        this.nombreZoologico = nombreZoologico;
    }

    public ArrayList<Zonas> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zonas> zonas) {
        this.zonas = zonas;
    }

    public ArrayList<Instalaciones> getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(ArrayList<Instalaciones> instalaciones) {
        this.instalaciones = instalaciones;
    }

    public ArrayList<Animales> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animales> animales) {
        this.animales = animales;
    }

    public ArrayList<Trabajadores> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajadores> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public void ingresoZona(Zonas zona1) {
        zonas.add(zona1);
    }

    public void ingresoInstalacion(Instalaciones instalacion) {
        instalaciones.add(instalacion);
    }

    public void ingresoAnimal(Animales animal) {
        animales.add(animal);
    }

    public void ingresoTrabajador(Trabajadores trabajador) {
        trabajadores.add(trabajador);
    }

    public void ingresoAsignacion(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    /*
    Un listado con las instalaciones del zoológico, donde se indicará el número de la 
    instalación, su año de instalación, su descripción y el nombre de la zona en la que se 
    encuentra.
     */
    public void listadoInstalacionesZoologico() {
        for (Instalaciones instalacion : instalaciones) {
            System.out.println(
                    "\nnumero de la instalacion: " + instalacion.getCodigoI()
                   + "\nAño de instalacion: " + instalacion.getAño() +"\nDescripcion: " + instalacion.getDescripcion()
                   + "\nZona: " + instalacion.getZona().getNombreZona());
        }
    }

    /* Un listado con los animales del zoológico, donde se mostrará la especie del animal, el 
    nombre, año de nacimiento, número de instalación donde se encuentra y nombre de la 
    zona donde se encuentra.*/
    public void listadoAnimales() {
        for (Animales animal : animales) {
            System.out.println(
                    "\nEspecie: " + animal.getEspecie() + "\nNombre: " + animal.getNombreAnimal()
                  + "\nNumero de la instalacion: " + animal.getInstalacion() + "\nZona: " + animal.getZona());
        }
    }

    /*
     Un listado las zonas donde trabaja un trabajador concreto. (Se introducirá el DNI del 
trabajador y aparecerá la información) La información a mostrar será:
▪ El nombre y apellidos del trabajador, su especialidad.
▪ El nombre de cada zona donde trabaja y el horario de trabajo.
     */
    public void listadoTrabajadores(String dni) {
        for (Asignacion asignaciones : asignaciones) {
            if (asignaciones.getTrabajador().getDni().equals(dni)) {
                System.out.println(
                        "\nnombre y apellido: " + asignaciones.getTrabajador().getNombre_apellido()
                      + "\nEspecialidad: " + asignaciones.getTrabajador().getEspecialidad()
                );
            }
        }
        for (Asignacion asignacion : asignaciones) {
            if (asignacion.getTrabajador().getDni().equals(dni)) {
                System.out.println(asignacion.getZona().getNombreZona() + " " + asignacion.getHorario());
            }
        }
    }

}
