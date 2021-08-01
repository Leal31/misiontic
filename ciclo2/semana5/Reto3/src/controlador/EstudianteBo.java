package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Comportamientos;
import modelo.EstudianteVo;

public class EstudianteBo {
    // Crear una lista de Estudiantes
    List<EstudianteVo> Estudiantes;
    private Comportamientos edao;
    // Llenar el arreglo de estudiantes
    public EstudianteBo() {
        edao = new Comportamientos();
        Estudiantes = new ArrayList<>();
        
    }
    
    
    // Insertar estudiante pasando parametros
    public void agregarEstudiante(EstudianteVo estudiante) {
        
        Estudiantes.add(estudiante);
        edao.guardar_estudiante(Estudiantes);
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
         edao.guardar_estudiante(Estudiantes);
    }
    
    // eliminar estudiantes
    public void eliminarEstudiante(EstudianteVo estudiante) {
        Estudiantes.remove(estudiante);
        edao.guardar_estudiante(Estudiantes);
    }
    
    // obtener estudiantes
    public List<EstudianteVo> obtenerEstudiante() {
        return Estudiantes;
    }
}
