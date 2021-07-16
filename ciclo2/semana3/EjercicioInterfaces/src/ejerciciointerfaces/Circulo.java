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
public class Circulo implements FigurasGeometricas {
    private double radio;
    // metodo set y get

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void DibujarFigura() {
        System.out.println("-");
        System.out.println("--");
        System.out.println("---");
        System.out.println("----");
        System.out.println("-----");
        System.out.println("----");
        System.out.println("---");
        System.out.println("--");
        System.out.println("-");
    }

    @Override
    public double CalcularArea() {
        
        return Math.PI * Math.pow(radio, 2);
    }
}
