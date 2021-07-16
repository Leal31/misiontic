/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciointerfaces;

/**
 *
 * @author leale
 */
public class Cuadrado implements FigurasGeometricas {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public void DibujarFigura() {
        System.out.println("----");
        System.out.println("----");
        System.out.println("----");
        System.out.println("----");
    }
    
    @Override
    public double CalcularArea() {
        return Math.pow(lado, 2);
    }
}
