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
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona objPersona = new Persona();

        Secretaria secretaria = new Secretaria();
        secretaria.facturar();
        secretaria.calcularSueldo();

        Conserje conserje = new Conserje();

        Disenador disenador = new Disenador();
        disenador.calcularSueldo();

        disenador.calcularSueldoVariable(10);

        System.out.println("Calculando el sueldo de un objeto Operario");
        Operario operario = new Operario();
        operario.calcularSueldo();
        operario.calcularSueldoVariable(25);

    }

}
