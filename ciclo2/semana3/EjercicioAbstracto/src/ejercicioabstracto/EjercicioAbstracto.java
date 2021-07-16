/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioabstracto;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class EjercicioAbstracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String Codigo, Cedula, Nombre;
        int opcion = 1, Edad, NumeroCreditos;
        double Matricula, ValorCredito;
        
        while (opcion >= 1 && opcion <= 4) {
            
            System.out.println("Menu Matricula");
            System.out.println("1. Matricula");
            System.out.println("2. Creditos");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion: ");
            opcion = leer.nextInt();
            
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el codigo: ");
                    Codigo = leer.nextLine();
                    System.out.println("Ingrese la cedula: ");
                    Cedula = leer.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    Nombre = leer.nextLine();
                    System.out.println("Ingrese la edad: ");
                    Edad = leer.nextInt();
                    System.out.println("Ingrese el valor de la matricula: ");
                    Matricula = leer.nextDouble();
                    
                    Matricula objetoM = new Matricula(Codigo, Cedula, Nombre, Edad, Matricula);
                    
                    System.out.println("El estudiante: " + objetoM.getNombre() + " con codigo: " + objetoM.getCodigo()
                     + " identificado con la C.C: " + objetoM.getCedula() + " tiene una matricula de: " + 
                            objetoM.CalcularMatricula());
                    break;
                case 2:
                    System.out.println("Ingrese el codigo: ");
                    Codigo = leer.nextLine();
                    System.out.println("Ingrese la cedula: ");
                    Cedula = leer.nextLine();
                    System.out.println("Ingrese el nombre: ");
                    Nombre = leer.nextLine();
                    System.out.println("Ingrese la edad: ");
                    Edad = leer.nextInt();
                    System.out.println("Ingrese el numero de creditos a usar: ");
                    NumeroCreditos = leer.nextInt();
                    System.out.println("Ingrese el valor del credito: ");
                    ValorCredito = leer.nextDouble();
                    
                    Creditos objetoC = new Creditos(Codigo, Cedula, Nombre, Edad, NumeroCreditos, ValorCredito);
                    
                    System.out.println("El estudiante: " + objetoC.getNombre() + " con codigo: " + objetoC.getCodigo()
                     + " identificado con la C.C: " + objetoC.getCedula() + " tiene una matricula de: " + 
                            objetoC.CalcularMatricula());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }
        }
        
    }
    
}
