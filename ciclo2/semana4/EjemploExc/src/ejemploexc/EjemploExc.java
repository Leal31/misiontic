/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexc;

/**
 *
 * @author leale
 */
public class EjemploExc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numerador = 10;    
        int denominador = 3;
        int division = numerador / denominador;
        try {
           
            System.out.println("El resultado de la division es: " + division);
            
        } catch (ArithmeticException exc) {
            System.out.println("Dentro del catch el resultado es: " + exc);
        } finally {
            System.out.println("Programa terminado");
        }
    }
    
}
