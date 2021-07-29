/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberth
 */
public class UsandoFiles {

    public static void main(String[] args) {
        FileWriter fw;
        Date fecha = new Date();
        GregorianCalendar gc = new GregorianCalendar();
        fecha = gc.getTime();
        try {
            fw = new FileWriter("DatosAccesoSM.txt", true);
            fw.write("\nHola Bienvenidos a trbajar con archivos, esto hay que leer\t");
            fw.write("\nUn stexto nuevo");
            fw.write("\nNuevo text");
            for (int i = 0; i < 10; i++) {
                fw.write("\nHola 2A");
                System.out.println("Date"+ fecha.getTime());
                fw.write("\nDate"+ fecha.getTime());
                

            }
            fw.write("Prueba de Filewirter");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(UsandoFiles.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No se pudo crear el Archivo");
        }

    }

}
