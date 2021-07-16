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
public class EjercicioInterfaces2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangulo objetoT = new Triangulo();
        Rectangulo objetoR = new Rectangulo();
        System.out.println("---------- DIBUJAR TRIANGULO ---------");
        objetoT.DibujarFigura();
        System.out.println("---------- DIBUJAR RECTANGULO ---------");
        objetoR.DibujarFigura();
        
        
        objetoT.setAltura(5);
        objetoT.setBase(3);
        objetoR.setLado1(10);
        objetoR.setLado2(5);
        
        System.out.println("El area de el triangulo es: " + objetoT.CalcularArea());
        System.out.println("El area de el rectangulo es: " + objetoR.CalcularArea());
        
        
    }
    
}
