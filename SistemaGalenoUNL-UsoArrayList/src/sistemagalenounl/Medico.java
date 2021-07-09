/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemagalenounl;

/**
 *
 * @author roberth
 */
public class Medico extends Persona {

    private String especialidad;

    public Medico( String nombre, String especialidad, String cedula ) {
        this.especialidad = especialidad;
        super.setNombre(nombre);
        super.setCedula(cedula);
    }
     

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
