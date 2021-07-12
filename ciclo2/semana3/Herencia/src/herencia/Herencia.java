/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        // declaro variables
        
        String Cedula, Nombre, Profesion;
        int Edad, NumeroHoras, opcion = 1;
        double Salario, ValorHora;
        
        // Captura de datos
        System.out.println("Ingrese la cedula: ");
        Cedula = leer.nextLine();
        System.out.println("Ingrese el Nombre: ");
        Nombre = leer.nextLine();
        System.out.println("Ingrese la profesion: ");
        Profesion = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        Edad = leer.nextInt();
          // se inicia un ciclo con objetivo de repetir un menu
        while (opcion >= 1 && opcion <= 4) {
            System.out.println("**********MENU DE PROFESORES**********");
            System.out.println("1. Docente tiempo completo");
            System.out.println("2. Docente Catedra");
            System.out.println("3. Salir");
            System.out.println("Ingresa una decision: "); 
            opcion = leer.nextInt(); 
            
          
            switch (opcion) {
                case 1: 
                    System.out.println("Ingrese el salario: ");
                    Salario = leer.nextDouble();
                    
                    Tiempo_Completo elemento1 = new Tiempo_Completo();
                    
                    elemento1.setCedula(Cedula);
                    elemento1.setNombre(Nombre);
                    elemento1.setProfesion(Profesion);
                    elemento1.setEdad(Edad);
                    elemento1.setSalario(Salario);
                    
                    System.out.println("El docente " + elemento1.getNombre() + " identificado con la cedula "
                     + elemento1.getCedula() + " Tiene un salario de " + elemento1.getSalario());
                    break;
                case 2: 
                    System.out.println("Ingrese numero de horas trabajadas: ");
                    NumeroHoras = leer.nextInt();
                    System.out.println("Ingrese el valor de la hora: ");
                    ValorHora = leer.nextDouble();
                    
                    Catedra elemento2 = new Catedra();
                    
                    elemento2.setCedula(Cedula);
                    elemento2.setNombre(Nombre);
                    elemento2.setProfesion(Profesion);
                    elemento2.setEdad(Edad);
                    elemento2.setNumeroHoras(NumeroHoras);
                    elemento2.setValorHora(ValorHora);
                    
                    System.out.println("El docente " +  elemento2.getNombre() + " identificado con la cedula: "
                     + elemento2.getCedula() + " Que ejerce la profesion de: " + elemento2.getProfesion() + 
                            " y que tiene una edad de: " + elemento2.getEdad() + " se gana a la semana: " +
                            elemento2.total());
                    break;
                case 3: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Error en la opcion");
                    break;
            }
    }
    
}}
