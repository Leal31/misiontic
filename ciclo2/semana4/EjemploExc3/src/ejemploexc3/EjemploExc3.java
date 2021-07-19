/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexc3;

import java.util.Scanner;

/**
 *
 * @author leale
 */
public class EjemploExc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        try {
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        int cuadrado = num * num;
        System.out.println("El cuadrado de " + num + " es " + cuadrado);
        } catch(Exception exc) {
            System.out.println("Es obligatorio ingresar un numero");
            System.out.println("El error generado es: " + exc);
        } finally {
            System.out.println("Programa terminado");
        }
    }
    
}
