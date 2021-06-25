/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooacademico;

import java.util.ArrayList;

/**
 *
 * @author roberth
 */
public class POOAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Programa Asignacion de Docentes y Estudiantes");
        ArrayList<Estudiante> listaUno = new ArrayList<>();
        ArrayList<Estudiante> listaDos = new ArrayList<>();
        
        ArrayList<Docente> listaDoc = new ArrayList<>();
        

        Docente docenteRoberth = new Docente("Roberth", 33);
        Docente docentePablo = new Docente("Pablo", 40);
        
        listaDoc.add(docenteRoberth);
        listaDoc.add(docentePablo);
        

        Estudiante estudianteJuan = new Estudiante("Juan", "2A", "1104802133");
        Estudiante estudianteMaria = new Estudiante("Maria", "2A", "27613723672");
        Estudiante estudianteJesica = new Estudiante("Jesica", "5A", "07024663");

        listaUno.add(estudianteJuan);
        listaDos.add(estudianteMaria);
        listaDos.add(estudianteJesica);

        docenteRoberth.setListadoEstudiantes(listaDos);
        docentePablo.setListadoEstudiantes(listaUno);

        for (Estudiante estudiante : listaDos) {
            System.out.println("Dato:" + estudiante.getNombre());
        }
 
        //Listar informacion de un arreglo que se enceuntra dentro de un arreglo.
        System.out.println("Informacion de Docentes con sus Estudiantes");
        for (Docente docente : listaDoc) {
            System.out.println("Docente: "+ docente.getNombre());
            for (Estudiante est : docente.getListadoEstudiantes()) {
                System.out.println("Estudiante:"+ est.getNombre()+ est.getParalelo());
            }
        }

        //Listar informacion de un arreglo que se enceuntra dentro de un arreglo, con uso de Notacion Lambda foreach
        System.out.println("Informacion de Docentes con sus Estudiantes usando Notacion Lambda");
        for (Docente docente : listaDoc) {
            System.out.println("Docente: "+ docente.getNombre());
            docente.getListadoEstudiantes().forEach(e -> System.out.println("Est:"+e.getNombre()));
        }
        
    }

}
