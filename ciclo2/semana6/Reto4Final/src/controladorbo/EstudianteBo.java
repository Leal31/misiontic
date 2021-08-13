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
    
    public void agregarEstudiante(EstudianteVo Estudiante) {
        edao.insertarEstudiante(Estudiante);
    }
    
    public void actualizarEstudiante(EstudianteVo Estudiante) {
        edao.actualizarEstudiante(Estudiante);
    }
    
    public void eliminarEstudiante(String CorreoInst) {
        edao.eliminarEstudiante(CorreoInst);
    }
    
    public List<EstudianteVo> consultarEstudiantes() {
        return edao.consultar_todos();
    }
    
    public void consultarCorreo(String CorreoInst) {
        edao.consultarPorCorreo(CorreoInst);
    }
    
    public void consultarApellido(String Apellido) {
        edao.consultarPorApellido(Apellido);
    }
    
    public void consultarPrograma (String Programa) {
        edao.consultarPorPrograma(Programa);
    }
    
    public void cantidadEstudiante(String Programa) {
        edao.consultarCantidadEstudiante(Programa);
    }
    
    public void consultarFecha(String Nacimiento) {
        edao.consultarPorFecha(Nacimiento);
    }
    
    public void consultarCelular(long Celular) {
        edao.consultarPorCelular(Celular);
    }
}
