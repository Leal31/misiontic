/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoabstracto;

/**
 *
 * @author leale
 */
public abstract class Docente {
    protected String Cedula;
    protected String Nombre;
    protected String Profesion;
    protected int Edad;
    
    public Docente(String Cedula, String Nombre, String Profesion, int Edad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Edad = Edad;
    }
    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public abstract double CalcularTotal();
}
