/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

import java.util.ArrayList;

/**
 *
 * @author roberth
 */
public class CitaMedica {

    private Paciente paciente;
    private ArrayList<Medico> listaMedico;
    private String duracion;

    public CitaMedica(ArrayList<Medico> listaMedico, Paciente paciente, String duracion){
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

}
