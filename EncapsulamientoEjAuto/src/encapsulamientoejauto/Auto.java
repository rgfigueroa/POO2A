/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamientoejauto;

/**
 *
 * @author roberth
 */
public class Auto {

    private String placa;
    private double costo;
    private String color;

    /**
     * Constructor básico vacio de clase Auto
     */
    public Auto() {
    }

    public Auto(String placa, double costo, String color) {
        this.placa = placa;
        this.costo = costo;
        this.color = color;
    }

    /**
     * Constructor modifcado soolamente autos con costo
     *
     * @param costo
     */
    public Auto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
