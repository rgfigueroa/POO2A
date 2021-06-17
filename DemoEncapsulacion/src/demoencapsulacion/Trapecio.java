/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoencapsulacion;

/**
 *
 * @author roberth
 */
public class Trapecio {

    private double baseM;
    private double basemenor;
    private double altura;
    private double iva = 0.12;
    private String nombre;

    public Trapecio() {
    }

    public Trapecio(String nombre, double altura) {
        this.nombre = nombre;
        this.altura = altura;
    }

    //encapsulado set y met el atributo iva
    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getIva() {
        return this.iva;
    }

    // set y get del atributo altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void calcularArea(double base) {
        //logica de calcular
        System.out.println("El area es:" + (this.getBaseM() + basemenor * this.getAltura()) / 2);
    }

    /**
     * @return the baseM
     */
    public double getBaseM() {
        return baseM;
    }

    /**
     * @param baseM the baseM to set
     */
    public void setBaseM(double baseM) {
        this.baseM = baseM;
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

}
