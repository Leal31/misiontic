/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioabstracto;

/**
 *
 * @author leale
 */
public abstract class Estudiante {
    protected String Codigo, Nombre,Cedula;
    protected int Edad;
    
    public Estudiante(String Codigo, String Nombre, String Cedula, int Edad) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Edad = Edad;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public abstract double CalcularMatricula();
    
}
