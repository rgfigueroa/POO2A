/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author roberth
 */
public class SistemaGalenoUNL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado(200.50, "Juan Perez", "05-07-2021");
        System.out.println("El empleado " + empleado.getNombre() + " y su sueldo es: " + empleado.getSalario());

        HistoriaClinica hclinica = new HistoriaClinica();
        HistoriaClinica hclinica2 = new HistoriaClinica();
        HistoriaClinica hclinica3 = new HistoriaClinica();
        HistoriaClinica hclinica4 = new HistoriaClinica();

        Paciente pacienteJuan = new Paciente("Juan");
        Paciente pacientePablo = new Paciente("Pablo");
        Paciente pacienteElena = new Paciente("Elena");
        Paciente pacienteRoberth = new Paciente("Roberth");
        Paciente pacienteJavier = new Paciente("Javier Andres Sarango Sarango");

        Paciente pacienteAlba = new Paciente("Alba Nieto Fernandez");

        pacienteRoberth.getCodigoPaciente();

        System.out.println("Codigo Paciente:" + pacienteJuan.getCodigoPaciente());
        System.out.println("Codigo HC:" + hclinica.getCodigHistoria());

        System.out.println("Codigo Paciente:" + pacientePablo.getCodigoPaciente());
        System.out.println("Codigo HC:" + hclinica2.getCodigHistoria());

        System.out.println("Codigo Paciente:" + pacienteElena.getCodigoPaciente());
        System.out.println("Codigo HC:" + hclinica3.getCodigHistoria());

        System.out.println("   ***** Probando hoy la  Creacion de citas Medica   *****");

        Medico MedPediatra = new Medico("Medico Juan", "Pediatra", "1100327674");
        Medico MedCirujano = new Medico("Medico Ana", "Cirujano", "196326232");

        ArrayList<CitaMedica> listaCitasM = new ArrayList<>();
        ArrayList<CitaMedica> listaCitasAndres = new ArrayList<>();


        ArrayList<Medico> listadoMedicos = new ArrayList<>();
        ArrayList<Medico> listadoMedicoDos = new ArrayList<>();
        ArrayList<Medico> listaMedicoTres = new ArrayList<>();

        ArrayList<Medico> listaM = new ArrayList<>();
        ArrayList<Medico> listaMAndres = new ArrayList<>();


        listaM.add(new Medico("Bryan Encalada Mejia", "Odontolo", "1105844995"));
        listaMAndres.add(new Medico("Dr. Juan Perez", "Cirujano", "632883232"));


        listadoMedicos.add(MedCirujano);
        listadoMedicos.add(MedPediatra);

        listadoMedicoDos.add(MedCirujano);
        
        

        listaMedicoTres.add(new Medico("Dr. Angel", "Oncologia", "1129792372"));
        listaMedicoTres.add(new Medico("Dra. Rosa", "Ginecologia", "0967383221"));

        CitaMedica citaMedicaUno = new CitaMedica(listadoMedicos, pacienteElena, "Duracion: 30 minutos");
        CitaMedica citaMedicaDos = new CitaMedica(listadoMedicoDos, pacientePablo, "Duracion: 20 minutos");
        CitaMedica citaMedica2A = new CitaMedica(listaMedicoTres, pacienteAlba, "Duracion 25 minutos");
        
        CitaMedica citaMedicaAndres = new CitaMedica(listaMAndres, pacienteJavier, "Duraccion 40 minutos");

        listaCitasM.add(citaMedicaUno);
        listaCitasM.add(citaMedicaDos);
        listaCitasM.add(new CitaMedica(listaMedicoTres, pacienteRoberth, "15 minutos"));
        listaCitasM.add(citaMedica2A);
        listaCitasM.add(citaMedicaAndres);

        System.out.println("Existen creadas " + listaCitasM.size() + " Citas medicas en Memoria");
        int contador = 0;

        for (CitaMedica citaMedica : listaCitasM) {
            System.out.println("--->Presentando datos de las Citas Medicas " + citaMedica.getDuracion());
            System.out.println("Codigo del Paciente: " + citaMedica.getPaciente().getCodigoPaciente());
            System.out.println("Nombre Paciente: " + citaMedica.getPaciente().getNombre());
            System.out.println("\tLa cita medica tiene " + listaCitasM.get(contador).getListaMedico().size() + " Médicos que le han atendido:");
            contador++;

            for (Medico m : citaMedica.getListaMedico()) {
                System.out.println("\t\tMedico: " + m.getNombre() + " Especialidad: " + m.getEspecialidad() + " Cedula del Medico: " + m.getCedula());
            }
        }

        //Modificando sobreescribir los metodos de presentación ToString().
        
        System.out.println("Esta cita dura: " + citaMedica2A.getDuracion());
        System.out.println("Lista de medicos de la cita: " + citaMedica2A.toString());

        System.out.println("Imprimir " + pacienteElena.toString());

        System.out.println("Lista de medicos " + listaCitasM.toString());

    }

}
