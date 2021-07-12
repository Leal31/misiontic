/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author leale
 */
public class Catedra extends Docente{
    private int NumeroHoras;
    private double ValorHora;

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
        return NumeroHoras * ValorHora;
    }
}
