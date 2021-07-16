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
public class EjercicioInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo objetoCrc = new Circulo();
        Cuadrado objetoC = new Cuadrado();
        
        objetoCrc.setRadio(5);
        objetoC.setLado(4);
        
        // imprimir mensaje en metodo get
        System.out.println("---------- DIBUJAR CIRCULO ----------");
        objetoCrc.DibujarFigura();
        System.out.println("---------- DIBUJAR CUADRADO ----------");
        objetoC.DibujarFigura();
        
        // calcular areas
        System.out.println("El area del circulo es: " + objetoCrc.CalcularArea());
        System.out.println("El area del cuadrado es: " + objetoC.CalcularArea());
    }
    
}
