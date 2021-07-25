/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.EstudianteVo;

/**
 *
 * @author leale
 */
public class EstudianteBo {
    
    // Crear Lista Estudiantes
    List<EstudianteVo> estudiantes;
    
    // llenar arreglo
    public EstudianteBo() {
        estudiantes = new ArrayList();
    }
    
    // Agregar un estudiante
    public void agregarEstudiante(EstudianteVo estudiante) {
        estudiantes.add(estudiante);
    }
    
    // Buscar un estudiante especifico
    public EstudianteVo consultarEstudiante(String CorreoInst) {
        for (EstudianteVo estudiante  : estudiantes) {
            if (estudiante.getCorreoInst().equals(CorreoInst)) {
                return estudiante;
            }
        }
        return null;
    }
    
    // Actualizar un estudiante
    public void actualizarEstudiante(EstudianteVo estudiante) {
         int i = 0;
         while (i < estudiantes.size()) {
             if (estudiantes.get(i).getCorreoInst().equals(estudiante.getCorreoInst())) {
                 estudiantes.set(i, estudiante);
                 break;
             }
             i++;
         }
    }
    
    // Eliminar un estudiante
    public void eliminarEstudiante(EstudianteVo estudiante) {
        estudiantes.remove(estudiante);
    }
    
    public List<EstudianteVo> obtenerEstudiantes() {
       
        
        return estudiantes;
        }
    }

