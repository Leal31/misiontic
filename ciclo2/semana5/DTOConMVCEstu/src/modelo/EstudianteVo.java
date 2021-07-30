/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author leale
 */
public class EstudianteVo {
    
    // Atributos
    
    private String Nombre;
    private String Apellido;
    private String Nacimiento;
    private String CorreoInst;
    
    // Constructor vacio para añadir registros
    
    public EstudianteVo() {
        
    }
    
    // Constructor
    public EstudianteVo(String Nombre, String Apellido, String Nacimiento, String CorreoInst) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacimiento = Nacimiento;
        this.CorreoInst = CorreoInst;
    }
    
    
    // Metodos Set y get
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getCorreoInst() {
        return CorreoInst;
    }

    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }
    
    @Override
    public String toString() {
        
        return this.Nombre + " " + this.Apellido + " " + this.Nacimiento + " " + this.CorreoInst;
    }
}
