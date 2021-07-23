/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPersona;
import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class VistaConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        String clave;
        boolean bandera;

        System.out.println("***** Programa Sistema Medico *****");
        System.out.println("Login del sistema medico");
        System.out.println("Ingresa el username:");
        username = scanner.next();
        System.out.println("Ingresa la clave:");
        clave = scanner.next();

        Controlador.ControladorPersona ctrlPersona = new ControladorPersona();

        bandera = ctrlPersona.ingresarSistema(username, clave);
        if (bandera) {
            System.out.println("Bienvenido");
            System.out.println("Tus son correctos");
        }
        else{
            System.out.println("Datos incorrectos");
        }

    }
}
