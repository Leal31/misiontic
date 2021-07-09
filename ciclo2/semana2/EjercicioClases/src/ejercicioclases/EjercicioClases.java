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
public class EjercicioClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String Nombre, Carrera;
        int numero, cantidadManzana,opcion  = 1;
        float nota1, nota2, nota3, definitiva;
        double totalPago = 0, beca = 0, precioManzana = 2000;
        
        while (opcion >= 1 && opcion <= 4) {
            System.out.println("**********MENU**********");
            System.out.println("1. Par o impar");
            System.out.println("2. Fruteria");
            System.out.println("3. Notas");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un numero: ");
                    numero = leer.nextInt();
                    ParImpar objetoPoI = new ParImpar();
                    objetoPoI.setNumero(numero);
                    objetoPoI.ParImpar();
                    
                    break;
                case 2:
                    Fruteria objetoF = new Fruteria();
                    System.out.println("Ingrese cuantas manzanas desea comprar: ");
                    cantidadManzana = leer.nextInt();
                    objetoF.setCantidadManzana(cantidadManzana);
                    System.out.println("La cantidad de manzanas compradas son: " + objetoF.getCantidadManzana());
                    System.out.println("El total a pagar es: " + objetoF.manzanas());
                    break;
                case 3:
                    Notas objetoN = new Notas();
                    System.out.println("Ingrese su nombre: ");
                    Nombre = leer.next();
                    System.out.println("Ingrese su carrera: ");
                    Carrera = leer.next();
                    System.out.println("Ingrese nota 1: ");
                    nota1 = leer.nextFloat();
                    System.out.println("Ingrese nota 2: ");
                    nota2 = leer.nextFloat();
                    System.out.println("Ingrese nota 3: ");
                    nota3 = leer.nextFloat();
                    
                    objetoN.setNombre(Nombre);
                    objetoN.setCarrera(Carrera);
                    objetoN.setNota1(nota1);
                    objetoN.setNota2(nota2);
                    objetoN.setNota3(nota3);
                    objetoN.totalBeca();
                    
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }   
            
        }
    }
    
}
