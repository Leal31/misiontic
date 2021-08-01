package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Comportamientos {
    public void guardar_estudiante(List<EstudianteVo> estudiantes) {
        try {
            System.out.println("Guardando estudiantes " + estudiantes.size());
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("datos_estudiantes.dat"));
            
            for (int i = 0; i < estudiantes.size(); i++) {
                salida.writeObject(estudiantes.get(i));
            }
            salida.close();
            System.out.println("Estudiantes guardados");
            
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }
    
    public List<EstudianteVo> cargar_estudiante() {
        try {
            List<EstudianteVo> estudiantes = new ArrayList();
            FileInputStream fis = new FileInputStream("datos_estudiantes.dat");
            ObjectInputStream entrada = null;
            if (fis.available() > 0) {
                entrada = new ObjectInputStream(fis); 
            }
            // recorrer archivo
            while (fis.available() > 0) {
                EstudianteVo estudiante = (EstudianteVo) entrada.readObject();
                estudiantes.add(estudiante);
            }
            fis.close();
            return estudiantes;
            
        } catch (Exception e) {
            System.out.println("El error es: " + e);
            return null;
        }
    }
}
