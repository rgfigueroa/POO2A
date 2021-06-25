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
public class Figura {

    private double lado;
    private String color;

    public void area() {
        System.out.println("Calculando area:  "+ this.lado * this.lado);

    }

    public void perimetro() {
        System.out.println("Calculando perimetro");

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
    public void dibujar(){
    //Definir la forma de dibujar INDIVIDUAL
    //1. Con Texto
    //2. Con Graphics
    //3. Usando imagenes.
    
    }

}
