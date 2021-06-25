/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooacademico;

/**
 *
 * @author roberth
 */
public class Estudiante {

    private String nombre;
    private String paralelo;
    private String cedula;

    public Estudiante(String nombre, String paralelo, String cedula) {
        this.nombre = nombre;
        this.paralelo = paralelo;
        this.cedula = cedula;
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
     * @return the paralelo
     */
    public String getParalelo() {
        return paralelo;
    }

    /**
     * @param paralelo the paralelo to set
     */
    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
