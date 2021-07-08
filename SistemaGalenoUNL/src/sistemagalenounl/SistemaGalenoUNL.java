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

        Paciente pacienteJuan = new Paciente("CodPaciente:", hclinica, "Maria");
        Paciente pacientePablo = new Paciente("CodPaciente:", hclinica2, "Pablo");
        Paciente pacienteElena = new Paciente("CodPaciente:", hclinica3, "Elena");

        pacienteJuan.setCodigoPaciente("CP001");
        pacienteJuan.setHistoriaClinica(hclinica);

        System.out.println("Codigo Paciente:" + pacienteJuan.getCodigoPaciente());
        System.out.println("Codigo HC:" + hclinica.getCodigHistoria());

        System.out.println("Codigo Paciente:" + pacientePablo.getCodigoPaciente());
        System.out.println("Codigo HC:" + hclinica2.getCodigHistoria());

        System.out.println("Codigo Paciente:" + pacienteElena.getCodigoPaciente());
        System.out.println("Codigo HC:" + hclinica3.getCodigHistoria());

        System.out.println("Probando hoy la  Creacion de citas Medica");

        Medico MedPediatra = new Medico("Medico Juan", "Pediatra", "1100327674");
        Medico MedCirujano = new Medico("Medico Ana", "Cirujano", "196326232");

        ArrayList<CitaMedica> listaCitasM = new ArrayList<>();

        ArrayList<Medico> listadoMedicos = new ArrayList<>();
        ArrayList<Medico> listadoMedicoDos = new ArrayList<>();

        listadoMedicos.add(MedCirujano);
        listadoMedicos.add(MedPediatra);

        listadoMedicoDos.add(MedCirujano);

        CitaMedica citaMedicaUno = new CitaMedica(listadoMedicos, pacienteElena, "Duracion: 30 minutos");
        CitaMedica citaMedicaDos = new CitaMedica(listadoMedicoDos, pacientePablo, "Duracion: 20 minutos");

        listaCitasM.add(citaMedicaUno);
        listaCitasM.add(citaMedicaDos);

        for (CitaMedica citaMedica : listaCitasM) {
            System.out.println("--->Presentando datos de las Citas Medicas " + citaMedica.getDuracion());
            System.out.println("Nombre Paciente: " + citaMedica.getPaciente().getCodigoPaciente());
            System.out.println("Nombre Paciente: " + citaMedica.getPaciente().getNombre());

            for (Medico m : citaMedica.getListaMedico()) {
                System.out.println("Medico que atiende :" + m.getNombre() + " Especialidad:" + m.getEspecialidad());
                System.out.println("Cedula del medico" + m.getCedula());
            }
        }

    }

}
