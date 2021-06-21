/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocalculadora;

import java.util.ArrayList;

/**
 *
 * @author roberth
 */
public class CalculadoraEjecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejecutando la caluladora");
        Calculadora arreglo[] = new Calculadora[3];

        ArrayList<Calculadora> arregloCalculadora = new ArrayList<>();

        Calculadora objCalculadora = new Calculadora(8, 4.0);
        objCalculadora.sumar();
        objCalculadora.restar();
        objCalculadora.multiplicar();
        objCalculadora.dividir();

        Calculadora objCalculadora2 = new Calculadora(3, 6.0);

        for (int i = 0; i < arregloCalculadora.size(); i++) {
            arregloCalculadora.add(objCalculadora);
        }

        for (Calculadora calculadora : arregloCalculadora) {
            System.out.println("Los numeros de la calculadora son: ");
            calculadora.sumar();
            calculadora.restar();
        }

        //Metodo de consulta Notación Lambda
        arregloCalculadora.forEach(e -> e.getNumeroDos());
    }

}
