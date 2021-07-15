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
public class Matricula extends Estudiante{
    private double Matricula, total;
    
    public Matricula(String Codigo, String Nombre, String Cedula, int Edad, double Matricula) {
        super(Codigo, Nombre, Cedula, Edad);
        this.Matricula = Matricula;
    }
    public double getMatricula() {
        return Matricula;
    }

    public void setMatricula(double Matricula) {
        this.Matricula = Matricula;
    }
    
    @Override
    public double CalcularMatricula(){
        total = Matricula;
        return total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
