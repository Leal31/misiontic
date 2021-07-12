/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaconstructor;

/**
 *
 * @author leale
 */
public class Catedra extends Docente{
    private int NumeroHoras;
    private double ValorHora;
    
    public Catedra(String Cedula, String Nombre, String Profesion, int Edad, int NumeroHoras, double ValorHora) {
        super(Cedula, Nombre, Profesion, Edad);
        this.NumeroHoras = NumeroHoras;
        this.ValorHora = ValorHora;
    }

    public int getNumeroHoras() {
        return NumeroHoras;
    }

    public void setNumeroHoras(int NumeroHoras) {
        this.NumeroHoras = NumeroHoras;
    }

    public double getValorHora() {
        return ValorHora;
    }

    public void setValorHora(double ValorHora) {
        this.ValorHora = ValorHora;
    }
    
    public double total() {
        return ValorHora * NumeroHoras;
    }
}
