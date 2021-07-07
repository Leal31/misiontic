/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclaseunica;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class Operaciones {
    Scanner leer = new Scanner(System.in);
    int numero, cantidadManzana;
    float nota1, nota2, nota3, definitiva;
    double totalPago = 0, precioManzana = 2000, beca = 0;
    String Nombre, Carrera;
    // Establecemos los metodos de cada caso
    
    public void ParImpar() throws IOException{
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        if (numero % 2 == 0)
            System.out.println("El numero " + numero + " es par");
        else
            System.out.println("El numero " + numero + " es impar");
        
    }
    
    public void Fruteria() throws IOException {
        System.out.println("Cuantas manzanas desea comprar: ");
        cantidadManzana = leer.nextInt();
        if (cantidadManzana >= 0 && cantidadManzana <= 2) 
                    
            totalPago = (cantidadManzana * precioManzana) - (cantidadManzana * precioManzana * 0);
        else if (cantidadManzana >= 3 && cantidadManzana <= 5)     
            totalPago = (cantidadManzana * precioManzana) - (cantidadManzana * precioManzana * 0.1);
        else if (cantidadManzana >= 6 && cantidadManzana <= 10) 
            totalPago = (cantidadManzana * precioManzana) - (cantidadManzana * precioManzana * 0.15);
        else if (cantidadManzana >= 11) 
            totalPago = (cantidadManzana * precioManzana) - (cantidadManzana * precioManzana * 0.2);
        else 
            System.out.println("Valor no valido");
                
        System.out.println("El total a pagar por el cliente es: " + totalPago + " pesos");
    }
    
    public void notas() throws IOException {
        System.out.println("Ingrese nombre del estudiante: ");
        Nombre = leer.next();
        System.out.println("Ingrese el nombre de la carrera: ");
        Carrera = leer.next();
        System.out.println("Ingrese la nota 1: ");
        nota1 = leer.nextFloat();
        System.out.println("Ingrese la nota 2: ");
        nota2 = leer.nextFloat();
        System.out.println("Ingrese la nota 3: ");
        nota3 = leer.nextFloat();
                
        definitiva = (nota1+nota2+nota3)/3;
                
        if (Carrera.equalsIgnoreCase("Sistemas") && (definitiva >= 4.0 && definitiva <= 5.0))
            beca = 1450000;
        else if (Carrera.equalsIgnoreCase("Electronica") && (definitiva >= 4.2 && definitiva <= 5.0)) 
            beca = 1480000;
        else if (Carrera.equalsIgnoreCase("Contaduria") && (definitiva >= 4.5 && definitiva <= 5.0)) 
            beca = 1500000;
        else if (Carrera.equalsIgnoreCase("Arquitectura") && (definitiva == 5.0)) 
            beca = 1700000;
        else 
            beca = 0;
                
        System.out.println("El/La Estudiante " + Nombre + " de la carrera " + Carrera 
                        + " con una nota definitiva de " + definitiva + " tiene una beca de " + beca + " pesos");
    }
}
