/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author roberth
 */
public class SistemaGalenoUNL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Date fechaInicial;
//
//        GregorianCalendar gc = new GregorianCalendar();
//        fechaInicial = gc.getTime();
//        System.out.println(fechaInicial);
//
//        System.out.println("fecha :" + fechaInicial);
//        System.out.println("fecha :" + fechaInicial.getYear());
//        System.out.println("fecha :" + fechaInicial.getMonth());
//        System.out.println("fecha :" + fechaInicial.getDay());
//        System.out.println("Anio:" + Calendar.getInstance().get(Calendar.YEAR));
//        System.out.println("Mes:" + Calendar.getInstance().get(Calendar.MONTH));
//        System.out.println("Día del mes:" + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
//        System.out.println("Hora:" + Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
//        System.out.println("Minuto:" + Calendar.getInstance().get(Calendar.MINUTE));
//        System.out.println("Segundo:" + Calendar.getInstance().get(Calendar.SECOND));
//
//        System.out.println("Dia de la semana:" + Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
//
//        int bancdera = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
//        if (bancdera == 6) {
//            System.out.println("Es viernes");
//        } else {
//            System.out.println("es otro día");
//        }

        Scanner scanner = new Scanner(System.in);
        ArrayList<CitaMedica> listaCitasMedicas = new ArrayList<>();

        int opc = 0;

        do {

            System.out.println("Menu");
            System.out.println("1.	Crear una cita médica");
            System.out.println("2.	Listar cita medica");
            System.out.println("3.	Cambiar medico de la Cita");
            System.out.println("4.	Salir");
            System.out.println("Ingresar la opcion por favor:");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    ArrayList<Medico> listaMedico = new ArrayList<>();

                    System.out.println("1.Crear una cita medica");
                    System.out.println("1.1. Se debe crear un medico (Ingresar nombre, especiliadad, cedula):");

                    Medico medico = new Medico(scanner.next(), scanner.next(), scanner.next());
                    listaMedico.add(medico);
                    System.out.println("1.2. Se debe crear un paciente (Ingresar nombre paciente)");

                    Paciente paciente = new Paciente(scanner.next());

                    CitaMedica citaMedica = new CitaMedica(listaMedico, paciente, scanner.next());

                    listaCitasMedicas.add(citaMedica);

                    System.out.println("Imprimiendo dr de las citas almacenadas");
                    listaCitasMedicas.get(0).citasEnMismoDia(new Medico("Jorge", "pediatria", "3243234"));

                    break;

                case 2:
                    System.out.println("Lintando las cita medica");
                    System.out.println("Existen creadas " + listaCitasMedicas.size() + " Citas medicas en Memoria");
                    int contador = 0;
                    for (CitaMedica cita : listaCitasMedicas) {
                        System.out.println("--->Presentando datos de las Citas Medicas " + cita.getDuracion());
                        System.out.println("Codigo del Paciente: " + cita.getPaciente().getCodigoPaciente());
                        System.out.println("Nombre Paciente: " + cita.getPaciente().getNombre());
                        System.out.println("\tLa cita medica tiene " + listaCitasMedicas.get(contador).getListaMedico().size() + " Médicos que le han atendido:");
                        System.out.println("---------------Medicos-----------------");
                        contador++;
                        for (Medico m : cita.getListaMedico()) {
                            System.out.println("|");
                            System.out.println("\t\tMedico: " + m.getNombre() + " Especialidad: " + m.getEspecialidad() + " Cedula del Medico: " + m.getCedula());
                            System.out.println("|");
                            System.out.println("---------------------------------");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Cambiando medico de la cita");
                    System.out.println("Existen creadas " + listaCitasMedicas.size() + " Citas medicas en Memoria");
                    for (CitaMedica citam : listaCitasMedicas) {
                        citam.getListaMedico().forEach(m -> System.out.println("Nombre del medico:" + m.getNombre()));
                    }
                    System.out.println("Dime el nuevo medico que atenderá:");
                    Medico medicoNuevo = new Medico(scanner.next(), scanner.next(), scanner.next());
                    for (CitaMedica citam : listaCitasMedicas) {
                        citam.cambiarMedicosDeCita(citam, medicoNuevo);
                    }

                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        } while (opc <= 3);
    }

    public static void menuOpcion() {
        System.out.println("Menu");
        System.out.println("1.	Crear una cita médica");
        System.out.println("2.	Listar cita medica");
        System.out.println("3.	Cambiar medico de la Cita");
        System.out.println("4.	Salir");
        System.out.println("Ingresar la opcion por favor:");

    }

}
