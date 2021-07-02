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
public class Estudiante {
     private String Codigo;
    private String Nombre;
    private String Carrera;
    
    public void SetCodigo(String Codigo){
        this.Codigo = Codigo;
    }
    public String GetCodigo(){
        return Codigo;
    }
    
    public void SetNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String GetNombre() {
        return Nombre;
    }
    
    public void SetCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    public String GetCarrera() {
        return Carrera;
    }
}
