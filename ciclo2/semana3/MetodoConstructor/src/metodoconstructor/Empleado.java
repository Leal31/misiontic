/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoconstructor;

/**
 *
 * @author leale
 */
public class Empleado {
    private String Cedula;
    private String Nombre;
    private double Salario;
    private int Edad;
    
    public Empleado(String Cedula, String Nombre, double Salario) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Salario = Salario;
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

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

   
    
   
    
}
