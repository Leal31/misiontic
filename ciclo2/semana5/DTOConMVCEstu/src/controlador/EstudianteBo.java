/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.EstudianteVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leale
 */
public class EstudianteBo {
    // Crear una lista de Estudiantes
    List<EstudianteVo> Estudiantes;
    
    // Llenar el arreglo de estudiantes
    public EstudianteBo() {
        Estudiantes = new ArrayList<>();
        
        
    }
    
    
    // Insertar estudiante pasando parametros
    public void agregarEstudiante(EstudianteVo estudiante) {
        
        Estudiantes.add(estudiante);
    }
    
    public EstudianteVo consultarEstudiante(String CorreoInst) {
        for (EstudianteVo estudiante : Estudiantes) {
            if (estudiante.getCorreoInst().equals(CorreoInst)) {
                return estudiante;
            }
        }
        return null;
    }
    
    // actualizar estudiante
    public void actualizarEstudiante(EstudianteVo estudiante) {
         int i = 0;
         while (i < Estudiantes.size()) {
             if (Estudiantes.get(i).getCorreoInst().equals(estudiante.getCorreoInst())) {
                 Estudiantes.set(i, estudiante);
                 break;
                 
             }
             i++;
         }
    }
    
    // eliminar estudiantes
    public void eliminarEstudiante(EstudianteVo estudiante) {
        Estudiantes.remove(estudiante);
        System.out.println("El estudiante: " + estudiante.getNombre() + " fue eliminado satisfactoriamente");
    }
    
    // obtener estudiantes
    public List<EstudianteVo> obtenerEstudiante() {
        return Estudiantes;
    }
}
