/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoencapsulacion;

import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class DemoEncapsulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejecutar el trapecio");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos obj:");
        int n = scanner.nextInt();
        Trapecio[] arregloT = new Trapecio[n];

        for (int i = 0; i < n; i++) {
            Trapecio objeto = new Trapecio();
            objeto.setIva(0.09);
            System.out.println("Presentar Constructor1:" + objeto.getIva());
            arregloT[i] = objeto;

        }
        for (int i = 0; i < n; i++) {
            Trapecio objeto = new Trapecio("Trapecio " + i + ": su altura", 2.0);
            objeto.setIva(0.09);
            System.out.println("Presentar Constructor2" + objeto.getNombre() + objeto.getAltura());
        }
        Trapecio objetoTC1 = new Trapecio();
        Trapecio objetoTC2 = new Trapecio("T Equilatero ", 3.0);
        System.out.println("Presentar Constructor1:" + objetoTC1.getNombre());
        System.out.println("Presentar Constructor1:" + objetoTC2.getNombre());

        System.out.println("Los trapecios son:");
        for (int i = 0; i < arregloT.length; i++) {
            System.out.println(arregloT[i].getIva() + arregloT[i].getNombre());
        }

    }

}
