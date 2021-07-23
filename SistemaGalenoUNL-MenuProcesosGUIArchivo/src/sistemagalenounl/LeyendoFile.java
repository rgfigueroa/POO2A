/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author roberth
 */
public class LeyendoFile {
     public static void main(String[] args) {
        FileWriter fw;
        FileReader fr;
        int c;
        try {

            fw= new FileWriter("CopiaDatosAcceso.txt");
            fr = new FileReader("DatosAcceso.txt");

            while ((c = fr.read()) != -1) {
                System.out.println(c);
                fw.write(c);
            }
            fw.close();
            fr.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
            Logger.getLogger(LeyendoFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
            Logger.getLogger(LeyendoFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
