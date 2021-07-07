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
public class EjercicioClaseUnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion = 1;
        Operaciones objetop = new Operaciones();
        while(opcion >= 1 && opcion <= 4) {
            System.out.println("**********MENU**********");
            System.out.println("1. Par o impar");
            System.out.println("2. Fruteria");
            System.out.println("3. Notas");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    objetop.ParImpar();
                    break;
                case 2:
                    objetop.Fruteria();
                    break;
                case 3:
                    objetop.notas();
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
