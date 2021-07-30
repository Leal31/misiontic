/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leale
 */
public class EstudiantesDAO implements EstudianteDAO {

    @Override
    public void guardar_estudiantes(List<EstudianteVo> estudiantes) {
        try {
            System.out.println("Guardando estudiantes " + estudiantes.size());
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/DTOConMVCEstu_1/Prueba.dat"));
            
            for (int i = 0; i < estudiantes.size(); i++) {
                salida.writeObject(estudiantes.get(i));
            }
            salida.close();
            System.out.println("Estudiantes guardados");
            
        } catch (Exception e) {
            System.out.println("Error :" + e);
        }
    }

    @Override
    public List<EstudianteVo> cargar_estudiantes() {
        try {
            List<EstudianteVo> estudiantes = new ArrayList();
            FileInputStream fis = new FileInputStream("C:/Users/leale/OneDrive/Documentos/proyectos/misiontic/ciclo2/semana5/DTOConMVCEstu_1/Prueba.dat");
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
