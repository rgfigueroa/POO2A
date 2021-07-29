/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.util.Date;

/**
 *
 * @author roberth
 */
public class Empleado extends Persona {

    private double salario;
    
    public Empleado(){
    }

    public Empleado(double salario) {
        this.salario = salario;
    }

    public Empleado(double salario, String nombre, String fechaNacimiento) {
        this.salario = salario;
        super.setNombre(nombre);
        super.setFechaNacimiento(fechaNacimiento);
    }
    
    public Empleado(String nombre, String fechaNacimiento) {
        super.setNombre(nombre);
        super.setFechaNacimiento(fechaNacimiento);
    }
    
    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
