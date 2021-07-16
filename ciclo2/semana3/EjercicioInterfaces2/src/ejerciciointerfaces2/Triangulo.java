/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciointerfaces2;

/**
 *
 * @author leale
 */
public class Triangulo implements FigurasGeometricas {
    private double base, altura;
    
    @Override
    public void DibujarFigura() {
        System.out.println("    *   ");
        System.out.println("   ***  ");
        System.out.println("  ***** ");
        System.out.println(" *******");
        System.out.println("*********");
    }

    @Override
    public double CalcularArea() {
        
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
