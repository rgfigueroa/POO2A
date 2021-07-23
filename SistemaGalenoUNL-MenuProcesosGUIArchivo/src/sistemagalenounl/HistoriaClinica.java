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
public class HistoriaClinica {

    
    private String codigHistoria;
    private static int codigoHistoriaClinica = 55;    
    private ArrayList <CitaMedica> listadoCitasMedica;
    

    public HistoriaClinica() {
        
        this.codigHistoria = Integer.toString(codigoHistoriaClinica);
        System.out.println("Generacion codigo HC: " + this.codigHistoria);
        codigoHistoriaClinica++;
    }
    public HistoriaClinica(ArrayList<CitaMedica> listaCitasMedicas) {

        this.codigHistoria = Integer.toString(codigoHistoriaClinica);
        System.out.println("Generacion codigo HC: " + this.codigHistoria);
        codigoHistoriaClinica++;
    }
    

    /**
     * @return the codigHistoria
     */
    public String getCodigHistoria() {
        return codigHistoria;
    }

    /**
     * @param codigHistoria the codigHistoria to set
     */
    public void setCodigHistoria(String codigHistoria) {
        this.codigHistoria = codigHistoria;
    }
    /**
     * @return the listadoCitasMedica
     */
    public ArrayList <CitaMedica> getListadoCitasMedica() {
        return listadoCitasMedica;
    }

    /**
     * @param listadoCitasMedica the listadoCitasMedica to set
     */
    public void setListadoCitasMedica(ArrayList <CitaMedica> listadoCitasMedica) {
        this.listadoCitasMedica = listadoCitasMedica;
    }


}
