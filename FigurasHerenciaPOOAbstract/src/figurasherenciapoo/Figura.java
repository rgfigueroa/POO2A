/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherenciapoo;

/**
 *
 * @author roberth
 */
public abstract class Figura {

    private double lado;
    private String color;

    public abstract void area();

    public void perimetro(double lado) {
        System.out.println("Calculando perimetro" + (4 * lado));

    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
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
//    public void dibujar(){
//    //Definir la forma de dibujar INDIVIDUAL
//    //1. Con Texto
//    //2. Con Graphics
//    //3. Usando imagenes.
//    
//    }

}
