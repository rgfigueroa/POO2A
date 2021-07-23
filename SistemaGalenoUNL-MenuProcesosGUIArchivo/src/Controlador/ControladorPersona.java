/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;

/**
 *
 * @author roberth
 */
public class ControladorPersona {
 
    public boolean ingresarSistema(String nombreUsuario, String clave) {
        boolean bandera = false;
        if (nombreUsuario.equals(clave)) {
            bandera = true;
        }
        else{
            bandera=false;
        }
       return bandera;
    }

    public void mostrarDatosPersona(Persona persona) {
        System.out.println("Los datos de la persona son:"+ persona.getNombre());
        System.out.println("Los datos de la persona son:"+ persona.getCedula());
    }
}
