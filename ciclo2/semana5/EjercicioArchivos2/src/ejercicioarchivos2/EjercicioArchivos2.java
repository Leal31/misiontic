/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarchivos2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author leale
 */
public class EjercicioArchivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        AdminArchivo archivo = new AdminArchivo();
        ArrayList<String> renglones = new ArrayList<String>();
        FileWriter fw = new FileWriter("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/EscribirArchivo/Prueba.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);        
        int opcion = 1;
        
        while (opcion >= 1 && opcion <= 3) {
            System.out.println("**********MENU**********");
            System.out.println("1. Agregar renglon");
            System.out.println("2. leer archivo");
            System.out.println("3. Salir");
            System.out.println("Opcion: ");
            opcion = Integer.parseInt(leer.readLine());
            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Ingresa un nuevo renglon: ");
                        renglones.clear();
                        renglones.add(leer.readLine());
                        archivo.guardar(renglones);
                        System.out.println("Elemento añadido");
                        int i = 0;
                        while (i < renglones.size()){
                            System.out.println(renglones.get(i));
                            i++;
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("El error es: " + e);
                    }
                    break;
                case 2:
                    archivo.abrir();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("no es una opcion valida");
                    break;
            }
            bw.close();
        }
    }
    
}
