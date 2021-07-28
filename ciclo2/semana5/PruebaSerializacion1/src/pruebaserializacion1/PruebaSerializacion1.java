package pruebaserializacion1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import serializar.Profesor;

public class PruebaSerializacion1 {

       public static void main(String[] args) {
        // instanciar Array de profesor
        ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
        // serializacion
        Profesor objetoProfesor = new Profesor();
        
        objetoProfesor.setNombre("Pedro");
        objetoProfesor.setCargo("Matematico");
        objetoProfesor.setAreaLaboral("Calculo");
        objetoProfesor.setEdad(37);
        listaProfesores.add(objetoProfesor);
        // escribo o guardo mas
        objetoProfesor = new Profesor();
        objetoProfesor.setNombre("Juan");
        objetoProfesor.setCargo("Ingeniero");
        objetoProfesor.setAreaLaboral("Industrial");
        objetoProfesor.setEdad(42);
        listaProfesores.add(objetoProfesor);
        // escribo o guardo mas
        objetoProfesor = new Profesor();
        objetoProfesor.setNombre("Ana");
        objetoProfesor.setCargo("Contadora");
        objetoProfesor.setAreaLaboral("Comercio");
        objetoProfesor.setEdad(41);
        listaProfesores.add(objetoProfesor);
        // escribo o guardo mas
        objetoProfesor = new Profesor();
        objetoProfesor.setNombre("Maria");
        objetoProfesor.setCargo("Mecanica");
        objetoProfesor.setAreaLaboral("Electricidad");
        objetoProfesor.setEdad(40);
        listaProfesores.add(objetoProfesor);
        
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/PruebaSerializacion/Serializacion2.dat"));
            // recorrer la lista en el arreglo
            for (int i = 0 ; i < listaProfesores.size(); i++) {
                salida.writeObject(listaProfesores.get(i));
            }
            salida.close();
            System.out.println("Listo");
            
        } catch (Exception e) {
            System.out.println("El error es: " + e);
        }
        try {
            FileInputStream fis = new FileInputStream("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/PruebaSerializacion/Serializacion2.dat");
            ObjectInputStream entrada = new ObjectInputStream(fis);
            int i = 0;
            do {
                // Castear
                Profesor profesore = (Profesor) entrada.readObject();
                System.out.println(profesore);
                System.out.println(profesore.getNombre());
                System.out.println(profesore.getCargo());
                System.out.println(profesore.getAreaLaboral());
                System.out.println(profesore.getEdad());
                System.out.println("****************************");
                i++;
            } while (fis.available()>0);
            
            System.out.println("Terminado");
               
        } catch (Exception e) {
            System.out.println("El error es: " + e);
        }
    }
    
}
