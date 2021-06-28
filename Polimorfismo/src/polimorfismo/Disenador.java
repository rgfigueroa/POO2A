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
public class Disenador extends Empleado implements InterfaceSueldo {

    @Override
    public void calcularSueldoVariable(int numeroHoras) {
        System.out.println("El Diseñador defina su sueldo variable");
        System.out.println("Su sueldo es: " + 5* numeroHoras);

    }

  
}
