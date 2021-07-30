/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.EstudianteVo;
import java.util.ArrayList;
import java.util.List;
import modelo.EstudianteDAO;
import modelo.EstudiantesDAO;

/**
 *
 * @author leale
 */
public class EstudianteBo {
    // Crear una lista de Estudiantes
    List<EstudianteVo> Estudiantes;
    private EstudianteDAO edao;
    // Llenar el arreglo de estudiantes
    public EstudianteBo() {
        edao = new EstudiantesDAO();
        Estudiantes = new ArrayList<>();
        
    }
    
    
    // Insertar estudiante pasando parametros
    public void agregarEstudiante(EstudianteVo estudiante) {
        
        Estudiantes.add(estudiante);
        edao.guardar_estudiantes(Estudiantes);
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
         edao.guardar_estudiantes(Estudiantes);
    }
    
    // eliminar estudiantes
    public void eliminarEstudiante(EstudianteVo estudiante) {
        Estudiantes.remove(estudiante);
        System.out.println("El estudiante: " + estudiante.getNombre() + " fue eliminado satisfactoriamente");
        edao.guardar_estudiantes(Estudiantes);
    }
    
    // obtener estudiantes
    public List<EstudianteVo> obtenerEstudiante() {
        return Estudiantes;
    }
}
