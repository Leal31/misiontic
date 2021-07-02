/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Nombre;
        int vh;
        int ht;
        int total;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        Nombre = leer.next();
        System.out.println("Ingrese el total de horas trabajadas: ");
        ht = leer.nextInt();
        System.out.println("Ingrese el valor de la hora trabajada: ");
        vh = leer.nextInt();
        total = ht * vh;
        System.out.println("El empleado: " + Nombre + "Tiene un total a pagar de: " + total);
            
    }
    
}
