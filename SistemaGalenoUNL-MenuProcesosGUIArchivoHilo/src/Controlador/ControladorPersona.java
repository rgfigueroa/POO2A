/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberth
 */
public class ControladorPersona implements Runnable {

    Thread h1;

    public ControladorPersona() {

        h1 = new Thread(this);
        h1.start();
    }

    /**
     * *
     * Metodo que valida sólo la Clave para ingresar
     *
     * @param nombreUsuario
     * @param clave
     * @return
     */
    public boolean ingresarSistema(String nombreUsuario, String clave) {

        FileReader fr;
        boolean bandera = false;
        int c;
        String stringClave = "";
        try {
            fr = new FileReader("Clave.txt");
            while ((c = fr.read()) != -1) {
                System.out.println(c);
                stringClave = stringClave + Character.toString(c);
                System.out.println("StringClave es String: " + stringClave);
            }
            fr.close();
            System.out.println("Concatenado: " + stringClave);

            if (stringClave.equals(clave)) {
                bandera = true;
            } else {
                bandera = false;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo de la Clave no encontrado.");
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
    }

    /**
     * *
     * Metodo que valida el nombre de Usuario y la Clave para ingresar al
     * sistema
     *
     * @param nombreUsuario
     * @param clave
     * @return
     */
    public boolean ingresarSistemaUsarioPassword(String nombreUsuario, String clave) {
        FileReader fr, frU;
        boolean bandera = false;
        int c;
        String stringClave = "";
        String stringUsuario = "";
        try {
            fr = new FileReader("Clave.txt");
            frU = new FileReader("Usuario.txt");

            while ((c = fr.read()) != -1) {
                System.out.println(c);
                stringClave = stringClave + Character.toString(c);
                System.out.println("StringClave es String: " + stringClave);
            }
            fr.close();
            System.out.println("Concatenado: " + stringClave);

            while ((c = frU.read()) != -1) {
                System.out.println(c);
                stringUsuario = stringUsuario + Character.toString(c);
                System.out.println("stringUsuario es String: " + stringUsuario);
            }

            if (stringClave.equals(clave) && stringUsuario.equals(nombreUsuario)) {
                bandera = true;
            } else {
                bandera = false;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("El archivo de la Clave no encontrado.");
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bandera;
    }

    public void mostrarDatosPersona(Persona persona) {
        System.out.println("Los datos de la persona son:" + persona.getNombre());
        System.out.println("Los datos de la persona son:" + persona.getCedula());
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        int c;
        int contador = 0;
        String stringClave = "";
        try {
            while (ct == h1) {
                FileReader f = new FileReader("Clave.txt");
                while ((c = f.read()) != -1) {
                    System.out.println(c);
                    stringClave = stringClave + Character.toString(c);
                    System.out.println("Hilo Run StringClave es String: " + stringClave);
                    contador++;
                    System.out.println("Leyendo el archivo"+contador);
                }
                f.close();
                System.out.println("Finalizar lectura: " + stringClave);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControladorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
