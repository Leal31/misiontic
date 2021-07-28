package pruebaserializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import serializar.Profesor;

public class PruebaSerializacion {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        try {
            // instanciar clase
            Profesor objetoProfesor = new Profesor();
            // llenar los datos
            objetoProfesor.setNombre("Juan");
            objetoProfesor.setCargo("Ingeniero");
            objetoProfesor.setAreaLaboral("Sistemas");
            objetoProfesor.setEdad(39);
            // proceso de serializar la información, hacer o iniciar la conexion
            // al dataStream
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/PruebaSerializacion/Serializacion.dat"));
            salida.writeObject(objetoProfesor); // Mandar el objeto al archivo
            salida.flush(); // Vaciar el buffer en el archivo binario
            salida.close();
            System.out.println("Objeto guardado satisfactoriamente");
        
            // deserializar
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/PruebaSerializacion/Serializacion.dat"));
            Object objeto = entrada.readObject(); // traer el objeto desde el canal de datos
            Profesor p1 = (Profesor) objeto; // Castear o convertir de cadena de bytes  a caracteres
            // Mostrar lo convertido
            System.out.println(p1.getNombre());
            System.out.println(p1.getCargo());
            System.out.println(p1.getAreaLaboral());
            System.out.println(p1.getEdad());
            entrada.close();
            } catch (Exception e) {
            System.out.println("El error presentado es: " + e);
        }
    }
    
}
