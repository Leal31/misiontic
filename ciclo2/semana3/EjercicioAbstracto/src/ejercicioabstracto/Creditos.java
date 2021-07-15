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
public class Creditos extends Estudiante {
    private int numeroCreditos;
    private double valorCreditos, total;
    
    public Creditos(String Codigo, String Nombre, String Cedula, int Edad, int numeroCreditos, double valorCreditos) {
        super(Codigo, Nombre, Cedula, Edad);
        this.numeroCreditos = numeroCreditos;
        this.valorCreditos = valorCreditos;
    }
    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public double getValorCreditos() {
        return valorCreditos;
    }

    public void setValorCreditos(double valorCreditos) {
        this.valorCreditos = valorCreditos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public double CalcularMatricula() {
        total = valorCreditos * numeroCreditos;
        return total;
    }
    
}
