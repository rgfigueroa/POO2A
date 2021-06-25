/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooacademico;

import java.util.ArrayList;

/**
 *
 * @author roberth
 */
public class Docente {

    private String nombre;
    private int edad;
    private ArrayList<Estudiante> listadoEstudiantes = new ArrayList<>();

    public Docente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Docente(String nombre, int edad, ArrayList<Estudiante> listado) {
        this.nombre = nombre;
        this.edad = edad;
        this.listadoEstudiantes = listado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the listadoEstudiantes
     */
    public ArrayList<Estudiante> getListadoEstudiantes() {
        return listadoEstudiantes;
    }

    /**
     * Método que permite asignatar la lista de Estudiantes.
     * @param listadoEstudiantes the listadoEstudiantes to set
     * 
     */
    public void setListadoEstudiantes(ArrayList<Estudiante> listadoEstudiantes) {
        this.listadoEstudiantes = listadoEstudiantes;
    }
}
