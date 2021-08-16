/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladorbo;

import estudiantedao.EstudianteDAO;
import java.util.ArrayList;
import java.util.List;
import modelovo.EstudianteVo;

/**
 *
 * @author leale
 */
public class EstudianteBo {
    private EstudianteDAO edao;
    
    public EstudianteBo() {
        edao = new EstudianteDAO();
    }
    
    public boolean agregarEstudiante(EstudianteVo Estudiante) {
        edao.insertarEstudiante(Estudiante);
        return true;
    }
    
    public boolean actualizarEstudiante(String CorreoInst,EstudianteVo Estudiante) {
        edao.actualizarEstudiante(CorreoInst,Estudiante);
        return true;
    }
    
    public boolean eliminarEstudiante(String CorreoInst) {
        edao.eliminarEstudiante(CorreoInst);
        return true;
    }
    
    public List<EstudianteVo> consultarEstudiantes() {
        return edao.consultar_todos();
    }
    
    public EstudianteVo consultarCorreo(String CorreoInst) {
        return edao.consultarPorCorreo(CorreoInst);
    }
    
    public List<EstudianteVo> consultarApellido(String Apellido) {
        return edao.consultarPorApellido(Apellido);
    }
    
    public List<EstudianteVo> consultarPrograma (String Programa) {
        return edao.consultarPorPrograma(Programa);
    }
    
    public int cantidadEstudiante(String Programa) {
        return edao.consultarCantidadEstudiante(Programa);
    }
    
    public List<EstudianteVo> consultarFecha(String Nacimiento) {
        return edao.consultarPorFecha(Nacimiento);
    }
    
    public List<EstudianteVo> consultarCelular(long Celular) {
        return edao.consultarPorCelular(Celular);
    }
}
