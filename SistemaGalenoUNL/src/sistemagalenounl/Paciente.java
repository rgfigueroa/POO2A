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
public class Paciente extends Persona {

    private String codigoPaciente;
  
   // Composicion
    //Una sola HC  1..1
    private HistoriaClinica historiaClinica;
    
   // Agregacion
    //Una lista HC  0..*
    private ArrayList <HistoriaClinica> listaHC;
    
    private static int pacienteIncremento = 1;

    public Paciente(String codigo, HistoriaClinica historiaClinica, String nombre) {
        this.codigoPaciente = (codigo + pacienteIncremento);
        this.historiaClinica = historiaClinica;
        System.out.println("Paciente CP: " + nombre + " tiene: "+ this.codigoPaciente);
        pacienteIncremento++;
    }

    /**
     * @return the historiaClinica
     */
    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    /**
     * @param historiaClinica the historiaClinica to set
     */
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    /**
     * @return the codigoPaciente
     */
    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * @param codigoPaciente the codigoPaciente to set
     */
    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public void reservarCita(){
        //logica permita
    }
}
