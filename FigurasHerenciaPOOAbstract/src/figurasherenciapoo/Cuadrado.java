/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherenciapoo;

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class Cuadrado extends Figura {

    private int esquinas;

    /**
     * @return the esquinas
     */
    public int getEsquinas() {
        return esquinas;
    }

    @Override
    public void area() {
        System.out.println("Ingresa dato: ");
        Scanner sc = new Scanner(System.in);
        int lado = 0;
        lado = sc.nextInt();
        System.out.println("El area del Cuadrado es: " + lado * lado);
    }
}
