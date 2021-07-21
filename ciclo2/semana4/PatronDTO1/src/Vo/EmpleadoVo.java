/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author leale
 */
public class EmpleadoVo {
    
    // Atributos
    private int id;
    private String Nombre;
    private String Apellido;
    // metodo constructor
    public EmpleadoVo(int id, String Nombre, String Apellido) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }
    // metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
    
    public String toString () {
        return this.getNombre() + " " + this.getApellido();
        
    }
    
}
