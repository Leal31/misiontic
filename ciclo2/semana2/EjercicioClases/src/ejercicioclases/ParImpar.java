/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclases;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class ParImpar {
    Scanner leer = new Scanner(System.in);
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void ParImpar() {
        if (numero % 2 == 0) 
            System.out.println("El numero " + numero + " es par");
        else 
            System.out.println("El numero " + numero + " es impar");
    }

   
}