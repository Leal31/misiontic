/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirarchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author leale
 */
public class EscribirArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
            AdminArchivo archivo = new AdminArchivo();
            ArrayList<String> renglones = new ArrayList<String>();
            FileWriter fw = new FileWriter("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/EscribirArchivo/Prueba.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            renglones.add("1. un archivo es un conjunto de datos estructurados guardados");
            renglones.add("2. FileWriter: permite especificar el archivo en el que se va a escribir");
            renglones.add("3. BufferedWriter: se encarga de escribir en el archivo");
            renglones.add("4. FileReader: lee los caracteres de un archivo o fichero");
            renglones.add("5. BufferedReader: ayuda a guardar los datos en un buffer para tratarlos en el programa");
            archivo.guardar(renglones);
            
            int i = 0;
            
            while (i < renglones.size()) {
                System.out.println(renglones.get(i));
                i++;
            }
            bw.close();
                    
            
        } catch (Exception e) {
            System.out.println("El error es: " + e);
        } finally {
            System.out.println("Programa finalizado");
        }
    }
    
}
