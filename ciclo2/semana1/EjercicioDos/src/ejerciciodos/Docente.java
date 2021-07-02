/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

/**
 *
 * @author leale
 */
public class Docente {
    private String Cedula;
    private String Nombre;
    private String Profesion;

    /**
     * @return the Cedula
     */
    public String GetCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void SetCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Nombre
     */
    public String GetNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void SetNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Profesion
     */
    public String GetProfesion() {
        return Profesion;
    }

    /**
     * @param Profesion the Profesion to set
     */
    public void SetProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
}
