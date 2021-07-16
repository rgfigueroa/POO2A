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
public class CitaMedica {

    private Paciente paciente;
    private ArrayList<Medico> listaMedico;
    private String duracion;
    private double costo;
    private Date fecha;

    public CitaMedica(ArrayList<Medico> listaMedico, Paciente paciente, String duracion) {
        this.listaMedico = listaMedico;
        this.paciente = paciente;
        this.duracion = duracion;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the listaMedico
     */
    public ArrayList<Medico> getListaMedico() {
        return listaMedico;
    }

    /**
     * @param listaMedico the listaMedico to set
     */
    public void setListaMedico(ArrayList<Medico> listaMedico) {
        this.listaMedico = listaMedico;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nPaciente: ");
        sb.append(paciente.getCodigoPaciente() + paciente.getNombre());
        sb.append("numero medicos" + listaMedico.size());
        sb.append("\nNombre: ");
        sb.append(paciente.getNombre());
        return sb.toString();
    }

    public void cambiarMedicosDeCita(CitaMedica cita, Medico medico) {
        System.out.println("Cambiar los medicos de una cita medica");
        ArrayList<Medico> listaNuevaDeMedicos = new ArrayList<>();
        listaNuevaDeMedicos.add(medico);
        cita.setListaMedico(listaNuevaDeMedicos);
        System.out.println("Presentar los medicos de las lista");
        for (Medico m : listaNuevaDeMedicos) {
            System.out.println("Medico:" + m.getNombre() + m.getEspecialidad() + m.getCedula());
        }
    }

    public void agregarMedicoACitaM(Medico medico) {
        try {
            System.out.println("Ageregrando medicos a la cita medica");
            ArrayList<Medico> listaNuevaDeMedicos = new ArrayList<>();
            listaNuevaDeMedicos.add(medico);
            this.listaMedico.add(medico);
            for (Medico m : listaNuevaDeMedicos) {
                System.out.println("Medico agregado:" + m.getNombre() + m.getEspecialidad() + m.getCedula());
            }

        } catch (Exception e) {
            System.out.println("Exception" + e.getMessage());
        } finally {
            System.out.println("Esto es el bloque finally");
        }
    }

    public void descuento() {
        //logica del 30%
    }
    public void citasEnMismoDia(Medico nuevoMedico){
        
        System.out.println("Listado de Medico en la cita");    
        
        int cont=0;
        //Estos es lo mismo
        for (Medico medico : listaMedico) {
            System.out.println("Medico -->" + medico.getNombre());
            if (medico.getNombre().equals(nuevoMedico.getNombre())) {
                System.out.println("Es el mismo medico");
                cont++;
            }
            if(cont>2)
            {   
                System.out.println("No puedes registrar la cita poruqe es el mismo medico");
            }
            
        }
        
        //Estos es lo mismo
        this.listaMedico.forEach(m -> System.out.println("Medico -->" + m.getNombre()));
        
    
    }

}
