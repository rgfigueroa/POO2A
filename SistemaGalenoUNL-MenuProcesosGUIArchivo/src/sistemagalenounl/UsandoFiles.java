/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberth
 */
public class UsandoFiles {

    public static void main(String[] args) {
        FileWriter fw;
        try {
            fw = new FileWriter("DatosAcceso.txt");
            fw.write("Hola");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(UsandoFiles.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el Archivo");
        }

    }

}
