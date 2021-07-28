/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirarchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author leale
 */
public class AdminArchivo {
    
        public void guardar(ArrayList<String> lineas) throws IOException {
            try {
            FileWriter fw = new FileWriter("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/EscribirArchivo/Prueba.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
        
            int i = 0;
            while (i < lineas.size()) {
                bw.append(lineas.get(i));
                bw.newLine();
                i++;
            }
            bw.close();
            } catch (Exception e) {
                System.out.println("El error es: " + e);
            } finally {
                System.out.println("Programa finalizado");
            }
        }
    
            public ArrayList<String> abrir() throws FileNotFoundException, IOException {
                try {
                    ArrayList<String> lineas = new ArrayList<String>();
                    FileReader fr = new FileReader("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/EscribirArchivo/Prueba.txt");
                    BufferedReader leer = new BufferedReader(fr);
                    String linea = leer.readLine();
                    // recorrer archivo
                    while (linea != null) {
                        System.out.println(linea);
                        lineas.add(linea);
                        linea = leer.readLine();
                    }
                    leer.close();
                    return lineas;
                } catch (Exception e) {
                    System.out.println("El error es: " + e);
                    return null;
                } finally {
                    System.out.println("Programa finalizado");
                }
                }
}
