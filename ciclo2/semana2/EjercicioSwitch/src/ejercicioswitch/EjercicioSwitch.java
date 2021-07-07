/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class EjercicioSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String Nombre, Carrera;
        float nota1, nota2, nota3;
        float definitiva;
        double beca = 0;
        int numero;
        int cantidadManzana;
        double totalPago = 0;
        double precioManzana = 2000;
        int opcion = 1;
        while (opcion >= 1 && opcion <=4 ) {
        System.out.println("*************MENU*************");
        System.out.println("1. Par o impar");
        System.out.println("2. Fruteria");
        System.out.println("3. Notas");
        System.out.println("4. Salir");
        System.out.println("Elija una opcion: ");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Digite un numero: ");
                numero = leer.nextInt();
                if (numero % 2 == 0) 
                    System.out.println("El numero " + numero + "es par");
                else 
                    System.out.println("El numero " + numero + "es impar");
                
                break;
            case 2:
                
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
                break;
            case 3:
                System.out.print("Ingrese nombre del estudiante: ");
                Nombre = leer.next();
                System.out.print("Ingrese el nombre de la carrera: ");
                Carrera = leer.next();
                System.out.print("Ingrese la nota 1: ");
                nota1 = leer.nextFloat();
                System.out.print("Ingrese la nota 2: ");
                nota2 = leer.nextFloat();
                System.out.print("Ingrese la nota 3: ");
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
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
                
                
        }
    }
        
    }
    
}
