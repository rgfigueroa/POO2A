/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author roberth
 */
public class Empleado extends Persona {

    private int numeroHoras;
    private double precioporHora;

    /**
     * @return the numeroHoras
     */
    public int getNumeroHoras() {
        return numeroHoras;
    }

    /**
     * @param numeroHoras the numeroHoras to set
     */
    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    /**
     * @return the precioporHora
     */
    public double getPrecioporHora() {
        return precioporHora;
    }

    /**
     * @param precioporHora the precioporHora to set
     */
    public void setPrecioporHora(double precioporHora) {
        this.precioporHora = precioporHora;
    }

    public void horario() {

    }

    /**
     * Este es el sueldo fijo mensual de un Empleado
     */
    public void calcularSueldo() {
        System.out.println("El sueldo Fijo es: 400");
    }
}
