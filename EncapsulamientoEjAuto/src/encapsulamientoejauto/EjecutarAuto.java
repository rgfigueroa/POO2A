/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamientoejauto;

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class EjecutarAuto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos autos desea crear:");
        int n = sc.nextInt();
        String colorNuevo = "";
        Auto[] patioAutos = new Auto[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el auto [" + i + "]:");
            Auto objetoAuto = new Auto(sc.next(), sc.nextDouble(), sc.next());
            patioAutos[i] = objetoAuto;
        }
        System.out.println("Los autos del Patio son:");
        for (int i = 0; i < n; i++) {
            System.out.println("Auto [" + patioAutos[i].getPlaca() + "]:");
        }

        //Cambiando el color del auto
        System.out.println("Cambiar el color:");
        for (int i = 0; i < n; i++) {
            System.out.println("Color del auto es:" + patioAutos[i].getColor());
            System.out.println("Ingresa el nuevo color:");
            colorNuevo = sc.next();
            patioAutos[i].setColor(colorNuevo);
        }
        System.out.println("Los autos con colores nuevos son:");
        for (int i = 0; i < n; i++) {
            System.out.println("Auto [" + patioAutos[i].getPlaca() + "]:");
            System.out.println("Color [" + patioAutos[i].getColor()+ "]:");

        }

//        //Menu
//         1. Cargar los autos.
//         2. Listar los autos existentes mediante la Placa.
//         3. Cambiar el precio de los autos, de acuerdo al valor asignado. (5000) (4000)
//         4. Calcular el precio del auto con los impuestos. (4000 * 1.12) =>> 4480 
//         5. Cambiar el color;
    }
}
