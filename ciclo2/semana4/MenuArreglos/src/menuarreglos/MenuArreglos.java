/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarreglos;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author leale
 */
public class MenuArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList Arreglo = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String Elemento;
        byte posicion;
        int opcion = 1;
        
        while (opcion >= 1 && opcion < 6 ) {
            System.out.println("********** MENU ARRAY **********");
            System.out.println("1. Añadir a array");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Comprobar");
            System.out.println("4. Mostrar");
            System.out.println("5. Actualizar");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del elemento que quieres ingresar: ");
                    Elemento = leer.next();
                    Arreglo.add(Elemento);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento que quiere borrar: ");
                    Elemento = leer.next();
                    Arreglo.remove(Elemento);
                    
                    break;
                case 3:
                    System.out.print("Ingrese la posicion que quiere comprobar: ");
                    posicion = leer.nextByte();
                    System.out.println("Posicion del elemento: " + opcion);
                    System.out.println("Contenido del elemento: " + Arreglo.get(posicion));
                    break;
                case 4:
                    System.out.println("El arreglo contiene: " + Arreglo);
                    break;
                case 5:
                    System.out.print("Que posicion quiere cambiar: ");
                    posicion = leer.nextByte();
                    System.out.print("Por cual elemento quiere cambiarlo: ");
                    Elemento = leer.next();
                    
                    Arreglo.set(posicion, Elemento);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No es opcion valida");
                    break;
            }
        }
    }
    
}
