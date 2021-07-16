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

    private int codigoPaciente;
    private static int pacienteIncremento = 1;

    public Paciente(String nombrePaciente) {
        this.codigoPaciente = (codigoPaciente + pacienteIncremento);
        System.out.println("Paciente  " + nombrePaciente + " tiene el código aleatorio: " + codigoPaciente);
        pacienteIncremento++;
        this.setNombre(nombrePaciente);
    }

    /**
     * @return the codigoPaciente
     */
    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * @param codigoPaciente the codigoPaciente to set
     */
    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nCodigoPaciente: ");
        sb.append(codigoPaciente);
        sb.append("\nNombre: ");
        sb.append(this.getNombre());
        return sb.toString();
    }

}
