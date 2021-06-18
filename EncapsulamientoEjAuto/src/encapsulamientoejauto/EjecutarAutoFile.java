/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamientoejauto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberth
 */
public class EjecutarAutoFile {
    public static void main(String[] args) {

        FileWriter f = null;
        try {
            f = new FileWriter("ListadoAutos.txt", true);

            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantos autos desea crear:");
            int n = sc.nextInt();
            Auto[] patioAutos = new Auto[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Ingresa el auto [" + i + "]:");
                Auto objetoAuto = new Auto(sc.next(), sc.nextDouble(), sc.next());
                patioAutos[i] = objetoAuto;
            }
            System.out.println("Los autos del Patio son:");
            for (int i = 0; i < n; i++) {
                System.out.println("Auto [" + patioAutos[i].getPlaca() + "]:");
                // f.canWrite();
                f.write(patioAutos[i].getPlaca());
                f.write("\n");


            }

//        System.out.println("El auto tiene un costo de:" + objetoAuto.getCosto());
        } catch (IOException ex) {
            Logger.getLogger(EjecutarAuto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(EjecutarAuto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
