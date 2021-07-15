/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoabstracto;

import java.util.Scanner;

/**
 *
 * @author leale
 */
public class MetodoAbstracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int  opcion = 1;
       
        
        while (opcion >= 1 && opcion <= 4) {
            System.out.println("**********MENU DE PROFESORES**********");
            System.out.println("1. Docente tiempo completo");
            System.out.println("2. Docente Catedra");
            System.out.println("3. Salir");
            System.out.println("Ingresa una decision: "); 
            opcion = leer.nextInt(); 
            
          
            switch (opcion) {
                case 1: 
                    
                    
                    Tiempo_Completo elemento1 = new Tiempo_Completo("1110283134", "Emanuel Leal", "Matematico"
                    , 46, 1500000);
                   
                    
                    System.out.println("El docente " + elemento1.getNombre() + " identificado con la cedula "
                     + elemento1.getCedula() + " Tiene un salario de " + elemento1.CalcularTotal());
                    break;
                        
                case 2: 
                    
                    Catedra elemento2 = new Catedra("1110283135", "Rosa Amparo", "Fisico", 48, 40, 3000);
                    
                   
                    System.out.println("El docente " +  elemento2.getNombre() + " identificado con la cedula: "
                     + elemento2.getCedula() + " Que ejerce la profesion de: " + elemento2.getProfesion() + 
                            " y que tiene una edad de: " + elemento2.getEdad() + " se gana a la semana: " +
                            elemento2.CalcularTotal());
                    break;
                case 3: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Error en la opcion");
                    break;
            }
        }
    }
}
