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
    private String Nombres;
    private String Apellidos;
    private String FechaNac;
    private String CorreoInst;
    private String CorreoPersonal;
    private long Celular;
    private long Fijo;
    private String ProgramaAcademico;
    
    // Constructor vacio
    public EstudianteVo() {
        
    }
    
    // Constructor
    public EstudianteVo(String Nombres, String Apellidos, String FechaNac, String CorreoInst, String CorreoPersonal, long Celular, long Fijo, String ProgramaAcademico) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaNac = FechaNac;
        this.CorreoInst = CorreoInst;
        this.CorreoPersonal = CorreoPersonal;
        this.Celular = Celular;
        this.Fijo = Fijo;
        this.ProgramaAcademico = ProgramaAcademico;
    }
    
    // Metodos set y get

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getCorreoInst() {
        return CorreoInst;
    }

    public void setCorreoInst(String CorreoInst) {
        this.CorreoInst = CorreoInst;
    }

    public String getCorreoPersonal() {
        return CorreoPersonal;
    }

    public void setCorreoPersonal(String CorreoPersonal) {
        this.CorreoPersonal = CorreoPersonal;
    }

    public long getCelular() {
        return Celular;
    }

    public void setCelular(long Celular) {
        this.Celular = Celular;
    }

    public long getFijo() {
        return Fijo;
    }

    public void setFijo(long Fijo) {
        this.Fijo = Fijo;
    }

    public String getProgramaAcademico() {
        return ProgramaAcademico;
    }

    public void setProgramaAcademico(String ProgramaAcademico) {
        this.ProgramaAcademico = ProgramaAcademico;
    }
}
