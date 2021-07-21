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
public class Docente {
    // atributos
    private int id;
    private String Nombre;
    private String Apellido;
    
    // metodo constructor
    public Docente(int id, String Nombre, String Apellido) {
        super();
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

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
    
    public String toString() {
        return this.Nombre + " " + this.Apellido;
    }
}
